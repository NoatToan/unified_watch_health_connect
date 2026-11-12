package com.xiaomi.hm.health.bt.profile.observe;

import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareInterruptedUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R1\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010#\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/observe/UpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareInterruptedUpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "", "none", "", "onFwStart", "", "result", "onFwStop", "errorCode", "onError", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onFwProgress", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "upgradingProgress", "onInterrupted", "", "message", "onLogMessage", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "a", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "b", "Lkotlin/jvm/functions/Function1;", "onStop", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "logObservable", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;Lkotlin/jvm/functions/Function1;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UpgradeCallback implements IFirmwareInterruptedUpgradeCallback, LogObservable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHMFirmwareUpgradeCallback callback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<Boolean, Unit> onStop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy logObservable = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LogObservable> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LogObservable invoke() {
            return (LogObservable) (UpgradeCallback.this.callback instanceof LogObservable ? UpgradeCallback.this.callback : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpgradeCallback(@NotNull IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback, @NotNull Function1<? super Boolean, Unit> function1) {
        this.callback = iHMFirmwareUpgradeCallback;
        this.onStop = function1;
    }

    private final LogObservable a() {
        return (LogObservable) this.logObservable.getValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void onError(int errorCode) {
        IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = this.callback;
        if (iHMFirmwareUpgradeCallback instanceof IFirmwareUpgradeCallback) {
            ((IFirmwareUpgradeCallback) iHMFirmwareUpgradeCallback).onError(errorCode);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwProgress(@Nullable Progress progress) {
        LogObservable logObservableA = a();
        if (logObservableA != null) {
            logObservableA.onLogMessage(String.valueOf(progress));
        }
        this.callback.onFwProgress(progress);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStart(int none) {
        this.callback.onFwStart(none);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStop(boolean result) {
        this.onStop.invoke(Boolean.valueOf(result));
        this.callback.onFwStop(result);
        LogObservable logObservableA = a();
        if (logObservableA == null) {
            return;
        }
        logObservableA.onLogMessage(Intrinsics.stringPlus("stop with result: ", Boolean.valueOf(result)));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareInterruptedUpgradeCallback
    public boolean onInterrupted() {
        IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = this.callback;
        if (iHMFirmwareUpgradeCallback instanceof IFirmwareInterruptedUpgradeCallback) {
            return ((IFirmwareInterruptedUpgradeCallback) iHMFirmwareUpgradeCallback).onInterrupted();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.observe.LogObservable
    public void onLogMessage(@NotNull String message) {
        LogObservable logObservableA = a();
        if (logObservableA == null) {
            return;
        }
        logObservableA.onLogMessage(message);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void upgradingProgress(@NotNull HMFirmwareType type, @NotNull Progress progress) {
        IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback = this.callback;
        if (iHMFirmwareUpgradeCallback instanceof IFirmwareUpgradeCallback) {
            ((IFirmwareUpgradeCallback) iHMFirmwareUpgradeCallback).upgradingProgress(type, progress);
        }
        LogObservable logObservableA = a();
        if (logObservableA == null) {
            return;
        }
        logObservableA.onLogMessage(type + " -- " + progress);
    }
}
