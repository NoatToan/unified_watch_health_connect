package com.xiaomi.hm.health.device.headset;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/PairedDevice;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroid/bluetooth/BluetoothDevice;", "b", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "device", "<init>", "(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PairedDevice {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BluetoothDevice device;

    public PairedDevice(@Nullable String str, @NotNull BluetoothDevice bluetoothDevice) {
        this.name = str;
        this.device = bluetoothDevice;
    }

    @NotNull
    public final BluetoothDevice getDevice() {
        return this.device;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }
}
