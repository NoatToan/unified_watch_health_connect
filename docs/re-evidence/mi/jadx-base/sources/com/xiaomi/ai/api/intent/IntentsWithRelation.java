package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xiaomi.common.Optional;
import defpackage.add;
import defpackage.bdd;
import defpackage.dsd;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dsd(using = add.class)
@JsonSerialize(using = bdd.class)
public abstract class IntentsWithRelation {
    public abstract List<IntentExecutor> executors();

    public Optional<String> intentName() {
        return Optional.e(intents().isEmpty() ? null : intents().get(0).getName());
    }

    public abstract List<Intention> intents();

    public abstract List<SelfRelation> relationFlatten();

    public String toJsonString() throws JsonProcessingException {
        return IntentUtils.toJsonString(this);
    }

    public String toString() {
        try {
            return IntentUtils.toJsonString(IntentUtils.writeIntentsWithRelation(this));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
