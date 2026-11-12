package com.huami.core.device.wifi_settings.wifiscan.broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.wifiscan.WifiUtil;
import com.huami.core.device.wifi_settings.wifiscan.broadcast.WifiBroadcastReceiver;
import com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate;
import com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import io.netty.util.internal.StringUtil;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/broadcast/WifiBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;", "a", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;", "delegate", "Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;", "b", "Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;)V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    public static final String TAG = "WifiBroadcastReceiver";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private WifiDelegate delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ScanResultListener listener;

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
            return "WifiBroadcastReceiver#onReceive:  list size:" + this.a + StringUtil.SPACE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ WifiBroadcastReceiver b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, WifiBroadcastReceiver wifiBroadcastReceiver) {
            super(0);
            this.a = i;
            this.b = wifiBroadcastReceiver;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "wifi other state" + this.a + ":delegate state:" + this.b.delegate.getWifiState();
        }
    }

    public /* synthetic */ WifiBroadcastReceiver(WifiDelegate wifiDelegate, ScanResultListener scanResultListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wifiDelegate, (i & 2) != 0 ? null : scanResultListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WifiBroadcastReceiver wifiBroadcastReceiver, Context context, List list, WifiDelegate wifiDelegate) {
        final ScanResultListener scanResultListener = wifiBroadcastReceiver.listener;
        if (scanResultListener == null) {
            return;
        }
        final List<WifiBean> wifiBeans = WifiUtil.INSTANCE.parseWifiBeans(context, list, wifiDelegate.getFilter5G());
        ((Activity) context).runOnUiThread(new Runnable() { // from class: qu8
            @Override // java.lang.Runnable
            public final void run() {
                WifiBroadcastReceiver.d(scanResultListener, wifiBeans);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ScanResultListener scanResultListener, List list) {
        scanResultListener.resultSuc(list);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull final Context context, @Nullable Intent intent) {
        String action = intent == null ? null : intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1875733435) {
                if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("wifi_state", 0);
                    HMLog.info(TAG, new b(intExtra, this));
                    if (intExtra == 3 && this.delegate.getWifiState() == WifiDelegate.DelegateState.START) {
                        ScanResultListener scanResultListener = this.listener;
                        if (scanResultListener != null) {
                            scanResultListener.onStartScan();
                        }
                        this.delegate.wifiScan(context);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode == -343630553) {
                if (action.equals("android.net.wifi.STATE_CHANGE")) {
                    Object systemService = context.getApplicationContext().getSystemService("wifi");
                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
                    ScanResultListener scanResultListener2 = this.listener;
                    if (scanResultListener2 == null) {
                        return;
                    }
                    scanResultListener2.connectedWifiCallback(connectionInfo);
                    return;
                }
                return;
            }
            if (iHashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                final WifiDelegate wifiDelegate = this.delegate;
                final List<ScanResult> wifiScanResult = wifiDelegate.getWifiScanResult(context);
                int size = wifiScanResult != null ? wifiScanResult.size() : 0;
                HMLog.debug(TAG, new a(size));
                if (size == 0) {
                    ScanResultListener scanResultListener3 = this.listener;
                    if (scanResultListener3 == null) {
                        return;
                    }
                    scanResultListener3.resultSuc(null);
                    return;
                }
                ExecutorService pool = this.delegate.getPool();
                if (pool == null) {
                    return;
                }
                pool.execute(new Runnable() { // from class: pu8
                    @Override // java.lang.Runnable
                    public final void run() {
                        WifiBroadcastReceiver.c(this.a, context, wifiScanResult, wifiDelegate);
                    }
                });
            }
        }
    }

    public WifiBroadcastReceiver(@NotNull WifiDelegate wifiDelegate, @Nullable ScanResultListener scanResultListener) {
        this.delegate = wifiDelegate;
        this.listener = scanResultListener;
    }
}
