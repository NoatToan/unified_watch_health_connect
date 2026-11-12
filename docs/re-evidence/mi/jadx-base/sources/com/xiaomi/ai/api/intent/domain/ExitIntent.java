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
public class ExitIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<Boolean>> closed = Optional.a();

    public static ExitIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ExitIntent exitIntent = new ExitIntent();
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            exitIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("closed")) {
            exitIntent.setClosed(IntentUtils.readSlot(zsdVar.w("closed"), Boolean.class));
        }
        return exitIntent;
    }

    public static zsd write(ExitIntent exitIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (exitIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(exitIntent.keyword.b()));
        }
        if (exitIntent.closed.c()) {
            c4hVarCreateObjectNode.f0("closed", IntentUtils.writeSlot(exitIntent.closed.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Boolean>> getClosed() {
        return this.closed;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public ExitIntent setClosed(Slot<Boolean> slot) {
        this.closed = Optional.e(slot);
        return this;
    }

    public ExitIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }
}
