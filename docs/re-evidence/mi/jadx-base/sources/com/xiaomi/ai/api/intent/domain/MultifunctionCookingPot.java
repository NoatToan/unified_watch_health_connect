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
public class MultifunctionCookingPot<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public static class heatLevel implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();

        public static heatLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            heatLevel heatlevel = new heatLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                heatlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            return heatlevel;
        }

        public static c4h write(heatLevel heatlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (heatlevel.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(heatlevel.number.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public heatLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
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

    public MultifunctionCookingPot() {
    }

    public static MultifunctionCookingPot read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MultifunctionCookingPot multifunctionCookingPot = new MultifunctionCookingPot(IntentUtils.readEntityType(zsdVar, AIApiConstants.MultifunctionCookingPot.NAME, optional));
        if (zsdVar.z("device")) {
            multifunctionCookingPot.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            multifunctionCookingPot.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            multifunctionCookingPot.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            multifunctionCookingPot.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            multifunctionCookingPot.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            multifunctionCookingPot.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            multifunctionCookingPot.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return multifunctionCookingPot;
    }

    public static zsd write(MultifunctionCookingPot multifunctionCookingPot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(multifunctionCookingPot.entity_type);
        if (multifunctionCookingPot.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(multifunctionCookingPot.device.b()));
        }
        if (multifunctionCookingPot.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(multifunctionCookingPot.room.b()));
        }
        if (multifunctionCookingPot.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(multifunctionCookingPot.is_all_to_operate.b()));
        }
        if (multifunctionCookingPot.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(multifunctionCookingPot.sub_category.b()));
        }
        if (multifunctionCookingPot.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(multifunctionCookingPot.service_entity.b()));
        }
        if (multifunctionCookingPot.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(multifunctionCookingPot.description.b()));
        }
        if (multifunctionCookingPot.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(multifunctionCookingPot.timing.b()));
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

    public MultifunctionCookingPot setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public MultifunctionCookingPot setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public MultifunctionCookingPot setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MultifunctionCookingPot setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public MultifunctionCookingPot setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public MultifunctionCookingPot setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public MultifunctionCookingPot setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public MultifunctionCookingPot setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public MultifunctionCookingPot(T t) {
        this.entity_type = t;
    }
}
