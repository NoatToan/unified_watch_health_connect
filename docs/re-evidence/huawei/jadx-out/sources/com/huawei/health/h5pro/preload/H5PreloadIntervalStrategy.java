package com.huawei.health.h5pro.preload;

import android.content.Context;
import com.huawei.health.h5pro.scalable.H5ProScalableServiceManager;
import com.huawei.health.h5pro.scalable.storage.H5AppLoadStorageInfo;
import com.huawei.health.h5pro.scalable.storage.IH5ProAppLoadStorageService;
import com.huawei.health.h5pro.utils.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class H5PreloadIntervalStrategy implements IH5PreloadStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6970a;

    public H5PreloadIntervalStrategy(long j) {
        this.f6970a = j;
    }

    @Override // com.huawei.health.h5pro.preload.IH5PreloadStrategy
    public boolean isPreLoadNow(Context context, String str) {
        IH5ProAppLoadStorageService h5ProAppLoadStorageService = H5ProScalableServiceManager.getInstance().getH5ProAppLoadStorageService();
        if (h5ProAppLoadStorageService == null) {
            return false;
        }
        H5AppLoadStorageInfo info = h5ProAppLoadStorageService.getInfo(context, str);
        LogUtil.i("H5PRO_H5PreloadIntervalStrategy", "isPreLoadNow, info=" + info);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (info == null) {
            return true;
        }
        if (info.getPreLoadTime() > 0 || info.getLoadTime() > 0) {
            return jCurrentTimeMillis - info.getPreLoadTime() >= this.f6970a && jCurrentTimeMillis - info.getLoadTime() >= this.f6970a;
        }
        return true;
    }
}
