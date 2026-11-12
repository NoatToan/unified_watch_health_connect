package com.xiaomi.hm.health.device.headset.help;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002#'\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u0007\u0010)R\u001d\u0010.\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b\u000f\u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/help/NetWorkBluetoothLifeComponent;", "Landroidx/lifecycle/LifecycleObserver;", "Lorg/koin/core/component/KoinComponent;", "", "onCreate", "onDestroy", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "setActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "activity", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "setSource", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "source", "", "c", LogUtil.I, "getBindType", "()I", "setBindType", "(I)V", PhoneBindActivity.EXTRA_BIND_TYPE, "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "com/xiaomi/hm/health/device/headset/help/NetWorkBluetoothLifeComponent$broadcastReceiver$1", "e", "Lcom/xiaomi/hm/health/device/headset/help/NetWorkBluetoothLifeComponent$broadcastReceiver$1;", "broadcastReceiver", "com/xiaomi/hm/health/device/headset/help/NetWorkBluetoothLifeComponent$callback$2$1", "f", "()Lcom/xiaomi/hm/health/device/headset/help/NetWorkBluetoothLifeComponent$callback$2$1;", "callback", "Landroid/net/ConnectivityManager;", "g", "()Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"NewApi"})
public final class NetWorkBluetoothLifeComponent implements LifecycleObserver, KoinComponent {

    @NotNull
    private static final String h = "NetWorkBluetoothLifeComponent";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int bindType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final NetWorkBluetoothLifeComponent$broadcastReceiver$1 broadcastReceiver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy callback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy connectivityManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/net/ConnectivityManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ConnectivityManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectivityManager invoke() {
            Object systemService = DeviceXFunctionsKt.getContext().getSystemService("connectivity");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            return (ConnectivityManager) systemService;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$broadcastReceiver$1] */
    public NetWorkBluetoothLifeComponent(@NotNull AppCompatActivity appCompatActivity, @NotNull HMDeviceSource hMDeviceSource, int i) {
        this.activity = appCompatActivity;
        this.source = hMDeviceSource;
        this.bindType = i;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$broadcastReceiver$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "ACTION_STATE_CHANGED - state: " + this.a;
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                String action = intent == null ? null : intent.getAction();
                if (action != null && Intrinsics.areEqual(action, "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    HMLog.debug("NetWorkBluetoothLifeComponent", new a(intExtra));
                    if (intExtra != 10) {
                        return;
                    }
                    this.a.c().testPhoneEnv(this.a.getBindType(), this.a.getSource());
                    this.a.getActivity().finish();
                }
            }
        };
        this.callback = LazyKt__LazyJVMKt.lazy(new Function0<NetWorkBluetoothLifeComponent$callback$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$callback$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$callback$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final NetWorkBluetoothLifeComponent netWorkBluetoothLifeComponent = this.a;
                return new ConnectivityManager.NetworkCallback() { // from class: com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$callback$2.1

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent$callback$2$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "onLost";
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(@NotNull Network network) {
                        super.onLost(network);
                        HMLog.debug("NetWorkBluetoothLifeComponent", a.a);
                        netWorkBluetoothLifeComponent.c().testPhoneEnv(netWorkBluetoothLifeComponent.getBindType(), netWorkBluetoothLifeComponent.getSource());
                        netWorkBluetoothLifeComponent.getActivity().finish();
                    }
                };
            }
        });
        this.connectivityManager = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final NetWorkBluetoothLifeComponent$callback$2.AnonymousClass1 a() {
        return (NetWorkBluetoothLifeComponent$callback$2.AnonymousClass1) this.callback.getValue();
    }

    private final ConnectivityManager b() {
        return (ConnectivityManager) this.connectivityManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi c() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return this.activity;
    }

    public final int getBindType() {
        return this.bindType;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        b().requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), a());
        DeviceXFunctionsKt.getContext().registerReceiver(this.broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        b().unregisterNetworkCallback(a());
        DeviceXFunctionsKt.getContext().unregisterReceiver(this.broadcastReceiver);
    }

    public final void setActivity(@NotNull AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }

    public final void setBindType(int i) {
        this.bindType = i;
    }

    public final void setSource(@NotNull HMDeviceSource hMDeviceSource) {
        this.source = hMDeviceSource;
    }
}
