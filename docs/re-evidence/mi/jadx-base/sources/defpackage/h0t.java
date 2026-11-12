package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
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
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import com.amap.api.col.p0003sl.b1;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.la;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Marker;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public final class h0t {
    public static boolean A = false;
    public static int B = -1;
    public static boolean C = false;
    public static int D = -1;
    public static boolean E = false;
    public static volatile c F = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f19554a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f19555b = "";
    public static volatile boolean c = true;
    public static String d = "";
    public static String e = null;
    public static d f = null;
    public static volatile boolean g = false;
    public static String h = "";
    public static boolean i = false;
    public static boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f19556k = null;
    public static IBinder l = null;
    public static boolean m = false;
    public static boolean n = false;
    public static String o = "";
    public static String p = "";
    public static boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f19557r = "";
    public static String s = "";
    public static String t = "";
    public static String u = "";
    public static long v = 0;
    public static int w = 0;
    public static String x = null;
    public static String y = "";
    public static String z = "";

    public class a extends f7t {
        public final /* synthetic */ Context d;

        public a(Context context) {
            this.d = context;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                Map<String, String> mapB = h0t.f.b();
                String strB = h0t.f.b(h0t.D(this.d), "", "", h0t.R());
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                b1.b();
                String strA = h0t.f.a(this.d, new String(b1.d(h0t.f.a(strB.getBytes(), mapB)).f36513a));
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                h0t.f19555b = strA;
            } catch (Throwable unused) {
            }
        }
    }

    public class b extends f7t {
        public final /* synthetic */ Context d;

        public b(Context context) {
            this.d = context;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            h0t.i0(this.d);
            h0t.a0();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Context f19558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static ConnectivityManager f19559b;
        public static NetworkRequest c;
        public static ConnectivityManager.NetworkCallback d;

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
                h0t.Y();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                h0t.Y();
            }
        }

        @SuppressLint({"WrongConstant"})
        public final void a(Context context) {
            if (h0t.v(context, p0t.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && context != null && f19559b == null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
                f19559b = connectivityManager;
                if (connectivityManager != null) {
                    c = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                    a aVar = new a();
                    d = aVar;
                    f19559b.registerNetworkCallback(c, aVar);
                    f19558a = context;
                }
            }
        }
    }

    public interface d {
        la a(byte[] bArr, Map<String, String> map);

        String a();

        String a(Context context, String str);

        String b(String str, String str2, String str3, String str4);

        Map<String, String> b();
    }

    public static class e implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinder unused = h0t.l = iBinder;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static String A() {
        return "";
    }

    public static String B(Context context) {
        try {
            if (!j || i) {
                return "";
            }
            if (TextUtils.isEmpty(h) && !m) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    j1.h().b(new b(context));
                    return h;
                }
                m = true;
                return i0(context);
            }
            return h;
        } catch (Throwable unused) {
        }
    }

    public static String C() {
        return "";
    }

    public static String D(Context context) {
        if (n) {
            String str = f19554a;
            return str == null ? "" : str;
        }
        try {
            String str2 = f19554a;
            if (str2 != null && !"".equals(str2)) {
                return f19554a;
            }
            if (v(context, p0t.t("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                f19554a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (!TextUtils.isEmpty(f19554a)) {
                n = true;
                return f19554a;
            }
            try {
                String strD0 = d0(context);
                f19554a = strD0;
                if (!TextUtils.isEmpty(strD0)) {
                    n = true;
                    return f19554a;
                }
            } catch (Throwable unused) {
            }
            try {
                f19554a = e0(context);
                n = true;
            } catch (Throwable unused2) {
            }
            String str3 = f19554a;
            return str3 == null ? "" : str3;
        } catch (Throwable unused3) {
        }
    }

    public static String E() {
        return "";
    }

    public static String F(Context context) {
        try {
            TelephonyManager telephonyManagerF = f(context);
            if (telephonyManagerF == null) {
                return "";
            }
            String networkOperator = telephonyManagerF.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String G() {
        return o;
    }

    public static String H(Context context) {
        if (q) {
            return p;
        }
        try {
            k(context);
            TelephonyManager telephonyManagerF = f(context);
            if (telephonyManagerF == null) {
                return p;
            }
            String networkOperator = telephonyManagerF.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                p = networkOperator.substring(3);
                q = true;
                return p;
            }
            q = true;
            return p;
        } catch (Throwable unused) {
        }
    }

    public static int I(Context context) {
        try {
            return e(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String[] J() {
        return new String[]{"", ""};
    }

    public static int K(Context context) {
        try {
            return c(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String L() {
        return t;
    }

    public static NetworkInfo M(Context context) {
        ConnectivityManager connectivityManagerD;
        if (v(context, p0t.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerD = d(context)) != null) {
            return connectivityManagerD.getActiveNetworkInfo();
        }
        return null;
    }

    public static String N() {
        return s;
    }

    public static void O() {
        try {
            i2t.a();
        } catch (Throwable unused) {
        }
    }

    public static String P() {
        return "";
    }

    public static String Q(Context context) {
        String str;
        try {
            String str2 = f19557r;
            if (str2 != null && !"".equals(str2)) {
                return f19557r;
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
                str = i2 + Marker.ANY_MARKER + i3;
            } else {
                str = i3 + Marker.ANY_MARKER + i2;
            }
            f19557r = str;
            return f19557r;
        } catch (Throwable unused) {
        }
    }

    public static String R() {
        return "";
    }

    public static String S(Context context) {
        try {
            if (!v(context, p0t.t("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return y;
            }
            TelephonyManager telephonyManagerF = f(context);
            return telephonyManagerF == null ? "" : telephonyManagerF.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long T() {
        long j2 = v;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            v = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable unused) {
        }
        return v;
    }

    public static String U(Context context) {
        ConnectivityManager connectivityManagerD;
        NetworkInfo activeNetworkInfo;
        try {
            return (!v(context, p0t.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerD = d(context)) == null || (activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String V() {
        if (!TextUtils.isEmpty(x)) {
            return x;
        }
        String property = System.getProperty("os.arch");
        x = property;
        return property;
    }

    public static String W(Context context) {
        try {
            String strN = N();
            try {
                if (TextUtils.isEmpty(strN)) {
                    strN = n(context);
                }
                if (TextUtils.isEmpty(strN)) {
                    strN = D(context);
                }
                if (TextUtils.isEmpty(strN)) {
                    strN = B(context);
                }
                if (TextUtils.isEmpty(strN)) {
                    strN = E();
                }
                return TextUtils.isEmpty(strN) ? a(context) : strN;
            } catch (Throwable unused) {
                return strN;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String X(Context context) {
        return N() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + n(context) + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + W(context);
    }

    public static void Y() {
        B = -1;
        C = false;
        D = -1;
        E = false;
        z = "";
        A = false;
        p = "";
        q = false;
    }

    public static int Z(Context context) {
        int i2 = w;
        if (i2 != 0) {
            return i2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i3 = ((int) (memoryInfo.totalMem / 1024)) / 1024;
        w = i3;
        return i3;
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(u)) {
            return u;
        }
        try {
            String strO = i4t.o(context, "open_common", "a1", "");
            if (TextUtils.isEmpty(strO)) {
                u = "amap" + UUID.randomUUID().toString().replace(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, "").toLowerCase();
                SharedPreferences.Editor editorC = i4t.c(context, "open_common");
                i4t.j(editorC, "a1", p0t.p(u));
                i4t.f(editorC);
            } else {
                u = p0t.t(strO);
            }
            return u;
        } catch (Throwable unused) {
            return u;
        }
    }

    public static /* synthetic */ boolean a0() {
        m = true;
        return true;
    }

    public static String b(Context context) {
        if (A) {
            return z;
        }
        k(context);
        TelephonyManager telephonyManagerF = f(context);
        if (telephonyManagerF == null) {
            return z;
        }
        String simOperatorName = telephonyManagerF.getSimOperatorName();
        z = simOperatorName;
        if (TextUtils.isEmpty(simOperatorName)) {
            z = telephonyManagerF.getNetworkOperatorName();
        }
        A = true;
        return z;
    }

    public static String b0(Context context) {
        try {
            return b(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int c(Context context) {
        if (C) {
            return B;
        }
        k(context);
        if (context == null || !v(context, p0t.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return B;
        }
        ConnectivityManager connectivityManagerD = d(context);
        if (connectivityManagerD == null) {
            return B;
        }
        NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            C = true;
            return B;
        }
        int type = activeNetworkInfo.getType();
        B = type;
        C = true;
        return type;
    }

    public static ConnectivityManager d(Context context) {
        return (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
    }

    public static String d0(Context context) {
        try {
            String strO = i4t.o(context, "Alvin2", "UTDID2", "");
            return TextUtils.isEmpty(strO) ? i4t.o(context, "Alvin2", "UTDID", "") : strO;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int e(Context context) {
        ConnectivityManager connectivityManagerD;
        if (E) {
            return D;
        }
        k(context);
        if (v(context, p0t.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerD = d(context)) != null) {
            NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                D = activeNetworkInfo.getSubtype();
                E = true;
            }
            return D;
        }
        return D;
    }

    public static String e0(Context context) {
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

    public static TelephonyManager f(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static String f0(Context context) {
        try {
            if (!TextUtils.isEmpty(f19556k)) {
                return f19556k;
            }
            byte[] bArrDigest = MessageDigest.getInstance(p0t.t("IU0hBMQ")).digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                stringBuffer.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            String string = stringBuffer.toString();
            if (!TextUtils.isEmpty(string)) {
                f19556k = string;
            }
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String g(Context context) {
        String strH;
        if (!c) {
            return "";
        }
        try {
            strH = h(context);
        } catch (Throwable unused) {
            strH = null;
        }
        if (TextUtils.isEmpty(strH)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = p0t.t("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(j0t.e(p0t.t("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), j0t.g(strH), bytes), "UTF-8");
        } catch (Throwable unused2) {
            c = false;
            return "";
        }
    }

    public static String g0(Context context) {
        try {
            Class<?> cls = Class.forName(p0t.t("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object objInvoke = cls.getMethod(p0t.t("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (objInvoke != null) {
                String str = (String) objInvoke;
                h = str;
                return str;
            }
        } catch (Throwable th) {
            j2t.e(th, m.f13823a, "xm");
            i = true;
        }
        return h;
    }

    public static String h(Context context) {
        String strI;
        try {
            strI = i(context);
        } catch (Throwable unused) {
            strI = "";
        }
        if (TextUtils.isEmpty(strI)) {
            return context == null ? "" : context.getSharedPreferences(p0t.t("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(m0t.d(p0t.t("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
        }
        return strI;
    }

    public static String h0(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(p0t.t("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    int columnCount = cursorQuery.getColumnCount();
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        if (p0t.t("IdmFsdWU").equals(cursorQuery.getColumnName(i2))) {
                            h = cursorQuery.getString(i2);
                            break;
                        }
                    }
                }
                cursorQuery.close();
            }
        } catch (Throwable th) {
            i = true;
            j2t.e(th, m.f13823a, RomUtils.VIVO);
        }
        return h;
    }

    public static String i(Context context) {
        RandomAccessFile randomAccessFile;
        String[] strArrSplit;
        String strD = m0t.d(p0t.t("LYW1hcF9kZXZpY2VfYWRpdQ"));
        String strJ = j(context);
        if (TextUtils.isEmpty(strJ)) {
            return "";
        }
        File file = new File(strJ + File.separator + p0t.t("KYmFja3Vwcw"), p0t.t("MLmFkaXU"));
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
                            q(byteArrayOutputStream);
                        }
                    }
                    String str = new String(byteArrayOutputStream2.toByteArray(), "UTF-8");
                    if (!TextUtils.isEmpty(str) && str.contains(p0t.t("SIw")) && (strArrSplit = str.split(p0t.t("SIw"))) != null && strArrSplit.length == 2 && TextUtils.equals(strD, strArrSplit[0])) {
                        String str2 = strArrSplit[1];
                        q(byteArrayOutputStream2);
                        q(randomAccessFile);
                        return str2;
                    }
                    q(byteArrayOutputStream2);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                randomAccessFile = null;
            }
            q(randomAccessFile);
        }
        return "";
    }

    public static String i0(Context context) {
        String strT = p0t.t("IeGlhb21p");
        String str = Build.MANUFACTURER;
        if (!strT.equalsIgnoreCase(str)) {
            String strT2 = p0t.t("IeGlhb21p");
            String str2 = Build.BRAND;
            if (!strT2.equalsIgnoreCase(str2) && !p0t.t("IUkVETUk=").equalsIgnoreCase(str) && !p0t.t("IUkVETUk=").equalsIgnoreCase(str2)) {
                if (p0t.t("Idml2bw").equalsIgnoreCase(str) || p0t.t("Idml2bw").equalsIgnoreCase(str2)) {
                    return h0(context);
                }
                if (p0t.t("IaHVhd2Vp").equalsIgnoreCase(str) || p0t.t("IaHVhd2Vp").equalsIgnoreCase(str2) || p0t.t("ISE9OT1I=").equalsIgnoreCase(str)) {
                    return o(context, 2);
                }
                if (p0t.t("Mc2Ftc3VuZw").equalsIgnoreCase(str) || p0t.t("Mc2Ftc3VuZw").equalsIgnoreCase(str2)) {
                    return o(context, 4);
                }
                if (p0t.t("IT1BQTw").equalsIgnoreCase(str) || p0t.t("IT1BQTw").equalsIgnoreCase(str2) || p0t.t("MT25lUGx1cw").equalsIgnoreCase(str) || p0t.t("MT25lUGx1cw").equalsIgnoreCase(str2) || p0t.t("IUkVBTE1F").equalsIgnoreCase(str2)) {
                    return o(context, 5);
                }
                i = true;
                return h;
            }
        }
        return g0(context);
    }

    public static String j(Context context) {
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

    public static synchronized c k(Context context) {
        try {
            if (F == null) {
                if (context == null) {
                    return null;
                }
                c cVar = new c();
                F = cVar;
                cVar.a(context.getApplicationContext());
            }
            return F;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String m() {
        return e;
    }

    public static String n(Context context) {
        try {
            if (!TextUtils.isEmpty(f19555b)) {
                return f19555b;
            }
            if (context == null) {
                return "";
            }
            String strG = g(context);
            f19555b = strG;
            if (!TextUtils.isEmpty(strG)) {
                return f19555b;
            }
            if (x() == null || g) {
                return "";
            }
            g = true;
            j1.h().b(new a(context));
            return "";
        } catch (Throwable unused) {
        }
    }

    public static String o(Context context, int i2) {
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(p0t.t("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(p0t.t("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(p0t.t("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), p0t.t("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else {
                if (i2 != 5) {
                    i = true;
                    return h;
                }
                intent.setClassName(p0t.t("YY29tLmhleXRhcC5vcGVuaWQ"), p0t.t("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(p0t.t("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            }
            e eVar = new e();
            if (context.bindService(intent, eVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(h)) {
                    i3++;
                    if (l != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        if (i2 == 2) {
                            parcelObtain.writeInterfaceToken(p0t.t("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U"));
                        } else if (i2 != 4) {
                            if (i2 != 5) {
                                parcelObtain2.recycle();
                            } else {
                                try {
                                    parcelObtain.writeInterfaceToken(p0t.t("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                                    parcelObtain.writeString(context.getPackageName());
                                    parcelObtain.writeString(f0(context));
                                    parcelObtain.writeString(p0t.t("IT1VJRA"));
                                } catch (Throwable th) {
                                    try {
                                        j2t.e(th, "oac", String.valueOf(i2));
                                        parcelObtain2.recycle();
                                    } catch (Throwable th2) {
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th2;
                                    }
                                }
                            }
                            parcelObtain.recycle();
                        } else {
                            parcelObtain.writeInterfaceToken(p0t.t("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ"));
                        }
                        l.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        h = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                    Thread.sleep(15L);
                }
                context.unbindService(eVar);
                l = null;
            }
            return h;
        } catch (Throwable th3) {
            j2t.e(th3, m.f13823a, String.valueOf(i2));
            i = true;
            return h;
        }
    }

    public static void p(d dVar) {
        if (f == null) {
            f = dVar;
        }
    }

    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void r(String str) {
        e = str;
    }

    public static String t() {
        try {
            if (!TextUtils.isEmpty(d)) {
                return d;
            }
            d dVar = f;
            return dVar == null ? "" : dVar.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String u(Context context) {
        try {
            return b(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static boolean v(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static int w(Context context) {
        try {
            return e(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static d x() {
        return f;
    }

    public static int y(Context context) {
        try {
            return c(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String z() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            String strR = R();
            return strR.length() < 5 ? "" : strR.substring(3, 5);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
