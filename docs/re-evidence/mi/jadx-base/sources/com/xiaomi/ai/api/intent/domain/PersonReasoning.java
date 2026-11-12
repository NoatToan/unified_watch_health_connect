package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
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
public class PersonReasoning<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> block;

    @Required
    private T entity_type;

    @Required
    private Slot<String> head;
    private Optional<Slot<Knowledge.SemanticInfo>> semantic_info = Optional.a();

    @Required
    private Slot<Map<String, String>> table;

    public static class existenceAndWhetherOrNot implements EntityType {
        public static existenceAndWhetherOrNot read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new existenceAndWhetherOrNot();
        }

        public static c4h write(existenceAndWhetherOrNot existenceandwhetherornot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class multiHop implements EntityType {
        public static multiHop read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new multiHop();
        }

        public static c4h write(multiHop multihop) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class reverseLookup implements EntityType {
        public static reverseLookup read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new reverseLookup();
        }

        public static c4h write(reverseLookup reverselookup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public PersonReasoning() {
    }

    public static PersonReasoning read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PersonReasoning personReasoning = new PersonReasoning(IntentUtils.readEntityType(zsdVar, AIApiConstants.PersonReasoning.NAME, optional));
        personReasoning.setHead(IntentUtils.readSlot(zsdVar.w("head"), String.class));
        personReasoning.setTable(IntentUtils.readSlot(zsdVar.w("table"), Map.class));
        personReasoning.setBlock(IntentUtils.readSlot(zsdVar.w("block"), String.class));
        if (zsdVar.z("semantic_info")) {
            personReasoning.setSemanticInfo(IntentUtils.readSlot(zsdVar.w("semantic_info"), Knowledge.SemanticInfo.class));
        }
        return personReasoning;
    }

    public static zsd write(PersonReasoning personReasoning) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(personReasoning.entity_type);
        c4hVar.f0("head", IntentUtils.writeSlot(personReasoning.head));
        c4hVar.f0("table", IntentUtils.writeSlot(personReasoning.table));
        c4hVar.f0("block", IntentUtils.writeSlot(personReasoning.block));
        if (personReasoning.semantic_info.c()) {
            c4hVar.f0("semantic_info", IntentUtils.writeSlot(personReasoning.semantic_info.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getBlock() {
        return this.block;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getHead() {
        return this.head;
    }

    public Optional<Slot<Knowledge.SemanticInfo>> getSemanticInfo() {
        return this.semantic_info;
    }

    @Required
    public Slot<Map<String, String>> getTable() {
        return this.table;
    }

    @Required
    public PersonReasoning setBlock(Slot<String> slot) {
        this.block = slot;
        return this;
    }

    @Required
    public PersonReasoning setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public PersonReasoning setHead(Slot<String> slot) {
        this.head = slot;
        return this;
    }

    public PersonReasoning setSemanticInfo(Slot<Knowledge.SemanticInfo> slot) {
        this.semantic_info = Optional.e(slot);
        return this;
    }

    @Required
    public PersonReasoning setTable(Slot<Map<String, String>> slot) {
        this.table = slot;
        return this;
    }

    public PersonReasoning(T t) {
        this.entity_type = t;
    }

    public PersonReasoning(T t, Slot<String> slot, Slot<Map<String, String>> slot2, Slot<String> slot3) {
        this.entity_type = t;
        this.head = slot;
        this.table = slot2;
        this.block = slot3;
    }
}
