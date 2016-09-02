package com.prits.jparest.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.prits.jparest.domain.Category;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepo extends CrudRepository<Category, Serializable>{

}
