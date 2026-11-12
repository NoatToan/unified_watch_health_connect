package com.xiaomi.fitness.component;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppCallbackMediator;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u000fJ\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J(\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/component/AppCallbackMediator;", "", "<init>", "()V", "sApplication", "Landroid/app/Application;", "getSApplication", "()Landroid/app/Application;", "setSApplication", "(Landroid/app/Application;)V", "sStart", "", "sFirstActCreated", "", "attachBaseContext", "", "application", "init", "provider", "Lcom/xiaomi/fitness/component/ComponentConfigProvider;", "onCreate", "onRemove", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "installAppComponentManager", "dumpLog", "onBeforeCreate", "onAfterCreate", "listenAppLifecycle", "deliverActivityEvent", "lifecycle", "", "before", "Lcom/xiaomi/fitness/component/StandardComponentEvent;", DebugKt.DEBUG_PROPERTY_VALUE_ON, "after", "deliverEvent", "event", "Lcom/xiaomi/fitness/component/ComponentEvent;", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppCallbackMediator {
    public static Application sApplication;
    private static boolean sFirstActCreated;

    @NotNull
    public static final AppCallbackMediator INSTANCE = new AppCallbackMediator();
    private static final long sStart = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: com.xiaomi.fitness.component.AppCallbackMediator$listenAppLifecycle$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/component/AppCallbackMediator$listenAppLifecycle$1", "Lkotlin/Function2;", "", "", "invoke", LifecycleConstantKt.TYPE_ACTIVITY, "lifecycle", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements Function2<String, String, Unit> {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(String activity, String lifecycle) {
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(lifecycle, "$lifecycle");
            AppManager.Companion companion = AppManager.INSTANCE;
            if (StringsKt__StringsJVMKt.startsWith$default(activity, companion.getInstance().getLauncherActivity(), false, 2, null)) {
                Logger.i("deliver first activity create event: " + lifecycle + ">>>" + ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()), new Object[0]);
                AppCallbackMediator.INSTANCE.deliverActivityEvent(lifecycle, StandardComponentEvent.BEFORE_FIRST_ACT_CREATED, StandardComponentEvent.FIRST_ACT_CREATED, StandardComponentEvent.AFTER_FIRST_ACT_CREATED);
                return;
            }
            if (StringsKt__StringsJVMKt.startsWith$default(activity, companion.getInstance().getMainActivity(), false, 2, null)) {
                Logger.i("deliver main activity create event: " + lifecycle + ">>>" + ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()), new Object[0]);
                AppCallbackMediator.INSTANCE.deliverActivityEvent(lifecycle, StandardComponentEvent.BEFORE_MAIN_ACTIVITY_CREATED, StandardComponentEvent.MAIN_ACTIVITY_CREATED, StandardComponentEvent.AFTER_MAIN_ACTIVITY_CREATED);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            invoke2(str, str2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(final String activity, final String lifecycle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: af1
                @Override // java.lang.Runnable
                public final void run() {
                    AppCallbackMediator.AnonymousClass1.invoke$lambda$0(activity, lifecycle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.component.AppCallbackMediator$onAfterCreate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/fitness/component/AppCallbackMediator$onAfterCreate$1", "Ljava/lang/Runnable;", "mRetryCount", "", "getMRetryCount", "()I", "setMRetryCount", "(I)V", "run", "", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RunnableC18531 implements Runnable {
        final /* synthetic */ Handler $handler;
        private int mRetryCount;

        public RunnableC18531(Handler handler) {
            this.$handler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean run$lambda$0() {
            AppCallbackMediator.INSTANCE.deliverEvent(StandardComponentEvent.MAIN_HANDLER_IDLE);
            return false;
        }

        public final int getMRetryCount() {
            return this.mRetryCount;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AppCallbackMediator.sFirstActCreated && this.mRetryCount < 2) {
                this.$handler.postDelayed(this, 500L);
                this.mRetryCount++;
            } else {
                MessageQueue queue = Looper.getMainLooper().getQueue();
                Intrinsics.checkNotNullExpressionValue(queue, "getQueue(...)");
                queue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: bf1
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        return AppCallbackMediator.RunnableC18531.run$lambda$0();
                    }
                });
            }
        }

        public final void setMRetryCount(int i) {
            this.mRetryCount = i;
        }
    }

    private AppCallbackMediator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverActivityEvent(String lifecycle, StandardComponentEvent before, StandardComponentEvent on, StandardComponentEvent after) {
        if (Build.VERSION.SDK_INT <= 28) {
            if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_CREATED)) {
                deliverEvent(before);
                deliverEvent(on);
                deliverEvent(after);
                return;
            }
            return;
        }
        int iHashCode = lifecycle.hashCode();
        if (iHashCode == -1930133495) {
            if (lifecycle.equals(LifecycleConstantKt.ON_CREATED)) {
                deliverEvent(on);
            }
        } else if (iHashCode == 1242961412) {
            if (lifecycle.equals(LifecycleConstantKt.ON_PRE_CREATED)) {
                deliverEvent(before);
            }
        } else if (iHashCode == 2042761929 && lifecycle.equals(LifecycleConstantKt.ON_POST_CREATED)) {
            deliverEvent(after);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverEvent(ComponentEvent event) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            AppComponentManager.INSTANCE.getInstance().handleEvent(getSApplication(), event);
            Logger.d("AppCallbackMediator", "deliverEvent: " + event + ", cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception e) {
            Logger.e(DebugUtils.TAG_APP_COMP, "handle event fail: " + event.getEventName(), e);
        }
    }

    private final void listenAppLifecycle() {
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new AnonymousClass1());
    }

    private final void onAfterCreate() {
        deliverEvent(StandardComponentEvent.AFTER_APP_CREATED);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new RunnableC18531(handler), VibrateModeProgressBar.sLongToLong);
    }

    private final void onBeforeCreate() {
        deliverEvent(StandardComponentEvent.BEFORE_APP_CREATED);
    }

    public final void attachBaseContext(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        setSApplication(application);
        deliverEvent(StandardComponentEvent.APP_ATTACH_CONTEXT);
        listenAppLifecycle();
    }

    public final void dumpLog() {
        DebugUtils.INSTANCE.log("comp-init cost : " + (SystemClock.elapsedRealtime() - sStart) + "ms");
    }

    @NotNull
    public final Application getSApplication() {
        Application application = sApplication;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sApplication");
        return null;
    }

    public final void init(@NotNull ComponentConfigProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Iterator<ComponentConfiguration> it = provider.constructSet().iterator();
        while (it.hasNext()) {
            AppComponentManager.INSTANCE.getInstance().register$component_runtime_release(it.next());
        }
    }

    public final void installAppComponentManager(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        AppComponentManager.INSTANCE.install();
    }

    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Bundle bundle = new Bundle();
        bundle.putParcelable(StandardComponentEvent.KEY_NEW_CONFIG, newConfig);
        deliverEvent(StandardComponentEvent.CONFIG_CHANGE.setData(bundle));
    }

    public final void onCreate() {
        onBeforeCreate();
        deliverEvent(StandardComponentEvent.APP_CREATE);
        onAfterCreate();
    }

    public final void onLowMemory() {
        deliverEvent(StandardComponentEvent.LOW_MEMORY);
    }

    public final void onRemove() {
        deliverEvent(StandardComponentEvent.ON_REMOVE);
    }

    public final void onTrimMemory(int level) {
        Bundle bundle = new Bundle();
        bundle.putInt("level", level);
        deliverEvent(StandardComponentEvent.TRIM_MEMORY.setData(bundle));
    }

    public final void setSApplication(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        sApplication = application;
    }
}
