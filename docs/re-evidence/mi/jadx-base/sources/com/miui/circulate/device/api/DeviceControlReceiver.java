package com.miui.circulate.device.api;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'¨\u0006\b"}, d2 = {"Lcom/miui/circulate/device/api/DeviceControlReceiver;", "", "onDeviceChange", "", "data", "Lcom/miui/circulate/device/api/DeviceInfo;", "onDeviceListChange", "", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface DeviceControlReceiver {
    void onDeviceChange(@NotNull DeviceInfo data);

    void onDeviceListChange(@NotNull List<DeviceInfo> data);
}
