package com.gustavo.petclinic.services.map;

import com.gustavo.petclinic.model.BaseEntity;
import com.gustavo.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet(map.entrySet());
    }

    public T findById(ID id){
        return map.get(id);
    }

    public T save(T object){
       return map.put((ID) ((BaseEntity) object).getId(), object);
    }


    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public void deleteById(ID id){
        map.remove(id);
    }
}
