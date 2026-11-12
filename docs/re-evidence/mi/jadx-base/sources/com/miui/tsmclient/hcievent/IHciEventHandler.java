package com.miui.tsmclient.hcievent;

/* JADX INFO: loaded from: classes6.dex */
public interface IHciEventHandler {
    HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2);

    boolean isSupport(byte[] bArr, byte[] bArr2);
}
