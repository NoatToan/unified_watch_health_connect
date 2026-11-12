package com.huawei.operation.h5pro.preload;

import android.content.Context;
import com.huawei.health.h5pro.preload.IH5PreloadStrategy;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qst;
import health.compact.a.BuildTypeConfig;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class H5PreloadDeviceStrategy implements IH5PreloadStrategy {
    private static final long H5_DEVICE_PRELOAD_INTERVAL = 43200000;
    private static final long H5_DEVICE_RELEASE_PRELOAD_INTERVAL = 2592000000L;
    private static final String TAG = "H5Pro_H5PreloadDeviceStrategy";

    @Override // com.huawei.health.h5pro.preload.IH5PreloadStrategy
    public boolean isPreLoadNow(Context context, String str) {
        LogUtil.a(TAG, "name:", str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!qst.c()) {
            return false;
        }
        long jD = SharedPreferenceManager.d(Integer.toString(10000), TAG + str, 0L);
        long j = BuildTypeConfig.e() ? H5_DEVICE_RELEASE_PRELOAD_INTERVAL : 43200000L;
        long j2 = jCurrentTimeMillis - jD;
        LogUtil.a(TAG, "now:", Long.valueOf(jCurrentTimeMillis), ",lastPreLoadTime:", Long.valueOf(jD), ",lastLoadInterval:", Long.valueOf(j2));
        if (j2 < j) {
            return false;
        }
        SharedPreferenceManager.c(Integer.toString(10000), TAG + str, jCurrentTimeMillis);
        LogUtil.a(TAG, "isPreLoadNow:true,set PreLoadTime", Long.valueOf(jCurrentTimeMillis));
        return true;
    }
}
