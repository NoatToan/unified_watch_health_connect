package com.huawei.hms.iapfull.network;

import android.content.Context;
import com.huawei.hms.iapfull.y0;
import com.huawei.hms.network.embedded.y;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f13709a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile IAPFullService f13710b;

    public static IAPFullService a(Context context, String str) {
        y0.b("IAPFullClient", "start service");
        if (f13710b == null) {
            synchronized (f13709a) {
                if (f13710b == null) {
                    f13710b = (IAPFullService) f.a(context, str, y.f15619c).build().create(IAPFullService.class);
                }
            }
        }
        return f13710b;
    }
}
