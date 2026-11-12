package com.xiaomi.hm.health.device.introduce;

import android.content.Context;
import android.os.ConditionVariable;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\n\u0010\n\u001a\u0004\u0018\u00010\bH&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/SwitchConditionProvider;", "", "Landroid/os/ConditionVariable;", "getConnectCondition", "getSyncCondition", "getSyncGpsCondition", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getStopType", "Lcom/xiaomi/hm/health/databases/model/Device;", "getStopDevice", "getStartDevice", "", "needSyncData", "", "type", "", "showFailedDlg", "Landroid/content/Context;", "getMyContext", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getStartBleDevice", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SwitchConditionProvider {
    @NotNull
    ConditionVariable getConnectCondition();

    @NotNull
    Context getMyContext();

    @NotNull
    HMBaseDevice getStartBleDevice();

    @Nullable
    Device getStartDevice();

    @Nullable
    Device getStopDevice();

    @NotNull
    HMDeviceType getStopType();

    @NotNull
    ConditionVariable getSyncCondition();

    @NotNull
    ConditionVariable getSyncGpsCondition();

    boolean needSyncData();

    void showFailedDlg(int type);
}
