package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class SignLocation implements DomainType {
    private Optional<String> country = Optional.a();
    private Optional<String> province = Optional.a();
    private Optional<String> city = Optional.a();
    private Optional<String> district = Optional.a();
    private Optional<String> town = Optional.a();
    private Optional<String> block = Optional.a();
    private Optional<String> extra_name = Optional.a();
    private Optional<String> name = Optional.a();
    private Optional<NavigationV2.AddressType> address_type = Optional.a();
    private Optional<PoiProperty> poi_property = Optional.a();

    public Optional<NavigationV2.AddressType> getAddressType() {
        return this.address_type;
    }

    public Optional<String> getBlock() {
        return this.block;
    }

    public Optional<String> getCity() {
        return this.city;
    }

    public Optional<String> getCountry() {
        return this.country;
    }

    public Optional<String> getDistrict() {
        return this.district;
    }

    public Optional<String> getExtraName() {
        return this.extra_name;
    }

    public Optional<String> getName() {
        return this.name;
    }

    public Optional<PoiProperty> getPoiProperty() {
        return this.poi_property;
    }

    public Optional<String> getProvince() {
        return this.province;
    }

    public Optional<String> getTown() {
        return this.town;
    }

    public SignLocation setAddressType(NavigationV2.AddressType addressType) {
        this.address_type = Optional.e(addressType);
        return this;
    }

    public SignLocation setBlock(String str) {
        this.block = Optional.e(str);
        return this;
    }

    public SignLocation setCity(String str) {
        this.city = Optional.e(str);
        return this;
    }

    public SignLocation setCountry(String str) {
        this.country = Optional.e(str);
        return this;
    }

    public SignLocation setDistrict(String str) {
        this.district = Optional.e(str);
        return this;
    }

    public SignLocation setExtraName(String str) {
        this.extra_name = Optional.e(str);
        return this;
    }

    public SignLocation setName(String str) {
        this.name = Optional.e(str);
        return this;
    }

    public SignLocation setPoiProperty(PoiProperty poiProperty) {
        this.poi_property = Optional.e(poiProperty);
        return this;
    }

    public SignLocation setProvince(String str) {
        this.province = Optional.e(str);
        return this;
    }

    public SignLocation setTown(String str) {
        this.town = Optional.e(str);
        return this;
    }
}
