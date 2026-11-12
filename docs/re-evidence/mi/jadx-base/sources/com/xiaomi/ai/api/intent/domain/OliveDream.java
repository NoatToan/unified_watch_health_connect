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
public class OliveDream<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> attribute_info;

    @Required
    private Slot<String> attribute_name;

    @Required
    private Slot<String> entity;

    public OliveDream() {
    }

    public static OliveDream read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        OliveDream oliveDream = new OliveDream();
        oliveDream.setEntity(IntentUtils.readSlot(zsdVar.w("entity"), String.class));
        oliveDream.setAttributeName(IntentUtils.readSlot(zsdVar.w("attribute_name"), String.class));
        oliveDream.setAttributeInfo(IntentUtils.readSlot(zsdVar.w("attribute_info"), String.class));
        return oliveDream;
    }

    public static zsd write(OliveDream oliveDream) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("entity", IntentUtils.writeSlot(oliveDream.entity));
        c4hVarCreateObjectNode.f0("attribute_name", IntentUtils.writeSlot(oliveDream.attribute_name));
        c4hVarCreateObjectNode.f0("attribute_info", IntentUtils.writeSlot(oliveDream.attribute_info));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getAttributeInfo() {
        return this.attribute_info;
    }

    @Required
    public Slot<String> getAttributeName() {
        return this.attribute_name;
    }

    @Required
    public Slot<String> getEntity() {
        return this.entity;
    }

    @Required
    public OliveDream setAttributeInfo(Slot<String> slot) {
        this.attribute_info = slot;
        return this;
    }

    @Required
    public OliveDream setAttributeName(Slot<String> slot) {
        this.attribute_name = slot;
        return this;
    }

    @Required
    public OliveDream setEntity(Slot<String> slot) {
        this.entity = slot;
        return this;
    }

    public OliveDream(Slot<String> slot, Slot<String> slot2, Slot<String> slot3) {
        this.entity = slot;
        this.attribute_name = slot2;
        this.attribute_info = slot3;
    }
}
