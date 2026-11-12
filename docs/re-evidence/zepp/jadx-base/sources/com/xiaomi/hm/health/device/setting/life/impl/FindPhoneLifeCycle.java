package com.xiaomi.hm.health.device.setting.life.impl;

import android.app.Application;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceApi;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceApiFactory;
import com.huami.bluetooth.profile.channel.module.find.FindPhoneListener;
import com.huami.bluetooth.profile.channel.module.find.IFindPhoneCallback;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u001a\u0010\"\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R4\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050%0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00109\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b7\u00108R\u001d\u0010<\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b3\u0010;R\u0016\u0010@\u001a\u00020=8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/FindPhoneLifeCycle;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/find/IFindPhoneCallback;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceApi;", "b", "", "f", "", "fromDevice", "g", "enable", "a", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "onEnablePhoneRing", "onFind", "onStop", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentHashMap;", "getDevices", "()Ljava/util/concurrent/ConcurrentHashMap;", "setDevices", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "devices", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "findPhoneApi", "", "Lcom/huami/bluetooth/profile/channel/module/find/FindPhoneListener;", "c", "Ljava/util/Map;", "findPhoneListener", "Lkotlinx/coroutines/CompletableJob;", "e", "()Lkotlinx/coroutines/CompletableJob;", "job", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindPhoneLifeCycle implements DeviceLifeCycle, CoroutineScope, IFindPhoneCallback, KoinComponent {

    @NotNull
    private static final String f = "FindPhoneLifeCycle";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ConcurrentHashMap<String, WeakReference<HMBaseDevice>> devices = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy findPhoneApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, FindPhoneListener> findPhoneListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

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
            return "Device is null while stop fin phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$enablePhoneRing$2", f = "FindPhoneLifeCycle.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice, boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneLifeCycle.this.new b(this.c, this.d, continuation);
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
                FindPhoneApi findPhoneApiD = FindPhoneLifeCycle.this.d();
                Application context = DeviceXFunctionsKt.getContext();
                HMBaseDevice hMBaseDevice = this.c;
                boolean z = this.d;
                boolean z2 = DeviceXFunctionsKt.getPropertyStoreApi().getRingType() != 0;
                this.a = 1;
                if (findPhoneApiD.enableRing(context, hMBaseDevice, z, z2, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Device not support find phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CompletableJob> {
        public static final d a = new d();

        public d() {
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
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$onBoundedDeviceDisconnect$1", f = "FindPhoneLifeCycle.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneLifeCycle.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneApi findPhoneApiD = FindPhoneLifeCycle.this.d();
                Application context = DeviceXFunctionsKt.getContext();
                this.a = 1;
                if (findPhoneApiD.onDeviceDisconnect(context, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ HMBaseDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = z;
            this.b = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            boolean z = this.a;
            DeviceInfo deviceInfo = this.b.getDeviceInfo();
            return "onEnablePhoneRing " + z + ", device: " + (deviceInfo == null ? null : deviceInfo.getDeviceID());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            DeviceInfo deviceInfo = this.a.getDeviceInfo();
            return "Start find phone from device:" + (deviceInfo == null ? null : deviceInfo.getDeviceID());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            DeviceInfo deviceInfo = this.a.getDeviceInfo();
            return "Stop find phone from device:" + (deviceInfo == null ? null : deviceInfo.getDeviceID());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Device address is null:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Device is null while start fin phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$startFind$2", f = "FindPhoneLifeCycle.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HMBaseDevice hMBaseDevice, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneLifeCycle.this.new k(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneApi findPhoneApiD = FindPhoneLifeCycle.this.d();
                Application context = DeviceXFunctionsKt.getContext();
                boolean z = DeviceXFunctionsKt.getPropertyStoreApi().getRingType() != 0;
                HMBaseDevice hMBaseDevice = this.c;
                this.a = 1;
                if (findPhoneApiD.startFindPhone(context, z, hMBaseDevice, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Device is null while stop fin phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$stopFind$2", f = "FindPhoneLifeCycle.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ HMBaseDevice d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z, HMBaseDevice hMBaseDevice, Continuation<? super m> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneLifeCycle.this.new m(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneApi findPhoneApiD = FindPhoneLifeCycle.this.d();
                Application context = DeviceXFunctionsKt.getContext();
                boolean z = this.c;
                HMBaseDevice hMBaseDevice = this.d;
                this.a = 1;
                if (findPhoneApiD.stopFindPhone(context, z, hMBaseDevice, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Device address is null:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HMBaseDevice hMBaseDevice) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$unregister$3", f = "FindPhoneLifeCycle.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneLifeCycle.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneApi findPhoneApiD = FindPhoneLifeCycle.this.d();
                Application context = DeviceXFunctionsKt.getContext();
                this.a = 1;
                if (findPhoneApiD.onDeviceDisconnect(context, this) == coroutine_suspended) {
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
    public FindPhoneLifeCycle() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.findPhoneApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FindPhoneApi>() { // from class: com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FindPhoneApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FindPhoneApi.class), qualifier, objArr);
            }
        });
        this.findPhoneListener = new LinkedHashMap();
        this.job = LazyKt__LazyJVMKt.lazy(d.a);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.device.setting.life.impl.FindPhoneLifeCycle$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceRepositoryApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), objArr2, objArr3);
            }
        });
    }

    private final synchronized void a(boolean enable, HMBaseDevice device) {
        try {
            if (device == null) {
                HMLog.info(f, a.a);
            } else {
                kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new b(device, enable, null), 2, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final FindDeviceApi b(HMBaseDevice device) {
        FindDeviceApi findDeviceApiCreate = FindDeviceApiFactory.INSTANCE.create(device);
        if (findDeviceApiCreate != null) {
            return findDeviceApiCreate;
        }
        HMLog.info(f, c.a);
        return null;
    }

    private final DeviceRepositoryApi c() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FindPhoneApi d() {
        return (FindPhoneApi) this.findPhoneApi.getValue();
    }

    private final CompletableJob e() {
        return (CompletableJob) this.job.getValue();
    }

    private final synchronized void f(HMBaseDevice device) {
        try {
            if (device == null) {
                HMLog.info(f, j.a);
            } else {
                kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new k(device, null), 2, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void g(boolean fromDevice, HMBaseDevice device) {
        try {
            if (device == null) {
                HMLog.info(f, l.a);
            } else {
                kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new m(fromDevice, device, null), 2, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        unregister(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        register(device);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return e();
    }

    @NotNull
    public final ConcurrentHashMap<String, WeakReference<HMBaseDevice>> getDevices() {
        return this.devices;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        register(device);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
        Device deviceFindDeviceById = c().findDeviceById(deviceId);
        if (deviceFindDeviceById == null) {
            return;
        }
        Integer device_type = deviceFindDeviceById.getDevice_type();
        int value = HMDeviceType.MILI.getValue();
        if (device_type != null && device_type.intValue() == value) {
            kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new e(null), 2, null);
        } else {
            Integer device_type2 = deviceFindDeviceById.getDevice_type();
            int value2 = HMDeviceType.WATCH.getValue();
            if (device_type2 != null && device_type2.intValue() == value2) {
                kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new e(null), 2, null);
            }
        }
        EventBus.getDefault().unregister(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        register(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        unregister(device);
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.IFindPhoneCallback
    public void onEnablePhoneRing(@NotNull String address, boolean enable) {
        HMBaseDevice hMBaseDevice;
        WeakReference<HMBaseDevice> weakReference = this.devices.get(address);
        if (weakReference == null || (hMBaseDevice = weakReference.get()) == null) {
            return;
        }
        HMLog.info(f, new f(enable, hMBaseDevice));
        a(enable, hMBaseDevice);
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        LfType lfType = event.getLfType();
        if (lfType == LfType.FIND_PHONE) {
            f(HMDeviceManager.getInstance().getDevice(event.getDeviceType()));
        } else if (lfType == LfType.STOP_FIND_PHONE) {
            g(true, HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI));
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindPhoneListener
    public void onFind(@NotNull String address) {
        HMBaseDevice hMBaseDevice;
        WeakReference<HMBaseDevice> weakReference = this.devices.get(address);
        if (weakReference == null || (hMBaseDevice = weakReference.get()) == null) {
            return;
        }
        HMLog.info(f, new g(hMBaseDevice));
        f(hMBaseDevice);
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindPhoneListener
    public void onStop(@NotNull String address) {
        HMBaseDevice hMBaseDevice;
        WeakReference<HMBaseDevice> weakReference = this.devices.get(address);
        if (weakReference == null || (hMBaseDevice = weakReference.get()) == null) {
            return;
        }
        HMLog.info(f, new h(hMBaseDevice));
        g(true, hMBaseDevice);
    }

    public final void register(@NotNull HMBaseDevice device) {
        String address = device.getAddress();
        if (address == null) {
            HMLog.error$default(f, null, null, new i(device), 6, null);
            return;
        }
        this.devices.put(address, new WeakReference<>(device));
        this.findPhoneListener.put(Integer.valueOf(device.hashCode()), this);
        FindDeviceApi findDeviceApiB = b(device);
        if (findDeviceApiB != null) {
            findDeviceApiB.registerListener(this);
        }
        EventBus.getDefault().register(this);
    }

    public final void setDevices(@NotNull ConcurrentHashMap<String, WeakReference<HMBaseDevice>> concurrentHashMap) {
        this.devices = concurrentHashMap;
    }

    public final void unregister(@NotNull HMBaseDevice device) {
        String address = device.getAddress();
        if (address == null) {
            HMLog.error$default(f, null, null, new n(device), 6, null);
            return;
        }
        this.devices.remove(address);
        HMLog.info(f, new o(device));
        FindPhoneListener findPhoneListenerRemove = this.findPhoneListener.remove(Integer.valueOf(device.hashCode()));
        if (findPhoneListenerRemove == null) {
            return;
        }
        FindDeviceApi findDeviceApiB = b(device);
        if (findDeviceApiB != null) {
            findDeviceApiB.unregisterListener(findPhoneListenerRemove);
        }
        if (device.getDeviceType() == HMDeviceType.MILI || device.getDeviceType() == HMDeviceType.WATCH) {
            kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new p(null), 2, null);
        }
        EventBus.getDefault().unregister(this);
    }
}
