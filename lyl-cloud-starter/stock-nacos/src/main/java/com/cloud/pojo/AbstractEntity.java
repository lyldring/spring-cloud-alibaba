package com.cloud.pojo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author liyl
 */
@MappedSuperclass
@Configurable(autowire = Autowire.BY_TYPE)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private long createdAt = System.currentTimeMillis() / 1000;

    @Column(name = "updated_at")
    private long updatedAt = System.currentTimeMillis() / 1000;

    @Column(name = "disabled")
    private Long disabled = 0L;

    @Column(name = "remark")
    private String remark;

    public AbstractEntity(Long id, long createdAt, long updatedAt, Long disabled, String remark) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.disabled = disabled;
        this.remark = remark;
    }

    public AbstractEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getDisabled() {
        return disabled;
    }

    public void setDisabled(Long disabled) {
        this.disabled = disabled;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
