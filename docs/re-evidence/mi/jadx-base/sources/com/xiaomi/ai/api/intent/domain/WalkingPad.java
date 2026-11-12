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
public class WalkingPad<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum WalkingPadMode {
        Auto(1, "Auto"),
        None(2, "None");

        private int id;
        private String name;

        WalkingPadMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WalkingPadMode find(String str) {
            for (WalkingPadMode walkingPadMode : values()) {
                if (walkingPadMode.name.equals(str)) {
                    return walkingPadMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WalkingPadMode read(String str) {
            return find(str);
        }

        public static String write(WalkingPadMode walkingPadMode) {
            return walkingPadMode.getName();
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

    public static class mode implements EntityType {
        private Optional<Slot<WalkingPadMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), WalkingPadMode.class));
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

        public Optional<Slot<WalkingPadMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<WalkingPadMode> slot) {
            this.name = Optional.e(slot);
            return this;
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

    public WalkingPad() {
    }

    public static WalkingPad read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        WalkingPad walkingPad = new WalkingPad(IntentUtils.readEntityType(zsdVar, AIApiConstants.WalkingPad.NAME, optional));
        if (zsdVar.z("device")) {
            walkingPad.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            walkingPad.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            walkingPad.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            walkingPad.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            walkingPad.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            walkingPad.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            walkingPad.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return walkingPad;
    }

    public static zsd write(WalkingPad walkingPad) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(walkingPad.entity_type);
        if (walkingPad.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(walkingPad.device.b()));
        }
        if (walkingPad.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(walkingPad.room.b()));
        }
        if (walkingPad.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(walkingPad.is_all_to_operate.b()));
        }
        if (walkingPad.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(walkingPad.sub_category.b()));
        }
        if (walkingPad.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(walkingPad.service_entity.b()));
        }
        if (walkingPad.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(walkingPad.description.b()));
        }
        if (walkingPad.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(walkingPad.timing.b()));
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

    public WalkingPad setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public WalkingPad setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public WalkingPad setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public WalkingPad setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public WalkingPad setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public WalkingPad setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public WalkingPad setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public WalkingPad setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public WalkingPad(T t) {
        this.entity_type = t;
    }
}
