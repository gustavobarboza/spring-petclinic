package com.gustavo.petclinic.services;

import com.gustavo.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
