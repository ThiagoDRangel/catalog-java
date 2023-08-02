package com.thiagoDRangel.catalog.dto;

import com.thiagoDRangel.catalog.entities.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private Long id;

    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}