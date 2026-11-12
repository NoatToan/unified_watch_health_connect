package com.xmlywind.sdk.common.c;

import android.os.Process;
import android.text.TextUtils;
import com.xmlywind.sdk.common.mta.PointEntityCrash;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes22.dex */
public class a implements Thread.UncaughtExceptionHandler {
    private static a b;
    private Thread.UncaughtExceptionHandler a;

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    private boolean a(final Throwable th) {
        if (th == null) {
            return false;
        }
        new Thread(new Runnable() { // from class: com.xmlywind.sdk.common.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.b(th);
            }
        }).start();
        try {
            Thread.sleep(1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            while (true) {
                th = th.getCause();
                if (th == null) {
                    break;
                } else {
                    th.printStackTrace(printWriter);
                }
            }
            printWriter.close();
            String string = stringWriter.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (string.contains("com.sigmob") || string.contains("com.wind")) {
                PointEntityCrash.WindCrash("crash", string).sendServe();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void b() {
        this.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            a(th);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
        }
    }
}
