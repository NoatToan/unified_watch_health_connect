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
public class QQUser<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> name;

    public QQUser() {
    }

    public static QQUser read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        QQUser qQUser = new QQUser();
        qQUser.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        return qQUser;
    }

    public static zsd write(QQUser qQUser) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(qQUser.name));
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
    public QQUser setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public QQUser(Slot<String> slot) {
        this.name = slot;
    }
}
