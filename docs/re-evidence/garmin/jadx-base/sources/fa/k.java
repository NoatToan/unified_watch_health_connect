package fa;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f70031a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.C1434a f70032b = a.f70033a;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1434a f70033a = new C1434a();

        /* JADX INFO: renamed from: fa.k$a$a, reason: collision with other inner class name */
        public class C1434a implements a {
        }
    }

    private k() {
    }

    public static void a(String str, Throwable th3) {
        String strE = e(th3);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        strE.replace("\n", "\n  ");
    }

    public static void b(String str) {
        synchronized (f70031a) {
            f70032b.getClass();
            a(str, null);
        }
    }

    public static void c(String str) {
        synchronized (f70031a) {
            f70032b.getClass();
            a(str, null);
        }
    }

    public static void d(String str, Throwable th3) {
        synchronized (f70031a) {
            f70032b.getClass();
            a(str, th3);
        }
    }

    public static String e(Throwable th3) {
        boolean z14;
        if (th3 == null) {
            return null;
        }
        synchronized (f70031a) {
            Throwable cause = th3;
            while (true) {
                if (cause == null) {
                    z14 = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z14 = true;
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (z14) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th3).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
        }
    }

    public static void f(String str) {
        synchronized (f70031a) {
            f70032b.getClass();
            a(str, null);
        }
    }

    public static void g(String str) {
        synchronized (f70031a) {
            f70032b.getClass();
            a(str, null);
        }
    }

    public static void h(String str, Throwable th3) {
        synchronized (f70031a) {
            f70032b.getClass();
            a(str, th3);
        }
    }
}
