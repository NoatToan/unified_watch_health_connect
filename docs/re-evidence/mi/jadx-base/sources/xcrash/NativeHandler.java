package xcrash;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.dn0;
import defpackage.jtc;
import defpackage.oqc;
import defpackage.pip;
import defpackage.tl9;
import defpackage.tlq;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"StaticFieldLeak"})
class NativeHandler {
    public static final NativeHandler g = new NativeHandler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38989b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38988a = 15000;
    public boolean f = false;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            NativeHandler.nativeTraceSignalInit();
        }
    }

    public static NativeHandler b() {
        return g;
    }

    public static String c(boolean z, String str) {
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!z || !key.getName().equals(FaceSchema.FACE_PAGE_MAIN)) {
                    if (z || !key.getName().contains(str)) {
                    }
                }
                StringBuilder sb = new StringBuilder();
                StackTraceElement[] value = entry.getValue();
                for (StackTraceElement stackTraceElement : value) {
                    sb.append("    at ");
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
                return sb.toString();
            }
            return null;
        } catch (Exception e) {
            XCrash.f().e("xcrash", "NativeHandler getStacktraceByThreadName failed", e);
            return null;
        }
    }

    private static void crashCallback(String str, String str2, boolean z, boolean z2, String str3) {
        XCrash.f().d("xcrash", "crashCallback start ...");
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                String strC = c(z2, str3);
                if (!TextUtils.isEmpty(strC)) {
                    pip.a(str, "java stacktrace", strC);
                }
            }
            pip.a(str, "memory info", tlq.m());
            pip.a(str, "foreground", dn0.d().f() ? "yes" : "no");
        }
        b().getClass();
        if (b().c) {
            return;
        }
        dn0.d().c();
    }

    private static native int nativeInit(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, String[] strArr, boolean z8, boolean z9, int i6, int i7, int i8, boolean z10, boolean z11);

    private static native void nativeNotifyJavaCrashed();

    private static native void nativeTestCrash(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeTraceSignalInit();

    private static void traceCallback(String str, String str2) {
        XCrash.f().d("xcrash", "traceCallback start ...");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pip.a(str, "memory info", tlq.m());
        pip.a(str, "foreground", dn0.d().f() ? "yes" : "no");
        if (b().e && !tlq.b(b().f38989b, b().f38988a)) {
            tl9.l().q(new File(str));
            return;
        }
        if (tl9.l().p()) {
            String str3 = str.substring(0, str.length() - 13) + ".anr.xcrash";
            File file = new File(str);
            if (file.renameTo(new File(str3))) {
                b().getClass();
            } else {
                tl9.l().q(file);
            }
        }
    }

    private static void traceSignalInit() {
        new Handler(Looper.getMainLooper()).post(new a());
    }

    public int d(Context context, jtc jtcVar, String str, String str2, String str3, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, String[] strArr, oqc oqcVar, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, boolean z11, boolean z12, oqc oqcVar2) {
        if (jtcVar == null) {
            try {
                System.loadLibrary("xcrash");
            } catch (Throwable th) {
                XCrash.f().e("xcrash", "NativeHandler System.loadLibrary failed", th);
                return -2;
            }
        } else {
            try {
                jtcVar.loadLibrary("xcrash");
            } catch (Throwable th2) {
                XCrash.f().e("xcrash", "NativeHandler ILibLoader.loadLibrary failed", th2);
                return -2;
            }
        }
        this.f38989b = context;
        this.c = z2;
        this.d = z8;
        this.e = z10;
        this.f38988a = z9 ? 15000L : 30000L;
        try {
            if (nativeInit(Build.VERSION.SDK_INT, Build.VERSION.RELEASE, tlq.c(), Build.MANUFACTURER, Build.BRAND, Build.MODEL, Build.FINGERPRINT, str, str2, context.getApplicationInfo().nativeLibraryDir, str3, z, z2, i, i2, i3, z3, z4, z5, z6, z7, i4, strArr, z8, z9, i5, i6, i7, z11, z12) != 0) {
                XCrash.f().e("xcrash", "NativeHandler init failed");
                return -3;
            }
            this.f = true;
            return 0;
        } catch (Throwable th3) {
            XCrash.f().e("xcrash", "NativeHandler init failed", th3);
            return -3;
        }
    }

    public void e() {
        if (this.f && this.d) {
            nativeNotifyJavaCrashed();
        }
    }

    public void f(boolean z) {
        if (this.f) {
            nativeTestCrash(z ? 1 : 0);
        }
    }
}
