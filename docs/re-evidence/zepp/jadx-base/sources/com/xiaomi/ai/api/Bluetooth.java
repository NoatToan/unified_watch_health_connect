package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;

/* JADX INFO: loaded from: classes18.dex */
public class Bluetooth {

    @NamespaceName(name = ConstantKt.STAGE_CONNECT, namespace = AIApiConstants.Bluetooth.NAME)
    public static class Connect implements InstructionPayload {
    }

    @NamespaceName(name = "Disconnect", namespace = AIApiConstants.Bluetooth.NAME)
    public static class Disconnect implements InstructionPayload {
    }

    @NamespaceName(name = "Switch", namespace = AIApiConstants.Bluetooth.NAME)
    public static class Switch implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOff", namespace = AIApiConstants.Bluetooth.NAME)
    public static class TurnOff implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOn", namespace = AIApiConstants.Bluetooth.NAME)
    public static class TurnOn implements InstructionPayload {
    }
}
