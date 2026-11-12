package com.xiaomi.fitness.sensor;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sensor.InteractiveDetector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sensor/InteractiveDetector;", "Lcom/xiaomi/fitness/sensor/AbstractDetector;", "<init>", "()V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext$delegate", "Lkotlin/Lazy;", "mWorkHandler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread", "()Landroid/os/HandlerThread;", "handlerThread$delegate", "mScreenStateReceiver", "Landroid/content/BroadcastReceiver;", "detectEvent", "", "getDetectEvent", "()I", LifecycleConstantKt.ON_START, "", LifecycleConstantKt.ON_STOP, "onRequestRefresh", "indicator", "Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "checkIsInteractive", "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InteractiveDetector extends AbstractDetector {

    @Nullable
    private static Handler mWorkHandler;

    @NotNull
    public static final InteractiveDetector INSTANCE = new InteractiveDetector();

    /* JADX INFO: renamed from: mContext$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mContext = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cdd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApplicationExtKt.getApplication();
        }
    });

    /* JADX INFO: renamed from: handlerThread$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy handlerThread = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ddd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InteractiveDetector.handlerThread_delegate$lambda$1();
        }
    });

    @NotNull
    private static final BroadcastReceiver mScreenStateReceiver = new InteractiveDetector$mScreenStateReceiver$1();

    private InteractiveDetector() {
    }

    private final boolean checkIsInteractive() {
        if (((PowerManager) getMContext().getSystemService(PowerManager.class)).isInteractive()) {
            return !((KeyguardManager) getMContext().getSystemService(KeyguardManager.class)).isKeyguardLocked();
        }
        return false;
    }

    private final HandlerThread getHandlerThread() {
        return (HandlerThread) handlerThread.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getMContext() {
        return (Context) mContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerThread handlerThread_delegate$lambda$1() {
        HandlerThread handlerThread2 = new HandlerThread("SCREEN_ON");
        handlerThread2.start();
        return handlerThread2;
    }

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public int getDetectEvent() {
        return 2;
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onRequestRefresh(@NotNull IDetectorIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        boolean zCheckIsInteractive = checkIsInteractive();
        Logger.i("onRequestRefresh: checkIsInteractive = " + zCheckIsInteractive, new Object[0]);
        if (zCheckIsInteractive) {
            indicator.onRefresh(getDetectEvent(), 3, 2.0f);
        } else {
            indicator.onRefresh(getDetectEvent(), 3, 1.0f);
        }
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onStart() {
        mWorkHandler = new Handler(getHandlerThread().getLooper());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        getMContext().registerReceiver(mScreenStateReceiver, intentFilter, null, mWorkHandler);
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onStop() {
        try {
            getMContext().unregisterReceiver(mScreenStateReceiver);
        } catch (RuntimeException unused) {
        }
        Handler handler = mWorkHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
            mWorkHandler = null;
        }
    }
}
