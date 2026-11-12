package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class TVChannel<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Integer>> number = Optional.a();
    private Optional<Slot<String>> name = Optional.a();

    public static TVChannel read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TVChannel tVChannel = new TVChannel();
        if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
            tVChannel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Integer.class));
        }
        if (zsdVar.z("name")) {
            tVChannel.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return tVChannel;
    }

    public static zsd write(TVChannel tVChannel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (tVChannel.number.c()) {
            c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(tVChannel.number.b()));
        }
        if (tVChannel.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tVChannel.name.b()));
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

    public Optional<Slot<Integer>> getNumber() {
        return this.number;
    }

    public TVChannel setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public TVChannel setNumber(Slot<Integer> slot) {
        this.number = Optional.e(slot);
        return this;
    }
}
