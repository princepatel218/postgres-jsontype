package com.demo.postgres.datatype.jsontype.repository;

import com.demo.postgres.datatype.jsontype.domain.Collections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionsRepository extends JpaRepository<Collections, Long> {
}
