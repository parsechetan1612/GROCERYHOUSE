package com.project.glocery.dto;

import com.project.glocery.models.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class AllProductResponseDTO {
    private Boolean IsSuccess;
    private String Message;
    private Long CurrentPage;
    private Double TotalRecords;
    private Integer TotalPage;
    private List<Product> data;

}
