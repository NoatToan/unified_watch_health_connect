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
public class MedicalKnowledge<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class questionAnswer implements EntityType {

        @Required
        private Slot<String> name;

        public questionAnswer() {
        }

        public questionAnswer(Slot<String> slot) {
            this.name = slot;
        }

        public static questionAnswer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            questionAnswer questionanswer = new questionAnswer();
            questionanswer.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return questionanswer;
        }

        public static c4h write(questionAnswer questionanswer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(questionanswer.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public questionAnswer setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public MedicalKnowledge() {
    }

    public static MedicalKnowledge read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new MedicalKnowledge(IntentUtils.readEntityType(zsdVar, AIApiConstants.MedicalKnowledge.NAME, optional));
    }

    public static zsd write(MedicalKnowledge medicalKnowledge) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(medicalKnowledge.entity_type);
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
    public MedicalKnowledge setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MedicalKnowledge(T t) {
        this.entity_type = t;
    }
}
