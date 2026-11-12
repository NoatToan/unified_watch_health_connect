package com.xiaomi.fitness.device.manager;

import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.device.manager.export.TempManager;
import com.xiaomi.fitness.device.manager.extensions.DeviceWebUrlsKt;
import com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/TempManagerImpl;", "Lcom/xiaomi/fitness/device/manager/export/TempManager;", "<init>", "()V", "newGuideOpenKeepAliveSettingFragment", "Landroidx/fragment/app/Fragment;", "getGuideUrl", "", "model", "isSupportOs2", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TempManagerImpl implements TempManager {
    @Override // com.xiaomi.fitness.device.manager.export.TempManager
    @NotNull
    public String getGuideUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return DeviceWebUrlsKt.getUserGuideUrl(model);
    }

    @Override // com.xiaomi.fitness.device.manager.export.TempManager
    public boolean isSupportOs2() {
        return DevicePreference.INSTANCE.getLYRA_ENABLED();
    }

    @Override // com.xiaomi.fitness.device.manager.export.TempManager
    @NotNull
    public Fragment newGuideOpenKeepAliveSettingFragment() {
        return new GuideOpenKeepAliveSettingFragment();
    }
}
