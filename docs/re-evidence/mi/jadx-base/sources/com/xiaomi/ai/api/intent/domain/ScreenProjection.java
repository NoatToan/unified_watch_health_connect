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
public class ScreenProjection<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class privacyProtection implements EntityType {
        public static privacyProtection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new privacyProtection();
        }

        public static c4h write(privacyProtection privacyprotection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class restScreen implements EntityType {
        public static restScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new restScreen();
        }

        public static c4h write(restScreen restscreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class smallWindow implements EntityType {
        public static smallWindow read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new smallWindow();
        }

        public static c4h write(smallWindow smallwindow) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public ScreenProjection() {
    }

    public static ScreenProjection read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new ScreenProjection(IntentUtils.readEntityType(zsdVar, AIApiConstants.ScreenProjection.NAME, optional));
    }

    public static zsd write(ScreenProjection screenProjection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(screenProjection.entity_type);
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
    public ScreenProjection setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ScreenProjection(T t) {
        this.entity_type = t;
    }
}
