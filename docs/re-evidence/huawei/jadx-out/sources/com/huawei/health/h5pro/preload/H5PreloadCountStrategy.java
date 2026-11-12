package com.huawei.health.h5pro.preload;

import android.content.Context;
import com.huawei.health.h5pro.scalable.H5ProScalableServiceManager;
import com.huawei.health.h5pro.scalable.storage.H5AppLoadStorageInfo;
import com.huawei.health.h5pro.scalable.storage.IH5ProAppLoadStorageService;
import com.huawei.health.h5pro.utils.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class H5PreloadCountStrategy implements IH5PreloadStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6969a;

    public H5PreloadCountStrategy(int i) {
        this.f6969a = i;
    }

    @Override // com.huawei.health.h5pro.preload.IH5PreloadStrategy
    public boolean isPreLoadNow(Context context, String str) {
        if (this.f6969a <= 0) {
            return true;
        }
        IH5ProAppLoadStorageService h5ProAppLoadStorageService = H5ProScalableServiceManager.getInstance().getH5ProAppLoadStorageService();
        if (h5ProAppLoadStorageService == null) {
            return false;
        }
        H5AppLoadStorageInfo info = h5ProAppLoadStorageService.getInfo(context, str);
        LogUtil.i("H5PRO_H5PreloadCountStrategy", "isPreLoadNow, info=" + info);
        return info != null && info.getCount() >= ((long) this.f6969a);
    }
}
