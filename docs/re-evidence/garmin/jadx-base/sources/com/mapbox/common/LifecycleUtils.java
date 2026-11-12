package com.mapbox.common;

import am.j;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import cd0.f;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ3\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0010\u0010\u0018J3\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/mapbox/common/LifecycleUtils;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/common/LifecycleState;", "getAppStatePreLollipop", "(Landroid/content/Context;)Lcom/mapbox/common/LifecycleState;", "getAppStateLollipopAndHigher", "getAppStateQAndHigher", "", "buildVersion", "getAppLifecycleStateFromActivityManager", "(ILandroid/content/Context;)Lcom/mapbox/common/LifecycleState;", "", "hasServiceRunningInForeground", "(Landroid/content/Context;)Z", "getLifecycleState", "Landroid/os/Looper;", "looper", "Lkotlin/Function1;", "", "callback", "(Landroid/content/Context;Landroid/os/Looper;Le23/l;)V", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "threadPool", "Ljava/util/concurrent/ExecutorService;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LifecycleUtils {
    public static final LifecycleUtils INSTANCE = new LifecycleUtils();
    private static final String TAG = "LifecycleUtils";
    private static ExecutorService threadPool;

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        executorServiceNewFixedThreadPool.getClass();
        threadPool = executorServiceNewFixedThreadPool;
    }

    private LifecycleUtils() {
    }

    private final LifecycleState getAppStateLollipopAndHigher(Context context) {
        Object bVar;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        LifecycleState lifecycleState = LifecycleState.BACKGROUND;
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            try {
                int i14 = q.f128596b;
                if (appTask.getTaskInfo().id != -1) {
                    lifecycleState = LifecycleState.FOREGROUND;
                }
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                Log.error(j.p("Failed to get task properties: ", thB), TAG);
            }
        }
        return lifecycleState;
    }

    private final LifecycleState getAppStatePreLollipop(Context context) {
        Object bVar;
        ComponentName componentName;
        String packageName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        String packageName2 = context.getApplicationContext().getPackageName();
        LifecycleState lifecycleState = LifecycleState.UNKNOWN;
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(32);
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            try {
                int i14 = q.f128596b;
                if (runningTaskInfo == null || (componentName = runningTaskInfo.topActivity) == null || (packageName = componentName.getPackageName()) == null) {
                    bVar = null;
                } else {
                    if (packageName.equals(packageName2)) {
                        lifecycleState = LifecycleState.FOREGROUND;
                    }
                    bVar = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                Log.error(j.p("Failed to get task properties: ", thB), TAG);
            }
        }
        return (runningTasks.size() >= 32 || lifecycleState != LifecycleState.UNKNOWN) ? lifecycleState : LifecycleState.BACKGROUND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.mapbox.common.LifecycleState] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final LifecycleState getAppStateQAndHigher(Context context) {
        Object bVar;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        ?? it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
            try {
                int i14 = q.f128596b;
                Log.info("Task: " + appTask.getTaskInfo(), TAG);
                if (appTask.getTaskInfo().isRunning) {
                    it = LifecycleState.FOREGROUND;
                    return it;
                }
                bVar = Unit.INSTANCE;
                it = it;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
                it = it;
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                Log.error(j.p("Failed to get task properties: ", thB), TAG);
            }
        }
        return LifecycleState.BACKGROUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24(Context context, Looper looper, l lVar) {
        Object bVar;
        context.getClass();
        lVar.getClass();
        LifecycleUtils lifecycleUtils = INSTANCE;
        try {
            int i14 = q.f128596b;
            if (!lifecycleUtils.hasServiceRunningInForeground(context)) {
                LifecycleState appLifecycleStateFromActivityManager = lifecycleUtils.getAppLifecycleStateFromActivityManager(context);
                if (looper != null) {
                    bVar = Boolean.valueOf(new Handler(looper).post(new f(23, lVar, appLifecycleStateFromActivityManager)));
                } else {
                    lVar.invoke(appLifecycleStateFromActivityManager);
                    bVar = Unit.INSTANCE;
                }
            } else if (looper != null) {
                bVar = Boolean.valueOf(new Handler(looper).post(new c(lVar, 2)));
            } else {
                lVar.invoke(LifecycleState.FOREGROUND);
                bVar = Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            Log.error(j.p("Failed to get application state: ", thB), TAG);
            if (looper != null) {
                new Handler(looper).post(new c(lVar, 3));
            } else {
                lVar.invoke(LifecycleState.UNKNOWN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(l lVar) {
        lVar.getClass();
        lVar.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18(l lVar, LifecycleState lifecycleState) {
        lVar.getClass();
        lifecycleState.getClass();
        lVar.invoke(lifecycleState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(l lVar) {
        lVar.getClass();
        lVar.invoke(LifecycleState.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15(Context context, Looper looper, l lVar) {
        context.getClass();
        lVar.getClass();
        boolean zHasServiceRunningInForeground = INSTANCE.hasServiceRunningInForeground(context);
        if (looper != null) {
            new Handler(looper).post(new e(lVar, zHasServiceRunningInForeground, 1));
        } else {
            lVar.invoke(Boolean.valueOf(zHasServiceRunningInForeground));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13(l lVar, boolean z14) {
        lVar.getClass();
        lVar.invoke(Boolean.valueOf(z14));
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final LifecycleState getAppLifecycleStateFromActivityManager(int buildVersion, Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT < 29 || buildVersion < 29) {
            return buildVersion >= 21 ? getAppStateLollipopAndHigher(context) : getAppStatePreLollipop(context);
        }
        return getAppStateQAndHigher(context);
    }

    @o13.e
    public final LifecycleState getLifecycleState(Context context) {
        context.getClass();
        try {
            int i14 = q.f128596b;
            return hasServiceRunningInForeground(context) ? LifecycleState.FOREGROUND : getAppLifecycleStateFromActivityManager(context);
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            Throwable thB = q.b(new q.b(th3));
            if (thB != null) {
                Log.error(j.p("Failed to get application state: ", thB), TAG);
            }
            return LifecycleState.UNKNOWN;
        }
    }

    @o13.e
    public final boolean hasServiceRunningInForeground(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        context.getClass();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String packageName = context.getPackageName();
        if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (runningServiceInfo != null && s.g(runningServiceInfo.service.getPackageName(), packageName) && runningServiceInfo.foreground) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final LifecycleState getAppLifecycleStateFromActivityManager(Context context) {
        context.getClass();
        return getAppLifecycleStateFromActivityManager(Build.VERSION.SDK_INT, context);
    }

    public final void getLifecycleState(Context context, Looper looper, l<? super LifecycleState, Unit> callback) {
        context.getClass();
        callback.getClass();
        threadPool.submit(new d(context, looper, callback, 1));
    }

    public final void hasServiceRunningInForeground(Context context, Looper looper, l<? super Boolean, Unit> callback) {
        context.getClass();
        callback.getClass();
        threadPool.submit(new d(context, looper, callback, 0));
    }
}
