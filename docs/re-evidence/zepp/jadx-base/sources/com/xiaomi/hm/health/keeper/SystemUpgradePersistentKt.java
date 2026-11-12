package com.xiaomi.hm.health.keeper;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.devicex.proxy.data.KeeperProxyImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0018\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0018\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\"\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "", "setClickedVersion", "", "mac", "getClickedVersion", "", "shouldShowRedDot", "type", "getFwUpgradeVer", SystemUpgradePersistentKt.KEY_CLICKED_VERSION, "Ljava/lang/String;", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SystemUpgradePersistentKt {

    @NotNull
    public static final String KEY_CLICKED_VERSION = "KEY_CLICKED_VERSION";

    @Nullable
    public static final String getClickedVersion(@NotNull String str) {
        return HMKeeper.valueOf("KEY_CLICKED_VERSION_" + str);
    }

    @Nullable
    public static final String getFwUpgradeVer(@Nullable Context context, @Nullable HMDeviceType hMDeviceType) {
        return (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) ? HMFwOnlineUpgradeManager.getInstance().getFwUpgradeVer(context, hMDeviceType) : HMFwUpgradeManager.getInstance().getFwUpgradeVer(context, hMDeviceType);
    }

    public static final void setClickedVersion(@Nullable Context context, @NotNull HMDeviceType hMDeviceType) {
        new KeeperProxyImpl().setClickedVersion(context, hMDeviceType);
    }

    public static final boolean shouldShowRedDot(@Nullable Context context, @NotNull HMDeviceType hMDeviceType) {
        return new KeeperProxyImpl().shouldShowRedDot(context, hMDeviceType);
    }
}
