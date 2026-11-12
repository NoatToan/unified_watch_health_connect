package com.baseflow.permissionhandler;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;

/* JADX INFO: loaded from: classes2.dex */
final class o {

    @FunctionalInterface
    public interface a {
        void onSuccess(int i);
    }

    private boolean b(Context context) {
        return Build.VERSION.SDK_INT < 18 ? BluetoothAdapter.getDefaultAdapter().isEnabled() : ((BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH)).getAdapter().isEnabled();
    }

    private static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return false;
        }
        return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
    }

    private boolean d(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return i >= 19 ? e(context) : c(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    private static boolean e(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void a(int i, Context context, a aVar, b bVar) {
        if (context == null) {
            Log.d(m.a, "Context cannot be null.");
            bVar.onError("PermissionHandler.ServiceManager", "Android context cannot be null.");
            return;
        }
        if (i == 3 || i == 4 || i == 5) {
            aVar.onSuccess(d(context) ? 1 : 0);
            return;
        }
        if (i == 21) {
            aVar.onSuccess(b(context) ? 1 : 0);
        }
        if (i != 8) {
            if (i == 16) {
                aVar.onSuccess(Build.VERSION.SDK_INT < 23 ? 2 : 1);
                return;
            } else {
                aVar.onSuccess(2);
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
            aVar.onSuccess(2);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
            aVar.onSuccess(2);
            return;
        }
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
            aVar.onSuccess(2);
        } else if (telephonyManager.getSimState() != 5) {
            aVar.onSuccess(0);
        } else {
            aVar.onSuccess(1);
        }
    }
}
