package com.huami.bluetooth.profile.devicectrl;

import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/devicectrl/BleDeviceController;", "Lcom/huami/bluetooth/profile/devicectrl/DeviceController;", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/UUID;", "serviceUuid", "charUuid", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/UUID;Ljava/util/UUID;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class BleDeviceController extends DeviceController {
    public BleDeviceController(@NotNull GattPeripheral gattPeripheral, @NotNull UUID uuid, @NotNull UUID uuid2) {
        super(new HMBleBluetoothCharacteristic(gattPeripheral, uuid, uuid2));
    }
}
