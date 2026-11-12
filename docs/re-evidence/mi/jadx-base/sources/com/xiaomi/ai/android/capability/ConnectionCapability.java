package com.xiaomi.ai.android.capability;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ConnectionCapability implements Capability {
    public abstract void onConnected();

    public void onDetectWeakNetwork(String str) {
    }

    public abstract void onDisconnected();

    public abstract String onGetSSID();

    public void onLastPackageSend(String str) {
    }

    public void onPingTimeout() {
    }
}
