package com.xiaomi.hm.health.device.feature.sync.job;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.appsort.utils.AppSortUtilKt;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\"\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljava/util/Calendar;", "time", "", "isInvalidTime", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "needSyncPai", "deviceNeedCheckFw", "", "debugTag", "Ljava/lang/String;", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ConstKt {

    @NotNull
    public static final String debugTag = "SyncJob";

    public static final boolean deviceNeedCheckFw(@NotNull HMDeviceSource hMDeviceSource) {
        Iterator<Map.Entry<HMDeviceSource, String>> it2 = AppSortUtilKt.SUPPORT_PAI_FW_VERSION_MAP.entrySet().iterator();
        while (it2.hasNext()) {
            if (hMDeviceSource == it2.next().getKey()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isInvalidTime(@NotNull Calendar calendar) {
        return calendar.get(1) <= 1975;
    }

    public static final boolean needSyncPai(@NotNull HMDeviceSource hMDeviceSource) {
        if (!HMDeviceConfig.hasFeaturePAI(hMDeviceSource)) {
            return false;
        }
        if (deviceNeedCheckFw(hMDeviceSource)) {
            return AppSortUtilKt.isFwSupportPAI(hMDeviceSource);
        }
        return true;
    }
}
