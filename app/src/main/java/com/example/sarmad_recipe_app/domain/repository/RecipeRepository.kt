package com.example.sarmad_recipe_app.domain.repository

import com.example.sarmad_recipe_app.data.remote.dto.RecipeDTO

interface RecipeRepository {

    suspend fun getAllRecipes(): List<RecipeDTO>

    suspend fun getRecipeById(id: Int): RecipeDTO
}