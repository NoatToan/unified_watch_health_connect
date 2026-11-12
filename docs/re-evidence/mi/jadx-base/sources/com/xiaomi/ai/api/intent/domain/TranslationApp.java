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
public class TranslationApp<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> source_language = Optional.a();
    private Optional<Slot<String>> target_language = Optional.a();

    public static class dailyEnglish implements EntityType {
        public static dailyEnglish read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dailyEnglish();
        }

        public static c4h write(dailyEnglish dailyenglish) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class guide implements EntityType {

        @Required
        private Slot<String> target_language;

        public guide() {
        }

        public guide(Slot<String> slot) {
            this.target_language = slot;
        }

        public static guide read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            guide guideVar = new guide();
            guideVar.setTargetLanguage(IntentUtils.readSlot(zsdVar.w("target_language"), String.class));
            return guideVar;
        }

        public static c4h write(guide guideVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("target_language", IntentUtils.writeSlot(guideVar.target_language));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getTargetLanguage() {
            return this.target_language;
        }

        @Required
        public guide setTargetLanguage(Slot<String> slot) {
            this.target_language = slot;
            return this;
        }
    }

    public TranslationApp() {
    }

    public static TranslationApp read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TranslationApp translationApp = new TranslationApp(IntentUtils.readEntityType(zsdVar, AIApiConstants.TranslationApp.NAME, optional));
        if (zsdVar.z("source_language")) {
            translationApp.setSourceLanguage(IntentUtils.readSlot(zsdVar.w("source_language"), String.class));
        }
        if (zsdVar.z("target_language")) {
            translationApp.setTargetLanguage(IntentUtils.readSlot(zsdVar.w("target_language"), String.class));
        }
        return translationApp;
    }

    public static zsd write(TranslationApp translationApp) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(translationApp.entity_type);
        if (translationApp.source_language.c()) {
            c4hVar.f0("source_language", IntentUtils.writeSlot(translationApp.source_language.b()));
        }
        if (translationApp.target_language.c()) {
            c4hVar.f0("target_language", IntentUtils.writeSlot(translationApp.target_language.b()));
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
    public TranslationApp setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TranslationApp setSourceLanguage(Slot<String> slot) {
        this.source_language = Optional.e(slot);
        return this;
    }

    public TranslationApp setTargetLanguage(Slot<String> slot) {
        this.target_language = Optional.e(slot);
        return this;
    }

    public TranslationApp(T t) {
        this.entity_type = t;
    }
}
