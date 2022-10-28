package com.demo.postgres.datatype.jsontype.domain;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Collections {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private List<String> cars;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private List<Object> modelYear;

    public Collections() {
    }

    public Collections(long id, List<String> cars, List<Object> modelYear) {
        this.id = id;
        this.cars = cars;
        this.modelYear = modelYear;
    }

    public Collections(List<String> cars, List<Object> modelYear) {
        this.cars = cars;
        this.modelYear = modelYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public List<Object> getModelYear() {
        return modelYear;
    }

    public void setModelYear(List<Object> modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Collections{" +
                "id=" + id +
                ", cars=" + cars +
                ", modelYear=" + modelYear +
                '}';
    }
}
