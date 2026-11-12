package com.huawei.hms.ads.jsb;

import android.content.Context;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.download.app.interfaces.b;
import com.huawei.openalliance.ad.download.app.l;
import com.huawei.openalliance.ad.inter.HiAd;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f12819a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f12820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12821c;

    public void a(JsbConfig jsbConfig) {
        synchronized (f12819a) {
            if (jsbConfig != null) {
                HiAd.getInstance(this.f12821c).enableUserInfo(jsbConfig.a());
                HiAd.getInstance(this.f12821c).initLog(jsbConfig.d(), 3);
                if (cc.c(this.f12821c)) {
                    HiAd.getInstance(this.f12821c).initGrs(jsbConfig.b());
                } else {
                    HiAd.getInstance(this.f12821c).initGrs(jsbConfig.b(), jsbConfig.c());
                }
            }
        }
    }

    public b a() {
        return C0094a.f12822a;
    }

    private static a b(Context context) {
        a aVar;
        synchronized (f12819a) {
            if (f12820b == null) {
                f12820b = new a(context);
            }
            aVar = f12820b;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.jsb.a$a, reason: collision with other inner class name */
    static class C0094a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f12822a = new l();
    }

    public static a a(Context context) {
        return b(context);
    }

    private a(Context context) {
        this.f12821c = context.getApplicationContext();
    }
}
