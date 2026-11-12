package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.pa;

/* JADX INFO: loaded from: classes12.dex */
public class bf {
    public static boolean a(AppDownloadTask appDownloadTask, Context context) {
        if (appDownloadTask != null) {
            String strX = appDownloadTask.C().a().X();
            int iC = pa.C(strX);
            boolean zH = pa.h(strX);
            int iW = dk.w(context);
            boolean zV = dk.v(context);
            if ((iC <= 3 || zH) && com.huawei.openalliance.ad.download.app.a.a(iC, iW, zV) > 0) {
                return true;
            }
        }
        return false;
    }
}
