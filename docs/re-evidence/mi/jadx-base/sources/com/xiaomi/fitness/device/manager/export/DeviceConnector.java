package com.xiaomi.fitness.device.manager.export;

import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/DeviceConnector;", "", "connect", "", "disconnect", BroadcastsKt.SILENT_PUSHING_CANCEL, "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceConnector {
    void cancel();

    void connect();

    void disconnect();
}
