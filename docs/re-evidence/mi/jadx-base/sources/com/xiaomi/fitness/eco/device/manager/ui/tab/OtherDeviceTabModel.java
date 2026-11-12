package com.xiaomi.fitness.eco.device.manager.ui.tab;

import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderManager;
import com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderManagerExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "updateDevices", "", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtherDeviceTabModel extends BaseModel {

    @NotNull
    private static final String TAG = "OtherDeviceTabModel";

    public final void updateDevices() {
        OtherDeviceLoaderManagerExtKt.getInstance(OtherDeviceLoaderManager.INSTANCE).updateDevices();
    }
}
