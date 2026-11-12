package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bp {
    public static void a(Context context, int i, String str) {
        if (i < 4) {
            i = 4;
        }
        if (TextUtils.isEmpty(str)) {
            str = dd.a(context);
            if (TextUtils.isEmpty(str)) {
                hw.c("LogTool", "enable log failed, due to root path is null");
                return;
            }
        }
        hw.a(i, str, "HiAd");
    }

    public static void a(Context context) {
        a(context, 4, null);
    }
}
