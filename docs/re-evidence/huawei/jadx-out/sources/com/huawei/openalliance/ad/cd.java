package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile cs f18342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18343b = new byte[0];

    public static cs a(Context context) {
        cs cnVar;
        if (f18342a == null) {
            synchronized (f18343b) {
                if (f18342a == null) {
                    if (cc.f(context) && com.huawei.openalliance.ad.utils.an.b()) {
                        cnVar = new cl(context);
                    } else {
                        cnVar = com.huawei.openalliance.ad.utils.an.a() ? new cn(context) : new cp(context);
                    }
                    f18342a = cnVar;
                }
            }
        }
        return f18342a;
    }
}
