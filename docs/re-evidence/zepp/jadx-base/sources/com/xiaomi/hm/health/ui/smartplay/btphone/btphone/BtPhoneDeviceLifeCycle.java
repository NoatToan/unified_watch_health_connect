package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.other.AppUtilApi;
import com.huami.devicex.single.DevicePreLaunchRepository;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneDeviceLifeCycle;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "", "c", "", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSyncing", "Lcom/huami/devicex/injection/other/AppUtilApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/other/AppUtilApi;", "utilsApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneDeviceLifeCycle implements DeviceLifeCycle, KoinComponent {

    @NotNull
    private static final String c = "BtPhoneDeviceLifeCycle";

    @NotNull
    private static final String d = "bt_phone_enable";

    @NotNull
    private static final String[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean isSyncing = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy utilsApi;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<KeeperProxyApi> e = KoinJavaComponent.inject$default(KeeperProxyApi.class, null, null, 6, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneDeviceLifeCycle$Companion;", "", "", "isBtPhoneEnable", "enable", "", "cacheBtPhoneEnable", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi$delegate", "Lkotlin/Lazy;", "a", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "", "BT_PHONE_ENABLE", "Ljava/lang/String;", "TAG", "", "permissions", "[Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "keeperProxyApi", "getKeeperProxyApi()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;"))};

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
                return "set bt phone enable: " + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final KeeperProxyApi a() {
            return (KeeperProxyApi) BtPhoneDeviceLifeCycle.e.getValue();
        }

        @JvmStatic
        public final void cacheBtPhoneEnable(boolean enable) {
            HMLog.info(BtPhoneDeviceLifeCycle.c, new a(enable));
            a().getBoolean(BtPhoneDeviceLifeCycle.d, enable);
        }

        @JvmStatic
        public final boolean isBtPhoneEnable() {
            return a().getBoolean(BtPhoneDeviceLifeCycle.d, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get exception: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle$refreshBtPhoneCacheStatus$1", f = "BtPhoneDeviceLifeCycle.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, String str, String str2) {
                super(0);
                this.a = z;
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "refreshBtPhoneCacheStatus btphoneEnable: " + this.a + "; current phone name is: " + this.b + "; permission info: " + this.c;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneDeviceLifeCycle.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (BtPhoneDeviceLifeCycle.this.d()) {
                    BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
                    this.a = 1;
                    obj = btPhoneDevice.isBtPhoneEnabled(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    zBooleanValue = false;
                }
                HMLog.info(BtPhoneDeviceLifeCycle.c, new a(zBooleanValue, BluetoothAdapter.getDefaultAdapter().getName(), BtPhoneDeviceLifeCycle.this.a()));
                DevicePreLaunchRepository.INSTANCE.getDeviceXKVStore().putBoolean(BtPhoneDeviceLifeCycle.d, zBooleanValue);
                BtPhoneDeviceLifeCycle.this.isSyncing.set(false);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            HMLog.info(BtPhoneDeviceLifeCycle.c, new a(zBooleanValue, BluetoothAdapter.getDefaultAdapter().getName(), BtPhoneDeviceLifeCycle.this.a()));
            DevicePreLaunchRepository.INSTANCE.getDeviceXKVStore().putBoolean(BtPhoneDeviceLifeCycle.d, zBooleanValue);
            BtPhoneDeviceLifeCycle.this.isSyncing.set(false);
            return Unit.INSTANCE;
        }
    }

    static {
        f = Build.VERSION.SDK_INT >= 26 ? new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"} : new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BtPhoneDeviceLifeCycle() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.utilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AppUtilApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.other.AppUtilApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AppUtilApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AppUtilApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (String str : f) {
                if (!b().checkPermission(DeviceXFunctionsKt.getContext(), str)) {
                    sb.append(str);
                    sb.append(" not allowed; ");
                }
            }
        } catch (Exception e2) {
            HMLog.info(c, new a(e2));
        }
        return sb.toString();
    }

    private final AppUtilApi b() {
        return (AppUtilApi) this.utilsApi.getValue();
    }

    private final void c() {
        if (this.isSyncing.compareAndSet(false, true)) {
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(null), 2, null);
        }
    }

    @JvmStatic
    public static final void cacheBtPhoneEnable(boolean z) {
        INSTANCE.cacheBtPhoneEnable(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(20);
    }

    @JvmStatic
    public static final boolean isBtPhoneEnable() {
        return INSTANCE.isBtPhoneEnable();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        c();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        c();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        c();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
    }
}
