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
public class Cleaner<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Boolean>> is_deep = Optional.a();

    public static class memory implements EntityType {
        public static memory read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new memory();
        }

        public static c4h write(memory memoryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class qq implements EntityType {
        public static qq read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new qq();
        }

        public static c4h write(qq qqVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class weChat implements EntityType {
        public static weChat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new weChat();
        }

        public static c4h write(weChat wechat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Cleaner() {
    }

    public static Cleaner read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Cleaner cleaner = new Cleaner(IntentUtils.readEntityType(zsdVar, AIApiConstants.Cleaner.NAME, optional));
        if (zsdVar.z("is_deep")) {
            cleaner.setIsDeep(IntentUtils.readSlot(zsdVar.w("is_deep"), Boolean.class));
        }
        return cleaner;
    }

    public static zsd write(Cleaner cleaner) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(cleaner.entity_type);
        if (cleaner.is_deep.c()) {
            c4hVar.f0("is_deep", IntentUtils.writeSlot(cleaner.is_deep.b()));
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

    public Optional<Slot<Boolean>> getIsDeep() {
        return this.is_deep;
    }

    @Required
    public Cleaner setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Cleaner setIsDeep(Slot<Boolean> slot) {
        this.is_deep = Optional.e(slot);
        return this;
    }

    public Cleaner(T t) {
        this.entity_type = t;
    }
}
