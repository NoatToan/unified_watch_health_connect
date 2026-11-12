package com.xiaomi.hm.health.device.setting.life.feature;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerApi;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerApiFactory;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerCallback;
import com.huami.bluetooth.profile.channel.module.amc.MusicControllerModule;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.setting.life.feature.inject.MediaUtilApi;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u0016\u001a\u00020\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\u0018\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0019\u0010/\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u00103\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b!\u00102R\u0016\u00107\u001a\u0002048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/MusicControllerSetter;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lorg/koin/core/component/KoinComponent;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "command", "", "e", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerApi;", "a", "f", "", "getName", "initDefault", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/MediaUtilApi;", "Lkotlin/Lazy;", "getMediaUtilApi", "()Lcom/xiaomi/hm/health/device/setting/life/feature/inject/MediaUtilApi;", "mediaUtilApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "c", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Landroid/content/Context;", GoogleApiAvailabilityLight.a, "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Z", "inited", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "commandCached", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCallback;", "g", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCallback;", "getListener", "()Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CompletableJob;", "h", "()Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MusicControllerSetter implements BleEventSubscriber, KoinComponent, CoroutineScope {

    @NotNull
    private static final String i = "MusicControllerSetter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaUtilApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean inited;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentLinkedQueue<HMMusicControl.DeviceCommand> commandCached;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MusicControllerCallback listener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

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
            return "Device not support music";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$handleCommand$1", f = "MusicControllerSetter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMMusicControl.DeviceCommand c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return String.valueOf(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMMusicControl.DeviceCommand deviceCommand, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = deviceCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicControllerSetter.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicControllerSetter musicControllerSetter = MusicControllerSetter.this;
            HMMusicControl.DeviceCommand deviceCommand = this.c;
            try {
                Result.Companion companion = Result.Companion;
                musicControllerSetter.getMediaUtilApi().handleDeviceCommand(deviceCommand);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(MusicControllerSetter.i, new a(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$register$1", f = "MusicControllerSetter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicControllerSetter.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMMusicControl.DeviceCommand deviceCommand;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicControllerApi musicControllerApiA = MusicControllerSetter.this.a(this.c);
            if (musicControllerApiA != null) {
                musicControllerApiA.registerControllerListener(MusicControllerSetter.this.getListener());
            }
            MusicControllerSetter.this.c().initMedia(MusicControllerSetter.this.b());
            MusicControllerSetter.this.f();
            MusicControllerSetter.this.inited = true;
            while (!MusicControllerSetter.this.commandCached.isEmpty() && (deviceCommand = (HMMusicControl.DeviceCommand) MusicControllerSetter.this.commandCached.poll()) != null) {
                MusicControllerSetter.this.e(deviceCommand);
            }
            return Unit.INSTANCE;
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
            DeviceInfo deviceInfo = this.a.getDeviceInfo();
            return "Unregister find listener of " + (deviceInfo == null ? null : deviceInfo.getDeviceID());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicControllerSetter() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mediaUtilApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MediaUtilApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.life.feature.inject.MediaUtilApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MediaUtilApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MediaUtilApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.context = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<Context>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Context getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), objArr6, objArr7);
            }
        });
        this.commandCached = new ConcurrentLinkedQueue<>();
        this.listener = new MusicControllerCallback() { // from class: com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$listener$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ HMMusicControl.DeviceCommand a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HMMusicControl.DeviceCommand deviceCommand) {
                    super(0);
                    this.a = deviceCommand;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "Receive music controller:" + this.a;
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.amc.MusicControllerCallback
            public void onController(@NotNull HMMusicControl.DeviceCommand cmd) {
                HMLog.info("MusicControllerSetter", new a(cmd));
                if (this.a.inited) {
                    this.a.e(cmd);
                } else {
                    this.a.commandCached.offer(cmd);
                }
            }
        };
        this.job = LazyKt__LazyJVMKt.lazy(c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicControllerApi a(HMBaseDevice device) {
        MusicControllerApi musicControllerApiCreateMusicControllerApi = MusicControllerApiFactory.INSTANCE.createMusicControllerApi(device);
        if (musicControllerApiCreateMusicControllerApi != null) {
            return musicControllerApiCreateMusicControllerApi;
        }
        HMLog.info(i, a.a);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context b() {
        return (Context) this.context.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi c() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final CompletableJob d() {
        return (CompletableJob) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(HMMusicControl.DeviceCommand command) {
        kotlinx.coroutines.e.f(this, Dispatchers.getMain(), null, new b(command, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        HMMiLiProDevice hMMiLiProDevice;
        if (c().shouldInitMusic() && (hMMiLiProDevice = (HMMiLiProDevice) getDeviceManagerApi().getDevice(HMDeviceType.MILI)) != null && hMMiLiProDevice.isConnected()) {
            HMMusicControl hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
            hMMusicControl.setException(HMMusicControl.AppException.APP_READY);
            hMMiLiProDevice.sendMusicControl(hMMusicControl, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter$initMusicControl$1

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
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Init music controller result:" + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info("MusicControllerSetter", new a(result));
                }
            });
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO().plus(d());
    }

    @NotNull
    public final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MusicControllerCallback getListener() {
        return this.listener;
    }

    @NotNull
    public final MediaUtilApi getMediaUtilApi() {
        return (MediaUtilApi) this.mediaUtilApi.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    /* JADX INFO: renamed from: getName */
    public String getTag() {
        return i;
    }

    public final void initDefault() {
        MusicControllerModule musicControllerModule;
        MusicControllerApi musicControllerApiLoadApi;
        HMBaseDevice device = getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (device == null || (musicControllerModule = (MusicControllerModule) device.getChannelModule(MusicControllerModule.class)) == null || (musicControllerApiLoadApi = musicControllerModule.loadApi()) == null) {
            return;
        }
        musicControllerApiLoadApi.registerControllerListener(this.listener);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        kotlinx.coroutines.e.f(this, null, null, new d(device, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        HMLog.info$default(null, new e(device), 1, null);
        MusicControllerApi musicControllerApiA = a(device);
        if (musicControllerApiA == null) {
            return;
        }
        musicControllerApiA.unregisterControllerListener(this.listener);
    }
}
