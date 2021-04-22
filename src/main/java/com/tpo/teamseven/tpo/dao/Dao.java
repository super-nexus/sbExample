package com.tpo.teamseven.tpo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public abstract class Dao<T> {

    private Class<T> cls;

    @PersistenceContext
    EntityManager entityManager;

    public final void setClass(Class<T> classToSet){
        this.cls = classToSet;
    }

    public Optional<T> get(Long id){
        return Optional.ofNullable(entityManager.find(cls, id));
    }

    public List<T> getAll(){
        return entityManager.createQuery("select * from " + cls.getName()).getResultList();
    }

    public void save(T t){
        entityManager.persist(t);
    }

    public T update(T t){
       return entityManager.merge(t);
    }

    public void delete(T t){
        entityManager.remove(t);
    }

    public void deleteById(long entityId){
        Optional<T> entity = get(entityId);
        entity.ifPresent(this::delete);
    }
}
