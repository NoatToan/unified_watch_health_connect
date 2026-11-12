package com.xiaomi.fitness.common.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u0012\u0010\u001a\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rJ\u0012\u0010+\u001a\u00020\u00182\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-J\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0007J\u0012\u0010/\u001a\u00020\u001e2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-J\u0014\u00100\u001a\u0004\u0018\u00010\u00072\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-J\u0006\u00101\u001a\u00020\u001eJ\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000703J\u0006\u00104\u001a\u00020\u0018J+\u00104\u001a\u00020\u00182\u001e\u00105\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010-06\"\b\u0012\u0002\b\u0003\u0018\u00010-¢\u0006\u0002\u00107J#\u00104\u001a\u00020\u00182\u0016\u00108\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r06\"\u0004\u0018\u00010\r¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u0018J\u0006\u0010;\u001a\u00020\u0018J\u0010\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\rH\u0002J>\u0010>\u001a\u00020\u001826\u0010?\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\r¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00180@J>\u0010C\u001a\u00020\u001826\u0010?\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\r¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00180@R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\t¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/common/app/AppManager;", "", "<init>", "()V", "app", "Landroid/app/Application;", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "setCurrentActivity", "(Landroid/app/Activity;)V", "mainActivity", "", "getMainActivity", "()Ljava/lang/String;", "setMainActivity", "(Ljava/lang/String;)V", "launcherActivity", "getLauncherActivity", "setLauncherActivity", "mLifecycleReceiver", "Lcom/xiaomi/fitness/common/app/LifecycleReceiver;", "init", "", "application", "registerLifecycleReceiver", "receiver", "Landroid/content/BroadcastReceiver;", "isAppForeground", "", "()Z", "visibleActivityCount", "", "getVisibleActivityCount", "()I", "setVisibleActivityCount", "(I)V", "onLifecycleReceive", LifecycleConstantKt.TYPE_ACTIVITY, "lifecycle", "topActivity", "getTopActivity", "killActivity", "activityClass", "Ljava/lang/Class;", "activityInstanceIsLive", "activityClassIsLive", "findActivity", "isMainActivityShowing", "getActivityList", "", "killAll", "excludeActivityClasses", "", "([Ljava/lang/Class;)V", "excludeActivityName", "([Ljava/lang/String;)V", "appExit", "onTerminate", "logi", "string", "registerLifecycleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "unregisterLifecycleListener", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppManager.kt\ncom/xiaomi/fitness/common/app/AppManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1863#2,2:235\n1863#2,2:237\n*S KotlinDebug\n*F\n+ 1 AppManager.kt\ncom/xiaomi/fitness/common/app/AppManager\n*L\n198#1:235,2\n202#1:237,2\n*E\n"})
public final class AppManager {

    @NotNull
    private static final String TAG = "AppManager";
    private Application app;

    @Nullable
    private Activity currentActivity;
    public String launcherActivity;

    @NotNull
    private final LifecycleReceiver mLifecycleReceiver = new LifecycleReceiver();
    public String mainActivity;
    private volatile int visibleActivityCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AppManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: ah1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppManager.instance_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/app/AppManager$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/common/app/AppManager;", "getInstance", "()Lcom/xiaomi/fitness/common/app/AppManager;", "instance$delegate", "Lkotlin/Lazy;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppManager getInstance() {
            return (AppManager) AppManager.instance$delegate.getValue();
        }
    }

    private AppManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppManager instance_delegate$lambda$3() {
        return new AppManager();
    }

    private final void logi(String string) {
        Logger.i(TAG, string);
    }

    public final boolean activityClassIsLive(@NotNull Class<?> activityClass) {
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        return findActivity(activityClass) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean activityInstanceIsLive(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return ActivityStack.INSTANCE.contains(activity.getClass());
    }

    public final void appExit() {
        try {
            logi("appExit");
            Iterator<T> it = getActivityList().iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).finish();
            }
            Application application = this.app;
            Application application2 = null;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app");
                application = null;
            }
            Object systemService = application.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid != Process.myPid()) {
                        Process.killProcess(runningAppProcessInfo.pid);
                    }
                }
            }
            Process.killProcess(Process.myPid());
            Application application3 = this.app;
            if (application3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app");
            } else {
                application2 = application3;
            }
            activityManager.killBackgroundProcesses(application2.getPackageName());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final Activity findActivity(@NotNull Class<?> activityClass) {
        Object next;
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        Iterator<T> it = ActivityStack.INSTANCE.getActivities().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Activity) next).getClass(), activityClass)) {
                return (Activity) next;
            }
        }
        next = null;
        return (Activity) next;
    }

    @NotNull
    public final List<Activity> getActivityList() {
        return ActivityStack.INSTANCE.getActivities();
    }

    @Nullable
    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    @NotNull
    public final String getLauncherActivity() {
        String str = this.launcherActivity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launcherActivity");
        return null;
    }

    @NotNull
    public final String getMainActivity() {
        String str = this.mainActivity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainActivity");
        return null;
    }

    @Nullable
    public final Activity getTopActivity() {
        return ActivityStack.INSTANCE.getTopActivity();
    }

    public final int getVisibleActivityCount() {
        return this.visibleActivityCount;
    }

    public final void init(@NotNull Application application, @NotNull String mainActivity, @NotNull String launcherActivity) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainActivity, "mainActivity");
        Intrinsics.checkNotNullParameter(launcherActivity, "launcherActivity");
        this.app = application;
        setMainActivity(mainActivity);
        setLauncherActivity(launcherActivity);
        registerLifecycleReceiver(application, this.mLifecycleReceiver);
        ActivityStack.INSTANCE.init(this.mLifecycleReceiver);
    }

    public final boolean isAppForeground() {
        Logger.i(TAG, "visibleActivityCount: " + this.visibleActivityCount);
        return this.visibleActivityCount > 0;
    }

    public final boolean isMainActivityShowing() {
        try {
            ActivityStack activityStack = ActivityStack.INSTANCE;
            Class<?> cls = Class.forName(getMainActivity());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            return Intrinsics.areEqual(activityStack.getLifecycle(findActivity(cls)), LifecycleConstantKt.ON_RESUME);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void killActivity(@NotNull Class<?> activityClass) {
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        Activity activityFindActivity = findActivity(activityClass);
        if (activityFindActivity != null) {
            activityFindActivity.finish();
        }
    }

    public final void killAll() {
        logi("killAll");
        ActivityStack.INSTANCE.exit();
    }

    public final void onLifecycleReceive(@NotNull String activity, @NotNull String lifecycle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Logger.i(TAG, "onLifecycleReceive() called with: activity = " + activity + ", lifecycle = " + lifecycle);
        if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_START)) {
            this.visibleActivityCount++;
        } else if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_STOP)) {
            this.visibleActivityCount--;
        }
    }

    public final void onTerminate() {
    }

    public final void registerLifecycleListener(@NotNull Function2<? super String, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mLifecycleReceiver.registerListener(listener);
    }

    public final void registerLifecycleReceiver(@NotNull Application application, @NotNull BroadcastReceiver receiver) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        String str = application.getPackageName() + ".action.PROCESS_MESSAGE";
        String str2 = application.getPackageName() + ".permission.RECEIVER_PROCESS_MESSAGE";
        IntentFilter intentFilter = new IntentFilter(str);
        HandlerThread handlerThread = new HandlerThread("lifecycle");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), null);
        if (Build.VERSION.SDK_INT >= 33) {
            application.registerReceiver(receiver, intentFilter, str2, handler, 2);
        } else {
            application.registerReceiver(receiver, intentFilter, str2, handler);
        }
    }

    public final void setCurrentActivity(@Nullable Activity activity) {
        this.currentActivity = activity;
    }

    public final void setLauncherActivity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.launcherActivity = str;
    }

    public final void setMainActivity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainActivity = str;
    }

    public final void setVisibleActivityCount(int i) {
        this.visibleActivityCount = i;
    }

    public final void unregisterLifecycleListener(@NotNull Function2<? super String, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mLifecycleReceiver.unregisterListener(listener);
    }

    public final void killAll(@NotNull Class<?>... excludeActivityClasses) {
        Intrinsics.checkNotNullParameter(excludeActivityClasses, "excludeActivityClasses");
        List listListOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(excludeActivityClasses, excludeActivityClasses.length));
        Iterator<Activity> it = getActivityList().iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (!listListOf.contains(next.getClass())) {
                it.remove();
                next.finish();
            }
        }
    }

    public final void killAll(@NotNull String... excludeActivityName) {
        Intrinsics.checkNotNullParameter(excludeActivityName, "excludeActivityName");
        List listListOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(excludeActivityName, excludeActivityName.length));
        Iterator<Activity> it = getActivityList().iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (!listListOf.contains(next.getClass().getName())) {
                it.remove();
                next.finish();
            }
        }
    }
}
