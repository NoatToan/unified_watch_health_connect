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

/* JADX INFO: loaded from: classes7.dex */
public class FindXiaoai<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> resource_id = Optional.a();
    private Optional<Slot<String>> phone_brief = Optional.a();

    public FindXiaoai() {
    }

    public static FindXiaoai read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        FindXiaoai findXiaoai = new FindXiaoai(IntentUtils.readEntityType(zsdVar, AIApiConstants.FindXiaoai.NAME, optional));
        findXiaoai.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("resource_id")) {
            findXiaoai.setResourceId(IntentUtils.readSlot(zsdVar.w("resource_id"), String.class));
        }
        if (zsdVar.z("phone_brief")) {
            findXiaoai.setPhoneBrief(IntentUtils.readSlot(zsdVar.w("phone_brief"), String.class));
        }
        return findXiaoai;
    }

    public static zsd write(FindXiaoai findXiaoai) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(findXiaoai.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(findXiaoai.name));
        if (findXiaoai.resource_id.c()) {
            c4hVar.f0("resource_id", IntentUtils.writeSlot(findXiaoai.resource_id.b()));
        }
        if (findXiaoai.phone_brief.c()) {
            c4hVar.f0("phone_brief", IntentUtils.writeSlot(findXiaoai.phone_brief.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPhoneBrief() {
        return this.phone_brief;
    }

    public Optional<Slot<String>> getResourceId() {
        return this.resource_id;
    }

    @Required
    public FindXiaoai setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public FindXiaoai setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public FindXiaoai setPhoneBrief(Slot<String> slot) {
        this.phone_brief = Optional.e(slot);
        return this;
    }

    public FindXiaoai setResourceId(Slot<String> slot) {
        this.resource_id = Optional.e(slot);
        return this;
    }

    public FindXiaoai(T t) {
        this.entity_type = t;
    }

    public FindXiaoai(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
