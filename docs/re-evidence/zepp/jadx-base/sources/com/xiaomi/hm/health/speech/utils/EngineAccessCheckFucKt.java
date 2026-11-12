package com.xiaomi.hm.health.speech.utils;

import com.huami.account.HMLoginManager;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"", "miAiRegionAccess", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class EngineAccessCheckFucKt {
    public static final boolean miAiRegionAccess() {
        if (HMLoginManager.isMainlandUser()) {
            return true;
        }
        if (!HMLoginManager.isInKR() && HMLoginManager.isUserAccessSingaporeServer()) {
            return HMDeviceConfig.isCincoSeries() || HMDeviceConfig.isKongmingSeries();
        }
        return false;
    }
}
