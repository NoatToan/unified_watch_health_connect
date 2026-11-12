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
public class PoemSkill<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public PoemSkill() {
    }

    public static PoemSkill read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new PoemSkill(IntentUtils.readEntityType(zsdVar, AIApiConstants.PoemSkill.NAME, optional));
    }

    public static zsd write(PoemSkill poemSkill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(poemSkill.entity_type);
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
    public PoemSkill setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public static class flyingFlowerOrder implements EntityType {

        @Required
        private Slot<Integer> correctNum;

        @Required
        private Slot<String> historyVerses;

        @Required
        private Slot<String> key;
        private Optional<Slot<Integer>> outVerseNum = Optional.a();

        @Required
        private Slot<Integer> passNum;

        @Required
        private Slot<Integer> promptNum;

        @Required
        private Slot<String> userAction;

        @Required
        private Slot<String> verse;

        public flyingFlowerOrder() {
        }

        public static flyingFlowerOrder read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            flyingFlowerOrder flyingflowerorder = new flyingFlowerOrder();
            flyingflowerorder.setKey(IntentUtils.readSlot(zsdVar.w("key"), String.class));
            flyingflowerorder.setVerse(IntentUtils.readSlot(zsdVar.w("verse"), String.class));
            flyingflowerorder.setCorrectNum(IntentUtils.readSlot(zsdVar.w("correctNum"), Integer.class));
            flyingflowerorder.setPromptNum(IntentUtils.readSlot(zsdVar.w("promptNum"), Integer.class));
            flyingflowerorder.setPassNum(IntentUtils.readSlot(zsdVar.w("passNum"), Integer.class));
            flyingflowerorder.setHistoryVerses(IntentUtils.readSlot(zsdVar.w("historyVerses"), String.class));
            flyingflowerorder.setUserAction(IntentUtils.readSlot(zsdVar.w("userAction"), String.class));
            if (zsdVar.z("outVerseNum")) {
                flyingflowerorder.setOutVerseNum(IntentUtils.readSlot(zsdVar.w("outVerseNum"), Integer.class));
            }
            return flyingflowerorder;
        }

        public static c4h write(flyingFlowerOrder flyingflowerorder) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("key", IntentUtils.writeSlot(flyingflowerorder.key));
            c4hVarCreateObjectNode.f0("verse", IntentUtils.writeSlot(flyingflowerorder.verse));
            c4hVarCreateObjectNode.f0("correctNum", IntentUtils.writeSlot(flyingflowerorder.correctNum));
            c4hVarCreateObjectNode.f0("promptNum", IntentUtils.writeSlot(flyingflowerorder.promptNum));
            c4hVarCreateObjectNode.f0("passNum", IntentUtils.writeSlot(flyingflowerorder.passNum));
            c4hVarCreateObjectNode.f0("historyVerses", IntentUtils.writeSlot(flyingflowerorder.historyVerses));
            c4hVarCreateObjectNode.f0("userAction", IntentUtils.writeSlot(flyingflowerorder.userAction));
            if (flyingflowerorder.outVerseNum.c()) {
                c4hVarCreateObjectNode.f0("outVerseNum", IntentUtils.writeSlot(flyingflowerorder.outVerseNum.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getCorrectNum() {
            return this.correctNum;
        }

        @Required
        public Slot<String> getHistoryVerses() {
            return this.historyVerses;
        }

        @Required
        public Slot<String> getKey() {
            return this.key;
        }

        public Optional<Slot<Integer>> getOutVerseNum() {
            return this.outVerseNum;
        }

        @Required
        public Slot<Integer> getPassNum() {
            return this.passNum;
        }

        @Required
        public Slot<Integer> getPromptNum() {
            return this.promptNum;
        }

        @Required
        public Slot<String> getUserAction() {
            return this.userAction;
        }

        @Required
        public Slot<String> getVerse() {
            return this.verse;
        }

        @Required
        public flyingFlowerOrder setCorrectNum(Slot<Integer> slot) {
            this.correctNum = slot;
            return this;
        }

        @Required
        public flyingFlowerOrder setHistoryVerses(Slot<String> slot) {
            this.historyVerses = slot;
            return this;
        }

        @Required
        public flyingFlowerOrder setKey(Slot<String> slot) {
            this.key = slot;
            return this;
        }

        public flyingFlowerOrder setOutVerseNum(Slot<Integer> slot) {
            this.outVerseNum = Optional.e(slot);
            return this;
        }

        @Required
        public flyingFlowerOrder setPassNum(Slot<Integer> slot) {
            this.passNum = slot;
            return this;
        }

        @Required
        public flyingFlowerOrder setPromptNum(Slot<Integer> slot) {
            this.promptNum = slot;
            return this;
        }

        @Required
        public flyingFlowerOrder setUserAction(Slot<String> slot) {
            this.userAction = slot;
            return this;
        }

        @Required
        public flyingFlowerOrder setVerse(Slot<String> slot) {
            this.verse = slot;
            return this;
        }

        public flyingFlowerOrder(Slot<String> slot, Slot<String> slot2, Slot<Integer> slot3, Slot<Integer> slot4, Slot<Integer> slot5, Slot<String> slot6, Slot<String> slot7) {
            this.key = slot;
            this.verse = slot2;
            this.correctNum = slot3;
            this.promptNum = slot4;
            this.passNum = slot5;
            this.historyVerses = slot6;
            this.userAction = slot7;
        }
    }

    public PoemSkill(T t) {
        this.entity_type = t;
    }
}
