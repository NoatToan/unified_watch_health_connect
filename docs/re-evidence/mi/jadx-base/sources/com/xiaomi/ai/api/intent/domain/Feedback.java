package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.service.DKFRequestService;
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
public class Feedback<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum SatisfactionEvaluationResult {
        LIKE(0, "LIKE"),
        DISLIKE(1, "DISLIKE"),
        OTHER(2, DKFRequestService.a.d);

        private int id;
        private String name;

        SatisfactionEvaluationResult(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SatisfactionEvaluationResult find(String str) {
            for (SatisfactionEvaluationResult satisfactionEvaluationResult : values()) {
                if (satisfactionEvaluationResult.name.equals(str)) {
                    return satisfactionEvaluationResult;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SatisfactionEvaluationResult read(String str) {
            return find(str);
        }

        public static String write(SatisfactionEvaluationResult satisfactionEvaluationResult) {
            return satisfactionEvaluationResult.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class active implements EntityType {
        public static active read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new active();
        }

        public static c4h write(active activeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class chat implements EntityType {
        public static chat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new chat();
        }

        public static c4h write(chat chatVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class defect implements EntityType {
        public static defect read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new defect();
        }

        public static c4h write(defect defectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class evaluation implements EntityType {
        public static evaluation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new evaluation();
        }

        public static c4h write(evaluation evaluationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class swear implements EntityType {
        public static swear read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new swear();
        }

        public static c4h write(swear swearVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Feedback() {
    }

    public static Feedback read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Feedback(IntentUtils.readEntityType(zsdVar, AIApiConstants.Feedback.NAME, optional));
    }

    public static zsd write(Feedback feedback) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(feedback.entity_type);
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
    public Feedback setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public static class satisfactionEvaluation implements EntityType {
        private Optional<Slot<SatisfactionEvaluationResult>> result = Optional.a();

        @Required
        private Slot<String> source;

        public satisfactionEvaluation() {
        }

        public static satisfactionEvaluation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            satisfactionEvaluation satisfactionevaluation = new satisfactionEvaluation();
            satisfactionevaluation.setSource(IntentUtils.readSlot(zsdVar.w("source"), String.class));
            if (zsdVar.z("result")) {
                satisfactionevaluation.setResult(IntentUtils.readSlot(zsdVar.w("result"), SatisfactionEvaluationResult.class));
            }
            return satisfactionevaluation;
        }

        public static c4h write(satisfactionEvaluation satisfactionevaluation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("source", IntentUtils.writeSlot(satisfactionevaluation.source));
            if (satisfactionevaluation.result.c()) {
                c4hVarCreateObjectNode.f0("result", IntentUtils.writeSlot(satisfactionevaluation.result.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<SatisfactionEvaluationResult>> getResult() {
            return this.result;
        }

        @Required
        public Slot<String> getSource() {
            return this.source;
        }

        public satisfactionEvaluation setResult(Slot<SatisfactionEvaluationResult> slot) {
            this.result = Optional.e(slot);
            return this;
        }

        @Required
        public satisfactionEvaluation setSource(Slot<String> slot) {
            this.source = slot;
            return this;
        }

        public satisfactionEvaluation(Slot<String> slot) {
            this.source = slot;
        }
    }

    public Feedback(T t) {
        this.entity_type = t;
    }
}
