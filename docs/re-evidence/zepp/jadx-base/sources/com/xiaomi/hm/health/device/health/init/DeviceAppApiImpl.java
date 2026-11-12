package com.xiaomi.hm.health.device.health.init;

import android.app.Activity;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/health/init/DeviceAppApiImpl;", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "", "key", "getUserProperty", "Landroid/app/Activity;", "activity", "url", "", "openWebActivity", "value", "saveUserProperty", "uploadUserProperty", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceAppApiImpl implements IDeviceAppApi {
    @Override // com.huami.device.feature.health.device.IDeviceAppApi
    @NotNull
    public String getUserProperty(@NotNull String key) {
        return HMPropertyUtil.getProperty(key, "");
    }

    @Override // com.huami.device.feature.health.device.IDeviceAppApi
    public void openWebActivity(@NotNull Activity activity, @NotNull String url) {
    }

    @Override // com.huami.device.feature.health.device.IDeviceAppApi
    public void saveUserProperty(@NotNull String key, @NotNull String value) {
        HMPropertyUtil.setProperty(key, value);
    }

    @Override // com.huami.device.feature.health.device.IDeviceAppApi
    public void uploadUserProperty(@NotNull String key) {
        HMPropertyUtil.postPropertisToServer(true);
    }
}
