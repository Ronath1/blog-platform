package com.example.blog.domain.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CreateCategoryRequest {

    @NotBlank(message = "Category Name is required")
    @Size(max = 50, message = "Category Name must be less than 50 characters")
    @Pattern(regexp = "^[\\w\\s-]+$", message = "Category Name can only contain letters, numbers, spaces, hyphens and underscores")
    private String name;
}
