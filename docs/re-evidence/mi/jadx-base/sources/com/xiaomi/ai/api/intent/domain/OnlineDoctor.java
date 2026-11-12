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
public class OnlineDoctor<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> disease_name;

    public OnlineDoctor() {
    }

    public static OnlineDoctor read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        OnlineDoctor onlineDoctor = new OnlineDoctor();
        onlineDoctor.setDiseaseName(IntentUtils.readSlot(zsdVar.w("disease_name"), String.class));
        return onlineDoctor;
    }

    public static zsd write(OnlineDoctor onlineDoctor) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("disease_name", IntentUtils.writeSlot(onlineDoctor.disease_name));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getDiseaseName() {
        return this.disease_name;
    }

    @Required
    public OnlineDoctor setDiseaseName(Slot<String> slot) {
        this.disease_name = slot;
        return this;
    }

    public OnlineDoctor(Slot<String> slot) {
        this.disease_name = slot;
    }
}
