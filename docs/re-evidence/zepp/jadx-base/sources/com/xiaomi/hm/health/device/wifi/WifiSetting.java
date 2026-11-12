package com.xiaomi.hm.health.device.wifi;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.wifi.hook.NormalHook;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/wifi/WifiSetting;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "createWifiSettingHook", "Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "findHookApi", "", "a", "Ljava/lang/String;", "tag", "b", "Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "currentHook", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WifiSetting {

    @NotNull
    public static final WifiSetting INSTANCE = new WifiSetting();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "WifiSetting";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static WifiSettingHook currentHook;

    private WifiSetting() {
    }

    public final void createWifiSettingHook(@NotNull Context context) {
        try {
            if (currentHook == null) {
                currentHook = new NormalHook();
            }
            WifiSettingHook wifiSettingHook = currentHook;
            if (wifiSettingHook == null) {
                return;
            }
            wifiSettingHook.registerHook();
        } catch (Exception e) {
            HMLog.e(tag, e);
        }
    }

    @Nullable
    public final WifiSettingHook findHookApi() {
        return currentHook;
    }
}
