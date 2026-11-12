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
public class AfterSaleMiShop<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.City>> city = Optional.a();

    @Required
    private T entity_type;

    public static class nearby implements EntityType {
        public static nearby read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new nearby();
        }

        public static c4h write(nearby nearbyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public AfterSaleMiShop() {
    }

    public static AfterSaleMiShop read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AfterSaleMiShop afterSaleMiShop = new AfterSaleMiShop(IntentUtils.readEntityType(zsdVar, AIApiConstants.AfterSaleMiShop.NAME, optional));
        if (zsdVar.z("city")) {
            afterSaleMiShop.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        return afterSaleMiShop;
    }

    public static zsd write(AfterSaleMiShop afterSaleMiShop) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(afterSaleMiShop.entity_type);
        if (afterSaleMiShop.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(afterSaleMiShop.city.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public AfterSaleMiShop setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    @Required
    public AfterSaleMiShop setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AfterSaleMiShop(T t) {
        this.entity_type = t;
    }
}
