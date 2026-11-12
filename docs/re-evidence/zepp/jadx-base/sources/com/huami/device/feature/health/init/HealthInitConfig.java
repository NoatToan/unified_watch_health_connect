package com.huami.device.feature.health.init;

import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.device.feature.health.res.IAppRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/huami/device/feature/health/init/HealthInitConfig;", "", "Lcom/huami/device/feature/health/device/HealthDevice;", "getDevice", "()Lcom/huami/device/feature/health/device/HealthDevice;", "device", "", "isDebug", "()Z", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "getAppApi", "()Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", "Lcom/huami/device/feature/health/res/IAppRes;", "getAppRes", "()Lcom/huami/device/feature/health/res/IAppRes;", "appRes", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public interface HealthInitConfig {
    @NotNull
    IDeviceAppApi getAppApi();

    @NotNull
    IAppRes getAppRes();

    @NotNull
    HealthDevice getDevice();

    boolean isDebug();
}
