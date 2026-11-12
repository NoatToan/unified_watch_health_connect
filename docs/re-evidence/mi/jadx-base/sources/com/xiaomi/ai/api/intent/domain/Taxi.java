package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class Taxi<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> user_name = Optional.a();

    public static Taxi read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Taxi taxi = new Taxi();
        if (zsdVar.z("user_name")) {
            taxi.setUserName(IntentUtils.readSlot(zsdVar.w("user_name"), String.class));
        }
        return taxi;
    }

    public static zsd write(Taxi taxi) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (taxi.user_name.c()) {
            c4hVarCreateObjectNode.f0("user_name", IntentUtils.writeSlot(taxi.user_name.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getUserName() {
        return this.user_name;
    }

    public Taxi setUserName(Slot<String> slot) {
        this.user_name = Optional.e(slot);
        return this;
    }
}
