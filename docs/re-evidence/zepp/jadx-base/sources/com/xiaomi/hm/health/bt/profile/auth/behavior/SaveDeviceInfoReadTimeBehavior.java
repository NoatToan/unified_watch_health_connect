package com.xiaomi.hm.health.bt.profile.auth.behavior;

import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.Success;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/behavior/SaveDeviceInfoReadTimeBehavior;", "Lcom/xiaomi/hm/health/bt/profile/auth/behavior/IAuthBehavior;", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "readDeviceInfo", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "authResult", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "baseBleDevice", "", "sendAuthResultMessage", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SaveDeviceInfoReadTimeBehavior implements IAuthBehavior {
    @Override // com.xiaomi.hm.health.bt.profile.auth.behavior.IAuthBehavior
    @Nullable
    public DeviceInfo readDeviceInfo(@NotNull BaseProfile baseProfile) {
        return baseProfile.getBaseDeviceInfo();
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.behavior.IAuthBehavior
    public void sendAuthResultMessage(@NotNull AuthResult authResult, @NotNull HMBaseBleDevice baseBleDevice) {
        baseBleDevice.handleStatusChanged(authResult.getAuthError() instanceof Success ? Status.AUTH_SUCCESS_WITHOUT_DEVICE_INFO : Status.AUTH_FAILED.setValue(authResult.getOriginCode()).setAuthResult(authResult));
    }
}
