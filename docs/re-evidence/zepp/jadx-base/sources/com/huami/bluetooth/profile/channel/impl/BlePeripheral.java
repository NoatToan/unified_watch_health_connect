package com.huami.bluetooth.profile.channel.impl;

import com.huami.bluetooth.profile.channel.PeripheralPattern;
import com.huami.bluetooth.profile.channel.model.ChannelTransferMethod;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/impl/BlePeripheral;", "Lcom/huami/bluetooth/profile/channel/PeripheralPattern;", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "Lcom/huami/bluetooth/profile/channel/model/ChannelTransferMethod;", "transferMethod", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "getCharacteristic", "characteristic", "", Constant.h, "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendCommandWithResponse", "", "sendCommandWithNoResponse", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerNotification", "unregisterNotification", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "a", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "", "b", "Ljava/util/Map;", "cacheCharacteristic", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BlePeripheral implements PeripheralPattern {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<ChannelTransferMethod, BluetoothCharacteristic> cacheCharacteristic = new LinkedHashMap();

    public BlePeripheral(@NotNull GattPeripheral gattPeripheral) {
        this.gattPeripheral = gattPeripheral;
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    @NotNull
    public BluetoothCharacteristic getCharacteristic(@NotNull ChannelTransferMethod transferMethod) {
        BluetoothCharacteristic bluetoothCharacteristic = this.cacheCharacteristic.get(transferMethod);
        if (bluetoothCharacteristic != null) {
            return bluetoothCharacteristic;
        }
        HMBleBluetoothCharacteristic hMBleBluetoothCharacteristic = new HMBleBluetoothCharacteristic(this.gattPeripheral, HMBaseProfile.UUID_SERVICE_MILI_SERVICE, transferMethod.getUuid());
        this.cacheCharacteristic.put(transferMethod, hMBleBluetoothCharacteristic);
        return hMBleBluetoothCharacteristic;
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    @NotNull
    public Mtu getMtu() {
        return this.gattPeripheral.getMtu();
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    public boolean registerNotification(@NotNull BluetoothCharacteristic characteristic, @NotNull DataCallback callback) {
        return characteristic.registerNotification(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    public boolean sendCommandWithNoResponse(@NotNull BluetoothCharacteristic characteristic, @NotNull byte[] cmd) {
        return characteristic.sendCommandNoResponse(cmd);
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    @Nullable
    public HMNotifyResponse sendCommandWithResponse(@NotNull BluetoothCharacteristic characteristic, @NotNull byte[] cmd) {
        return characteristic.sendCommandWithResponse(cmd);
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    public boolean unregisterNotification(@NotNull BluetoothCharacteristic characteristic) {
        return characteristic.unregisterNotification();
    }
}
