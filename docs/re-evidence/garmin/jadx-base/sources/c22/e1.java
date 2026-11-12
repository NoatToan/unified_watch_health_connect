package c22;

import android.bluetooth.BluetoothAdapter;

/* JADX INFO: loaded from: classes10.dex */
public class e1 {

    public enum a {
        ADAPTER_NULL,
        /* JADX INFO: Fake field, exist only in values array */
        ANDROID_API_LEVEL_TOO_LOW,
        SYSTEM_FEATURE_NULL
    }

    public static boolean a() {
        return BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }
}
