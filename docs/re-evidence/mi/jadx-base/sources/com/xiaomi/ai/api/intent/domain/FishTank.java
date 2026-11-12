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
public class FishTank<T extends EntityType> extends IntentionEntity<T, general> {

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

    public static class alarm implements EntityType {
        public static alarm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alarm();
        }

        public static c4h write(alarm alarmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class automaticFeeding implements EntityType {
        public static automaticFeeding read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new automaticFeeding();
        }

        public static c4h write(automaticFeeding automaticfeeding) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static class indicatorLight implements EntityType {
        public static indicatorLight read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new indicatorLight();
        }

        public static c4h write(indicatorLight indicatorlight) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class noDisturb implements EntityType {
        public static noDisturb read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new noDisturb();
        }

        public static c4h write(noDisturb nodisturb) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class petFoodOut implements EntityType {
        private Optional<Slot<Miai.Number>> feeding_measure = Optional.a();

        public static petFoodOut read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            petFoodOut petfoodout = new petFoodOut();
            if (zsdVar.z("feeding_measure")) {
                petfoodout.setFeedingMeasure(IntentUtils.readSlot(zsdVar.w("feeding_measure"), Miai.Number.class));
            }
            return petfoodout;
        }

        public static c4h write(petFoodOut petfoodout) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (petfoodout.feeding_measure.c()) {
                c4hVarCreateObjectNode.f0("feeding_measure", IntentUtils.writeSlot(petfoodout.feeding_measure.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getFeedingMeasure() {
            return this.feeding_measure;
        }

        public petFoodOut setFeedingMeasure(Slot<Miai.Number> slot) {
            this.feeding_measure = Optional.e(slot);
            return this;
        }
    }

    public static class pumpFlux implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static pumpFlux read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            pumpFlux pumpflux = new pumpFlux();
            if (zsdVar.z("value")) {
                pumpflux.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return pumpflux;
        }

        public static c4h write(pumpFlux pumpflux) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (pumpflux.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(pumpflux.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public pumpFlux setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class temperature implements EntityType {
        public static temperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new temperature();
        }

        public static c4h write(temperature temperatureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class waterPump implements EntityType {
        public static waterPump read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new waterPump();
        }

        public static c4h write(waterPump waterpump) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class waterPumpStatus implements EntityType {
        public static waterPumpStatus read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new waterPumpStatus();
        }

        public static c4h write(waterPumpStatus waterpumpstatus) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public FishTank() {
    }

    public static FishTank read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        FishTank fishTank = new FishTank(IntentUtils.readEntityType(zsdVar, AIApiConstants.FishTank.NAME, optional));
        if (zsdVar.z("device")) {
            fishTank.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            fishTank.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            fishTank.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            fishTank.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            fishTank.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            fishTank.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            fishTank.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return fishTank;
    }

    public static zsd write(FishTank fishTank) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(fishTank.entity_type);
        if (fishTank.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(fishTank.device.b()));
        }
        if (fishTank.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(fishTank.room.b()));
        }
        if (fishTank.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(fishTank.is_all_to_operate.b()));
        }
        if (fishTank.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(fishTank.sub_category.b()));
        }
        if (fishTank.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(fishTank.service_entity.b()));
        }
        if (fishTank.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(fishTank.description.b()));
        }
        if (fishTank.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(fishTank.timing.b()));
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

    public FishTank setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public FishTank setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public FishTank setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public FishTank setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public FishTank setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public FishTank setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public FishTank setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public FishTank setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public FishTank(T t) {
        this.entity_type = t;
    }
}
