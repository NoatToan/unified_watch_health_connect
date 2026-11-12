package com.xiaomi.hm.health.bt.profile.auth.behavior;

import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/behavior/AuthBehaviorFactory;", "", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "authInfo", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "bleDevice", "Lcom/xiaomi/hm/health/bt/profile/auth/behavior/IAuthBehavior;", "createAuthBehavior", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AuthBehaviorFactory {

    @NotNull
    public static final AuthBehaviorFactory INSTANCE = new AuthBehaviorFactory();

    private AuthBehaviorFactory() {
    }

    @JvmStatic
    @NotNull
    public static final IAuthBehavior createAuthBehavior(@Nullable AuthInfo authInfo, @NotNull HMBaseBleDevice bleDevice) {
        boolean z = false;
        if (authInfo != null && authInfo.isPair()) {
            z = true;
        }
        return (HMBleConfig.SUPPORT_SAVE_DEVICE_INFO_READ && z && (bleDevice instanceof HMMiLiProDevice)) ? new SaveDeviceInfoReadTimeBehavior() : new NormalAuthBehavior();
    }
}
