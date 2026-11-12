package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class CharacterRelationship<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<Miai.Artist> end;

    @Required
    private Slot<Knowledge.Relation> relations;

    @Required
    private Slot<Miai.Artist> start;
    private Optional<Slot<Knowledge.RelationEntity>> common_relation_entities = Optional.a();
    private Optional<Slot<Knowledge.SemanticInfo>> semantic_info = Optional.a();

    public CharacterRelationship() {
    }

    public static CharacterRelationship read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CharacterRelationship characterRelationship = new CharacterRelationship();
        characterRelationship.setStart(IntentUtils.readSlot(zsdVar.w(StatConstants.PARAM_START), Miai.Artist.class));
        characterRelationship.setEnd(IntentUtils.readSlot(zsdVar.w(StatConstants.PARAM_END), Miai.Artist.class));
        characterRelationship.setRelations(IntentUtils.readSlot(zsdVar.w("relations"), Knowledge.Relation.class));
        if (zsdVar.z("common_relation_entities")) {
            characterRelationship.setCommonRelationEntities(IntentUtils.readSlot(zsdVar.w("common_relation_entities"), Knowledge.RelationEntity.class));
        }
        if (zsdVar.z("semantic_info")) {
            characterRelationship.setSemanticInfo(IntentUtils.readSlot(zsdVar.w("semantic_info"), Knowledge.SemanticInfo.class));
        }
        return characterRelationship;
    }

    public static zsd write(CharacterRelationship characterRelationship) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0(StatConstants.PARAM_START, IntentUtils.writeSlot(characterRelationship.start));
        c4hVarCreateObjectNode.f0(StatConstants.PARAM_END, IntentUtils.writeSlot(characterRelationship.end));
        c4hVarCreateObjectNode.f0("relations", IntentUtils.writeSlot(characterRelationship.relations));
        if (characterRelationship.common_relation_entities.c()) {
            c4hVarCreateObjectNode.f0("common_relation_entities", IntentUtils.writeSlot(characterRelationship.common_relation_entities.b()));
        }
        if (characterRelationship.semantic_info.c()) {
            c4hVarCreateObjectNode.f0("semantic_info", IntentUtils.writeSlot(characterRelationship.semantic_info.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Knowledge.RelationEntity>> getCommonRelationEntities() {
        return this.common_relation_entities;
    }

    @Required
    public Slot<Miai.Artist> getEnd() {
        return this.end;
    }

    @Required
    public Slot<Knowledge.Relation> getRelations() {
        return this.relations;
    }

    public Optional<Slot<Knowledge.SemanticInfo>> getSemanticInfo() {
        return this.semantic_info;
    }

    @Required
    public Slot<Miai.Artist> getStart() {
        return this.start;
    }

    public CharacterRelationship setCommonRelationEntities(Slot<Knowledge.RelationEntity> slot) {
        this.common_relation_entities = Optional.e(slot);
        return this;
    }

    @Required
    public CharacterRelationship setEnd(Slot<Miai.Artist> slot) {
        this.end = slot;
        return this;
    }

    @Required
    public CharacterRelationship setRelations(Slot<Knowledge.Relation> slot) {
        this.relations = slot;
        return this;
    }

    public CharacterRelationship setSemanticInfo(Slot<Knowledge.SemanticInfo> slot) {
        this.semantic_info = Optional.e(slot);
        return this;
    }

    @Required
    public CharacterRelationship setStart(Slot<Miai.Artist> slot) {
        this.start = slot;
        return this;
    }

    public CharacterRelationship(Slot<Miai.Artist> slot, Slot<Miai.Artist> slot2, Slot<Knowledge.Relation> slot3) {
        this.start = slot;
        this.end = slot2;
        this.relations = slot3;
    }
}
