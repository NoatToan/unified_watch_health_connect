package com.xiaomi.hm.health.nfc;

import android.content.Context;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0004¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WalletDeviceStatusStringProvider;", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getUnboundTextForFunction", "getSyncFailedText", "getConnectFailedText", "getBluetoothOffText", "getConnectingText", "", "percent", "getSynchronizingDataText", "getSynchronizingAGPSText", "getSyncAGPSFailedText", "getHelpText", "", TakePicSettingActivity.KEY_IS_WATCH, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public class WalletDeviceStatusStringProvider implements DeviceStatusStringProvider {
    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getBluetoothOffText(@NotNull Context context) {
        return context.getString(R.string.device_tip_ble_not_open);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getConnectFailedText(@NotNull Context context) {
        return isWatch() ? context.getString(R.string.watch_connect_fail) : context.getString(R.string.band_connect_fail);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getConnectingText(@NotNull Context context) {
        return context.getString(R.string.device_tip_connecting);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getHelpText(@NotNull Context context) {
        return context.getString(R.string.click_tolook_for_help);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getSyncAGPSFailedText(@NotNull Context context) {
        return context.getString(R.string.apgs_sync_fail);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getSyncFailedText(@NotNull Context context) {
        return isWatch() ? context.getString(R.string.watch_sync_fail) : context.getString(R.string.band_sync_fail);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getSynchronizingAGPSText(@NotNull Context context, int percent) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(context.getString(R.string.sync_agps_data_label), Arrays.copyOf(new Object[]{Integer.valueOf(percent)}, 1));
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getSynchronizingDataText(@NotNull Context context, int percent) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(context.getString(R.string.sync_data_label), Arrays.copyOf(new Object[]{Integer.valueOf(percent)}, 1));
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getUnboundTextForFunction(@NotNull Context context) {
        return isWatch() ? context.getString(R.string.nfc_pay_watch_bound) : context.getString(R.string.nfc_pay_not_bound);
    }

    public final boolean isWatch() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        return HMDeviceConfig.deviceNameIsWatch(hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceType()));
    }
}
