package com.gustavo.petclinic.services.map;

import com.gustavo.petclinic.model.Owner;
import com.gustavo.petclinic.services.OwnerService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        List<Owner> result =
                map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getLastName().equals(lastName))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        return result.get(0);
    }
}
