package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback;

/* JADX INFO: loaded from: classes18.dex */
public interface IHMFirstbeatDataCallback extends IHMGpsDataCallback {
    void onFirstbeatData(BleFirstbeatData data);
}
