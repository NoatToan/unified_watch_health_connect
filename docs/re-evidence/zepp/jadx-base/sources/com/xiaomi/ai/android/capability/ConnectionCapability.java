package com.xiaomi.ai.android.capability;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ConnectionCapability implements Capability {
    public abstract void onConnected();

    public abstract void onDisconnected();

    public abstract String onGetSSID();

    public void onLastPackageSend(String str) {
    }
}
