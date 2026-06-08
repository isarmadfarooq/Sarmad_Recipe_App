package com.example.sarmad_recipe_app.data.repository

import com.example.sarmad_recipe_app.data.remote.RecipeAPIService
import com.example.sarmad_recipe_app.data.remote.dto.RecipeDTO
import com.example.sarmad_recipe_app.domain.repository.RecipeRepository

class RecipeRepositoryImpl(private val apiService: RecipeAPIService) : RecipeRepository {

    override suspend fun getAllRecipes(): List<RecipeDTO>
    {
        return apiService.getAllRecipes().recipes
    }

    override suspend fun getRecipeById(id: Int): RecipeDTO {
        return apiService.getRecipeById(id)
    }
}
