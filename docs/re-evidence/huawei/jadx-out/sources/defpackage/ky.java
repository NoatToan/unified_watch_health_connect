package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.alipay.sdk.m.d0.f;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.network.embedded.c0;
import com.huawei.operation.utils.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ky f39612a = new ky();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f39613b;

    public final String u() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        String[] strArrSplit;
        String strTrim = "";
        FileReader fileReader = null;
        BufferedReader bufferedReader3 = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!kj.c(line) && (strArrSplit = line.split(":")) != null && strArrSplit.length > 1 && strArrSplit[0].contains("BogoMIPS")) {
                            strTrim = strArrSplit[1].trim();
                            break;
                        }
                    } catch (Throwable unused) {
                        bufferedReader3 = bufferedReader2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bufferedReader != null) {
                            bufferedReader2 = bufferedReader;
                        }
                        return strTrim;
                    }
                }
                try {
                    fileReader2.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader2.close();
        } catch (Throwable unused6) {
        }
        return strTrim;
    }

    public final String s() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    if (!kj.c(line)) {
                        String strTrim = line.trim();
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            fileReader.close();
                        } catch (Throwable unused2) {
                        }
                        return strTrim;
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            fileReader = null;
        }
        try {
            fileReader.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    public String q() {
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put(SystemUtils.PRODUCT_BRAND, "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String strA = kj.a(str, "");
            sb.append((strA == null || !strA.contains(str2)) ? '0' : '1');
        }
        return sb.toString();
    }

    public String r() {
        char c2;
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put(Constants.HOME_TAB_DEVICE, "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                c2 = (lowerCase == null || !lowerCase.contains(str3)) ? '0' : '1';
            } catch (Throwable unused) {
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public String r(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(null, intentFilter, 2) : context.registerReceiver(null, intentFilter);
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
            boolean z = intExtra2 == 2 || intExtra2 == 5;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "1" : "0");
            sb.append(":");
            sb.append(intExtra);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String p() {
        LineNumberReader lineNumberReader;
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        for (String str : linkedHashMap.keySet()) {
            char c2 = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String line = lineNumberReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c2 = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader != null) {
                        }
                    }
                }
                sb.append(c2);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    public String p(Context context) {
        long jLastModified;
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long jMax = 0;
            for (int i = 0; i < 5; i++) {
                try {
                    jLastModified = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                    jLastModified = -1;
                }
                jMax = Math.max(jLastModified, jMax);
            }
            return "1:" + jMax;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String t() {
        StringBuilder sb = new StringBuilder("00:");
        try {
            Class.forName(new String[]{"dalvik.system.Taint"}[0]);
            sb.append("1");
        } catch (Throwable unused) {
            sb.append("0");
        }
        return sb.toString();
    }

    public String l(Context context) {
        String strB = lb.b(c0.h);
        if (strB != null) {
            return strB;
        }
        if (this.f39613b.isBackgroundRunning()) {
            return "";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements() && strB == null) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        strB = inetAddressNextElement.getHostAddress().toString();
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String str = strB != null ? strB : "";
        lb.b(c0.h, str);
        return str;
    }

    public String k() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00:");
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String m() {
        try {
            return SystemClock.elapsedRealtime() + "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String k(Context context) {
        try {
            String strA = a(context);
            String strL = l(context);
            if (!kj.e(strA) || !kj.e(strL)) {
                return "";
            }
            return strA + ":" + l(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String n() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            return "" + (jCurrentTimeMillis - (jCurrentTimeMillis % 1000));
        } catch (Throwable unused) {
            return "";
        }
    }

    public String n(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String l() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = "";
        }
        return displayName == null ? "" : displayName;
    }

    public String o(Context context) {
        synchronized (this) {
            String androidId = this.f39613b.getAndroidId();
            if (androidId != null) {
                return androidId;
            }
            String strB = lb.b("ANDROIDID");
            if (strB != null) {
                return strB;
            }
            if (this.f39613b.isBackgroundRunning()) {
                return "";
            }
            try {
                strB = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Throwable unused) {
            }
            if (strB == null) {
                strB = "";
            }
            lb.b("ANDROIDID", strB);
            return strB;
        }
    }

    public String o() {
        String string;
        try {
            string = Locale.getDefault().toString();
        } catch (Throwable unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public String m(Context context) {
        synchronized (this) {
            String strB = lb.b("SimSerial");
            if (strB != null) {
                return strB;
            }
            if (!this.f39613b.isBackgroundRunning() && !b(context, "android.permission.READ_PHONE_STATE")) {
                lb.b("SimSerial", strB);
                return strB;
            }
            return "";
        }
    }

    public String h() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public String h(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String f() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return "" + blockSize;
    }

    public String g(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String i() {
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            blockCount = 0;
        }
        return "" + blockCount;
    }

    public String j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String j() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        long j = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader3 = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/meminfo");
            try {
                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    j = line != null ? Integer.parseInt(line.split("\\s+")[1]) : 0L;
                    try {
                        fileReader2.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    bufferedReader3 = bufferedReader2;
                    bufferedReader = bufferedReader3;
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader2 = bufferedReader;
                    }
                    return "" + j;
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader2.close();
        } catch (Throwable unused6) {
        }
        return "" + j;
    }

    public String i(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public String g() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        FileReader fileReader = null;
        BufferedReader bufferedReader3 = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader2 = new BufferedReader(fileReader2);
                try {
                    String[] strArrSplit = bufferedReader2.readLine().split(":\\s+", 2);
                    if (strArrSplit != null && strArrSplit.length > 1) {
                        String str = strArrSplit[1];
                        try {
                            fileReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                        return str;
                    }
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedReader3 = bufferedReader2;
                    bufferedReader = bufferedReader3;
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader2 = bufferedReader;
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            bufferedReader = null;
        }
        try {
            bufferedReader2.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    public String f(Context context) {
        List<Sensor> sensorList;
        String strA;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0) {
                    strA = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    strA = kj.a(sb.toString());
                }
            } catch (Throwable unused) {
            }
        } else {
            strA = null;
        }
        return strA == null ? "" : strA;
    }

    public String e() {
        String strS = s();
        return !kj.c(strS) ? strS : u();
    }

    public String e(Context context) {
        synchronized (this) {
            String strB = lb.b("NetworkOperatorName");
            if (strB != null) {
                return strB;
            }
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        strB = telephonyManager.getNetworkOperatorName();
                    }
                } catch (Throwable unused) {
                }
            }
            if (strB == null || Constants.NULL.equals(strB)) {
                strB = "";
            }
            lb.b("NetworkOperatorName", strB);
            return strB;
        }
    }

    public String b() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new la(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public String c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", "" + i);
            jSONObject.put(NotificationCompat.CATEGORY_CALL, "" + streamVolume);
            jSONObject.put("system", "" + streamVolume2);
            jSONObject.put("ring", "" + streamVolume3);
            jSONObject.put("music", "" + streamVolume4);
            jSONObject.put(NotificationCompat.CATEGORY_ALARM, "" + streamVolume5);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public String a() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        String strTrim = "0000000000000000";
        LineNumberReader lineNumberReader = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/cpuinfo"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    LineNumberReader lineNumberReader2 = new LineNumberReader(inputStreamReader);
                    for (int i = 1; i < 100; i++) {
                        try {
                            String line = lineNumberReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.indexOf("Serial") > -1) {
                                strTrim = line.substring(line.indexOf(":") + 1, line.length()).trim();
                                break;
                            }
                        } catch (Throwable unused) {
                            lineNumberReader = lineNumberReader2;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            if (strTrim == null) {
                                return "";
                            }
                            return strTrim;
                        }
                    }
                    try {
                        lineNumberReader2.close();
                    } catch (Throwable unused4) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused5) {
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
                inputStreamReader = null;
            }
        } catch (Throwable unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused9) {
        }
        if (strTrim == null) {
            return "";
        }
        return strTrim;
    }

    public String b(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1 ? "1" : "0";
        } catch (Throwable unused) {
        }
    }

    public String d() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return "" + blockSize;
    }

    public String d(Context context) {
        synchronized (this) {
            String subscriberId = this.f39613b.getSubscriberId();
            if (subscriberId != null) {
                return subscriberId;
            }
            String strB = lb.b("imsi");
            if (strB != null) {
                return strB;
            }
            if (this.f39613b.isBackgroundRunning() || b(context, "android.permission.READ_PHONE_STATE")) {
                return "";
            }
            if (strB == null) {
                strB = "";
            }
            lb.b("imsi", strB);
            return strB;
        }
    }

    public String c() {
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            availableBlocks = 0;
        }
        return "" + availableBlocks;
    }

    public static String a(Context context) {
        if (b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return WifiDeviceUtils.NETWORKINFO_TYPE_NAME;
            }
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) {
                    return "2G";
                }
                if (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) {
                    return "3G";
                }
                return subtype == 13 ? "4G" : "UNKNOW";
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean e(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean b(Context context, String str) {
        return !e(context, str);
    }

    public static ky c(f fVar) {
        ky kyVar = f39612a;
        kyVar.f39613b = fVar;
        return kyVar;
    }
}
