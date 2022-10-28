package com.demo.postgres.datatype.jsontype.service;

import com.demo.postgres.datatype.jsontype.domain.Collections;
import com.demo.postgres.datatype.jsontype.repository.CollectionsRepository;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class CollectionsService {

    @Autowired
    private CollectionsRepository collectionsRepository;

    @PostConstruct
    private void saveCars() {
        try {
            collectionsRepository.save(new Collections(List.of("BWM", "AUDI"), List.of(1992, "1991")));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        printCars();
    }

    private void printCars(){
        try{
            Optional<Collections> collections = collectionsRepository.findById(1L);
            if(collections.isPresent()){
                System.out.println(collections.get());
            } else {
                System.out.println("No Cars by Id: 1 found");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
