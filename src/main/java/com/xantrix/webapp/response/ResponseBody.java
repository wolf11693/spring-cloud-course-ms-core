package com.xantrix.webapp.response;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "response")
public class ResponseBody<T extends ResponsePayload> implements Serializable {
	private static final long serialVersionUID = 4065373345181358837L;
	
	@JsonProperty(value = "dateAndTime")
	private LocalDateTime dateTime = LocalDateTime.now();
	@JsonProperty(value = "messages")
	private List<String> messages = new ArrayList<>();
	@JsonProperty(value = "payload")
	@JsonInclude(value = Include.NON_NULL)
	private T payload = null;

	public ResponseBody(T payload) {
		super();
		this.messages = new ArrayList<>();
		this.payload = payload;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public List<String> addMessage(String message){
		if(message == null) {
			return this.messages;
		}
		this.messages.add(message);
		
		return this.messages;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response [dateTime=");
		builder.append(dateTime);
		builder.append(", messages=");
		builder.append(messages);
		builder.append(", payload=");
		builder.append(payload);
		builder.append("]");
		return builder.toString();
	}
}