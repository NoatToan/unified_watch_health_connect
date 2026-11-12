package com.sogou.map.loc;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.xiaomi.hm.health.bodyfat.manager.WeightSyncUtilsKt;
import com.xiaomi.hm.health.bt.HMBleConstant;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class j0 {
    private static Pattern a = Pattern.compile("^([0-9a-fA-F]{2}):([0-9a-fA-F]{2}):([0-9a-fA-F]{2}):([0-9a-fA-F]{2}):([0-9a-fA-F]{2}):([0-9a-fA-F]{2})$");
    private static final HashMap b = new HashMap();
    private static final DecimalFormat c;

    static {
        BitSet bitSet = new BitSet();
        int i = 11;
        int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 10, 11, 20};
        int i2 = 0;
        while (i2 < i) {
            bitSet.set(iArr[i2], true);
            i2++;
            i = 11;
        }
        b.put(Integer.valueOf(HMBleConstant.MAX_LATENCY_MIN), bitSet);
        BitSet bitSet2 = new BitSet();
        int[] iArr2 = new int[22];
        iArr2[1] = 1;
        iArr2[2] = 2;
        iArr2[3] = 3;
        iArr2[4] = 4;
        iArr2[5] = 5;
        iArr2[6] = 6;
        iArr2[7] = 7;
        iArr2[8] = 8;
        iArr2[9] = 9;
        iArr2[10] = 10;
        iArr2[i] = i;
        iArr2[12] = 12;
        iArr2[13] = 13;
        iArr2[14] = 14;
        iArr2[15] = 15;
        iArr2[16] = 16;
        iArr2[17] = 17;
        iArr2[18] = 18;
        iArr2[19] = 19;
        iArr2[20] = 22;
        iArr2[21] = 29;
        for (int i3 = 0; i3 < 22; i3++) {
            bitSet2.set(iArr2[i3], true);
        }
        b.put(454, bitSet2);
        BitSet bitSet3 = new BitSet();
        int[] iArr3 = {0, 1, 2, 3, 4, 5};
        for (int i4 = 0; i4 < 6; i4++) {
            bitSet3.set(iArr3[i4], true);
        }
        b.put(455, bitSet3);
        BitSet bitSet4 = new BitSet();
        int[] iArr4 = {1, 5, 6, 11, 88, 89, 92, 93, 97, 99};
        for (int i5 = 0; i5 < 10; i5++) {
            bitSet4.set(iArr4[i5], true);
        }
        b.put(466, bitSet4);
        c = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
    }

    public static TelephonyManager A(Context context) {
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception unused) {
            return null;
        }
    }

    public static WifiManager B(Context context) {
        try {
            return (WifiManager) context.getSystemService("wifi");
        } catch (Exception unused) {
            return null;
        }
    }

    public static ConnectivityManager C(Context context) {
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
            return null;
        }
    }

    private static String D(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (o(string)) {
                return null;
            }
            return "ad_" + string;
        } catch (Exception unused) {
            return null;
        }
    }

    public static double a(double d) {
        return Double.valueOf(c.format(d)).doubleValue();
    }

    public static long b() {
        return System.currentTimeMillis();
    }

    public static Handler c(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, 0);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static CellLocation d(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getCellLocation();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object e(Class cls, String str) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f(long j) {
        if (j == -1) {
            return null;
        }
        return new StringBuilder(Long.toHexString((j & WeightSyncUtilsKt.NO_OWNER_DATE_ID) | 281474976710656L)).deleteCharAt(0).insert(10, JsonLexerKt.COLON).insert(8, JsonLexerKt.COLON).insert(6, JsonLexerKt.COLON).insert(4, JsonLexerKt.COLON).insert(2, JsonLexerKt.COLON).toString();
    }

    public static String g(Context context) {
        try {
            if (n(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (!o(deviceId)) {
                    return deviceId;
                }
            }
        } catch (Exception unused) {
        }
        return D(context);
    }

    public static String h(TelephonyManager telephonyManager, Context context) {
        try {
            if (n(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = telephonyManager.getDeviceId();
                if (!o(deviceId)) {
                    return deviceId;
                }
            }
        } catch (Exception unused) {
        }
        return D(context);
    }

    public static void i(Handler handler) {
        if (handler == null || handler.getLooper() == null) {
            return;
        }
        handler.getLooper().quit();
    }

    public static void j(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    public static boolean k(int i) {
        return i != Integer.MAX_VALUE && i >= 0;
    }

    public static boolean l(int i, int i2) {
        return i >= 100 && i <= 999 && i2 >= 0 && i2 <= 999;
    }

    public static boolean m(int i, int i2, int i3) {
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE || i < 0 || i2 < 0 || i3 < 0) {
            return false;
        }
        return (i == 0 && i2 == 0 && i3 == 0) ? false : true;
    }

    private static boolean n(Context context, String str) {
        try {
            return Build.VERSION.SDK_INT < 23 || context.checkSelfPermission(str) == 0;
        } catch (Throwable unused) {
            r0.b("hasPermission READ_PHONE_STATE Exception");
            return false;
        }
    }

    public static boolean o(String str) {
        return str == null || "".equals(str) || str.matches("\\s+");
    }

    public static int p(Class cls, String str) {
        Object objE = e(cls, str);
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return -1;
    }

    public static long q() {
        return SystemClock.elapsedRealtime();
    }

    public static long r(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        return Long.parseLong(String.valueOf(matcher.group(1)) + matcher.group(2) + matcher.group(3) + matcher.group(4) + matcher.group(5) + matcher.group(6), 16);
    }

    public static LocationManager s(Context context) {
        try {
            return (LocationManager) context.getSystemService("location");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String t(TelephonyManager telephonyManager, Context context) {
        try {
            if (n(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getSubscriberId();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List u(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getNeighboringCellInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean v(int i, int i2) {
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE || i < 0 || i2 < 0) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        return (i == -1 && i2 == -1) ? false : true;
    }

    public static long w(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    public static SensorManager x(Context context) {
        try {
            return (SensorManager) context.getSystemService("sensor");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method y(Class cls, String str) {
        try {
            return cls.getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] z(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(UrlUtils.UTF8);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
