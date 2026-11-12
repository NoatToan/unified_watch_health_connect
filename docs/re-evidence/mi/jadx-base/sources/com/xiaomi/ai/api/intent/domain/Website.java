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
public class Website<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> text = Optional.a();

    public static Website read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Website website = new Website();
        if (zsdVar.z("name")) {
            website.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("text")) {
            website.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
        }
        return website;
    }

    public static zsd write(Website website) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (website.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(website.name.b()));
        }
        if (website.text.c()) {
            c4hVarCreateObjectNode.f0("text", IntentUtils.writeSlot(website.text.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getText() {
        return this.text;
    }

    public Website setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Website setText(Slot<String> slot) {
        this.text = Optional.e(slot);
        return this;
    }
}
