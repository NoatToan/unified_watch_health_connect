package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
public interface IHMDataCallback<T> {
    void onProgress(Progress progress);

    void onStart();

    void onStop(T t, HMDeviceError hMDeviceError);
}
