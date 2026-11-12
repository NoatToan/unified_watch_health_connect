package com.xiaomi.hm.health.bt.profile.auth;

import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/TraditionalDeviceAuthorizationImpl;", "Lcom/xiaomi/hm/health/bt/profile/auth/IDeviceAuthorization;", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "authInfo", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "authCallback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "authorize", "", "deAuthorize", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "a", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/profile/auth/HMProAuthController;", "b", "Lcom/xiaomi/hm/health/bt/profile/auth/HMProAuthController;", "authController", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TraditionalDeviceAuthorizationImpl implements IDeviceAuthorization {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMProAuthController authController;

    public TraditionalDeviceAuthorizationImpl(@NotNull GattPeripheral gattPeripheral) {
        this.gattPeripheral = gattPeripheral;
        this.authController = new HMProAuthController(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization
    @NotNull
    public AuthResult authorize(@NotNull AuthInfo authInfo, @NotNull IHMAuthCallback authCallback) {
        return this.authController.auth(authInfo, authCallback);
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IDeviceAuthorization
    public boolean deAuthorize(@NotNull AuthInfo authInfo) {
        return this.authController.unbind(authInfo);
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }
}
