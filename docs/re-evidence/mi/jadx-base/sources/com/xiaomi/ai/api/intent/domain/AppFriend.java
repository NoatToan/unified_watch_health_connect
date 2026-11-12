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
public class AppFriend<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> name;

    public AppFriend() {
    }

    public static AppFriend read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AppFriend appFriend = new AppFriend();
        appFriend.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        return appFriend;
    }

    public static zsd write(AppFriend appFriend) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(appFriend.name));
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
    public AppFriend setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public AppFriend(Slot<String> slot) {
        this.name = slot;
    }
}
