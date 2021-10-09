package com.xantrix.webapp.service;

import java.util.List;

import com.xantrix.webapp.service.exception.DeleteException;
import com.xantrix.webapp.service.exception.SaveException;
import com.xantrix.webapp.service.exception.UpdateException;

public interface GenericService<TYPE, ID> {
	public List<TYPE> getAll();
	
	public TYPE getById(ID theId);

	public TYPE save(TYPE objToSave) throws SaveException;
	
	public void update(ID idObjToUpd, TYPE dataObjToUpd) throws UpdateException;
	
	public void delete(ID idObjToDel) throws DeleteException;
}