package com.xiaomi.hm.health.devicex.proxy.account;

import com.huami.ai.speech.simplify.auth.DeviceTokenManager;
import com.huami.devicex.injection.basic.DeviceTokenApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/account/DeviceTokenImpl;", "Lcom/huami/devicex/injection/basic/DeviceTokenApi;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isSupportDeviceToken", "", "getTpacProvider", "getSecret", "getClientId", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceTokenImpl implements DeviceTokenApi {
    @Override // com.huami.devicex.injection.basic.DeviceTokenApi
    @NotNull
    public String getClientId(@Nullable HMDeviceSource source) {
        return DeviceTokenManager.INSTANCE.getClientId(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceTokenApi
    @NotNull
    public String getSecret(@Nullable HMDeviceSource source) {
        return DeviceTokenManager.INSTANCE.getSecret(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceTokenApi
    @Nullable
    public String getTpacProvider(@Nullable HMDeviceSource source) {
        return DeviceTokenManager.INSTANCE.getTpacProvider(source);
    }

    @Override // com.huami.devicex.injection.basic.DeviceTokenApi
    public boolean isSupportDeviceToken(@Nullable HMDeviceSource source) {
        return DeviceTokenManager.INSTANCE.isSupportDeviceToken(source);
    }
}
