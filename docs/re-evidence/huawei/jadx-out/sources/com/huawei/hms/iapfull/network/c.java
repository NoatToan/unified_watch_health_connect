package com.huawei.hms.iapfull.network;

import android.content.Context;
import com.huawei.hms.iapfull.y0;
import com.huawei.hms.network.embedded.y;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f13711a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile IAPWebPayService f13712b;

    public static IAPWebPayService a(Context context, String str) {
        y0.b("IAPFullClient", "start service");
        if (f13712b == null) {
            synchronized (f13711a) {
                if (f13712b == null) {
                    f13712b = (IAPWebPayService) f.a(context, str, y.f15619c).build().create(IAPWebPayService.class);
                }
            }
        }
        return f13712b;
    }
}
