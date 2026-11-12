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
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Composition<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> tag;

    @Required
    private Slot<String> type;
    private Optional<Slot<String>> school = Optional.a();
    private Optional<Slot<String>> grade = Optional.a();
    private Optional<Slot<Integer>> number = Optional.a();
    private Optional<Slot<String>> name = Optional.a();

    public static class name implements EntityType {
        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new name();
        }

        public static c4h write(name nameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tag implements EntityType {
        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tag();
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Composition() {
    }

    public static Composition read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Composition composition = new Composition(IntentUtils.readEntityType(zsdVar, AIApiConstants.Composition.NAME, optional));
        composition.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        composition.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        if (zsdVar.z("school")) {
            composition.setSchool(IntentUtils.readSlot(zsdVar.w("school"), String.class));
        }
        if (zsdVar.z("grade")) {
            composition.setGrade(IntentUtils.readSlot(zsdVar.w("grade"), String.class));
        }
        if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
            composition.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Integer.class));
        }
        if (zsdVar.z("name")) {
            composition.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return composition;
    }

    public static zsd write(Composition composition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(composition.entity_type);
        c4hVar.f0("type", IntentUtils.writeSlot(composition.type));
        c4hVar.f0("tag", IntentUtils.writeSlot(composition.tag));
        if (composition.school.c()) {
            c4hVar.f0("school", IntentUtils.writeSlot(composition.school.b()));
        }
        if (composition.grade.c()) {
            c4hVar.f0("grade", IntentUtils.writeSlot(composition.grade.b()));
        }
        if (composition.number.c()) {
            c4hVar.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(composition.number.b()));
        }
        if (composition.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(composition.name.b()));
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

    public Optional<Slot<String>> getGrade() {
        return this.grade;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Integer>> getNumber() {
        return this.number;
    }

    public Optional<Slot<String>> getSchool() {
        return this.school;
    }

    @Required
    public Slot<String> getTag() {
        return this.tag;
    }

    @Required
    public Slot<String> getType() {
        return this.type;
    }

    @Required
    public Composition setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Composition setGrade(Slot<String> slot) {
        this.grade = Optional.e(slot);
        return this;
    }

    public Composition setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Composition setNumber(Slot<Integer> slot) {
        this.number = Optional.e(slot);
        return this;
    }

    public Composition setSchool(Slot<String> slot) {
        this.school = Optional.e(slot);
        return this;
    }

    @Required
    public Composition setTag(Slot<String> slot) {
        this.tag = slot;
        return this;
    }

    @Required
    public Composition setType(Slot<String> slot) {
        this.type = slot;
        return this;
    }

    public Composition(T t) {
        this.entity_type = t;
    }

    public Composition(T t, Slot<String> slot, Slot<String> slot2) {
        this.entity_type = t;
        this.type = slot;
        this.tag = slot2;
    }
}
