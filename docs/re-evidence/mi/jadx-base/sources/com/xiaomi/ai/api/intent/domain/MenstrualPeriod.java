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
public class MenstrualPeriod<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> period_type = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Double>> circle = Optional.a();

    public static MenstrualPeriod read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MenstrualPeriod menstrualPeriod = new MenstrualPeriod();
        if (zsdVar.z("period_type")) {
            menstrualPeriod.setPeriodType(IntentUtils.readSlot(zsdVar.w("period_type"), String.class));
        }
        if (zsdVar.z("duration")) {
            menstrualPeriod.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("datetime")) {
            menstrualPeriod.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("circle")) {
            menstrualPeriod.setCircle(IntentUtils.readSlot(zsdVar.w("circle"), Double.class));
        }
        return menstrualPeriod;
    }

    public static zsd write(MenstrualPeriod menstrualPeriod) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (menstrualPeriod.period_type.c()) {
            c4hVarCreateObjectNode.f0("period_type", IntentUtils.writeSlot(menstrualPeriod.period_type.b()));
        }
        if (menstrualPeriod.duration.c()) {
            c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(menstrualPeriod.duration.b()));
        }
        if (menstrualPeriod.datetime.c()) {
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(menstrualPeriod.datetime.b()));
        }
        if (menstrualPeriod.circle.c()) {
            c4hVarCreateObjectNode.f0("circle", IntentUtils.writeSlot(menstrualPeriod.circle.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Double>> getCircle() {
        return this.circle;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    public Optional<Slot<String>> getPeriodType() {
        return this.period_type;
    }

    public MenstrualPeriod setCircle(Slot<Double> slot) {
        this.circle = Optional.e(slot);
        return this;
    }

    public MenstrualPeriod setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public MenstrualPeriod setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    public MenstrualPeriod setPeriodType(Slot<String> slot) {
        this.period_type = Optional.e(slot);
        return this;
    }
}
