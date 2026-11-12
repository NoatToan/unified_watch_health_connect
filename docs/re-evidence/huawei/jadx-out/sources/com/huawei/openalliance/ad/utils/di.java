package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.constant.CountryConfig;
import com.huawei.openalliance.ad.eq;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class di {
    public static boolean a(Context context) {
        String strA = new CountryCodeBean(context).a();
        int iAl = fp.b(context).al();
        if (CountryConfig.isDR3(strA, null) || iAl <= 0 || "US".equalsIgnoreCase(strA)) {
            hw.b("SyncAppDataUtil", "not allow this area or interval <= 0");
            return false;
        }
        long jA = eq.a(context).a();
        long j = ((long) iAl) * 60000;
        boolean z = as.c() - jA > j;
        hw.b("SyncAppDataUtil", "lastSyncTime is : %s, syncInterval is : %s", Long.valueOf(jA), Long.valueOf(j));
        return z;
    }
}
