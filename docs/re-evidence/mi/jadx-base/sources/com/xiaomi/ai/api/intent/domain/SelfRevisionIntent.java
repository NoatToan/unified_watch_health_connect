package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class SelfRevisionIntent<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> correct_query;

    @Required
    private Slot<String> ori_query;

    public SelfRevisionIntent() {
    }

    public static SelfRevisionIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SelfRevisionIntent selfRevisionIntent = new SelfRevisionIntent();
        selfRevisionIntent.setOriQuery(IntentUtils.readSlot(zsdVar.w("ori_query"), String.class));
        selfRevisionIntent.setCorrectQuery(IntentUtils.readSlot(zsdVar.w("correct_query"), String.class));
        return selfRevisionIntent;
    }

    public static zsd write(SelfRevisionIntent selfRevisionIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("ori_query", IntentUtils.writeSlot(selfRevisionIntent.ori_query));
        c4hVarCreateObjectNode.f0("correct_query", IntentUtils.writeSlot(selfRevisionIntent.correct_query));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getCorrectQuery() {
        return this.correct_query;
    }

    @Required
    public Slot<String> getOriQuery() {
        return this.ori_query;
    }

    @Required
    public SelfRevisionIntent setCorrectQuery(Slot<String> slot) {
        this.correct_query = slot;
        return this;
    }

    @Required
    public SelfRevisionIntent setOriQuery(Slot<String> slot) {
        this.ori_query = slot;
        return this;
    }

    public SelfRevisionIntent(Slot<String> slot, Slot<String> slot2) {
        this.ori_query = slot;
        this.correct_query = slot2;
    }
}
