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
public class Place<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Location>> name = Optional.a();

    public static Place read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Place place = new Place();
        if (zsdVar.z("name")) {
            place.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Location.class));
        }
        return place;
    }

    public static zsd write(Place place) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (place.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(place.name.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Miai.Location>> getName() {
        return this.name;
    }

    public Place setName(Slot<Miai.Location> slot) {
        this.name = Optional.e(slot);
        return this;
    }
}
