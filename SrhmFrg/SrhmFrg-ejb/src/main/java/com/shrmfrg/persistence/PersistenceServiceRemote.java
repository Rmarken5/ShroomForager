package com.shrmfrg.persistence;

import javax.ejb.Remote;

@Remote
public interface PersistenceServiceRemote {

	
	<T> T find(Class clazz, Object id);
	
}
