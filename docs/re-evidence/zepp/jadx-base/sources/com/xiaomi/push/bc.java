package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes22.dex */
public final class bc {
    private static a a;
    private static final String b = XMJobService.class.getCanonicalName();
    private static int c = 0;

    public interface a {
        void a();

        void a(boolean z);

        /* JADX INFO: renamed from: a */
        boolean mo3589a();
    }

    public static synchronized void a() {
        if (a == null) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] stop alarm.");
        a.a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    public static void a(Context context) {
        b0 b0Var;
        Context applicationContext = context.getApplicationContext();
        if (PkgNameConstants.XMSF.equals(applicationContext.getPackageName())) {
            b0Var = new b0(applicationContext);
        } else {
            int i = 0;
            try {
                ServiceInfo[] serviceInfoArr = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4).services;
                if (serviceInfoArr != null) {
                    int length = serviceInfoArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i < length) {
                            try {
                                ServiceInfo serviceInfo = serviceInfoArr[i];
                                if ("android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                    String str = b;
                                    if (str.equals(serviceInfo.name)) {
                                        i2 = 1;
                                    } else {
                                        try {
                                            if (str.equals(com.xiaomi.channel.commonutils.android.k.a(applicationContext, serviceInfo.name).getSuperclass().getCanonicalName())) {
                                                i2 = 1;
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                if (b.equals(serviceInfo.name) && "android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                    i = 1;
                                    break;
                                }
                                i++;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                com.xiaomi.channel.commonutils.logger.b.m3434a("check service err : " + e.getMessage());
                            }
                        }
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            if (i == 0 && com.xiaomi.channel.commonutils.android.k.m3433a(applicationContext)) {
                throw new RuntimeException("Should export service: " + b + " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
            }
            int i3 = Build.VERSION.SDK_INT;
            b0Var = new b0(applicationContext);
        }
        a = b0Var;
    }

    public static synchronized void a(Context context, int i) {
        int i2 = c;
        if (!PkgNameConstants.XMSF.equals(context.getPackageName())) {
            if (i == 2) {
                c = 2;
            } else {
                c = 0;
            }
        }
        int i3 = c;
        if (i2 != i3 && i3 == 2) {
            a();
            a = new c0(context);
        }
    }

    public static synchronized void a(boolean z) {
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("timer is not initialized");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] register alarm. (" + z + ")");
        a.a(z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized boolean m3594a() {
        a aVar = a;
        if (aVar == null) {
            return false;
        }
        return aVar.mo3589a();
    }
}
