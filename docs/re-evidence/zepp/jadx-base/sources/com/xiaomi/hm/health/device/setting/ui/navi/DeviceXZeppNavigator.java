package com.xiaomi.hm.health.device.setting.ui.navi;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXZeppNavigator;", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/companion/device/Device;", "device", "", "startDeviceStatus", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceXZeppNavigator extends DeviceXNavigator {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void navigateToDeviceSetting(@NotNull DeviceXZeppNavigator deviceXZeppNavigator, @Nullable Context context, @NotNull HMDeviceSource hMDeviceSource) {
            DeviceXNavigator.DefaultImpls.navigateToDeviceSetting(deviceXZeppNavigator, context, hMDeviceSource);
        }
    }

    void startDeviceStatus(@NotNull Context context, @NotNull Device device);
}
