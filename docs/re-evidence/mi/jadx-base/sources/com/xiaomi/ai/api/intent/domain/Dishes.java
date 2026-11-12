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
public class Dishes<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> tag_type = Optional.a();

    public static class cookSkill implements EntityType {
        public static cookSkill read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new cookSkill();
        }

        public static c4h write(cookSkill cookskill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class cookTime implements EntityType {
        public static cookTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new cookTime();
        }

        public static c4h write(cookTime cooktime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class effect implements EntityType {
        public static effect read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new effect();
        }

        public static c4h write(effect effectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class forbidden implements EntityType {
        public static forbidden read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new forbidden();
        }

        public static c4h write(forbidden forbiddenVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class ingredient implements EntityType {
        public static ingredient read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ingredient();
        }

        public static c4h write(ingredient ingredientVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class practice implements EntityType {
        public static practice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new practice();
        }

        public static c4h write(practice practiceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class prepareTime implements EntityType {
        public static prepareTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new prepareTime();
        }

        public static c4h write(prepareTime preparetime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class style implements EntityType {
        public static style read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new style();
        }

        public static c4h write(style styleVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tag implements EntityType {
        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tag();
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Dishes() {
    }

    public static Dishes read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Dishes dishes = new Dishes(IntentUtils.readEntityType(zsdVar, AIApiConstants.Dishes.NAME, optional));
        dishes.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("tag_type")) {
            dishes.setTagType(IntentUtils.readSlot(zsdVar.w("tag_type"), String.class));
        }
        return dishes;
    }

    public static zsd write(Dishes dishes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(dishes.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(dishes.name));
        if (dishes.tag_type.c()) {
            c4hVar.f0("tag_type", IntentUtils.writeSlot(dishes.tag_type.b()));
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

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getTagType() {
        return this.tag_type;
    }

    @Required
    public Dishes setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public Dishes setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public Dishes setTagType(Slot<String> slot) {
        this.tag_type = Optional.e(slot);
        return this;
    }

    public Dishes(T t) {
        this.entity_type = t;
    }

    public Dishes(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
