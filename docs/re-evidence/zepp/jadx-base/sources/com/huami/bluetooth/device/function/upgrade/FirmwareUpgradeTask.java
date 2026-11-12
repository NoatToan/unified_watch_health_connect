package com.huami.bluetooth.device.function.upgrade;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.utils.AsyncHandler;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\t*\u0001!\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b%\u0010'J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010#¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeTask;", "", "Lkotlin/Function0;", "", "task", "c", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmware", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "callback", "start", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgrade;", "a", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgrade;", "updater", "Landroid/os/Looper;", "b", "Landroid/os/Looper;", "looper", "", "Z", "working", "Lcom/xiaomi/hm/health/bt/utils/AsyncHandler;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/utils/AsyncHandler;", "asyncHandler", "e", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "Landroid/os/Handler;", "f", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "com/huami/bluetooth/device/function/upgrade/FirmwareUpgradeTask$internalCallback$2$1", "g", "()Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeTask$internalCallback$2$1;", "internalCallback", "<init>", "(Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgrade;Landroid/os/Looper;)V", "(Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgrade;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FirmwareUpgradeTask {

    @NotNull
    private static final String h = "FirmwareUpgradeTask";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FirmwareUpgrade updater;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Looper looper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile boolean working;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private AsyncHandler asyncHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private FirmwareUpgradeCallback callback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy internalCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HandlerThread> i = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeTask$Companion;", "", "Landroid/os/HandlerThread;", "workerThread$delegate", "Lkotlin/Lazy;", "a", "()Landroid/os/HandlerThread;", "workerThread", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "workerThread", "getWorkerThread()Landroid/os/HandlerThread;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HandlerThread a() {
            return (HandlerThread) FirmwareUpgradeTask.i.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/HandlerThread;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HandlerThread> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread(FirmwareUpgradeTask.h);
            handlerThread.start();
            return handlerThread;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Handler> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(FirmwareUpgradeTask.this.looper);
        }
    }

    public FirmwareUpgradeTask(@NotNull FirmwareUpgrade firmwareUpgrade, @NotNull Looper looper) {
        this.updater = firmwareUpgrade;
        this.looper = looper;
        this.handler = LazyKt__LazyJVMKt.lazy(new b());
        this.internalCallback = LazyKt__LazyJVMKt.lazy(new Function0<FirmwareUpgradeTask$internalCallback$2.AnonymousClass1>() { // from class: com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final FirmwareUpgradeTask firmwareUpgradeTask = this.a;
                return new FirmwareUpgradeCallback() { // from class: com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2.1

                    /* JADX INFO: renamed from: com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<Unit> {
                        public final /* synthetic */ FirmwareUpgradeTask a;
                        public final /* synthetic */ FirmwareUpgradeResult b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(FirmwareUpgradeTask firmwareUpgradeTask, FirmwareUpgradeResult firmwareUpgradeResult) {
                            super(0);
                            this.a = firmwareUpgradeTask;
                            this.b = firmwareUpgradeResult;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.a.working = false;
                            FirmwareUpgradeCallback firmwareUpgradeCallback = this.a.callback;
                            Objects.requireNonNull(firmwareUpgradeCallback);
                            firmwareUpgradeCallback.onComplete(this.b);
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2$1$b */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<Unit> {
                        public final /* synthetic */ FirmwareUpgradeTask a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(FirmwareUpgradeTask firmwareUpgradeTask) {
                            super(0);
                            this.a = firmwareUpgradeTask;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            FirmwareUpgradeCallback firmwareUpgradeCallback = this.a.callback;
                            Objects.requireNonNull(firmwareUpgradeCallback);
                            firmwareUpgradeCallback.onPreLoad();
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2$1$c */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class c extends Lambda implements Function0<Unit> {
                        public final /* synthetic */ FirmwareUpgradeTask a;
                        public final /* synthetic */ Progress b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public c(FirmwareUpgradeTask firmwareUpgradeTask, Progress progress) {
                            super(0);
                            this.a = firmwareUpgradeTask;
                            this.b = progress;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            FirmwareUpgradeCallback firmwareUpgradeCallback = this.a.callback;
                            Objects.requireNonNull(firmwareUpgradeCallback);
                            firmwareUpgradeCallback.onProgress(this.b);
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask$internalCallback$2$1$d */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class d extends Lambda implements Function0<Unit> {
                        public final /* synthetic */ FirmwareUpgradeTask a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public d(FirmwareUpgradeTask firmwareUpgradeTask) {
                            super(0);
                            this.a = firmwareUpgradeTask;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            FirmwareUpgradeCallback firmwareUpgradeCallback = this.a.callback;
                            Objects.requireNonNull(firmwareUpgradeCallback);
                            firmwareUpgradeCallback.onStart();
                        }
                    }

                    @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
                    public void onComplete(@NotNull FirmwareUpgradeResult result) {
                        Debug.fi("FirmwareUpgradeTask", Intrinsics.stringPlus("onComplete: ", result));
                        Debug.fi("FirmwareUpgradeTask", Intrinsics.stringPlus("upgrade ret : ", Boolean.valueOf(result == FirmwareUpgradeResult.COMPLETE)));
                        FirmwareUpgradeTask firmwareUpgradeTask2 = firmwareUpgradeTask;
                        firmwareUpgradeTask2.c(new a(firmwareUpgradeTask2, result));
                    }

                    @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
                    public void onPreLoad() {
                        Debug.fi("FirmwareUpgradeTask", "onPreLoad");
                        FirmwareUpgradeTask firmwareUpgradeTask2 = firmwareUpgradeTask;
                        firmwareUpgradeTask2.c(new b(firmwareUpgradeTask2));
                    }

                    @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
                    public void onProgress(@NotNull Progress progress) {
                        FirmwareUpgradeTask firmwareUpgradeTask2 = firmwareUpgradeTask;
                        firmwareUpgradeTask2.c(new c(firmwareUpgradeTask2, progress));
                    }

                    @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
                    public void onStart() {
                        Debug.fi("FirmwareUpgradeTask", "onStart");
                        FirmwareUpgradeTask firmwareUpgradeTask2 = firmwareUpgradeTask;
                        firmwareUpgradeTask2.c(new d(firmwareUpgradeTask2));
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final Function0<Unit> task) {
        Unit unit;
        AsyncHandler asyncHandler = this.asyncHandler;
        if (asyncHandler == null) {
            unit = null;
        } else {
            asyncHandler.run(new Runnable() { // from class: f82
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpgradeTask.d(task);
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            task.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0) {
        function0.invoke();
    }

    private final Handler e() {
        return (Handler) this.handler.getValue();
    }

    private final FirmwareUpgradeTask$internalCallback$2.AnonymousClass1 f() {
        return (FirmwareUpgradeTask$internalCallback$2.AnonymousClass1) this.internalCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(FirmwareUpgradeTask firmwareUpgradeTask, HMFirmwareInfo hMFirmwareInfo) {
        firmwareUpgradeTask.updater.upgradeFirmware(hMFirmwareInfo, firmwareUpgradeTask.f());
    }

    public final void start(@NotNull final HMFirmwareInfo firmware, @NotNull FirmwareUpgradeCallback callback) {
        if (this.working) {
            Debug.fi(h, "Start failed: upgrade working!");
            callback.onComplete(FirmwareUpgradeResult.FAILED);
        } else {
            this.working = true;
            this.callback = callback;
            try {
                this.asyncHandler = new AsyncHandler();
            } catch (RuntimeException unused) {
            }
            e().post(new Runnable() { // from class: e82
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpgradeTask.g(this.a, firmware);
                }
            });
        }
    }

    public FirmwareUpgradeTask(@NotNull FirmwareUpgrade firmwareUpgrade) {
        this(firmwareUpgrade, INSTANCE.a().getLooper());
    }
}
