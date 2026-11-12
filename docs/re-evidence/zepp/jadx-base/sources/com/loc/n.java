package com.loc;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import com.huami.watch.ota.UpdateUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes18.dex */
public final class n {
    public static String a = "";
    public static String b = "";
    public static volatile boolean c = true;
    public static boolean d = false;
    public static String e = "";
    public static boolean f = false;
    public static a g = null;
    public static int h = -1;
    public static String i = "";
    public static String j = "";
    private static String k = null;
    private static boolean l = false;
    private static volatile boolean m = false;
    private static String n = "";
    private static boolean o = false;
    private static String p = "";
    private static String q = "";
    private static String r = "";
    private static String s = "";
    private static String t = "";
    private static String u = "";
    private static boolean v = false;
    private static long w = 0;
    private static int x = 0;
    private static String y = null;
    private static String z = "";

    public interface a {
        au a();

        String b();

        String c();

        String d();
    }

    public static class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(com.alipay.sdk.m.c.b.a);
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String unused = n.n = parcelObtain2.readString();
            } catch (Throwable th) {
                try {
                    n.g();
                    y.a(th, "oa", "hwtr");
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static int A(Context context) {
        int i2 = x;
        if (i2 != 0) {
            return i2;
        }
        int iIntValue = 0;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            iIntValue = (int) (memoryInfo.totalMem / 1024);
        } else {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File("/proc/meminfo")));
                    try {
                        iIntValue = Integer.valueOf(bufferedReader2.readLine().split("\\s+")[1]).intValue();
                        bufferedReader2.close();
                    } catch (Throwable unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        int i3 = iIntValue / 1024;
                        x = i3;
                        return i3;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable unused3) {
            }
        }
        int i4 = iIntValue / 1024;
        x = i4;
        return i4;
    }

    public static String B(Context context) {
        try {
            return G(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String D(Context context) {
        FileInputStream fileInputStream = null;
        try {
            if (u.a(context, "android.permission.READ_EXTERNAL_STORAGE") && "mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.UTSystemConfig/Global/Alvin2.xml");
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    xmlPullParserNewPullParser.setInput(fileInputStream2, "utf-8");
                    boolean z2 = false;
                    for (int eventType = xmlPullParserNewPullParser.getEventType(); 1 != eventType; eventType = xmlPullParserNewPullParser.next()) {
                        if (eventType != 2) {
                            if (eventType == 3) {
                                z2 = false;
                            } else if (eventType == 4 && z2) {
                                String text = xmlPullParserNewPullParser.getText();
                                try {
                                    fileInputStream2.close();
                                } catch (Throwable unused) {
                                }
                                return text;
                            }
                        } else if (xmlPullParserNewPullParser.getAttributeCount() > 0) {
                            int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                            for (int i2 = 0; i2 < attributeCount; i2++) {
                                String attributeValue = xmlPullParserNewPullParser.getAttributeValue(i2);
                                if ("UTDID2".equals(attributeValue) || "UTDID".equals(attributeValue)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    fileInputStream = fileInputStream2;
                } catch (Throwable unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream == null) {
                        return "";
                    }
                }
            }
            if (fileInputStream == null) {
                return "";
            }
        } catch (Throwable unused3) {
        }
        try {
            fileInputStream.close();
            return "";
        } catch (Throwable unused4) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String E(Context context) {
        String strC = u.c("IeGlhb21p");
        String str = Build.MANUFACTURER;
        int i2 = 0;
        if (strC.equalsIgnoreCase(str)) {
            try {
                Class<?> cls = Class.forName(u.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
                Object objInvoke = cls.getMethod(u.c("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
                if (objInvoke != null) {
                    String str2 = (String) objInvoke;
                    n = str2;
                    return str2;
                }
            } catch (Throwable unused) {
                o = true;
            }
            return n;
        }
        if (u.c("IaHVhd2Vp").equalsIgnoreCase(str)) {
            try {
                Intent intent = new Intent();
                intent.setAction(u.c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(u.c("UY29tLmh1YXdlaS5od2lk"));
                b bVar = new b();
                if (context.bindService(intent, bVar, 1)) {
                    while (i2 < 100 && TextUtils.isEmpty(n)) {
                        i2++;
                        Thread.sleep(15L);
                    }
                    context.unbindService(bVar);
                }
                return n;
            } catch (Throwable th) {
                y.a(th, "oa", "hw");
            }
        } else {
            "OPPO".equalsIgnoreCase(str);
        }
        o = true;
        return n;
    }

    private static String F(Context context) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        String str = z;
        if ((str == null || "".equals(str)) && b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            TelephonyManager telephonyManagerK = K(context);
            if (telephonyManagerK == null) {
                return "";
            }
            Method methodA = u.a(telephonyManagerK.getClass(), "UZ2V0U3Vic2NyaWJlcklk", (Class<?>[]) new Class[0]);
            if (methodA != null) {
                z = (String) methodA.invoke(telephonyManagerK, new Object[0]);
            }
            if (z == null) {
                z = "";
            }
            return z;
        }
        return z;
    }

    private static String G(Context context) {
        if (!b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return null;
        }
        TelephonyManager telephonyManagerK = K(context);
        if (telephonyManagerK == null) {
            return "";
        }
        String simOperatorName = telephonyManagerK.getSimOperatorName();
        return TextUtils.isEmpty(simOperatorName) ? telephonyManagerK.getNetworkOperatorName() : simOperatorName;
    }

    private static int H(Context context) {
        ConnectivityManager connectivityManagerI;
        NetworkInfo activeNetworkInfo;
        if (context == null || !b(context, u.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerI = I(context)) == null || (activeNetworkInfo = connectivityManagerI.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    private static ConnectivityManager I(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int J(Context context) {
        TelephonyManager telephonyManagerK;
        if (b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) && (telephonyManagerK = K(context)) != null) {
            return telephonyManagerK.getNetworkType();
        }
        return -1;
    }

    private static TelephonyManager K(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static String L(Context context) {
        if (!c) {
            return "";
        }
        String strM = null;
        try {
            strM = M(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(strM)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = u.c("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(o.a(u.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), o.b(strM), bytes), "UTF-8");
        } catch (Throwable unused2) {
            c = false;
            return "";
        }
    }

    private static String M(Context context) {
        String strN;
        try {
            strN = N(context);
        } catch (Throwable unused) {
            strN = "";
        }
        if (TextUtils.isEmpty(strN)) {
            return context == null ? "" : context.getSharedPreferences(u.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(r.a(u.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
        }
        return strN;
    }

    private static String N(Context context) {
        RandomAccessFile randomAccessFile;
        String[] strArrSplit;
        String strA = r.a(u.c("LYW1hcF9kZXZpY2VfYWRpdQ"));
        String strO = O(context);
        if (TextUtils.isEmpty(strO)) {
            return "";
        }
        File file = new File(strO + File.separator + u.c("KYmFja3Vwcw"), u.c("MLmFkaXU"));
        if (file.exists() && file.canRead()) {
            if (file.length() == 0) {
                file.delete();
                return "";
            }
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i2 = randomAccessFile.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i2);
                        } catch (Throwable unused) {
                            byteArrayOutputStream = byteArrayOutputStream2;
                            a(byteArrayOutputStream);
                        }
                    }
                    String str = new String(byteArrayOutputStream2.toByteArray(), "UTF-8");
                    if (!TextUtils.isEmpty(str) && str.contains(u.c("SIw")) && (strArrSplit = str.split(u.c("SIw"))) != null && strArrSplit.length == 2 && TextUtils.equals(strA, strArrSplit[0])) {
                        String str2 = strArrSplit[1];
                        a(byteArrayOutputStream2);
                        a(randomAccessFile);
                        return str2;
                    }
                    a(byteArrayOutputStream2);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                randomAccessFile = null;
            }
            a(randomAccessFile);
        }
        return "";
    }

    private static String O(Context context) {
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            Class<?> cls = Class.forName(u.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            Method method = storageManager.getClass().getMethod(u.c("MZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
            Method method2 = cls.getMethod(u.c("FZ2V0UGF0aA"), new Class[0]);
            Method method3 = cls.getMethod(u.c("DaXNSZW1vdmFibGU"), new Class[0]);
            Object objInvoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(objInvoke);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = Array.get(objInvoke, i2);
                String str = (String) method2.invoke(obj, new Object[0]);
                if (!((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                    return str;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a() {
        return k;
    }

    public static String a(final Context context) {
        try {
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            if (context == null) {
                return "";
            }
            String strL = L(context);
            b = strL;
            if (!TextUtils.isEmpty(strL)) {
                return b;
            }
            if (g == null || m) {
                return "";
            }
            m = true;
            ab.d().submit(new Runnable() { // from class: com.loc.n.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        a aVar = n.g;
                        n.h(context);
                        n.z(context);
                        String strD = aVar.d();
                        if (TextUtils.isEmpty(strD)) {
                            return;
                        }
                        aq.a();
                        a aVar2 = n.g;
                        strD.getBytes();
                        byte[] bArrA = aq.a(aVar2.a());
                        a aVar3 = n.g;
                        new String(bArrA);
                        String strC = aVar3.c();
                        if (TextUtils.isEmpty(strC)) {
                            return;
                        }
                        n.b = strC;
                    } catch (Throwable unused) {
                    }
                }
            });
            return "";
        } catch (Throwable unused) {
        }
    }

    public static String a(Context context, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 || i2 < 21) {
            return "";
        }
        try {
            if (!TextUtils.isEmpty(i)) {
                return i;
            }
            TelephonyManager telephonyManagerK = K(context);
            if (h == -1) {
                Method methodA = u.a(TelephonyManager.class, "UZ2V0UGhvbmVDb3VudA=", (Class<?>[]) new Class[0]);
                if (methodA != null) {
                    try {
                        h = ((Integer) methodA.invoke(telephonyManagerK, new Object[0])).intValue();
                    } catch (Throwable unused) {
                        h = 0;
                    }
                } else {
                    h = 0;
                }
            }
            Method methodA2 = u.a(TelephonyManager.class, "MZ2V0SW1laQ=", (Class<?>[]) new Class[]{Integer.TYPE});
            if (methodA2 == null) {
                h = 0;
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < h; i3++) {
                try {
                    sb.append((String) methodA2.invoke(telephonyManagerK, Integer.valueOf(i3)));
                    sb.append(str);
                } catch (Throwable unused2) {
                }
            }
            String string = sb.toString();
            if (string.length() == 0) {
                h = 0;
                return "";
            }
            String strSubstring = string.substring(0, string.length() - 1);
            i = strSubstring;
            return strSubstring;
        } catch (Throwable unused3) {
            return "";
        }
    }

    private static List<ScanResult> a(List<ScanResult> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size - 1; i2++) {
            for (int i3 = 1; i3 < size - i2; i3++) {
                int i4 = i3 - 1;
                if (list.get(i4).level > list.get(i3).level) {
                    ScanResult scanResult = list.get(i4);
                    list.set(i4, list.get(i3));
                    list.set(i3, scanResult);
                }
            }
        }
        return list;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        k = str;
    }

    public static String b() {
        try {
            if (!TextUtils.isEmpty(e)) {
                return e;
            }
            a aVar = g;
            return aVar == null ? "" : aVar.b();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            return G(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static boolean b(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            String strZ = z(context);
            if (strZ != null && strZ.length() >= 5) {
                return strZ.substring(3, 5);
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static void c() {
        try {
            if (Build.VERSION.SDK_INT > 14) {
                TrafficStats.class.getDeclaredMethod("setThreadStatsTag", Integer.TYPE).invoke(null, 40964);
            }
        } catch (Throwable unused) {
        }
    }

    public static int d(Context context) {
        try {
            return J(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String[] d() {
        return new String[]{"", ""};
    }

    public static int e(Context context) {
        try {
            return H(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static long e() {
        long blockCount;
        long blockCount2;
        long j2 = w;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockCount = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                blockCount2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
            } else {
                blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
                blockCount2 = (((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize())) / 1048576;
            }
            w = blockCount + blockCount2;
        } catch (Throwable unused) {
        }
        return w;
    }

    public static String f() {
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String property = System.getProperty("os.arch");
        y = property;
        return property;
    }

    public static String f(Context context) {
        try {
            return F(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String g(final Context context) {
        try {
            if (o) {
                return "";
            }
            if (!TextUtils.isEmpty(n)) {
                return n;
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                return E(context);
            }
            ab.d().submit(new Runnable() { // from class: com.loc.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    n.E(context);
                }
            });
            return n;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ boolean g() {
        o = true;
        return true;
    }

    private static String h() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = Build.VERSION.SDK_INT >= 9 ? networkInterface.getHardwareAddress() : null;
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        String upperCase = Integer.toHexString(b2 & 255).toUpperCase();
                        if (upperCase.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(upperCase);
                        sb.append(":");
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(Context context) {
        try {
            String str = a;
            if (str != null && !"".equals(str)) {
                return a;
            }
            if (b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            String str2 = a;
            if (str2 != null && !"".equals(str2)) {
                return a;
            }
            try {
                a = D(context);
            } catch (Throwable unused) {
            }
            String str3 = a;
            return str3 == null ? "" : str3;
        } catch (Throwable unused2) {
        }
    }

    public static String i(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return "";
        }
        if (!TextUtils.isEmpty(q)) {
            return q;
        }
        if (!b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return "";
        }
        try {
            if (i2 >= 26) {
                return (String) u.a(Build.class, "MZ2V0U2VyaWFs", (Class<?>[]) new Class[0]).invoke(Build.class, new Object[0]);
            }
            if (i2 >= 9) {
                q = Build.SERIAL;
            }
            String str = q;
            return str == null ? "" : str;
        } catch (Throwable unused) {
        }
    }

    public static String j(Context context) {
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), u.c(new String(v.a(13))));
            p = string;
            return string == null ? "" : string;
        } catch (Throwable unused) {
            return p;
        }
    }

    public static String k(Context context) {
        WifiManager wifiManager;
        if (context == null) {
            return "";
        }
        try {
            return (b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && wifiManager.isWifiEnabled()) ? wifiManager.getConnectionInfo().getBSSID() : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String l(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            try {
                if (b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return "";
                    }
                    if (wifiManager.isWifiEnabled()) {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null && scanResults.size() != 0) {
                            List<ScanResult> listA = a(scanResults);
                            boolean z2 = true;
                            for (int i2 = 0; i2 < listA.size() && i2 < 7; i2++) {
                                ScanResult scanResult = listA.get(i2);
                                if (z2) {
                                    z2 = false;
                                } else {
                                    sb.append(";");
                                }
                                sb.append(scanResult.BSSID);
                            }
                        }
                        return sb.toString();
                    }
                    return sb.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return sb.toString();
    }

    public static String m(Context context) {
        try {
            String str = r;
            if ((str == null || "".equals(str)) && b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager == null) {
                    return "";
                }
                r = wifiManager.getConnectionInfo().getMacAddress();
                if (u.c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(r) || u.c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(r)) {
                    r = h();
                }
                return r;
            }
            return r;
        } catch (Throwable unused) {
        }
    }

    public static String n(Context context) {
        try {
            TelephonyManager telephonyManagerK = K(context);
            if (telephonyManagerK == null) {
                return "";
            }
            String networkOperator = telephonyManagerK.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o(Context context) {
        try {
            TelephonyManager telephonyManagerK = K(context);
            if (telephonyManagerK == null) {
                return "";
            }
            String networkOperator = telephonyManagerK.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int p(Context context) {
        try {
            return J(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int q(Context context) {
        try {
            return H(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static NetworkInfo r(Context context) {
        ConnectivityManager connectivityManagerI;
        if (b(context, u.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerI = I(context)) != null) {
            return connectivityManagerI.getActiveNetworkInfo();
        }
        return null;
    }

    public static String s(Context context) {
        try {
            NetworkInfo networkInfoR = r(context);
            if (networkInfoR == null) {
                return null;
            }
            return networkInfoR.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String t(Context context) {
        StringBuilder sb;
        try {
            String str = s;
            if (str != null && !"".equals(str)) {
                return s;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i3 > i2) {
                sb = new StringBuilder();
                sb.append(i2);
                sb.append("*");
                sb.append(i3);
            } else {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append("*");
                sb.append(i2);
            }
            s = sb.toString();
            return s;
        } catch (Throwable unused) {
        }
    }

    public static String u(Context context) {
        try {
            if (!b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return z;
            }
            TelephonyManager telephonyManagerK = K(context);
            return telephonyManagerK == null ? "" : telephonyManagerK.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String v(Context context) {
        ConnectivityManager connectivityManagerI;
        NetworkInfo activeNetworkInfo;
        try {
            return (!b(context, u.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerI = I(context)) == null || (activeNetworkInfo = connectivityManagerI.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String w(Context context) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                return "";
            }
            String str = t;
            if ((str == null || "".equals(str)) && b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                TelephonyManager telephonyManagerK = K(context);
                if (telephonyManagerK == null) {
                    return "";
                }
                Method methodA = u.a(telephonyManagerK.getClass(), "QZ2V0RGV2aWNlSWQ", (Class<?>[]) new Class[0]);
                if (i2 >= 26) {
                    methodA = u.a(telephonyManagerK.getClass(), "QZ2V0SW1laQ==", (Class<?>[]) new Class[0]);
                }
                if (methodA != null) {
                    t = (String) methodA.invoke(telephonyManagerK, new Object[0]);
                }
                if (t == null) {
                    t = "";
                }
                return t;
            }
            return t;
        } catch (Throwable unused) {
        }
    }

    public static String x(Context context) {
        return w(context) + UpdateUtils.CMD_FILTER + a(context);
    }

    public static String y(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return "";
        }
        try {
            String str = u;
            if ((str == null || "".equals(str)) && b(context, u.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                TelephonyManager telephonyManagerK = K(context);
                if (telephonyManagerK == null) {
                    return "";
                }
                if (i2 >= 26) {
                    Method methodA = u.a(telephonyManagerK.getClass(), "QZ2V0TWVpZA==", (Class<?>[]) new Class[0]);
                    if (methodA != null) {
                        u = (String) methodA.invoke(telephonyManagerK, new Object[0]);
                    }
                    if (u == null) {
                        u = "";
                    }
                }
                return u;
            }
            return u;
        } catch (Throwable unused) {
        }
    }

    public static String z(Context context) {
        try {
            return F(context);
        } catch (Throwable unused) {
            return "";
        }
    }
}
