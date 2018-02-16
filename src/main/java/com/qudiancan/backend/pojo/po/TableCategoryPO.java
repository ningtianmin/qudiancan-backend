package com.qudiancan.backend.pojo.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author NINGTIANMIN
 */
@Entity(name = "TableCategory")
@Data
public class TableCategoryPO {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer branchId;
    private String name;
    private Integer position;
}