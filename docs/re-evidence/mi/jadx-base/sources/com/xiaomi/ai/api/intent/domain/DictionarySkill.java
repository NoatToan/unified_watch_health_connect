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
public class DictionarySkill<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class idiomSolitaire implements EntityType {

        @Required
        private Slot<Integer> correct_num;

        @Required
        private Slot<String> history_idioms;

        @Required
        private Slot<String> idiom;

        @Required
        private Slot<Integer> pass_num;

        @Required
        private Slot<String> user_action;

        public idiomSolitaire() {
        }

        public idiomSolitaire(Slot<String> slot, Slot<Integer> slot2, Slot<Integer> slot3, Slot<String> slot4, Slot<String> slot5) {
            this.idiom = slot;
            this.correct_num = slot2;
            this.pass_num = slot3;
            this.history_idioms = slot4;
            this.user_action = slot5;
        }

        public static idiomSolitaire read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            idiomSolitaire idiomsolitaire = new idiomSolitaire();
            idiomsolitaire.setIdiom(IntentUtils.readSlot(zsdVar.w("idiom"), String.class));
            idiomsolitaire.setCorrectNum(IntentUtils.readSlot(zsdVar.w("correct_num"), Integer.class));
            idiomsolitaire.setPassNum(IntentUtils.readSlot(zsdVar.w("pass_num"), Integer.class));
            idiomsolitaire.setHistoryIdioms(IntentUtils.readSlot(zsdVar.w("history_idioms"), String.class));
            idiomsolitaire.setUserAction(IntentUtils.readSlot(zsdVar.w("user_action"), String.class));
            return idiomsolitaire;
        }

        public static c4h write(idiomSolitaire idiomsolitaire) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("idiom", IntentUtils.writeSlot(idiomsolitaire.idiom));
            c4hVarCreateObjectNode.f0("correct_num", IntentUtils.writeSlot(idiomsolitaire.correct_num));
            c4hVarCreateObjectNode.f0("pass_num", IntentUtils.writeSlot(idiomsolitaire.pass_num));
            c4hVarCreateObjectNode.f0("history_idioms", IntentUtils.writeSlot(idiomsolitaire.history_idioms));
            c4hVarCreateObjectNode.f0("user_action", IntentUtils.writeSlot(idiomsolitaire.user_action));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getCorrectNum() {
            return this.correct_num;
        }

        @Required
        public Slot<String> getHistoryIdioms() {
            return this.history_idioms;
        }

        @Required
        public Slot<String> getIdiom() {
            return this.idiom;
        }

        @Required
        public Slot<Integer> getPassNum() {
            return this.pass_num;
        }

        @Required
        public Slot<String> getUserAction() {
            return this.user_action;
        }

        @Required
        public idiomSolitaire setCorrectNum(Slot<Integer> slot) {
            this.correct_num = slot;
            return this;
        }

        @Required
        public idiomSolitaire setHistoryIdioms(Slot<String> slot) {
            this.history_idioms = slot;
            return this;
        }

        @Required
        public idiomSolitaire setIdiom(Slot<String> slot) {
            this.idiom = slot;
            return this;
        }

        @Required
        public idiomSolitaire setPassNum(Slot<Integer> slot) {
            this.pass_num = slot;
            return this;
        }

        @Required
        public idiomSolitaire setUserAction(Slot<String> slot) {
            this.user_action = slot;
            return this;
        }
    }

    public DictionarySkill() {
    }

    public static DictionarySkill read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new DictionarySkill(IntentUtils.readEntityType(zsdVar, AIApiConstants.DictionarySkill.NAME, optional));
    }

    public static zsd write(DictionarySkill dictionarySkill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(dictionarySkill.entity_type);
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
    public DictionarySkill setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DictionarySkill(T t) {
        this.entity_type = t;
    }
}
