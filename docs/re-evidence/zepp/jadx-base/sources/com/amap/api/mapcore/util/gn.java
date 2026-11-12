package com.amap.api.mapcore.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
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
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class gn {
    private static String A = "";
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
    private static String w = "";
    private static long x;
    private static int y;
    private static String z;

    public interface a {
        ir a(byte[] bArr, Map<String, String> map);

        String a();

        String a(Context context, String str);

        String a(String str, String str2, String str3, String str4);

        Map<String, String> b();
    }

    public static class b implements ServiceConnection {
        private static String a;
        private Context b;
        private int c;

        public b(Context context, int i) {
            this.b = context;
            this.c = i;
        }

        private String a() {
            try {
                if (!TextUtils.isEmpty(a)) {
                    return a;
                }
                byte[] bArrDigest = MessageDigest.getInstance(gu.c("IU0hBMQ")).digest(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64).signatures[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : bArrDigest) {
                    stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                }
                String string = stringBuffer.toString();
                if (!TextUtils.isEmpty(string)) {
                    a = string;
                }
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0050 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x0008, B:15:0x0050, B:10:0x0017, B:11:0x003a, B:12:0x0044), top: B:26:0x0008 }] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            boolean z;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                int i = this.c;
                if (i == 2) {
                    parcelObtain.writeInterfaceToken(gu.c("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U"));
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            z = false;
                        } else {
                            parcelObtain.writeInterfaceToken(gu.c("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                            parcelObtain.writeString(this.b.getPackageName());
                            parcelObtain.writeString(a());
                            parcelObtain.writeString(gu.c("IT1VJRA"));
                        }
                        if (z) {
                            iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            String unused = gn.n = parcelObtain2.readString();
                        }
                    }
                    parcelObtain.writeInterfaceToken(gu.c("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ"));
                }
                z = true;
                if (z) {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    String unused2 = gn.n = parcelObtain2.readString();
                }
            } catch (Throwable th) {
                try {
                    hk.a(th, "oac", String.valueOf(this.c));
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

    private static String B(Context context) {
        FileInputStream fileInputStream = null;
        try {
            if (gu.a(context, "android.permission.READ_EXTERNAL_STORAGE") && "mounted".equals(Environment.getExternalStorageState())) {
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

    private static String C(Context context) {
        try {
            Class<?> cls = Class.forName(gu.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object objInvoke = cls.getMethod(gu.c("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (objInvoke != null) {
                String str = (String) objInvoke;
                n = str;
                return str;
            }
        } catch (Throwable th) {
            hk.a(th, "oa", "xm");
            o = true;
        }
        return n;
    }

    private static String D(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(gu.c("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    int columnCount = cursorQuery.getColumnCount();
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        if (gu.c("IdmFsdWU").equals(cursorQuery.getColumnName(i2))) {
                            n = cursorQuery.getString(i2);
                            break;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            o = true;
            hk.a(th, "oa", "vivo");
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String E(Context context) {
        String strC = gu.c("IeGlhb21p");
        String str = Build.MANUFACTURER;
        if (strC.equalsIgnoreCase(str)) {
            return C(context);
        }
        if (gu.c("Idml2bw").equalsIgnoreCase(str)) {
            return D(context);
        }
        if (gu.c("IaHVhd2Vp").equalsIgnoreCase(str)) {
            return a(context, 2);
        }
        if (gu.c("Mc2Ftc3VuZw").equalsIgnoreCase(str)) {
            return a(context, 4);
        }
        if (gu.c("IT1BQTw").equalsIgnoreCase(str) || gu.c("MT25lUGx1cw").equalsIgnoreCase(str)) {
            return a(context, 5);
        }
        o = true;
        return n;
    }

    private static String F(Context context) {
        if (!TextUtils.isEmpty(w)) {
            return w;
        }
        try {
            String strB = hp.b(context, "open_common", "a1", "");
            if (TextUtils.isEmpty(strB)) {
                w = "amap" + UUID.randomUUID().toString().replace("_", "").toLowerCase();
                SharedPreferences.Editor editorA = hp.a(context, "open_common");
                hp.a(editorA, "a1", gu.b(w));
                hp.a(editorA);
            } else {
                w = gu.c(strB);
            }
            return w;
        } catch (Throwable unused) {
            return w;
        }
    }

    private static String G(Context context) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        String str = A;
        if (str != null && !"".equals(str)) {
            return A;
        }
        if (!b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return A;
        }
        TelephonyManager telephonyManagerL = L(context);
        if (telephonyManagerL == null) {
            return "";
        }
        Method methodA = gu.a(telephonyManagerL.getClass(), "UZ2V0U3Vic2NyaWJlcklk", (Class<?>[]) new Class[0]);
        if (methodA != null) {
            A = (String) methodA.invoke(telephonyManagerL, new Object[0]);
        }
        if (A == null) {
            A = "";
        }
        return A;
    }

    private static String H(Context context) {
        if (!b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return null;
        }
        TelephonyManager telephonyManagerL = L(context);
        if (telephonyManagerL == null) {
            return "";
        }
        String simOperatorName = telephonyManagerL.getSimOperatorName();
        return TextUtils.isEmpty(simOperatorName) ? telephonyManagerL.getNetworkOperatorName() : simOperatorName;
    }

    private static int I(Context context) {
        ConnectivityManager connectivityManagerJ;
        NetworkInfo activeNetworkInfo;
        if (context == null || !b(context, gu.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerJ = J(context)) == null || (activeNetworkInfo = connectivityManagerJ.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    private static ConnectivityManager J(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int K(Context context) {
        TelephonyManager telephonyManagerL;
        if (b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) && (telephonyManagerL = L(context)) != null) {
            return telephonyManagerL.getNetworkType();
        }
        return -1;
    }

    private static TelephonyManager L(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static String M(Context context) {
        if (!c) {
            return "";
        }
        String strN = null;
        try {
            strN = N(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(strN)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = gu.c("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(go.a(gu.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), go.b(strN), bytes), "UTF-8");
        } catch (Throwable unused2) {
            c = false;
            return "";
        }
    }

    private static String N(Context context) {
        String strO;
        try {
            strO = O(context);
        } catch (Throwable unused) {
            strO = "";
        }
        if (TextUtils.isEmpty(strO)) {
            return context == null ? "" : context.getSharedPreferences(gu.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(gr.b(gu.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
        }
        return strO;
    }

    private static String O(Context context) {
        RandomAccessFile randomAccessFile;
        String[] strArrSplit;
        String strB = gr.b(gu.c("LYW1hcF9kZXZpY2VfYWRpdQ"));
        String strP = P(context);
        if (TextUtils.isEmpty(strP)) {
            return "";
        }
        File file = new File(strP + File.separator + gu.c("KYmFja3Vwcw"), gu.c("MLmFkaXU"));
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
                    if (!TextUtils.isEmpty(str) && str.contains(gu.c("SIw")) && (strArrSplit = str.split(gu.c("SIw"))) != null && strArrSplit.length == 2 && TextUtils.equals(strB, strArrSplit[0])) {
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

    private static String P(Context context) {
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            Class<?> cls = Class.forName(gu.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            Method method = storageManager.getClass().getMethod(gu.c("MZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
            Method method2 = cls.getMethod(gu.c("FZ2V0UGF0aA"), new Class[0]);
            Method method3 = cls.getMethod(gu.c("DaXNSZW1vdmFibGU"), new Class[0]);
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

    public static String b() {
        try {
            if (!TextUtils.isEmpty(e)) {
                return e;
            }
            a aVar = g;
            return aVar == null ? "" : aVar.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static a c() {
        return g;
    }

    public static int d(Context context) {
        try {
            return K(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static int e(Context context) {
        try {
            return I(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String f(Context context) {
        try {
            return G(context);
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
            hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.gn.2
                @Override // java.lang.Runnable
                public final void run() {
                    gn.E(context);
                }
            });
            return n;
        } catch (Throwable unused) {
        }
    }

    public static String h(Context context) {
        try {
            String str = a;
            if (str != null && !"".equals(str)) {
                return a;
            }
            if (b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            String str2 = a;
            if (str2 != null && !"".equals(str2)) {
                return a;
            }
            try {
                a = B(context);
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
        if (!b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return "";
        }
        try {
            if (i2 >= 26) {
                return (String) gu.a(Build.class, "MZ2V0U2VyaWFs", (Class<?>[]) new Class[0]).invoke(Build.class, new Object[0]);
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
            String string = Settings.Secure.getString(context.getContentResolver(), gu.c(new String(hj.a(13))));
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
            return (b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && wifiManager.isWifiEnabled()) ? wifiManager.getConnectionInfo().getBSSID() : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String l(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            try {
                if (b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
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
            if (str != null && !"".equals(str)) {
                return r;
            }
            if (!b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                return r;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return "";
            }
            r = wifiManager.getConnectionInfo().getMacAddress();
            if (gu.c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(r) || gu.c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(r)) {
                r = g();
            }
            return r;
        } catch (Throwable unused) {
        }
    }

    public static String n(Context context) {
        try {
            TelephonyManager telephonyManagerL = L(context);
            if (telephonyManagerL == null) {
                return "";
            }
            String networkOperator = telephonyManagerL.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int o(Context context) {
        try {
            return K(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int p(Context context) {
        try {
            return I(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String q(Context context) {
        ConnectivityManager connectivityManagerJ;
        try {
            NetworkInfo activeNetworkInfo = (b(context, gu.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerJ = J(context)) != null) ? connectivityManagerJ.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String r(Context context) {
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

    public static String s(Context context) {
        ConnectivityManager connectivityManagerJ;
        NetworkInfo activeNetworkInfo;
        try {
            return (!b(context, gu.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerJ = J(context)) == null || (activeNetworkInfo = connectivityManagerJ.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String t(Context context) {
        try {
            String strU = u(context);
            try {
                if (TextUtils.isEmpty(strU)) {
                    strU = a(context);
                }
                if (TextUtils.isEmpty(strU)) {
                    strU = h(context);
                }
                if (TextUtils.isEmpty(strU)) {
                    strU = g(context);
                }
                if (TextUtils.isEmpty(strU)) {
                    strU = j(context);
                }
                return TextUtils.isEmpty(strU) ? F(context) : strU;
            } catch (Throwable unused) {
                return strU;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String u(Context context) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                return "";
            }
            String str = t;
            if (str != null && !"".equals(str)) {
                return t;
            }
            if (!b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return t;
            }
            TelephonyManager telephonyManagerL = L(context);
            if (telephonyManagerL == null) {
                return "";
            }
            Method methodA = gu.a(telephonyManagerL.getClass(), "QZ2V0RGV2aWNlSWQ", (Class<?>[]) new Class[0]);
            if (i2 >= 26) {
                methodA = gu.a(telephonyManagerL.getClass(), "QZ2V0SW1laQ==", (Class<?>[]) new Class[0]);
            }
            if (methodA != null) {
                t = (String) methodA.invoke(telephonyManagerL, new Object[0]);
            }
            if (t == null) {
                t = "";
            }
            return t;
        } catch (Throwable unused) {
        }
    }

    public static String v(Context context) {
        return u(context) + UpdateUtils.CMD_FILTER + a(context) + UpdateUtils.CMD_FILTER + t(context);
    }

    public static String w(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return "";
        }
        try {
            String str = u;
            if (str != null && !"".equals(str)) {
                return u;
            }
            if (!b(context, gu.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return u;
            }
            TelephonyManager telephonyManagerL = L(context);
            if (telephonyManagerL == null) {
                return "";
            }
            if (i2 >= 26) {
                Method methodA = gu.a(telephonyManagerL.getClass(), "QZ2V0TWVpZA==", (Class<?>[]) new Class[0]);
                if (methodA != null) {
                    u = (String) methodA.invoke(telephonyManagerL, new Object[0]);
                }
                if (u == null) {
                    u = "";
                }
            }
            return u;
        } catch (Throwable unused) {
        }
    }

    public static String x(Context context) {
        try {
            return G(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int y(Context context) {
        int i2 = y;
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
                        y = i3;
                        return i3;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable unused3) {
            }
        }
        int i4 = iIntValue / 1024;
        y = i4;
        return i4;
    }

    public static String z(Context context) {
        try {
            return H(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a() {
        return k;
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            String strX = x(context);
            if (strX != null && strX.length() >= 5) {
                return strX.substring(3, 5);
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static void a(a aVar) {
        if (g == null) {
            g = aVar;
        }
    }

    public static String[] d() {
        return new String[]{"", ""};
    }

    public static long e() {
        long blockCount;
        long blockCount2;
        long j2 = x;
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
            x = blockCount + blockCount2;
        } catch (Throwable unused) {
        }
        return x;
    }

    public static String f() {
        if (!TextUtils.isEmpty(z)) {
            return z;
        }
        String property = System.getProperty("os.arch");
        z = property;
        return property;
    }

    public static String a(final Context context) {
        try {
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            if (context == null) {
                return "";
            }
            String strM = M(context);
            b = strM;
            if (!TextUtils.isEmpty(strM)) {
                return b;
            }
            if (g == null || m) {
                return "";
            }
            m = true;
            hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.gn.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Map<String, String> mapB = gn.g.b();
                        String strA = gn.g.a(gn.h(context), "", "", gn.x(context));
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        ik.a();
                        String strA2 = gn.g.a(context, new String(ik.b(gn.g.a(strA.getBytes(), mapB)).a));
                        if (TextUtils.isEmpty(strA2)) {
                            return;
                        }
                        gn.b = strA2;
                    } catch (Throwable unused) {
                    }
                }
            });
            return "";
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        try {
            return H(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static boolean b(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    private static String g() {
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

    private static String a(Context context, int i2) {
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(gu.c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(gu.c("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(gu.c("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), gu.c("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else {
                if (i2 != 5) {
                    o = true;
                    return n;
                }
                intent.setClassName(gu.c("YY29tLmhleXRhcC5vcGVuaWQ"), gu.c("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(gu.c("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            }
            b bVar = new b(context, i2);
            if (context.bindService(intent, bVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(n)) {
                    i3++;
                    Thread.sleep(15L);
                }
                context.unbindService(bVar);
            }
            return n;
        } catch (Throwable th) {
            hk.a(th, "oa", String.valueOf(i2));
            o = true;
            return n;
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
            TelephonyManager telephonyManagerL = L(context);
            if (h == -1) {
                Method methodA = gu.a(TelephonyManager.class, "UZ2V0UGhvbmVDb3VudA=", (Class<?>[]) new Class[0]);
                if (methodA != null) {
                    try {
                        h = ((Integer) methodA.invoke(telephonyManagerL, new Object[0])).intValue();
                    } catch (Throwable unused) {
                        h = 0;
                    }
                } else {
                    h = 0;
                }
            }
            Method methodA2 = gu.a(TelephonyManager.class, "MZ2V0SW1laQ=", (Class<?>[]) new Class[]{Integer.TYPE});
            if (methodA2 == null) {
                h = 0;
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < h; i3++) {
                try {
                    sb.append((String) methodA2.invoke(telephonyManagerL, Integer.valueOf(i3)));
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
}
