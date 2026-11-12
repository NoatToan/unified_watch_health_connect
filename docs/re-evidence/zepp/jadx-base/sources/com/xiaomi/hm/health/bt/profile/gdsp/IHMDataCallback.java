package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes13.dex */
public interface IHMDataCallback<T> {
    void onProgress(Progress progress);

    void onStart();

    void onStop(T data, HMDeviceError error);
}
