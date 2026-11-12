package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class IntentExecutor {
    private Optional<CategoryType> device_category = Optional.a();
    private Optional<String> device_alias_name = Optional.a();
    private Optional<String> home_alias_name = Optional.a();
    private Optional<RoomLocation> room_location = Optional.a();
    private Optional<String> room_alias_name = Optional.a();

    public static IntentExecutor read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        IntentExecutor intentExecutor = new IntentExecutor();
        if (zsdVar.z("device_category")) {
            intentExecutor.setDevice_category(Optional.e(CategoryType.read(zsdVar.w("device_category").l())));
        }
        if (zsdVar.z("device_alias_name")) {
            intentExecutor.setDevice_alias_name(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("device_alias_name"), String.class)));
        }
        if (zsdVar.z("home_alias_name")) {
            intentExecutor.setHome_alias_name(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("home_alias_name"), String.class)));
        }
        if (zsdVar.z("room_location")) {
            intentExecutor.setRoom_location(Optional.e(RoomLocation.read(zsdVar.w("room_location").l())));
        }
        if (zsdVar.z("room_alias_name")) {
            intentExecutor.setRoom_alias_name(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("room_alias_name"), String.class)));
        }
        return intentExecutor;
    }

    public static zsd write(IntentExecutor intentExecutor) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (intentExecutor.device_category.c()) {
            c4hVarCreateObjectNode.f0("device_category", IntentUtils.toJsonNode(intentExecutor.getDevice_category().b()));
        }
        if (intentExecutor.device_alias_name.c()) {
            c4hVarCreateObjectNode.f0("device_alias_name", IntentUtils.toJsonNode(intentExecutor.getDevice_alias_name().b()));
        }
        if (intentExecutor.home_alias_name.c()) {
            c4hVarCreateObjectNode.f0("home_alias_name", IntentUtils.toJsonNode(intentExecutor.getHome_alias_name().b()));
        }
        if (intentExecutor.room_location.c()) {
            c4hVarCreateObjectNode.f0("room_location", IntentUtils.toJsonNode(intentExecutor.getRoom_location().b()));
        }
        if (intentExecutor.room_alias_name.c()) {
            c4hVarCreateObjectNode.f0("room_alias_name", IntentUtils.toJsonNode(intentExecutor.getRoom_alias_name().b()));
        }
        return c4hVarCreateObjectNode;
    }

    public Optional<String> getDevice_alias_name() {
        return this.device_alias_name;
    }

    public Optional<CategoryType> getDevice_category() {
        return this.device_category;
    }

    public Optional<String> getHome_alias_name() {
        return this.home_alias_name;
    }

    public Optional<String> getRoom_alias_name() {
        return this.room_alias_name;
    }

    public Optional<RoomLocation> getRoom_location() {
        return this.room_location;
    }

    public void setDevice_alias_name(Optional<String> optional) {
        this.device_alias_name = optional;
    }

    public void setDevice_category(Optional<CategoryType> optional) {
        this.device_category = optional;
    }

    public void setHome_alias_name(Optional<String> optional) {
        this.home_alias_name = optional;
    }

    public void setRoom_alias_name(Optional<String> optional) {
        this.room_alias_name = optional;
    }

    public void setRoom_location(Optional<RoomLocation> optional) {
        this.room_location = optional;
    }
}
