package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    public static boolean a() {
        return cr.c(Constants.HIANALYTICS_SDK);
    }

    public static String a(final Context context) {
        if (!a()) {
            return "";
        }
        final cn cnVarA = cn.a(context);
        String strM = cnVarA.M();
        if (TextUtils.isEmpty(strM)) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Task aaid = HiAnalytics.getInstance(context).getAAID();
                        if (aaid != null) {
                            cnVarA.F((String) aaid.getResult());
                        }
                    } catch (Throwable th) {
                        hw.c("AaidUtil", "error getAgcAaid: " + th.getClass().getSimpleName());
                    }
                }
            });
        }
        return strM;
    }
}
