package com.huawei.hianalytics;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.DaoManager;
import com.huawei.hianalytics.dc.StateKeeper;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.common.PackageConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f11491a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m0 f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m0 f11493c;

    public static void a(boolean z) {
        if (z) {
            if (TextUtils.isEmpty(f11491a) || HiAnalyticsManager.getInstanceByTag(f11491a) == null) {
                return;
            }
            f(f11491a);
            return;
        }
        synchronized (StateKeeper.class) {
            if (StateKeeper.isInit()) {
                HiLog.si("CC", "unregisterMetric");
                o1.f11589a.d();
                StateKeeper.setInit(false);
            }
        }
    }

    public static /* synthetic */ void b(String str) {
        synchronized (StateKeeper.class) {
            e(str);
        }
    }

    public static void c(String str) {
        if (StateKeeper.isInit()) {
            HiLog.d("CC", "register has init");
            return;
        }
        try {
            if (f11492b == null) {
                f11492b = new m0(TaskThread.getWorkLooper(), 1, str);
            }
            if (a()) {
                HiLog.si("CC", "register");
                e1 e1VarA = f2.a();
                d1 d1VarC = e1VarA.c();
                d1VarC.a();
                e eVar = new e(f11492b, str);
                d1VarC.a(eVar);
                m0 m0Var = f11492b;
                m0Var.getClass();
                m0Var.f11581c = new WeakReference(eVar);
                d1 d1VarD = e1VarA.d();
                d1VarD.a();
                i1 i1Var = new i1(f11492b, str);
                d1VarD.a(i1Var);
                m0 m0Var2 = f11492b;
                m0Var2.getClass();
                m0Var2.f11580b = new WeakReference(i1Var);
                u1 u1Var = new u1(f11492b, str);
                d1VarD.a(u1Var);
                m0 m0Var3 = f11492b;
                m0Var3.getClass();
                m0Var3.d = new WeakReference(u1Var);
                StateKeeper.setInit(true);
            }
        } catch (Throwable th) {
            HiLog.i("CC", "register " + th.getMessage());
        }
    }

    public static void d(final String str) {
        if (TextUtils.equals(g0.f11539a[0], str)) {
            TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.f0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.a(str);
                }
            });
        }
    }

    public static void e(String str) {
        HiLog.si("CC", "registerMetric");
        if (StateKeeper.isMetricInit()) {
            HiLog.d("CC", "registerMetric has init");
            return;
        }
        try {
            if (b()) {
                if (f11493c == null) {
                    f11493c = new m0(TaskThread.getWorkLooper(), 2, str);
                }
                e0.a();
                SQLiteDatabase writableDatabase = b0.a(EnvUtils.getAppContext()).getWritableDatabase();
                DaoManager.getInstance().createMcInfoTable(writableDatabase);
                DaoManager.getInstance().createMcTagTable(writableDatabase);
                q1 q1Var = new q1(f11493c);
                m0 m0Var = f11493c;
                m0Var.getClass();
                m0Var.e = new WeakReference(q1Var);
                p1 p1Var = o1.f11589a;
                p1Var.d = q1Var;
                p1Var.b();
                d1 d1VarC = f2.a().c();
                d1VarC.a();
                e eVar = new e(f11493c, str);
                d1VarC.a(eVar);
                m0 m0Var2 = f11493c;
                m0Var2.getClass();
                m0Var2.f11581c = new WeakReference(eVar);
                StateKeeper.setMetricInit(true);
            }
        } catch (Throwable th) {
            HiLog.i("CC", "registerMetric: " + th.getMessage());
        }
    }

    public static void f(final String str) {
        if (j1.a().r.contains(str)) {
            f11491a = str;
            TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.f0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    f0.b(str);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r0.contains("metrics1.data") == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b() {
        j1 j1VarA = j1.a();
        j1VarA.getClass();
        if (!j1VarA.q.contains(x0.b(EnvUtils.getAppContext()))) {
            return false;
        }
        if (!t.a()) {
            HiLog.d("CC", "not China rom");
            return false;
        }
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("Analytics_Kit_Tag");
        if (instanceByTag != null) {
            if (j1.a().l) {
                String collectUrl = instanceByTag.getCollectUrl();
                if (!TextUtils.isEmpty(collectUrl)) {
                    if (!collectUrl.contains("metrics1-drcn")) {
                        if (!collectUrl.contains("metrics-drcn")) {
                        }
                    }
                }
            }
            if (!t.d()) {
                HiLog.d("CC", "not phone or pad");
                return false;
            }
            try {
                Class.forName("com.huawei.media.controller.MediaControlCenter");
                if (EnvUtils.getAppContext().checkSelfPermission("android.permission.STATUS_BAR_SERVICE") == 0 || EnvUtils.getAppContext().checkSelfPermission("android.permission.MEDIA_CONTENT_CONTROL") == 0) {
                    return true;
                }
                HiLog.d("CC", "permission is denied");
                r1.a("mc_108");
                return false;
            } catch (Throwable unused) {
                r1.a("mc_109");
                HiLog.d("CC", "not has class");
                return false;
            }
        }
        HiLog.d("CC", "not China url");
        r1.a("mc_107");
        return false;
    }

    public static /* synthetic */ void a(String str) {
        synchronized (StateKeeper.class) {
            c(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static boolean a() {
        if (!l.a().f11570a) {
            HiLog.d("CC", "isCollectEnable false");
            return false;
        }
        String strB = x0.b(EnvUtils.getAppContext());
        if (HiLog.isDebugEnable()) {
            HiLog.d("CC", "current process " + strB);
        }
        if (!TextUtils.equals(strB, "com.huawei.hwid.core") && !TextUtils.equals(strB, PackageConstants.GENERAL_SERVICES_ACTION)) {
            return false;
        }
        if (!t.a()) {
            HiLog.d("CC", "not China rom");
            return false;
        }
        if (!t.d()) {
            HiLog.d("CC", "not phone or pad");
            return false;
        }
        boolean zB = t.b();
        if (zB) {
            try {
                Class.forName("com.hihonor.android.app.IHwActivityNotifierEx");
            } catch (Throwable unused) {
                if (!zB) {
                    return false;
                }
                try {
                    Class.forName("com.huawei.android.app.IHwActivityNotifierEx");
                } catch (Throwable unused2) {
                    return false;
                }
            }
        } else {
            if (!zB) {
                return false;
            }
            Class.forName("com.huawei.android.app.IHwActivityNotifierEx");
        }
        return true;
    }

    public static void c() {
        if (StateKeeper.isInit()) {
            HiLog.si("CC", "unregister");
            try {
                e1 e1VarA = f2.a();
                d1 d1VarC = e1VarA.c();
                d1VarC.c();
                d1VarC.b();
                d1 d1VarD = e1VarA.d();
                d1VarD.c();
                d1VarD.b();
                StateKeeper.setInit(false);
            } catch (Throwable th) {
                HiLog.i("CC", "unregister " + th.getMessage());
            }
        }
    }

    public static void b(boolean z) {
        if (z) {
            String str = g0.f11539a[0];
            if (HiAnalyticsManager.getInstanceByTag(str) != null) {
                d(str);
                return;
            }
            return;
        }
        synchronized (StateKeeper.class) {
            c();
        }
    }
}
