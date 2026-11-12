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
public class WindowOpener<T extends EntityType> extends IntentionEntity<T, general> {

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

    public static class targetPosition implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static targetPosition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            targetPosition targetposition = new targetPosition();
            if (zsdVar.z("value")) {
                targetposition.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return targetposition;
        }

        public static c4h write(targetPosition targetposition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (targetposition.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(targetposition.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public targetPosition setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public WindowOpener() {
    }

    public static WindowOpener read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        WindowOpener windowOpener = new WindowOpener(IntentUtils.readEntityType(zsdVar, AIApiConstants.WindowOpener.NAME, optional));
        if (zsdVar.z("device")) {
            windowOpener.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            windowOpener.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            windowOpener.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            windowOpener.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            windowOpener.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            windowOpener.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            windowOpener.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return windowOpener;
    }

    public static zsd write(WindowOpener windowOpener) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(windowOpener.entity_type);
        if (windowOpener.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(windowOpener.device.b()));
        }
        if (windowOpener.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(windowOpener.room.b()));
        }
        if (windowOpener.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(windowOpener.is_all_to_operate.b()));
        }
        if (windowOpener.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(windowOpener.sub_category.b()));
        }
        if (windowOpener.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(windowOpener.service_entity.b()));
        }
        if (windowOpener.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(windowOpener.description.b()));
        }
        if (windowOpener.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(windowOpener.timing.b()));
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

    public WindowOpener setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public WindowOpener setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public WindowOpener setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public WindowOpener setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public WindowOpener setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public WindowOpener setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public WindowOpener setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public WindowOpener setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public WindowOpener(T t) {
        this.entity_type = t;
    }
}
