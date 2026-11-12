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
public class Oven<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum OvenMode {
        AirFry(1, "AirFry"),
        Bake(2, "Bake"),
        Roast(3, "Roast"),
        AirDrying(4, "AirDrying"),
        Ferment(5, "Ferment"),
        KeepWarm(6, "KeepWarm"),
        Defrost(7, "Defrost"),
        CavitySterilize(8, "CavitySterilize");

        private int id;
        private String name;

        OvenMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static OvenMode find(String str) {
            for (OvenMode ovenMode : values()) {
                if (ovenMode.name.equals(str)) {
                    return ovenMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static OvenMode read(String str) {
            return find(str);
        }

        public static String write(OvenMode ovenMode) {
            return ovenMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class __switch implements EntityType {
        public static __switch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __switch();
        }

        public static c4h write(__switch __switchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class childLock implements EntityType {
        public static childLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new childLock();
        }

        public static c4h write(childLock childlock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class cookTime implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static cookTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            cookTime cooktime = new cookTime();
            if (zsdVar.z("value")) {
                cooktime.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return cooktime;
        }

        public static c4h write(cookTime cooktime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (cooktime.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(cooktime.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public cookTime setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class cooking implements EntityType {
        private Optional<Slot<OvenMode>> mode = Optional.a();

        public static cooking read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            cooking cookingVar = new cooking();
            if (zsdVar.z("mode")) {
                cookingVar.setMode(IntentUtils.readSlot(zsdVar.w("mode"), OvenMode.class));
            }
            return cookingVar;
        }

        public static c4h write(cooking cookingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (cookingVar.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(cookingVar.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<OvenMode>> getMode() {
            return this.mode;
        }

        public cooking setMode(Slot<OvenMode> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class filterLife implements EntityType {
        public static filterLife read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new filterLife();
        }

        public static c4h write(filterLife filterlife) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class leftTime implements EntityType {
        public static leftTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leftTime();
        }

        public static c4h write(leftTime lefttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class temperature implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static temperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            temperature temperatureVar = new temperature();
            if (zsdVar.z("value")) {
                temperatureVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return temperatureVar;
        }

        public static c4h write(temperature temperatureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (temperatureVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(temperatureVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public temperature setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public Oven() {
    }

    public static Oven read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Oven oven = new Oven(IntentUtils.readEntityType(zsdVar, AIApiConstants.Oven.NAME, optional));
        if (zsdVar.z("device")) {
            oven.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            oven.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            oven.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            oven.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            oven.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            oven.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            oven.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return oven;
    }

    public static zsd write(Oven oven) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(oven.entity_type);
        if (oven.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(oven.device.b()));
        }
        if (oven.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(oven.room.b()));
        }
        if (oven.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(oven.is_all_to_operate.b()));
        }
        if (oven.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(oven.sub_category.b()));
        }
        if (oven.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(oven.service_entity.b()));
        }
        if (oven.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(oven.description.b()));
        }
        if (oven.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(oven.timing.b()));
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

    public Oven setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Oven setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Oven setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Oven setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Oven setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Oven setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Oven setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Oven setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Oven(T t) {
        this.entity_type = t;
    }
}
