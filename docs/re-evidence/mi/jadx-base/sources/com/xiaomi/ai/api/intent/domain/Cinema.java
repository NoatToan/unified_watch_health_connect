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
public class Cinema<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.Location>> location = Optional.a();

    public static Cinema read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Cinema cinema = new Cinema();
        if (zsdVar.z("name")) {
            cinema.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("location")) {
            cinema.setLocation(IntentUtils.readSlot(zsdVar.w("location"), Miai.Location.class));
        }
        return cinema;
    }

    public static zsd write(Cinema cinema) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (cinema.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(cinema.name.b()));
        }
        if (cinema.location.c()) {
            c4hVarCreateObjectNode.f0("location", IntentUtils.writeSlot(cinema.location.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Miai.Location>> getLocation() {
        return this.location;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Cinema setLocation(Slot<Miai.Location> slot) {
        this.location = Optional.e(slot);
        return this;
    }

    public Cinema setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }
}
