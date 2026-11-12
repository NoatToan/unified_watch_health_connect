package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Message<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> content = Optional.a();

    @Required
    private Slot<String> user_id;

    public Message() {
    }

    public static Message read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Message message = new Message();
        message.setUserId(IntentUtils.readSlot(zsdVar.w("user_id"), String.class));
        if (zsdVar.z(MiuiCursorConstants.CONTENT)) {
            message.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        }
        return message;
    }

    public static zsd write(Message message) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("user_id", IntentUtils.writeSlot(message.user_id));
        if (message.content.c()) {
            c4hVarCreateObjectNode.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(message.content.b()));
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

    @Required
    public Slot<String> getUserId() {
        return this.user_id;
    }

    public Message setContent(Slot<String> slot) {
        this.content = Optional.e(slot);
        return this;
    }

    @Required
    public Message setUserId(Slot<String> slot) {
        this.user_id = slot;
        return this;
    }

    public Message(Slot<String> slot) {
        this.user_id = slot;
    }
}
