package com.airoha.android.lib.transport;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public interface ITransport {
    void OnPhysicalConnected(String str);

    void OnPhysicalConnectionError(String str);

    void OnPhysicalDisconnected(String str);

    Context getContext();

    void handlePhysicalPacket(byte[] bArr);

    void logToFile(String str, String str2);

    void stopTimerForCheckProfile();
}
