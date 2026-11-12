package com.huawei.healthcloud.plugintrack.golf.device;

/* JADX INFO: loaded from: classes10.dex */
public interface GolfDataReceiver {
    boolean isMatch(int i);

    void onDataReceived(GolfMsgHeader golfMsgHeader, int i, byte[] bArr);
}
