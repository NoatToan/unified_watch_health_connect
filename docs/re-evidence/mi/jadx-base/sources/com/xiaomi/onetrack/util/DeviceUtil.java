package com.xiaomi.onetrack.util;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceUtil {
    private static String A = null;
    private static String B = null;
    private static String C = null;
    private static String D = null;
    private static String E = null;
    private static Boolean F = null;
    private static String G = null;
    private static volatile boolean H = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f13900a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f13901b = 6;
    private static final String c = "DeviceUtil";
    private static final String d = "";
    private static final String e = "ro.build.description";
    private static final int f = 15;
    private static final int g = 14;
    private static Method h;
    private static Method i;
    private static Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f13902k;
    private static Method l;
    private static Method m;
    private static volatile String n;
    private static volatile String o;
    private static String p;
    private static String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f13903r;
    private static String s;
    private static String t;
    private static String u;
    private static String v;
    private static String w;
    private static String x;
    private static String y;
    private static String z;

    public static class GAIDClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f13904a = "GAIDClient";

        private GAIDClient() {
        }

        public static String a(Context context) {
            if (!c(context)) {
                p.a(f13904a, "Google play service is not available");
                return "";
            }
            AdvertisingConnection advertisingConnection = new AdvertisingConnection(null);
            try {
                try {
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, advertisingConnection, 1)) {
                        return new a(advertisingConnection.a()).a();
                    }
                } catch (Exception e) {
                    p.a(f13904a, "Query Google ADID failed ", e);
                }
                return "";
            } finally {
                context.unbindService(advertisingConnection);
            }
        }

        public static boolean b(Context context) {
            if (!c(context)) {
                p.a(f13904a, "Google play service is not available");
                return false;
            }
            AdvertisingConnection advertisingConnection = new AdvertisingConnection(null);
            try {
                try {
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, advertisingConnection, 1)) {
                        return new a(advertisingConnection.a()).a(true);
                    }
                } catch (Exception e) {
                    p.a(f13904a, "Query Google isLimitAdTrackingEnabled failed ", e);
                }
                return false;
            } finally {
                context.unbindService(advertisingConnection);
            }
        }

        private static boolean c(Context context) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 16384);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public static final class AdvertisingConnection implements ServiceConnection {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final int f13905a = 30000;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f13906b;
            private IBinder c;

            private AdvertisingConnection() {
                this.f13906b = false;
            }

            public IBinder a() throws InterruptedException {
                IBinder iBinder = this.c;
                if (iBinder != null) {
                    return iBinder;
                }
                if (iBinder == null && !this.f13906b) {
                    synchronized (this) {
                        try {
                            wait(30000L);
                            if (this.c == null) {
                                throw new InterruptedException("Not connect or connect timeout to google play service");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return this.c;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this) {
                    this.c = iBinder;
                    notifyAll();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                this.f13906b = true;
                this.c = null;
            }

            public /* synthetic */ AdvertisingConnection(h hVar) {
                this();
            }
        }

        public static final class a implements IInterface {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f13907a;

            public a(IBinder iBinder) {
                this.f13907a = iBinder;
            }

            public String a() throws RemoteException {
                if (this.f13907a == null) {
                    return "";
                }
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f13907a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13907a;
            }

            public boolean a(boolean z) throws RemoteException {
                if (this.f13907a == null) {
                    return false;
                }
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f13907a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    static {
        try {
            h = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Throwable th) {
            p.b(c, "sGetProp init failed ex: " + th.getMessage());
        }
        try {
            Class<?> cls = Class.forName("miui.telephony.TelephonyManagerEx");
            f13902k = cls.getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
            i = cls.getMethod("getImeiList", new Class[0]);
            j = cls.getMethod("getMeidList", new Class[0]);
            m = cls.getMethod("getSubscriberIdForSlot", Integer.TYPE);
        } catch (Throwable th2) {
            p.b(c, "TelephonyManagerEx init failed ex: " + th2.getMessage());
        }
        try {
            l = Class.forName("android.telephony.TelephonyManager").getMethod("getImei", Integer.TYPE);
        } catch (Throwable th3) {
            p.b(c, "sGetImeiForSlot init failed ex: " + th3.getMessage());
        }
    }

    private static String A(Context context) {
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        D(context);
        return !TextUtils.isEmpty(p) ? p : "";
    }

    private static List<String> B(Context context) {
        if (l == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String str = (String) l.invoke(telephonyManager, 0);
            if (c(str)) {
                arrayList.add(str);
            }
            if (n()) {
                String str2 = (String) l.invoke(telephonyManager, 1);
                if (c(str2)) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            p.a(c, "getImeiListAboveLollipop failed ex: " + e2.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    private static List<String> C(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            Class<?> cls = Class.forName("android.telephony.TelephonyManager");
            if (!n()) {
                String deviceId = ((TelephonyManager) cls.getMethod("getDefault", new Class[0]).invoke(null, new Object[0])).getDeviceId();
                if (c(deviceId)) {
                    arrayList.add(deviceId);
                }
                return arrayList;
            }
            Class<?> cls2 = Integer.TYPE;
            String deviceId2 = ((TelephonyManager) cls.getMethod("getDefault", cls2).invoke(null, 0)).getDeviceId();
            String deviceId3 = ((TelephonyManager) cls.getMethod("getDefault", cls2).invoke(null, 1)).getDeviceId();
            if (c(deviceId2)) {
                arrayList.add(deviceId2);
            }
            if (c(deviceId3)) {
                arrayList.add(deviceId3);
            }
            return arrayList;
        } catch (Throwable th) {
            p.a(c, "getImeiListBelowLollipop failed ex: " + th.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    private static List<String> D(Context context) {
        if (u.a(context)) {
            Method method = j;
            if (method != null) {
                try {
                    List<String> list = (List) method.invoke(f13902k, new Object[0]);
                    if (list != null && list.size() > 0 && !b(list)) {
                        Collections.sort(list);
                        p = list.get(0);
                        return list;
                    }
                } catch (Exception e2) {
                    p.a(c, "queryMeidList failed ex: " + e2.getMessage());
                }
            }
            try {
                Class<?> cls = Class.forName("android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Method method2 = cls.getMethod("getMeid", new Class[0]);
                String str = method2 != null ? (String) method2.invoke(telephonyManager, new Object[0]) : null;
                if (d(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    p = str;
                    return arrayList;
                }
            } catch (Throwable th) {
                p.a(c, "queryMeidList->getMeid failed ex: " + th.getMessage());
            }
        }
        return null;
    }

    private static boolean E(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static boolean F(Context context) {
        return a.a(context) || (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    public static long a(long j2) {
        float f2 = j2;
        if (f2 > 900.0d) {
            f2 /= 1000.0f;
        }
        if (f2 > 900.0d) {
            f2 /= 1000.0f;
        }
        if (f2 > 900.0d) {
            f2 /= 1000.0f;
        }
        return (long) f2;
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(u)) {
            return u;
        }
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        String strC = com.xiaomi.onetrack.d.d.c(strA);
        u = strC;
        return strC;
    }

    private static long c(long j2) {
        long j3 = 1;
        long j4 = 1;
        while (true) {
            long j5 = j3 * j4;
            if (j5 >= j2) {
                return j5;
            }
            j3 <<= 1;
            if (j3 > 512) {
                j4 *= 1000;
                j3 = 1;
            }
        }
    }

    public static String d(Context context) {
        if (!TextUtils.isEmpty(A)) {
            return A;
        }
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        String strD = com.xiaomi.onetrack.d.d.d(strA);
        A = strD;
        return strD;
    }

    public static String e(Context context) {
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        r(context);
        return !TextUtils.isEmpty(o) ? o : "";
    }

    public static String f(Context context) {
        if (!TextUtils.isEmpty(v)) {
            return v;
        }
        String strE = e(context);
        if (TextUtils.isEmpty(strE)) {
            return "";
        }
        String strC = com.xiaomi.onetrack.d.d.c(strE);
        v = strC;
        return strC;
    }

    public static String g(Context context) {
        if (!TextUtils.isEmpty(z)) {
            return z;
        }
        String strE = e(context);
        if (TextUtils.isEmpty(strE)) {
            return "";
        }
        String strE2 = com.xiaomi.onetrack.d.d.e(strE);
        z = strE2;
        return strE2;
    }

    public static String h(Context context) {
        if (!TextUtils.isEmpty(B)) {
            return B;
        }
        String strE = e(context);
        if (TextUtils.isEmpty(strE)) {
            return "";
        }
        String strD = com.xiaomi.onetrack.d.d.d(strE);
        B = strD;
        return strD;
    }

    public static String i(Context context) {
        if (!TextUtils.isEmpty(w)) {
            return w;
        }
        String strA = A(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        String strC = com.xiaomi.onetrack.d.d.c(strA);
        w = strC;
        return strC;
    }

    public static String j(Context context) {
        if (!TextUtils.isEmpty(C)) {
            return C;
        }
        String strA = A(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        String strE = com.xiaomi.onetrack.d.d.e(strA);
        C = strE;
        return strE;
    }

    public static String k(Context context) throws Throwable {
        if (!TextUtils.isEmpty(q)) {
            return q;
        }
        String strB = a.b(context);
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        q = strB;
        return strB;
    }

    public static String l(Context context) {
        if (!TextUtils.isEmpty(f13903r)) {
            return f13903r;
        }
        String strU = u(context);
        if (TextUtils.isEmpty(strU)) {
            return "";
        }
        f13903r = strU;
        return strU;
    }

    public static String m(Context context) {
        if (!TextUtils.isEmpty(x)) {
            return x;
        }
        String strL = l(context);
        if (TextUtils.isEmpty(strL)) {
            return "";
        }
        String strC = com.xiaomi.onetrack.d.d.c(strL);
        x = strC;
        return strC;
    }

    public static String n(Context context) {
        if (!TextUtils.isEmpty(E)) {
            return E;
        }
        String strL = l(context);
        if (TextUtils.isEmpty(strL)) {
            return "";
        }
        String strE = com.xiaomi.onetrack.d.d.e(strL);
        E = strE;
        return strE;
    }

    private static boolean o() {
        return false;
    }

    public static String p(Context context) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        if (GAIDClient.b(context)) {
            return "";
        }
        String strA = GAIDClient.a(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        t = strA;
        return strA;
    }

    public static List<String> q(Context context) {
        List<String> listR = r(context);
        ArrayList arrayList = new ArrayList();
        if (listR != null && !listR.isEmpty()) {
            for (int i2 = 0; i2 < listR.size(); i2++) {
                if (!TextUtils.isEmpty(listR.get(i2))) {
                    arrayList.add(i2, com.xiaomi.onetrack.d.d.c(listR.get(i2)));
                }
            }
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    public static List<String> r(Context context) {
        List<String> listB = null;
        if (u.a(context)) {
            if (H) {
                return null;
            }
            List<String> listM = m();
            listB = (listM == null || listM.isEmpty()) ? B(context) : listM;
            H = true;
        }
        if (listB != null && !listB.isEmpty()) {
            Collections.sort(listB);
            n = listB.get(0);
            if (listB.size() >= 2) {
                o = listB.get(1);
            }
        }
        return listB;
    }

    public static String s(Context context) {
        try {
            List<String> listD = D(context);
            if (listD == null) {
                return "";
            }
            Collections.sort(listD, new h());
            for (int i2 = 0; i2 < listD.size(); i2++) {
                listD.set(i2, com.xiaomi.onetrack.d.d.h(listD.get(i2)));
            }
            return listD.toString();
        } catch (Throwable th) {
            p.b(c, "getMeidListMd5 e", th);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static List<String> t(Context context) {
        String str;
        String str2;
        if (!u.b(context)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (!n()) {
                String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
                if (e(subscriberId)) {
                    arrayList.add(subscriberId);
                }
                return arrayList;
            }
            Class<?> cls = Class.forName("android.telephony.TelephonyManager");
            int i2 = Build.VERSION.SDK_INT;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            Class<?> cls2 = Class.forName("android.telephony.SubscriptionManager");
            if (i2 < 29) {
                str = a(cls, cls2, telephonyManager, subscriptionManager)[0];
                str2 = a(cls, cls2, telephonyManager, subscriptionManager)[1];
            } else {
                str = b(cls, cls2, telephonyManager, subscriptionManager)[0];
                str2 = b(cls, cls2, telephonyManager, subscriptionManager)[1];
            }
            if (!e(str)) {
                str = "";
            }
            arrayList.add(str);
            if (!e(str2)) {
                str2 = "";
            }
            arrayList.add(str2);
            return arrayList;
        } catch (SecurityException unused) {
            p.a(c, "getImsiList failed with on permission");
            return null;
        } catch (Throwable th) {
            p.b(c, "getImsiList failed: " + th.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String u(Context context) {
        String str = null;
        if (u.b(context)) {
            try {
                Method method = Class.forName("android.os.Build").getMethod("getSerial", new Class[0]);
                if (method != null) {
                    str = (String) method.invoke(null, new Object[0]);
                }
            } catch (Throwable th) {
                p.a(c, "querySerial failed ex: " + th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) || "unknown".equals(str)) {
            return "";
        }
        f13903r = str;
        return str;
    }

    public static String v(Context context) {
        try {
            List<String> listT = t(context);
            if (listT == null) {
                return "";
            }
            for (int i2 = 0; i2 < listT.size(); i2++) {
                listT.set(i2, com.xiaomi.onetrack.d.d.h(listT.get(i2)));
            }
            return listT.toString();
        } catch (Throwable th) {
            p.b(p.a(c), "getImeiListMd5 failed!", th);
            return "";
        }
    }

    public static String w(Context context) {
        if (!TextUtils.isEmpty(G)) {
            return G;
        }
        if (p()) {
            G = "Pad";
            return "Pad";
        }
        if (!F(context)) {
            return AIApiConstants.Phone.NAME;
        }
        G = "Tv";
        return "Tv";
    }

    public static boolean x(Context context) {
        if (F == null) {
            F = Boolean.valueOf(a.a(context));
        }
        return F.booleanValue();
    }

    public static String y(Context context) {
        return com.xiaomi.onetrack.util.oaid.a.a().a(context);
    }

    public static String z(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return String.format("%d*%d", Integer.valueOf(point.y), Integer.valueOf(point.x));
    }

    public static String c(Context context) {
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        String strE = com.xiaomi.onetrack.d.d.e(strA);
        y = strE;
        return strE;
    }

    public static String o(Context context) {
        if (!TextUtils.isEmpty(s)) {
            return s;
        }
        try {
            String type = context.getContentResolver().getType(Uri.parse("content://com.miui.analytics.server.AnalyticsProvider/aaid"));
            if (!TextUtils.isEmpty(type)) {
                s = type;
                return type;
            }
            Object objInvoke = Class.forName("android.provider.MiuiSettings$Ad").getDeclaredMethod("getAaid", ContentResolver.class).invoke(null, context.getContentResolver());
            if (!(objInvoke instanceof String) || TextUtils.isEmpty((String) objInvoke)) {
                return "";
            }
            String str = (String) objInvoke;
            s = str;
            return str;
        } catch (Throwable th) {
            p.a(c, "getAaid failed ex: " + th.getMessage());
            return "";
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f13908a = "box";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f13909b = "tvbox";
        private static final String c = "projector";
        private static final String d = "tv";
        private static final String e = "mi_device_mac";
        private static Signature[] f;
        private static final Signature g = new Signature("3082033b30820223a003020102020900a07a328482f70d2a300d06092a864886f70d01010505003035310b30090603550406130255533113301106035504080c0a43616c69666f726e69613111300f06035504070c084d6f756e7461696e301e170d3133303430313033303831325a170d3430303831373033303831325a3035310b30090603550406130255533113301106035504080c0a43616c69666f726e69613111300f06035504070c084d6f756e7461696e30820120300d06092a864886f70d01010105000382010d00308201080282010100ac678c9234a0226edbeb75a43e8e18f632d8c8a094c087fffbbb0b5e4429d845e36bffbe2d7098e320855258aa777368c18c538f968063d5d61663dc946ab03acbb31d00a27d452e12e6d42865e27d6d0ad2d8b12cf3b3096a7ec66a21db2a6a697857fd4d29fb4cdf294b3371d7601f2e3f190c0164efa543897026c719b334808e4f612fe3a3da589115fc30f9ca89862feefdf31a9164ecb295dcf7767e673be2192dda64f88189fd6e6ebd62e572c7997c2385a0ea9292ec799dee8f87596fc73aa123fb6f577d09ac0c123179c3bdbc978c2fe6194eb9fa4ab3658bfe8b44040bb13fe7809409e622189379fbc63966ab36521793547b01673ecb5f15cf020103a350304e301d0603551d0e0416041447203684e562385ada79108c4c94c5055037592f301f0603551d2304183016801447203684e562385ada79108c4c94c5055037592f300c0603551d13040530030101ff300d06092a864886f70d010105050003820101008d530fe05c6fe694c7559ddb5dd2c556528dd3cad4f7580f439f9a90a4681d37ce246b9a6681bdd5a5437f0b8bba903e39bac309fc0e9ee5553681612e723e9ec4f6abab6b643b33013f09246a9b5db7703b96f838fb27b00612f5fcd431bea32f68350ae51a4a1d012c520c401db7cccc15a7b19c4310b0c3bfc625ce5744744d0b9eeb02b0a4e7d51ed59849ce580b9f7c3062c84b9a0b13cc211e1c916c289820266a610801e3316c915649804571b147beadbf88d3b517ee04121d40630853f2f2a506bb788620de9648faeacff568e5033a666316bc2046526674ed3de25ceefdc4ad3628f1a230fd41bf9ca9f6a078173850dba555768fe1c191483ad9");

        private a() {
        }

        public static boolean a(Context context) {
            if (f == null) {
                f = new Signature[]{c(context)};
            }
            Signature signature = f[0];
            return signature != null && signature.equals(g);
        }

        public static String b(Context context) throws Throwable {
            String strA;
            try {
                String string = Settings.Global.getString(context.getContentResolver(), e);
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            } catch (Exception unused) {
            }
            try {
                String str = Build.PRODUCT;
                String strB = DeviceUtil.b("ro.product.model");
                boolean z = true;
                if ((!TextUtils.equals("tv", a()) || "batman".equals(str) || "conan".equals(str)) && !"augustrush".equals(str) && !"casablanca".equals(str)) {
                    z = false;
                }
                if (TextUtils.equals("me2", str)) {
                    strA = DeviceUtil.b("persist.service.bdroid.bdaddr");
                } else if ((TextUtils.equals("transformers", str) && TextUtils.equals("MiBOX4C", strB)) || TextUtils.equals("dolphin-zorro", str)) {
                    strA = a("/sys/class/net/wlan0/address");
                } else {
                    strA = z ? a("/sys/class/net/eth0/address") : a("ro.boot.btmac");
                }
                return !TextUtils.isEmpty(strA) ? strA.trim() : "";
            } catch (Exception e2) {
                p.a(DeviceUtil.c, "getMiTvMac exception", e2);
                return "";
            }
        }

        private static Signature c(Context context) {
            try {
                return a(context.getPackageManager().getPackageInfo(PluginPackageConstant.RN_DIR_A, 64));
            } catch (Exception unused) {
                return null;
            }
        }

        private static Signature a(PackageInfo packageInfo) {
            Signature[] signatureArr;
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            return signatureArr[0];
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        private static String a(String str) throws Throwable {
            String string = "";
            ?? r1 = 0;
            StringBuilder sb = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str)), 512);
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            sb2.append(line);
                            string = sb2.toString();
                            sb = sb2;
                        }
                        m.a(bufferedReader2);
                        r1 = sb;
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        p.b(DeviceUtil.c, "catEntry exception", e);
                        m.a(bufferedReader);
                        r1 = bufferedReader;
                    } catch (Throwable th) {
                        th = th;
                        r1 = bufferedReader2;
                        m.a((Closeable) r1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
            return string;
        }

        private static String a() {
            try {
                Class<?> cls = Class.forName("mitv.common.ConfigurationManager");
                int i = Integer.parseInt(String.valueOf(cls.getMethod("getProductCategory", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]), new Object[0])));
                Class<?> cls2 = Class.forName("mitv.tv.TvContext");
                if (i == Integer.parseInt(String.valueOf(a(cls2, "PRODUCT_CATEGORY_MITV")))) {
                    return "tv";
                }
                if (i == Integer.parseInt(String.valueOf(a(cls2, "PRODUCT_CATEGORY_MIBOX")))) {
                    return f13908a;
                }
                if (i == Integer.parseInt(String.valueOf(a(cls2, "PRODUCT_CATEGORY_MITVBOX")))) {
                    return f13909b;
                }
                if (i != Integer.parseInt(String.valueOf(a(cls2, "PRODUCT_CATEGORY_MIPROJECTOR")))) {
                    return "";
                }
                return c;
            } catch (Throwable th) {
                p.a(DeviceUtil.c, "getMiTvProductCategory exception: " + th.getMessage());
                return "";
            }
        }

        private static <T> T a(Class<?> cls, String str) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return (T) declaredField.get(null);
            } catch (Exception e2) {
                p.b(DeviceUtil.c, "getStaticVariableValue exception", e2);
                return null;
            }
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(n)) {
            return n;
        }
        r(context);
        if (!TextUtils.isEmpty(n)) {
            return n;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        try {
            Method method = h;
            if (method != null) {
                return String.valueOf(method.invoke(null, str));
            }
        } catch (Exception e2) {
            p.a(c, "getProp failed ex: " + e2.getMessage());
        }
        return null;
    }

    private static boolean d(String str) {
        return (str == null || str.length() != 14 || str.matches("^0*$")) ? false : true;
    }

    private static boolean e(String str) {
        return str != null && str.length() >= 6 && str.length() <= 15 && !str.matches("^0*$");
    }

    public static String f() {
        try {
            String strB = b("ro.product.model.real");
            return TextUtils.isEmpty(strB) ? c() : strB;
        } catch (Exception e2) {
            p.b(c, "getModelReal Exception: ", e2);
            return "";
        }
    }

    public static String g() {
        try {
            String strA = ab.a("ro.product.mod_device", "");
            return TextUtils.isEmpty(strA) ? Build.DEVICE : strA;
        } catch (Exception e2) {
            p.b(c, "getModDevice Exception: ", e2);
            return "";
        }
    }

    public static String h() {
        return ab.a(e, "");
    }

    public static String i() {
        try {
            return ab.a("ro.product.manufacturer", "");
        } catch (Exception e2) {
            p.b(p.a(c), "getProductManufacturer e", e2);
            return "";
        }
    }

    public static long j() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1073741824;
    }

    public static String k() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return String.format("%dGB", Long.valueOf(b(statFs.getBlockSizeLong() * statFs.getBlockCountLong())));
    }

    public static long l() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return a(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong());
    }

    private static List<String> m() {
        if (i == null || o()) {
            return null;
        }
        try {
            List<String> list = (List) i.invoke(f13902k, new Object[0]);
            if (list == null || list.size() <= 0 || a(list)) {
                return null;
            }
            return list;
        } catch (Exception e2) {
            p.a(c, "getImeiListFromMiui failed ex: " + e2.getMessage());
            return null;
        }
    }

    private static boolean n() {
        if ("dsds".equals(b("persist.radio.multisim.config"))) {
            return true;
        }
        String str = Build.DEVICE;
        return "lcsh92_wet_jb9".equals(str) || "lcsh92_wet_tdd".equals(str) || "HM2013022".equals(str) || "HM2013023".equals(str) || "armani".equals(str) || "HM2014011".equals(str) || "HM2014012".equals(str);
    }

    private static boolean p() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_TABLET").get(null)).booleanValue();
        } catch (Throwable th) {
            p.b(c, "get miui.os.Build Exception: " + th.getMessage());
            try {
                return ((Boolean) Class.forName("miui.util.FeatureParser").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "is_pad", Boolean.FALSE)).booleanValue();
            } catch (Throwable th2) {
                p.b(c, "get miui.util.FeatureParser Exception: " + th2.getMessage());
                return false;
            }
        }
    }

    private static boolean c(String str) {
        return (str == null || str.length() != 15 || str.matches("^0*$")) ? false : true;
    }

    public static String d() {
        return b("ro.product.marketname");
    }

    public static String e() {
        return Build.MANUFACTURER;
    }

    public static void a() {
        t = null;
    }

    public static String c() {
        return Build.MODEL;
    }

    private static boolean a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!c(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static String[] a(Class<?> cls, Class<?> cls2, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        Method method;
        Object obj;
        String[] strArr = new String[2];
        try {
            Class<?> cls3 = Integer.TYPE;
            String str = (String) cls.getMethod("getSubscriberId", cls3).invoke(telephonyManager, Integer.valueOf(((int[]) cls2.getMethod("getSubId", cls3).invoke(subscriptionManager, 0))[0]));
            strArr[0] = str;
            if (e(str) || (method = m) == null || (obj = f13902k) == null) {
                strArr[1] = (String) cls.getMethod("getSubscriberId", cls3).invoke(telephonyManager, Integer.valueOf(((int[]) cls2.getMethod("getSubId", cls3).invoke(subscriptionManager, 1))[0]));
            } else {
                strArr[0] = (String) method.invoke(obj, 0);
                strArr[1] = (String) m.invoke(f13902k, 1);
            }
        } catch (Exception e2) {
            p.a(c, "getImsiFromLToP: " + e2);
        }
        return strArr;
    }

    private static String[] b(Class<?> cls, Class<?> cls2, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        String[] strArr = new String[2];
        try {
            Class<?> cls3 = Integer.TYPE;
            int[] iArr = (int[]) cls2.getMethod("getSubscriptionIds", cls3).invoke(subscriptionManager, 0);
            if (iArr != null) {
                strArr[0] = (String) cls.getMethod("getSubscriberId", cls3).invoke(telephonyManager, Integer.valueOf(iArr[0]));
            }
        } catch (Exception e2) {
            p.b(c, "get imsi1 above Android Q exception:" + e2);
        }
        try {
            Class<?> cls4 = Integer.TYPE;
            int[] iArr2 = (int[]) cls2.getMethod("getSubscriptionIds", cls4).invoke(subscriptionManager, 1);
            if (iArr2 != null) {
                strArr[1] = (String) cls.getMethod("getSubscriberId", cls4).invoke(telephonyManager, Integer.valueOf(iArr2[0]));
            }
        } catch (Exception e3) {
            p.b(c, "get imsi2 above Android Q exception:" + e3);
        }
        return strArr;
    }

    public static String b() {
        return b("ro.product.name");
    }

    private static long b(long j2) {
        long jPow;
        if (j2 >= 8000000000L) {
            jPow = (long) Math.pow(2.0d, Math.ceil(Math.log(j2 / FolmeCore.NANOS_TO_S) / Math.log(2.0d)));
        } else {
            jPow = (j2 / FolmeCore.NANOS_TO_S) + 1;
        }
        long jC = jPow * FolmeCore.NANOS_TO_S;
        if (jC < j2) {
            jC = c(j2);
        }
        return jC / FolmeCore.NANOS_TO_S;
    }
}
