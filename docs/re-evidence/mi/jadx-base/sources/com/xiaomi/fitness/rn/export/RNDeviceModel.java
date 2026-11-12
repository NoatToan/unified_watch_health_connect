package com.xiaomi.fitness.rn.export;

import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.bean.RNDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "device", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "getDevice", "()Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "isOwner", "", "()Z", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RNDeviceModel extends DeviceModel<RNDeviceInfo> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isOwner(@NotNull RNDeviceModel rNDeviceModel) {
            RNDevice device = rNDeviceModel.getDevice();
            if (device != null) {
                return device.getIsOwner();
            }
            return false;
        }
    }

    @Nullable
    RNDevice getDevice();

    boolean isOwner();
}
