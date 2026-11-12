package com.xiaomi.hm.health.bt.profile.smartwatch.health;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;

/* JADX INFO: loaded from: classes18.dex */
public interface IHMHealthDataCallback extends IHMActivityDataCallback {
    void onSyncStop(BleHealthData healthData);
}
