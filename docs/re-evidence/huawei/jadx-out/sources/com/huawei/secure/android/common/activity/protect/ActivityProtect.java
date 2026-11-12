package com.huawei.secure.android.common.activity.protect;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes42.dex */
public final class ActivityProtect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f22736a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22737b = "ActivityProtect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IActivityProtect f22738c = null;
    private static ExceptionHandler d = null;
    private static boolean e = false;
    private static boolean f;

    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (ActivityProtect.d != null) {
                ActivityProtect.d.uncaughtExceptionHappened(thread, th);
            }
            if (thread == Looper.getMainLooper().getThread()) {
                ActivityProtect.c(th);
                ActivityProtect.d(th);
                ActivityProtect.g();
            }
        }
    }

    class b implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f22739a;

        b(Handler handler) {
            this.f22739a = handler;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ActivityProtect.d(message, this.f22739a);
            }
            ActivityProtect.i();
            return ActivityProtect.c(message, this.f22739a);
        }
    }

    private ActivityProtect() {
    }

    private static void d() throws Exception {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null);
        Field declaredField = cls.getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(objInvoke);
        Field declaredField2 = Handler.class.getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new b(handler));
    }

    private static void e() {
        if (Build.VERSION.SDK_INT >= 28) {
            f22738c = new e();
        } else {
            f22738c = new d();
        }
        try {
            d();
        } catch (Throwable th) {
            com.huawei.secure.android.common.activity.a.a(f22737b, "initActivityProtect: " + th.getMessage(), th);
        }
    }

    private static void f(Message message, Handler handler) {
        try {
            handler.handleMessage(message);
        } catch (Throwable th) {
            f22738c.finishLaunchActivity(message);
            e(th);
        }
    }

    private static void g(Message message, Handler handler) {
        try {
            handler.handleMessage(message);
        } catch (Throwable th) {
            f22738c.finishPauseActivity(message);
            e(th);
        }
    }

    private static void h(Message message, Handler handler) {
        try {
            handler.handleMessage(message);
        } catch (Throwable th) {
            f22738c.finishResumeActivity(message);
            e(th);
        }
    }

    private static void i(Message message, Handler handler) {
        try {
            handler.handleMessage(message);
        } catch (Throwable th) {
            f22738c.finishStopActivity(message);
            e(th);
        }
    }

    public static void init(Context context, ExceptionHandler exceptionHandler) {
        if (e) {
            return;
        }
        try {
            f.a(context);
        } catch (Throwable th) {
            com.huawei.secure.android.common.activity.a.a(f22737b, "un reflect error :" + th.getMessage(), th);
        }
        e = true;
        d = exceptionHandler;
        e();
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Message message, Handler handler) {
        int i = message.what;
        if (i == 104) {
            i(message, handler);
            return true;
        }
        if (i == 107) {
            h(message, handler);
            return true;
        }
        if (i == 109) {
            e(message, handler);
            return true;
        }
        switch (i) {
            case 100:
                f(message, handler);
                return true;
            case 101:
            case 102:
                g(message, handler);
                return true;
            default:
                return false;
        }
    }

    private static boolean f() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Infinite loop detected, blocks: 16, insns: 0 */
    public static void g() {
        f = true;
        if (d != null) {
            com.huawei.secure.android.common.activity.a.b(f22737b, "safeMode: enter safe mode");
        }
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                c(th);
                d(th);
                if (d != null) {
                    d.a(th);
                }
            }
        }
    }

    private static void h() {
        if (f22736a) {
            return;
        }
        com.huawei.secure.android.common.activity.a.b(f22737b, "handleMessage: >= 28");
        f22736a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        if (f22736a) {
            return;
        }
        com.huawei.secure.android.common.activity.a.b(f22737b, "handleMessage: < 28");
        f22736a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Message message, Handler handler) {
        h();
        if (message.what != 159) {
            return false;
        }
        try {
            handler.handleMessage(message);
            return true;
        } catch (Throwable th) {
            f22738c.finishLaunchActivity(message);
            e(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Throwable th) {
        if (th == null || d == null) {
            return;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        do {
            length--;
            if (length <= -1 || stackTrace.length - length > 20) {
                return;
            }
        } while (!"java.lang.ThreadGroup".equals(stackTrace[length].getClassName()));
        com.huawei.secure.android.common.activity.a.a(f22737b, "java.lang.ThreadGroup , suggest killing self ");
    }

    private static void e(Message message, Handler handler) {
        try {
            handler.handleMessage(message);
        } catch (Throwable th) {
            e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Throwable th) {
        if (th == null || d == null) {
            return;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            length--;
            if (length <= -1 || stackTrace.length - length > 20) {
                return;
            }
            StackTraceElement stackTraceElement = stackTrace[length];
            if ("android.view.Choreographer".equals(stackTraceElement.getClassName()) && "Choreographer.java".equals(stackTraceElement.getFileName()) && "doFrame".equals(stackTraceElement.getMethodName())) {
                com.huawei.secure.android.common.activity.a.a(f22737b, "isChoreographerException BlackScreen , suggest killing self ");
                return;
            }
        }
    }

    private static void e(Throwable th) {
        if (d == null) {
            return;
        }
        if (f()) {
            d.a(th);
        } else {
            d.uncaughtExceptionHappened(Looper.getMainLooper().getThread(), th);
            g();
        }
    }
}
