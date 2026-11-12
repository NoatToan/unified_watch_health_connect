package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class Mail<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.TimeInterval>> time_interval = Optional.a();
    private Optional<Slot<String>> folder = Optional.a();
    private Optional<Slot<String>> content = Optional.a();
    private Optional<Slot<String>> from = Optional.a();
    private Optional<Slot<String>> to = Optional.a();
    private Optional<Slot<Boolean>> include_all = Optional.a();

    public static Mail read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Mail mail = new Mail();
        if (zsdVar.z("name")) {
            mail.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("time_interval")) {
            mail.setTimeInterval(IntentUtils.readSlot(zsdVar.w("time_interval"), Miai.TimeInterval.class));
        }
        if (zsdVar.z("folder")) {
            mail.setFolder(IntentUtils.readSlot(zsdVar.w("folder"), String.class));
        }
        if (zsdVar.z(MiuiCursorConstants.CONTENT)) {
            mail.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        }
        if (zsdVar.z("from")) {
            mail.setFrom(IntentUtils.readSlot(zsdVar.w("from"), String.class));
        }
        if (zsdVar.z("to")) {
            mail.setTo(IntentUtils.readSlot(zsdVar.w("to"), String.class));
        }
        if (zsdVar.z("include_all")) {
            mail.setIncludeAll(IntentUtils.readSlot(zsdVar.w("include_all"), Boolean.class));
        }
        return mail;
    }

    public static zsd write(Mail mail) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (mail.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(mail.name.b()));
        }
        if (mail.time_interval.c()) {
            c4hVarCreateObjectNode.f0("time_interval", IntentUtils.writeSlot(mail.time_interval.b()));
        }
        if (mail.folder.c()) {
            c4hVarCreateObjectNode.f0("folder", IntentUtils.writeSlot(mail.folder.b()));
        }
        if (mail.content.c()) {
            c4hVarCreateObjectNode.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(mail.content.b()));
        }
        if (mail.from.c()) {
            c4hVarCreateObjectNode.f0("from", IntentUtils.writeSlot(mail.from.b()));
        }
        if (mail.to.c()) {
            c4hVarCreateObjectNode.f0("to", IntentUtils.writeSlot(mail.to.b()));
        }
        if (mail.include_all.c()) {
            c4hVarCreateObjectNode.f0("include_all", IntentUtils.writeSlot(mail.include_all.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getContent() {
        return this.content;
    }

    public Optional<Slot<String>> getFolder() {
        return this.folder;
    }

    public Optional<Slot<String>> getFrom() {
        return this.from;
    }

    public Optional<Slot<Boolean>> getIncludeAll() {
        return this.include_all;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Miai.TimeInterval>> getTimeInterval() {
        return this.time_interval;
    }

    public Optional<Slot<String>> getTo() {
        return this.to;
    }

    public Mail setContent(Slot<String> slot) {
        this.content = Optional.e(slot);
        return this;
    }

    public Mail setFolder(Slot<String> slot) {
        this.folder = Optional.e(slot);
        return this;
    }

    public Mail setFrom(Slot<String> slot) {
        this.from = Optional.e(slot);
        return this;
    }

    public Mail setIncludeAll(Slot<Boolean> slot) {
        this.include_all = Optional.e(slot);
        return this;
    }

    public Mail setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Mail setTimeInterval(Slot<Miai.TimeInterval> slot) {
        this.time_interval = Optional.e(slot);
        return this;
    }

    public Mail setTo(Slot<String> slot) {
        this.to = Optional.e(slot);
        return this;
    }
}
