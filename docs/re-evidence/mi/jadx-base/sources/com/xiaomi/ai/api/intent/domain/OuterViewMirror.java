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
public class OuterViewMirror<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class heating implements EntityType {
        public static heating read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new heating();
        }

        public static c4h write(heating heatingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public OuterViewMirror() {
    }

    public static OuterViewMirror read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new OuterViewMirror(IntentUtils.readEntityType(zsdVar, AIApiConstants.OuterViewMirror.NAME, optional));
    }

    public static zsd write(OuterViewMirror outerViewMirror) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(outerViewMirror.entity_type);
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
    public OuterViewMirror setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public OuterViewMirror(T t) {
        this.entity_type = t;
    }
}
