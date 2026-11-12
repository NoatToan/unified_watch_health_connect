package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes5.dex */
public class nq2 {
    public static String a(String str) {
        Bundle bundle = new Bundle();
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).getBluetoothCache(str, 4, bundle);
        return bundle.getString(IBluetoothService.EXTRA_RESULT, "");
    }

    public static void b(String str) {
        BluetoothMyLogger.d("BleCacheUtils, remove PropToken ,Ltmk, pincode ...");
        g(str, "");
        c(str, "");
        e(str, "");
        d(str, 0);
        f(str, true);
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            BluetoothMyLogger.e(String.format("setPropLtmk mac null", new Object[0]));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(IBluetoothService.EXTRA_VALUE, str2);
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).setBluetoothCache(str, 19, bundle);
    }

    public static void d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            BluetoothMyLogger.e(String.format("setPropLtmkEncryptType mac null", new Object[0]));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(IBluetoothService.EXTRA_VALUE, i);
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).setBluetoothCache(str, 22, bundle);
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            BluetoothMyLogger.e(String.format("setPropPincode mac null", new Object[0]));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(IBluetoothService.EXTRA_VALUE, str2);
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).setBluetoothCache(str, 21, bundle);
    }

    public static void f(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            BluetoothMyLogger.e(String.format("setPropShowPincode mac null", new Object[0]));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(IBluetoothService.EXTRA_VALUE, z);
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).setBluetoothCache(str, 23, bundle);
    }

    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            BluetoothMyLogger.e("BleCacheUtil set prop mac is empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            BluetoothMyLogger.e("BleCacheUtil set prop token empty");
        }
        Bundle bundle = new Bundle();
        bundle.putString(IBluetoothService.EXTRA_VALUE, str2);
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).setBluetoothCache(str, 6, bundle);
    }
}
