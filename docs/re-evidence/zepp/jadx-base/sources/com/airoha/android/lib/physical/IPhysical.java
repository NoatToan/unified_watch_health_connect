package com.airoha.android.lib.physical;

/* JADX INFO: loaded from: classes2.dex */
public interface IPhysical {
    boolean connect(String str);

    void disconnect();

    void notifyConnected();

    void notifyConnectionError(String str);

    void notifyDisconnected();

    String typeName();

    boolean write(byte[] bArr);
}
