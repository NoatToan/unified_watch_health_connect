package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class EntertainmentVenue<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public static EntertainmentVenue read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        EntertainmentVenue entertainmentVenue = new EntertainmentVenue();
        if (zsdVar.z("city")) {
            entertainmentVenue.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z("app")) {
            entertainmentVenue.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return entertainmentVenue;
    }

    public static zsd write(EntertainmentVenue entertainmentVenue) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (entertainmentVenue.city.c()) {
            c4hVarCreateObjectNode.f0("city", IntentUtils.writeSlot(entertainmentVenue.city.b()));
        }
        if (entertainmentVenue.app.c()) {
            c4hVarCreateObjectNode.f0("app", IntentUtils.writeSlot(entertainmentVenue.app.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    public EntertainmentVenue setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public EntertainmentVenue setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }
}
