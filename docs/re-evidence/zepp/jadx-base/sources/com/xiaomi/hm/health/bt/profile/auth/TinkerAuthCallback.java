package com.xiaomi.hm.health.bt.profile.auth;

import androidx.annotation.CallSuper;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/TinkerAuthCallback;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "baseBleDevice", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "authResult", "", "onAuthFail", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class TinkerAuthCallback {
    @CallSuper
    public void onAuthFail(@NotNull HMBaseBleDevice baseBleDevice, @NotNull AuthResult authResult) {
        baseBleDevice.setTinkerAuthCallback(null);
    }
}
