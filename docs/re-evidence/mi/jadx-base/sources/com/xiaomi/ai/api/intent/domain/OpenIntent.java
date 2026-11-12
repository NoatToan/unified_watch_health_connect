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
public class OpenIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> keyword = Optional.a();

    public static OpenIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        OpenIntent openIntent = new OpenIntent();
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            openIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        return openIntent;
    }

    public static zsd write(OpenIntent openIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (openIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(openIntent.keyword.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public OpenIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }
}
