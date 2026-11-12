package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class dz {
    public static boolean a(Context context) {
        if (!com.huawei.openalliance.ad.cc.a(context).l()) {
            hw.b("WifiUtils", "base location switch off");
            return false;
        }
        gk gkVarB = fp.b(context);
        if (!gkVarB.v()) {
            hw.b("WifiUtils", "collect devCntList switch off");
            return false;
        }
        if (fp.b(context).y() <= 0) {
            return false;
        }
        long jX = gkVarB.x();
        if (System.currentTimeMillis() - gkVarB.bY() < 60000 * jX) {
            hw.b("WifiUtils", "The reporting interval is less than %s min", Long.valueOf(jX));
            return false;
        }
        gkVarB.h(System.currentTimeMillis());
        return true;
    }
}
