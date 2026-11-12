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
public class NextIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<Integer>> ordinal = Optional.a();
    private Optional<Slot<SelectIntent.MeasureWord>> measure_word = Optional.a();

    public static NextIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        NextIntent nextIntent = new NextIntent();
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            nextIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("ordinal")) {
            nextIntent.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        if (zsdVar.z("measure_word")) {
            nextIntent.setMeasureWord(IntentUtils.readSlot(zsdVar.w("measure_word"), SelectIntent.MeasureWord.class));
        }
        return nextIntent;
    }

    public static zsd write(NextIntent nextIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (nextIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(nextIntent.keyword.b()));
        }
        if (nextIntent.ordinal.c()) {
            c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(nextIntent.ordinal.b()));
        }
        if (nextIntent.measure_word.c()) {
            c4hVarCreateObjectNode.f0("measure_word", IntentUtils.writeSlot(nextIntent.measure_word.b()));
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

    public Optional<Slot<SelectIntent.MeasureWord>> getMeasureWord() {
        return this.measure_word;
    }

    public Optional<Slot<Integer>> getOrdinal() {
        return this.ordinal;
    }

    public NextIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public NextIntent setMeasureWord(Slot<SelectIntent.MeasureWord> slot) {
        this.measure_word = Optional.e(slot);
        return this;
    }

    public NextIntent setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }
}
