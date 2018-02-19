package com.qudiancan.backend.pojo.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author NINGTIANMIN
 */
@Data
public class BranchProductVO {
    private Integer categoryId;
    private Integer departmentId;
    private String name;
    private String unitName;
    private BigDecimal price;
    private String description;
    private Integer position;
}
