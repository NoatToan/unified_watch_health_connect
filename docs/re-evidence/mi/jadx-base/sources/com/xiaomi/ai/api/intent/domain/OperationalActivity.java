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
public class OperationalActivity<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> type;

    public static class bonus implements EntityType {
        public static bonus read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new bonus();
        }

        public static c4h write(bonus bonusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class hotSpot implements EntityType {
        public static hotSpot read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new hotSpot();
        }

        public static c4h write(hotSpot hotspot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class llm implements EntityType {
        public static llm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new llm();
        }

        public static c4h write(llm llmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class push implements EntityType {
        public static push read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new push();
        }

        public static c4h write(push pushVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public OperationalActivity() {
    }

    public static OperationalActivity read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        OperationalActivity operationalActivity = new OperationalActivity(IntentUtils.readEntityType(zsdVar, AIApiConstants.OperationalActivity.NAME, optional));
        operationalActivity.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        return operationalActivity;
    }

    public static zsd write(OperationalActivity operationalActivity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(operationalActivity.entity_type);
        c4hVar.f0("type", IntentUtils.writeSlot(operationalActivity.type));
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
    public Slot<String> getType() {
        return this.type;
    }

    @Required
    public OperationalActivity setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public OperationalActivity setType(Slot<String> slot) {
        this.type = slot;
        return this;
    }

    public OperationalActivity(T t) {
        this.entity_type = t;
    }

    public OperationalActivity(T t, Slot<String> slot) {
        this.entity_type = t;
        this.type = slot;
    }
}
