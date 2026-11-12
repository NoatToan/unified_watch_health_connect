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
public class DeleteIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Boolean>> complete = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();

    public static DeleteIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DeleteIntent deleteIntent = new DeleteIntent();
        if (zsdVar.z("complete")) {
            deleteIntent.setComplete(IntentUtils.readSlot(zsdVar.w("complete"), Boolean.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            deleteIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        return deleteIntent;
    }

    public static zsd write(DeleteIntent deleteIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (deleteIntent.complete.c()) {
            c4hVarCreateObjectNode.f0("complete", IntentUtils.writeSlot(deleteIntent.complete.b()));
        }
        if (deleteIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(deleteIntent.keyword.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Boolean>> getComplete() {
        return this.complete;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public DeleteIntent setComplete(Slot<Boolean> slot) {
        this.complete = Optional.e(slot);
        return this;
    }

    public DeleteIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }
}
