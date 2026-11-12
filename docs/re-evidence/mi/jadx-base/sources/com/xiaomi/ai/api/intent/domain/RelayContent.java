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
public class RelayContent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> content_type = Optional.a();

    public static RelayContent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        RelayContent relayContent = new RelayContent();
        if (zsdVar.z("content_type")) {
            relayContent.setContentType(IntentUtils.readSlot(zsdVar.w("content_type"), String.class));
        }
        return relayContent;
    }

    public static zsd write(RelayContent relayContent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (relayContent.content_type.c()) {
            c4hVarCreateObjectNode.f0("content_type", IntentUtils.writeSlot(relayContent.content_type.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getContentType() {
        return this.content_type;
    }

    public RelayContent setContentType(Slot<String> slot) {
        this.content_type = Optional.e(slot);
        return this;
    }
}
