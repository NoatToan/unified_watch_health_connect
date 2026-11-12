package com.huami.watch.wifi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.MacAddress;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import io.github.anotherjack.avoidonresult.AvoidOnResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.d;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(29)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\f\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0019\u0010\u0010\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/watch/wifi/WifiControllerAboveQ;", "Lcom/huami/watch/wifi/IWifiController;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "", "ssid", "password", "", "c", "Landroid/net/wifi/ScanResult;", "a", "Lcom/huami/watch/wifi/WifiControllerAboveQ$WrappedNetworkCallback;", "connectTo", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "enable", "enableWifi", "Landroid/net/wifi/WifiManager;", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectiveManager", "Lcom/huami/watch/wifi/WifiControllerAboveQ$WrappedNetworkCallback;", "getNetworkCallback", "()Lcom/huami/watch/wifi/WifiControllerAboveQ$WrappedNetworkCallback;", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "g", "WrappedNetworkCallback", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiControllerAboveQ implements IWifiController {
    private static final String e = "WifiControllerAboveQ";
    private static final int f = 30000;

    @NotNull
    private static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SuppressLint({"WifiManagerPotentialLeak"})
    private final WifiManager wifiManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConnectivityManager connectiveManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WrappedNetworkCallback networkCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/watch/wifi/WifiControllerAboveQ$WrappedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "onUnavailable", "", "blocked", "onBlockedStatusChanged", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "Landroid/net/LinkProperties;", "linkProperties", "onLinkPropertiesChanged", "", "maxMsToLive", "onLosing", "onLost", "Lcom/huami/watch/wifi/IWifiConnectListener;", "a", "Lcom/huami/watch/wifi/IWifiConnectListener;", "getCallback", "()Lcom/huami/watch/wifi/IWifiConnectListener;", "setCallback", "(Lcom/huami/watch/wifi/IWifiConnectListener;)V", "callback", "", "b", "Ljava/lang/String;", "getTargetSsid", "()Ljava/lang/String;", "setTargetSsid", "(Ljava/lang/String;)V", "targetSsid", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class WrappedNetworkCallback extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private IWifiConnectListener callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String targetSsid;

        @Nullable
        public final IWifiConnectListener getCallback() {
            return this.callback;
        }

        @Nullable
        public final String getTargetSsid() {
            return this.targetSsid;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            super.onAvailable(network);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onAvailable: " + network);
            IWifiConnectListener iWifiConnectListener = this.callback;
            if (iWifiConnectListener != null) {
                iWifiConnectListener.onConnectedTo(this.targetSsid, network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(@NotNull Network network, boolean blocked) {
            super.onBlockedStatusChanged(network, blocked);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onBlockedStatusChanged; network: " + network + "; blocked: " + blocked);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onCapabilitiesChanged; network: " + network + "; networkCapabilities: " + networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(@NotNull Network network, @NotNull LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onLinkPropertiesChanged; network: " + network + "; linkProperties: " + linkProperties);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(@NotNull Network network, int maxMsToLive) {
            super.onLosing(network, maxMsToLive);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onLosing; network: " + network + "; maxMsToLive: " + maxMsToLive);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            super.onLost(network);
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onLost; network: " + network);
            IWifiConnectListener iWifiConnectListener = this.callback;
            if (iWifiConnectListener != null) {
                iWifiConnectListener.onDisconnected(this.targetSsid, network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            LogUtils logUtils = LogUtils.INSTANCE;
            a unused = WifiControllerAboveQ.g;
            logUtils.log(WifiControllerAboveQ.e, "onUnavailable");
            IWifiConnectListener iWifiConnectListener = this.callback;
            if (iWifiConnectListener != null) {
                iWifiConnectListener.onDisconnected(this.targetSsid, null);
            }
        }

        public final void setCallback(@Nullable IWifiConnectListener iWifiConnectListener) {
            this.callback = iWifiConnectListener;
        }

        public final void setTargetSsid(@Nullable String str) {
            this.targetSsid = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/watch/wifi/WifiControllerAboveQ$a", "", "", "CONNECTION_TIMEOUT", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiControllerAboveQ$launchWifiPanel$1", f = "WifiControllerAboveQ.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ CompletableDeferred d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "resultCode", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "data", "", "onActivityResult", "(ILandroid/content/Intent;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements AvoidOnResult.Callback {
            public a() {
            }

            @Override // io.github.anotherjack.avoidonresult.AvoidOnResult.Callback
            public final void onActivityResult(int i, Intent intent) {
                b.this.d.complete(Boolean.TRUE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Intent intent, CompletableDeferred completableDeferred, Continuation continuation) {
            super(2, continuation);
            this.b = context;
            this.c = intent;
            this.d = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
            new AvoidOnResult((Activity) this.b).startForResult(this.c, new a());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiControllerAboveQ$launchWifiPanel$2", f = "WifiControllerAboveQ.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CompletableDeferred completableDeferred, Continuation continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public WifiControllerAboveQ(@NotNull Context context) {
        this.context = context;
        Object systemService = context.getSystemService("wifi");
        this.wifiManager = (WifiManager) (systemService instanceof WifiManager ? systemService : null);
        Object systemService2 = context.getSystemService("connectivity");
        this.connectiveManager = (ConnectivityManager) (systemService2 instanceof ConnectivityManager ? systemService2 : null);
        this.networkCallback = new WrappedNetworkCallback();
    }

    private final ScanResult a(String ssid) {
        List<ScanResult> scanResults;
        WifiManager wifiManager = this.wifiManager;
        Object obj = null;
        if (wifiManager == null || (scanResults = wifiManager.getScanResults()) == null) {
            return null;
        }
        for (Object obj2 : scanResults) {
            if (Intrinsics.areEqual(((ScanResult) obj2).SSID, ssid)) {
                obj = obj2;
                break;
            }
        }
        return (ScanResult) obj;
    }

    private final boolean b(Context context) {
        Intent intent = new Intent("android.settings.panel.action.WIFI");
        if (!(context instanceof Activity)) {
            context.startActivity(intent);
            return true;
        }
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new b(context, intent, completableDeferredCompletableDeferred$default, null), 2, null);
        return ((Boolean) d.b(null, new c(completableDeferredCompletableDeferred$default, null), 1, null)).booleanValue();
    }

    private final void c(String ssid, String password) {
        WifiNetworkSuggestion wifiNetworkSuggestionBuild = new WifiNetworkSuggestion.Builder().setSsid(ssid).setWpa2Passphrase(password).build();
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager != null) {
            wifiManager.removeNetworkSuggestions(kotlin.collections.e.listOf(wifiNetworkSuggestionBuild));
        }
    }

    @Override // com.huami.watch.wifi.IWifiController
    public boolean disconnect(@NotNull ConnectivityManager.NetworkCallback networkCallback) {
        try {
            ConnectivityManager connectivityManager = this.connectiveManager;
            if (connectivityManager == null) {
                return true;
            }
            connectivityManager.unregisterNetworkCallback(networkCallback);
            return true;
        } catch (Exception unused) {
            LogUtils.INSTANCE.log(e, "disconnect failed");
            return true;
        }
    }

    @Override // com.huami.watch.wifi.IWifiController
    public boolean enableWifi(@NotNull Context context, boolean enable) {
        return b(context);
    }

    @NotNull
    public final WrappedNetworkCallback getNetworkCallback() {
        return this.networkCallback;
    }

    @Override // com.huami.watch.wifi.IWifiController
    @NotNull
    public WrappedNetworkCallback connectTo(@NotNull String ssid, @NotNull String password) {
        ScanResult scanResultA = a(ssid);
        c(ssid, password);
        LogUtils logUtils = LogUtils.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("scanresult: bssid: ");
        sb.append(scanResultA != null ? scanResultA.BSSID : null);
        sb.append('-');
        sb.append(scanResultA);
        logUtils.log(e, sb.toString());
        WifiNetworkSpecifier.Builder wpa2Passphrase = new WifiNetworkSpecifier.Builder().setSsid(ssid).setWpa2Passphrase(password);
        if ((scanResultA != null ? scanResultA.BSSID : null) != null && Build.VERSION.SDK_INT >= 28) {
            wpa2Passphrase.setBssid(MacAddress.fromString(scanResultA.BSSID));
        }
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(wpa2Passphrase.build()).build();
        disconnect(this.networkCallback);
        this.networkCallback.setTargetSsid(ssid);
        ConnectivityManager connectivityManager = this.connectiveManager;
        if (connectivityManager != null) {
            connectivityManager.requestNetwork(networkRequestBuild, this.networkCallback, 30000);
        }
        return this.networkCallback;
    }
}
