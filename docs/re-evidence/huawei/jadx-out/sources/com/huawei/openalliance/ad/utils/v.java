package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.ohi;

/* JADX INFO: loaded from: classes12.dex */
public class v {
    public static void a(final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.v.1
            @Override // java.lang.Runnable
            public void run() {
                Context contextI = ab.i(context);
                String strA = dd.a(contextI);
                if (TextUtils.isEmpty(strA)) {
                    HiAdLog.w("CommonLibLogTool", "enable log failed, due to root path is null");
                } else {
                    HiAdLog.init(contextI, new ohi().e(4).a("HiAd.RecEngine").c("HiAd-3.4.84.300").e(strA).d("HiAdCommon"));
                }
            }
        });
    }
}
