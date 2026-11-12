package defpackage;

import android.content.Context;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.util.ISimpleHandler;
import java.util.HashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class dxw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f32495a;
    private HashMap<String, ISimpleHandler> d = new HashMap<>(8);
    private volatile ScheduledThreadPoolExecutor e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dxw f32494c = new dxw();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f32493b = new Object();

    private dxw() {
    }

    public static Context d() {
        return BaseApplication.b();
    }

    public static void c(Runnable runnable) {
        ThreadPoolManager.c().execute(runnable);
    }

    public static void d(Runnable runnable) {
        b().execute(runnable);
    }

    public static ScheduledFuture<?> e(Runnable runnable, long j) {
        if (runnable != null) {
            return e().schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
        return null;
    }

    public static boolean a(Runnable runnable) {
        return runnable != null && e().remove(runnable);
    }

    public static void d(String str, ISimpleHandler iSimpleHandler) {
        if (iSimpleHandler == null || str == null || str.trim().length() <= 0) {
            return;
        }
        synchronized (f32493b) {
            dxw dxwVar = f32494c;
            if (!dxwVar.d.containsKey(str)) {
                dxwVar.d.put(str, iSimpleHandler);
            }
        }
    }

    public static void a(String str, ISimpleHandler iSimpleHandler) {
        if (str != null) {
            synchronized (f32493b) {
                f32494c.d.remove(str);
            }
        }
    }

    public static void a(String str, Message message) {
        ISimpleHandler iSimpleHandler;
        synchronized (f32493b) {
            iSimpleHandler = f32494c.d.get(str);
        }
        if (iSimpleHandler != null) {
            iSimpleHandler.handleMessage(message);
        }
    }

    private static ScheduledThreadPoolExecutor e() {
        dxw dxwVar = f32494c;
        if (dxwVar.e != null) {
            return dxwVar.e;
        }
        synchronized (dxwVar) {
            if (dxwVar.e == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(15, new ThreadPoolManager.DefaultThreadFactory("envsd"));
                if (scheduledThreadPoolExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS) > 0) {
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                dxwVar.e = scheduledThreadPoolExecutor;
            }
        }
        return dxwVar.e;
    }

    private static ThreadPoolExecutor b() {
        dxw dxwVar = f32494c;
        if (dxwVar.f32495a != null) {
            return dxwVar.f32495a;
        }
        synchronized (dxwVar) {
            if (dxwVar.f32495a == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 20, 30L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadPoolManager.DefaultThreadFactory("envfx"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                dxwVar.f32495a = threadPoolExecutor;
            }
        }
        return dxwVar.f32495a;
    }
}
