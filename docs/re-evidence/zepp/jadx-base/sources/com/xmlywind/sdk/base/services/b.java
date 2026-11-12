package com.xmlywind.sdk.base.services;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.utils.p;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class b implements j.a {
    public a a;
    public k b = k.STOP;

    public b() {
        if (this.a == null) {
            this.a = new a();
        }
    }

    public static void a() {
        try {
            f();
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    private static boolean d() {
        if (com.xmlywind.sdk.common.a.n() == null || com.xmlywind.sdk.common.a.n().af() == null) {
            return true;
        }
        return p.a(com.xmlywind.sdk.common.a.n().af(), "BuriedPointConfig").getString(Constants.LAST_DAY, "").equals(Constants.sdf.format(new Date()));
    }

    private static void e() {
        com.xmlywind.sdk.common.b.c.a.b().a(new Runnable() { // from class: com.xmlywind.sdk.base.services.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    List<PackageInfo> listAl = com.xmlywind.sdk.common.a.n().al();
                    if (listAl == null) {
                        return;
                    }
                    for (int i = 0; i < listAl.size(); i++) {
                        PackageInfo packageInfo = listAl.get(i);
                        if ((packageInfo.applicationInfo.flags & 1) == 0) {
                            t.a(packageInfo);
                        }
                    }
                    p.a(com.xmlywind.sdk.common.a.n().af(), "BuriedPointConfig").edit().putString(Constants.LAST_DAY, Constants.sdf.format(new Date())).commit();
                } catch (Throwable th) {
                    SigmobLog.e("update app info", th);
                }
            }
        });
    }

    private static void f() {
        try {
            if (com.xmlywind.sdk.common.a.b()) {
                boolean zD = d();
                if (SDKConfig.sharedInstance().isDisableUpAppInfo() || zD) {
                    return;
                }
                e();
            }
        } catch (Throwable th) {
            SigmobLog.e("BuriedPointManager getInstance", th);
        }
    }

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.INSTALL_PACKAGE");
        if (Build.VERSION.SDK_INT >= 27) {
            intentFilter.addAction("android.intent.action.INSTALL_FAILURE");
        }
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme(NotificationEvent.KEY_PACKAGE);
        new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        context.registerReceiver(this.a, intentFilter);
    }

    public void b(Context context) {
        context.unregisterReceiver(this.a);
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public boolean b() {
        k kVar = this.b;
        k kVar2 = k.RUNNING;
        if (kVar == kVar2) {
            return false;
        }
        a(com.xmlywind.sdk.common.a.n().af());
        this.b = kVar2;
        return true;
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public void c() {
        if (this.b == k.RUNNING) {
            b(com.xmlywind.sdk.common.a.n().af());
            this.b = k.STOP;
        }
    }
}
