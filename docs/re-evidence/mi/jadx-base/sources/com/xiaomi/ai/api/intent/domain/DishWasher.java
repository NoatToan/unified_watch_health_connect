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
public class DishWasher<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum DishWasherMode {
        Basic(1, "Basic"),
        EnergySaving(2, "EnergySaving"),
        QuickWash(3, "QuickWash"),
        Intensive(4, "Intensive"),
        Glass(5, "Glass"),
        Prewash(6, "Prewash"),
        BitWash(7, "BitWash"),
        Dry(8, "Dry"),
        SelfClean(9, "SelfClean"),
        Disinfecting(10, "Disinfecting"),
        Bottle(11, "Bottle"),
        Fresh(12, "Fresh"),
        Seafood(13, "Seafood");

        private int id;
        private String name;

        DishWasherMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DishWasherMode find(String str) {
            for (DishWasherMode dishWasherMode : values()) {
                if (dishWasherMode.name.equals(str)) {
                    return dishWasherMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DishWasherMode read(String str) {
            return find(str);
        }

        public static String write(DishWasherMode dishWasherMode) {
            return dishWasherMode.getName();
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

    public static class leftTime implements EntityType {
        public static leftTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leftTime();
        }

        public static c4h write(leftTime lefttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<DishWasherMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), DishWasherMode.class));
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

        public Optional<Slot<DishWasherMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<DishWasherMode> slot) {
            this.name = Optional.e(slot);
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

    public DishWasher() {
    }

    public static DishWasher read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DishWasher dishWasher = new DishWasher(IntentUtils.readEntityType(zsdVar, AIApiConstants.DishWasher.NAME, optional));
        if (zsdVar.z("device")) {
            dishWasher.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            dishWasher.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            dishWasher.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            dishWasher.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            dishWasher.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            dishWasher.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            dishWasher.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return dishWasher;
    }

    public static zsd write(DishWasher dishWasher) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(dishWasher.entity_type);
        if (dishWasher.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(dishWasher.device.b()));
        }
        if (dishWasher.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(dishWasher.room.b()));
        }
        if (dishWasher.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(dishWasher.is_all_to_operate.b()));
        }
        if (dishWasher.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(dishWasher.sub_category.b()));
        }
        if (dishWasher.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(dishWasher.service_entity.b()));
        }
        if (dishWasher.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(dishWasher.description.b()));
        }
        if (dishWasher.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(dishWasher.timing.b()));
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

    public DishWasher setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public DishWasher setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public DishWasher setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DishWasher setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public DishWasher setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public DishWasher setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public DishWasher setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public DishWasher setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public DishWasher(T t) {
        this.entity_type = t;
    }
}
