package com.xiaomi.hm.health.device.health.device;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.device.feature.health.init.HealthInitConfig;
import com.huami.device.feature.health.res.IAppRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/health/device/HealthInitConfigImpl;", "Lcom/huami/device/feature/health/init/HealthInitConfig;", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "a", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "getAppApi", "()Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", "Lcom/huami/device/feature/health/res/IAppRes;", "b", "Lcom/huami/device/feature/health/res/IAppRes;", "getAppRes", "()Lcom/huami/device/feature/health/res/IAppRes;", "appRes", "Lcom/huami/device/feature/health/device/HealthDevice;", "c", "Lcom/huami/device/feature/health/device/HealthDevice;", "getDevice", "()Lcom/huami/device/feature/health/device/HealthDevice;", "device", "", GoogleApiAvailabilityLight.a, "Z", "isDebug", "()Z", "mDevice", "mAppApi", "mAppRes", "<init>", "(Lcom/huami/device/feature/health/device/HealthDevice;Lcom/huami/device/feature/health/device/IDeviceAppApi;Lcom/huami/device/feature/health/res/IAppRes;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthInitConfigImpl implements HealthInitConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceAppApi appApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IAppRes appRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isDebug;

    public HealthInitConfigImpl(@NotNull HealthDevice healthDevice, @NotNull IDeviceAppApi iDeviceAppApi, @NotNull IAppRes iAppRes) {
        this.appApi = iDeviceAppApi;
        this.appRes = iAppRes;
        this.device = healthDevice;
    }

    @Override // com.huami.device.feature.health.init.HealthInitConfig
    @NotNull
    public IDeviceAppApi getAppApi() {
        return this.appApi;
    }

    @Override // com.huami.device.feature.health.init.HealthInitConfig
    @NotNull
    public IAppRes getAppRes() {
        return this.appRes;
    }

    @Override // com.huami.device.feature.health.init.HealthInitConfig
    @NotNull
    public HealthDevice getDevice() {
        return this.device;
    }

    @Override // com.huami.device.feature.health.init.HealthInitConfig
    /* JADX INFO: renamed from: isDebug, reason: from getter */
    public boolean getIsDebug() {
        return this.isDebug;
    }
}
