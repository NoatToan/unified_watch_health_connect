package com.xiaomi.hm.health.bt.profile.dfu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/DfuUpgradeApi;", "", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "dfuApi", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "protocolInfo", "", "totalSize", "", "crc32", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "callback", "", "upgrade", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface DfuUpgradeApi {
    boolean upgrade(@NotNull DfuApi dfuApi, @NotNull DfuProtocolInfo protocolInfo, int totalSize, long crc32, @NotNull HMFirmwareType type, @NotNull IFirmwareUpgradeCallback callback);
}
