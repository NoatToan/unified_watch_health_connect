package com.xiaomi.fit.eco.device.connect;

import com.xiaomi.fitness.device.manager.export.DeviceConnector;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.asc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/eco/device/connect/EcoBaseConnector;", "Lcom/xiaomi/fitness/device/manager/export/DeviceConnector;", "", "disconnect", "()V", BroadcastsKt.SILENT_PUSHING_CANCEL, "Lasc;", "mApiCall", "Lasc;", "getMApiCall", "()Lasc;", "<init>", "(Lasc;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoBaseConnector implements DeviceConnector {

    @NotNull
    private final asc mApiCall;

    public EcoBaseConnector(@NotNull asc mApiCall) {
        Intrinsics.checkNotNullParameter(mApiCall, "mApiCall");
        this.mApiCall = mApiCall;
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceConnector
    public void cancel() {
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceConnector
    public void disconnect() {
    }

    @NotNull
    public final asc getMApiCall() {
        return this.mApiCall;
    }
}
