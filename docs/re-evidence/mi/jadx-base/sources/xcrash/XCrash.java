package xcrash;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import defpackage.dn0;
import defpackage.jtc;
import defpackage.oqc;
import defpackage.rtc;
import defpackage.tl9;
import defpackage.tlq;
import defpackage.xv5;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes3.dex */
public final class XCrash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f38990a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f38991b;
    public static String c;
    public static String d;
    public static Semaphore f;
    public static Context g;
    public static String h;
    public static rtc e = new xv5();
    public static boolean i = false;
    public static Thread.UncaughtExceptionHandler j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Thread.UncaughtExceptionHandler f38992k = new a();

    public static class InitParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38993a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38994b = null;
        public int c = 5000;
        public rtc d = null;
        public int e = 0;
        public int f = 128;
        public boolean g = true;
        public boolean h = true;
        public int i = 10;
        public int j = 50;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f38995k = 50;
        public int l = 200;
        public boolean m = true;
        public boolean n = true;
        public boolean o = true;
        public int p = 0;
        public String[] q = null;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f38996r = true;
        public boolean s = true;
        public int t = 10;
        public int u = 50;
        public int v = 50;
        public int w = 200;
        public boolean x = true;
        public boolean y = true;
        public boolean z = true;
        public boolean A = true;
        public boolean B = true;
        public int C = 0;
        public String[] D = null;
        public boolean E = true;
        public boolean F = true;
        public boolean G = true;
        public int H = 10;
        public int I = 50;
        public int J = 50;
        public int K = 200;
        public boolean L = true;
        public boolean M = true;

        public InitParameters disableAnrCrashHandler() {
            this.E = false;
            return this;
        }

        public InitParameters disableJavaCrashHandler() {
            this.g = false;
            return this;
        }

        public InitParameters disableNativeCrashHandler() {
            this.f38996r = false;
            return this;
        }

        public InitParameters enableAnrCrashHandler() {
            this.E = true;
            return this;
        }

        public InitParameters enableJavaCrashHandler() {
            this.g = true;
            return this;
        }

        public InitParameters enableNativeCrashHandler() {
            this.f38996r = true;
            return this;
        }

        public InitParameters setAnrCallback(oqc oqcVar) {
            return this;
        }

        public InitParameters setAnrCheckProcessState(boolean z) {
            this.G = z;
            return this;
        }

        public InitParameters setAnrDumpFds(boolean z) {
            this.L = z;
            return this;
        }

        public InitParameters setAnrDumpNetwork(boolean z) {
            this.M = z;
            return this;
        }

        public InitParameters setAnrLogCountMax(int i) {
            if (i < 1) {
                i = 1;
            }
            this.H = i;
            return this;
        }

        public InitParameters setAnrLogcatEventsLines(int i) {
            this.J = i;
            return this;
        }

        public InitParameters setAnrLogcatMainLines(int i) {
            this.K = i;
            return this;
        }

        public InitParameters setAnrLogcatSystemLines(int i) {
            this.I = i;
            return this;
        }

        public InitParameters setAnrRethrow(boolean z) {
            this.F = z;
            return this;
        }

        public InitParameters setAppVersion(String str) {
            this.f38993a = str;
            return this;
        }

        public InitParameters setJavaCallback(oqc oqcVar) {
            return this;
        }

        public InitParameters setJavaDumpAllThreads(boolean z) {
            this.o = z;
            return this;
        }

        public InitParameters setJavaDumpAllThreadsCountMax(int i) {
            if (i < 0) {
                i = 0;
            }
            this.p = i;
            return this;
        }

        public InitParameters setJavaDumpAllThreadsWhiteList(String[] strArr) {
            this.q = strArr;
            return this;
        }

        public InitParameters setJavaDumpFds(boolean z) {
            this.m = z;
            return this;
        }

        public InitParameters setJavaDumpNetworkInfo(boolean z) {
            this.n = z;
            return this;
        }

        public InitParameters setJavaLogCountMax(int i) {
            if (i < 1) {
                i = 1;
            }
            this.i = i;
            return this;
        }

        public InitParameters setJavaLogcatEventsLines(int i) {
            this.f38995k = i;
            return this;
        }

        public InitParameters setJavaLogcatMainLines(int i) {
            this.l = i;
            return this;
        }

        public InitParameters setJavaLogcatSystemLines(int i) {
            this.j = i;
            return this;
        }

        public InitParameters setJavaRethrow(boolean z) {
            this.h = z;
            return this;
        }

        public InitParameters setLibLoader(jtc jtcVar) {
            return this;
        }

        public InitParameters setLogDir(String str) {
            this.f38994b = str;
            return this;
        }

        public InitParameters setLogFileMaintainDelayMs(int i) {
            if (i < 0) {
                i = 0;
            }
            this.c = i;
            return this;
        }

        public InitParameters setLogger(rtc rtcVar) {
            this.d = rtcVar;
            return this;
        }

        public InitParameters setNativeCallback(oqc oqcVar) {
            return this;
        }

        public InitParameters setNativeDumpAllThreads(boolean z) {
            this.B = z;
            return this;
        }

        public InitParameters setNativeDumpAllThreadsCountMax(int i) {
            if (i < 0) {
                i = 0;
            }
            this.C = i;
            return this;
        }

        public InitParameters setNativeDumpAllThreadsWhiteList(String[] strArr) {
            this.D = strArr;
            return this;
        }

        public InitParameters setNativeDumpElfHash(boolean z) {
            this.x = z;
            return this;
        }

        public InitParameters setNativeDumpFds(boolean z) {
            this.z = z;
            return this;
        }

        public InitParameters setNativeDumpMap(boolean z) {
            this.y = z;
            return this;
        }

        public InitParameters setNativeDumpNetwork(boolean z) {
            this.A = z;
            return this;
        }

        public InitParameters setNativeLogCountMax(int i) {
            if (i < 1) {
                i = 1;
            }
            this.t = i;
            return this;
        }

        public InitParameters setNativeLogcatEventsLines(int i) {
            this.v = i;
            return this;
        }

        public InitParameters setNativeLogcatMainLines(int i) {
            this.w = i;
            return this;
        }

        public InitParameters setNativeLogcatSystemLines(int i) {
            this.u = i;
            return this;
        }

        public InitParameters setNativeRethrow(boolean z) {
            this.s = z;
            return this;
        }

        public InitParameters setPlaceholderCountMax(int i) {
            if (i < 0) {
                i = 0;
            }
            this.e = i;
            return this;
        }

        public InitParameters setPlaceholderSizeKb(int i) {
            if (i < 0) {
                i = 0;
            }
            this.f = i;
            return this;
        }
    }

    public static class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                if (!XCrash.g()) {
                    InitParameters initParameters = new InitParameters();
                    initParameters.setNativeDumpAllThreads(false);
                    initParameters.setLogDir(XCrash.h);
                    initParameters.setNativeDumpMap(false);
                    initParameters.setNativeDumpFds(false);
                    initParameters.setJavaDumpAllThreads(false);
                    XCrash.init(XCrash.g, initParameters);
                }
                XCrash.f.acquire();
                xcrash.a.b().g(XCrash.j);
                xcrash.a.b().uncaughtException(thread, th);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            throw new RuntimeException("test java exception");
        }
    }

    public static rtc f() {
        return e;
    }

    public static synchronized boolean g() {
        return f38990a;
    }

    public static int init(Context context) {
        return init(context, null);
    }

    public static void initHooker(Context context, String str) {
        f = new Semaphore(0);
        j = Thread.getDefaultUncaughtExceptionHandler();
        g = context;
        h = str;
        try {
            Thread.setDefaultUncaughtExceptionHandler(f38992k);
            i = true;
        } catch (Exception e2) {
            f().e("xcrash", "JavaCrashHandler setDefaultUncaughtExceptionHandler failed", e2);
        }
    }

    public static void testJavaCrash(boolean z) throws RuntimeException {
        if (!z) {
            throw new RuntimeException("test java exception");
        }
        b bVar = new b();
        bVar.setName("xcrash_test_java_thread");
        bVar.start();
    }

    public static void testNativeCrash(boolean z) {
        NativeHandler.b().f(z);
    }

    public static synchronized int init(Context context, InitParameters initParameters) {
        String str;
        int iD;
        try {
            if (f38990a) {
                return 0;
            }
            f38990a = true;
            if (context == null) {
                return -1;
            }
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            InitParameters initParameters2 = initParameters == null ? new InitParameters() : initParameters;
            rtc rtcVar = initParameters2.d;
            if (rtcVar != null) {
                e = rtcVar;
            }
            String packageName = context2.getPackageName();
            f38991b = packageName;
            if (TextUtils.isEmpty(packageName)) {
                f38991b = "unknown";
            }
            if (TextUtils.isEmpty(initParameters2.f38993a)) {
                initParameters2.f38993a = tlq.d(context2);
            }
            c = initParameters2.f38993a;
            if (TextUtils.isEmpty(initParameters2.f38994b)) {
                initParameters2.f38994b = context2.getFilesDir() + "/tombstones";
            }
            d = initParameters2.f38994b;
            int iMyPid = Process.myPid();
            if (initParameters2.g || initParameters2.E) {
                String strN = tlq.n(context2, iMyPid);
                if (initParameters2.E && (TextUtils.isEmpty(strN) || !strN.equals(packageName))) {
                    initParameters2.E = false;
                }
                str = strN;
            } else {
                str = null;
            }
            tl9.l().n(initParameters2.f38994b, initParameters2.i, initParameters2.t, initParameters2.H, initParameters2.e, initParameters2.f, initParameters2.c);
            if ((initParameters2.g || initParameters2.f38996r || initParameters2.E) && (context2 instanceof Application)) {
                dn0.d().e((Application) context2);
            }
            if (initParameters2.g) {
                xcrash.a.b().e(iMyPid, str, i, f38991b, initParameters2.f38993a, initParameters2.f38994b, initParameters2.h, initParameters2.j, initParameters2.f38995k, initParameters2.l, initParameters2.m, initParameters2.n, initParameters2.o, initParameters2.p, initParameters2.q, null);
            }
            boolean z = initParameters2.E;
            if (initParameters2.f38996r || z) {
                iD = NativeHandler.b().d(context2, null, f38991b, initParameters2.f38993a, initParameters2.f38994b, initParameters2.f38996r, initParameters2.s, initParameters2.u, initParameters2.v, initParameters2.w, initParameters2.x, initParameters2.y, initParameters2.z, initParameters2.A, initParameters2.B, initParameters2.C, initParameters2.D, null, initParameters2.E, initParameters2.F, initParameters2.G, initParameters2.I, initParameters2.J, initParameters2.K, initParameters2.L, initParameters2.M, null);
            } else {
                iD = 0;
            }
            tl9.l().o();
            Semaphore semaphore = f;
            if (semaphore != null) {
                semaphore.release();
            }
            g = null;
            return iD;
        } catch (Throwable th) {
            throw th;
        }
    }
}
