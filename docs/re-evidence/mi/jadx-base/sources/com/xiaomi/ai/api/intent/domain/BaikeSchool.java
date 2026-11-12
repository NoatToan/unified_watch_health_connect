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
public class BaikeSchool<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> attribute = Optional.a();
    private Optional<Slot<String>> special_name = Optional.a();
    private Optional<Slot<String>> school_attribute = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();

    public static class info implements EntityType {
        public static info read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new info();
        }

        public static c4h write(info infoVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public BaikeSchool() {
    }

    public static BaikeSchool read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BaikeSchool baikeSchool = new BaikeSchool(IntentUtils.readEntityType(zsdVar, AIApiConstants.BaikeSchool.NAME, optional));
        if (zsdVar.z("name")) {
            baikeSchool.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("type")) {
            baikeSchool.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("attribute")) {
            baikeSchool.setAttribute(IntentUtils.readSlot(zsdVar.w("attribute"), String.class));
        }
        if (zsdVar.z("special_name")) {
            baikeSchool.setSpecialName(IntentUtils.readSlot(zsdVar.w("special_name"), String.class));
        }
        if (zsdVar.z("school_attribute")) {
            baikeSchool.setSchoolAttribute(IntentUtils.readSlot(zsdVar.w("school_attribute"), String.class));
        }
        if (zsdVar.z("tag")) {
            baikeSchool.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        return baikeSchool;
    }

    public static zsd write(BaikeSchool baikeSchool) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(baikeSchool.entity_type);
        if (baikeSchool.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(baikeSchool.name.b()));
        }
        if (baikeSchool.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(baikeSchool.type.b()));
        }
        if (baikeSchool.attribute.c()) {
            c4hVar.f0("attribute", IntentUtils.writeSlot(baikeSchool.attribute.b()));
        }
        if (baikeSchool.special_name.c()) {
            c4hVar.f0("special_name", IntentUtils.writeSlot(baikeSchool.special_name.b()));
        }
        if (baikeSchool.school_attribute.c()) {
            c4hVar.f0("school_attribute", IntentUtils.writeSlot(baikeSchool.school_attribute.b()));
        }
        if (baikeSchool.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(baikeSchool.tag.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAttribute() {
        return this.attribute;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getSchoolAttribute() {
        return this.school_attribute;
    }

    public Optional<Slot<String>> getSpecialName() {
        return this.special_name;
    }

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    public BaikeSchool setAttribute(Slot<String> slot) {
        this.attribute = Optional.e(slot);
        return this;
    }

    @Required
    public BaikeSchool setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public BaikeSchool setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public BaikeSchool setSchoolAttribute(Slot<String> slot) {
        this.school_attribute = Optional.e(slot);
        return this;
    }

    public BaikeSchool setSpecialName(Slot<String> slot) {
        this.special_name = Optional.e(slot);
        return this;
    }

    public BaikeSchool setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public BaikeSchool setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public BaikeSchool(T t) {
        this.entity_type = t;
    }
}
