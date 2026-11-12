package com.xiaomi.fitness.sport_manager.receiver.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.x7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/data/DeviceDisconnectDataHandleImpl;", "Lcom/xiaomi/fitness/sport_manager/receiver/data/IDeviceDisconnectDataHandle;", "Lx7r;", "data", "", "onReceiveData", "(Lx7r;)V", "onDisconnect", "()V", "Lcom/xiaomi/fitness/sport_manager/receiver/data/DisconnectData;", "getDisConnectData", "()Lcom/xiaomi/fitness/sport_manager/receiver/data/DisconnectData;", CervicalMucusRecord.Appearance.CLEAR, "disconnectData", "Lcom/xiaomi/fitness/sport_manager/receiver/data/DisconnectData;", "deviceData", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceDisconnectDataHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDisconnectDataHandle.kt\ncom/xiaomi/fitness/sport_manager/receiver/data/DeviceDisconnectDataHandleImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class DeviceDisconnectDataHandleImpl implements IDeviceDisconnectDataHandle {

    @NotNull
    public static final String TAG = "DeviceDisconnectDataHandleImpl";

    @NotNull
    private final DisconnectData disconnectData = new DisconnectData(0, 0);

    @NotNull
    private DisconnectData deviceData = new DisconnectData(0, 0);

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDeviceDisconnectDataHandle
    public void clear() {
        FitnessLogUtils.i(TAG, CervicalMucusRecord.Appearance.CLEAR);
        this.deviceData.setStep(0);
        this.deviceData.setCal(0);
        this.disconnectData.setCal(0);
        this.disconnectData.setStep(0);
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDeviceDisconnectDataHandle
    @NotNull
    /* JADX INFO: renamed from: getDisConnectData, reason: from getter */
    public DisconnectData getDisconnectData() {
        return this.disconnectData;
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDeviceDisconnectDataHandle
    public void onDisconnect() {
        this.disconnectData.setStep(this.deviceData.getStep() + this.disconnectData.getStep());
        this.disconnectData.setCal(this.deviceData.getCal() + this.disconnectData.getCal());
        DisconnectData disconnectData = this.deviceData;
        disconnectData.setStep(0);
        disconnectData.setCal(0);
        FitnessLogUtils.i(TAG, "disconnectData:" + this.disconnectData);
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.data.IDeviceDisconnectDataHandle
    public void onReceiveData(@NotNull x7r data) {
        Intrinsics.checkNotNullParameter(data, "data");
        DisconnectData disconnectData = this.deviceData;
        int i = data.f38798b;
        DisconnectData disconnectData2 = i != 0 ? disconnectData : null;
        if (disconnectData2 != null) {
            disconnectData2.setStep(i);
        }
        int i2 = data.f38797a;
        if (i2 == 0) {
            disconnectData = null;
        }
        if (disconnectData != null) {
            disconnectData.setCal(i2);
        }
    }
}
