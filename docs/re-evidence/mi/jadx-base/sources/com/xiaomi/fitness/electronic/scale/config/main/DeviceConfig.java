package com.xiaomi.fitness.electronic.scale.config.main;

import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/config/main/DeviceConfig;", "", "toWifiInfo", "", "baseActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "did", "", "unbindDevice", LifecycleConstantKt.TYPE_ACTIVITY, "unbindCallback", "Lcom/xiaomi/fitness/electronic/scale/config/main/UnbindDeviceCallback;", "getMainIcon", "", "model", "getMainTitle", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceConfig {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void unbindDevice$default(DeviceConfig deviceConfig, BaseActivity baseActivity, String str, UnbindDeviceCallback unbindDeviceCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unbindDevice");
            }
            if ((i & 4) != 0) {
                unbindDeviceCallback = null;
            }
            deviceConfig.unbindDevice(baseActivity, str, unbindDeviceCallback);
        }
    }

    int getMainIcon(@NotNull String model);

    int getMainTitle(@NotNull String model);

    void toWifiInfo(@NotNull BaseActivity baseActivity, @NotNull String did);

    void unbindDevice(@NotNull BaseActivity activity, @NotNull String did, @Nullable UnbindDeviceCallback unbindCallback);
}
