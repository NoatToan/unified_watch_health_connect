package com.huami.bluetooth.profile.channel;

import com.huami.bluetooth.profile.channel.model.ChannelTransferMethod;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/PeripheralPattern;", "", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "Lcom/huami/bluetooth/profile/channel/model/ChannelTransferMethod;", "transferMethod", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "getCharacteristic", "characteristic", "", Constant.h, "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendCommandWithResponse", "", "sendCommandWithNoResponse", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerNotification", "unregisterNotification", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface PeripheralPattern {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean unregisterNotification(@NotNull PeripheralPattern peripheralPattern, @NotNull BluetoothCharacteristic bluetoothCharacteristic) {
            return true;
        }
    }

    @NotNull
    BluetoothCharacteristic getCharacteristic(@NotNull ChannelTransferMethod transferMethod);

    @NotNull
    Mtu getMtu();

    boolean registerNotification(@NotNull BluetoothCharacteristic characteristic, @NotNull DataCallback callback);

    boolean sendCommandWithNoResponse(@NotNull BluetoothCharacteristic characteristic, @NotNull byte[] cmd);

    @Nullable
    HMNotifyResponse sendCommandWithResponse(@NotNull BluetoothCharacteristic characteristic, @NotNull byte[] cmd);

    boolean unregisterNotification(@NotNull BluetoothCharacteristic characteristic);
}
