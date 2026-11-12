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
public class TemperatureHumiditySensor<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public static class battery implements EntityType {
        public static battery read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new battery();
        }

        public static c4h write(battery batteryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public TemperatureHumiditySensor() {
    }

    public static TemperatureHumiditySensor read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TemperatureHumiditySensor temperatureHumiditySensor = new TemperatureHumiditySensor(IntentUtils.readEntityType(zsdVar, AIApiConstants.TemperatureHumiditySensor.NAME, optional));
        if (zsdVar.z("device")) {
            temperatureHumiditySensor.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            temperatureHumiditySensor.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            temperatureHumiditySensor.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            temperatureHumiditySensor.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            temperatureHumiditySensor.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            temperatureHumiditySensor.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            temperatureHumiditySensor.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return temperatureHumiditySensor;
    }

    public static zsd write(TemperatureHumiditySensor temperatureHumiditySensor) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(temperatureHumiditySensor.entity_type);
        if (temperatureHumiditySensor.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(temperatureHumiditySensor.device.b()));
        }
        if (temperatureHumiditySensor.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(temperatureHumiditySensor.room.b()));
        }
        if (temperatureHumiditySensor.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(temperatureHumiditySensor.is_all_to_operate.b()));
        }
        if (temperatureHumiditySensor.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(temperatureHumiditySensor.sub_category.b()));
        }
        if (temperatureHumiditySensor.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(temperatureHumiditySensor.service_entity.b()));
        }
        if (temperatureHumiditySensor.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(temperatureHumiditySensor.description.b()));
        }
        if (temperatureHumiditySensor.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(temperatureHumiditySensor.timing.b()));
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

    public TemperatureHumiditySensor setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public TemperatureHumiditySensor setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public TemperatureHumiditySensor setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TemperatureHumiditySensor setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public TemperatureHumiditySensor setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public TemperatureHumiditySensor setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public TemperatureHumiditySensor setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public TemperatureHumiditySensor setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public TemperatureHumiditySensor(T t) {
        this.entity_type = t;
    }
}
