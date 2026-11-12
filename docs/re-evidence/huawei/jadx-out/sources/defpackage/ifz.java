package defpackage;

import android.bluetooth.BluetoothAdapter;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;

/* JADX INFO: loaded from: classes.dex */
public final class ifz {
    public static boolean d() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "FitnessDeviceUtils"), 41);
    }

    public static boolean b() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "FitnessDeviceUtils"), 40);
    }

    public static boolean a() {
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
        return false;
    }

    public static boolean e() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "FitnessDeviceUtils"), 169);
    }

    public static boolean c() {
        return d() || e();
    }

    public static boolean h() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "FitnessDeviceUtils"), 295);
    }
}
