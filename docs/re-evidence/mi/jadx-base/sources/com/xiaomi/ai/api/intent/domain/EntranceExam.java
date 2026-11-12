package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class EntranceExam<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<Miai.Province>> province = Optional.a();
    private Optional<Slot<Miai.Date>> score_year = Optional.a();
    private Optional<Slot<String>> score = Optional.a();

    public static EntranceExam read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        EntranceExam entranceExam = new EntranceExam();
        if (zsdVar.z("type")) {
            entranceExam.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("province")) {
            entranceExam.setProvince(IntentUtils.readSlot(zsdVar.w("province"), Miai.Province.class));
        }
        if (zsdVar.z("score_year")) {
            entranceExam.setScoreYear(IntentUtils.readSlot(zsdVar.w("score_year"), Miai.Date.class));
        }
        if (zsdVar.z("score")) {
            entranceExam.setScore(IntentUtils.readSlot(zsdVar.w("score"), String.class));
        }
        return entranceExam;
    }

    public static zsd write(EntranceExam entranceExam) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (entranceExam.type.c()) {
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(entranceExam.type.b()));
        }
        if (entranceExam.province.c()) {
            c4hVarCreateObjectNode.f0("province", IntentUtils.writeSlot(entranceExam.province.b()));
        }
        if (entranceExam.score_year.c()) {
            c4hVarCreateObjectNode.f0("score_year", IntentUtils.writeSlot(entranceExam.score_year.b()));
        }
        if (entranceExam.score.c()) {
            c4hVarCreateObjectNode.f0("score", IntentUtils.writeSlot(entranceExam.score.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Miai.Province>> getProvince() {
        return this.province;
    }

    public Optional<Slot<String>> getScore() {
        return this.score;
    }

    public Optional<Slot<Miai.Date>> getScoreYear() {
        return this.score_year;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    public EntranceExam setProvince(Slot<Miai.Province> slot) {
        this.province = Optional.e(slot);
        return this;
    }

    public EntranceExam setScore(Slot<String> slot) {
        this.score = Optional.e(slot);
        return this;
    }

    public EntranceExam setScoreYear(Slot<Miai.Date> slot) {
        this.score_year = Optional.e(slot);
        return this;
    }

    public EntranceExam setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }
}
