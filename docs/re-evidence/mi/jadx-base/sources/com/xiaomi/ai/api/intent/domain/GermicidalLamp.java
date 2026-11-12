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
public class GermicidalLamp<T extends EntityType> extends IntentionEntity<T, general> {

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

    public static class targetTime implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static targetTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            targetTime targettime = new targetTime();
            if (zsdVar.z("value")) {
                targettime.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return targettime;
        }

        public static c4h write(targetTime targettime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (targettime.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(targettime.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public targetTime setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public GermicidalLamp() {
    }

    public static GermicidalLamp read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        GermicidalLamp germicidalLamp = new GermicidalLamp(IntentUtils.readEntityType(zsdVar, AIApiConstants.GermicidalLamp.NAME, optional));
        if (zsdVar.z("device")) {
            germicidalLamp.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            germicidalLamp.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            germicidalLamp.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            germicidalLamp.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            germicidalLamp.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            germicidalLamp.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            germicidalLamp.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return germicidalLamp;
    }

    public static zsd write(GermicidalLamp germicidalLamp) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(germicidalLamp.entity_type);
        if (germicidalLamp.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(germicidalLamp.device.b()));
        }
        if (germicidalLamp.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(germicidalLamp.room.b()));
        }
        if (germicidalLamp.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(germicidalLamp.is_all_to_operate.b()));
        }
        if (germicidalLamp.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(germicidalLamp.sub_category.b()));
        }
        if (germicidalLamp.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(germicidalLamp.service_entity.b()));
        }
        if (germicidalLamp.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(germicidalLamp.description.b()));
        }
        if (germicidalLamp.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(germicidalLamp.timing.b()));
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

    public GermicidalLamp setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public GermicidalLamp setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public GermicidalLamp setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public GermicidalLamp setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public GermicidalLamp setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public GermicidalLamp setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public GermicidalLamp setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public GermicidalLamp setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public GermicidalLamp(T t) {
        this.entity_type = t;
    }
}
