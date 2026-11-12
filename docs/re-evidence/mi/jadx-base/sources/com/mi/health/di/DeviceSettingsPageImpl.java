package com.mi.health.di;

import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsPageInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/mi/health/di/DeviceSettingsPageImpl;", "Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsPageInterface;", "<init>", "()V", "toWearOsLicensePage", "", "context", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingsPageImpl implements DeviceSettingsPageInterface {
    @Override // com.xiaomi.fitness.devicesettings.di.DeviceSettingsPageInterface
    public void toWearOsLicensePage(@NotNull BaseFragment context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
