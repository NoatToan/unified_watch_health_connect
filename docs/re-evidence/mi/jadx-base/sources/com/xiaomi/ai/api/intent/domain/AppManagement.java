package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class AppManagement<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class __default implements EntityType {
        public static __default read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __default();
        }

        public static c4h write(__default __defaultVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class permission implements EntityType {
        public static permission read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new permission();
        }

        public static c4h write(permission permissionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public AppManagement() {
    }

    public static AppManagement read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new AppManagement(IntentUtils.readEntityType(zsdVar, AIApiConstants.AppManagement.NAME, optional));
    }

    public static zsd write(AppManagement appManagement) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(appManagement.entity_type);
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
    public AppManagement setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AppManagement(T t) {
        this.entity_type = t;
    }
}
