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
public class MessageList<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> id;

    public MessageList() {
    }

    public static MessageList read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MessageList messageList = new MessageList();
        messageList.setId(IntentUtils.readSlot(zsdVar.w("id"), String.class));
        return messageList;
    }

    public static zsd write(MessageList messageList) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("id", IntentUtils.writeSlot(messageList.id));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getId() {
        return this.id;
    }

    @Required
    public MessageList setId(Slot<String> slot) {
        this.id = slot;
        return this;
    }

    public MessageList(Slot<String> slot) {
        this.id = slot;
    }
}
