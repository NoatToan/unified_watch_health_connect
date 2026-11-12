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
public class Garbage<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> attribute;

    @Required
    private Slot<String> entity;

    @Required
    private T entity_type;

    public static class classification implements EntityType {
        public static classification read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new classification();
        }

        public static c4h write(classification classificationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class introduction implements EntityType {
        public static introduction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new introduction();
        }

        public static c4h write(introduction introductionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Garbage() {
    }

    public static Garbage read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Garbage garbage = new Garbage(IntentUtils.readEntityType(zsdVar, AIApiConstants.Garbage.NAME, optional));
        garbage.setEntity(IntentUtils.readSlot(zsdVar.w("entity"), String.class));
        garbage.setAttribute(IntentUtils.readSlot(zsdVar.w("attribute"), String.class));
        return garbage;
    }

    public static zsd write(Garbage garbage) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(garbage.entity_type);
        c4hVar.f0("entity", IntentUtils.writeSlot(garbage.entity));
        c4hVar.f0("attribute", IntentUtils.writeSlot(garbage.attribute));
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getAttribute() {
        return this.attribute;
    }

    @Required
    public Slot<String> getEntity() {
        return this.entity;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Garbage setAttribute(Slot<String> slot) {
        this.attribute = slot;
        return this;
    }

    @Required
    public Garbage setEntity(Slot<String> slot) {
        this.entity = slot;
        return this;
    }

    @Required
    public Garbage setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Garbage(T t) {
        this.entity_type = t;
    }

    public Garbage(T t, Slot<String> slot, Slot<String> slot2) {
        this.entity_type = t;
        this.entity = slot;
        this.attribute = slot2;
    }
}
