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
public class TVPort<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Integer>> hdmi_port = Optional.a();

    public static TVPort read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TVPort tVPort = new TVPort();
        if (zsdVar.z("hdmi_port")) {
            tVPort.setHdmiPort(IntentUtils.readSlot(zsdVar.w("hdmi_port"), Integer.class));
        }
        return tVPort;
    }

    public static zsd write(TVPort tVPort) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (tVPort.hdmi_port.c()) {
            c4hVarCreateObjectNode.f0("hdmi_port", IntentUtils.writeSlot(tVPort.hdmi_port.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Integer>> getHdmiPort() {
        return this.hdmi_port;
    }

    public TVPort setHdmiPort(Slot<Integer> slot) {
        this.hdmi_port = Optional.e(slot);
        return this;
    }
}
