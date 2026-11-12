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
public class AliPayUser<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> name;

    public AliPayUser() {
    }

    public static AliPayUser read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AliPayUser aliPayUser = new AliPayUser();
        aliPayUser.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        return aliPayUser;
    }

    public static zsd write(AliPayUser aliPayUser) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(aliPayUser.name));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    @Required
    public AliPayUser setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public AliPayUser(Slot<String> slot) {
        this.name = slot;
    }
}
