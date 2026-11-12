package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class AutoMobile<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> brand = Optional.a();
    private Optional<Slot<String>> series = Optional.a();
    private Optional<Slot<String>> car_level = Optional.a();
    private Optional<Slot<Integer>> num_seats = Optional.a();
    private Optional<Slot<String>> drive = Optional.a();
    private Optional<Slot<String>> company = Optional.a();
    private Optional<Slot<Miai.Country>> country = Optional.a();
    private Optional<Slot<Miai.Date>> publish_time = Optional.a();
    private Optional<Slot<Miai.Currency>> car_price = Optional.a();

    public static class brandPrice implements EntityType {
        public static brandPrice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new brandPrice();
        }

        public static c4h write(brandPrice brandprice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class brandSeries implements EntityType {
        public static brandSeries read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new brandSeries();
        }

        public static c4h write(brandSeries brandseries) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class carInfo implements EntityType {
        public static carInfo read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new carInfo();
        }

        public static c4h write(carInfo carinfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class information implements EntityType {
        public static information read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new information();
        }

        public static c4h write(information informationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class price implements EntityType {
        public static price read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new price();
        }

        public static c4h write(price priceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class seriesPrice implements EntityType {
        public static seriesPrice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new seriesPrice();
        }

        public static c4h write(seriesPrice seriesprice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public AutoMobile() {
    }

    public static AutoMobile read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AutoMobile autoMobile = new AutoMobile(IntentUtils.readEntityType(zsdVar, AIApiConstants.AutoMobile.NAME, optional));
        if (zsdVar.z(CommonConstants.KEY_BRAND)) {
            autoMobile.setBrand(IntentUtils.readSlot(zsdVar.w(CommonConstants.KEY_BRAND), String.class));
        }
        if (zsdVar.z("series")) {
            autoMobile.setSeries(IntentUtils.readSlot(zsdVar.w("series"), String.class));
        }
        if (zsdVar.z("car_level")) {
            autoMobile.setCarLevel(IntentUtils.readSlot(zsdVar.w("car_level"), String.class));
        }
        if (zsdVar.z("num_seats")) {
            autoMobile.setNumSeats(IntentUtils.readSlot(zsdVar.w("num_seats"), Integer.class));
        }
        if (zsdVar.z("drive")) {
            autoMobile.setDrive(IntentUtils.readSlot(zsdVar.w("drive"), String.class));
        }
        if (zsdVar.z("company")) {
            autoMobile.setCompany(IntentUtils.readSlot(zsdVar.w("company"), String.class));
        }
        if (zsdVar.z("country")) {
            autoMobile.setCountry(IntentUtils.readSlot(zsdVar.w("country"), Miai.Country.class));
        }
        if (zsdVar.z("publish_time")) {
            autoMobile.setPublishTime(IntentUtils.readSlot(zsdVar.w("publish_time"), Miai.Date.class));
        }
        if (zsdVar.z("car_price")) {
            autoMobile.setCarPrice(IntentUtils.readSlot(zsdVar.w("car_price"), Miai.Currency.class));
        }
        return autoMobile;
    }

    public static zsd write(AutoMobile autoMobile) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(autoMobile.entity_type);
        if (autoMobile.brand.c()) {
            c4hVar.f0(CommonConstants.KEY_BRAND, IntentUtils.writeSlot(autoMobile.brand.b()));
        }
        if (autoMobile.series.c()) {
            c4hVar.f0("series", IntentUtils.writeSlot(autoMobile.series.b()));
        }
        if (autoMobile.car_level.c()) {
            c4hVar.f0("car_level", IntentUtils.writeSlot(autoMobile.car_level.b()));
        }
        if (autoMobile.num_seats.c()) {
            c4hVar.f0("num_seats", IntentUtils.writeSlot(autoMobile.num_seats.b()));
        }
        if (autoMobile.drive.c()) {
            c4hVar.f0("drive", IntentUtils.writeSlot(autoMobile.drive.b()));
        }
        if (autoMobile.company.c()) {
            c4hVar.f0("company", IntentUtils.writeSlot(autoMobile.company.b()));
        }
        if (autoMobile.country.c()) {
            c4hVar.f0("country", IntentUtils.writeSlot(autoMobile.country.b()));
        }
        if (autoMobile.publish_time.c()) {
            c4hVar.f0("publish_time", IntentUtils.writeSlot(autoMobile.publish_time.b()));
        }
        if (autoMobile.car_price.c()) {
            c4hVar.f0("car_price", IntentUtils.writeSlot(autoMobile.car_price.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getBrand() {
        return this.brand;
    }

    public Optional<Slot<String>> getCarLevel() {
        return this.car_level;
    }

    public Optional<Slot<Miai.Currency>> getCarPrice() {
        return this.car_price;
    }

    public Optional<Slot<String>> getCompany() {
        return this.company;
    }

    public Optional<Slot<Miai.Country>> getCountry() {
        return this.country;
    }

    public Optional<Slot<String>> getDrive() {
        return this.drive;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Integer>> getNumSeats() {
        return this.num_seats;
    }

    public Optional<Slot<Miai.Date>> getPublishTime() {
        return this.publish_time;
    }

    public Optional<Slot<String>> getSeries() {
        return this.series;
    }

    public AutoMobile setBrand(Slot<String> slot) {
        this.brand = Optional.e(slot);
        return this;
    }

    public AutoMobile setCarLevel(Slot<String> slot) {
        this.car_level = Optional.e(slot);
        return this;
    }

    public AutoMobile setCarPrice(Slot<Miai.Currency> slot) {
        this.car_price = Optional.e(slot);
        return this;
    }

    public AutoMobile setCompany(Slot<String> slot) {
        this.company = Optional.e(slot);
        return this;
    }

    public AutoMobile setCountry(Slot<Miai.Country> slot) {
        this.country = Optional.e(slot);
        return this;
    }

    public AutoMobile setDrive(Slot<String> slot) {
        this.drive = Optional.e(slot);
        return this;
    }

    @Required
    public AutoMobile setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AutoMobile setNumSeats(Slot<Integer> slot) {
        this.num_seats = Optional.e(slot);
        return this;
    }

    public AutoMobile setPublishTime(Slot<Miai.Date> slot) {
        this.publish_time = Optional.e(slot);
        return this;
    }

    public AutoMobile setSeries(Slot<String> slot) {
        this.series = Optional.e(slot);
        return this;
    }

    public AutoMobile(T t) {
        this.entity_type = t;
    }
}
