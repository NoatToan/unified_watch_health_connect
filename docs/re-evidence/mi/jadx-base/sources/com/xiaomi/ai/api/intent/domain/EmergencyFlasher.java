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
public class EmergencyFlasher<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class brightness implements EntityType {

        @Required
        private Slot<Integer> value;

        public brightness() {
        }

        public brightness(Slot<Integer> slot) {
            this.value = slot;
        }

        public static brightness read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            brightness brightnessVar = new brightness();
            brightnessVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            return brightnessVar;
        }

        public static c4h write(brightness brightnessVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(brightnessVar.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getValue() {
            return this.value;
        }

        @Required
        public brightness setValue(Slot<Integer> slot) {
            this.value = slot;
            return this;
        }
    }

    public static class brightnessLevel implements EntityType {

        @Required
        private Slot<Integer> value;

        public brightnessLevel() {
        }

        public brightnessLevel(Slot<Integer> slot) {
            this.value = slot;
        }

        public static brightnessLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            brightnessLevel brightnesslevel = new brightnessLevel();
            brightnesslevel.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            return brightnesslevel;
        }

        public static c4h write(brightnessLevel brightnesslevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(brightnesslevel.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getValue() {
            return this.value;
        }

        @Required
        public brightnessLevel setValue(Slot<Integer> slot) {
            this.value = slot;
            return this;
        }
    }

    public EmergencyFlasher() {
    }

    public static EmergencyFlasher read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new EmergencyFlasher(IntentUtils.readEntityType(zsdVar, AIApiConstants.EmergencyFlasher.NAME, optional));
    }

    public static zsd write(EmergencyFlasher emergencyFlasher) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(emergencyFlasher.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public EmergencyFlasher setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public EmergencyFlasher(T t) {
        this.entity_type = t;
    }
}
