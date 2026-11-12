package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static WeakReference<ld> f3043a;

    public static void a(final String str, final Context context) {
        jv.d().submit(new Runnable() { // from class: com.amap.api.col.3sl.lf.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (lf.class) {
                    try {
                        String strA = it.a(iy.a(str));
                        ld ldVarA = lk.a(lf.f3043a);
                        lk.a(context, ldVarA, jt.j, 50, Constants.GIF_SIZE_UPPER_LIMIT_KB, "10");
                        if (ldVarA.e == null) {
                            ldVarA.e = new kl(new ko(new kn()));
                        }
                        le.a(strA, iy.a(" \"timestamp\":\"" + iy.a(System.currentTimeMillis(), "yyyyMMdd HH:mm:ss") + "\",\"details\":" + str), ldVarA);
                    } catch (Throwable th) {
                        jv.c(th, "mam", "ap");
                    }
                }
            }
        });
    }
}
