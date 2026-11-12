package com.xiaomi.hm.health.bt.device;

import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/FwDfuUtil;", "", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "isFwSupportDFU", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "isNeedFwDfuJudge", "Ljava/util/HashMap;", "", "a", "Ljava/util/HashMap;", "SUPPORT_DFU_FW_VERSION_MAP", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FwDfuUtil {

    @NotNull
    public static final FwDfuUtil INSTANCE = new FwDfuUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<HMDeviceSource, String> SUPPORT_DFU_FW_VERSION_MAP;

    static {
        HashMap<HMDeviceSource, String> map = new HashMap<>();
        map.put(HMDeviceSource.MILI_DTH, "4.1.4.03");
        SUPPORT_DFU_FW_VERSION_MAP = map;
    }

    private FwDfuUtil() {
    }

    public final boolean isFwSupportDFU(@Nullable DeviceInfo deviceInfo) {
        Integer numValueOf = deviceInfo == null ? null : Integer.valueOf(deviceInfo.getFirmwareVersion());
        Integer num = numValueOf == null || numValueOf.intValue() != -1 ? numValueOf : null;
        return num != null && num.intValue() >= ProfileUtils.getVersionCodeFromVersionName(SUPPORT_DFU_FW_VERSION_MAP.get(deviceInfo.getDeviceSource()));
    }

    public final boolean isNeedFwDfuJudge(@NotNull HMDeviceSource deviceSource) {
        return SUPPORT_DFU_FW_VERSION_MAP.containsKey(deviceSource);
    }
}
