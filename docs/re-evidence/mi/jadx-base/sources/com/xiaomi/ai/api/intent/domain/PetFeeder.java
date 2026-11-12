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
public class PetFeeder<T extends EntityType> extends IntentionEntity<T, general> {

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

    public static class petFoodOut implements EntityType {

        @Required
        private Slot<Miai.Number> value;

        public petFoodOut() {
        }

        public petFoodOut(Slot<Miai.Number> slot) {
            this.value = slot;
        }

        public static petFoodOut read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            petFoodOut petfoodout = new petFoodOut();
            petfoodout.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            return petfoodout;
        }

        public static c4h write(petFoodOut petfoodout) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(petfoodout.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Number> getValue() {
            return this.value;
        }

        @Required
        public petFoodOut setValue(Slot<Miai.Number> slot) {
            this.value = slot;
            return this;
        }
    }

    public PetFeeder() {
    }

    public static PetFeeder read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PetFeeder petFeeder = new PetFeeder(IntentUtils.readEntityType(zsdVar, AIApiConstants.PetFeeder.NAME, optional));
        if (zsdVar.z("device")) {
            petFeeder.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            petFeeder.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            petFeeder.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            petFeeder.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            petFeeder.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            petFeeder.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            petFeeder.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return petFeeder;
    }

    public static zsd write(PetFeeder petFeeder) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(petFeeder.entity_type);
        if (petFeeder.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(petFeeder.device.b()));
        }
        if (petFeeder.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(petFeeder.room.b()));
        }
        if (petFeeder.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(petFeeder.is_all_to_operate.b()));
        }
        if (petFeeder.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(petFeeder.sub_category.b()));
        }
        if (petFeeder.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(petFeeder.service_entity.b()));
        }
        if (petFeeder.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(petFeeder.description.b()));
        }
        if (petFeeder.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(petFeeder.timing.b()));
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

    public PetFeeder setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public PetFeeder setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public PetFeeder setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PetFeeder setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public PetFeeder setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public PetFeeder setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public PetFeeder setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public PetFeeder setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public PetFeeder(T t) {
        this.entity_type = t;
    }
}
