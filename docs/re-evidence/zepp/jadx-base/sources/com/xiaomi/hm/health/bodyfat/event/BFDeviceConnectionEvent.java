package com.xiaomi.hm.health.bodyfat.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes19.dex */
public class BFDeviceConnectionEvent {
    public static final int CONNECTED = 1;
    public static final int CONNECTING = 0;
    public static final int CONNECTING_TIMEOUT = 3;
    public static final int DISCONNECTED = 2;
    private int a;
    private HMDeviceType b;

    public BFDeviceConnectionEvent(int i, HMDeviceType hMDeviceType) {
        this.a = 0;
        this.b = HMDeviceType.MILI;
        this.b = hMDeviceType;
        this.a = i;
    }

    public HMDeviceType getDeviceType() {
        return this.b;
    }

    public boolean isConnected() {
        return this.a == 1;
    }

    public boolean isConnecting() {
        return this.a == 0;
    }

    public boolean isConnectingTimeout() {
        return this.a == 3;
    }

    public boolean isDisconnected() {
        return this.a == 2;
    }

    public String toString() {
        return "HMDeviceConnectionEvent{deviceType=" + getDeviceType() + ", mConnectionType=" + this.a + '}';
    }
}
