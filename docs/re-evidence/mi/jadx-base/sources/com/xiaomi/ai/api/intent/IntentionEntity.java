package com.xiaomi.ai.api.intent;

import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IntentionEntity<A extends EntityType, B extends EntityType> {
    public abstract A __1();

    public action.EntityName entityName() {
        Class<?> cls = __1().getClass();
        Optional optionalA = Optional.a();
        if (cls != general.class) {
            optionalA = Optional.d(cls.getSimpleName());
        }
        return new action.EntityName(getClass().getSimpleName(), optionalA);
    }
}
