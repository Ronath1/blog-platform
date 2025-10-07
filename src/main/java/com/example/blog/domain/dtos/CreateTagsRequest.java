package com.example.blog.domain.dtos;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTagsRequest {
    @NotEmpty(message = "at least one name tag is required")
    @Size (max=10, message="Maximum {tags} are allowed")
    private Set<
            @Size(min = 2, max = 30, message = "tag name must be between {min} and {max} charcters")
            @Pattern(regexp = "^[\\w\\s-]+$", message = "Tag name can only contain letters,numbers,spaces and hyphens")
            String> names;
}
