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
public class PreviousIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<Integer>> ordinal = Optional.a();
    private Optional<Slot<SelectIntent.MeasureWord>> measure_word = Optional.a();

    public static PreviousIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PreviousIntent previousIntent = new PreviousIntent();
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            previousIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("ordinal")) {
            previousIntent.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        if (zsdVar.z("measure_word")) {
            previousIntent.setMeasureWord(IntentUtils.readSlot(zsdVar.w("measure_word"), SelectIntent.MeasureWord.class));
        }
        return previousIntent;
    }

    public static zsd write(PreviousIntent previousIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (previousIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(previousIntent.keyword.b()));
        }
        if (previousIntent.ordinal.c()) {
            c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(previousIntent.ordinal.b()));
        }
        if (previousIntent.measure_word.c()) {
            c4hVarCreateObjectNode.f0("measure_word", IntentUtils.writeSlot(previousIntent.measure_word.b()));
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

    public PreviousIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public PreviousIntent setMeasureWord(Slot<SelectIntent.MeasureWord> slot) {
        this.measure_word = Optional.e(slot);
        return this;
    }

    public PreviousIntent setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }
}
