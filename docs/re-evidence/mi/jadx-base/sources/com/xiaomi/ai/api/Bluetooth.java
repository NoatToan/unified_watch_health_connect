package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;

/* JADX INFO: loaded from: classes6.dex */
public class Bluetooth {

    @NamespaceName(name = "Connect", namespace = "Bluetooth")
    public static class Connect implements InstructionPayload {
    }

    @NamespaceName(name = "Disconnect", namespace = "Bluetooth")
    public static class Disconnect implements InstructionPayload {
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Switch.NAME, namespace = "Bluetooth")
    public static class Switch implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOff", namespace = "Bluetooth")
    public static class TurnOff implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOn", namespace = "Bluetooth")
    public static class TurnOn implements InstructionPayload {
    }
}
