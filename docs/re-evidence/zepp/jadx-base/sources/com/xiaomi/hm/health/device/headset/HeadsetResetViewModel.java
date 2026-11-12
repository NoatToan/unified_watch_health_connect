package com.xiaomi.hm.health.device.headset;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.bluetooth.profile.channel.module.HeadPhoneModule;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import de.greenrobot.event.EventBus;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0019R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetResetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", Configs.Params.RESET, "", "isReady", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getResetResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "resetResultLiveData", "b", "_isReady", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "headPhoneModule", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetResetViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String e = "HeadsetResetViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> resetResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isReady = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy headPhoneModule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/HeadPhoneModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HeadPhoneModule> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeadPhoneModule getA() {
            HMBaseDevice device = HeadsetResetViewModel.this.b().getDevice(HMDeviceType.HEADSET);
            if (device == null) {
                return null;
            }
            return (HeadPhoneModule) device.getChannelModule(HeadPhoneModule.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.HeadsetResetViewModel$reset$1", f = "HeadsetResetViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.HeadsetResetViewModel$reset$1$1", f = "HeadsetResetViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HeadsetResetViewModel b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.HeadsetResetViewModel$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0826a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0826a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "reset result: " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeadsetResetViewModel headsetResetViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = headsetResetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0075  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Boolean boolBoxBoolean;
                boolean zBooleanValue;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HMBaseDevice hMBaseDeviceA = this.b.a();
                    if (!(hMBaseDeviceA != null && hMBaseDeviceA.supportModule(HeadPhoneModule.class))) {
                        MozartDevice mozartDevice = (MozartDevice) this.b.a();
                        if (mozartDevice != null && (boolBoxBoolean = Boxing.boxBoolean(mozartDevice.reset())) != null) {
                            zBooleanValue = boolBoxBoolean.booleanValue();
                        }
                        HMLog.info(HeadsetResetViewModel.e, new C0826a(zBooleanValue));
                        if (zBooleanValue) {
                            DeviceManagerApi deviceManagerApiB = this.b.b();
                            HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
                            deviceManagerApiB.unbindDevice(hMDeviceType);
                            EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType));
                        }
                        this.b.getResetResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
                        return Unit.INSTANCE;
                    }
                    HeadPhoneModule headPhoneModuleC = this.b.c();
                    if (headPhoneModuleC != null) {
                        this.a = 1;
                        obj = headPhoneModuleC.factoryReset(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    HMLog.info(HeadsetResetViewModel.e, new C0826a(zBooleanValue));
                    if (zBooleanValue) {
                        DeviceManagerApi deviceManagerApiB2 = this.b.b();
                        HMDeviceType hMDeviceType2 = HMDeviceType.HEADSET;
                        deviceManagerApiB2.unbindDevice(hMDeviceType2);
                        EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType2));
                    }
                    this.b.getResetResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
                    return Unit.INSTANCE;
                    HMLog.info(HeadsetResetViewModel.e, new C0826a(zBooleanValue));
                    if (zBooleanValue) {
                        DeviceManagerApi deviceManagerApiB3 = this.b.b();
                        HMDeviceType hMDeviceType3 = HMDeviceType.HEADSET;
                        deviceManagerApiB3.unbindDevice(hMDeviceType3);
                        EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType3));
                    }
                    this.b.getResetResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boolean bool = (Boolean) obj;
                zBooleanValue = bool == null ? false : bool.booleanValue();
                HMLog.info(HeadsetResetViewModel.e, new C0826a(zBooleanValue));
                if (zBooleanValue) {
                    DeviceManagerApi deviceManagerApiB4 = this.b.b();
                    HMDeviceType hMDeviceType4 = HMDeviceType.HEADSET;
                    deviceManagerApiB4.unbindDevice(hMDeviceType4);
                    EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType4));
                }
                this.b.getResetResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeadsetResetViewModel.this.new b(continuation);
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
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(HeadsetResetViewModel.this, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetResetViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.HeadsetResetViewModel$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.headPhoneModule = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice a() {
        return b().getDevice(HMDeviceType.HEADSET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeadPhoneModule c() {
        return (HeadPhoneModule) this.headPhoneModule.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Boolean> getResetResultLiveData() {
        return this.resetResultLiveData;
    }

    @NotNull
    public final LiveData<Boolean> isReady() {
        return this._isReady;
    }

    public final void reset() {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    public final void isReady(boolean isReady) {
        this._isReady.setValue(Boolean.valueOf(isReady));
    }
}
