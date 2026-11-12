package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.agps.LowBatteryApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/LowBatteryHelperImpl;", "Lcom/xiaomi/hm/health/device/agps/LowBatteryApi;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "showMiliHelper", "showNormandyHelper", "showEarbudHelper", "", "type", "showOtherHelper", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LowBatteryHelperImpl implements LowBatteryApi {
    @Override // com.xiaomi.hm.health.device.agps.LowBatteryApi
    public void showEarbudHelper(@NotNull Context context) {
        HMFwUpgradeLowBatteryActivity.showEarbudHelper(context);
    }

    @Override // com.xiaomi.hm.health.device.agps.LowBatteryApi
    public void showMiliHelper(@NotNull Context context) {
        HMFwUpgradeLowBatteryActivity.showMiliHelper(context);
    }

    @Override // com.xiaomi.hm.health.device.agps.LowBatteryApi
    public void showNormandyHelper(@NotNull Context context) {
        HMFwUpgradeLowBatteryActivity.showNormandyHelper(context);
    }

    @Override // com.xiaomi.hm.health.device.agps.LowBatteryApi
    public void showOtherHelper(@NotNull Context context, int type) {
        HMFwUpgradeLowBatteryActivity.showOtherHelper(context, HMDeviceType.fromValue(type));
    }
}
