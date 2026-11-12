package com.xiaomi.ai.api.intent.domain;

import com.amap.api.services.district.DistrictSearchQuery;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class WeatherForecast<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Date>> date = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<Miai.Country>> country = Optional.a();
    private Optional<Slot<Miai.Province>> province = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<Miai.District>> district = Optional.a();
    private Optional<Slot<String>> poi = Optional.a();
    private Optional<Slot<Miai.Town>> town = Optional.a();
    private Optional<Slot<IsInCar>> is_in_car = Optional.a();
    private Optional<Slot<LocationType>> location_type = Optional.a();

    public enum Clothes {
        Skirt(0, "Skirt"),
        Jeans(1, "Jeans"),
        LongSleeve(2, "LongSleeve"),
        Scarf(3, "Scarf"),
        Cap(4, "Cap"),
        CottonCoat(5, "CottonCoat"),
        SportPants(6, "SportPants"),
        WoollenSweater(7, "WoollenSweater"),
        Shirt(8, "Shirt"),
        ThermalPants(9, "ThermalPants"),
        Leggings(10, "Leggings"),
        Sweater(11, "Sweater"),
        Coat(12, "Coat"),
        WoolenCoat(13, "WoolenCoat"),
        ThermalTop(14, "ThermalTop"),
        Glove(15, "Glove"),
        Fleece(16, "Fleece"),
        DownCoat(17, "DownCoat"),
        CottonClothes(18, "CottonClothes"),
        ShortSleeve(19, "ShortSleeve");

        private int id;
        private String name;

        Clothes(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Clothes find(String str) {
            for (Clothes clothes : values()) {
                if (clothes.name.equals(str)) {
                    return clothes;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Clothes read(String str) {
            return find(str);
        }

        public static String write(Clothes clothes) {
            return clothes.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum IsInCar {
        Out(0, "Out"),
        In(1, "In"),
        Default(2, "default");

        private int id;
        private String name;

        IsInCar(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static IsInCar find(String str) {
            for (IsInCar isInCar : values()) {
                if (isInCar.name.equals(str)) {
                    return isInCar;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static IsInCar read(String str) {
            return find(str);
        }

        public static String write(IsInCar isInCar) {
            return isInCar.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum LocationType {
        Default(0, "default"),
        Destination(1, "Destination");

        private int id;
        private String name;

        LocationType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static LocationType find(String str) {
            for (LocationType locationType : values()) {
                if (locationType.name.equals(str)) {
                    return locationType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static LocationType read(String str) {
            return find(str);
        }

        public static String write(LocationType locationType) {
            return locationType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum MeteorologyType {
        Typhoon(0, "Typhoon"),
        RainStorm(1, "RainStorm"),
        SnowStorm(2, "SnowStorm"),
        ColdWave(3, "ColdWave"),
        Lightning(4, "Lightning"),
        Drought(5, "Drought"),
        Frost(6, "Frost"),
        Gale(7, "Gale"),
        SandStorm(8, "SandStorm"),
        ColdSpell(9, "ColdSpell"),
        HeatWave(10, "HeatWave"),
        Hail(11, "hail"),
        HeavyFog(12, "HeavyFog"),
        RoadIcing(13, "RoadIcing"),
        Haze(14, "Haze"),
        Rain(15, "Rain"),
        Snow(16, "Snow"),
        Fog(17, "Fog"),
        Overcast(18, "Overcast"),
        ClearSky(19, "ClearSky"),
        Cloudy(20, "Cloudy"),
        Precipitation(21, "Precipitation");

        private int id;
        private String name;

        MeteorologyType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MeteorologyType find(String str) {
            for (MeteorologyType meteorologyType : values()) {
                if (meteorologyType.name.equals(str)) {
                    return meteorologyType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MeteorologyType read(String str) {
            return find(str);
        }

        public static String write(MeteorologyType meteorologyType) {
            return meteorologyType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SunTimeType {
        Sunrise(0, "Sunrise"),
        Sunset(1, "Sunset");

        private int id;
        private String name;

        SunTimeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SunTimeType find(String str) {
            for (SunTimeType sunTimeType : values()) {
                if (sunTimeType.name.equals(str)) {
                    return sunTimeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SunTimeType read(String str) {
            return find(str);
        }

        public static String write(SunTimeType sunTimeType) {
            return sunTimeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum TemperatureType {
        Default(0, "Default"),
        Maximum(1, "Maximum"),
        Minimum(2, "Minimum"),
        Apparent(3, "Apparent");

        private int id;
        private String name;

        TemperatureType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TemperatureType find(String str) {
            for (TemperatureType temperatureType : values()) {
                if (temperatureType.name.equals(str)) {
                    return temperatureType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TemperatureType read(String str) {
            return find(str);
        }

        public static String write(TemperatureType temperatureType) {
            return temperatureType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class airQuality implements EntityType {
        public static airQuality read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new airQuality();
        }

        public static c4h write(airQuality airquality) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class allergy implements EntityType {
        public static allergy read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new allergy();
        }

        public static c4h write(allergy allergyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class carWashIndex implements EntityType {
        public static carWashIndex read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new carWashIndex();
        }

        public static c4h write(carWashIndex carwashindex) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class clothesIndex implements EntityType {
        private Optional<Slot<Clothes>> clothes = Optional.a();

        public static clothesIndex read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            clothesIndex clothesindex = new clothesIndex();
            if (zsdVar.z("clothes")) {
                clothesindex.setClothes(IntentUtils.readSlot(zsdVar.w("clothes"), Clothes.class));
            }
            return clothesindex;
        }

        public static c4h write(clothesIndex clothesindex) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (clothesindex.clothes.c()) {
                c4hVarCreateObjectNode.f0("clothes", IntentUtils.writeSlot(clothesindex.clothes.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Clothes>> getClothes() {
            return this.clothes;
        }

        public clothesIndex setClothes(Slot<Clothes> slot) {
            this.clothes = Optional.e(slot);
            return this;
        }
    }

    public static class earthquake implements EntityType {
        private Optional<Slot<Boolean>> is_rightnow = Optional.a();

        public static earthquake read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            earthquake earthquakeVar = new earthquake();
            if (zsdVar.z("is_rightnow")) {
                earthquakeVar.setIsRightnow(IntentUtils.readSlot(zsdVar.w("is_rightnow"), Boolean.class));
            }
            return earthquakeVar;
        }

        public static c4h write(earthquake earthquakeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (earthquakeVar.is_rightnow.c()) {
                c4hVarCreateObjectNode.f0("is_rightnow", IntentUtils.writeSlot(earthquakeVar.is_rightnow.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getIsRightnow() {
            return this.is_rightnow;
        }

        public earthquake setIsRightnow(Slot<Boolean> slot) {
            this.is_rightnow = Optional.e(slot);
            return this;
        }
    }

    public static class humidity implements EntityType {
        public static humidity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new humidity();
        }

        public static c4h write(humidity humidityVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class meteorology implements EntityType {

        @Required
        private Slot<MeteorologyType> type;

        public meteorology() {
        }

        public meteorology(Slot<MeteorologyType> slot) {
            this.type = slot;
        }

        public static meteorology read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            meteorology meteorologyVar = new meteorology();
            meteorologyVar.setType(IntentUtils.readSlot(zsdVar.w("type"), MeteorologyType.class));
            return meteorologyVar;
        }

        public static c4h write(meteorology meteorologyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(meteorologyVar.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<MeteorologyType> getType() {
            return this.type;
        }

        @Required
        public meteorology setType(Slot<MeteorologyType> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class meteorologyEndTime implements EntityType {

        @Required
        private Slot<MeteorologyType> type;

        public meteorologyEndTime() {
        }

        public meteorologyEndTime(Slot<MeteorologyType> slot) {
            this.type = slot;
        }

        public static meteorologyEndTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            meteorologyEndTime meteorologyendtime = new meteorologyEndTime();
            meteorologyendtime.setType(IntentUtils.readSlot(zsdVar.w("type"), MeteorologyType.class));
            return meteorologyendtime;
        }

        public static c4h write(meteorologyEndTime meteorologyendtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(meteorologyendtime.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<MeteorologyType> getType() {
            return this.type;
        }

        @Required
        public meteorologyEndTime setType(Slot<MeteorologyType> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class meteorologyTime implements EntityType {

        @Required
        private Slot<MeteorologyType> type;

        public meteorologyTime() {
        }

        public meteorologyTime(Slot<MeteorologyType> slot) {
            this.type = slot;
        }

        public static meteorologyTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            meteorologyTime meteorologytime = new meteorologyTime();
            meteorologytime.setType(IntentUtils.readSlot(zsdVar.w("type"), MeteorologyType.class));
            return meteorologytime;
        }

        public static c4h write(meteorologyTime meteorologytime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(meteorologytime.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<MeteorologyType> getType() {
            return this.type;
        }

        @Required
        public meteorologyTime setType(Slot<MeteorologyType> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class sportIndex implements EntityType {
        public static sportIndex read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new sportIndex();
        }

        public static c4h write(sportIndex sportindex) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sunTime implements EntityType {

        @Required
        private Slot<SunTimeType> type;

        public sunTime() {
        }

        public sunTime(Slot<SunTimeType> slot) {
            this.type = slot;
        }

        public static sunTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sunTime suntime = new sunTime();
            suntime.setType(IntentUtils.readSlot(zsdVar.w("type"), SunTimeType.class));
            return suntime;
        }

        public static c4h write(sunTime suntime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(suntime.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<SunTimeType> getType() {
            return this.type;
        }

        @Required
        public sunTime setType(Slot<SunTimeType> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class temperature implements EntityType {

        @Required
        private Slot<TemperatureType> type;

        public temperature() {
        }

        public temperature(Slot<TemperatureType> slot) {
            this.type = slot;
        }

        public static temperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            temperature temperatureVar = new temperature();
            temperatureVar.setType(IntentUtils.readSlot(zsdVar.w("type"), TemperatureType.class));
            return temperatureVar;
        }

        public static c4h write(temperature temperatureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(temperatureVar.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<TemperatureType> getType() {
            return this.type;
        }

        @Required
        public temperature setType(Slot<TemperatureType> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class ultraviolet implements EntityType {
        public static ultraviolet read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ultraviolet();
        }

        public static c4h write(ultraviolet ultravioletVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class windSpeed implements EntityType {
        public static windSpeed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new windSpeed();
        }

        public static c4h write(windSpeed windspeed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public WeatherForecast() {
    }

    public static WeatherForecast read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        WeatherForecast weatherForecast = new WeatherForecast(IntentUtils.readEntityType(zsdVar, AIApiConstants.WeatherForecast.NAME, optional));
        if (zsdVar.z("datetime")) {
            weatherForecast.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z(DialWidgetType.DATE)) {
            weatherForecast.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
        }
        if (zsdVar.z("duration")) {
            weatherForecast.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("country")) {
            weatherForecast.setCountry(IntentUtils.readSlot(zsdVar.w("country"), Miai.Country.class));
        }
        if (zsdVar.z("province")) {
            weatherForecast.setProvince(IntentUtils.readSlot(zsdVar.w("province"), Miai.Province.class));
        }
        if (zsdVar.z("city")) {
            weatherForecast.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z(DistrictSearchQuery.KEYWORDS_DISTRICT)) {
            weatherForecast.setDistrict(IntentUtils.readSlot(zsdVar.w(DistrictSearchQuery.KEYWORDS_DISTRICT), Miai.District.class));
        }
        if (zsdVar.z("poi")) {
            weatherForecast.setPoi(IntentUtils.readSlot(zsdVar.w("poi"), String.class));
        }
        if (zsdVar.z("town")) {
            weatherForecast.setTown(IntentUtils.readSlot(zsdVar.w("town"), Miai.Town.class));
        }
        if (zsdVar.z("is_in_car")) {
            weatherForecast.setIsInCar(IntentUtils.readSlot(zsdVar.w("is_in_car"), IsInCar.class));
        }
        if (zsdVar.z("location_type")) {
            weatherForecast.setLocationType(IntentUtils.readSlot(zsdVar.w("location_type"), LocationType.class));
        }
        return weatherForecast;
    }

    public static zsd write(WeatherForecast weatherForecast) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(weatherForecast.entity_type);
        if (weatherForecast.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(weatherForecast.datetime.b()));
        }
        if (weatherForecast.date.c()) {
            c4hVar.f0(DialWidgetType.DATE, IntentUtils.writeSlot(weatherForecast.date.b()));
        }
        if (weatherForecast.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(weatherForecast.duration.b()));
        }
        if (weatherForecast.country.c()) {
            c4hVar.f0("country", IntentUtils.writeSlot(weatherForecast.country.b()));
        }
        if (weatherForecast.province.c()) {
            c4hVar.f0("province", IntentUtils.writeSlot(weatherForecast.province.b()));
        }
        if (weatherForecast.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(weatherForecast.city.b()));
        }
        if (weatherForecast.district.c()) {
            c4hVar.f0(DistrictSearchQuery.KEYWORDS_DISTRICT, IntentUtils.writeSlot(weatherForecast.district.b()));
        }
        if (weatherForecast.poi.c()) {
            c4hVar.f0("poi", IntentUtils.writeSlot(weatherForecast.poi.b()));
        }
        if (weatherForecast.town.c()) {
            c4hVar.f0("town", IntentUtils.writeSlot(weatherForecast.town.b()));
        }
        if (weatherForecast.is_in_car.c()) {
            c4hVar.f0("is_in_car", IntentUtils.writeSlot(weatherForecast.is_in_car.b()));
        }
        if (weatherForecast.location_type.c()) {
            c4hVar.f0("location_type", IntentUtils.writeSlot(weatherForecast.location_type.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    public Optional<Slot<Miai.Country>> getCountry() {
        return this.country;
    }

    public Optional<Slot<Miai.Date>> getDate() {
        return this.date;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Miai.District>> getDistrict() {
        return this.district;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<IsInCar>> getIsInCar() {
        return this.is_in_car;
    }

    public Optional<Slot<LocationType>> getLocationType() {
        return this.location_type;
    }

    public Optional<Slot<String>> getPoi() {
        return this.poi;
    }

    public Optional<Slot<Miai.Province>> getProvince() {
        return this.province;
    }

    public Optional<Slot<Miai.Town>> getTown() {
        return this.town;
    }

    public WeatherForecast setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    public WeatherForecast setCountry(Slot<Miai.Country> slot) {
        this.country = Optional.e(slot);
        return this;
    }

    public WeatherForecast setDate(Slot<Miai.Date> slot) {
        this.date = Optional.e(slot);
        return this;
    }

    public WeatherForecast setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public WeatherForecast setDistrict(Slot<Miai.District> slot) {
        this.district = Optional.e(slot);
        return this;
    }

    public WeatherForecast setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public WeatherForecast setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public WeatherForecast setIsInCar(Slot<IsInCar> slot) {
        this.is_in_car = Optional.e(slot);
        return this;
    }

    public WeatherForecast setLocationType(Slot<LocationType> slot) {
        this.location_type = Optional.e(slot);
        return this;
    }

    public WeatherForecast setPoi(Slot<String> slot) {
        this.poi = Optional.e(slot);
        return this;
    }

    public WeatherForecast setProvince(Slot<Miai.Province> slot) {
        this.province = Optional.e(slot);
        return this;
    }

    public WeatherForecast setTown(Slot<Miai.Town> slot) {
        this.town = Optional.e(slot);
        return this;
    }

    public WeatherForecast(T t) {
        this.entity_type = t;
    }
}
