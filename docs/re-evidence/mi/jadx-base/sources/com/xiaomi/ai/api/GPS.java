package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;

/* JADX INFO: loaded from: classes6.dex */
public class GPS {

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Switch.NAME, namespace = "GPS")
    public static class Switch implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOff", namespace = "GPS")
    public static class TurnOff implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOn", namespace = "GPS")
    public static class TurnOn implements InstructionPayload {
    }
}
