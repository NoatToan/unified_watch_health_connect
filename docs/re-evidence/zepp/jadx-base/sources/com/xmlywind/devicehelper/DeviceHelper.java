package com.xmlywind.devicehelper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.xmlywind.devicehelper.oaId.helpers.DevicesIDsHelper;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public final class DeviceHelper {
    private static String a = null;
    private static String b = null;
    private static String c = "";
    private static Handler d = null;
    private static Handler e = null;
    private static int f = 0;
    private static boolean g = false;
    private static long h;
    private static long i;
    private static long j;
    private static String k;

    @SuppressLint({"MissingPermission"})
    public static String getIMEI(Context context) {
        String deviceId;
        String deviceId2 = null;
        try {
            SigmobLog.d("private :getIMEI");
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                deviceId = telephonyManager.getImei();
                if (TextUtils.isEmpty(deviceId)) {
                    try {
                        deviceId2 = telephonyManager.getDeviceId();
                        return deviceId2;
                    } catch (Throwable unused) {
                        return telephonyManager.getMeid();
                    }
                }
            } else {
                deviceId = telephonyManager.getDeviceId();
            }
            if (deviceId == null) {
                return null;
            }
            return deviceId;
        } catch (Exception unused2) {
            return deviceId2;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String getIMEI(Context context, int i2) {
        String deviceId;
        String deviceId2 = null;
        try {
            SigmobLog.d("private :getIMEI " + i2);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                deviceId = telephonyManager.getImei(i2);
                if (TextUtils.isEmpty(deviceId)) {
                    try {
                        deviceId2 = telephonyManager.getDeviceId(i2);
                        return deviceId2;
                    } catch (Throwable unused) {
                        return telephonyManager.getMeid(i2);
                    }
                }
            } else {
                deviceId = telephonyManager.getDeviceId();
            }
            if (deviceId == null) {
                return null;
            }
            return deviceId;
        } catch (Exception unused2) {
            return deviceId2;
        }
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String getIMSI(Context context) {
        return null;
    }

    public static String getMacAddress() {
        return "";
    }

    public static String getOAID(final Context context) {
        if (TextUtils.isEmpty(a)) {
            if (d == null) {
                d = new Handler(Looper.getMainLooper());
            }
            d.post(new Runnable() { // from class: com.xmlywind.devicehelper.DeviceHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DevicesIDsHelper.b(context, new DevicesIDsHelper.AppIdsUpdater() { // from class: com.xmlywind.devicehelper.DeviceHelper.2.1
                            @Override // com.xmlywind.devicehelper.oaId.helpers.DevicesIDsHelper.AppIdsUpdater
                            public void OnIdsAvalid(String str) {
                                if (!TextUtils.isEmpty(str)) {
                                    String unused = DeviceHelper.a = str;
                                }
                                if (DeviceHelper.d != null) {
                                    DeviceHelper.d.removeCallbacksAndMessages(null);
                                    Handler unused2 = DeviceHelper.d = null;
                                }
                            }
                        });
                    } catch (Exception e2) {
                        SigmobLog.e(e2.getMessage());
                    }
                }
            });
        }
        return a;
    }

    public static String getOAID_API(final Context context) {
        if (TextUtils.isEmpty(c)) {
            if (e == null) {
                e = new Handler(Looper.getMainLooper());
            }
            int i2 = f;
            if (i2 > 10 || g) {
                return "";
            }
            f = i2 + 1;
            g = true;
            e.post(new Runnable() { // from class: com.xmlywind.devicehelper.DeviceHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        new DevicesIDsHelper().a(context, new DevicesIDsHelper.AppIdsUpdater() { // from class: com.xmlywind.devicehelper.DeviceHelper.1.1
                            @Override // com.xmlywind.devicehelper.oaId.helpers.DevicesIDsHelper.AppIdsUpdater
                            public void OnIdsAvalid(String str) {
                                boolean unused = DeviceHelper.g = false;
                                if (!TextUtils.isEmpty(str)) {
                                    String unused2 = DeviceHelper.c = str;
                                }
                                Log.d("oaid", "oaid_src: " + str);
                                if (DeviceHelper.e != null) {
                                    DeviceHelper.e.removeCallbacksAndMessages(null);
                                    Handler unused3 = DeviceHelper.e = null;
                                }
                            }
                        });
                    } catch (Exception e2) {
                        SigmobLog.e(e2.getMessage());
                    }
                }
            });
        }
        return c;
    }

    public static String getVAID() {
        return b;
    }

    @SuppressLint({"MissingPermission"})
    public static String getWifiName(Context context) {
        return k;
    }

    @SuppressLint({"MissingPermission"})
    public static String getWifimac(Context context) {
        return "";
    }

    public static boolean isCanRetryIMEI() {
        boolean z = System.currentTimeMillis() - h > 30000;
        if (z) {
            h = System.currentTimeMillis();
        }
        SigmobLog.d("isCanRetryIMEI status " + z);
        return z;
    }

    public static boolean isCanRetryLocation() {
        boolean z = System.currentTimeMillis() - i > 36000;
        if (z) {
            i = System.currentTimeMillis();
        }
        SigmobLog.d("isCanRetryLocation status " + z);
        return z;
    }

    public static boolean isCanRetryWIFI() {
        boolean z = System.currentTimeMillis() - j > 30000;
        if (z) {
            j = System.currentTimeMillis();
        }
        SigmobLog.d("isCanRetryWIFI status " + z);
        return z;
    }

    public static boolean isCanUseLocation(Context context) {
        boolean z = context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        SigmobLog.d("isCanUseLocation status " + z);
        return z;
    }

    public static boolean isCanUsePhoneState(Context context) {
        boolean z = context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
        SigmobLog.d("isCanUsePhoneState status " + z);
        return z;
    }

    public static boolean isCanUseWifiState(Context context) {
        boolean z = context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0;
        SigmobLog.d("isCanUseWifiState status " + z);
        return z;
    }

    public static boolean isCanUseWriteExternal(Context context) {
        boolean z = context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        SigmobLog.d("isCanUseWriteExternal status " + z);
        return z;
    }

    public static void resetRetryIMEI() {
        h = 0L;
    }
}
