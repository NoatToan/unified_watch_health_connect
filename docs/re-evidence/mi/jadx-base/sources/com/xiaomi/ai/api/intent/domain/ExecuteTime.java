package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class ExecuteTime<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<Miai.Date>> date = Optional.a();
    private Optional<Slot<Miai.TimeInterval>> interval = Optional.a();
    private Optional<Slot<ControlCircle>> circle = Optional.a();

    public static ExecuteTime read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ExecuteTime executeTime = new ExecuteTime();
        if (zsdVar.z("datetime")) {
            executeTime.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            executeTime.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z(DialWidgetType.DATE)) {
            executeTime.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
        }
        if (zsdVar.z("interval")) {
            executeTime.setInterval(IntentUtils.readSlot(zsdVar.w("interval"), Miai.TimeInterval.class));
        }
        if (zsdVar.z("circle")) {
            executeTime.setCircle(IntentUtils.readSlot(zsdVar.w("circle"), ControlCircle.class));
        }
        return executeTime;
    }

    public static zsd write(ExecuteTime executeTime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (executeTime.datetime.c()) {
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(executeTime.datetime.b()));
        }
        if (executeTime.duration.c()) {
            c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(executeTime.duration.b()));
        }
        if (executeTime.date.c()) {
            c4hVarCreateObjectNode.f0(DialWidgetType.DATE, IntentUtils.writeSlot(executeTime.date.b()));
        }
        if (executeTime.interval.c()) {
            c4hVarCreateObjectNode.f0("interval", IntentUtils.writeSlot(executeTime.interval.b()));
        }
        if (executeTime.circle.c()) {
            c4hVarCreateObjectNode.f0("circle", IntentUtils.writeSlot(executeTime.circle.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<ControlCircle>> getCircle() {
        return this.circle;
    }

    public Optional<Slot<Miai.Date>> getDate() {
        return this.date;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    public Optional<Slot<Miai.TimeInterval>> getInterval() {
        return this.interval;
    }

    public ExecuteTime setCircle(Slot<ControlCircle> slot) {
        this.circle = Optional.e(slot);
        return this;
    }

    public ExecuteTime setDate(Slot<Miai.Date> slot) {
        this.date = Optional.e(slot);
        return this;
    }

    public ExecuteTime setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public ExecuteTime setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    public ExecuteTime setInterval(Slot<Miai.TimeInterval> slot) {
        this.interval = Optional.e(slot);
        return this;
    }
}
