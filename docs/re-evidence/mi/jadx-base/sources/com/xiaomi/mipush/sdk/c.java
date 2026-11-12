package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ib;
import com.xiaomi.push.ja;
import defpackage.bas;
import defpackage.d6s;
import defpackage.gbs;
import defpackage.jfs;
import defpackage.x9s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    public static class a {
        public static volatile a f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f13641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13642b;
        public Boolean c;
        public C0829a d = new C0829a();
        public final ArrayList<Cif> e = new ArrayList<>();

        /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.c$a$a, reason: collision with other inner class name */
        public class C0829a {
            public ScheduledFuture<?> c;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ScheduledThreadPoolExecutor f13643a = new ScheduledThreadPoolExecutor(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ArrayList<Cif> f13644b = new ArrayList<>();
            public final Runnable d = new g(this);

            public C0829a() {
            }

            public final void c() {
                if (this.c == null) {
                    this.c = this.f13643a.scheduleAtFixedRate(this.d, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            public void e(Cif cif) {
                this.f13643a.execute(new f(this, cif));
            }

            public final void f() {
                Cif cifRemove = this.f13644b.remove(0);
                for (ja jaVar : jfs.c(Arrays.asList(cifRemove), a.this.f13641a.getPackageName(), bas.c(a.this.f13641a).d(), 30720)) {
                    x9s.B("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + cifRemove.d());
                    d6s.c(a.this.f13641a).y(jaVar, ib.Notification, true, null);
                }
            }
        }

        public static a b() {
            if (f == null) {
                synchronized (a.class) {
                    try {
                        if (f == null) {
                            f = new a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f;
        }

        public void c(Context context) {
            if (context == null) {
                x9s.o("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f13641a = context;
            this.c = Boolean.valueOf(f(context));
            h("com.xiaomi.xmpushsdk.tinydataPending.init");
        }

        public final void d(Cif cif) {
            synchronized (this.e) {
                try {
                    if (!this.e.contains(cif)) {
                        this.e.add(cif);
                        if (this.e.size() > 100) {
                            this.e.remove(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean e() {
            return this.f13641a != null;
        }

        public final boolean f(Context context) {
            if (!d6s.c(context).J()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                return packageInfo != null && packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        public synchronized boolean g(Cif cif) {
            if (cif == null) {
                return false;
            }
            try {
                if (jfs.e(cif, true)) {
                    return false;
                }
                boolean z = TextUtils.isEmpty(cif.m681a()) && TextUtils.isEmpty(this.f13642b);
                boolean z2 = !e();
                Context context = this.f13641a;
                boolean z3 = context == null || i(context);
                if (!z2 && !z && !z3) {
                    x9s.B("MiTinyDataClient Send item immediately." + cif.d());
                    if (TextUtils.isEmpty(cif.d())) {
                        cif.f(gbs.a());
                    }
                    if (TextUtils.isEmpty(cif.m681a())) {
                        cif.a(this.f13642b);
                    }
                    if (TextUtils.isEmpty(cif.c())) {
                        cif.e(this.f13641a.getPackageName());
                    }
                    if (cif.a() <= 0) {
                        cif.b(System.currentTimeMillis());
                    }
                    return j(cif);
                }
                if (z) {
                    x9s.B("MiTinyDataClient Pending " + cif.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.channel");
                } else if (z2) {
                    x9s.B("MiTinyDataClient Pending " + cif.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.init");
                } else if (z3) {
                    x9s.B("MiTinyDataClient Pending " + cif.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.appId");
                }
                d(cif);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void h(String str) {
            x9s.B("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.e) {
                arrayList.addAll(this.e);
                this.e.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g((Cif) it.next());
            }
        }

        public final boolean i(Context context) {
            return bas.c(context).d() == null && !f(this.f13641a);
        }

        public final boolean j(Cif cif) {
            if (jfs.e(cif, false)) {
                return false;
            }
            if (!this.c.booleanValue()) {
                this.d.e(cif);
                return true;
            }
            x9s.B("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + cif.d());
            d6s.c(this.f13641a).t(cif);
            return true;
        }
    }

    public static boolean a(Context context, Cif cif) {
        x9s.B("MiTinyDataClient.upload " + cif.d());
        if (!a.b().e()) {
            a.b().c(context);
        }
        return a.b().g(cif);
    }
}
