package com.huami.core.device.wifi_settings.wifiscan.listener;

import android.net.wifi.WifiInfo;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;", "", "", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "list", "", "resultSuc", "Landroid/net/wifi/WifiInfo;", "info", "connectedWifiCallback", "onStartScan", "onWifiSwitchDisable", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public interface ScanResultListener {
    void connectedWifiCallback(@Nullable WifiInfo info);

    void onStartScan();

    void onWifiSwitchDisable();

    void resultSuc(@Nullable List<WifiBean> list);
}
