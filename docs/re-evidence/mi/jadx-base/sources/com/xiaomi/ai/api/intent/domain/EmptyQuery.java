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
public class EmptyQuery<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> latest_domain;

    public EmptyQuery() {
    }

    public static EmptyQuery read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        EmptyQuery emptyQuery = new EmptyQuery(IntentUtils.readEntityType(zsdVar, AIApiConstants.EmptyQuery.NAME, optional));
        emptyQuery.setLatestDomain(IntentUtils.readSlot(zsdVar.w("latest_domain"), String.class));
        return emptyQuery;
    }

    public static zsd write(EmptyQuery emptyQuery) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(emptyQuery.entity_type);
        c4hVar.f0("latest_domain", IntentUtils.writeSlot(emptyQuery.latest_domain));
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
    public Slot<String> getLatestDomain() {
        return this.latest_domain;
    }

    @Required
    public EmptyQuery setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public EmptyQuery setLatestDomain(Slot<String> slot) {
        this.latest_domain = slot;
        return this;
    }

    public EmptyQuery(T t) {
        this.entity_type = t;
    }

    public EmptyQuery(T t, Slot<String> slot) {
        this.entity_type = t;
        this.latest_domain = slot;
    }
}
