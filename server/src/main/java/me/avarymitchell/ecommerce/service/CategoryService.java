package me.avarymitchell.ecommerce.service;

import me.avarymitchell.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
