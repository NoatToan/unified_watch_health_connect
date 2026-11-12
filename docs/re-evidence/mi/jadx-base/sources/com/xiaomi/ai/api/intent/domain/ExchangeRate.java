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
public class ExchangeRate<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> answer;

    public ExchangeRate() {
    }

    public static ExchangeRate read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setAnswer(IntentUtils.readSlot(zsdVar.w("answer"), String.class));
        return exchangeRate;
    }

    public static zsd write(ExchangeRate exchangeRate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("answer", IntentUtils.writeSlot(exchangeRate.answer));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getAnswer() {
        return this.answer;
    }

    @Required
    public ExchangeRate setAnswer(Slot<String> slot) {
        this.answer = slot;
        return this;
    }

    public ExchangeRate(Slot<String> slot) {
        this.answer = slot;
    }
}
