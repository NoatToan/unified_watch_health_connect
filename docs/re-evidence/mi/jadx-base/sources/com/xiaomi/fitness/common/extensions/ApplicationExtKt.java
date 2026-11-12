package com.xiaomi.fitness.common.extensions;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\n\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u0012\u0010\r\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001\u001a\n\u0010\u0013\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u000b*\u00020\u0010\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0012\u0010\u0018\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\f\"\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"processName", "", "Landroid/app/Application;", "getProcessName", "(Landroid/app/Application;)Ljava/lang/String;", "getCurrentProcessNameByActivityThread", "getCurrentProcessNameByActivityManager", "application", "getApplication", "()Landroid/app/Application;", "isMainProcess", "", "(Landroid/app/Application;)Z", "isSameProcess", ServiceUtils.EXTRA_PROCESS, "safeContext", "Landroid/content/Context;", "getSafeContext", "(Landroid/content/Context;)Landroid/content/Context;", "isForeground", "isBackground", "startAppDefault", "", "packageName", "isRunningProcess", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApplicationExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationExt.kt\ncom/xiaomi/fitness/common/extensions/ApplicationExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1863#2,2:142\n*S KotlinDebug\n*F\n+ 1 ApplicationExt.kt\ncom/xiaomi/fitness/common/extensions/ApplicationExtKt\n*L\n134#1:142,2\n*E\n"})
public final class ApplicationExtKt {
    @NotNull
    public static final Application getApplication() {
        return AppUtil.getApp();
    }

    private static final String getCurrentProcessNameByActivityManager(Application application) {
        int iMyPid = Process.myPid();
        Object systemService = application.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String getCurrentProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            Logger.e("can't get process name because " + th, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static final String getProcessName(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        String currentProcessNameByActivityThread = getCurrentProcessNameByActivityThread();
        return currentProcessNameByActivityThread == null ? getCurrentProcessNameByActivityManager(application) : currentProcessNameByActivityThread;
    }

    @NotNull
    public static final Context getSafeContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Application application = context instanceof Application ? (Application) context : null;
        if (application != null) {
            return application;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final boolean isBackground(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        while (true) {
            boolean z = true;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (Intrinsics.areEqual(runningAppProcessInfo.processName, context.getPackageName())) {
                    int i = runningAppProcessInfo.importance;
                    if (i != 400 && (i == 100 || i == 200)) {
                        z = false;
                    }
                }
            }
            return z;
        }
    }

    public static final boolean isForeground(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        Object systemService = application.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
        List<ActivityManager.RunningTaskInfo> list = runningTasks;
        if (list == null || list.isEmpty()) {
            return false;
        }
        ComponentName componentName = runningTasks.get(0).topActivity;
        String packageName = componentName != null ? componentName.getPackageName() : null;
        return !TextUtils.isEmpty(packageName) && Intrinsics.areEqual(packageName, application.getPackageName());
    }

    public static final boolean isMainProcess(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        return Intrinsics.areEqual(getProcessName(application), application.getPackageName());
    }

    public static final boolean isRunningProcess(@NotNull Application application, @NotNull String process) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        Intrinsics.checkNotNullParameter(process, "process");
        Object systemService = application.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
        if (list != null && !list.isEmpty()) {
            if (StringsKt__StringsJVMKt.startsWith$default(process, ":", false, 2, null)) {
                process = application.getPackageName() + process;
            }
            Iterator<T> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ActivityManager.RunningAppProcessInfo) it.next()).processName, process)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isSameProcess(@NotNull Application application, @NotNull String process) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        Intrinsics.checkNotNullParameter(process, "process");
        if (StringsKt__StringsJVMKt.startsWith$default(process, ":", false, 2, null)) {
            process = application.getPackageName() + process;
        }
        return Intrinsics.areEqual(process, getProcessName(application));
    }

    public static final void startAppDefault(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(335544320);
        }
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
        }
    }
}
