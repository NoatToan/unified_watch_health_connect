package com.xiaomi.fitness.device.model.api;

import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "<init>", "()V", "getDeviceInfoList", "", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductManagerInternal extends WearableProductManager {
    @NotNull
    public abstract List<DeviceInfo> getDeviceInfoList();
}
