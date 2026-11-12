package com.xiaomi.hm.health.device.firmware;

import android.app.Activity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.OtaModule;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J%\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0007R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\u0019\u0010\"R\u001d\u0010&\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\u001d\u0010%R\"\u0010-\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R*\u00109\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/FwUnZipStatusHolder;", "Lorg/koin/core/component/KoinComponent;", "", "initOtaModule", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "", "isUpgrading", "", "getUpgradeProgress", "onConnected", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "log", "e", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/Function0;", "action", "onDisconnected", GoogleApiAvailabilityLight.a, "onEnterForeground", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "PERCENT_INVALID", "", "c", "J", "START_DELAY", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "f", "Z", "getStarting", "()Z", "setStarting", "(Z)V", "starting", "Ljava/util/concurrent/ConcurrentHashMap;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "upgradingMap", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "h", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "getUnZipCallback", "()Lcom/xiaomi/hm/health/bt/device/HMCallback;", "setUnZipCallback", "(Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "unZipCallback", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FwUnZipStatusHolder implements KoinComponent {

    @NotNull
    public static final FwUnZipStatusHolder INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "FwUnZipStatusHolder";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int PERCENT_INVALID = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long START_DELAY = 5000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static volatile boolean starting;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<HMDeviceType, Integer> upgradingMap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private static HMCallback<Integer> unZipCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "free";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$initOtaModule$1$1", f = "FwUnZipStatusHolder.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HMLog.i(FwUnZipStatusHolder.TAG, "响应固件主动更新", new Object[0]);
                    ConcurrentHashMap concurrentHashMap = FwUnZipStatusHolder.upgradingMap;
                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                    concurrentHashMap.put(hMDeviceType, Boxing.boxInt(0));
                    FwUnZipStatusHolder fwUnZipStatusHolder = FwUnZipStatusHolder.INSTANCE;
                    HMBaseDevice device = fwUnZipStatusHolder.b().getDevice(hMDeviceType);
                    HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
                    this.a = 1;
                    if (fwUnZipStatusHolder.e(hMMiLiProDevice, "固件主动通知开始解压缩，跳转并锁定页面", this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "return as background";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "return as activity null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "gt2UpgradeTo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$onConnected$1", f = "FwUnZipStatusHolder.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceType b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ UpgradeStatueResponse a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UpgradeStatueResponse upgradeStatueResponse) {
                super(0);
                this.a = upgradeStatueResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "upgradeStatus: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "e: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMDeviceType hMDeviceType, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = hMDeviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UpgradeStatueResponse upgradeStatusSync;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FwUnZipStatusHolder fwUnZipStatusHolder = FwUnZipStatusHolder.INSTANCE;
                HMBaseDevice device = fwUnZipStatusHolder.b().getDevice(this.b);
                if (!(device instanceof HMMiLiProDevice)) {
                    fwUnZipStatusHolder.a(this.b);
                    return Unit.INSTANCE;
                }
                try {
                    upgradeStatusSync = ((HMMiLiProDevice) device).getUpgradeStatusSync();
                } catch (Exception e) {
                    HMLog.info(FwUnZipStatusHolder.TAG, new b(e));
                    upgradeStatusSync = null;
                }
                HMLog.info(FwUnZipStatusHolder.TAG, new a(upgradeStatusSync));
                if (!FwUnZipStatusHolderKt.match(upgradeStatusSync, UpgradeStatus.IN_UPGRADING)) {
                    FwUnZipStatusHolder.INSTANCE.a(this.b);
                    return Unit.INSTANCE;
                }
                this.a = 1;
                if (FwUnZipStatusHolder.INSTANCE.e((HMMiLiProDevice) device, "连接上后发现在升级中，锁定页面", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$onEnterForeground$1", f = "FwUnZipStatusHolder.kt", i = {}, l = {177, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$onEnterForeground$1$1", f = "FwUnZipStatusHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FwUnZipStatusHolder.INSTANCE.d("进前台后发现在升级中，直接锁死页面");
                return Unit.INSTANCE;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (!FwUnZipStatusHolder.isUpgrading(HMDeviceType.MILI)) {
                return Unit.INSTANCE;
            }
            if (FwUnZipStatusHolder.INSTANCE.getStarting()) {
                this.a = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!FwUnZipStatusHolder.isUpgrading(HMDeviceType.MILI)) {
                return Unit.INSTANCE;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$registerCallbackAndJump$3", f = "FwUnZipStatusHolder.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (FwUnZipStatusHolder.INSTANCE.getStarting()) {
                    this.a = 1;
                    if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!FwUnZipStatusHolder.isUpgrading(HMDeviceType.MILI)) {
                return Unit.INSTANCE;
            }
            FwUnZipStatusHolder.INSTANCE.d(this.b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final FwUnZipStatusHolder fwUnZipStatusHolder = new FwUnZipStatusHolder();
        INSTANCE = fwUnZipStatusHolder;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = fwUnZipStatusHolder;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = fwUnZipStatusHolder;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
        upgradingMap = new ConcurrentHashMap<>();
    }

    private FwUnZipStatusHolder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(HMDeviceType deviceType) {
        HMLog.info(TAG, a.a);
        upgradingMap.put(deviceType, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi b() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    private final DeviceXNavigator c() {
        return (DeviceXNavigator) deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String log) {
        if (!DeviceXFunctionsKt.getAppStateApi().isForeground()) {
            HMLog.info(TAG, c.a);
            return;
        }
        Activity topActivity = DeviceXFunctionsKt.getAppStateApi().getTopActivity();
        if (topActivity == null) {
            HMLog.info(TAG, d.a);
        } else {
            HMLog.info(TAG, new e(log));
            c().startHMGt2SystemUpgradeActivity(topActivity, false, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(HMMiLiProDevice hMMiLiProDevice, String str, Continuation<? super Unit> continuation) throws Throwable {
        if (hMMiLiProDevice == null) {
            return Unit.INSTANCE;
        }
        HMLog.i(TAG, "注册更新进度监听，并准备跳转至升级页面", new Object[0]);
        hMMiLiProDevice.registerUpgradeCallback(new HMCallback<Integer>() { // from class: com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder$registerCallbackAndJump$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "query upgrade onFinish: " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Progress a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Progress progress) {
                    super(0);
                    this.a = progress;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "progress: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                FwUnZipStatusHolder fwUnZipStatusHolder = FwUnZipStatusHolder.INSTANCE;
                HMCallback<Integer> unZipCallback2 = fwUnZipStatusHolder.getUnZipCallback();
                if (unZipCallback2 != null) {
                    unZipCallback2.onFinish(result);
                }
                HMLog.info("FwUnZipStatusHolder", new a(result));
                fwUnZipStatusHolder.a(HMDeviceType.MILI);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onProgress(@Nullable Progress progress) {
                HMCallback<Integer> unZipCallback2 = FwUnZipStatusHolder.INSTANCE.getUnZipCallback();
                if (unZipCallback2 != null) {
                    unZipCallback2.onProgress(progress);
                }
                HMLog.info("FwUnZipStatusHolder", new b(progress));
                if (progress == null) {
                    return;
                }
                FwUnZipStatusHolder.upgradingMap.put(HMDeviceType.MILI, Integer.valueOf(progress.getPercent()));
            }
        });
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new h(str, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @JvmStatic
    public static final int getUpgradeProgress(@NotNull HMDeviceType deviceType) {
        Integer num = upgradingMap.get(deviceType);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @JvmStatic
    public static final void initOtaModule() {
        HMBaseDevice device = INSTANCE.b().getDevice(HMDeviceType.MILI);
        OtaModule otaModule = device == null ? null : (OtaModule) device.getChannelModule(OtaModule.class);
        HMLog.i(TAG, "otaModule: " + otaModule, new Object[0]);
        if (otaModule == null) {
            return;
        }
        otaModule.setUnZipListener(b.a);
    }

    @JvmStatic
    public static final boolean isUpgrading(@NotNull HMDeviceType deviceType) {
        Integer num = upgradingMap.get(deviceType);
        return num != null && num.intValue() >= 0;
    }

    @JvmStatic
    public static final void onConnected(@NotNull HMDeviceType deviceType) {
        FwUnZipStatusHolder fwUnZipStatusHolder = INSTANCE;
        initOtaModule();
        if (FwUpgradeFeature.INSTANCE.supportSilentUpgrade(deviceType)) {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new f(deviceType, null), 2, null);
        } else {
            fwUnZipStatusHolder.a(deviceType);
        }
    }

    @JvmStatic
    public static final void onDisconnected(@NotNull HMDeviceType deviceType, @Nullable Function0<Unit> action) {
        INSTANCE.a(deviceType);
        if (action == null) {
            return;
        }
        action.invoke();
    }

    @JvmStatic
    public static final void onEnterForeground() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new g(null), 2, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean getStarting() {
        return starting;
    }

    @Nullable
    public final HMCallback<Integer> getUnZipCallback() {
        return unZipCallback;
    }

    public final void setStarting(boolean z) {
        starting = z;
    }

    public final void setUnZipCallback(@Nullable HMCallback<Integer> hMCallback) {
        unZipCallback = hMCallback;
    }
}
