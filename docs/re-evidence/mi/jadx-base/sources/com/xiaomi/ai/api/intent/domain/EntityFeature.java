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
public class EntityFeature<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> dictionary_type = Optional.a();
    private Optional<Slot<String>> prefix = Optional.a();
    private Optional<Slot<String>> entity_pinyin = Optional.a();
    private Optional<Slot<String>> query_pinyin = Optional.a();
    private Optional<Slot<String>> property = Optional.a();
    private Optional<Slot<String>> entity_transform = Optional.a();

    public static class antonym implements EntityType {
        public static antonym read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new antonym();
        }

        public static c4h write(antonym antonymVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class emotionalColor implements EntityType {
        public static emotionalColor read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new emotionalColor();
        }

        public static c4h write(emotionalColor emotionalcolor) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class groupSentence implements EntityType {
        public static groupSentence read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new groupSentence();
        }

        public static c4h write(groupSentence groupsentence) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class groupWords implements EntityType {
        private Optional<Slot<String>> prefix = Optional.a();

        public static groupWords read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            groupWords groupwords = new groupWords();
            if (zsdVar.z("prefix")) {
                groupwords.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
            }
            return groupwords;
        }

        public static c4h write(groupWords groupwords) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (groupwords.prefix.c()) {
                c4hVarCreateObjectNode.f0("prefix", IntentUtils.writeSlot(groupwords.prefix.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getPrefix() {
            return this.prefix;
        }

        public groupWords setPrefix(Slot<String> slot) {
            this.prefix = Optional.e(slot);
            return this;
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

    public static class modifier implements EntityType {
        public static modifier read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new modifier();
        }

        public static c4h write(modifier modifierVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class pinyin implements EntityType {
        public static pinyin read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pinyin();
        }

        public static c4h write(pinyin pinyinVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class property implements EntityType {
        public static property read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new property();
        }

        public static c4h write(property propertyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class source implements EntityType {
        public static source read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new source();
        }

        public static c4h write(source sourceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class strokeOrders implements EntityType {
        private Optional<Slot<String>> prefix = Optional.a();

        public static strokeOrders read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            strokeOrders strokeorders = new strokeOrders();
            if (zsdVar.z("prefix")) {
                strokeorders.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
            }
            return strokeorders;
        }

        public static c4h write(strokeOrders strokeorders) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (strokeorders.prefix.c()) {
                c4hVarCreateObjectNode.f0("prefix", IntentUtils.writeSlot(strokeorders.prefix.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getPrefix() {
            return this.prefix;
        }

        public strokeOrders setPrefix(Slot<String> slot) {
            this.prefix = Optional.e(slot);
            return this;
        }
    }

    public static class structure implements EntityType {
        private Optional<Slot<String>> prefix = Optional.a();

        public static structure read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            structure structureVar = new structure();
            if (zsdVar.z("prefix")) {
                structureVar.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
            }
            return structureVar;
        }

        public static c4h write(structure structureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (structureVar.prefix.c()) {
                c4hVarCreateObjectNode.f0("prefix", IntentUtils.writeSlot(structureVar.prefix.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getPrefix() {
            return this.prefix;
        }

        public structure setPrefix(Slot<String> slot) {
            this.prefix = Optional.e(slot);
            return this;
        }
    }

    public static class synonym implements EntityType {
        public static synonym read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new synonym();
        }

        public static c4h write(synonym synonymVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class synonymAntonym implements EntityType {
        public static synonymAntonym read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new synonymAntonym();
        }

        public static c4h write(synonymAntonym synonymantonym) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tongyin implements EntityType {
        private Optional<Slot<String>> prefix = Optional.a();

        public static tongyin read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tongyin tongyinVar = new tongyin();
            if (zsdVar.z("prefix")) {
                tongyinVar.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
            }
            return tongyinVar;
        }

        public static c4h write(tongyin tongyinVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (tongyinVar.prefix.c()) {
                c4hVarCreateObjectNode.f0("prefix", IntentUtils.writeSlot(tongyinVar.prefix.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getPrefix() {
            return this.prefix;
        }

        public tongyin setPrefix(Slot<String> slot) {
            this.prefix = Optional.e(slot);
            return this;
        }
    }

    public static class wordInAnIdiomMeaning implements EntityType {

        @Required
        private Slot<String> property;

        public wordInAnIdiomMeaning() {
        }

        public wordInAnIdiomMeaning(Slot<String> slot) {
            this.property = slot;
        }

        public static wordInAnIdiomMeaning read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            wordInAnIdiomMeaning wordinanidiommeaning = new wordInAnIdiomMeaning();
            wordinanidiommeaning.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
            return wordinanidiommeaning;
        }

        public static c4h write(wordInAnIdiomMeaning wordinanidiommeaning) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("property", IntentUtils.writeSlot(wordinanidiommeaning.property));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getProperty() {
            return this.property;
        }

        @Required
        public wordInAnIdiomMeaning setProperty(Slot<String> slot) {
            this.property = slot;
            return this;
        }
    }

    public static class wordRadical implements EntityType {
        private Optional<Slot<String>> prefix = Optional.a();

        public static wordRadical read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            wordRadical wordradical = new wordRadical();
            if (zsdVar.z("prefix")) {
                wordradical.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
            }
            return wordradical;
        }

        public static c4h write(wordRadical wordradical) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (wordradical.prefix.c()) {
                c4hVarCreateObjectNode.f0("prefix", IntentUtils.writeSlot(wordradical.prefix.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getPrefix() {
            return this.prefix;
        }

        public wordRadical setPrefix(Slot<String> slot) {
            this.prefix = Optional.e(slot);
            return this;
        }
    }

    public static class wordTroke implements EntityType {
        private Optional<Slot<String>> prefix = Optional.a();

        public static wordTroke read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            wordTroke wordtroke = new wordTroke();
            if (zsdVar.z("prefix")) {
                wordtroke.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
            }
            return wordtroke;
        }

        public static c4h write(wordTroke wordtroke) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (wordtroke.prefix.c()) {
                c4hVarCreateObjectNode.f0("prefix", IntentUtils.writeSlot(wordtroke.prefix.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getPrefix() {
            return this.prefix;
        }

        public wordTroke setPrefix(Slot<String> slot) {
            this.prefix = Optional.e(slot);
            return this;
        }
    }

    public EntityFeature() {
    }

    public static EntityFeature read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        EntityFeature entityFeature = new EntityFeature(IntentUtils.readEntityType(zsdVar, AIApiConstants.EntityFeature.NAME, optional));
        entityFeature.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("dictionary_type")) {
            entityFeature.setDictionaryType(IntentUtils.readSlot(zsdVar.w("dictionary_type"), String.class));
        }
        if (zsdVar.z("prefix")) {
            entityFeature.setPrefix(IntentUtils.readSlot(zsdVar.w("prefix"), String.class));
        }
        if (zsdVar.z("entity_pinyin")) {
            entityFeature.setEntityPinyin(IntentUtils.readSlot(zsdVar.w("entity_pinyin"), String.class));
        }
        if (zsdVar.z("query_pinyin")) {
            entityFeature.setQueryPinyin(IntentUtils.readSlot(zsdVar.w("query_pinyin"), String.class));
        }
        if (zsdVar.z("property")) {
            entityFeature.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
        }
        if (zsdVar.z("entity_transform")) {
            entityFeature.setEntityTransform(IntentUtils.readSlot(zsdVar.w("entity_transform"), String.class));
        }
        return entityFeature;
    }

    public static zsd write(EntityFeature entityFeature) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(entityFeature.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(entityFeature.name));
        if (entityFeature.dictionary_type.c()) {
            c4hVar.f0("dictionary_type", IntentUtils.writeSlot(entityFeature.dictionary_type.b()));
        }
        if (entityFeature.prefix.c()) {
            c4hVar.f0("prefix", IntentUtils.writeSlot(entityFeature.prefix.b()));
        }
        if (entityFeature.entity_pinyin.c()) {
            c4hVar.f0("entity_pinyin", IntentUtils.writeSlot(entityFeature.entity_pinyin.b()));
        }
        if (entityFeature.query_pinyin.c()) {
            c4hVar.f0("query_pinyin", IntentUtils.writeSlot(entityFeature.query_pinyin.b()));
        }
        if (entityFeature.property.c()) {
            c4hVar.f0("property", IntentUtils.writeSlot(entityFeature.property.b()));
        }
        if (entityFeature.entity_transform.c()) {
            c4hVar.f0("entity_transform", IntentUtils.writeSlot(entityFeature.entity_transform.b()));
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

    public Optional<Slot<String>> getEntityPinyin() {
        return this.entity_pinyin;
    }

    public Optional<Slot<String>> getEntityTransform() {
        return this.entity_transform;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
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

    public EntityFeature setDictionaryType(Slot<String> slot) {
        this.dictionary_type = Optional.e(slot);
        return this;
    }

    public EntityFeature setEntityPinyin(Slot<String> slot) {
        this.entity_pinyin = Optional.e(slot);
        return this;
    }

    public EntityFeature setEntityTransform(Slot<String> slot) {
        this.entity_transform = Optional.e(slot);
        return this;
    }

    @Required
    public EntityFeature setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public EntityFeature setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public EntityFeature setPrefix(Slot<String> slot) {
        this.prefix = Optional.e(slot);
        return this;
    }

    public EntityFeature setProperty(Slot<String> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public EntityFeature setQueryPinyin(Slot<String> slot) {
        this.query_pinyin = Optional.e(slot);
        return this;
    }

    public EntityFeature(T t) {
        this.entity_type = t;
    }

    public EntityFeature(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
