package com.xiaomi.fitness.component;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.Trace;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.component.AppComponentManager;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 E2\u00020\u0001:\u0002DEB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J<\u0010\u001a\u001a\u00020\u0016*\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00052\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001d0\u001cH\u0002J\u001c\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007J\"\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010!J\u0018\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J\u001a\u0010+\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0018\u0010,\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0002J \u0010/\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0006H\u0003J\u0018\u00102\u001a\u00020\u00162\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0006H\u0003J\u0018\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020(2\u0006\u00100\u001a\u00020\tH\u0002J\u0018\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020(2\u0006\u00100\u001a\u00020\tH\u0002J \u00106\u001a\u0002072\u0006\u00104\u001a\u00020(2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000fH\u0002J\u0010\u0010:\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010;\u001a\u00020\u0016H\u0002J\u0010\u0010<\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020\u0016H\u0002J\u0018\u0010>\u001a\u00020\u00162\u0006\u00104\u001a\u00020(2\u0006\u00108\u001a\u00020\u000bH\u0002J\u0010\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020(H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\f\u001a$\u0012\u0004\u0012\u00020\t\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/component/AppComponentManager;", "", "<init>", "()V", "mActiveAppComponents", "", "", "Lcom/xiaomi/fitness/component/AppComponentDelegate;", "mMainComponentInitMap", "", "", "Lcom/xiaomi/fitness/component/Task;", "mBackgroundComponentInitMap", "mEventTaskMap", "mCountDownLatchMap", "Ljava/util/concurrent/CountDownLatch;", "mTaskExecutor", "Ljava/util/concurrent/Executor;", "mIsMainProcess", "", "mCurrentProcessName", LoginPreferenceConfig.TYPE_REGISTER, "", "configuration", "Lcom/xiaomi/fitness/component/ComponentConfiguration;", "register$component_runtime_release", "putTaskMap", "map", "", "", "sendBroadcastEvent", i.d, "input", "Landroid/os/Bundle;", "callMethod", "component", "method", "inputData", "handleEvent", "application", "Landroid/app/Application;", "event", "Lcom/xiaomi/fitness/component/ComponentEvent;", "handleBroadcastEvent", "handleStandardEvent", PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/fitness/component/StandardComponentEvent;", "handleTask", "appTime", "info", "waitBackgroundTaskFinish", "performMainTask", "app", "startBackgroundTasks", "createTaskRunnable", "Ljava/lang/Runnable;", "task", "countDownLatch", "performConfigChange", "performLowMemory", "performTrimMemory", "performRemoveAll", "performTask", "taskExecutor", "getTaskExecutor", "()Ljava/util/concurrent/Executor;", "inMainProcess", "context", "PerformTrimMemoryRunnable", "Companion", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppComponentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppComponentManager.kt\ncom/xiaomi/fitness/component/AppComponentManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,451:1\n1863#2,2:452\n37#3:454\n36#3,3:455\n*S KotlinDebug\n*F\n+ 1 AppComponentManager.kt\ncom/xiaomi/fitness/component/AppComponentManager\n*L\n240#1:452,2\n339#1:454\n339#1:455,3\n*E\n"})
public final class AppComponentManager {

    @NotNull
    private static final String LAUNCH_TIMING = "LT";
    private static int sDefaultPriorityThreadCount;

    @Nullable
    private String mCurrentProcessName;
    private boolean mIsMainProcess;

    @Nullable
    private Executor mTaskExecutor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AppComponentManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: ag1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppComponentManager.instance_delegate$lambda$9();
        }
    });

    @NotNull
    private final Map<String, AppComponentDelegate<?>> mActiveAppComponents = new TreeMap();

    @NotNull
    private final Map<Integer, List<Task>> mMainComponentInitMap = new TreeMap();

    @NotNull
    private final Map<Integer, Map<Integer, List<Task>>> mBackgroundComponentInitMap = new TreeMap();

    @NotNull
    private final Map<String, Task> mEventTaskMap = new TreeMap();

    @NotNull
    private final Map<Integer, List<CountDownLatch>> mCountDownLatchMap = new ConcurrentHashMap();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0002J3\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001c\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/component/AppComponentManager$Companion;", "", "<init>", "()V", "LAUNCH_TIMING", "", "instance", "Lcom/xiaomi/fitness/component/AppComponentManager;", "getInstance", "()Lcom/xiaomi/fitness/component/AppComponentManager;", "instance$delegate", "Lkotlin/Lazy;", "sDefaultPriorityThreadCount", "", PluginPackageConstant.RN_INSTALL_DIR_KEY, "", "registerTasks", "configuration", "Lcom/xiaomi/fitness/component/ComponentConfiguration;", "createDefaultExecutor", "Ljava/util/concurrent/ExecutorService;", "createFixedPool", "poolSize", "safePerform", "func", "Ljava/lang/Runnable;", Constants.EXTRA_ERROR_MESSAGE, "args", "", "(Ljava/lang/Runnable;Ljava/lang/String;[Ljava/lang/Object;)V", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ExecutorService createDefaultExecutor() {
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((Runtime.getRuntime().availableProcessors() >> 1) + 1, 2);
            DebugUtils.INSTANCE.log("P-Size : " + iCoerceAtLeast);
            return createFixedPool(iCoerceAtLeast);
        }

        private final ExecutorService createFixedPool(int poolSize) {
            final int i = poolSize >> 1;
            return new ThreadPoolExecutor(0, poolSize, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: cg1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return AppComponentManager.Companion.createFixedPool$lambda$0(i, runnable);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread createFixedPool$lambda$0(final int i, final Runnable runnable) {
            return new Thread(runnable) { // from class: com.xiaomi.fitness.component.AppComponentManager$Companion$createFixedPool$1$1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    AppComponentManager.sDefaultPriorityThreadCount++;
                    if (AppComponentManager.sDefaultPriorityThreadCount <= i) {
                        Process.setThreadPriority(0);
                    } else {
                        Process.setThreadPriority(10);
                    }
                    super.run();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void safePerform(Runnable func, String errorMsg, Object... args) {
            if (func != null) {
                try {
                    func.run();
                } catch (Throwable unused) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                    Intrinsics.checkNotNullExpressionValue(String.format(errorMsg, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "format(...)");
                }
            }
        }

        @NotNull
        public final AppComponentManager getInstance() {
            return (AppComponentManager) AppComponentManager.instance$delegate.getValue();
        }

        public final void install() {
        }

        @JvmStatic
        public final void registerTasks(@NotNull ComponentConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            getInstance().register$component_runtime_release(configuration);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/component/AppComponentManager$PerformTrimMemoryRunnable;", "Ljava/lang/Runnable;", "callback", "Landroid/content/ComponentCallbacks2;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "<init>", "(Landroid/content/ComponentCallbacks2;Landroid/os/Bundle;)V", "getCallback", "()Landroid/content/ComponentCallbacks2;", "getBundle", "()Landroid/os/Bundle;", "run", "", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PerformTrimMemoryRunnable implements Runnable {

        @NotNull
        private final Bundle bundle;

        @NotNull
        private final ComponentCallbacks2 callback;

        public PerformTrimMemoryRunnable(@NotNull ComponentCallbacks2 callback, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.callback = callback;
            this.bundle = bundle;
        }

        @NotNull
        public final Bundle getBundle() {
            return this.bundle;
        }

        @NotNull
        public final ComponentCallbacks2 getCallback() {
            return this.callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onTrimMemory(this.bundle.getInt("level"));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StandardComponentEvent.values().length];
            try {
                iArr[StandardComponentEvent.APP_ATTACH_CONTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StandardComponentEvent.BEFORE_APP_CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StandardComponentEvent.APP_CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StandardComponentEvent.AFTER_APP_CREATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StandardComponentEvent.BEFORE_FIRST_ACT_CREATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StandardComponentEvent.FIRST_ACT_CREATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StandardComponentEvent.AFTER_FIRST_ACT_CREATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StandardComponentEvent.BEFORE_MAIN_ACTIVITY_CREATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StandardComponentEvent.MAIN_ACTIVITY_CREATED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StandardComponentEvent.AFTER_MAIN_ACTIVITY_CREATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StandardComponentEvent.MAIN_HANDLER_IDLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StandardComponentEvent.CONFIG_CHANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StandardComponentEvent.LOW_MEMORY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StandardComponentEvent.TRIM_MEMORY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StandardComponentEvent.ON_REMOVE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AppComponentManager() {
    }

    private final Runnable createTaskRunnable(final Application app, final Task task, final CountDownLatch countDownLatch) {
        return new Runnable() { // from class: yf1
            @Override // java.lang.Runnable
            public final void run() {
                AppComponentManager.createTaskRunnable$lambda$5(task, this, app, countDownLatch);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTaskRunnable$lambda$5(Task task, AppComponentManager this$0, Application app, CountDownLatch countDownLatch) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app, "$app");
        Intrinsics.checkNotNullParameter(countDownLatch, "$countDownLatch");
        while (task != null) {
            try {
                this$0.performTask(app, task);
            } catch (Exception unused) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("perform task " + task.getNamespace() + "-" + task.getTaskId(), Arrays.copyOf(new Object[0], 0)), "format(...)");
            }
            task = task.getNext();
        }
        countDownLatch.countDown();
    }

    private final Executor getTaskExecutor() {
        if (this.mTaskExecutor == null) {
            this.mTaskExecutor = INSTANCE.createDefaultExecutor();
        }
        Executor executor = this.mTaskExecutor;
        Intrinsics.checkNotNull(executor);
        return executor;
    }

    private final void handleBroadcastEvent(final String eventName, Bundle input) {
        final Bundle bundle;
        final Task task = this.mEventTaskMap.get(eventName);
        if (task != null) {
            if (input != null) {
                Object objClone = input.clone();
                Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type android.os.Bundle");
                bundle = (Bundle) objClone;
            } else {
                bundle = null;
            }
            getTaskExecutor().execute(new Runnable() { // from class: vf1
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentManager.handleBroadcastEvent$lambda$2(eventName, task, this, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBroadcastEvent$lambda$2(String eventName, Task task, AppComponentManager this$0, Bundle bundle) {
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DebugUtils.INSTANCE.log("send event: " + eventName);
        while (task != null) {
            try {
                this$0.callMethod(task.getNamespace(), String.valueOf(task.getTaskId()), bundle);
            } catch (Exception e) {
                DebugUtils.INSTANCE.err(e, "error happen, send " + eventName + " to " + task.getNamespace() + "." + task.getName());
            }
            task = task.getNext();
        }
    }

    private final void handleStandardEvent(final Application application, StandardComponentEvent e) {
        switch (WhenMappings.$EnumSwitchMapping$0[e.ordinal()]) {
            case 1:
                DebugUtils debugUtils = DebugUtils.INSTANCE;
                debugUtils.newTimingLogger(LAUNCH_TIMING);
                this.mIsMainProcess = inMainProcess(application);
                performMainTask(application, 1);
                debugUtils.split(LAUNCH_TIMING, "main @ APP_ATTACH_CONTEXT");
                startBackgroundTasks(application, 1);
                debugUtils.split(LAUNCH_TIMING, "post-tasks @ APP_ATTACH_CONTEXT");
                waitBackgroundTaskFinish(1, "@ APP_ATTACH_CONTEXT");
                debugUtils.split(LAUNCH_TIMING, "wait-done @ APP_ATTACH_CONTEXT");
                return;
            case 2:
                handleTask(application, 2, "@ BEFORE_APP_CREATED");
                return;
            case 3:
                handleTask(application, 3, "@ APP_CONTEXT");
                return;
            case 4:
                handleTask(application, 4, "@ AFTER_APP_CREATED");
                return;
            case 5:
                handleTask(application, 5, "@ BEFORE_FIRST_ACT_CREATE");
                return;
            case 6:
                handleTask(application, 6, "@ FIRST_ACT_CREATED");
                return;
            case 7:
                handleTask(application, 7, "@ AFTER_FIRST_ACT_CREATE");
                AppCallbackMediator.INSTANCE.dumpLog();
                return;
            case 8:
                handleTask(application, 9, "@ BEFORE_MAIN_ACT_CREATED");
                return;
            case 9:
                handleTask(application, 10, "@ MAIN_ACT_CREATED");
                return;
            case 10:
                handleTask(application, 11, "@ AFTER_MAIN_ACT_CREATED");
                return;
            case 11:
                ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: bg1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppComponentManager.handleStandardEvent$lambda$3(this.f4169a, application);
                    }
                }, 31, null);
                return;
            case 12:
                performConfigChange(e);
                return;
            case 13:
                performLowMemory();
                return;
            case 14:
                performTrimMemory(e);
                return;
            case 15:
                performRemoveAll();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleStandardEvent$lambda$3(AppComponentManager this$0, Application application) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(application, "$application");
        this$0.handleTask(application, 8, "@ MAIN_HANDLER_IDLE");
        DebugUtils.INSTANCE.dumpLog(LAUNCH_TIMING, true);
        return Unit.INSTANCE;
    }

    private final void handleTask(Application application, int appTime, String info) {
        DebugUtils debugUtils = DebugUtils.INSTANCE;
        debugUtils.split(LAUNCH_TIMING, "start " + info);
        startBackgroundTasks(application, appTime);
        debugUtils.split(LAUNCH_TIMING, "post-tasks " + info);
        performMainTask(application, appTime);
        debugUtils.split(LAUNCH_TIMING, "main " + info);
        waitBackgroundTaskFinish(appTime, info);
        debugUtils.split(LAUNCH_TIMING, "wait-done " + info);
    }

    private final boolean inMainProcess(Application context) {
        this.mCurrentProcessName = ApplicationExtKt.getProcessName(context);
        return Intrinsics.areEqual(context.getPackageName(), this.mCurrentProcessName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppComponentManager instance_delegate$lambda$9() {
        return new AppComponentManager();
    }

    private final void performConfigChange(StandardComponentEvent e) {
        for (Map.Entry<String, AppComponentDelegate<?>> entry : this.mActiveAppComponents.entrySet()) {
            String key = entry.getKey();
            final Object singleton = entry.getValue().getSingleton();
            if (singleton instanceof ComponentCallbacks2) {
                Bundle mData = e.getMData();
                Objects.requireNonNull(mData);
                Intrinsics.checkNotNull(mData);
                Parcelable parcelable = mData.getParcelable(StandardComponentEvent.KEY_NEW_CONFIG);
                Objects.requireNonNull(parcelable);
                final Configuration configuration = (Configuration) parcelable;
                INSTANCE.safePerform(new Runnable() { // from class: zf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppComponentManager.performConfigChange$lambda$6(singleton, configuration);
                    }
                }, "%s call configChange fail", key);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performConfigChange$lambda$6(Object obj, Configuration configuration) {
        Intrinsics.checkNotNull(configuration);
        ((ComponentCallbacks2) obj).onConfigurationChanged(configuration);
    }

    private final void performLowMemory() {
        for (Map.Entry<String, AppComponentDelegate<?>> entry : this.mActiveAppComponents.entrySet()) {
            String key = entry.getKey();
            final Object singleton = entry.getValue().getSingleton();
            if (singleton instanceof ComponentCallbacks) {
                INSTANCE.safePerform(new Runnable() { // from class: wf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppComponentManager.performLowMemory$lambda$7(singleton);
                    }
                }, key + " call lowMemory fail", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performLowMemory$lambda$7(Object obj) {
        ((ComponentCallbacks) obj).onLowMemory();
    }

    private final void performMainTask(Application app, int appTime) {
        List<Task> list = this.mMainComponentInitMap.get(Integer.valueOf(appTime));
        if (list != null) {
            for (Task next : list) {
                for (; next != null; next = next.getNext()) {
                    Trace.beginSection(ApplicationExtKt.getProcessName(app) + ">>>" + next.getNamespace() + "--" + next.getTaskId());
                    performTask(app, next);
                    Trace.endSection();
                }
            }
        }
    }

    private final void performRemoveAll() {
        for (String str : (String[]) this.mActiveAppComponents.keySet().toArray(new String[0])) {
            AppComponentDelegate<?> appComponentDelegateRemove = this.mActiveAppComponents.remove(str);
            if (appComponentDelegateRemove != null) {
                final Object singleton = appComponentDelegateRemove.getSingleton();
                if (singleton instanceof OnRemoveCallback) {
                    INSTANCE.safePerform(new Runnable() { // from class: xf1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppComponentManager.performRemoveAll$lambda$8(singleton);
                        }
                    }, str + " call onRemove fail", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performRemoveAll$lambda$8(Object obj) {
        ((OnRemoveCallback) obj).onRemove();
    }

    private final void performTask(Application app, Task task) {
        boolean zAreEqual;
        AppComponentDelegate<?> appComponentDelegate = this.mActiveAppComponents.get(task.getNamespace());
        if (appComponentDelegate == null) {
            String namespace = task.getNamespace();
            int taskId = task.getTaskId();
            StringBuilder sb = new StringBuilder();
            sb.append("not found task ");
            sb.append(namespace);
            sb.append("-");
            sb.append(taskId);
            return;
        }
        try {
            if (!task.getMultiProcess()) {
                if (task.getProcessName().length() == 0) {
                    zAreEqual = this.mIsMainProcess;
                } else if (StringsKt__StringsJVMKt.startsWith$default(task.getProcessName(), ":", false, 2, null)) {
                    zAreEqual = Intrinsics.areEqual(app.getPackageName() + task.getProcessName(), this.mCurrentProcessName);
                } else {
                    zAreEqual = Intrinsics.areEqual(task.getProcessName(), this.mCurrentProcessName);
                }
                if (!zAreEqual) {
                    return;
                }
            }
            System.currentTimeMillis();
            appComponentDelegate.performTask(app, task.getTaskId());
            DebugUtils.INSTANCE.split(LAUNCH_TIMING, task.getNamespace() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + task.getName() + "(" + task.getTaskId() + ")");
        } catch (Exception unused) {
            String namespace2 = task.getNamespace();
            int taskId2 = task.getTaskId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("perform task ");
            sb2.append(namespace2);
            sb2.append("-");
            sb2.append(taskId2);
            sb2.append(" fail");
        }
    }

    private final void performTrimMemory(StandardComponentEvent e) {
        for (Map.Entry<String, AppComponentDelegate<?>> entry : this.mActiveAppComponents.entrySet()) {
            String key = entry.getKey();
            Object singleton = entry.getValue().getSingleton();
            if (singleton instanceof ComponentCallbacks2) {
                Bundle mData = e.getMData();
                Objects.requireNonNull(mData);
                Intrinsics.checkNotNull(mData);
                INSTANCE.safePerform(new PerformTrimMemoryRunnable((ComponentCallbacks2) singleton, mData), key + " call trimMemory fail", new Object[0]);
            }
        }
    }

    private final void putTaskMap(Map<Integer, List<Task>> map, Map<Integer, ? extends List<Task>> map2) {
        for (Map.Entry<Integer, ? extends List<Task>> entry : map2.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<Task> value = entry.getValue();
            List<Task> arrayList = map.get(Integer.valueOf(iIntValue));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (value != null) {
                arrayList.addAll(value);
            }
            map.put(Integer.valueOf(iIntValue), arrayList);
        }
    }

    @JvmStatic
    public static final void registerTasks(@NotNull ComponentConfiguration componentConfiguration) {
        INSTANCE.registerTasks(componentConfiguration);
    }

    public static /* synthetic */ void sendBroadcastEvent$default(AppComponentManager appComponentManager, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        appComponentManager.sendBroadcastEvent(str, bundle);
    }

    private final void startBackgroundTasks(Application app, int appTime) {
        Map<Integer, List<Task>> map = this.mBackgroundComponentInitMap.get(Integer.valueOf(appTime));
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, List<Task>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<Task> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                List<CountDownLatch> linkedList = this.mCountDownLatchMap.get(Integer.valueOf(iIntValue));
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    this.mCountDownLatchMap.put(Integer.valueOf(iIntValue), linkedList);
                }
                CountDownLatch countDownLatch = new CountDownLatch(value.size());
                linkedList.add(countDownLatch);
                Iterator<Task> it = value.iterator();
                while (it.hasNext()) {
                    getTaskExecutor().execute(createTaskRunnable(app, it.next(), countDownLatch));
                }
            }
        }
    }

    private final void waitBackgroundTaskFinish(int appTime, String info) {
        List<CountDownLatch> list = this.mCountDownLatchMap.get(Integer.valueOf(appTime));
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<CountDownLatch> it = list.iterator();
        while (it.hasNext()) {
            CountDownLatch next = it.next();
            Trace.beginSection(String.valueOf(next));
            try {
                if (!next.await(4L, TimeUnit.SECONDS)) {
                    DebugUtils.INSTANCE.warn("[" + appTime + ", " + info + "] cost too much time, will not wait it");
                }
                it.remove();
                Trace.endSection();
            } catch (InterruptedException e) {
                throw new IllegalStateException(info, e);
            }
        }
    }

    @Nullable
    public final Bundle callMethod(@NotNull String component, @NotNull String method, @Nullable Bundle inputData) throws ComponentException {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(method, "method");
        AppComponentDelegate<?> appComponentDelegate = this.mActiveAppComponents.get(component);
        if (appComponentDelegate == null) {
            DebugUtils.INSTANCE.warn("not found method: " + component + "-" + method);
            return null;
        }
        try {
            Object objCallTask = appComponentDelegate.callTask(AppCallbackMediator.INSTANCE.getSApplication(), method, inputData);
            Intrinsics.checkNotNull(objCallTask, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) objCallTask;
            DebugUtils.INSTANCE.log("call method " + component + ":" + method);
            return bundle;
        } catch (Exception e) {
            DebugUtils.INSTANCE.err(e, "Error when call method " + component + ":" + method);
            throw new ComponentException(e);
        }
    }

    public final void handleEvent(@Nullable Application application, @NotNull ComponentEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof StandardComponentEvent)) {
            sendBroadcastEvent(event.getEventName(), null);
        } else {
            Intrinsics.checkNotNull(application);
            handleStandardEvent(application, (StandardComponentEvent) event);
        }
    }

    public final void register$component_runtime_release(@NotNull ComponentConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.mActiveAppComponents.putAll(configuration.createAppComponentDelegates());
        putTaskMap(this.mMainComponentInitMap, configuration.createMainComponentInitMap());
        for (Map.Entry<Integer, Map<Integer, List<Task>>> entry : configuration.createBackgroundComponentInitMap().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Map<Integer, List<Task>> value = entry.getValue();
            Map<Integer, List<Task>> linkedHashMap = this.mBackgroundComponentInitMap.get(Integer.valueOf(iIntValue));
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            if (value != null) {
                putTaskMap(linkedHashMap, value);
            }
            this.mBackgroundComponentInitMap.put(Integer.valueOf(iIntValue), linkedHashMap);
        }
        this.mEventTaskMap.putAll(configuration.createOnEventTaskMap());
    }

    @JvmOverloads
    public final void sendBroadcastEvent(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        sendBroadcastEvent$default(this, eventName, null, 2, null);
    }

    @JvmOverloads
    public final void sendBroadcastEvent(@NotNull String eventName, @Nullable Bundle input) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        handleBroadcastEvent(eventName, input);
    }
}
