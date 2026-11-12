package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class an {
    public static boolean d() {
        return cr.a("com.hihonor.common.grs.HihonorGrsApp", "getIssueCountryCode", (Class<?>[]) new Class[]{Context.class});
    }

    public static boolean c() {
        return cr.a("com.huawei.hms.framework.network.grs.GrsApp", "getIssueCountryCode", (Class<?>[]) new Class[]{Context.class});
    }

    public static boolean b() {
        try {
            Class.forName("com.hihonor.common.grs.HihonorGrsApi");
            return true;
        } catch (Throwable unused) {
            hw.c("GrsUtil", "check honor grs available error");
            return false;
        }
    }

    public static boolean a() {
        try {
            Class.forName("com.huawei.hms.framework.network.grs.GrsApi");
            return true;
        } catch (Throwable unused) {
            hw.c("GrsUtil", "check grs available error");
            return false;
        }
    }
}
