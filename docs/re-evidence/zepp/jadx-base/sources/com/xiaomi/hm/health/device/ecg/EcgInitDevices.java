package com.xiaomi.hm.health.device.ecg;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huami.ecg.core.device.EcgDevice;
import com.huami.ecg.sync.health.model.HealthInfo;
import com.huami.ecg.sync.health.model.UserProfile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/ecg/EcgInitDevices;", "Lcom/huami/ecg/core/device/EcgDevice;", "", "isBioID", "", "source", "isECGMiliFamily", "isJHSSeries", "Lcom/huami/ecg/sync/health/model/UserProfile;", "userProfile", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EcgInitDevices implements EcgDevice {
    @Override // com.huami.ecg.core.device.EcgDevice
    public boolean isBioID() {
        return false;
    }

    @Override // com.huami.ecg.core.device.EcgDevice
    public boolean isECGMiliFamily(int source) {
        return false;
    }

    @Override // com.huami.ecg.core.device.EcgDevice
    public boolean isJHSSeries(int source) {
        return false;
    }

    @Override // com.huami.ecg.core.device.EcgDevice
    @NotNull
    public UserProfile userProfile() {
        return new UserProfile("", new HealthInfo(0, 0, 0, 0, 0, 0.0f, 0.0f, 127, null), null, 0, 0, 0, 0.0f, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }
}
