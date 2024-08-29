package com.paygo.basespringapp.repository;

import com.paygo.basespringapp.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseREpo extends JpaRepository<Base, Long> {
}
