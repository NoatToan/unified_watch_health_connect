package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class GPS<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Duration>> delay = Optional.a();

    @Required
    private T entity_type;

    public static class setting implements EntityType {
        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new setting();
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public GPS() {
    }

    public static GPS read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        GPS gps = new GPS(IntentUtils.readEntityType(zsdVar, "GPS", optional));
        if (zsdVar.z("delay")) {
            gps.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
        }
        return gps;
    }

    public static zsd write(GPS gps) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(gps.entity_type);
        if (gps.delay.c()) {
            c4hVar.f0("delay", IntentUtils.writeSlot(gps.delay.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Duration>> getDelay() {
        return this.delay;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public GPS setDelay(Slot<Miai.Duration> slot) {
        this.delay = Optional.e(slot);
        return this;
    }

    @Required
    public GPS setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public GPS(T t) {
        this.entity_type = t;
    }
}
