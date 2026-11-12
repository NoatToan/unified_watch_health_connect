package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class CompareModel {
    public Integer ageGroup;
    public String aggregationLevel;
    public Integer category;
    public Integer categoryCount;
    public Integer count;
    public Integer gender;
    public Long id;
    public String itemType;
    public String location;
    public Integer timeUnit;
    public String timeValue;

    public CompareModel(Long l, String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, String str4) {
        this.ageGroup = 0;
        this.gender = 0;
        this.category = 0;
        this.count = 0;
        this.categoryCount = 0;
        this.id = l;
        this.timeValue = str;
        this.ageGroup = num;
        this.itemType = str2;
        this.gender = num2;
        this.category = num3;
        this.count = num4;
        this.categoryCount = num5;
        this.location = str3;
        this.timeUnit = num6;
        this.aggregationLevel = str4;
    }

    public Integer getAgeGroup() {
        return this.ageGroup;
    }

    public String getAggregationLevel() {
        return this.aggregationLevel;
    }

    public Integer getCategory() {
        return this.category;
    }

    public Integer getCategoryCount() {
        return this.categoryCount;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Long getId() {
        return this.id;
    }

    public String getItemType() {
        return this.itemType;
    }

    public String getLocation() {
        return this.location;
    }

    public Integer getTimeUnit() {
        return this.timeUnit;
    }

    public String getTimeValue() {
        return this.timeValue;
    }

    public void setAgeGroup(Integer num) {
        this.ageGroup = num;
    }

    public void setAggregationLevel(String str) {
        this.aggregationLevel = str;
    }

    public void setCategory(Integer num) {
        this.category = num;
    }

    public void setCategoryCount(Integer num) {
        this.categoryCount = num;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setItemType(String str) {
        this.itemType = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setTimeUnit(Integer num) {
        this.timeUnit = num;
    }

    public void setTimeValue(String str) {
        this.timeValue = str;
    }

    public CompareModel() {
        this.ageGroup = 0;
        this.gender = 0;
        this.category = 0;
        this.count = 0;
        this.categoryCount = 0;
    }
}
