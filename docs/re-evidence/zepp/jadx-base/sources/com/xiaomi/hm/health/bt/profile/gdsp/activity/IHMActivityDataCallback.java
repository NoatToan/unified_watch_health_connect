package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface IHMActivityDataCallback {
    void onSyncFinish(HMDeviceSyncDataError error);

    void onSyncProgress(Progress progress);

    void onSyncStart();

    void onSyncStop(List<ActivityDataFragment> dataFragmentList);
}
