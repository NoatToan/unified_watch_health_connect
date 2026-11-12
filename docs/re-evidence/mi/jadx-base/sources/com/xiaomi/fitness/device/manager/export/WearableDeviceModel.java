package com.xiaomi.fitness.device.manager.export;

import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import defpackage.eu6;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J!\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/IConnectActive;", "Leu6;", "Lcom/xiaomi/fitness/device/manager/export/bean/WatchInfo;", "callback", "", "readWatchInfo", "(Leu6;)V", "device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public interface WearableDeviceModel extends DeviceModel<WearableDeviceInfo>, IConnectActive {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void readWatchInfo$default(WearableDeviceModel wearableDeviceModel, eu6 eu6Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readWatchInfo");
            }
            if ((i & 1) != 0) {
                eu6Var = null;
            }
            wearableDeviceModel.readWatchInfo(eu6Var);
        }
    }

    void readWatchInfo(@Nullable eu6<WatchInfo> callback);
}
