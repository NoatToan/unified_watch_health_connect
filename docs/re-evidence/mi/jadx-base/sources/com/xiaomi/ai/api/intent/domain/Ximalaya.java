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
public class Ximalaya<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;

    public static class history implements EntityType {
        public static history read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new history();
        }

        public static c4h write(history historyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class local implements EntityType {
        public static local read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new local();
        }

        public static c4h write(local localVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Ximalaya() {
    }

    public static Ximalaya read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Ximalaya ximalaya = new Ximalaya(IntentUtils.readEntityType(zsdVar, AIApiConstants.Ximalaya.NAME, optional));
        ximalaya.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return ximalaya;
    }

    public static zsd write(Ximalaya ximalaya) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(ximalaya.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(ximalaya.package_name));
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
    public Ximalaya setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public Ximalaya setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public Ximalaya(T t) {
        this.entity_type = t;
    }

    public Ximalaya(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
