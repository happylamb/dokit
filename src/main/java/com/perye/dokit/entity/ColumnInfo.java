package com.perye.dokit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * 列的数据信息
 *
 * @author perye
 * @email peryedev@gmail.com
 * @date 2019/12/10 10:24 下午
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "column_config")
public class ColumnInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String tableName;

    // 数据库字段名称
    private String columnName;

    // 数据库字段类型
    private String columnType;

    // 数据库字段键类型
    private String keyType;

    // 字段额外的参数
    private String extra;

    // 数据库字段描述
    private String remark;

    // 必填
    private Boolean notNull;

    // 是否在列表显示
    private Boolean listShow;

    // 是否表单显示
    private Boolean formShow;

    // 表单类型
    private String formType;

    // 查询 1:模糊 2：精确
    private String queryType;

    // 字典名称
    private String dictName;

    // 关联表名
    private String joinName;

    public ColumnInfo(String tableName, String columnName, Boolean notNull, String columnType, String remark, String keyType, String extra) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.columnType = columnType;
        this.keyType = keyType;
        this.extra = extra;
        this.remark = remark;
        this.notNull = notNull;
        this.listShow = true;
        this.formShow = true;
    }

}