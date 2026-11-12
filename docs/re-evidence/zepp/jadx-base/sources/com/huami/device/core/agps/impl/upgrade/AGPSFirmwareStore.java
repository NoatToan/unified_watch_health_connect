package com.huami.device.core.agps.impl.upgrade;

import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;", "", "", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "getAGPSFirmwares", "", "getTempDir", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public interface AGPSFirmwareStore {
    @NotNull
    List<HMFirmwareInfo> getAGPSFirmwares();

    @NotNull
    String getTempDir();
}
