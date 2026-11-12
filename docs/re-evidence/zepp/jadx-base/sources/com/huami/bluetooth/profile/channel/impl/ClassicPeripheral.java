package com.huami.bluetooth.profile.channel.impl;

import androidx.core.app.NotificationCompat;
import com.huami.bluetooth.profile.channel.PeripheralPattern;
import com.huami.bluetooth.profile.channel.model.ChannelTransferMethod;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.characteristic.HMClassicBluetoothCharacteristic;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R!\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/impl/ClassicPeripheral;", "Lcom/huami/bluetooth/profile/channel/PeripheralPattern;", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "Lcom/huami/bluetooth/profile/channel/model/ChannelTransferMethod;", "transferMethod", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "getCharacteristic", "characteristic", "", Constant.h, "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendCommandWithResponse", "", "sendCommandWithNoResponse", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerNotification", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", "a", "Lkotlin/jvm/functions/Function0;", "getTransport", "()Lkotlin/jvm/functions/Function0;", NotificationCompat.CATEGORY_TRANSPORT, "", "b", "Ljava/util/Map;", "cacheCharacteristic", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ClassicPeripheral implements PeripheralPattern {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<ITransport> transport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<ChannelTransferMethod, BluetoothCharacteristic> cacheCharacteristic = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public ClassicPeripheral(@NotNull Function0<? extends ITransport> function0) {
        this.transport = function0;
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    @NotNull
    public BluetoothCharacteristic getCharacteristic(@NotNull ChannelTransferMethod transferMethod) {
        BluetoothCharacteristic bluetoothCharacteristic = this.cacheCharacteristic.get(transferMethod);
        if (bluetoothCharacteristic != null) {
            return bluetoothCharacteristic;
        }
        HMClassicBluetoothCharacteristic hMClassicBluetoothCharacteristic = new HMClassicBluetoothCharacteristic(transferMethod.getProtocol(), this.transport);
        this.cacheCharacteristic.put(transferMethod, hMClassicBluetoothCharacteristic);
        return hMClassicBluetoothCharacteristic;
    }

    @Override // com.huami.bluetooth.profile.channel.PeripheralPattern
    @NotNull
    public Mtu getMtu() {
        return new Mtu(512);
    }

    @NotNull
    public final Function0<ITransport> getTransport() {
        return this.transport;
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
    public boolean unregisterNotification(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        return PeripheralPattern.DefaultImpls.unregisterNotification(this, bluetoothCharacteristic);
    }
}
