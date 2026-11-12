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
public class MiotScene<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();

    public MiotScene() {
    }

    public static MiotScene read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MiotScene miotScene = new MiotScene(IntentUtils.readEntityType(zsdVar, AIApiConstants.MiotScene.NAME, optional));
        if (zsdVar.z("name")) {
            miotScene.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return miotScene;
    }

    public static zsd write(MiotScene miotScene) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(miotScene.entity_type);
        if (miotScene.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(miotScene.name.b()));
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

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    @Required
    public MiotScene setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MiotScene setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public MiotScene(T t) {
        this.entity_type = t;
    }
}
