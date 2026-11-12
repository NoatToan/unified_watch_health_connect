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
public class Translation<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> source_language = Optional.a();
    private Optional<Slot<String>> target_language = Optional.a();

    @Required
    private Slot<String> word;

    public enum MorphologyType {
        Plural(1, "Plural"),
        Done(2, "Done"),
        Past(3, "Past"),
        Ing(4, "Ing"),
        Adj(5, "Adj"),
        Conn(6, "Conn"),
        Adv(7, "Adv"),
        Noun(8, "Noun"),
        Third(9, "Third"),
        Verb(10, "Verb"),
        Prep(11, "Prep"),
        Er(12, "Er"),
        Est(13, "Est"),
        Synonym(14, "Synonym"),
        Antonym(15, "Antonym");

        private int id;
        private String name;

        MorphologyType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MorphologyType find(String str) {
            for (MorphologyType morphologyType : values()) {
                if (morphologyType.name.equals(str)) {
                    return morphologyType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MorphologyType read(String str) {
            return find(str);
        }

        public static String write(MorphologyType morphologyType) {
            return morphologyType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class aiSubtitle implements EntityType {
        public static aiSubtitle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new aiSubtitle();
        }

        public static c4h write(aiSubtitle aisubtitle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dialogTranslation implements EntityType {

        @Required
        private Slot<Integer> round;

        @Required
        private Slot<Long> time_gap;

        public dialogTranslation() {
        }

        public dialogTranslation(Slot<Long> slot, Slot<Integer> slot2) {
            this.time_gap = slot;
            this.round = slot2;
        }

        public static dialogTranslation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            dialogTranslation dialogtranslation = new dialogTranslation();
            dialogtranslation.setTimeGap(IntentUtils.readSlot(zsdVar.w("time_gap"), Long.class));
            dialogtranslation.setRound(IntentUtils.readSlot(zsdVar.w("round"), Integer.class));
            return dialogtranslation;
        }

        public static c4h write(dialogTranslation dialogtranslation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("time_gap", IntentUtils.writeSlot(dialogtranslation.time_gap));
            c4hVarCreateObjectNode.f0("round", IntentUtils.writeSlot(dialogtranslation.round));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getRound() {
            return this.round;
        }

        @Required
        public Slot<Long> getTimeGap() {
            return this.time_gap;
        }

        @Required
        public dialogTranslation setRound(Slot<Integer> slot) {
            this.round = slot;
            return this;
        }

        @Required
        public dialogTranslation setTimeGap(Slot<Long> slot) {
            this.time_gap = slot;
            return this;
        }
    }

    public static class morphology implements EntityType {

        @Required
        private Slot<MorphologyType> name;

        public morphology() {
        }

        public morphology(Slot<MorphologyType> slot) {
            this.name = slot;
        }

        public static morphology read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            morphology morphologyVar = new morphology();
            morphologyVar.setName(IntentUtils.readSlot(zsdVar.w("name"), MorphologyType.class));
            return morphologyVar;
        }

        public static c4h write(morphology morphologyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(morphologyVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<MorphologyType> getName() {
            return this.name;
        }

        @Required
        public morphology setName(Slot<MorphologyType> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class screen implements EntityType {
        public static screen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new screen();
        }

        public static c4h write(screen screenVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class simultaneous implements EntityType {
        public static simultaneous read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new simultaneous();
        }

        public static c4h write(simultaneous simultaneousVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class wordSpelling implements EntityType {
        public static wordSpelling read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new wordSpelling();
        }

        public static c4h write(wordSpelling wordspelling) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Translation() {
    }

    public static Translation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Translation translation = new Translation(IntentUtils.readEntityType(zsdVar, AIApiConstants.Translation.NAME, optional));
        translation.setWord(IntentUtils.readSlot(zsdVar.w("word"), String.class));
        if (zsdVar.z("source_language")) {
            translation.setSourceLanguage(IntentUtils.readSlot(zsdVar.w("source_language"), String.class));
        }
        if (zsdVar.z("target_language")) {
            translation.setTargetLanguage(IntentUtils.readSlot(zsdVar.w("target_language"), String.class));
        }
        return translation;
    }

    public static zsd write(Translation translation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(translation.entity_type);
        c4hVar.f0("word", IntentUtils.writeSlot(translation.word));
        if (translation.source_language.c()) {
            c4hVar.f0("source_language", IntentUtils.writeSlot(translation.source_language.b()));
        }
        if (translation.target_language.c()) {
            c4hVar.f0("target_language", IntentUtils.writeSlot(translation.target_language.b()));
        }
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

    public Optional<Slot<String>> getSourceLanguage() {
        return this.source_language;
    }

    public Optional<Slot<String>> getTargetLanguage() {
        return this.target_language;
    }

    @Required
    public Slot<String> getWord() {
        return this.word;
    }

    @Required
    public Translation setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Translation setSourceLanguage(Slot<String> slot) {
        this.source_language = Optional.e(slot);
        return this;
    }

    public Translation setTargetLanguage(Slot<String> slot) {
        this.target_language = Optional.e(slot);
        return this;
    }

    @Required
    public Translation setWord(Slot<String> slot) {
        this.word = slot;
        return this;
    }

    public Translation(T t) {
        this.entity_type = t;
    }

    public Translation(T t, Slot<String> slot) {
        this.entity_type = t;
        this.word = slot;
    }
}
