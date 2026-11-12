package com.xiaomi.hm.health.bt.profile.observe;

/* JADX INFO: loaded from: classes18.dex */
public interface TransferObservable {
    void onRead(byte[] readValue);

    void onWrite(byte[] writeValue);
}
