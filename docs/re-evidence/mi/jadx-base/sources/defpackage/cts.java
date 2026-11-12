package defpackage;

import android.content.Context;
import android.content.pm.ServiceInfo;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes11.dex */
public final class cts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f14712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14713b = XMJobService.class.getCanonicalName();
    public static int c = 0;

    public interface a {
        void a();

        void a(boolean z);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        boolean mo874a();
    }

    public static synchronized void a() {
        if (f14712a == null) {
            return;
        }
        x9s.o("[Alarm] stop alarm.");
        f14712a.a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x009c, please report this as an issue */
    public static void b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if ("com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
            f14712a = new fts(applicationContext);
            return;
        }
        int i = 0;
        try {
            ServiceInfo[] serviceInfoArr = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4).services;
            if (serviceInfoArr != null) {
                int length = serviceInfoArr.length;
                int i2 = 0;
                while (i < length) {
                    try {
                        ServiceInfo serviceInfo = serviceInfoArr[i];
                        if ("android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                            String str = f14713b;
                            if (str.equals(serviceInfo.name)) {
                                i2 = 1;
                            } else {
                                try {
                                    if (str.equals(odt.c(applicationContext, serviceInfo.name).getSuperclass().getCanonicalName())) {
                                        i2 = 1;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (i2 == 1) {
                                break;
                            }
                        }
                        if (!f14713b.equals(serviceInfo.name) || !"android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                            i++;
                        }
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                        x9s.o("check service err : " + e.getMessage());
                        i2 = i;
                    }
                }
                if (i2 == 0) {
                    if (odt.g(applicationContext)) {
                        throw new RuntimeException("Should export service: " + f14713b + " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
                    }
                }
            } else if (odt.g(applicationContext)) {
                throw new RuntimeException("Should export service: " + f14713b + " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
            }
        } catch (Exception e2) {
            e = e2;
        }
        f14712a = new fts(applicationContext);
    }

    public static synchronized void c(Context context, int i) {
        try {
            int i2 = c;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    c = 2;
                } else {
                    c = 0;
                }
            }
            int i3 = c;
            if (i2 != i3 && i3 == 2) {
                a();
                f14712a = new its(context);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void d(boolean z) {
        if (f14712a == null) {
            x9s.o("timer is not initialized");
            return;
        }
        x9s.o("[Alarm] register alarm. (" + z + ")");
        f14712a.a(z);
    }

    public static synchronized boolean e() {
        a aVar = f14712a;
        if (aVar == null) {
            return false;
        }
        return aVar.mo874a();
    }
}
