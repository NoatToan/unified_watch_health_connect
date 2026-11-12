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
public class Recipe<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class ingredient implements EntityType {

        @Required
        private Slot<String> name;

        public ingredient() {
        }

        public ingredient(Slot<String> slot) {
            this.name = slot;
        }

        public static ingredient read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            ingredient ingredientVar = new ingredient();
            ingredientVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return ingredientVar;
        }

        public static c4h write(ingredient ingredientVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(ingredientVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public ingredient setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class style implements EntityType {

        @Required
        private Slot<String> name;

        public style() {
        }

        public style(Slot<String> slot) {
            this.name = slot;
        }

        public static style read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            style styleVar = new style();
            styleVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return styleVar;
        }

        public static c4h write(style styleVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(styleVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public style setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public Recipe() {
    }

    public static Recipe read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Recipe(IntentUtils.readEntityType(zsdVar, AIApiConstants.Recipe.NAME, optional));
    }

    public static zsd write(Recipe recipe) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(recipe.entity_type);
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
    public Recipe setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public static class tag implements EntityType {

        @Required
        private Slot<String> name;
        private Optional<Slot<String>> type = Optional.a();

        public tag() {
        }

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            tagVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            if (zsdVar.z("type")) {
                tagVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tagVar.name));
            if (tagVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(tagVar.type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public tag setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }

        public tag setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public tag(Slot<String> slot) {
            this.name = slot;
        }
    }

    public Recipe(T t) {
        this.entity_type = t;
    }
}
