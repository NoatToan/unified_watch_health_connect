package com.huami.core.device.wifi_settings.wifiscan.delegate;

import android.content.Context;
import android.net.wifi.ScanResult;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\nH&R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "wifiScan", "", "Landroid/net/wifi/ScanResult;", "getWifiScanResult", "stopScan", "", "filter5GWifi", "Ljava/util/concurrent/ExecutorService;", "getPool", "()Ljava/util/concurrent/ExecutorService;", "setPool", "(Ljava/util/concurrent/ExecutorService;)V", "pool", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;", "getWifiState", "()Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;", "setWifiState", "(Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;)V", "wifiState", "DelegateState", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public interface WifiDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate$DelegateState;", "", "<init>", "(Ljava/lang/String;I)V", "START", "STOP", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public enum DelegateState {
        START,
        STOP
    }

    boolean filter5GWifi();

    @Nullable
    ExecutorService getPool();

    @Nullable
    List<ScanResult> getWifiScanResult(@NotNull Context context);

    @NotNull
    DelegateState getWifiState();

    void setPool(@Nullable ExecutorService executorService);

    void setWifiState(@NotNull DelegateState delegateState);

    void stopScan();

    void wifiScan(@Nullable Context context);
}
