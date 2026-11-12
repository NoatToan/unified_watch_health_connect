package com.xiaomi.hm.health.bt.profile.gdsp.activity;

/* JADX INFO: loaded from: classes14.dex */
public interface IDataCallback {
    void onDataMissing();

    void onDataReceived(byte[] data);
}
