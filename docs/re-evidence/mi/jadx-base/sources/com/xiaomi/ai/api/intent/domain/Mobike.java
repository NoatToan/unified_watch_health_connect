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
public class Mobike<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;

    public static class code implements EntityType {

        @Required
        private Slot<Long> value;

        public code() {
        }

        public code(Slot<Long> slot) {
            this.value = slot;
        }

        public static code read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            code codeVar = new code();
            codeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Long.class));
            return codeVar;
        }

        public static c4h write(code codeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(codeVar.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Long> getValue() {
            return this.value;
        }

        @Required
        public code setValue(Slot<Long> slot) {
            this.value = slot;
            return this;
        }
    }

    public static class page implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static page read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            page pageVar = new page();
            if (zsdVar.z("name")) {
                pageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return pageVar;
        }

        public static c4h write(page pageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (pageVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(pageVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public page setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Mobike() {
    }

    public static Mobike read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Mobike mobike = new Mobike(IntentUtils.readEntityType(zsdVar, AIApiConstants.Mobike.NAME, optional));
        mobike.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return mobike;
    }

    public static zsd write(Mobike mobike) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(mobike.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(mobike.package_name));
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
    public Slot<String> getPackageName() {
        return this.package_name;
    }

    @Required
    public Mobike setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public Mobike setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public Mobike(T t) {
        this.entity_type = t;
    }

    public Mobike(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
