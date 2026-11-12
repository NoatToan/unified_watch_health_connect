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
public class TelephoneAssistant<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> package_name;

    public TelephoneAssistant() {
    }

    public static TelephoneAssistant read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TelephoneAssistant telephoneAssistant = new TelephoneAssistant();
        telephoneAssistant.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return telephoneAssistant;
    }

    public static zsd write(TelephoneAssistant telephoneAssistant) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("package_name", IntentUtils.writeSlot(telephoneAssistant.package_name));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getPackageName() {
        return this.package_name;
    }

    @Required
    public TelephoneAssistant setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public TelephoneAssistant(Slot<String> slot) {
        this.package_name = slot;
    }
}
