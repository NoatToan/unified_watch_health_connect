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
public class Treadmill<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public static class __switch implements EntityType {
        public static __switch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __switch();
        }

        public static c4h write(__switch __switchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class currentCalorieConsumption implements EntityType {
        public static currentCalorieConsumption read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new currentCalorieConsumption();
        }

        public static c4h write(currentCalorieConsumption currentcalorieconsumption) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class currentDistance implements EntityType {
        public static currentDistance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new currentDistance();
        }

        public static c4h write(currentDistance currentdistance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class currentStepCount implements EntityType {
        public static currentStepCount read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new currentStepCount();
        }

        public static c4h write(currentStepCount currentstepcount) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class speedLevel implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static speedLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            speedLevel speedlevel = new speedLevel();
            if (zsdVar.z("value")) {
                speedlevel.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return speedlevel;
        }

        public static c4h write(speedLevel speedlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (speedlevel.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(speedlevel.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public speedLevel setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class workingTime implements EntityType {
        public static workingTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new workingTime();
        }

        public static c4h write(workingTime workingtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Treadmill() {
    }

    public static Treadmill read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Treadmill treadmill = new Treadmill(IntentUtils.readEntityType(zsdVar, AIApiConstants.Treadmill.NAME, optional));
        if (zsdVar.z("device")) {
            treadmill.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            treadmill.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            treadmill.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            treadmill.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            treadmill.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            treadmill.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            treadmill.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return treadmill;
    }

    public static zsd write(Treadmill treadmill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(treadmill.entity_type);
        if (treadmill.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(treadmill.device.b()));
        }
        if (treadmill.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(treadmill.room.b()));
        }
        if (treadmill.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(treadmill.is_all_to_operate.b()));
        }
        if (treadmill.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(treadmill.sub_category.b()));
        }
        if (treadmill.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(treadmill.service_entity.b()));
        }
        if (treadmill.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(treadmill.description.b()));
        }
        if (treadmill.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(treadmill.timing.b()));
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

    public Treadmill setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Treadmill setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Treadmill setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Treadmill setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Treadmill setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Treadmill setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Treadmill setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Treadmill setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Treadmill(T t) {
        this.entity_type = t;
    }
}
