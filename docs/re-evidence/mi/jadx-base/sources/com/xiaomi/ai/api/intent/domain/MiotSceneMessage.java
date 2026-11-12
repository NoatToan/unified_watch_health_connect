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
public class MiotSceneMessage<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> text = Optional.a();

    public MiotSceneMessage() {
    }

    public static MiotSceneMessage read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MiotSceneMessage miotSceneMessage = new MiotSceneMessage(IntentUtils.readEntityType(zsdVar, AIApiConstants.MiotSceneMessage.NAME, optional));
        if (zsdVar.z("text")) {
            miotSceneMessage.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
        }
        return miotSceneMessage;
    }

    public static zsd write(MiotSceneMessage miotSceneMessage) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(miotSceneMessage.entity_type);
        if (miotSceneMessage.text.c()) {
            c4hVar.f0("text", IntentUtils.writeSlot(miotSceneMessage.text.b()));
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

    public Optional<Slot<String>> getText() {
        return this.text;
    }

    @Required
    public MiotSceneMessage setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MiotSceneMessage setText(Slot<String> slot) {
        this.text = Optional.e(slot);
        return this;
    }

    public MiotSceneMessage(T t) {
        this.entity_type = t;
    }
}
