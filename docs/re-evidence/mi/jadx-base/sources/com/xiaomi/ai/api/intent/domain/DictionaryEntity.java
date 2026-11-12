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
public class DictionaryEntity<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> regex = Optional.a();
    private Optional<Slot<String>> dictionary_type = Optional.a();
    private Optional<Slot<String>> query_pinyin = Optional.a();
    private Optional<Slot<String>> property = Optional.a();
    private Optional<Slot<String>> entity_transform = Optional.a();
    private Optional<Slot<String>> prefix = Optional.a();

    public static class chineseIdiom implements EntityType {
        public static chineseIdiom read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new chineseIdiom();
        }

        public static c4h write(chineseIdiom chineseidiom) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class frame implements EntityType {

        @Required
        private Slot<String> name;

        public frame() {
        }

        public frame(Slot<String> slot) {
            this.name = slot;
        }

        public static frame read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            frame frameVar = new frame();
            frameVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return frameVar;
        }

        public static c4h write(frame frameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(frameVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public frame setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class idiomCompletion implements EntityType {
        public static idiomCompletion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new idiomCompletion();
        }

        public static c4h write(idiomCompletion idiomcompletion) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class includeAntonym implements EntityType {
        public static includeAntonym read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new includeAntonym();
        }

        public static c4h write(includeAntonym includeantonym) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class includeNumber implements EntityType {
        public static includeNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new includeNumber();
        }

        public static c4h write(includeNumber includenumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class includeSynonym implements EntityType {
        public static includeSynonym read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new includeSynonym();
        }

        public static c4h write(includeSynonym includesynonym) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class includeXInXY implements EntityType {
        public static includeXInXY read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new includeXInXY();
        }

        public static c4h write(includeXInXY includexinxy) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class includeXY implements EntityType {
        public static includeXY read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new includeXY();
        }

        public static c4h write(includeXY includexy) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class includeXnY implements EntityType {
        public static includeXnY read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new includeXnY();
        }

        public static c4h write(includeXnY includexny) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class portion implements EntityType {

        @Required
        private Slot<String> name;

        public portion() {
        }

        public portion(Slot<String> slot) {
            this.name = slot;
        }

        public static portion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            portion portionVar = new portion();
            portionVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return portionVar;
        }

        public static c4h write(portion portionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(portionVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public portion setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class positionX implements EntityType {
        public static positionX read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new positionX();
        }

        public static c4h write(positionX positionx) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class radical implements EntityType {

        @Required
        private Slot<String> name;

        public radical() {
        }

        public radical(Slot<String> slot) {
            this.name = slot;
        }

        public static radical read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            radical radicalVar = new radical();
            radicalVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return radicalVar;
        }

        public static c4h write(radical radicalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(radicalVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public radical setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class relatedWordsGroupSentence implements EntityType {

        @Required
        private Slot<String> name;

        public relatedWordsGroupSentence() {
        }

        public relatedWordsGroupSentence(Slot<String> slot) {
            this.name = slot;
        }

        public static relatedWordsGroupSentence read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            relatedWordsGroupSentence relatedwordsgroupsentence = new relatedWordsGroupSentence();
            relatedwordsgroupsentence.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return relatedwordsgroupsentence;
        }

        public static c4h write(relatedWordsGroupSentence relatedwordsgroupsentence) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(relatedwordsgroupsentence.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public relatedWordsGroupSentence setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class structure implements EntityType {
        public static structure read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new structure();
        }

        public static c4h write(structure structureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tag implements EntityType {

        @Required
        private Slot<String> name;

        public tag() {
        }

        public tag(Slot<String> slot) {
            this.name = slot;
        }

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            tagVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tagVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public tag setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public DictionaryEntity() {
    }

    public static DictionaryEntity read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DictionaryEntity dictionaryEntity = new DictionaryEntity(IntentUtils.readEntityType(zsdVar, AIApiConstants.DictionaryEntity.NAME, optional));
        if (zsdVar.z("regex")) {
            dictionaryEntity.setRegex(IntentUtils.readSlot(zsdVar.w("regex"), String.class));
        }
        if (zsdVar.z("dictionary_type")) {
            dictionaryEntity.setDictionaryType(IntentUtils.readSlot(zsdVar.w("dictionary_type"), String.class));
        }
        if (zsdVar.z("query_pinyin")) {
            dictionaryEntity.setQueryPinyin(IntentUtils.readSlot(zsdVar.w("query_pinyin"), String.class));
        }
        if (zsdVar.z("property")) {
            dictionaryEntity.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
        }
        if (zsdVar.z("entity_transform")) {
            dictionaryEntity.setEntityTransform(IntentUtils.readSlot(zsdVar.w("entity_transform"), String.class));
        }
        if (zsdVar.z("prefix")) {
            dictionaryEntity.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
        }
        return dictionaryEntity;
    }

    public static zsd write(DictionaryEntity dictionaryEntity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(dictionaryEntity.entity_type);
        if (dictionaryEntity.regex.c()) {
            c4hVar.f0("regex", IntentUtils.writeSlot(dictionaryEntity.regex.b()));
        }
        if (dictionaryEntity.dictionary_type.c()) {
            c4hVar.f0("dictionary_type", IntentUtils.writeSlot(dictionaryEntity.dictionary_type.b()));
        }
        if (dictionaryEntity.query_pinyin.c()) {
            c4hVar.f0("query_pinyin", IntentUtils.writeSlot(dictionaryEntity.query_pinyin.b()));
        }
        if (dictionaryEntity.property.c()) {
            c4hVar.f0("property", IntentUtils.writeSlot(dictionaryEntity.property.b()));
        }
        if (dictionaryEntity.entity_transform.c()) {
            c4hVar.f0("entity_transform", IntentUtils.writeSlot(dictionaryEntity.entity_transform.b()));
        }
        if (dictionaryEntity.prefix.c()) {
            c4hVar.f0("prefix", IntentUtils.writeSlot(dictionaryEntity.prefix.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDictionaryType() {
        return this.dictionary_type;
    }

    public Optional<Slot<String>> getEntityTransform() {
        return this.entity_transform;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getPrefix() {
        return this.prefix;
    }

    public Optional<Slot<String>> getProperty() {
        return this.property;
    }

    public Optional<Slot<String>> getQueryPinyin() {
        return this.query_pinyin;
    }

    public Optional<Slot<String>> getRegex() {
        return this.regex;
    }

    public DictionaryEntity setDictionaryType(Slot<String> slot) {
        this.dictionary_type = Optional.e(slot);
        return this;
    }

    public DictionaryEntity setEntityTransform(Slot<String> slot) {
        this.entity_transform = Optional.e(slot);
        return this;
    }

    @Required
    public DictionaryEntity setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DictionaryEntity setPrefix(Slot<String> slot) {
        this.prefix = Optional.e(slot);
        return this;
    }

    public DictionaryEntity setProperty(Slot<String> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public DictionaryEntity setQueryPinyin(Slot<String> slot) {
        this.query_pinyin = Optional.e(slot);
        return this;
    }

    public DictionaryEntity setRegex(Slot<String> slot) {
        this.regex = Optional.e(slot);
        return this;
    }

    public DictionaryEntity(T t) {
        this.entity_type = t;
    }
}
