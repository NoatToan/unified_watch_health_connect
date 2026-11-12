package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Restaurant<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public static class promotion implements EntityType {
        public static promotion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new promotion();
        }

        public static c4h write(promotion promotionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Restaurant() {
    }

    public static Restaurant read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Restaurant restaurant = new Restaurant(IntentUtils.readEntityType(zsdVar, AIApiConstants.Restaurant.NAME, optional));
        if (zsdVar.z("name")) {
            restaurant.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("city")) {
            restaurant.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z("app")) {
            restaurant.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return restaurant;
    }

    public static zsd write(Restaurant restaurant) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(restaurant.entity_type);
        if (restaurant.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(restaurant.name.b()));
        }
        if (restaurant.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(restaurant.city.b()));
        }
        if (restaurant.app.c()) {
            c4hVar.f0("app", IntentUtils.writeSlot(restaurant.app.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Restaurant setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public Restaurant setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    @Required
    public Restaurant setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Restaurant setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Restaurant(T t) {
        this.entity_type = t;
    }
}
