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
public class HealthySport<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;

    public static class momInfant implements EntityType {

        @Required
        private Slot<String> status;

        public momInfant() {
        }

        public momInfant(Slot<String> slot) {
            this.status = slot;
        }

        public static momInfant read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            momInfant mominfant = new momInfant();
            mominfant.setStatus(IntentUtils.readSlot(zsdVar.w("status"), String.class));
            return mominfant;
        }

        public static c4h write(momInfant mominfant) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("status", IntentUtils.writeSlot(mominfant.status));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getStatus() {
            return this.status;
        }

        @Required
        public momInfant setStatus(Slot<String> slot) {
            this.status = slot;
            return this;
        }
    }

    public HealthySport() {
    }

    public static HealthySport read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        HealthySport healthySport = new HealthySport(IntentUtils.readEntityType(zsdVar, AIApiConstants.HealthySport.NAME, optional));
        healthySport.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        return healthySport;
    }

    public static zsd write(HealthySport healthySport) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(healthySport.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(healthySport.name));
        return c4hVar;
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
    public Slot<String> getName() {
        return this.name;
    }

    @Required
    public HealthySport setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public HealthySport setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public HealthySport(T t) {
        this.entity_type = t;
    }

    public HealthySport(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
