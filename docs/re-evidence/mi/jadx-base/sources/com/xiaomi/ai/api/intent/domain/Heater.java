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
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Heater<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum HeaterHeatLevel {
        Low(1, "Low"),
        High(2, "High");

        private int id;
        private String name;

        HeaterHeatLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static HeaterHeatLevel find(String str) {
            for (HeaterHeatLevel heaterHeatLevel : values()) {
                if (heaterHeatLevel.name.equals(str)) {
                    return heaterHeatLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static HeaterHeatLevel read(String str) {
            return find(str);
        }

        public static String write(HeaterHeatLevel heaterHeatLevel) {
            return heaterHeatLevel.getName();
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

    public static class alarm implements EntityType {
        public static alarm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alarm();
        }

        public static c4h write(alarm alarmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static class heatLevel implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<HeaterHeatLevel>> name = Optional.a();

        public static heatLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            heatLevel heatlevel = new heatLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                heatlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                heatlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), HeaterHeatLevel.class));
            }
            return heatlevel;
        }

        public static c4h write(heatLevel heatlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (heatlevel.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(heatlevel.number.b()));
            }
            if (heatlevel.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(heatlevel.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<HeaterHeatLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public heatLevel setName(Slot<HeaterHeatLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public heatLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
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

    public Heater() {
    }

    public static Heater read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Heater heater = new Heater(IntentUtils.readEntityType(zsdVar, AIApiConstants.Heater.NAME, optional));
        if (zsdVar.z("device")) {
            heater.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            heater.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            heater.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            heater.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            heater.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            heater.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            heater.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return heater;
    }

    public static zsd write(Heater heater) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(heater.entity_type);
        if (heater.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(heater.device.b()));
        }
        if (heater.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(heater.room.b()));
        }
        if (heater.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(heater.is_all_to_operate.b()));
        }
        if (heater.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(heater.sub_category.b()));
        }
        if (heater.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(heater.service_entity.b()));
        }
        if (heater.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(heater.description.b()));
        }
        if (heater.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(heater.timing.b()));
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

    public Heater setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Heater setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Heater setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Heater setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Heater setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Heater setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Heater setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Heater setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Heater(T t) {
        this.entity_type = t;
    }
}
