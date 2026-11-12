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
public class SmartDevice<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> category = Optional.a();
    private Optional<Slot<String>> room = Optional.a();

    public static SmartDevice read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SmartDevice smartDevice = new SmartDevice();
        if (zsdVar.z("category")) {
            smartDevice.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
        }
        if (zsdVar.z("room")) {
            smartDevice.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        return smartDevice;
    }

    public static zsd write(SmartDevice smartDevice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (smartDevice.category.c()) {
            c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(smartDevice.category.b()));
        }
        if (smartDevice.room.c()) {
            c4hVarCreateObjectNode.f0("room", IntentUtils.writeSlot(smartDevice.room.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getCategory() {
        return this.category;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public SmartDevice setCategory(Slot<String> slot) {
        this.category = Optional.e(slot);
        return this;
    }

    public SmartDevice setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }
}
