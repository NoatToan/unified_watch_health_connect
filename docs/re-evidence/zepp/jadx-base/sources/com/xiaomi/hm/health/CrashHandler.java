package com.xiaomi.hm.health;

import com.huami.tools.log.HMLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {
    public static final String TAG = "crash";
    private static CrashHandler b;
    private Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    private CrashHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void a(Throwable ex) {
        if (ex == null) {
            HMLog.e("crash", "应用崩溃！无异常对象", new Object[0]);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ex.printStackTrace(printWriter);
        for (Throwable cause = ex.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        HMLog.e("crash", ex, "应用崩溃！", new Object[0]);
    }

    public static CrashHandler getInstance() {
        return b;
    }

    public static void init() {
        if (b == null) {
            b = new CrashHandler();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable ex) {
        a(ex);
        CustomCrashHandler customCrashHandler = CustomCrashHandler.INSTANCE;
        if (customCrashHandler.methodIsInStackTrace(ex, "com.ingenic.iwds.utils.IwdsAssert.dieIf")) {
            HMLog.e("crash", "君正库dieIf方法抛出的RuntimeException异常不处理", new Object[0]);
            return;
        }
        customCrashHandler.handleUncaughtException(thread, ex);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, ex);
        }
    }
}
