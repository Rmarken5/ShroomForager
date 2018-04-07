package com.shrmfrg.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersistenceServiceBase {
	
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

}
