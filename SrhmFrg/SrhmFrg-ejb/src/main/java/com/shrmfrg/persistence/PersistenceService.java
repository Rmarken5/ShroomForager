package com.shrmfrg.persistence;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(PersistenceService.class)
public class PersistenceService extends PersistenceServiceBase implements PersistenceServiceRemote  {

	

	@Override
	public <T> T find(Class clazz, Object id) {

		return (T) this.getEntityManager().find(clazz, id);
	
	}
}
