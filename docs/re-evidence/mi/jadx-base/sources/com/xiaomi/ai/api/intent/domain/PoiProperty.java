package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class PoiProperty implements DomainType {
    private Optional<PoiTagCategory> poi_type = Optional.a();
    private Optional<String> parking_type = Optional.a();
    private Optional<String> aggregate_rating = Optional.a();
    private Optional<String> price = Optional.a();
    private Optional<String> brand = Optional.a();
    private Optional<String> properties = Optional.a();
    private Optional<String> status = Optional.a();
    private Optional<String> city_code = Optional.a();

    public Optional<String> getAggregateRating() {
        return this.aggregate_rating;
    }

    public Optional<String> getBrand() {
        return this.brand;
    }

    public Optional<String> getCityCode() {
        return this.city_code;
    }

    public Optional<String> getParkingType() {
        return this.parking_type;
    }

    public Optional<PoiTagCategory> getPoiType() {
        return this.poi_type;
    }

    public Optional<String> getPrice() {
        return this.price;
    }

    public Optional<String> getProperties() {
        return this.properties;
    }

    public Optional<String> getStatus() {
        return this.status;
    }

    public PoiProperty setAggregateRating(String str) {
        this.aggregate_rating = Optional.e(str);
        return this;
    }

    public PoiProperty setBrand(String str) {
        this.brand = Optional.e(str);
        return this;
    }

    public PoiProperty setCityCode(String str) {
        this.city_code = Optional.e(str);
        return this;
    }

    public PoiProperty setParkingType(String str) {
        this.parking_type = Optional.e(str);
        return this;
    }

    public PoiProperty setPoiType(PoiTagCategory poiTagCategory) {
        this.poi_type = Optional.e(poiTagCategory);
        return this;
    }

    public PoiProperty setPrice(String str) {
        this.price = Optional.e(str);
        return this;
    }

    public PoiProperty setProperties(String str) {
        this.properties = Optional.e(str);
        return this;
    }

    public PoiProperty setStatus(String str) {
        this.status = Optional.e(str);
        return this;
    }
}
