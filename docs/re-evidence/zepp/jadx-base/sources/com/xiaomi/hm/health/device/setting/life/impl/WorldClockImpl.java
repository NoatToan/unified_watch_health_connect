package com.xiaomi.hm.health.device.setting.life.impl;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.DataChangeCallback;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.worldclock.controller.IWorldClockController;
import com.huami.worldclock.controller.WorldClockController;
import com.huami.worldclock.manager.WorldClockConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/WorldClockImpl;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "c", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "b", "e", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "", "a", "Ljava/lang/Boolean;", "hasWorldTimeSwInDis", "Lcom/huami/worldclock/controller/IWorldClockController;", "Lkotlin/Lazy;", "()Lcom/huami/worldclock/controller/IWorldClockController;", "worldClockController", "", "Lcom/huami/bluetooth/profile/channel/module/DataChangeCallback;", "Ljava/util/Map;", "worldClockListeners", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WorldClockImpl implements DeviceLifeCycle {

    @NotNull
    private static final String d = "WorldClockImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Boolean hasWorldTimeSwInDis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy worldClockController = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, DataChangeCallback> worldClockListeners = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.WorldClockImpl$enable$1", f = "WorldClockImpl.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockImpl.this.new a(this.c, continuation);
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
                WorldClockImpl worldClockImpl = WorldClockImpl.this;
                HMBaseDevice hMBaseDevice = this.c;
                this.a = 1;
                if (worldClockImpl.d(hMBaseDevice, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.WorldClockImpl$onDeviceBind$1", f = "WorldClockImpl.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WorldClockImpl worldClockImpl = WorldClockImpl.this;
                HMBaseDevice hMBaseDevice = this.c;
                this.a = 1;
                if (worldClockImpl.c(hMBaseDevice, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.WorldClockImpl$onDeviceStatusChange$1$1", f = "WorldClockImpl.kt", i = {}, l = {77, 79, 82, 83}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ HMBaseDevice d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "device upgrade , support world clock";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, HMBaseDevice hMBaseDevice, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockImpl.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x008e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WorldClockImpl worldClockImpl;
            HMBaseDevice hMBaseDevice;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        worldClockImpl = WorldClockImpl.this;
                        hMBaseDevice = this.d;
                        this.a = 4;
                        if (worldClockImpl.d(hMBaseDevice, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HMLog.info(WorldClockImpl.d, a.a);
                if (Intrinsics.areEqual(WorldClockImpl.this.hasWorldTimeSwInDis, Boxing.boxBoolean(false)) && this.c) {
                    if (WorldClockConfig.INSTANCE.isFirstUsing()) {
                        WorldClockImpl worldClockImpl2 = WorldClockImpl.this;
                        HMBaseDevice hMBaseDevice2 = this.d;
                        this.a = 1;
                        if (worldClockImpl2.c(hMBaseDevice2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        WorldClockImpl worldClockImpl3 = WorldClockImpl.this;
                        HMBaseDevice hMBaseDevice3 = this.d;
                        this.a = 2;
                        if (worldClockImpl3.d(hMBaseDevice3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (WorldClockConfig.INSTANCE.isNeedPushToDevice()) {
                    IWorldClockController iWorldClockControllerA = WorldClockImpl.this.a();
                    Application context = DeviceXFunctionsKt.getContext();
                    this.a = 3;
                    if (iWorldClockControllerA.queryWorldTime(context, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    worldClockImpl = WorldClockImpl.this;
                    hMBaseDevice = this.d;
                    this.a = 4;
                    if (worldClockImpl.d(hMBaseDevice, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "deviceType:" + this.a.getDeviceType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "deviceType:" + this.a.getDeviceType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/controller/WorldClockController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<WorldClockController> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockController getA() {
            return new WorldClockController();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWorldClockController a() {
        return (IWorldClockController) this.worldClockController.getValue();
    }

    private final void b(HMBaseDevice device) {
        WorldClockModule worldClockModule = device instanceof HMMiLiProDevice ? (WorldClockModule) device.getChannelModule(WorldClockModule.class) : null;
        this.worldClockListeners.put(Integer.valueOf(device.hashCode()), new DataChangeCallback() { // from class: com.xiaomi.hm.health.device.setting.life.impl.WorldClockImpl$registerWorldClockCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "world clock onNotify data";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.WorldClockImpl$registerWorldClockCallback$1$onNotify$2", f = "WorldClockImpl.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ WorldClockImpl b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WorldClockImpl worldClockImpl, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = worldClockImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        IWorldClockController iWorldClockControllerA = this.b.a();
                        Application context = DeviceXFunctionsKt.getContext();
                        this.a = 1;
                        if (iWorldClockControllerA.queryWorldTime(context, null, this) == coroutine_suspended) {
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

            @Override // com.huami.bluetooth.profile.channel.module.DataChangeCallback
            public void onNotify() {
                HMLog.info("WorldClockImpl", a.a);
                e.f(WorldClockConfig.INSTANCE.getWorldClockScope(), null, null, new b(this.a, null), 3, null);
            }
        });
        DataChangeCallback dataChangeCallback = this.worldClockListeners.get(Integer.valueOf(device.hashCode()));
        if (dataChangeCallback == null || worldClockModule == null) {
            return;
        }
        worldClockModule.registerDataCallback(dataChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(HMBaseDevice hMBaseDevice, Continuation<? super Unit> continuation) {
        if (hMBaseDevice.getDeviceType() != HMDeviceType.MILI) {
            HMLog.info(d, new d(hMBaseDevice));
            return Unit.INSTANCE;
        }
        Object defaultWorldClock = a().setDefaultWorldClock(DeviceXFunctionsKt.getContext(), continuation);
        return defaultWorldClock == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? defaultWorldClock : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(HMBaseDevice hMBaseDevice, Continuation<? super Unit> continuation) {
        if (hMBaseDevice.getDeviceType() != HMDeviceType.MILI) {
            HMLog.info(d, new e(hMBaseDevice));
            return Unit.INSTANCE;
        }
        Object localeWorldClock = a().setLocaleWorldClock(DeviceXFunctionsKt.getContext(), continuation);
        return localeWorldClock == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? localeWorldClock : Unit.INSTANCE;
    }

    private final void e(HMBaseDevice device) {
        WorldClockModule worldClockModule = device instanceof HMMiLiProDevice ? (WorldClockModule) device.getChannelModule(WorldClockModule.class) : null;
        DataChangeCallback dataChangeCallback = this.worldClockListeners.get(Integer.valueOf(device.hashCode()));
        if (dataChangeCallback == null || worldClockModule == null) {
            return;
        }
        worldClockModule.unRegisterDataCallback(dataChangeCallback);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        e(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        b(device);
        kotlinx.coroutines.e.f(WorldClockConfig.INSTANCE.getWorldClockScope(), null, null, new a(device, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        b(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        b(device);
        kotlinx.coroutines.e.f(WorldClockConfig.INSTANCE.getWorldClockScope(), null, null, new b(device, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        if (status != 1) {
            if (status != 2) {
                return;
            }
            this.hasWorldTimeSwInDis = Boolean.valueOf(HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(1));
            return;
        }
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        Integer device_type = device == null ? null : device.getDevice_type();
        HMBaseDevice device2 = hMDeviceManager.getDevice(HMDeviceType.fromValue(device_type == null ? HMDeviceType.MILI.getValue() : device_type.intValue()));
        boolean zHasSw = false;
        if (device2 != null && (deviceInfo = device2.getDeviceInfo()) != null && (deviceFeature = deviceInfo.getDeviceFeature()) != null) {
            zHasSw = deviceFeature.hasSw(1);
        }
        if (device2 == null) {
            return;
        }
        kotlinx.coroutines.e.f(WorldClockConfig.INSTANCE.getWorldClockScope(), null, null, new c(zHasSw, device2, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        e(device);
    }
}
