package com.xiaomi.ai.api.intent.domain;

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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Light<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum LightMode {
        Day(1, "Day"),
        Night(2, "Night"),
        Color(3, "Color"),
        Warmth(4, "Warmth"),
        Tv(5, "Tv"),
        Reading(6, "Reading"),
        Computer(7, "Computer"),
        Hospitality(8, "Hospitality"),
        Entertainment(9, "Entertainment"),
        Lighting(10, "Lighting"),
        NightLight(11, "NightLight"),
        Flow(12, "Flow"),
        WaterGrass(13, "WaterGrass");

        private int id;
        private String name;

        LightMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static LightMode find(String str) {
            for (LightMode lightMode : values()) {
                if (lightMode.name.equals(str)) {
                    return lightMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static LightMode read(String str) {
            return find(str);
        }

        public static String write(LightMode lightMode) {
            return lightMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class brightness implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static brightness read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            brightness brightnessVar = new brightness();
            if (zsdVar.z("value")) {
                brightnessVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return brightnessVar;
        }

        public static c4h write(brightness brightnessVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (brightnessVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(brightnessVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public brightness setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class color implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static color read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            color colorVar = new color();
            if (zsdVar.z("name")) {
                colorVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return colorVar;
        }

        public static c4h write(color colorVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (colorVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(colorVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public color setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class colorTemperature implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static colorTemperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            colorTemperature colortemperature = new colorTemperature();
            if (zsdVar.z("value")) {
                colortemperature.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return colortemperature;
        }

        public static c4h write(colorTemperature colortemperature) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (colortemperature.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(colortemperature.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public colorTemperature setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<LightMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), LightMode.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<LightMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<LightMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Light() {
    }

    public static Light read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Light light = new Light(IntentUtils.readEntityType(zsdVar, AIApiConstants.Light.NAME, optional));
        if (zsdVar.z("device")) {
            light.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            light.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            light.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            light.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            light.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            light.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            light.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return light;
    }

    public static zsd write(Light light) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(light.entity_type);
        if (light.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(light.device.b()));
        }
        if (light.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(light.room.b()));
        }
        if (light.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(light.is_all_to_operate.b()));
        }
        if (light.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(light.sub_category.b()));
        }
        if (light.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(light.service_entity.b()));
        }
        if (light.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(light.description.b()));
        }
        if (light.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(light.timing.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsAllToOperate() {
        return this.is_all_to_operate;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<String>> getServiceEntity() {
        return this.service_entity;
    }

    public Optional<Slot<String>> getSubCategory() {
        return this.sub_category;
    }

    public Optional<Slot<Miai.Datetime>> getTiming() {
        return this.timing;
    }

    public Light setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Light setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Light setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Light setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Light setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Light setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Light setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Light setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Light(T t) {
        this.entity_type = t;
    }
}
