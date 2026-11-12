package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class IndoorEnvironment<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();

    public static class airQuality implements EntityType {
        public static airQuality read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new airQuality();
        }

        public static c4h write(airQuality airquality) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class co2Density implements EntityType {
        public static co2Density read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new co2Density();
        }

        public static c4h write(co2Density co2density) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class hchoDensity implements EntityType {
        public static hchoDensity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new hchoDensity();
        }

        public static c4h write(hchoDensity hchodensity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class pm10Density implements EntityType {
        public static pm10Density read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pm10Density();
        }

        public static c4h write(pm10Density pm10density) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class pm25Density implements EntityType {
        public static pm25Density read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pm25Density();
        }

        public static c4h write(pm25Density pm25density) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class relativeHumidity implements EntityType {
        public static relativeHumidity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new relativeHumidity();
        }

        public static c4h write(relativeHumidity relativehumidity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
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

    public static class tvocDensity implements EntityType {
        public static tvocDensity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tvocDensity();
        }

        public static c4h write(tvocDensity tvocdensity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class vocDensity implements EntityType {
        public static vocDensity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new vocDensity();
        }

        public static c4h write(vocDensity vocdensity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public IndoorEnvironment() {
    }

    public static IndoorEnvironment read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        IndoorEnvironment indoorEnvironment = new IndoorEnvironment(IntentUtils.readEntityType(zsdVar, AIApiConstants.IndoorEnvironment.NAME, optional));
        if (zsdVar.z("device")) {
            indoorEnvironment.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            indoorEnvironment.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            indoorEnvironment.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        return indoorEnvironment;
    }

    public static zsd write(IndoorEnvironment indoorEnvironment) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(indoorEnvironment.entity_type);
        if (indoorEnvironment.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(indoorEnvironment.device.b()));
        }
        if (indoorEnvironment.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(indoorEnvironment.room.b()));
        }
        if (indoorEnvironment.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(indoorEnvironment.is_all_to_operate.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
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

    public IndoorEnvironment setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public IndoorEnvironment setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public IndoorEnvironment setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public IndoorEnvironment setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public IndoorEnvironment(T t) {
        this.entity_type = t;
    }
}
