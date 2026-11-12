package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceConnectionEvent extends HMDeviceEvent {
    public static final int CONNECTED = 1;
    public static final int CONNECTING = 0;
    public static final int CONNECTING_TIMEOUT = 3;
    public static final int DISCONNECTED = 2;
    private int b;

    public HMDeviceConnectionEvent(int i, HMDeviceType hMDeviceType) {
        super(hMDeviceType);
        this.b = 0;
        this.b = i;
    }

    public int getConnectionType() {
        return this.b;
    }

    public boolean isConnected() {
        return this.b == 1;
    }

    public boolean isConnecting() {
        return this.b == 0;
    }

    public boolean isConnectingTimeout() {
        return this.b == 3;
    }

    public boolean isDisconnected() {
        return this.b == 2;
    }

    public String toString() {
        return "HMDeviceConnectionEvent{deviceType=" + getDeviceType() + ", mConnectionType=" + this.b + '}';
    }
}
