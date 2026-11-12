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
public class Menstruation<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> food_name = Optional.a();
    private Optional<Slot<String>> food_type = Optional.a();

    public static class prevention implements EntityType {
        public static prevention read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new prevention();
        }

        public static c4h write(prevention preventionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Menstruation() {
    }

    public static Menstruation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Menstruation menstruation = new Menstruation(IntentUtils.readEntityType(zsdVar, AIApiConstants.Menstruation.NAME, optional));
        if (zsdVar.z("food_name")) {
            menstruation.setFoodName(IntentUtils.readSlot(zsdVar.w("food_name"), String.class));
        }
        if (zsdVar.z("food_type")) {
            menstruation.setFoodType(IntentUtils.readSlot(zsdVar.w("food_type"), String.class));
        }
        return menstruation;
    }

    public static zsd write(Menstruation menstruation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(menstruation.entity_type);
        if (menstruation.food_name.c()) {
            c4hVar.f0("food_name", IntentUtils.writeSlot(menstruation.food_name.b()));
        }
        if (menstruation.food_type.c()) {
            c4hVar.f0("food_type", IntentUtils.writeSlot(menstruation.food_type.b()));
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

    public Optional<Slot<String>> getFoodName() {
        return this.food_name;
    }

    public Optional<Slot<String>> getFoodType() {
        return this.food_type;
    }

    @Required
    public Menstruation setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Menstruation setFoodName(Slot<String> slot) {
        this.food_name = Optional.e(slot);
        return this;
    }

    public Menstruation setFoodType(Slot<String> slot) {
        this.food_type = Optional.e(slot);
        return this;
    }

    public Menstruation(T t) {
        this.entity_type = t;
    }
}
