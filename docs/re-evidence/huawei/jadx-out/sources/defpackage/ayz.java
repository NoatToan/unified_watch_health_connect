package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes22.dex */
public class ayz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f821a = aza.d("debug.hisight.performance", false);
    private static boolean d = false;
    private static ayz e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f823c;
    private boolean f;
    private boolean i;
    private boolean j;

    public ayz() {
        this.j = false;
        this.f822b = false;
        this.i = true;
        this.f = true;
        this.f823c = false;
        if (aze.e()) {
            this.j = false;
            this.f822b = true;
            this.i = true;
            this.f = true;
            this.f823c = true;
        }
    }

    public static ayz e() {
        ayz ayzVar;
        synchronized (ayz.class) {
            if (e == null) {
                e = new ayz();
                Log.d("IICLOG", "user type is beta : " + aze.e() + ",remote diagnosis is " + d);
            }
            ayzVar = e;
        }
        return ayzVar;
    }

    public void e(String str, String str2) {
        if (this.f822b || f821a || d) {
            Log.i(str, c(str2));
        }
    }

    public void d(String str, String str2) {
        Log.i(str, c(str2));
    }

    public void c(String str, String str2) {
        if (this.i) {
            Log.w(str, c(str2));
        }
    }

    public void a(String str, String str2) {
        if (this.f) {
            Log.e(str, c(str2));
        }
    }

    private String c(String str) {
        if (str != null && str.length() > 1000) {
            str = str.substring(0, 1000);
            Log.w("IICLOG", "msg length bigger than 1000");
        }
        StringBuilder sb = new StringBuilder(str != null ? 50 + str.length() : 50);
        if (this.f823c) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length > 4) {
                sb.append("[ ");
                sb.append(stackTrace[4].getFileName());
                sb.append(": ");
                sb.append(stackTrace[4].getLineNumber());
                sb.append("]");
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
