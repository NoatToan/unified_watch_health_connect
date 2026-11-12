package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.network.NetworkKit;

/* JADX INFO: loaded from: classes12.dex */
public class is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f19270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static jc f19271c;

    private static void b(Context context) {
        if (!com.huawei.openalliance.ad.utils.as.p(context) || !com.huawei.openalliance.ad.utils.as.f()) {
            f19270b = false;
            hw.b("MediaCacheFactory", "not enable user info, skip init.");
            return;
        }
        try {
            hw.b("MediaCacheFactory", "initNetowrkKit");
            NetworkKit.init(context, null);
            f19271c = new iv(8, 5000, 30000);
        } catch (Throwable th) {
            f19270b = false;
            hw.c("MediaCacheFactory", "init networkKit error: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(Context context) {
        if (f19270b) {
            hw.a("MediaCacheFactory", "SdkFactory already initialized.");
            return;
        }
        hw.b("MediaCacheFactory", "init");
        f19270b = true;
        Context applicationContext = context.getApplicationContext();
        f19269a = applicationContext;
        b(applicationContext);
    }

    public static jc a() {
        return f19271c;
    }
}
