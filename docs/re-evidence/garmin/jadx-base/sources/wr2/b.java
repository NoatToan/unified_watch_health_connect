package wr2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import ds.e0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f186831a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f186832b;

    static {
        int i14 = gt2.c.f79010a;
        f186832b = gt2.b.f79005a.h("PAY#AndroidUtil");
    }

    private b() {
    }

    public static ConnectivityManager a() {
        Object systemService = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getSystemService("connectivity");
        systemService.getClass();
        return (ConnectivityManager) systemService;
    }

    public static boolean b(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            context.getApplicationContext().getPackageManager().getPackageGids(str);
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            e0.v("isAppInstalled -> ", e4.getMessage(), f186832b);
            return false;
        }
    }
}
