package com.xiaomi.hm.health.device.wifi;

import com.xiaomi.hm.health.device.wifi.ui.HookWifiActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "", "", "registerHook", "", "findSsid", "ssid", "pwd", "", "setPwdString", "Lcom/xiaomi/hm/health/device/wifi/ui/HookWifiActivity;", "activity", "regCurrentUI", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface WifiSettingHook {
    @Nullable
    String findSsid();

    void regCurrentUI(@NotNull HookWifiActivity activity);

    void registerHook();

    boolean setPwdString(@NotNull String ssid, @NotNull String pwd);
}
