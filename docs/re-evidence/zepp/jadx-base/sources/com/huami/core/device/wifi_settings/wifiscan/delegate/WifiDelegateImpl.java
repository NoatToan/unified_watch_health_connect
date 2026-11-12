package com.huami.core.device.wifi_settings.wifiscan.delegate;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegateImpl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegateImpl;", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "wifiScan", "", "Landroid/net/wifi/ScanResult;", "getWifiScanResult", "stopScan", "", "filter5GWifi", "a", "Z", "filter5G", "Ljava/util/concurrent/ExecutorService;", "b", "Ljava/util/concurrent/ExecutorService;", "getPool", "()Ljava/util/concurrent/ExecutorService;", "setPool", "(Ljava/util/concurrent/ExecutorService;)V", "pool", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;", "c", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;", "getWifiState", "()Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;", "setWifiState", "(Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;)V", "wifiState", "<init>", "(ZLjava/util/concurrent/ExecutorService;Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;)V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiDelegateImpl implements WifiDelegate {

    @NotNull
    public static final String TAG = "WifiDelegateImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean filter5G;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ExecutorService pool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private WifiDelegate.DelegateState wifiState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "wifiScan...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("开启扫描wifi ", Boolean.valueOf(this.a));
        }
    }

    public WifiDelegateImpl(boolean z, @Nullable ExecutorService executorService, @NotNull WifiDelegate.DelegateState delegateState) {
        this.filter5G = z;
        this.pool = executorService;
        this.wifiState = delegateState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WifiManager wifiManager) {
        HMLog.debug(TAG, new b(wifiManager.startScan()));
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    /* JADX INFO: renamed from: filter5GWifi, reason: from getter */
    public boolean getFilter5G() {
        return this.filter5G;
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    @Nullable
    public ExecutorService getPool() {
        return this.pool;
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    @Nullable
    public List<ScanResult> getWifiScanResult(@NotNull Context context) {
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return ((WifiManager) systemService).getScanResults();
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    @NotNull
    public WifiDelegate.DelegateState getWifiState() {
        return this.wifiState;
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    public void setPool(@Nullable ExecutorService executorService) {
        this.pool = executorService;
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    public void setWifiState(@NotNull WifiDelegate.DelegateState delegateState) {
        this.wifiState = delegateState;
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    public void stopScan() {
        ExecutorService pool = getPool();
        if (pool == null) {
            return;
        }
        pool.shutdown();
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate
    public void wifiScan(@Nullable Context context) {
        if (context == null) {
            return;
        }
        setWifiState(WifiDelegate.DelegateState.STOP);
        HMLog.debug(TAG, a.a);
        ExecutorService pool = getPool();
        if (pool != null) {
            pool.shutdown();
        }
        if (getPool() == null) {
            ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
            setPool(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(2), discardOldestPolicy));
        }
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        final WifiManager wifiManager = (WifiManager) systemService;
        ExecutorService pool2 = getPool();
        if (pool2 == null) {
            return;
        }
        pool2.execute(new Runnable() { // from class: mv8
            @Override // java.lang.Runnable
            public final void run() {
                WifiDelegateImpl.b(wifiManager);
            }
        });
    }

    public /* synthetic */ WifiDelegateImpl(boolean z, ExecutorService executorService, WifiDelegate.DelegateState delegateState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : executorService, (i & 4) != 0 ? WifiDelegate.DelegateState.STOP : delegateState);
    }
}
