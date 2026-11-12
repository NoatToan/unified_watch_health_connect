package com.xiaomi.hm.health.bt.profile.auth.behavior;

import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/behavior/IAuthBehavior;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "readDeviceInfo", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "authResult", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "baseBleDevice", "", "sendAuthResultMessage", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IAuthBehavior {
    @Nullable
    DeviceInfo readDeviceInfo(@NotNull BaseProfile baseProfile);

    void sendAuthResultMessage(@NotNull AuthResult authResult, @NotNull HMBaseBleDevice baseBleDevice);
}
