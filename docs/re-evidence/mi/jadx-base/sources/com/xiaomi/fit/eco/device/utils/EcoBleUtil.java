package com.xiaomi.fit.eco.device.utils;

import android.bluetooth.BluetoothAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fit/eco/device/utils/EcoBleUtil;", "", "<init>", "()V", "discovery", "", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoBleUtil {

    @NotNull
    public static final EcoBleUtil INSTANCE = new EcoBleUtil();

    private EcoBleUtil() {
    }

    public final void discovery() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            if (defaultAdapter.startDiscovery()) {
                defaultAdapter.cancelDiscovery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
