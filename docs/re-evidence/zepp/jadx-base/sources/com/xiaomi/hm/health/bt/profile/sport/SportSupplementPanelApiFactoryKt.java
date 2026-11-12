package com.xiaomi.hm.health.bt.profile.sport;

import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "Ljava/util/UUID;", "serviceUUID", "characteristicUUID", "", "hasCharacteristic", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SportSupplementPanelApiFactoryKt {
    public static final boolean hasCharacteristic(@NotNull GattPeripheral gattPeripheral, @NotNull UUID uuid, @NotNull UUID uuid2) {
        BluetoothGattService service = gattPeripheral.getService(uuid);
        return (service == null ? null : service.getCharacteristic(uuid2)) != null;
    }
}
