package com.xiaomi.hm.health.device.headset;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/MozartDeviceStateService;", "Lorg/koin/core/component/KoinComponent;", "", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "c", GoogleApiAvailabilityLight.a, "", "isA2dpConnected", "Landroid/bluetooth/BluetoothDevice;", "device", "isA2dpPlaying", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "a2dpReceiver", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Z", "receiverRegistered", "Landroid/bluetooth/BluetoothAdapter;", "e", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothA2dp;", "f", "Landroid/bluetooth/BluetoothA2dp;", "bluetoothA2dp", "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"MissingPermission"})
public final class MozartDeviceStateService implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "MozartDeviceStateService";
    private static final int h = 1;
    private static final long i = 500;
    private static MozartDeviceStateService j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BroadcastReceiver a2dpReceiver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean receiverRegistered;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private BluetoothA2dp bluetoothA2dp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/MozartDeviceStateService$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/headset/MozartDeviceStateService;", PointCategory.INIT, "get", "", "MSG_REFRESH_DEVICE_STATE", LogUtil.I, "", "REFRESH_DELAY", "J", "", "TAG", "Ljava/lang/String;", "service", "Lcom/xiaomi/hm/health/device/headset/MozartDeviceStateService;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MozartDeviceStateService get() {
            MozartDeviceStateService mozartDeviceStateService = MozartDeviceStateService.j;
            Objects.requireNonNull(mozartDeviceStateService);
            return mozartDeviceStateService;
        }

        @JvmStatic
        @NotNull
        public final MozartDeviceStateService init(@NotNull Context context) {
            MozartDeviceStateService.j = new MozartDeviceStateService(context, null);
            MozartDeviceStateService mozartDeviceStateService = MozartDeviceStateService.j;
            Objects.requireNonNull(mozartDeviceStateService);
            return mozartDeviceStateService;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No need refresh when app on background!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return null;
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
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MozartDeviceStateService(final Context context) {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.MozartDeviceStateService$special$$inlined$inject$default$1
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
        HandlerThread handlerThread = new HandlerThread(g);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper()) { // from class: com.xiaomi.hm.health.device.headset.MozartDeviceStateService.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                if (msg.what == 1) {
                    MozartDeviceStateService.this.b();
                }
            }
        };
        this.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        this.a2dpReceiver = new BroadcastReceiver() { // from class: com.xiaomi.hm.health.device.headset.MozartDeviceStateService.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.MozartDeviceStateService$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Intent a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Intent intent) {
                    super(0);
                    this.a = intent;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onReceive - " + this.a.getAction() + "!";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.MozartDeviceStateService$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "No need refresh when app on background!";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.MozartDeviceStateService$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c a = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Canceled refresh delay!";
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context2, @NotNull Intent intent) {
                HMLog.info(MozartDeviceStateService.g, new a(intent));
                if (Intrinsics.areEqual("android.bluetooth.adapter.action.STATE_CHANGED", intent.getAction()) || Intrinsics.areEqual("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", intent.getAction()) || Intrinsics.areEqual("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED", intent.getAction())) {
                    if (!DeviceXFunctionsKt.getAppStateApi().isForeground()) {
                        HMLog.info(MozartDeviceStateService.g, b.a);
                    } else if (MozartDeviceStateService.this.handler.hasMessages(1)) {
                        HMLog.info(MozartDeviceStateService.g, c.a);
                    } else {
                        MozartDeviceStateService.this.handler.sendEmptyMessageDelayed(1, 500L);
                    }
                }
            }
        };
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter == null) {
            return;
        }
        bluetoothAdapter.getProfileProxy(context.getApplicationContext(), new BluetoothProfile.ServiceListener() { // from class: com.xiaomi.hm.health.device.headset.MozartDeviceStateService.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.MozartDeviceStateService$3$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "A2DP service connected!";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.MozartDeviceStateService$3$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "A2DP service disconnected!";
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int profile, @Nullable BluetoothProfile proxy) {
                if (profile == 2) {
                    HMLog.info(MozartDeviceStateService.g, a.a);
                    MozartDeviceStateService mozartDeviceStateService = MozartDeviceStateService.this;
                    Objects.requireNonNull(proxy, "null cannot be cast to non-null type android.bluetooth.BluetoothA2dp");
                    mozartDeviceStateService.bluetoothA2dp = (BluetoothA2dp) proxy;
                    MozartDeviceStateService.this.b();
                    MozartDeviceStateService.this.c(context.getApplicationContext());
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int profile) {
                if (profile == 2) {
                    HMLog.info(MozartDeviceStateService.g, b.a);
                    MozartDeviceStateService.this.d(context.getApplicationContext());
                    MozartDeviceStateService.this.bluetoothA2dp = null;
                }
            }
        }, 2);
    }

    public /* synthetic */ MozartDeviceStateService(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (DeviceXFunctionsKt.getAppStateApi().isForeground()) {
            a().refreshMozartDeviceState();
        } else {
            HMLog.info(g, a.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Context context) {
        if (this.receiverRegistered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        try {
            context.registerReceiver(this.a2dpReceiver, intentFilter);
        } catch (IllegalArgumentException e) {
            HMLog.warn(g, e, b.a);
        }
        this.receiverRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Context context) {
        if (this.receiverRegistered) {
            try {
                context.unregisterReceiver(this.a2dpReceiver);
            } catch (IllegalArgumentException e) {
                HMLog.warn(g, e, c.a);
            }
            this.receiverRegistered = false;
        }
    }

    @JvmStatic
    @NotNull
    public static final MozartDeviceStateService get() {
        return INSTANCE.get();
    }

    @JvmStatic
    @NotNull
    public static final MozartDeviceStateService init(@NotNull Context context) {
        return INSTANCE.init(context);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isA2dpConnected() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        return bluetoothAdapter != null && bluetoothAdapter.getProfileConnectionState(2) == 2;
    }

    public final boolean isA2dpPlaying(@NotNull BluetoothDevice device) {
        BluetoothA2dp bluetoothA2dp = this.bluetoothA2dp;
        if (bluetoothA2dp == null) {
            return false;
        }
        return bluetoothA2dp.isA2dpPlaying(device);
    }

    public final boolean isA2dpConnected(@NotNull BluetoothDevice device) {
        BluetoothA2dp bluetoothA2dp = this.bluetoothA2dp;
        return bluetoothA2dp != null && bluetoothA2dp.getConnectionState(device) == 2;
    }
}
