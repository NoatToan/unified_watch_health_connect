package com.xiaomi.fitness.device.manager.extensions;

import android.bluetooth.BluetoothDevice;
import defpackage.s33;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000*D\u0010\u0003\"\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¨\u0006\n"}, d2 = {"isPaired", "", "", "OnDeviceChange", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ParameterName;", "name", "deviceModel", "", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceOptionExtKt {
    public static final boolean isPaired(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Set<BluetoothDevice> setB = s33.b();
        if (setB == null) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : setB) {
            if (bluetoothDevice != null && bluetoothDevice.getAddress() != null && Intrinsics.areEqual(bluetoothDevice.getAddress(), str)) {
                return true;
            }
        }
        return false;
    }
}
