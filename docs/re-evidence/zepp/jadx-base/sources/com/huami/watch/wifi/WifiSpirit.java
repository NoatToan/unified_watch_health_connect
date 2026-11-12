package com.huami.watch.wifi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import androidx.annotation.WorkerThread;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 V2\u00020\u0001:\u0006V\n\u0005)W\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J*\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J+\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0004J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001a\u00107\u001a\u000605R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R\u001a\u0010=\u001a\u00060;R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010<R\u001a\u0010@\u001a\u00060>R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020P8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lcom/huami/watch/wifi/WifiSpirit;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "b", "", "ssid", "", "timeout", "a", "str", "h", "", "Landroid/net/wifi/ScanResult;", "list", "", GoogleApiAvailabilityLight.a, "isWifiEnable", "getNeedPermissions", "Landroid/net/Network;", "getConnectedNetwork", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "enable", "enableWifi", "password", "bind", "connectTo", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "current", "f", "(ZZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Ljava/lang/String;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryToScan", "getScanResult", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "Landroid/net/wifi/WifiManager;", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectiveManager", "Lcom/huami/watch/wifi/IWifiController;", "Lcom/huami/watch/wifi/IWifiController;", "wifiController", "Lcom/huami/watch/wifi/WifiSpirit$d;", "Lcom/huami/watch/wifi/WifiSpirit$d;", "wifiStatusListener", "Lcom/huami/watch/wifi/WifiStatusObserver;", "Lcom/huami/watch/wifi/WifiStatusObserver;", "wifiStatusObserver", "Lcom/huami/watch/wifi/WifiSpirit$b;", "Lcom/huami/watch/wifi/WifiSpirit$b;", "wifiConnectListener", "Lcom/huami/watch/wifi/WifiSpirit$c;", "Lcom/huami/watch/wifi/WifiSpirit$c;", "wifiDisconnectListener", "Lcom/huami/watch/wifi/WifiConnectionObserver;", "i", "Lcom/huami/watch/wifi/WifiConnectionObserver;", "wifiConnectObserver", z.j, "Landroid/net/ConnectivityManager$NetworkCallback;", "savedConnectNetworkCallback", hl.k, "Ljava/lang/String;", "savedTargetSSID", "l", "Landroid/net/Network;", "connectedNet", "m", "Landroid/content/Context;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;)V", "Companion", "WifiNetworkInfo", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiSpirit implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String n = "WifiSpirit";

    @SuppressLint({"StaticFieldLeak"})
    private static WifiSpirit o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SuppressLint({"WifiManagerPotentialLeak"})
    private final WifiManager wifiManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ConnectivityManager connectiveManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final IWifiController wifiController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final d wifiStatusListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final WifiStatusObserver wifiStatusObserver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final b wifiConnectListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final c wifiDisconnectListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final WifiConnectionObserver wifiConnectObserver;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ConnectivityManager.NetworkCallback savedConnectNetworkCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String savedTargetSSID;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Network connectedNet;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/wifi/WifiSpirit$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/wifi/WifiSpirit;", "get", "", "destroy", "", "TAG", "Ljava/lang/String;", DefaultSettingsSpiCall.n, "Lcom/huami/watch/wifi/WifiSpirit;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public final void destroy() {
            WifiConnectionObserver wifiConnectionObserver;
            WifiStatusObserver wifiStatusObserver;
            WifiSpirit wifiSpirit = WifiSpirit.o;
            if (wifiSpirit != null && (wifiStatusObserver = wifiSpirit.wifiStatusObserver) != null) {
                wifiStatusObserver.stopObserve();
            }
            WifiSpirit wifiSpirit2 = WifiSpirit.o;
            if (wifiSpirit2 != null && (wifiConnectionObserver = wifiSpirit2.wifiConnectObserver) != null) {
                wifiConnectionObserver.stopObserve();
            }
            WifiSpirit.o = null;
        }

        @NotNull
        public final WifiSpirit get(@NotNull Context context) {
            WifiSpirit wifiSpirit = WifiSpirit.o;
            if (wifiSpirit != null) {
                return wifiSpirit;
            }
            WifiSpirit wifiSpirit2 = new WifiSpirit(context.getApplicationContext(), null);
            WifiSpirit.o = wifiSpirit2;
            wifiSpirit2.wifiConnectObserver.startObserve();
            wifiSpirit2.wifiStatusObserver.persistentObserve();
            return wifiSpirit2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/watch/wifi/WifiSpirit$WifiNetworkInfo;", "", "", "targetSSID", "", "hasConnectTo", "disConnectTo", "component1", "Landroid/net/Network;", "component2", "", "component3", "ssid", "network", "eventType", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getSsid", "()Ljava/lang/String;", "b", "Landroid/net/Network;", "getNetwork", "()Landroid/net/Network;", "c", LogUtil.I, "getEventType", "()I", "<init>", "(Ljava/lang/String;Landroid/net/Network;I)V", "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class WifiNetworkInfo {
        public static final int CONNECT = 0;
        public static final int DISCONNECT = 1;
        public static final int INVALID = -1;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        private final String ssid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final Network network;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int eventType;

        public WifiNetworkInfo(@Nullable String str, @Nullable Network network, int i) {
            this.ssid = str;
            this.network = network;
            this.eventType = i;
        }

        public static /* synthetic */ WifiNetworkInfo copy$default(WifiNetworkInfo wifiNetworkInfo, String str, Network network, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = wifiNetworkInfo.ssid;
            }
            if ((i2 & 2) != 0) {
                network = wifiNetworkInfo.network;
            }
            if ((i2 & 4) != 0) {
                i = wifiNetworkInfo.eventType;
            }
            return wifiNetworkInfo.copy(str, network, i);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSsid() {
            return this.ssid;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Network getNetwork() {
            return this.network;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEventType() {
            return this.eventType;
        }

        @NotNull
        public final WifiNetworkInfo copy(@Nullable String ssid, @Nullable Network network, int eventType) {
            return new WifiNetworkInfo(ssid, network, eventType);
        }

        public final boolean disConnectTo(@NotNull String targetSSID) {
            if (Intrinsics.areEqual(this.ssid, targetSSID) && this.eventType == 1) {
                return true;
            }
            return (Intrinsics.areEqual(this.ssid, targetSSID) ^ true) && this.eventType == 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WifiNetworkInfo)) {
                return false;
            }
            WifiNetworkInfo wifiNetworkInfo = (WifiNetworkInfo) other;
            return Intrinsics.areEqual(this.ssid, wifiNetworkInfo.ssid) && Intrinsics.areEqual(this.network, wifiNetworkInfo.network) && this.eventType == wifiNetworkInfo.eventType;
        }

        public final int getEventType() {
            return this.eventType;
        }

        @Nullable
        public final Network getNetwork() {
            return this.network;
        }

        @Nullable
        public final String getSsid() {
            return this.ssid;
        }

        public final boolean hasConnectTo(@NotNull String targetSSID) {
            return Intrinsics.areEqual(this.ssid, targetSSID) && this.eventType == 0;
        }

        public int hashCode() {
            String str = this.ssid;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            Network network = this.network;
            return ((iHashCode + (network != null ? network.hashCode() : 0)) * 31) + this.eventType;
        }

        @NotNull
        public String toString() {
            return "WifiNetworkInfo(ssid=" + this.ssid + ", network=" + this.network + ", eventType=" + this.eventType + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/huami/watch/wifi/WifiSpirit$a", "Lcom/huami/watch/wifi/IWifiScanListener;", "", "onSuccess", "onFailed", "<init>", "(Lcom/huami/watch/wifi/WifiSpirit;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class a implements IWifiScanListener {
        public a() {
        }

        @Override // com.huami.watch.wifi.IWifiScanListener
        public void onFailed() {
            List<ScanResult> listEmptyList;
            LogUtils.INSTANCE.log(WifiSpirit.n, "scan failed");
            WifiManager wifiManager = WifiSpirit.this.wifiManager;
            if (wifiManager == null || (listEmptyList = wifiManager.getScanResults()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            WifiSpirit.this.d(listEmptyList);
        }

        @Override // com.huami.watch.wifi.IWifiScanListener
        public void onSuccess() {
            List<ScanResult> listEmptyList;
            LogUtils.INSTANCE.log(WifiSpirit.n, "scan success");
            WifiManager wifiManager = WifiSpirit.this.wifiManager;
            if (wifiManager == null || (listEmptyList = wifiManager.getScanResults()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            WifiSpirit.this.d(listEmptyList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"com/huami/watch/wifi/WifiSpirit$b", "Lcom/huami/watch/wifi/IWifiConnectListener;", "", "ssid", "Landroid/net/Network;", "network", "", "onConnectedTo", "onDisconnected", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/huami/watch/wifi/WifiSpirit$WifiNetworkInfo;", "a", "Lkotlinx/coroutines/CompletableDeferred;", "()Lkotlinx/coroutines/CompletableDeferred;", "c", "(Lkotlinx/coroutines/CompletableDeferred;)V", "deferred", "b", "Ljava/lang/String;", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "(Ljava/lang/String;)V", "targetSSID", "<init>", "(Lcom/huami/watch/wifi/WifiSpirit;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements IWifiConnectListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private CompletableDeferred<WifiNetworkInfo> deferred;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String targetSSID;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$WifiConnectListener$onConnectedTo$1", f = "WifiSpirit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String c;
            public final /* synthetic */ Network d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Network network, Continuation continuation) {
                super(2, continuation);
                this.c = str;
                this.d = network;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return b.this.new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
                CompletableDeferred<WifiNetworkInfo> completableDeferredA = b.this.a();
                if (completableDeferredA != null) {
                    Boxing.boxBoolean(completableDeferredA.complete(new WifiNetworkInfo(this.c, this.d, 0)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.wifi.WifiSpirit$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$WifiConnectListener$onDisconnected$1", f = "WifiSpirit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0677b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String c;
            public final /* synthetic */ Network d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0677b(String str, Network network, Continuation continuation) {
                super(2, continuation);
                this.c = str;
                this.d = network;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return b.this.new C0677b(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0677b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<WifiNetworkInfo> completableDeferredA = b.this.a();
                if (completableDeferredA != null) {
                    Boxing.boxBoolean(completableDeferredA.complete(new WifiNetworkInfo(this.c, this.d, 1)));
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Nullable
        public final CompletableDeferred<WifiNetworkInfo> a() {
            return this.deferred;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTargetSSID() {
            return this.targetSSID;
        }

        public final void c(@Nullable CompletableDeferred<WifiNetworkInfo> completableDeferred) {
            this.deferred = completableDeferred;
        }

        public final void d(@Nullable String str) {
            this.targetSSID = str;
        }

        @Override // com.huami.watch.wifi.IWifiConnectListener
        public void onConnectedTo(@Nullable String ssid, @Nullable Network network) {
            WifiSpirit wifiSpirit = WifiSpirit.this;
            String str = this.targetSSID;
            if (str == null) {
                str = "";
            }
            String strH = wifiSpirit.h(str);
            LogUtils.INSTANCE.log(WifiSpirit.n, "onConnectedTo ssid: " + ssid + ", wrap ssid: " + strH + ", target ssid: " + this.targetSSID + ", equals: " + Intrinsics.areEqual(ssid, this.targetSSID));
            if (Intrinsics.areEqual(strH, ssid) || Intrinsics.areEqual(this.targetSSID, ssid)) {
                kotlinx.coroutines.e.f(WifiSpirit.this, null, null, new a(ssid, network, null), 3, null);
            }
        }

        @Override // com.huami.watch.wifi.IWifiConnectListener
        public void onDisconnected(@Nullable String ssid, @Nullable Network network) {
            WifiSpirit wifiSpirit = WifiSpirit.this;
            String str = this.targetSSID;
            if (str == null) {
                str = "";
            }
            String strH = wifiSpirit.h(str);
            LogUtils.INSTANCE.log(WifiSpirit.n, "onDisconnected ssid: " + ssid + ", wrap ssid: " + strH + ", target ssid: " + this.targetSSID + ", equals: " + Intrinsics.areEqual(ssid, this.targetSSID));
            if (Intrinsics.areEqual(strH, ssid) || Intrinsics.areEqual(this.targetSSID, ssid)) {
                kotlinx.coroutines.e.f(WifiSpirit.this, null, null, new C0677b(ssid, network, null), 3, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/huami/watch/wifi/WifiSpirit$c", "Lcom/huami/watch/wifi/IWifiConnectListener;", "", "ssid", "Landroid/net/Network;", "network", "", "onConnectedTo", "onDisconnected", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/watch/wifi/WifiSpirit$WifiNetworkInfo;", "a", "Lkotlinx/coroutines/channels/Channel;", "()Lkotlinx/coroutines/channels/Channel;", "channel", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "targetSSID", "<init>", "(Lcom/huami/watch/wifi/WifiSpirit;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class c implements IWifiConnectListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Channel<WifiNetworkInfo> channel = ChannelKt.Channel$default(0, 1, null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String targetSSID;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$WifiDisconnectListener$onConnectedTo$1", f = "WifiSpirit.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String c;
            public final /* synthetic */ Network d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Network network, Continuation continuation) {
                super(2, continuation);
                this.c = str;
                this.d = network;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return c.this.new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<WifiNetworkInfo> channelA = c.this.a();
                    WifiNetworkInfo wifiNetworkInfo = new WifiNetworkInfo(this.c, this.d, 0);
                    this.a = 1;
                    if (channelA.send(wifiNetworkInfo, this) == coroutine_suspended) {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$WifiDisconnectListener$onDisconnected$1", f = "WifiSpirit.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String c;
            public final /* synthetic */ Network d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Network network, Continuation continuation) {
                super(2, continuation);
                this.c = str;
                this.d = network;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return c.this.new b(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<WifiNetworkInfo> channelA = c.this.a();
                    WifiNetworkInfo wifiNetworkInfo = new WifiNetworkInfo(this.c, this.d, 1);
                    this.a = 1;
                    if (channelA.send(wifiNetworkInfo, this) == coroutine_suspended) {
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

        public c() {
        }

        @NotNull
        public final Channel<WifiNetworkInfo> a() {
            return this.channel;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTargetSSID() {
            return this.targetSSID;
        }

        public final void c(@Nullable String str) {
            this.targetSSID = str;
        }

        @Override // com.huami.watch.wifi.IWifiConnectListener
        public void onConnectedTo(@Nullable String ssid, @Nullable Network network) {
            LogUtils.INSTANCE.log(WifiSpirit.n, "onConnectedTo ssid: " + ssid + "; targetSSID: " + this.targetSSID);
            WifiSpirit wifiSpirit = WifiSpirit.this;
            String str = this.targetSSID;
            if (str == null) {
                str = "";
            }
            if ((!Intrinsics.areEqual(wifiSpirit.h(str), ssid)) && (!Intrinsics.areEqual(this.targetSSID, ssid))) {
                kotlinx.coroutines.e.f(WifiSpirit.this, null, null, new a(ssid, network, null), 3, null);
            }
        }

        @Override // com.huami.watch.wifi.IWifiConnectListener
        public void onDisconnected(@Nullable String ssid, @Nullable Network network) {
            LogUtils logUtils = LogUtils.INSTANCE;
            logUtils.log(WifiSpirit.n, "onDisconnected ssid: " + ssid + "; targetSSID: " + this.targetSSID);
            WifiSpirit wifiSpirit = WifiSpirit.this;
            String str = this.targetSSID;
            if (str == null) {
                str = "";
            }
            if (Intrinsics.areEqual(wifiSpirit.h(str), ssid) || Intrinsics.areEqual(this.targetSSID, ssid)) {
                logUtils.log(WifiSpirit.n, "send msg");
                kotlinx.coroutines.e.f(WifiSpirit.this, null, null, new b(ssid, network, null), 3, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"com/huami/watch/wifi/WifiSpirit$d", "Lcom/huami/watch/wifi/IWifiStatusListener;", "", "onWifiEnable", "onWifiDisable", "Lkotlinx/coroutines/CompletableDeferred;", "", "a", "Lkotlinx/coroutines/CompletableDeferred;", "()Lkotlinx/coroutines/CompletableDeferred;", "b", "(Lkotlinx/coroutines/CompletableDeferred;)V", "statusDeferred", "<init>", "(Lcom/huami/watch/wifi/WifiSpirit;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class d implements IWifiStatusListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private CompletableDeferred<Boolean> statusDeferred;

        public d() {
        }

        @Nullable
        public final CompletableDeferred<Boolean> a() {
            return this.statusDeferred;
        }

        public final void b(@Nullable CompletableDeferred<Boolean> completableDeferred) {
            this.statusDeferred = completableDeferred;
        }

        @Override // com.huami.watch.wifi.IWifiStatusListener
        public void onWifiDisable() {
            LogUtils.INSTANCE.log(WifiSpirit.n, "on wifi disable");
            CompletableDeferred<Boolean> completableDeferred = this.statusDeferred;
            if (completableDeferred != null) {
                completableDeferred.complete(Boolean.FALSE);
            }
        }

        @Override // com.huami.watch.wifi.IWifiStatusListener
        public void onWifiEnable() {
            LogUtils.INSTANCE.log(WifiSpirit.n, "on wifi enable");
            CompletableDeferred<Boolean> completableDeferred = this.statusDeferred;
            if (completableDeferred != null) {
                completableDeferred.complete(Boolean.TRUE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$connectTo$1", f = "WifiSpirit.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ Ref.LongRef d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Ref.LongRef longRef, boolean z, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = longRef;
            this.e = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiSpirit.this.new e(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WifiSpirit wifiSpirit = WifiSpirit.this;
                String str = this.c;
                long j = this.d.element;
                boolean z = this.e;
                this.a = 1;
                obj = wifiSpirit.g(str, j, z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            WifiSpirit.this.savedTargetSSID = this.c;
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$disconnectWithObserve$1", f = "WifiSpirit.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_MODERN_DANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, long j, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiSpirit.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WifiSpirit wifiSpirit = WifiSpirit.this;
                String str = this.c;
                long j = this.d;
                this.a = 1;
                obj = wifiSpirit.e(str, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                WifiSpirit.this.savedTargetSSID = null;
                WifiSpirit.this.savedConnectNetworkCallback = null;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$enableWifi$1", f = "WifiSpirit.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Ref.BooleanRef c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Ref.BooleanRef booleanRef, boolean z, long j, Continuation continuation) {
            super(2, continuation);
            this.c = booleanRef;
            this.d = z;
            this.e = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiSpirit.this.new g(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WifiSpirit wifiSpirit = WifiSpirit.this;
                boolean z = this.c.element;
                boolean z2 = this.d;
                long j = this.e;
                this.a = 1;
                obj = wifiSpirit.f(z, z2, j, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "a", "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<CompletableJob> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@"}, d2 = {"", "ssid", "", "timeout", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "startObserveWifiDisconnect"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit", f = "WifiSpirit.kt", i = {0, 0}, l = {259}, m = "startObserveWifiDisconnect", n = {"this", "ssid"}, s = {"L$0", "L$1"})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiSpirit.this.e(null, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/watch/wifi/WifiSpirit$WifiNetworkInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$startObserveWifiDisconnect$response$1", f = "WifiSpirit.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WifiNetworkInfo>, Object> {
        public int a;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiSpirit.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WifiNetworkInfo> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<WifiNetworkInfo> channelA = WifiSpirit.this.wifiDisconnectListener.a();
                this.a = 1;
                obj = channelA.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0082@"}, d2 = {"", "current", "enable", "", "timeout", "Lkotlin/coroutines/Continuation;", "continuation", "", "startObserveWifiStatus"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit", f = "WifiSpirit.kt", i = {0, 0, 0}, l = {203}, m = "startObserveWifiStatus", n = {"this", "current", "enable"}, s = {"L$0", "Z$0", "Z$1"})
    public static final class k extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public boolean e;
        public boolean f;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiSpirit.this.f(false, false, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$startObserveWifiStatus$result$1", f = "WifiSpirit.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiSpirit.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<Boolean> completableDeferredA = WifiSpirit.this.wifiStatusListener.a();
                if (completableDeferredA == null) {
                    return null;
                }
                this.a = 1;
                obj = completableDeferredA.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Boolean) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0082@"}, d2 = {"", "ssid", "", "timeout", "", "bind", "Lkotlin/coroutines/Continuation;", "continuation", "", "waitObserveWifiConnect"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit", f = "WifiSpirit.kt", i = {0, 0, 0, 1, 1, 1}, l = {FTPCodes.NAME_SYSTEM_TIME, 219}, m = "waitObserveWifiConnect", n = {"this", "ssid", "bind", "this", "ssid", "bind"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class m extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public boolean f;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiSpirit.this.g(null, 0L, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/watch/wifi/WifiSpirit$WifiNetworkInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wifi.WifiSpirit$waitObserveWifiConnect$response$1", f = "WifiSpirit.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WifiNetworkInfo>, Object> {
        public int a;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiSpirit.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WifiNetworkInfo> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<WifiNetworkInfo> completableDeferredA = WifiSpirit.this.wifiConnectListener.a();
                if (completableDeferredA == null) {
                    return null;
                }
                this.a = 1;
                obj = completableDeferredA.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (WifiNetworkInfo) obj;
        }
    }

    private WifiSpirit(Context context) {
        this.context = context;
        this.job = LazyKt__LazyJVMKt.lazy(h.a);
        Object systemService = context.getSystemService("wifi");
        this.wifiManager = (WifiManager) (systemService instanceof WifiManager ? systemService : null);
        Object systemService2 = context.getSystemService("connectivity");
        this.connectiveManager = (ConnectivityManager) (systemService2 instanceof ConnectivityManager ? systemService2 : null);
        this.wifiController = Build.VERSION.SDK_INT >= 29 ? new WifiControllerAboveQ(context) : new WifiControllerBelowQ(context);
        d dVar = new d();
        this.wifiStatusListener = dVar;
        this.wifiStatusObserver = new WifiStatusObserver(context, dVar);
        this.wifiConnectListener = new b();
        this.wifiDisconnectListener = new c();
        this.wifiConnectObserver = new WifiConnectionObserver(context.getApplicationContext(), null);
    }

    private final boolean a(String ssid, long timeout, ConnectivityManager.NetworkCallback networkCallback) {
        this.wifiDisconnectListener.c(ssid);
        this.wifiConnectObserver.setListener(this.wifiDisconnectListener);
        this.wifiController.disconnect(networkCallback);
        return ((Boolean) kotlinx.coroutines.d.b(null, new f(ssid, timeout, null), 1, null)).booleanValue();
    }

    private final boolean b(ConnectivityManager.NetworkCallback networkCallback) {
        return this.wifiController.disconnect(networkCallback);
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List<ScanResult> list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(String str) {
        return '\"' + str + '\"';
    }

    @WorkerThread
    public final boolean connectTo(@NotNull String ssid, @NotNull String password, long timeout, boolean bind) {
        android.net.wifi.WifiInfo connectionInfo;
        WifiManager wifiManager = this.wifiManager;
        String ssid2 = (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? null : connectionInfo.getSSID();
        if (!Intrinsics.areEqual(ssid2, ssid)) {
            if (!Intrinsics.areEqual(ssid2, '\"' + ssid + '\"')) {
                this.wifiConnectListener.d(ssid);
                Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = timeout;
                IWifiController iWifiController = this.wifiController;
                if (iWifiController instanceof WifiControllerAboveQ) {
                    ((WifiControllerAboveQ) iWifiController).getNetworkCallback().setCallback(this.wifiConnectListener);
                    longRef.element = -1L;
                } else {
                    this.wifiConnectObserver.setListener(this.wifiConnectListener);
                }
                this.wifiConnectListener.c(CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
                ConnectivityManager.NetworkCallback networkCallbackConnectTo = this.wifiController.connectTo(ssid, password);
                this.savedConnectNetworkCallback = networkCallbackConnectTo;
                if (networkCallbackConnectTo != null) {
                    return ((Boolean) kotlinx.coroutines.d.b(null, new e(ssid, longRef, bind, null), 1, null)).booleanValue();
                }
                this.wifiConnectListener.c(null);
                return false;
            }
        }
        return true;
    }

    @WorkerThread
    public final boolean disconnect(long timeout) {
        String str = this.savedTargetSSID;
        if (str == null) {
            LogUtils.INSTANCE.log(n, "disconnect failed as ssid is null");
            return false;
        }
        WifiManager wifiManager = this.wifiManager;
        android.net.wifi.WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
        if (!Intrinsics.areEqual(connectionInfo != null ? connectionInfo.getSSID() : null, str)) {
            if (!Intrinsics.areEqual(connectionInfo != null ? connectionInfo.getSSID() : null, h(str))) {
                LogUtils.INSTANCE.log(n, "disconnect success as ssid is not equals, currentWifi: " + connectionInfo + ", target: " + str);
                return true;
            }
        }
        ConnectivityManager.NetworkCallback networkCallback = this.savedConnectNetworkCallback;
        if (networkCallback == null) {
            LogUtils.INSTANCE.log(n, "dis connect failed as networkCallback is null");
            return false;
        }
        boolean zB = timeout <= 0 ? b(networkCallback) : a(str, timeout, networkCallback);
        if (zB) {
            this.connectedNet = null;
        }
        return zB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object e(String str, long j2, Continuation<? super Boolean> continuation) {
        i iVar;
        WifiSpirit wifiSpirit;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.b = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objWithTimeoutOrNull = iVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.b;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            j jVar = new j(null);
            iVar.d = this;
            iVar.e = str;
            iVar.b = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j2, jVar, iVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiSpirit = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) iVar.e;
            wifiSpirit = (WifiSpirit) iVar.d;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        WifiNetworkInfo wifiNetworkInfo = (WifiNetworkInfo) objWithTimeoutOrNull;
        wifiSpirit.wifiConnectObserver.setListener(null);
        LogUtils.INSTANCE.log(n, "response: " + wifiNetworkInfo);
        if (wifiNetworkInfo == null) {
            wifiSpirit.wifiConnectObserver.bindToNetwork(null);
            return Boxing.boxBoolean(false);
        }
        if (!wifiNetworkInfo.disConnectTo(str) && !wifiNetworkInfo.disConnectTo(wifiSpirit.h(str))) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @WorkerThread
    public final boolean enableWifi(@NotNull Context context, boolean enable, long timeout) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zIsWifiEnable = isWifiEnable();
        booleanRef.element = zIsWifiEnable;
        if (zIsWifiEnable == enable) {
            return true;
        }
        this.wifiStatusListener.b(CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        if (this.wifiController.enableWifi(context, enable)) {
            booleanRef.element = isWifiEnable();
            return ((Boolean) kotlinx.coroutines.d.b(null, new g(booleanRef, enable, timeout, null), 1, null)).booleanValue();
        }
        this.wifiStatusListener.b(null);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object f(boolean z, boolean z2, long j2, Continuation<? super Boolean> continuation) {
        k kVar;
        WifiSpirit wifiSpirit;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.b = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objWithTimeoutOrNull = kVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            l lVar = new l(null);
            kVar.d = this;
            kVar.e = z;
            kVar.f = z2;
            kVar.b = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j2, lVar, kVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiSpirit = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = kVar.f;
            z = kVar.e;
            wifiSpirit = (WifiSpirit) kVar.d;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        Boolean bool = (Boolean) objWithTimeoutOrNull;
        if (bool != null) {
            z = bool.booleanValue();
        }
        wifiSpirit.wifiStatusListener.b(null);
        return Boxing.boxBoolean(z == z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object g(String str, long j2, boolean z, Continuation<? super Boolean> continuation) {
        m mVar;
        WifiSpirit wifiSpirit;
        WifiNetworkInfo wifiNetworkInfo;
        ConnectivityManager.NetworkCallback networkCallback;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.b = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objAwait = mVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.b;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (j2 > 0) {
                n nVar = new n(null);
                mVar.d = this;
                mVar.e = str;
                mVar.f = z;
                mVar.b = 1;
                objAwait = TimeoutKt.withTimeoutOrNull(j2, nVar, mVar);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wifiSpirit = this;
                wifiNetworkInfo = (WifiNetworkInfo) objAwait;
            } else {
                CompletableDeferred<WifiNetworkInfo> completableDeferredA = this.wifiConnectListener.a();
                if (completableDeferredA != null) {
                    mVar.d = this;
                    mVar.e = str;
                    mVar.f = z;
                    mVar.b = 2;
                    objAwait = completableDeferredA.await(mVar);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wifiSpirit = this;
                    wifiNetworkInfo = (WifiNetworkInfo) objAwait;
                } else {
                    wifiSpirit = this;
                    wifiNetworkInfo = null;
                }
            }
        } else if (i3 == 1) {
            z = mVar.f;
            str = (String) mVar.e;
            wifiSpirit = (WifiSpirit) mVar.d;
            ResultKt.throwOnFailure(objAwait);
            wifiNetworkInfo = (WifiNetworkInfo) objAwait;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = mVar.f;
            str = (String) mVar.e;
            wifiSpirit = (WifiSpirit) mVar.d;
            ResultKt.throwOnFailure(objAwait);
            wifiNetworkInfo = (WifiNetworkInfo) objAwait;
        }
        wifiSpirit.wifiConnectListener.c(null);
        IWifiController iWifiController = wifiSpirit.wifiController;
        if (iWifiController instanceof WifiControllerAboveQ) {
            ((WifiControllerAboveQ) iWifiController).getNetworkCallback().setTargetSsid(null);
            ((WifiControllerAboveQ) wifiSpirit.wifiController).getNetworkCallback().setCallback(null);
        } else {
            wifiSpirit.wifiConnectObserver.setListener(null);
        }
        LogUtils.INSTANCE.log(n, "response: " + wifiNetworkInfo);
        if (wifiNetworkInfo == null) {
            return Boxing.boxBoolean(false);
        }
        if (!wifiNetworkInfo.hasConnectTo(str) && !wifiNetworkInfo.hasConnectTo(wifiSpirit.h(str))) {
            z2 = false;
        }
        if (z2 && z) {
            Network network = wifiNetworkInfo.getNetwork();
            if (Build.VERSION.SDK_INT >= 23) {
                ConnectivityManager connectivityManager = wifiSpirit.connectiveManager;
                if (connectivityManager != null) {
                    Boxing.boxBoolean(connectivityManager.bindProcessToNetwork(network));
                }
            } else {
                ConnectivityManager.setProcessDefaultNetwork(network);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            ConnectivityManager connectivityManager2 = wifiSpirit.connectiveManager;
            if (connectivityManager2 != null) {
                Boxing.boxBoolean(connectivityManager2.bindProcessToNetwork(null));
            }
        } else {
            ConnectivityManager.setProcessDefaultNetwork(null);
        }
        if (!z2 && (networkCallback = wifiSpirit.savedConnectNetworkCallback) != null) {
            Boxing.boxBoolean(wifiSpirit.wifiController.disconnect(networkCallback));
        }
        if (z2) {
            wifiSpirit.connectedNet = wifiNetworkInfo.getNetwork();
        }
        return Boxing.boxBoolean(z2);
    }

    @Nullable
    /* JADX INFO: renamed from: getConnectedNetwork, reason: from getter */
    public final Network getConnectedNet() {
        return this.connectedNet;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @NotNull
    public final List<String> getNeedPermissions() {
        return Utils.INSTANCE.checkWifiRelatedPermission(this.context);
    }

    @NotNull
    public final List<ScanResult> getScanResult() {
        List<ScanResult> scanResults;
        WifiManager wifiManager = this.wifiManager;
        return (wifiManager == null || (scanResults = wifiManager.getScanResults()) == null) ? CollectionsKt__CollectionsKt.emptyList() : scanResults;
    }

    public final boolean isWifiEnable() {
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager != null) {
            return wifiManager.isWifiEnabled();
        }
        return false;
    }

    public final boolean tryToScan() {
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager != null) {
            return wifiManager.startScan();
        }
        return false;
    }

    public /* synthetic */ WifiSpirit(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
