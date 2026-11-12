package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class Covid19Service<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> service_name;

    public Covid19Service() {
    }

    public static Covid19Service read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Covid19Service covid19Service = new Covid19Service();
        covid19Service.setServiceName(IntentUtils.readSlot(zsdVar.w("service_name"), String.class));
        return covid19Service;
    }

    public static zsd write(Covid19Service covid19Service) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("service_name", IntentUtils.writeSlot(covid19Service.service_name));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getServiceName() {
        return this.service_name;
    }

    @Required
    public Covid19Service setServiceName(Slot<String> slot) {
        this.service_name = slot;
        return this;
    }

    public Covid19Service(Slot<String> slot) {
        this.service_name = slot;
    }
}
