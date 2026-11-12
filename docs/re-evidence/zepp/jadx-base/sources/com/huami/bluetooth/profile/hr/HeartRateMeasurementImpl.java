package com.huami.bluetooth.profile.hr;

import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateMeasurementImpl;", "Lcom/huami/bluetooth/profile/hr/HeartRateMeasurement;", "", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerCallback", "unregisterCallback", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "a", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateMeasurementImpl implements HeartRateMeasurement {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    public HeartRateMeasurementImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this.characteristic = bluetoothCharacteristic;
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateMeasurement
    public boolean deInit() {
        return this.characteristic.deInit();
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateMeasurement
    public boolean init() {
        return this.characteristic.init();
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateMeasurement
    public boolean registerCallback(@NotNull DataCallback callback) {
        return this.characteristic.registerNotification(callback);
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateMeasurement
    public boolean unregisterCallback() {
        return this.characteristic.unregisterNotification();
    }
}
