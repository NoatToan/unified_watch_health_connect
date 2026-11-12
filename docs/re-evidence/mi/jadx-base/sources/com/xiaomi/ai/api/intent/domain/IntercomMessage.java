package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class IntercomMessage<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> text = Optional.a();

    public static IntercomMessage read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        IntercomMessage intercomMessage = new IntercomMessage();
        if (zsdVar.z("text")) {
            intercomMessage.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
        }
        return intercomMessage;
    }

    public static zsd write(IntercomMessage intercomMessage) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (intercomMessage.text.c()) {
            c4hVarCreateObjectNode.f0("text", IntentUtils.writeSlot(intercomMessage.text.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getText() {
        return this.text;
    }

    public IntercomMessage setText(Slot<String> slot) {
        this.text = Optional.e(slot);
        return this;
    }
}
