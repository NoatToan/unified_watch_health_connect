package com.huawei.hiar;

import android.content.Context;

/* JADX INFO: loaded from: classes33.dex */
public class HuaweiArApkJniAdapter {
    static boolean isInstalledAndCompatible(Context context) {
        return HuaweiArApkBase.e().a(context);
    }

    private HuaweiArApkJniAdapter() {
    }
}
