package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
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
public class BackIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<String>> target = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public static BackIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BackIntent backIntent = new BackIntent();
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            backIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("target")) {
            backIntent.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
        }
        if (zsdVar.z("app")) {
            backIntent.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return backIntent;
    }

    public static zsd write(BackIntent backIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (backIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(backIntent.keyword.b()));
        }
        if (backIntent.target.c()) {
            c4hVarCreateObjectNode.f0("target", IntentUtils.writeSlot(backIntent.target.b()));
        }
        if (backIntent.app.c()) {
            c4hVarCreateObjectNode.f0("app", IntentUtils.writeSlot(backIntent.app.b()));
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

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public Optional<Slot<String>> getTarget() {
        return this.target;
    }

    public BackIntent setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public BackIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public BackIntent setTarget(Slot<String> slot) {
        this.target = Optional.e(slot);
        return this;
    }
}
