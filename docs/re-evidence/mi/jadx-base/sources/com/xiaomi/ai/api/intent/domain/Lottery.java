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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Lottery<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> category = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> issue = Optional.a();
    private Optional<Slot<Miai.Datetime>> src_time = Optional.a();

    public static class drawResult implements EntityType {
        public static drawResult read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new drawResult();
        }

        public static c4h write(drawResult drawresult) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class drawTime implements EntityType {
        public static drawTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new drawTime();
        }

        public static c4h write(drawTime drawtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class introduction implements EntityType {
        public static introduction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new introduction();
        }

        public static c4h write(introduction introductionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class trend implements EntityType {
        public static trend read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new trend();
        }

        public static c4h write(trend trendVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Lottery() {
    }

    public static Lottery read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Lottery lottery = new Lottery(IntentUtils.readEntityType(zsdVar, AIApiConstants.Lottery.NAME, optional));
        if (zsdVar.z("name")) {
            lottery.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("category")) {
            lottery.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
        }
        if (zsdVar.z("type")) {
            lottery.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("issue")) {
            lottery.setIssue(IntentUtils.readSlot(zsdVar.w("issue"), String.class));
        }
        if (zsdVar.z("src_time")) {
            lottery.setSrcTime(IntentUtils.readSlot(zsdVar.w("src_time"), Miai.Datetime.class));
        }
        return lottery;
    }

    public static zsd write(Lottery lottery) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(lottery.entity_type);
        if (lottery.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(lottery.name.b()));
        }
        if (lottery.category.c()) {
            c4hVar.f0("category", IntentUtils.writeSlot(lottery.category.b()));
        }
        if (lottery.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(lottery.type.b()));
        }
        if (lottery.issue.c()) {
            c4hVar.f0("issue", IntentUtils.writeSlot(lottery.issue.b()));
        }
        if (lottery.src_time.c()) {
            c4hVar.f0("src_time", IntentUtils.writeSlot(lottery.src_time.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getCategory() {
        return this.category;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getIssue() {
        return this.issue;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Miai.Datetime>> getSrcTime() {
        return this.src_time;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    public Lottery setCategory(Slot<String> slot) {
        this.category = Optional.e(slot);
        return this;
    }

    @Required
    public Lottery setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Lottery setIssue(Slot<String> slot) {
        this.issue = Optional.e(slot);
        return this;
    }

    public Lottery setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Lottery setSrcTime(Slot<Miai.Datetime> slot) {
        this.src_time = Optional.e(slot);
        return this;
    }

    public Lottery setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public Lottery(T t) {
        this.entity_type = t;
    }
}
