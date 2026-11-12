package com.xiaomi.smarthome.library.bluetooth;

/* JADX INFO: loaded from: classes2.dex */
public class Constants {
    public static final int STATUS_DEVICE_CONNECTED = 2;
    public static final int STATUS_DEVICE_CONNECTING = 1;
    public static final int STATUS_DEVICE_DISCONNECTED = 0;
    public static final int STATUS_DEVICE_DISCONNECTING = 3;
    public static final int STATUS_DEVICE_SERVICE_READY = 19;

    public static String getStatusText(int i) {
        if (i == 0) {
            return "Disconnected";
        }
        if (i == 1) {
            return "Connecting";
        }
        if (i == 2) {
            return "Connected";
        }
        if (i != 3) {
            return i != 19 ? String.format("Unknown %d", Integer.valueOf(i)) : "Service Ready";
        }
        return "Disconnecting";
    }
}
