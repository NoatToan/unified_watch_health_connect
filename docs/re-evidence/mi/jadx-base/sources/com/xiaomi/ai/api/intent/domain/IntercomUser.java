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
public class IntercomUser<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> device_category = Optional.a();
    private Optional<Slot<String>> device_name = Optional.a();
    private Optional<Slot<Boolean>> is_send_all = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<String>> home = Optional.a();

    public static IntercomUser read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        IntercomUser intercomUser = new IntercomUser();
        if (zsdVar.z("device_category")) {
            intercomUser.setDeviceCategory(IntentUtils.readSlot(zsdVar.w("device_category"), String.class));
        }
        if (zsdVar.z("device_name")) {
            intercomUser.setDeviceName(IntentUtils.readSlot(zsdVar.w("device_name"), String.class));
        }
        if (zsdVar.z("is_send_all")) {
            intercomUser.setIsSendAll(IntentUtils.readSlot(zsdVar.w("is_send_all"), Boolean.class));
        }
        if (zsdVar.z("room")) {
            intercomUser.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("home")) {
            intercomUser.setHome(IntentUtils.readSlot(zsdVar.w("home"), String.class));
        }
        return intercomUser;
    }

    public static zsd write(IntercomUser intercomUser) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (intercomUser.device_category.c()) {
            c4hVarCreateObjectNode.f0("device_category", IntentUtils.writeSlot(intercomUser.device_category.b()));
        }
        if (intercomUser.device_name.c()) {
            c4hVarCreateObjectNode.f0("device_name", IntentUtils.writeSlot(intercomUser.device_name.b()));
        }
        if (intercomUser.is_send_all.c()) {
            c4hVarCreateObjectNode.f0("is_send_all", IntentUtils.writeSlot(intercomUser.is_send_all.b()));
        }
        if (intercomUser.room.c()) {
            c4hVarCreateObjectNode.f0("room", IntentUtils.writeSlot(intercomUser.room.b()));
        }
        if (intercomUser.home.c()) {
            c4hVarCreateObjectNode.f0("home", IntentUtils.writeSlot(intercomUser.home.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getDeviceCategory() {
        return this.device_category;
    }

    public Optional<Slot<String>> getDeviceName() {
        return this.device_name;
    }

    public Optional<Slot<String>> getHome() {
        return this.home;
    }

    public Optional<Slot<Boolean>> getIsSendAll() {
        return this.is_send_all;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public IntercomUser setDeviceCategory(Slot<String> slot) {
        this.device_category = Optional.e(slot);
        return this;
    }

    public IntercomUser setDeviceName(Slot<String> slot) {
        this.device_name = Optional.e(slot);
        return this;
    }

    public IntercomUser setHome(Slot<String> slot) {
        this.home = Optional.e(slot);
        return this;
    }

    public IntercomUser setIsSendAll(Slot<Boolean> slot) {
        this.is_send_all = Optional.e(slot);
        return this;
    }

    public IntercomUser setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }
}
