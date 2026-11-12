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
public class AllKnowing<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> source_domain;

    @Required
    private Slot<String> topic_name;

    @Required
    private Slot<String> topic_to_speak;

    @Required
    private Slot<String> topic_type;
    private Optional<Slot<String>> topic_domain = Optional.a();
    private Optional<Slot<String>> claim_result = Optional.a();

    public AllKnowing() {
    }

    public static AllKnowing read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AllKnowing allKnowing = new AllKnowing();
        allKnowing.setTopicName(IntentUtils.readSlot(zsdVar.w("topic_name"), String.class));
        allKnowing.setTopicType(IntentUtils.readSlot(zsdVar.w("topic_type"), String.class));
        allKnowing.setTopicToSpeak(IntentUtils.readSlot(zsdVar.w("topic_to_speak"), String.class));
        allKnowing.setSourceDomain(IntentUtils.readSlot(zsdVar.w("source_domain"), String.class));
        if (zsdVar.z("topic_domain")) {
            allKnowing.setTopicDomain(IntentUtils.readSlot(zsdVar.w("topic_domain"), String.class));
        }
        if (zsdVar.z("claim_result")) {
            allKnowing.setClaimResult(IntentUtils.readSlot(zsdVar.w("claim_result"), String.class));
        }
        return allKnowing;
    }

    public static zsd write(AllKnowing allKnowing) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("topic_name", IntentUtils.writeSlot(allKnowing.topic_name));
        c4hVarCreateObjectNode.f0("topic_type", IntentUtils.writeSlot(allKnowing.topic_type));
        c4hVarCreateObjectNode.f0("topic_to_speak", IntentUtils.writeSlot(allKnowing.topic_to_speak));
        c4hVarCreateObjectNode.f0("source_domain", IntentUtils.writeSlot(allKnowing.source_domain));
        if (allKnowing.topic_domain.c()) {
            c4hVarCreateObjectNode.f0("topic_domain", IntentUtils.writeSlot(allKnowing.topic_domain.b()));
        }
        if (allKnowing.claim_result.c()) {
            c4hVarCreateObjectNode.f0("claim_result", IntentUtils.writeSlot(allKnowing.claim_result.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getClaimResult() {
        return this.claim_result;
    }

    @Required
    public Slot<String> getSourceDomain() {
        return this.source_domain;
    }

    public Optional<Slot<String>> getTopicDomain() {
        return this.topic_domain;
    }

    @Required
    public Slot<String> getTopicName() {
        return this.topic_name;
    }

    @Required
    public Slot<String> getTopicToSpeak() {
        return this.topic_to_speak;
    }

    @Required
    public Slot<String> getTopicType() {
        return this.topic_type;
    }

    public AllKnowing setClaimResult(Slot<String> slot) {
        this.claim_result = Optional.e(slot);
        return this;
    }

    @Required
    public AllKnowing setSourceDomain(Slot<String> slot) {
        this.source_domain = slot;
        return this;
    }

    public AllKnowing setTopicDomain(Slot<String> slot) {
        this.topic_domain = Optional.e(slot);
        return this;
    }

    @Required
    public AllKnowing setTopicName(Slot<String> slot) {
        this.topic_name = slot;
        return this;
    }

    @Required
    public AllKnowing setTopicToSpeak(Slot<String> slot) {
        this.topic_to_speak = slot;
        return this;
    }

    @Required
    public AllKnowing setTopicType(Slot<String> slot) {
        this.topic_type = slot;
        return this;
    }

    public AllKnowing(Slot<String> slot, Slot<String> slot2, Slot<String> slot3, Slot<String> slot4) {
        this.topic_name = slot;
        this.topic_type = slot2;
        this.topic_to_speak = slot3;
        this.source_domain = slot4;
    }
}
