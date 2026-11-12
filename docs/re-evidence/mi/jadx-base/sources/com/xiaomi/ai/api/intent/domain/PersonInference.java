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
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class PersonInference<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> block;

    @Required
    private Slot<String> head;

    @Required
    private Slot<Map<String, String>> table;

    public PersonInference() {
    }

    public static PersonInference read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PersonInference personInference = new PersonInference();
        personInference.setHead(IntentUtils.readSlot(zsdVar.w("head"), String.class));
        personInference.setTable(IntentUtils.readSlot(zsdVar.w("table"), Map.class));
        personInference.setBlock(IntentUtils.readSlot(zsdVar.w("block"), String.class));
        return personInference;
    }

    public static zsd write(PersonInference personInference) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("head", IntentUtils.writeSlot(personInference.head));
        c4hVarCreateObjectNode.f0("table", IntentUtils.writeSlot(personInference.table));
        c4hVarCreateObjectNode.f0("block", IntentUtils.writeSlot(personInference.block));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getBlock() {
        return this.block;
    }

    @Required
    public Slot<String> getHead() {
        return this.head;
    }

    @Required
    public Slot<Map<String, String>> getTable() {
        return this.table;
    }

    @Required
    public PersonInference setBlock(Slot<String> slot) {
        this.block = slot;
        return this;
    }

    @Required
    public PersonInference setHead(Slot<String> slot) {
        this.head = slot;
        return this;
    }

    @Required
    public PersonInference setTable(Slot<Map<String, String>> slot) {
        this.table = slot;
        return this;
    }

    public PersonInference(Slot<String> slot, Slot<Map<String, String>> slot2, Slot<String> slot3) {
        this.head = slot;
        this.table = slot2;
        this.block = slot3;
    }
}
