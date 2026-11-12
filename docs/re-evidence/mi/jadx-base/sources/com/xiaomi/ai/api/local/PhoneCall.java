package com.xiaomi.ai.api.local;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.NamespaceName;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCall {

    @NamespaceName(name = "BluetoothDeviceChanged", namespace = "Internal")
    public static class BluetoothDeviceChanged implements EventPayload {
    }

    @NamespaceName(name = "BluetoothDisconnected", namespace = "Internal")
    public static class BluetoothDisconnected implements EventPayload {
    }

    @NamespaceName(name = "PhoneCallCancelDial", namespace = "Internal")
    public static class PhoneCallCancelDial implements EventPayload {
    }

    @NamespaceName(name = "PhoneCallConfirmDial", namespace = "Internal")
    public static class PhoneCallConfirmDial implements EventPayload {
    }
}
