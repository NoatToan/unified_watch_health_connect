package com.amap.api.col.p0003sl;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public final class ip {
    private static boolean A = false;
    private static String B = "";
    private static boolean C = false;
    private static String D = "";
    private static String E = "";
    private static String F = "";
    private static boolean G = false;
    private static boolean H = false;
    private static String I = "";
    private static boolean J = false;
    private static boolean K = false;
    private static long L = 0;
    private static int M = 0;
    private static String N = null;
    private static String O = "";
    private static boolean P = true;
    private static boolean Q = false;
    private static String R = "";
    private static boolean S = false;
    private static int T = -1;
    private static boolean U = false;
    private static int V = -1;
    private static boolean W = false;
    private static volatile b X = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f2798a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static String f2799b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile boolean f2800c = true;
    public static boolean d = false;
    static String e = "";
    static boolean f = false;
    public static a g = null;
    static int h = -1;
    static String i = "";
    static String j = "";
    private static String k = null;
    private static boolean l = false;
    private static String m = "";
    private static volatile boolean n = false;
    private static String o = "";
    private static boolean p = false;
    private static boolean q = true;
    private static String r = null;
    private static IBinder s = null;
    private static boolean t = false;
    private static boolean u = false;
    private static String v = "";
    private static String w = "";
    private static boolean x = false;
    private static boolean y = false;
    private static String z = "";

    public interface a {
        la a(byte[] bArr, Map<String, String> map);

        String a();

        String a(Context context, String str);

        String a(String str, String str2, String str3, String str4);

        Map<String, String> b();
    }

    static /* synthetic */ boolean r() {
        t = true;
        return true;
    }

    public static void a(String str) {
        k = str;
    }

    public static String a() {
        return k;
    }

    public static String b() {
        try {
            if (!TextUtils.isEmpty(e)) {
                return e;
            }
            a aVar = g;
            if (aVar == null) {
                return "";
            }
            return aVar.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(a aVar) {
        if (g == null) {
            g = aVar;
        }
    }

    public static a c() {
        return g;
    }

    public static String a(final Context context) {
        try {
            if (!TextUtils.isEmpty(f2799b)) {
                return f2799b;
            }
            if (context == null) {
                return "";
            }
            String strG = G(context);
            f2799b = strG;
            if (!TextUtils.isEmpty(strG)) {
                return f2799b;
            }
            if (c() == null || n) {
                return "";
            }
            n = true;
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.ip.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    try {
                        Map<String, String> mapB = ip.g.b();
                        String strA = ip.g.a(ip.f(context), "", "", ip.n());
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        kt.a();
                        String strA2 = ip.g.a(context, new String(kt.a(ip.g.a(strA.getBytes(), mapB)).f3037a));
                        if (TextUtils.isEmpty(strA2)) {
                            return;
                        }
                        ip.f2799b = strA2;
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
            return B(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            String strN = n();
            return strN.length() < 5 ? "" : strN.substring(3, 5);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static int c(Context context) {
        try {
            return E(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static int d(Context context) {
        try {
            return C(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    private static String u(Context context) {
        try {
            String strB = ki.b(context, "Alvin2", "UTDID2", "");
            return TextUtils.isEmpty(strB) ? ki.b(context, "Alvin2", "UTDID", "") : strB;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String v(Context context) {
        FileInputStream fileInputStream;
        try {
            File file = new File(context.getExternalCacheDir().getAbsolutePath() + "/.UTSystemConfig/Global/Alvin2.xml");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            fileInputStream = new FileInputStream(file);
            try {
                xmlPullParserNewPullParser.setInput(fileInputStream, "utf-8");
                boolean z2 = false;
                for (int eventType = xmlPullParserNewPullParser.getEventType(); 1 != eventType; eventType = xmlPullParserNewPullParser.next()) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            z2 = false;
                        } else if (eventType == 4 && z2) {
                            String text = xmlPullParserNewPullParser.getText();
                            try {
                                fileInputStream.close();
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
            } catch (Throwable unused2) {
                if (fileInputStream == null) {
                    return "";
                }
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
        }
        try {
            fileInputStream.close();
            return "";
        } catch (Throwable unused4) {
            return "";
        }
    }

    static final class c implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinder unused = ip.s = iBinder;
        }
    }

    private static String w(Context context) {
        try {
            if (!TextUtils.isEmpty(r)) {
                return r;
            }
            byte[] bArrDigest = MessageDigest.getInstance(iy.c("IU0hBMQ")).digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                stringBuffer.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            String string = stringBuffer.toString();
            if (!TextUtils.isEmpty(string)) {
                r = string;
            }
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(Context context, int i2) {
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(iy.c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(iy.c("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(iy.c("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), iy.c("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else if (i2 == 5) {
                intent.setClassName(iy.c("YY29tLmhleXRhcC5vcGVuaWQ"), iy.c("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(iy.c("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            } else {
                p = true;
                return o;
            }
            c cVar = new c();
            if (context.bindService(intent, cVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(o)) {
                    i3++;
                    if (s != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        if (i2 == 2) {
                            parcelObtain.writeInterfaceToken(iy.c("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U"));
                        } else if (i2 == 4) {
                            parcelObtain.writeInterfaceToken(iy.c("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ"));
                        } else {
                            if (i2 == 5) {
                                try {
                                    parcelObtain.writeInterfaceToken(iy.c("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                                    parcelObtain.writeString(context.getPackageName());
                                    parcelObtain.writeString(w(context));
                                    parcelObtain.writeString(iy.c("IT1VJRA"));
                                } catch (Throwable th) {
                                    try {
                                        js.a(th, "oac", String.valueOf(i2));
                                    } catch (Throwable th2) {
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th2;
                                    }
                                }
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                        s.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        o = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                    Thread.sleep(15L);
                }
                context.unbindService(cVar);
                s = null;
            }
            return o;
        } catch (Throwable th3) {
            js.a(th3, "oa", String.valueOf(i2));
            p = true;
            return o;
        }
    }

    private static String x(Context context) {
        try {
            Class<?> cls = Class.forName(iy.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object objInvoke = cls.getMethod(iy.c("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (objInvoke != null) {
                String str = (String) objInvoke;
                o = str;
                return str;
            }
        } catch (Throwable th) {
            js.a(th, "oa", "xm");
            p = true;
        }
        return o;
    }

    private static String y(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(iy.c("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    int columnCount = cursorQuery.getColumnCount();
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        if (iy.c("IdmFsdWU").equals(cursorQuery.getColumnName(i2))) {
                            o = cursorQuery.getString(i2);
                            break;
                        }
                    }
                }
                cursorQuery.close();
            }
        } catch (Throwable th) {
            p = true;
            js.a(th, "oa", "vivo");
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String z(Context context) {
        if (iy.c("IeGlhb21p").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("IeGlhb21p").equalsIgnoreCase(Build.BRAND) || iy.c("IUkVETUk=").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("IUkVETUk=").equalsIgnoreCase(Build.BRAND)) {
            return x(context);
        }
        if (iy.c("Idml2bw").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("Idml2bw").equalsIgnoreCase(Build.BRAND)) {
            return y(context);
        }
        if (iy.c("IaHVhd2Vp").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("IaHVhd2Vp").equalsIgnoreCase(Build.BRAND) || iy.c("ISE9OT1I=").equalsIgnoreCase(Build.MANUFACTURER)) {
            return a(context, 2);
        }
        if (iy.c("Mc2Ftc3VuZw").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("Mc2Ftc3VuZw").equalsIgnoreCase(Build.BRAND)) {
            return a(context, 4);
        }
        if (iy.c("IT1BQTw").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("IT1BQTw").equalsIgnoreCase(Build.BRAND) || iy.c("MT25lUGx1cw").equalsIgnoreCase(Build.MANUFACTURER) || iy.c("MT25lUGx1cw").equalsIgnoreCase(Build.BRAND) || iy.c("IUkVBTE1F").equalsIgnoreCase(Build.BRAND)) {
            return a(context, 5);
        }
        p = true;
        return o;
    }

    public static String e(final Context context) {
        try {
            if (!q || p) {
                return "";
            }
            if (!TextUtils.isEmpty(o)) {
                return o;
            }
            if (t) {
                return o;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ma.a().a(new mb() { // from class: com.amap.api.col.3sl.ip.2
                    @Override // com.amap.api.col.p0003sl.mb
                    public final void runTask() {
                        ip.z(context);
                        ip.r();
                    }
                });
                return o;
            }
            t = true;
            return z(context);
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z2) {
        q = z2;
    }

    public static String f(Context context) {
        if (u) {
            String str = f2798a;
            return str == null ? "" : str;
        }
        try {
            String str2 = f2798a;
            if (str2 != null && !"".equals(str2)) {
                return f2798a;
            }
            if (b(context, iy.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                f2798a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (!TextUtils.isEmpty(f2798a)) {
                u = true;
                return f2798a;
            }
            try {
                String strU = u(context);
                f2798a = strU;
                if (!TextUtils.isEmpty(strU)) {
                    u = true;
                    return f2798a;
                }
            } catch (Throwable unused) {
            }
            try {
                f2798a = v(context);
                u = true;
            } catch (Throwable unused2) {
            }
            String str3 = f2798a;
            return str3 == null ? "" : str3;
        } catch (Throwable unused3) {
        }
    }

    public static String f() {
        return "";
    }

    public static String g() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String h() {
        return z;
    }

    static String[] i() {
        return new String[]{"", ""};
    }

    static String g(Context context) {
        try {
            TelephonyManager telephonyManagerF = F(context);
            if (telephonyManagerF == null) {
                return "";
            }
            String networkOperator = telephonyManagerF.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    static String h(Context context) {
        if (C) {
            return B;
        }
        try {
            K(context);
            TelephonyManager telephonyManagerF = F(context);
            if (telephonyManagerF == null) {
                return B;
            }
            String networkOperator = telephonyManagerF.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                B = networkOperator.substring(3);
                C = true;
                return B;
            }
            C = true;
            return B;
        } catch (Throwable unused) {
        }
    }

    public static int i(Context context) {
        try {
            return E(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int j(Context context) {
        try {
            return C(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static NetworkInfo k(Context context) {
        ConnectivityManager connectivityManagerD;
        if (b(context, iy.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerD = D(context)) != null) {
            return connectivityManagerD.getActiveNetworkInfo();
        }
        return null;
    }

    static String l(Context context) {
        try {
            NetworkInfo networkInfoK = k(context);
            if (networkInfoK == null) {
                return null;
            }
            return networkInfoK.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    static String m(Context context) {
        String str;
        try {
            String str2 = D;
            if (str2 != null && !"".equals(str2)) {
                return D;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i3 > i2) {
                str = i2 + "*" + i3;
            } else {
                str = i3 + "*" + i2;
            }
            D = str;
            return D;
        } catch (Throwable unused) {
        }
    }

    public static String n(Context context) {
        try {
            if (!b(context, iy.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return O;
            }
            TelephonyManager telephonyManagerF = F(context);
            if (telephonyManagerF == null) {
                return "";
            }
            return telephonyManagerF.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o(Context context) {
        ConnectivityManager connectivityManagerD;
        NetworkInfo activeNetworkInfo;
        try {
            if (!b(context, iy.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerD = D(context)) == null || (activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo()) == null) {
                return "";
            }
            return activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j() {
        return i;
    }

    public static String p(Context context) {
        try {
            String strK = k();
            try {
                if (TextUtils.isEmpty(strK)) {
                    strK = a(context);
                }
                if (TextUtils.isEmpty(strK)) {
                    strK = f(context);
                }
                if (TextUtils.isEmpty(strK)) {
                    strK = e(context);
                }
                if (TextUtils.isEmpty(strK)) {
                    strK = g();
                }
                return TextUtils.isEmpty(strK) ? A(context) : strK;
            } catch (Throwable unused) {
                return strK;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static String A(Context context) {
        if (!TextUtils.isEmpty(I)) {
            return I;
        }
        try {
            String strB = ki.b(context, "open_common", "a1", "");
            if (TextUtils.isEmpty(strB)) {
                I = "amap" + UUID.randomUUID().toString().replace("_", "").toLowerCase();
                SharedPreferences.Editor editorA = ki.a(context, "open_common");
                ki.a(editorA, "a1", iy.b(I));
                ki.a(editorA);
            } else {
                I = iy.c(strB);
            }
            return I;
        } catch (Throwable unused) {
            return I;
        }
    }

    public static String k() {
        return E;
    }

    public static void l() {
        try {
            jr.a();
        } catch (Throwable unused) {
        }
    }

    public static String q(Context context) {
        return k() + "#" + a(context) + "#" + p(context);
    }

    public static String m() {
        return "";
    }

    public static long o() {
        long j2 = L;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            L = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576);
        } catch (Throwable unused) {
        }
        return L;
    }

    public static int r(Context context) {
        int i2 = M;
        if (i2 != 0) {
            return i2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i3 = ((int) (memoryInfo.totalMem / 1024)) / 1024;
        M = i3;
        return i3;
    }

    public static String p() {
        if (!TextUtils.isEmpty(N)) {
            return N;
        }
        String property = System.getProperty("os.arch");
        N = property;
        return property;
    }

    static String s(Context context) {
        try {
            return B(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String B(Context context) {
        if (S) {
            return R;
        }
        K(context);
        TelephonyManager telephonyManagerF = F(context);
        if (telephonyManagerF == null) {
            return R;
        }
        String simOperatorName = telephonyManagerF.getSimOperatorName();
        R = simOperatorName;
        if (TextUtils.isEmpty(simOperatorName)) {
            R = telephonyManagerF.getNetworkOperatorName();
        }
        S = true;
        return R;
    }

    private static int C(Context context) {
        if (U) {
            return T;
        }
        K(context);
        if (context == null || !b(context, iy.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return T;
        }
        ConnectivityManager connectivityManagerD = D(context);
        if (connectivityManagerD == null) {
            return T;
        }
        NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            U = true;
            return T;
        }
        int type = activeNetworkInfo.getType();
        T = type;
        U = true;
        return type;
    }

    private static ConnectivityManager D(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int E(Context context) {
        if (W) {
            return V;
        }
        K(context);
        if (!b(context, iy.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return V;
        }
        ConnectivityManager connectivityManagerD = D(context);
        if (connectivityManagerD == null) {
            return V;
        }
        NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            V = activeNetworkInfo.getSubtype();
            W = true;
        }
        return V;
    }

    private static TelephonyManager F(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static String G(Context context) {
        String strH;
        if (!f2800c) {
            return "";
        }
        try {
            strH = H(context);
        } catch (Throwable unused) {
            strH = null;
        }
        if (!TextUtils.isEmpty(strH)) {
            try {
                byte[] bytes = iy.c("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
                return new String(iq.a(iy.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), iq.b(strH), bytes), "UTF-8");
            } catch (Throwable unused2) {
                f2800c = false;
                return "";
            }
        }
        f2800c = false;
        return "";
    }

    private static String H(Context context) {
        String strI;
        try {
            strI = I(context);
        } catch (Throwable unused) {
            strI = "";
        }
        if (TextUtils.isEmpty(strI)) {
            return context == null ? "" : context.getSharedPreferences(iy.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(it.b(iy.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
        }
        return strI;
    }

    private static String I(Context context) {
        RandomAccessFile randomAccessFile;
        String[] strArrSplit;
        String strB = it.b(iy.c("LYW1hcF9kZXZpY2VfYWRpdQ"));
        String strJ = J(context);
        if (TextUtils.isEmpty(strJ)) {
            return "";
        }
        File file = new File(strJ + File.separator + iy.c("KYmFja3Vwcw"), iy.c("MLmFkaXU"));
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
                    if (!TextUtils.isEmpty(str) && str.contains(iy.c("SIw")) && (strArrSplit = str.split(iy.c("SIw"))) != null && strArrSplit.length == 2 && TextUtils.equals(strB, strArrSplit[0])) {
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

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static String J(Context context) {
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null) {
                externalCacheDir = context.getCacheDir();
            }
            if (externalCacheDir != null) {
                return externalCacheDir.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void q() {
        T = -1;
        U = false;
        V = -1;
        W = false;
        R = "";
        S = false;
        B = "";
        C = false;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Context f2803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static BroadcastReceiver f2804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static ConnectivityManager f2805c;
        private static NetworkRequest d;
        private static ConnectivityManager.NetworkCallback e;

        /* JADX INFO: renamed from: com.amap.api.col.3sl.ip$b$1, reason: invalid class name */
        final class AnonymousClass1 extends BroadcastReceiver {
            AnonymousClass1() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (iy.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF").equals(intent.getAction())) {
                    ip.q();
                }
            }
        }

        public final void a(Context context) {
            if (ip.b(context, iy.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && context != null && f2805c == null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                f2805c = connectivityManager;
                if (connectivityManager != null) {
                    d = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                    ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.amap.api.col.3sl.ip.b.2
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onLost(Network network) {
                            super.onLost(network);
                            ip.q();
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onAvailable(Network network) {
                            super.onAvailable(network);
                            ip.q();
                        }
                    };
                    e = networkCallback;
                    f2805c.registerNetworkCallback(d, networkCallback);
                    f2803a = context;
                }
            }
        }
    }

    private static b K(Context context) {
        synchronized (ip.class) {
            if (X == null) {
                if (context == null) {
                    return null;
                }
                b bVar = new b();
                X = bVar;
                bVar.a(context.getApplicationContext());
            }
            return X;
        }
    }

    public static String e() {
        return "";
    }

    public static String n() {
        return "";
    }
}
