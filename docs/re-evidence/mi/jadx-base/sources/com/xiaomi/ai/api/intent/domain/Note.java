package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Note<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> content = Optional.a();

    @Deprecated
    private Optional<Slot<String>> content_type = Optional.a();

    @Deprecated
    private Optional<Slot<String>> data_area = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<NoteTargetApp>> target_app = Optional.a();
    private Optional<Slot<NoteType>> note_type = Optional.a();
    private Optional<Slot<UserDialogAct>> user_dialog_act = Optional.a();
    private Optional<Slot<SelectType>> select_type = Optional.a();
    private Optional<Slot<Integer>> select_index = Optional.a();
    private Optional<Slot<NoteCircle>> circle = Optional.a();
    private Optional<Slot<String>> circle_extra = Optional.a();
    private Optional<Slot<String>> ringtone_query = Optional.a();
    private Optional<Slot<String>> ringtone_type = Optional.a();
    private Optional<Slot<FilterType>> filter_type = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_filter = Optional.a();
    private Optional<Slot<TargetProperty>> target_property = Optional.a();
    private Optional<Slot<Miai.Date>> date = Optional.a();
    private Optional<Slot<Miai.TimeInterval>> interval = Optional.a();
    private Optional<Slot<Condition>> condition = Optional.a();
    private Optional<Slot<String>> goods = Optional.a();

    public enum AttributeType {
        Default(0, "Default"),
        Charge(1, "Charge"),
        Temperature(2, "Temperature"),
        Humidity(3, "Humidity");

        private int id;
        private String name;

        AttributeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AttributeType find(String str) {
            for (AttributeType attributeType : values()) {
                if (attributeType.name.equals(str)) {
                    return attributeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AttributeType read(String str) {
            return find(str);
        }

        public static String write(AttributeType attributeType) {
            return attributeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class Condition implements DomainType {
        private Optional<WeatherForecast.MeteorologyType> weather_condition = Optional.a();
        private Optional<Miai.Location> leaving_location = Optional.a();
        private Optional<Miai.Location> arriving_location = Optional.a();
        private Optional<AttributeType> attribute = Optional.a();
        private Optional<ConditionFilterType> condition_filter_type = Optional.a();
        private Optional<Float> attribute_value = Optional.a();
        private Optional<ConditionType> condition_type = Optional.a();
        private Optional<SpecialEventConditionType> special_event_condition = Optional.a();

        public Optional<Miai.Location> getArrivingLocation() {
            return this.arriving_location;
        }

        public Optional<AttributeType> getAttribute() {
            return this.attribute;
        }

        public Optional<Float> getAttributeValue() {
            return this.attribute_value;
        }

        public Optional<ConditionFilterType> getConditionFilterType() {
            return this.condition_filter_type;
        }

        public Optional<ConditionType> getConditionType() {
            return this.condition_type;
        }

        public Optional<Miai.Location> getLeavingLocation() {
            return this.leaving_location;
        }

        public Optional<SpecialEventConditionType> getSpecialEventCondition() {
            return this.special_event_condition;
        }

        public Optional<WeatherForecast.MeteorologyType> getWeatherCondition() {
            return this.weather_condition;
        }

        public Condition setArrivingLocation(Miai.Location location) {
            this.arriving_location = Optional.e(location);
            return this;
        }

        public Condition setAttribute(AttributeType attributeType) {
            this.attribute = Optional.e(attributeType);
            return this;
        }

        public Condition setAttributeValue(float f) {
            this.attribute_value = Optional.e(Float.valueOf(f));
            return this;
        }

        public Condition setConditionFilterType(ConditionFilterType conditionFilterType) {
            this.condition_filter_type = Optional.e(conditionFilterType);
            return this;
        }

        public Condition setConditionType(ConditionType conditionType) {
            this.condition_type = Optional.e(conditionType);
            return this;
        }

        public Condition setLeavingLocation(Miai.Location location) {
            this.leaving_location = Optional.e(location);
            return this;
        }

        public Condition setSpecialEventCondition(SpecialEventConditionType specialEventConditionType) {
            this.special_event_condition = Optional.e(specialEventConditionType);
            return this;
        }

        public Condition setWeatherCondition(WeatherForecast.MeteorologyType meteorologyType) {
            this.weather_condition = Optional.e(meteorologyType);
            return this;
        }
    }

    public enum ConditionFilterType {
        Default(0, "Default"),
        Equal(1, "Equal"),
        Less(2, "Less"),
        Greater(3, "Greater"),
        Before(4, "Before"),
        After(5, "After");

        private int id;
        private String name;

        ConditionFilterType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ConditionFilterType find(String str) {
            for (ConditionFilterType conditionFilterType : values()) {
                if (conditionFilterType.name.equals(str)) {
                    return conditionFilterType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ConditionFilterType read(String str) {
            return find(str);
        }

        public static String write(ConditionFilterType conditionFilterType) {
            return conditionFilterType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ConditionType {
        Default(0, "Default"),
        Enviroment(1, "Enviroment"),
        Location(2, SimpleRequest.LOCATION);

        private int id;
        private String name;

        ConditionType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ConditionType find(String str) {
            for (ConditionType conditionType : values()) {
                if (conditionType.name.equals(str)) {
                    return conditionType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ConditionType read(String str) {
            return find(str);
        }

        public static String write(ConditionType conditionType) {
            return conditionType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SpecialEventConditionType {
        Default(0, "Default"),
        StartWork(1, "StartWork"),
        AfterWork(2, "AfterWork"),
        GetOnCar(3, "GetOnCar"),
        GetOutofCar(4, "GetOutofCar");

        private int id;
        private String name;

        SpecialEventConditionType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SpecialEventConditionType find(String str) {
            for (SpecialEventConditionType specialEventConditionType : values()) {
                if (specialEventConditionType.name.equals(str)) {
                    return specialEventConditionType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SpecialEventConditionType read(String str) {
            return find(str);
        }

        public static String write(SpecialEventConditionType specialEventConditionType) {
            return specialEventConditionType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class TimeTypeInfo implements DomainType {
        private Optional<Miai.Datetime> datetime = Optional.a();
        private Optional<Miai.Date> date = Optional.a();
        private Optional<Miai.Duration> duration = Optional.a();
        private Optional<Miai.TimeInterval> interval = Optional.a();

        public Optional<Miai.Date> getDate() {
            return this.date;
        }

        public Optional<Miai.Datetime> getDatetime() {
            return this.datetime;
        }

        public Optional<Miai.Duration> getDuration() {
            return this.duration;
        }

        public Optional<Miai.TimeInterval> getInterval() {
            return this.interval;
        }

        public TimeTypeInfo setDate(Miai.Date date) {
            this.date = Optional.e(date);
            return this;
        }

        public TimeTypeInfo setDatetime(Miai.Datetime datetime) {
            this.datetime = Optional.e(datetime);
            return this;
        }

        public TimeTypeInfo setDuration(Miai.Duration duration) {
            this.duration = Optional.e(duration);
            return this;
        }

        public TimeTypeInfo setInterval(Miai.TimeInterval timeInterval) {
            this.interval = Optional.e(timeInterval);
            return this;
        }
    }

    public static class food implements EntityType {
        private Optional<Slot<NoteFoodStorageType>> storage_type = Optional.a();
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<TimeTypeInfo>> expiratio_date = Optional.a();
        private Optional<Slot<TimeTypeInfo>> shelf_life = Optional.a();

        public static food read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            food foodVar = new food();
            if (zsdVar.z("storage_type")) {
                foodVar.setStorageType(IntentUtils.readSlot(zsdVar.w("storage_type"), NoteFoodStorageType.class));
            }
            if (zsdVar.z("name")) {
                foodVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("expiratio_date")) {
                foodVar.setExpiratioDate(IntentUtils.readSlot(zsdVar.w("expiratio_date"), TimeTypeInfo.class));
            }
            if (zsdVar.z("shelf_life")) {
                foodVar.setShelfLife(IntentUtils.readSlot(zsdVar.w("shelf_life"), TimeTypeInfo.class));
            }
            return foodVar;
        }

        public static c4h write(food foodVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (foodVar.storage_type.c()) {
                c4hVarCreateObjectNode.f0("storage_type", IntentUtils.writeSlot(foodVar.storage_type.b()));
            }
            if (foodVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(foodVar.name.b()));
            }
            if (foodVar.expiratio_date.c()) {
                c4hVarCreateObjectNode.f0("expiratio_date", IntentUtils.writeSlot(foodVar.expiratio_date.b()));
            }
            if (foodVar.shelf_life.c()) {
                c4hVarCreateObjectNode.f0("shelf_life", IntentUtils.writeSlot(foodVar.shelf_life.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<TimeTypeInfo>> getExpiratioDate() {
            return this.expiratio_date;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<TimeTypeInfo>> getShelfLife() {
            return this.shelf_life;
        }

        public Optional<Slot<NoteFoodStorageType>> getStorageType() {
            return this.storage_type;
        }

        public food setExpiratioDate(Slot<TimeTypeInfo> slot) {
            this.expiratio_date = Optional.e(slot);
            return this;
        }

        public food setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public food setShelfLife(Slot<TimeTypeInfo> slot) {
            this.shelf_life = Optional.e(slot);
            return this;
        }

        public food setStorageType(Slot<NoteFoodStorageType> slot) {
            this.storage_type = Optional.e(slot);
            return this;
        }
    }

    public static class infantBodyInfo implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.MeasureUnit>> unit = Optional.a();
        private Optional<Slot<String>> how_long = Optional.a();
        private Optional<Slot<String>> how_many = Optional.a();

        public static infantBodyInfo read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            infantBodyInfo infantbodyinfo = new infantBodyInfo();
            if (zsdVar.z("name")) {
                infantbodyinfo.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("datetime")) {
                infantbodyinfo.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("unit")) {
                infantbodyinfo.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), Miai.MeasureUnit.class));
            }
            if (zsdVar.z("how_long")) {
                infantbodyinfo.setHowLong(IntentUtils.readSlot(zsdVar.w("how_long"), String.class));
            }
            if (zsdVar.z("how_many")) {
                infantbodyinfo.setHowMany(IntentUtils.readSlot(zsdVar.w("how_many"), String.class));
            }
            return infantbodyinfo;
        }

        public static c4h write(infantBodyInfo infantbodyinfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (infantbodyinfo.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(infantbodyinfo.name.b()));
            }
            if (infantbodyinfo.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(infantbodyinfo.datetime.b()));
            }
            if (infantbodyinfo.unit.c()) {
                c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(infantbodyinfo.unit.b()));
            }
            if (infantbodyinfo.how_long.c()) {
                c4hVarCreateObjectNode.f0("how_long", IntentUtils.writeSlot(infantbodyinfo.how_long.b()));
            }
            if (infantbodyinfo.how_many.c()) {
                c4hVarCreateObjectNode.f0("how_many", IntentUtils.writeSlot(infantbodyinfo.how_many.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getHowLong() {
            return this.how_long;
        }

        public Optional<Slot<String>> getHowMany() {
            return this.how_many;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MeasureUnit>> getUnit() {
            return this.unit;
        }

        public infantBodyInfo setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public infantBodyInfo setHowLong(Slot<String> slot) {
            this.how_long = Optional.e(slot);
            return this;
        }

        public infantBodyInfo setHowMany(Slot<String> slot) {
            this.how_many = Optional.e(slot);
            return this;
        }

        public infantBodyInfo setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public infantBodyInfo setUnit(Slot<Miai.MeasureUnit> slot) {
            this.unit = Optional.e(slot);
            return this;
        }
    }

    public static class infantFood implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.MeasureUnit>> unit = Optional.a();
        private Optional<Slot<String>> how_long = Optional.a();
        private Optional<Slot<String>> how_many = Optional.a();

        public static infantFood read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            infantFood infantfood = new infantFood();
            if (zsdVar.z("name")) {
                infantfood.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("datetime")) {
                infantfood.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("unit")) {
                infantfood.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), Miai.MeasureUnit.class));
            }
            if (zsdVar.z("how_long")) {
                infantfood.setHowLong(IntentUtils.readSlot(zsdVar.w("how_long"), String.class));
            }
            if (zsdVar.z("how_many")) {
                infantfood.setHowMany(IntentUtils.readSlot(zsdVar.w("how_many"), String.class));
            }
            return infantfood;
        }

        public static c4h write(infantFood infantfood) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (infantfood.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(infantfood.name.b()));
            }
            if (infantfood.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(infantfood.datetime.b()));
            }
            if (infantfood.unit.c()) {
                c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(infantfood.unit.b()));
            }
            if (infantfood.how_long.c()) {
                c4hVarCreateObjectNode.f0("how_long", IntentUtils.writeSlot(infantfood.how_long.b()));
            }
            if (infantfood.how_many.c()) {
                c4hVarCreateObjectNode.f0("how_many", IntentUtils.writeSlot(infantfood.how_many.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getHowLong() {
            return this.how_long;
        }

        public Optional<Slot<String>> getHowMany() {
            return this.how_many;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MeasureUnit>> getUnit() {
            return this.unit;
        }

        public infantFood setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public infantFood setHowLong(Slot<String> slot) {
            this.how_long = Optional.e(slot);
            return this;
        }

        public infantFood setHowMany(Slot<String> slot) {
            this.how_many = Optional.e(slot);
            return this;
        }

        public infantFood setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public infantFood setUnit(Slot<Miai.MeasureUnit> slot) {
            this.unit = Optional.e(slot);
            return this;
        }
    }

    public static class infantMilk implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.MeasureUnit>> unit = Optional.a();
        private Optional<Slot<String>> how_long = Optional.a();
        private Optional<Slot<String>> how_many = Optional.a();

        public static infantMilk read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            infantMilk infantmilk = new infantMilk();
            if (zsdVar.z("name")) {
                infantmilk.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("datetime")) {
                infantmilk.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("unit")) {
                infantmilk.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), Miai.MeasureUnit.class));
            }
            if (zsdVar.z("how_long")) {
                infantmilk.setHowLong(IntentUtils.readSlot(zsdVar.w("how_long"), String.class));
            }
            if (zsdVar.z("how_many")) {
                infantmilk.setHowMany(IntentUtils.readSlot(zsdVar.w("how_many"), String.class));
            }
            return infantmilk;
        }

        public static c4h write(infantMilk infantmilk) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (infantmilk.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(infantmilk.name.b()));
            }
            if (infantmilk.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(infantmilk.datetime.b()));
            }
            if (infantmilk.unit.c()) {
                c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(infantmilk.unit.b()));
            }
            if (infantmilk.how_long.c()) {
                c4hVarCreateObjectNode.f0("how_long", IntentUtils.writeSlot(infantmilk.how_long.b()));
            }
            if (infantmilk.how_many.c()) {
                c4hVarCreateObjectNode.f0("how_many", IntentUtils.writeSlot(infantmilk.how_many.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getHowLong() {
            return this.how_long;
        }

        public Optional<Slot<String>> getHowMany() {
            return this.how_many;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MeasureUnit>> getUnit() {
            return this.unit;
        }

        public infantMilk setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public infantMilk setHowLong(Slot<String> slot) {
            this.how_long = Optional.e(slot);
            return this;
        }

        public infantMilk setHowMany(Slot<String> slot) {
            this.how_many = Optional.e(slot);
            return this;
        }

        public infantMilk setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public infantMilk setUnit(Slot<Miai.MeasureUnit> slot) {
            this.unit = Optional.e(slot);
            return this;
        }
    }

    public static class infantPee implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.MeasureUnit>> unit = Optional.a();
        private Optional<Slot<String>> how_long = Optional.a();
        private Optional<Slot<String>> how_many = Optional.a();

        public static infantPee read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            infantPee infantpee = new infantPee();
            if (zsdVar.z("name")) {
                infantpee.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("datetime")) {
                infantpee.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("unit")) {
                infantpee.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), Miai.MeasureUnit.class));
            }
            if (zsdVar.z("how_long")) {
                infantpee.setHowLong(IntentUtils.readSlot(zsdVar.w("how_long"), String.class));
            }
            if (zsdVar.z("how_many")) {
                infantpee.setHowMany(IntentUtils.readSlot(zsdVar.w("how_many"), String.class));
            }
            return infantpee;
        }

        public static c4h write(infantPee infantpee) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (infantpee.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(infantpee.name.b()));
            }
            if (infantpee.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(infantpee.datetime.b()));
            }
            if (infantpee.unit.c()) {
                c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(infantpee.unit.b()));
            }
            if (infantpee.how_long.c()) {
                c4hVarCreateObjectNode.f0("how_long", IntentUtils.writeSlot(infantpee.how_long.b()));
            }
            if (infantpee.how_many.c()) {
                c4hVarCreateObjectNode.f0("how_many", IntentUtils.writeSlot(infantpee.how_many.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getHowLong() {
            return this.how_long;
        }

        public Optional<Slot<String>> getHowMany() {
            return this.how_many;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MeasureUnit>> getUnit() {
            return this.unit;
        }

        public infantPee setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public infantPee setHowLong(Slot<String> slot) {
            this.how_long = Optional.e(slot);
            return this;
        }

        public infantPee setHowMany(Slot<String> slot) {
            this.how_many = Optional.e(slot);
            return this;
        }

        public infantPee setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public infantPee setUnit(Slot<Miai.MeasureUnit> slot) {
            this.unit = Optional.e(slot);
            return this;
        }
    }

    public static class infantSleep implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.MeasureUnit>> unit = Optional.a();
        private Optional<Slot<String>> how_long = Optional.a();
        private Optional<Slot<String>> how_many = Optional.a();

        public static infantSleep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            infantSleep infantsleep = new infantSleep();
            if (zsdVar.z("name")) {
                infantsleep.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("datetime")) {
                infantsleep.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("unit")) {
                infantsleep.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), Miai.MeasureUnit.class));
            }
            if (zsdVar.z("how_long")) {
                infantsleep.setHowLong(IntentUtils.readSlot(zsdVar.w("how_long"), String.class));
            }
            if (zsdVar.z("how_many")) {
                infantsleep.setHowMany(IntentUtils.readSlot(zsdVar.w("how_many"), String.class));
            }
            return infantsleep;
        }

        public static c4h write(infantSleep infantsleep) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (infantsleep.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(infantsleep.name.b()));
            }
            if (infantsleep.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(infantsleep.datetime.b()));
            }
            if (infantsleep.unit.c()) {
                c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(infantsleep.unit.b()));
            }
            if (infantsleep.how_long.c()) {
                c4hVarCreateObjectNode.f0("how_long", IntentUtils.writeSlot(infantsleep.how_long.b()));
            }
            if (infantsleep.how_many.c()) {
                c4hVarCreateObjectNode.f0("how_many", IntentUtils.writeSlot(infantsleep.how_many.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getHowLong() {
            return this.how_long;
        }

        public Optional<Slot<String>> getHowMany() {
            return this.how_many;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MeasureUnit>> getUnit() {
            return this.unit;
        }

        public infantSleep setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public infantSleep setHowLong(Slot<String> slot) {
            this.how_long = Optional.e(slot);
            return this;
        }

        public infantSleep setHowMany(Slot<String> slot) {
            this.how_many = Optional.e(slot);
            return this;
        }

        public infantSleep setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public infantSleep setUnit(Slot<Miai.MeasureUnit> slot) {
            this.unit = Optional.e(slot);
            return this;
        }
    }

    public Note() {
    }

    public static Note read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Note note = new Note(IntentUtils.readEntityType(zsdVar, AIApiConstants.Note.NAME, optional));
        if (zsdVar.z(MiuiCursorConstants.CONTENT)) {
            note.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        }
        if (zsdVar.z("content_type")) {
            note.setContentType(IntentUtils.readSlot(zsdVar.w("content_type"), String.class));
        }
        if (zsdVar.z("data_area")) {
            note.setDataArea(IntentUtils.readSlot(zsdVar.w("data_area"), String.class));
        }
        if (zsdVar.z("datetime")) {
            note.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            note.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("target_app")) {
            note.setTargetApp(IntentUtils.readSlot(zsdVar.w("target_app"), NoteTargetApp.class));
        }
        if (zsdVar.z("note_type")) {
            note.setNoteType(IntentUtils.readSlot(zsdVar.w("note_type"), NoteType.class));
        }
        if (zsdVar.z("user_dialog_act")) {
            note.setUserDialogAct(IntentUtils.readSlot(zsdVar.w("user_dialog_act"), UserDialogAct.class));
        }
        if (zsdVar.z("select_type")) {
            note.setSelectType(IntentUtils.readSlot(zsdVar.w("select_type"), SelectType.class));
        }
        if (zsdVar.z("select_index")) {
            note.setSelectIndex(IntentUtils.readSlot(zsdVar.w("select_index"), Integer.class));
        }
        if (zsdVar.z("circle")) {
            note.setCircle(IntentUtils.readSlot(zsdVar.w("circle"), NoteCircle.class));
        }
        if (zsdVar.z("circle_extra")) {
            note.setCircleExtra(IntentUtils.readSlot(zsdVar.w("circle_extra"), String.class));
        }
        if (zsdVar.z("ringtone_query")) {
            note.setRingtoneQuery(IntentUtils.readSlot(zsdVar.w("ringtone_query"), String.class));
        }
        if (zsdVar.z("ringtone_type")) {
            note.setRingtoneType(IntentUtils.readSlot(zsdVar.w("ringtone_type"), String.class));
        }
        if (zsdVar.z("filter_type")) {
            note.setFilterType(IntentUtils.readSlot(zsdVar.w("filter_type"), FilterType.class));
        }
        if (zsdVar.z("is_all_to_filter")) {
            note.setIsAllToFilter(IntentUtils.readSlot(zsdVar.w("is_all_to_filter"), Boolean.class));
        }
        if (zsdVar.z("target_property")) {
            note.setTargetProperty(IntentUtils.readSlot(zsdVar.w("target_property"), TargetProperty.class));
        }
        if (zsdVar.z(DialWidgetType.DATE)) {
            note.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
        }
        if (zsdVar.z("interval")) {
            note.setInterval(IntentUtils.readSlot(zsdVar.w("interval"), Miai.TimeInterval.class));
        }
        if (zsdVar.z("condition")) {
            note.setCondition(IntentUtils.readSlot(zsdVar.w("condition"), Condition.class));
        }
        if (zsdVar.z("goods")) {
            note.setGoods(IntentUtils.readSlot(zsdVar.w("goods"), String.class));
        }
        return note;
    }

    public static zsd write(Note note) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(note.entity_type);
        if (note.content.c()) {
            c4hVar.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(note.content.b()));
        }
        if (note.content_type.c()) {
            c4hVar.f0("content_type", IntentUtils.writeSlot(note.content_type.b()));
        }
        if (note.data_area.c()) {
            c4hVar.f0("data_area", IntentUtils.writeSlot(note.data_area.b()));
        }
        if (note.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(note.datetime.b()));
        }
        if (note.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(note.duration.b()));
        }
        if (note.target_app.c()) {
            c4hVar.f0("target_app", IntentUtils.writeSlot(note.target_app.b()));
        }
        if (note.note_type.c()) {
            c4hVar.f0("note_type", IntentUtils.writeSlot(note.note_type.b()));
        }
        if (note.user_dialog_act.c()) {
            c4hVar.f0("user_dialog_act", IntentUtils.writeSlot(note.user_dialog_act.b()));
        }
        if (note.select_type.c()) {
            c4hVar.f0("select_type", IntentUtils.writeSlot(note.select_type.b()));
        }
        if (note.select_index.c()) {
            c4hVar.f0("select_index", IntentUtils.writeSlot(note.select_index.b()));
        }
        if (note.circle.c()) {
            c4hVar.f0("circle", IntentUtils.writeSlot(note.circle.b()));
        }
        if (note.circle_extra.c()) {
            c4hVar.f0("circle_extra", IntentUtils.writeSlot(note.circle_extra.b()));
        }
        if (note.ringtone_query.c()) {
            c4hVar.f0("ringtone_query", IntentUtils.writeSlot(note.ringtone_query.b()));
        }
        if (note.ringtone_type.c()) {
            c4hVar.f0("ringtone_type", IntentUtils.writeSlot(note.ringtone_type.b()));
        }
        if (note.filter_type.c()) {
            c4hVar.f0("filter_type", IntentUtils.writeSlot(note.filter_type.b()));
        }
        if (note.is_all_to_filter.c()) {
            c4hVar.f0("is_all_to_filter", IntentUtils.writeSlot(note.is_all_to_filter.b()));
        }
        if (note.target_property.c()) {
            c4hVar.f0("target_property", IntentUtils.writeSlot(note.target_property.b()));
        }
        if (note.date.c()) {
            c4hVar.f0(DialWidgetType.DATE, IntentUtils.writeSlot(note.date.b()));
        }
        if (note.interval.c()) {
            c4hVar.f0("interval", IntentUtils.writeSlot(note.interval.b()));
        }
        if (note.condition.c()) {
            c4hVar.f0("condition", IntentUtils.writeSlot(note.condition.b()));
        }
        if (note.goods.c()) {
            c4hVar.f0("goods", IntentUtils.writeSlot(note.goods.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<NoteCircle>> getCircle() {
        return this.circle;
    }

    public Optional<Slot<String>> getCircleExtra() {
        return this.circle_extra;
    }

    public Optional<Slot<Condition>> getCondition() {
        return this.condition;
    }

    public Optional<Slot<String>> getContent() {
        return this.content;
    }

    @Deprecated
    public Optional<Slot<String>> getContentType() {
        return this.content_type;
    }

    @Deprecated
    public Optional<Slot<String>> getDataArea() {
        return this.data_area;
    }

    public Optional<Slot<Miai.Date>> getDate() {
        return this.date;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<FilterType>> getFilterType() {
        return this.filter_type;
    }

    public Optional<Slot<String>> getGoods() {
        return this.goods;
    }

    public Optional<Slot<Miai.TimeInterval>> getInterval() {
        return this.interval;
    }

    public Optional<Slot<Boolean>> getIsAllToFilter() {
        return this.is_all_to_filter;
    }

    public Optional<Slot<NoteType>> getNoteType() {
        return this.note_type;
    }

    public Optional<Slot<String>> getRingtoneQuery() {
        return this.ringtone_query;
    }

    public Optional<Slot<String>> getRingtoneType() {
        return this.ringtone_type;
    }

    public Optional<Slot<Integer>> getSelectIndex() {
        return this.select_index;
    }

    public Optional<Slot<SelectType>> getSelectType() {
        return this.select_type;
    }

    public Optional<Slot<NoteTargetApp>> getTargetApp() {
        return this.target_app;
    }

    public Optional<Slot<TargetProperty>> getTargetProperty() {
        return this.target_property;
    }

    public Optional<Slot<UserDialogAct>> getUserDialogAct() {
        return this.user_dialog_act;
    }

    public Note setCircle(Slot<NoteCircle> slot) {
        this.circle = Optional.e(slot);
        return this;
    }

    public Note setCircleExtra(Slot<String> slot) {
        this.circle_extra = Optional.e(slot);
        return this;
    }

    public Note setCondition(Slot<Condition> slot) {
        this.condition = Optional.e(slot);
        return this;
    }

    public Note setContent(Slot<String> slot) {
        this.content = Optional.e(slot);
        return this;
    }

    @Deprecated
    public Note setContentType(Slot<String> slot) {
        this.content_type = Optional.e(slot);
        return this;
    }

    @Deprecated
    public Note setDataArea(Slot<String> slot) {
        this.data_area = Optional.e(slot);
        return this;
    }

    public Note setDate(Slot<Miai.Date> slot) {
        this.date = Optional.e(slot);
        return this;
    }

    public Note setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public Note setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public Note setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Note setFilterType(Slot<FilterType> slot) {
        this.filter_type = Optional.e(slot);
        return this;
    }

    public Note setGoods(Slot<String> slot) {
        this.goods = Optional.e(slot);
        return this;
    }

    public Note setInterval(Slot<Miai.TimeInterval> slot) {
        this.interval = Optional.e(slot);
        return this;
    }

    public Note setIsAllToFilter(Slot<Boolean> slot) {
        this.is_all_to_filter = Optional.e(slot);
        return this;
    }

    public Note setNoteType(Slot<NoteType> slot) {
        this.note_type = Optional.e(slot);
        return this;
    }

    public Note setRingtoneQuery(Slot<String> slot) {
        this.ringtone_query = Optional.e(slot);
        return this;
    }

    public Note setRingtoneType(Slot<String> slot) {
        this.ringtone_type = Optional.e(slot);
        return this;
    }

    public Note setSelectIndex(Slot<Integer> slot) {
        this.select_index = Optional.e(slot);
        return this;
    }

    public Note setSelectType(Slot<SelectType> slot) {
        this.select_type = Optional.e(slot);
        return this;
    }

    public Note setTargetApp(Slot<NoteTargetApp> slot) {
        this.target_app = Optional.e(slot);
        return this;
    }

    public Note setTargetProperty(Slot<TargetProperty> slot) {
        this.target_property = Optional.e(slot);
        return this;
    }

    public Note setUserDialogAct(Slot<UserDialogAct> slot) {
        this.user_dialog_act = Optional.e(slot);
        return this;
    }

    public static class location implements EntityType {

        @Required
        private Slot<String> good;
        private Optional<Slot<NoteGoodType>> good_type = Optional.a();

        @Required
        private Slot<String> loc;

        public location() {
        }

        public static location read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            location locationVar = new location();
            locationVar.setLoc(IntentUtils.readSlot(zsdVar.w("loc"), String.class));
            locationVar.setGood(IntentUtils.readSlot(zsdVar.w("good"), String.class));
            if (zsdVar.z("good_type")) {
                locationVar.setGoodType(IntentUtils.readSlot(zsdVar.w("good_type"), NoteGoodType.class));
            }
            return locationVar;
        }

        public static c4h write(location locationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("loc", IntentUtils.writeSlot(locationVar.loc));
            c4hVarCreateObjectNode.f0("good", IntentUtils.writeSlot(locationVar.good));
            if (locationVar.good_type.c()) {
                c4hVarCreateObjectNode.f0("good_type", IntentUtils.writeSlot(locationVar.good_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getGood() {
            return this.good;
        }

        public Optional<Slot<NoteGoodType>> getGoodType() {
            return this.good_type;
        }

        @Required
        public Slot<String> getLoc() {
            return this.loc;
        }

        @Required
        public location setGood(Slot<String> slot) {
            this.good = slot;
            return this;
        }

        public location setGoodType(Slot<NoteGoodType> slot) {
            this.good_type = Optional.e(slot);
            return this;
        }

        @Required
        public location setLoc(Slot<String> slot) {
            this.loc = slot;
            return this;
        }

        public location(Slot<String> slot, Slot<String> slot2) {
            this.loc = slot;
            this.good = slot2;
        }
    }

    public static class examInfo implements EntityType {
        private Optional<Slot<Miai.Datetime>> date_time = Optional.a();
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<String>> event = Optional.a();

        @Required
        private Slot<AlarmKeywordType> keyword_type;

        public examInfo() {
        }

        public static examInfo read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            examInfo examinfo = new examInfo();
            examinfo.setKeywordType(IntentUtils.readSlot(zsdVar.w("keyword_type"), AlarmKeywordType.class));
            if (zsdVar.z("date_time")) {
                examinfo.setDateTime(IntentUtils.readSlot(zsdVar.w("date_time"), Miai.Datetime.class));
            }
            if (zsdVar.z("duration")) {
                examinfo.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("event")) {
                examinfo.setEvent(IntentUtils.readSlot(zsdVar.w("event"), String.class));
            }
            return examinfo;
        }

        public static c4h write(examInfo examinfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("keyword_type", IntentUtils.writeSlot(examinfo.keyword_type));
            if (examinfo.date_time.c()) {
                c4hVarCreateObjectNode.f0("date_time", IntentUtils.writeSlot(examinfo.date_time.b()));
            }
            if (examinfo.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(examinfo.duration.b()));
            }
            if (examinfo.event.c()) {
                c4hVarCreateObjectNode.f0("event", IntentUtils.writeSlot(examinfo.event.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDateTime() {
            return this.date_time;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<String>> getEvent() {
            return this.event;
        }

        @Required
        public Slot<AlarmKeywordType> getKeywordType() {
            return this.keyword_type;
        }

        public examInfo setDateTime(Slot<Miai.Datetime> slot) {
            this.date_time = Optional.e(slot);
            return this;
        }

        public examInfo setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public examInfo setEvent(Slot<String> slot) {
            this.event = Optional.e(slot);
            return this;
        }

        @Required
        public examInfo setKeywordType(Slot<AlarmKeywordType> slot) {
            this.keyword_type = slot;
            return this;
        }

        public examInfo(Slot<AlarmKeywordType> slot) {
            this.keyword_type = slot;
        }
    }

    public static class calendar implements EntityType {

        @Required
        @Deprecated
        private Slot<AlarmKeywordType> keyword_type;

        @Deprecated
        private Optional<Slot<Miai.Datetime>> date_time = Optional.a();

        @Deprecated
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<String>> nick_name = Optional.a();

        @Deprecated
        private Optional<Slot<Boolean>> time_is_lunar = Optional.a();
        private Optional<Slot<String>> relationship = Optional.a();
        private Optional<Slot<NoteCalendarType>> calendar_type = Optional.a();
        private Optional<Slot<String>> exam_name = Optional.a();
        private Optional<Slot<NotePeriodType>> period_type = Optional.a();
        private Optional<Slot<NoteNucleinType>> nuclein_type = Optional.a();

        public calendar() {
        }

        public static calendar read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            calendar calendarVar = new calendar();
            calendarVar.setKeywordType(IntentUtils.readSlot(zsdVar.w("keyword_type"), AlarmKeywordType.class));
            if (zsdVar.z("date_time")) {
                calendarVar.setDateTime(IntentUtils.readSlot(zsdVar.w("date_time"), Miai.Datetime.class));
            }
            if (zsdVar.z("duration")) {
                calendarVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("nick_name")) {
                calendarVar.setNickName(IntentUtils.readSlot(zsdVar.w("nick_name"), String.class));
            }
            if (zsdVar.z("time_is_lunar")) {
                calendarVar.setTimeIsLunar(IntentUtils.readSlot(zsdVar.w("time_is_lunar"), Boolean.class));
            }
            if (zsdVar.z("relationship")) {
                calendarVar.setRelationship(IntentUtils.readSlot(zsdVar.w("relationship"), String.class));
            }
            if (zsdVar.z("calendar_type")) {
                calendarVar.setCalendarType(IntentUtils.readSlot(zsdVar.w("calendar_type"), NoteCalendarType.class));
            }
            if (zsdVar.z("exam_name")) {
                calendarVar.setExamName(IntentUtils.readSlot(zsdVar.w("exam_name"), String.class));
            }
            if (zsdVar.z("period_type")) {
                calendarVar.setPeriodType(IntentUtils.readSlot(zsdVar.w("period_type"), NotePeriodType.class));
            }
            if (zsdVar.z("nuclein_type")) {
                calendarVar.setNucleinType(IntentUtils.readSlot(zsdVar.w("nuclein_type"), NoteNucleinType.class));
            }
            return calendarVar;
        }

        public static c4h write(calendar calendarVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("keyword_type", IntentUtils.writeSlot(calendarVar.keyword_type));
            if (calendarVar.date_time.c()) {
                c4hVarCreateObjectNode.f0("date_time", IntentUtils.writeSlot(calendarVar.date_time.b()));
            }
            if (calendarVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(calendarVar.duration.b()));
            }
            if (calendarVar.nick_name.c()) {
                c4hVarCreateObjectNode.f0("nick_name", IntentUtils.writeSlot(calendarVar.nick_name.b()));
            }
            if (calendarVar.time_is_lunar.c()) {
                c4hVarCreateObjectNode.f0("time_is_lunar", IntentUtils.writeSlot(calendarVar.time_is_lunar.b()));
            }
            if (calendarVar.relationship.c()) {
                c4hVarCreateObjectNode.f0("relationship", IntentUtils.writeSlot(calendarVar.relationship.b()));
            }
            if (calendarVar.calendar_type.c()) {
                c4hVarCreateObjectNode.f0("calendar_type", IntentUtils.writeSlot(calendarVar.calendar_type.b()));
            }
            if (calendarVar.exam_name.c()) {
                c4hVarCreateObjectNode.f0("exam_name", IntentUtils.writeSlot(calendarVar.exam_name.b()));
            }
            if (calendarVar.period_type.c()) {
                c4hVarCreateObjectNode.f0("period_type", IntentUtils.writeSlot(calendarVar.period_type.b()));
            }
            if (calendarVar.nuclein_type.c()) {
                c4hVarCreateObjectNode.f0("nuclein_type", IntentUtils.writeSlot(calendarVar.nuclein_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<NoteCalendarType>> getCalendarType() {
            return this.calendar_type;
        }

        @Deprecated
        public Optional<Slot<Miai.Datetime>> getDateTime() {
            return this.date_time;
        }

        @Deprecated
        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<String>> getExamName() {
            return this.exam_name;
        }

        @Required
        @Deprecated
        public Slot<AlarmKeywordType> getKeywordType() {
            return this.keyword_type;
        }

        public Optional<Slot<String>> getNickName() {
            return this.nick_name;
        }

        public Optional<Slot<NoteNucleinType>> getNucleinType() {
            return this.nuclein_type;
        }

        public Optional<Slot<NotePeriodType>> getPeriodType() {
            return this.period_type;
        }

        public Optional<Slot<String>> getRelationship() {
            return this.relationship;
        }

        @Deprecated
        public Optional<Slot<Boolean>> getTimeIsLunar() {
            return this.time_is_lunar;
        }

        public calendar setCalendarType(Slot<NoteCalendarType> slot) {
            this.calendar_type = Optional.e(slot);
            return this;
        }

        @Deprecated
        public calendar setDateTime(Slot<Miai.Datetime> slot) {
            this.date_time = Optional.e(slot);
            return this;
        }

        @Deprecated
        public calendar setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public calendar setExamName(Slot<String> slot) {
            this.exam_name = Optional.e(slot);
            return this;
        }

        @Required
        @Deprecated
        public calendar setKeywordType(Slot<AlarmKeywordType> slot) {
            this.keyword_type = slot;
            return this;
        }

        public calendar setNickName(Slot<String> slot) {
            this.nick_name = Optional.e(slot);
            return this;
        }

        public calendar setNucleinType(Slot<NoteNucleinType> slot) {
            this.nuclein_type = Optional.e(slot);
            return this;
        }

        public calendar setPeriodType(Slot<NotePeriodType> slot) {
            this.period_type = Optional.e(slot);
            return this;
        }

        public calendar setRelationship(Slot<String> slot) {
            this.relationship = Optional.e(slot);
            return this;
        }

        @Deprecated
        public calendar setTimeIsLunar(Slot<Boolean> slot) {
            this.time_is_lunar = Optional.e(slot);
            return this;
        }

        public calendar(Slot<AlarmKeywordType> slot) {
            this.keyword_type = slot;
        }
    }

    public Note(T t) {
        this.entity_type = t;
    }
}
