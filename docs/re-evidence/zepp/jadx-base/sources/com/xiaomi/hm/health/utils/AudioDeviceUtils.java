package com.xiaomi.hm.health.utils;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApi;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteApiFactory;
import com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteListener;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/utils/AudioDeviceUtils;", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteApi;", "b", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerPhoneMuteListener", "unregisterPhoneMuteListener", "phoneMutePermissionMiss", "", "isMute", "phoneMute", "Lkotlinx/coroutines/CompletableJob;", "a", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AudioDeviceUtils implements CoroutineScope, KoinComponent {

    @NotNull
    private static final String d = "AudioDeviceUtils";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AudioDeviceUtils e = new AudioDeviceUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/utils/AudioDeviceUtils$Companion;", "", "Lcom/xiaomi/hm/health/utils/AudioDeviceUtils;", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/utils/AudioDeviceUtils;", "getInstance", "()Lcom/xiaomi/hm/health/utils/AudioDeviceUtils;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AudioDeviceUtils getInstance() {
            return AudioDeviceUtils.e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.AudioDeviceUtils$registerPhoneMuteListener$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PhoneMuteListener c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PhoneMuteListener phoneMuteListener, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = phoneMuteListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioDeviceUtils.this.new a(this.c, continuation);
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
            PhoneMuteApi phoneMuteApiB = AudioDeviceUtils.this.b();
            if (phoneMuteApiB == null) {
                HMLog.i(AudioDeviceUtils.d, "registerPhoneMuteListener:api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            phoneMuteApiB.registerPhoneMuteListener(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.AudioDeviceUtils$unregisterPhoneMuteListener$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PhoneMuteListener c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PhoneMuteListener phoneMuteListener, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = phoneMuteListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioDeviceUtils.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PhoneMuteApi phoneMuteApiB = AudioDeviceUtils.this.b();
            if (phoneMuteApiB == null) {
                HMLog.i(AudioDeviceUtils.d, "unregisterPhoneMuteListener:api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            phoneMuteApiB.unregisterPhoneMuteListener(this.c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.utils.AudioDeviceUtils$phoneMute$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.AudioDeviceUtils$phoneMute$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioDeviceUtils.this.new AnonymousClass1(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PhoneMuteApi phoneMuteApiB = AudioDeviceUtils.this.b();
            if (phoneMuteApiB == null) {
                HMLog.i(AudioDeviceUtils.d, "setRingMode api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            phoneMuteApiB.phoneMute(this.c, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.utils.AudioDeviceUtils.phoneMute.1.1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.i(AudioDeviceUtils.d, "setRingMode:" + result, new Object[0]);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.utils.AudioDeviceUtils$phoneMutePermissionMiss$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.AudioDeviceUtils$phoneMutePermissionMiss$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public C16471(Continuation<? super C16471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioDeviceUtils.this.new C16471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PhoneMuteApi phoneMuteApiB = AudioDeviceUtils.this.b();
            if (phoneMuteApiB == null) {
                HMLog.i(AudioDeviceUtils.d, "setRingMode api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            phoneMuteApiB.phoneMutePermissionMiss(new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.utils.AudioDeviceUtils.phoneMutePermissionMiss.1.1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.i(AudioDeviceUtils.d, "setPermissionMiss:" + result, new Object[0]);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioDeviceUtils() {
        final Qualifier qualifier = null;
        CompletableJob completableJobD = JobKt__JobKt.d(null, 1, null);
        this.job = completableJobD;
        this.coroutineContext = completableJobD.plus(Dispatchers.getIO());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.utils.AudioDeviceUtils$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneMuteApi b() {
        HMBaseDevice miliDevice = a().getMiliDevice();
        if (miliDevice == null) {
            return null;
        }
        return PhoneMuteApiFactory.INSTANCE.create(miliDevice);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void phoneMute(boolean isMute) {
        e.f(this, Dispatchers.getIO(), null, new AnonymousClass1(isMute, null), 2, null);
    }

    public final void phoneMutePermissionMiss() {
        e.f(this, Dispatchers.getIO(), null, new C16471(null), 2, null);
    }

    public final void registerPhoneMuteListener(@NotNull PhoneMuteListener listener) {
        e.f(this, Dispatchers.getIO(), null, new a(listener, null), 2, null);
    }

    public final void unregisterPhoneMuteListener(@NotNull PhoneMuteListener listener) {
        e.f(this, Dispatchers.getIO(), null, new b(listener, null), 2, null);
    }
}
