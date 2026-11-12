package com.xiaomi.fitness.device.model.api;

import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "<init>", "()V", "cancelBind", "", "mac", "", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WearableDeviceManagerWrapper extends WearableDeviceManager {
    public abstract void cancelBind(@NotNull String mac);
}
