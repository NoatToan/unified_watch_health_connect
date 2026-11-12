package com.xiaomi.hm.health.bt.debug;

import android.util.Log;
import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class Debug {
    private static final boolean a = true;
    private static final boolean b = true;
    private static final boolean c = true;
    private static final boolean d = true;
    private static final boolean e = true;
    private static final boolean f = true;
    private static final boolean g = false;
    private static final String h = "DEBUG";
    private static int i = -1;
    private static int j = 0;
    private static int k = 1;
    private static int l = 2;
    private static String m = null;
    private static int n = 0;
    private static boolean o = true;
    private static int p = 2;
    private static boolean q = true;
    private static boolean r = true;
    private static boolean s = true;
    private static boolean t = true;
    private static IFileLog v;
    private static Boolean u = Boolean.FALSE;
    private static LinkedList<LoggingIntercept> w = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(String str) {
        return "" + str + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B(String str) {
        return "" + str + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(String str) {
        return "" + str + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(String str) {
        return s() + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H(String str) {
        return str;
    }

    private static void I(final String tag, final String msg, final int traceLevel, final char logLevel) {
        if (q) {
            if (!w.isEmpty()) {
                Iterator<LoggingIntercept> it2 = w.iterator();
                while (it2.hasNext()) {
                    if (it2.next().chain(logLevel, tag, "" + msg + "")) {
                        return;
                    }
                }
            }
            if (logLevel == 'd') {
                HMLog.debug(tag, new Function0() { // from class: l41
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Debug.A(msg);
                    }
                });
                return;
            }
            if (logLevel == 'e') {
                HMLog.error(tag, new Function0() { // from class: i41
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Debug.C(msg);
                    }
                });
                return;
            }
            if (logLevel == 'i') {
                Log.i(tag, "" + msg + "");
                return;
            }
            if (logLevel == 'v') {
                HMLog.verbose(tag, new Function0() { // from class: p41
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Debug.z(msg);
                    }
                });
            } else {
                if (logLevel != 'w') {
                    return;
                }
                HMLog.warn(tag, new Function0() { // from class: j41
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Debug.B(msg);
                    }
                });
            }
        }
    }

    private static String J() {
        return new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.getDefault()).format(new Date());
    }

    public static void addLogInterceptChain(@NonNull LoggingIntercept intercept) {
        w.add(intercept);
    }

    public static void assertNotNull(final Object obj) {
        if (s && obj == null) {
            I(h, ">>> `NOT NULL` ASSERTION FAILED <<<", 0, 'e');
        }
    }

    public static void assertNull(final Object obj) {
        if (!s || obj == null) {
            return;
        }
        I(h, ">>> `NULL` ASSERTION FAILED <<<", 0, 'e');
    }

    public static void assertRunOnThread(final Thread thread) {
        if (!s || thread == null || Thread.currentThread().getId() == thread.getId()) {
            return;
        }
        I(h, ">>> `RUN ON THREAD` ASSERTION FAILED <<<", 0, 'e');
    }

    public static void assertTrue(final boolean cond) {
        if (!s || cond) {
            return;
        }
        I(h, ">>> `TRUE` ASSERTION FAILED <<<", 0, 'e');
    }

    public static void ble(String tag, Function0<String> message, Throwable t2) {
        if (u.booleanValue()) {
            BleLog.log(tag, message, null, true);
        }
    }

    public static void debug(final String msg) {
        I(h, msg, 0, 'd');
    }

    public static void debugLock(final String msg) {
        if (t) {
            I(h, "LOCK#" + msg, 0, 'v');
        }
    }

    public static void e(String tag, final String message) {
        if (n > i) {
            Log.e(tag, s() + message);
            q(tag, new Function0() { // from class: o41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Debug.t(message);
                }
            }, false);
        }
    }

    public static void enable(boolean enable) {
        n = enable ? j : i;
        o = enable;
        r(enable);
    }

    public static void enableOuterLog(IFileLog logger) {
        v = logger;
    }

    public static void error(final String msg) {
        I(h, msg, 0, 'e');
        q(h, new Function0() { // from class: m41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Debug.w(msg);
            }
        }, false);
    }

    public static void fi(String tag, final String s2) {
        if (!o) {
            i(tag, s2);
        } else {
            HMLog.info(tag, new Function0() { // from class: k41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Debug.x(s2);
                }
            });
            q(tag, new Function0() { // from class: q41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Debug.y(s2);
                }
            }, false);
        }
    }

    public static void flush() {
        if (u.booleanValue()) {
            BleLog.flush();
        }
    }

    public static void i(String tag, String message) {
        int i2 = n;
        if (i2 <= i || i2 >= k) {
            return;
        }
        Log.i(tag, s() + message);
    }

    public static void info(final String msg) {
        I(h, msg, 0, 'i');
    }

    public static boolean isEnabled() {
        int i2 = n;
        return i2 > i && i2 < l;
    }

    public static boolean isEnaledFile() {
        return o;
    }

    public static void l(String tag, String message) {
        int i2 = n;
        if (i2 <= i || i2 >= k) {
            return;
        }
        int i3 = 0;
        while (i3 <= message.length() / 1000) {
            int i4 = i3 * 1000;
            i3++;
            int length = i3 * 1000;
            if (length > message.length()) {
                length = message.length();
            }
            i(tag, s() + message.substring(i4, length));
        }
    }

    public static void line() {
        int i2 = n;
        if (i2 <= i || i2 >= k) {
            return;
        }
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[p - 1];
        String str = stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
        String className = stackTraceElement.getClassName();
        i(className.substring(className.lastIndexOf(".") + 1), str);
    }

    public static void logcat(String message) {
        IFileLog iFileLog = v;
        if (iFileLog != null) {
            iFileLog.f("logcat", message);
            return;
        }
        if (!o || m == null) {
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter(new File(m), true);
            fileWriter.write(message + "\n");
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    private static void p(String tag, Function0<String> message, Throwable t2, boolean isDirect) {
        if (q && isDirect) {
            Log.i(tag, message.invoke(), t2);
        }
        if (u.booleanValue()) {
            BleLog.log(tag, message, t2, isDirect);
        }
    }

    private static void q(String tag, Function0<String> message, boolean isDirect) {
        if (q && isDirect) {
            Log.i(tag, message.invoke());
        }
        if (u.booleanValue()) {
            BleLog.log(tag, message, null, isDirect);
        }
    }

    private static void r(boolean enable) {
        q = enable;
        r = enable;
        s = enable;
        t = enable;
    }

    private static String s() {
        return "<Unknown>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(String str) {
        return str;
    }

    public static void trace() {
        if (r) {
            I(h, "<<<<====", 0, 'v');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(String str) {
        return s() + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(String str) {
        return str;
    }

    public static void w(String tag, final String message) {
        int i2 = n;
        if (i2 <= i || i2 >= l) {
            return;
        }
        HMLog.warn(tag, new Function0() { // from class: s41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Debug.D(message);
            }
        });
        q(tag, new Function0() { // from class: n41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Debug.E(message);
            }
        }, false);
    }

    public static void warn(final String msg) {
        I(h, msg, 0, 'w');
        q(h, new Function0() { // from class: t41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Debug.H(msg);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z(String str) {
        return "" + str + "";
    }

    public static void ble(String tag, Function0<String> message) {
        if (u.booleanValue()) {
            BleLog.log(tag, message, null, true);
        }
    }

    public static void e(String tag, final String message, Throwable e2) {
        if (n > i) {
            HMLog.error(tag, "", e2, new Function0() { // from class: w41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Debug.u(message);
                }
            });
            p(tag, new Function0() { // from class: u41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Debug.v(message);
                }
            }, e2, false);
        }
    }

    public static void enable(boolean logcatEnable, boolean fileLogEnable, String logfilePath) {
        m = logfilePath;
        n = logcatEnable ? j : i;
        r(logcatEnable);
        o = fileLogEnable;
        if (!fileLogEnable || logfilePath.isEmpty()) {
            return;
        }
        u = Boolean.TRUE;
        BleLog.initLog(logfilePath);
    }

    public static void w(String tag, final String msg, Throwable tr) {
        int i2 = n;
        if (i2 <= i || i2 >= l) {
            return;
        }
        HMLog.warn(tag, tr, new Function0() { // from class: v41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Debug.F(msg);
            }
        });
        p(tag, new Function0() { // from class: r41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Debug.G(msg);
            }
        }, tr, false);
    }
}
