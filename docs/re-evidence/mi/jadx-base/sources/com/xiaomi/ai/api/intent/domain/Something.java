package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class Something<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> trunk_query = Optional.a();
    private Optional<Slot<Integer>> specific_index = Optional.a();
    private Optional<Slot<String>> about_slot = Optional.a();

    public static Something read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Something something = new Something();
        if (zsdVar.z("trunk_query")) {
            something.setTrunkQuery(IntentUtils.readSlot(zsdVar.w("trunk_query"), String.class));
        }
        if (zsdVar.z("specific_index")) {
            something.setSpecificIndex(IntentUtils.readSlot(zsdVar.w("specific_index"), Integer.class));
        }
        if (zsdVar.z("about_slot")) {
            something.setAboutSlot(IntentUtils.readSlot(zsdVar.w("about_slot"), String.class));
        }
        return something;
    }

    public static zsd write(Something something) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (something.trunk_query.c()) {
            c4hVarCreateObjectNode.f0("trunk_query", IntentUtils.writeSlot(something.trunk_query.b()));
        }
        if (something.specific_index.c()) {
            c4hVarCreateObjectNode.f0("specific_index", IntentUtils.writeSlot(something.specific_index.b()));
        }
        if (something.about_slot.c()) {
            c4hVarCreateObjectNode.f0("about_slot", IntentUtils.writeSlot(something.about_slot.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getAboutSlot() {
        return this.about_slot;
    }

    public Optional<Slot<Integer>> getSpecificIndex() {
        return this.specific_index;
    }

    public Optional<Slot<String>> getTrunkQuery() {
        return this.trunk_query;
    }

    public Something setAboutSlot(Slot<String> slot) {
        this.about_slot = Optional.e(slot);
        return this;
    }

    public Something setSpecificIndex(Slot<Integer> slot) {
        this.specific_index = Optional.e(slot);
        return this;
    }

    public Something setTrunkQuery(Slot<String> slot) {
        this.trunk_query = Optional.e(slot);
        return this;
    }
}
