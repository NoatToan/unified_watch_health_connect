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
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class VerseInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> content;

    @Required
    private T entity_type;
    private Optional<Slot<String>> poet = Optional.a();
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> dynasty = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> property = Optional.a();

    public static class appreciation implements EntityType {
        public static appreciation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new appreciation();
        }

        public static c4h write(appreciation appreciationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dynasty implements EntityType {
        public static dynasty read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dynasty();
        }

        public static c4h write(dynasty dynastyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class meaning implements EntityType {
        public static meaning read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new meaning();
        }

        public static c4h write(meaning meaningVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class name implements EntityType {
        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new name();
        }

        public static c4h write(name nameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class next implements EntityType {
        public static next read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new next();
        }

        public static c4h write(next nextVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class poet implements EntityType {
        public static poet read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new poet();
        }

        public static c4h write(poet poetVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class previous implements EntityType {
        public static previous read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new previous();
        }

        public static c4h write(previous previousVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class wordsNotes implements EntityType {

        @Required
        private Slot<String> name;

        public wordsNotes() {
        }

        public wordsNotes(Slot<String> slot) {
            this.name = slot;
        }

        public static wordsNotes read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            wordsNotes wordsnotes = new wordsNotes();
            wordsnotes.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return wordsnotes;
        }

        public static c4h write(wordsNotes wordsnotes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(wordsnotes.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public wordsNotes setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public VerseInfo() {
    }

    public static VerseInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VerseInfo verseInfo = new VerseInfo(IntentUtils.readEntityType(zsdVar, AIApiConstants.VerseInfo.NAME, optional));
        verseInfo.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        if (zsdVar.z("poet")) {
            verseInfo.setPoet(IntentUtils.readSlot(zsdVar.w("poet"), String.class));
        }
        if (zsdVar.z("name")) {
            verseInfo.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("dynasty")) {
            verseInfo.setDynasty(IntentUtils.readSlot(zsdVar.w("dynasty"), String.class));
        }
        if (zsdVar.z("type")) {
            verseInfo.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("property")) {
            verseInfo.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
        }
        return verseInfo;
    }

    public static zsd write(VerseInfo verseInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(verseInfo.entity_type);
        c4hVar.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(verseInfo.content));
        if (verseInfo.poet.c()) {
            c4hVar.f0("poet", IntentUtils.writeSlot(verseInfo.poet.b()));
        }
        if (verseInfo.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(verseInfo.name.b()));
        }
        if (verseInfo.dynasty.c()) {
            c4hVar.f0("dynasty", IntentUtils.writeSlot(verseInfo.dynasty.b()));
        }
        if (verseInfo.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(verseInfo.type.b()));
        }
        if (verseInfo.property.c()) {
            c4hVar.f0("property", IntentUtils.writeSlot(verseInfo.property.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getContent() {
        return this.content;
    }

    public Optional<Slot<String>> getDynasty() {
        return this.dynasty;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPoet() {
        return this.poet;
    }

    public Optional<Slot<String>> getProperty() {
        return this.property;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    @Required
    public VerseInfo setContent(Slot<String> slot) {
        this.content = slot;
        return this;
    }

    public VerseInfo setDynasty(Slot<String> slot) {
        this.dynasty = Optional.e(slot);
        return this;
    }

    @Required
    public VerseInfo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VerseInfo setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public VerseInfo setPoet(Slot<String> slot) {
        this.poet = Optional.e(slot);
        return this;
    }

    public VerseInfo setProperty(Slot<String> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public VerseInfo setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public VerseInfo(T t) {
        this.entity_type = t;
    }

    public VerseInfo(T t, Slot<String> slot) {
        this.entity_type = t;
        this.content = slot;
    }
}
