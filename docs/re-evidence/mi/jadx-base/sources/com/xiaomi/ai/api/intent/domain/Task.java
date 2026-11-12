package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Task<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> content = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();

    public Task() {
    }

    public static Task read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Task task = new Task(IntentUtils.readEntityType(zsdVar, AIApiConstants.Task.NAME, optional));
        if (zsdVar.z(MiuiCursorConstants.CONTENT)) {
            task.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        }
        if (zsdVar.z("duration")) {
            task.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("datetime")) {
            task.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        return task;
    }

    public static zsd write(Task task) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(task.entity_type);
        if (task.content.c()) {
            c4hVar.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(task.content.b()));
        }
        if (task.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(task.duration.b()));
        }
        if (task.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(task.datetime.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getContent() {
        return this.content;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Task setContent(Slot<String> slot) {
        this.content = Optional.e(slot);
        return this;
    }

    public Task setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public Task setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public Task setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Task(T t) {
        this.entity_type = t;
    }
}
