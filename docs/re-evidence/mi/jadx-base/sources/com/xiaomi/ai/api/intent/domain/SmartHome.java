package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class SmartHome<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> category = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<String>> action = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public static class auth implements EntityType {
        public static auth read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new auth();
        }

        public static c4h write(auth authVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static SmartHome read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SmartHome smartHome = new SmartHome();
        if (zsdVar.z("device")) {
            smartHome.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("category")) {
            smartHome.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
        }
        if (zsdVar.z("room")) {
            smartHome.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            smartHome.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            smartHome.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            smartHome.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            smartHome.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("action")) {
            smartHome.setAction(IntentUtils.readSlot(zsdVar.w("action"), String.class));
        }
        if (zsdVar.z("timing")) {
            smartHome.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return smartHome;
    }

    public static zsd write(SmartHome smartHome) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (smartHome.device.c()) {
            c4hVarCreateObjectNode.f0("device", IntentUtils.writeSlot(smartHome.device.b()));
        }
        if (smartHome.category.c()) {
            c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(smartHome.category.b()));
        }
        if (smartHome.room.c()) {
            c4hVarCreateObjectNode.f0("room", IntentUtils.writeSlot(smartHome.room.b()));
        }
        if (smartHome.is_all_to_operate.c()) {
            c4hVarCreateObjectNode.f0("is_all_to_operate", IntentUtils.writeSlot(smartHome.is_all_to_operate.b()));
        }
        if (smartHome.sub_category.c()) {
            c4hVarCreateObjectNode.f0("sub_category", IntentUtils.writeSlot(smartHome.sub_category.b()));
        }
        if (smartHome.service_entity.c()) {
            c4hVarCreateObjectNode.f0("service_entity", IntentUtils.writeSlot(smartHome.service_entity.b()));
        }
        if (smartHome.description.c()) {
            c4hVarCreateObjectNode.f0("description", IntentUtils.writeSlot(smartHome.description.b()));
        }
        if (smartHome.action.c()) {
            c4hVarCreateObjectNode.f0("action", IntentUtils.writeSlot(smartHome.action.b()));
        }
        if (smartHome.timing.c()) {
            c4hVarCreateObjectNode.f0("timing", IntentUtils.writeSlot(smartHome.timing.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getAction() {
        return this.action;
    }

    public Optional<Slot<String>> getCategory() {
        return this.category;
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
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

    public SmartHome setAction(Slot<String> slot) {
        this.action = Optional.e(slot);
        return this;
    }

    public SmartHome setCategory(Slot<String> slot) {
        this.category = Optional.e(slot);
        return this;
    }

    public SmartHome setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public SmartHome setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    public SmartHome setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public SmartHome setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public SmartHome setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public SmartHome setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public SmartHome setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }
}
