package com.xiaomi.fit.device.utils;

import android.bluetooth.BluetoothAdapter;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.ni4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/device/utils/BleUtil;", "", "<init>", "()V", "discovery", "", "stopDiscovery", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleUtil {

    @NotNull
    public static final BleUtil INSTANCE = new BleUtil();

    private BleUtil() {
    }

    public final void discovery() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_SCAN") == 0 && defaultAdapter.startDiscovery()) {
                defaultAdapter.cancelDiscovery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void stopDiscovery() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_SCAN") == 0 && defaultAdapter.isDiscovering()) {
                defaultAdapter.cancelDiscovery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
