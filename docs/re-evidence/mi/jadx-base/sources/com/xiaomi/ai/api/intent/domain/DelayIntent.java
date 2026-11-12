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
public class DelayIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Duration>> duration = Optional.a();

    public static DelayIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DelayIntent delayIntent = new DelayIntent();
        if (zsdVar.z("duration")) {
            delayIntent.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        return delayIntent;
    }

    public static zsd write(DelayIntent delayIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (delayIntent.duration.c()) {
            c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(delayIntent.duration.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    public DelayIntent setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }
}
