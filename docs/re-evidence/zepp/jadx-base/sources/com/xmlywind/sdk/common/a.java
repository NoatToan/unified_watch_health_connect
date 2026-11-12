package com.xmlywind.sdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huami.ecg.core.db.entity.EcgData;
import com.tan.mark.SigNativeId;
import com.xmlywind.devicehelper.DeviceHelper;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.e.m;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntityGDPR;
import com.xmlywind.sdk.common.utils.DeviceUtils;
import com.xmlywind.sdk.common.utils.b;
import com.xmlywind.sdk.common.utils.f;
import com.xmlywind.sdk.common.utils.n;
import com.xmlywind.sdk.common.utils.p;
import com.xmlywind.windad.consent.WindAdConsentInformation;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public class a implements f.a {
    private static String i;
    private static volatile a j;
    private boolean A;
    private Location l;
    private f m;
    private String o;
    private String p;
    private int q;
    private String s;
    private String t;
    private String u;
    private String v;
    private Context w;
    private boolean x;
    private boolean y;
    private boolean z;
    private static final AtomicInteger b = new AtomicInteger(1);
    public static String a = Constants.SDK_VERSION;
    private static String c = EcgData.DEFAULT_DIGIT_VALUE;
    private static String d = "0";
    private static int e = 0;
    private static int f = 0;
    private static boolean g = true;
    private static int h = 0;
    private final int k = 9;
    private String n = null;
    private boolean r = true;

    /* JADX INFO: renamed from: com.xmlywind.sdk.common.a$a, reason: collision with other inner class name */
    public enum EnumC1068a {
        FORCE_PORTRAIT("portrait"),
        FORCE_LANDSCAPE("landscape"),
        DEVICE_ORIENTATION("device"),
        UNDEFINED("");

        private final String e;

        EnumC1068a(String str) {
            this.e = str;
        }
    }

    public static PackageInfo a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a() {
        return TextUtils.isEmpty(c) ? EcgData.DEFAULT_DIGIT_VALUE : c;
    }

    public static Map<String, String> a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, TextUtils.join(",", uri.getQueryParameters(str)));
        }
        return map;
    }

    public static void a(String str) {
        c = str;
    }

    public static boolean b() {
        return l().equalsIgnoreCase("1") || !q();
    }

    public static boolean b(Context context, String str) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.core.content.ContextCompat");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            cls = Class.forName("androidx.core.content.ContextCompat");
        } catch (Throwable unused2) {
        }
        if (cls != null) {
            try {
                n.a aVar = new n.a((Class) cls, "checkSelfPermission");
                aVar.a(Context.class, context);
                aVar.a(String.class, str);
                Integer num = (Integer) aVar.a();
                if (num != null && num.intValue() == 0) {
                    return true;
                }
            } catch (Throwable unused3) {
            }
        }
        return false;
    }

    public static String c() {
        return DeviceUtils.j();
    }

    public static String d() {
        return DeviceUtils.h();
    }

    public static String e() {
        return DeviceUtils.i();
    }

    public static Long f() {
        return Long.valueOf(DeviceUtils.a());
    }

    public static Integer g() {
        return Integer.valueOf(DeviceUtils.g());
    }

    public static String h() {
        try {
            return DeviceHelper.getMacAddress();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String i() {
        try {
            return DeviceUtils.b();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String j() {
        return Build.BOARD;
    }

    public static String k() {
        try {
            return DeviceHelper.getVAID();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String l() {
        return d;
    }

    public static int m() {
        return f;
    }

    public static a n() {
        if (j == null) {
            synchronized (a.class) {
                if (j == null) {
                    j = new a();
                }
            }
        }
        return j;
    }

    public static boolean o() {
        try {
            return DeviceUtils.c();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean p() {
        try {
            return DeviceUtils.k();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean q() {
        return g;
    }

    public static int r() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = b;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public String A() {
        try {
            if (SDKConfig.sharedInstance().isDisableBootMark()) {
                return "";
            }
            if (TextUtils.isEmpty(this.v)) {
                this.v = SigNativeId.getUpdateFromJNI();
                SigmobLog.i("updateId:" + this.v);
            }
        } catch (Throwable th) {
            SigmobLog.i("getUpdateId:" + th.getMessage());
        }
        return this.v;
    }

    public String B() {
        try {
            return DeviceUtils.f();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String C() {
        try {
            return DeviceHelper.getIMSI(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String D() {
        return DeviceUtils.e();
    }

    public boolean E() {
        try {
            return DeviceUtils.e(this.w);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Float F() {
        float fH;
        try {
            fH = DeviceUtils.h(this.w);
        } catch (Throwable unused) {
            fH = 0.0f;
        }
        return Float.valueOf(fH);
    }

    public Integer G() {
        int iJ;
        try {
            iJ = DeviceUtils.j(this.w);
        } catch (Throwable unused) {
            iJ = 0;
        }
        return Integer.valueOf(iJ);
    }

    public Boolean H() {
        try {
            return Boolean.valueOf(DeviceUtils.i(this.w));
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    public int I() {
        try {
            return (int) DeviceUtils.l(this.w);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public Integer J() {
        int iA;
        try {
            iA = DeviceUtils.A(this.w);
        } catch (Throwable unused) {
            iA = 0;
        }
        return Integer.valueOf(iA);
    }

    public Integer K() {
        int iY;
        try {
            iY = DeviceUtils.y(this.w);
        } catch (Throwable unused) {
            iY = 0;
        }
        return Integer.valueOf(iY);
    }

    public String L() {
        try {
            return DeviceUtils.b(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Integer M() {
        try {
            return Integer.valueOf(DeviceUtils.B(this.w));
        } catch (Throwable unused) {
            return null;
        }
    }

    public Integer N() {
        try {
            return Integer.valueOf(DeviceUtils.z(this.w));
        } catch (Throwable unused) {
            return null;
        }
    }

    public String O() {
        try {
            return String.valueOf(this.w.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String P() {
        try {
            return b.c(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Integer Q() {
        int iG;
        try {
            iG = DeviceUtils.g(this.w);
        } catch (Throwable unused) {
            iG = 0;
        }
        return Integer.valueOf(iG);
    }

    public String R() {
        try {
            return b.d(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public int S() {
        try {
            return DeviceUtils.d().a();
        } catch (Throwable unused) {
            return DeviceUtils.a.UNKNOWN.a();
        }
    }

    public String T() {
        try {
            return DeviceUtils.u(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String U() {
        try {
            return DeviceHelper.getWifimac(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String V() {
        try {
            return DeviceHelper.getWifiName(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String W() {
        try {
            return DeviceUtils.n(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Locale X() {
        try {
            return DeviceUtils.m(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String Y() {
        String strZ = n().Z();
        return !TextUtils.isEmpty(strZ) ? strZ : n().s();
    }

    public String Z() {
        try {
            int disable_up_OAid = SDKConfig.sharedInstance().getDisable_up_OAid();
            if (disable_up_OAid == 0 ? Build.VERSION.SDK_INT > 28 : !(disable_up_OAid != 1 || Build.VERSION.SDK_INT < 23)) {
                return DeviceHelper.getOAID(this.w);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public int a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public String a(String str, String str2) {
        Resources resources;
        int identifier;
        Context context = this.w;
        return (context == null || (resources = context.getResources()) == null || (identifier = resources.getIdentifier(str, "string", this.w.getPackageName())) == 0) ? str2 : resources.getString(identifier);
    }

    public String a(String str, String str2, Object... objArr) {
        Resources resources;
        Context context = this.w;
        if (context == null || (resources = context.getResources()) == null) {
            return str2;
        }
        int identifier = resources.getIdentifier(str, "string", this.w.getPackageName());
        if (identifier == 0) {
            return String.format(str2, objArr);
        }
        SigmobLog.d("getStringResources resid" + identifier);
        return resources.getString(identifier, objArr);
    }

    public void a(int i2) {
        f = i2;
        SharedPreferences.Editor editorEdit = p.a(this.w).edit();
        editorEdit.putInt(Constants.WIND_AGERESTRICTED_STATUS, f);
        editorEdit.commit();
        PointEntityGDPR pointEntityGDPR = new PointEntityGDPR();
        pointEntityGDPR.setAge_restricted(String.valueOf(i2));
        pointEntityGDPR.setAc_type("401");
        pointEntityGDPR.setSub_category(PointCategory.COPPA);
        pointEntityGDPR.setCategory("privacy");
        pointEntityGDPR.commit();
    }

    public void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(this.o)) {
            Context applicationContext = context.getApplicationContext();
            this.w = applicationContext;
            this.o = str;
            this.p = p.a(applicationContext).getString("uid", null);
            this.m = new f(this.w, this);
            DeviceUtils.w(this.w);
        }
    }

    public void a(Location location) {
        this.l = location;
    }

    public void a(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 20 || windowInsets == null || !windowInsets.isRound()) {
            return;
        }
        this.q = windowInsets.getSystemWindowInsetBottom();
    }

    @Override // com.xmlywind.sdk.common.utils.f.a
    public void a(com.xmlywind.sdk.common.utils.a aVar, com.xmlywind.sdk.common.utils.a aVar2) {
    }

    public void a(boolean z) {
        SharedPreferences.Editor editorEdit = p.a(this.w).edit();
        editorEdit.putBoolean(Constants.USER_GDPR_REGION, z);
        editorEdit.commit();
        h = z ? 1 : 2;
    }

    public DisplayMetrics aa() {
        try {
            return DeviceUtils.p(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String ab() {
        return this.o;
    }

    public String ac() {
        return this.p;
    }

    public int ad() {
        return this.q;
    }

    public int ae() {
        return e;
    }

    public Context af() {
        return this.w;
    }

    public String ag() {
        try {
            return DeviceUtils.o(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Long ah() {
        try {
            return Long.valueOf(DeviceUtils.k(this.w));
        } catch (Throwable unused) {
            return null;
        }
    }

    public DisplayMetrics ai() {
        try {
            return DeviceUtils.C(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean aj() {
        try {
            return m.b(new URL(SDKConfig.getConfigUrl()).getHost());
        } catch (Throwable unused) {
            return false;
        }
    }

    public String ak() {
        try {
            return DeviceUtils.d(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<PackageInfo> al() {
        try {
            return b.b(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public LocationManager am() {
        try {
            if (DeviceHelper.isCanUseLocation(this.w)) {
                return (LocationManager) this.w.getSystemService("location");
            }
            return null;
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public Location an() {
        try {
            Location location = this.l;
            if (location != null) {
                return location;
            }
            LocationManager locationManagerAm = am();
            if (this.x && locationManagerAm != null && DeviceHelper.isCanRetryLocation()) {
                SigmobLog.d("private :use_location ");
                Location lastKnownLocation = am().getLastKnownLocation("passive");
                if (lastKnownLocation != null) {
                    this.l = lastKnownLocation;
                }
            }
        } catch (Exception unused) {
        }
        return this.l;
    }

    public String ao() {
        try {
            return (String) this.w.getPackageManager().getApplicationLabel(this.w.getApplicationInfo());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean ap() {
        return this.z;
    }

    public boolean aq() {
        return this.y;
    }

    public boolean ar() {
        return this.A;
    }

    public String b(int i2) {
        try {
            if (TextUtils.isEmpty(this.s)) {
                if (DeviceHelper.isCanUsePhoneState(this.w) && DeviceHelper.isCanRetryIMEI()) {
                    this.s = DeviceHelper.getIMEI(this.w);
                    if (i2 != -1) {
                        this.t = DeviceHelper.getIMEI(this.w, i2);
                        this.u = DeviceHelper.getIMEI(this.w, i2);
                    }
                }
                return null;
            }
            if (i2 == -1) {
                return this.s;
            }
            return i2 == 0 ? this.t : this.u;
        } catch (Throwable unused) {
        }
    }

    public String b(Context context) {
        StringBuilder sb;
        String string = "";
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            String[] strArr = packageManager.getPackageInfo(packageName, 4096).requestedPermissions;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (packageManager.checkPermission(strArr[i2], packageName) == 0) {
                    if (i2 == strArr.length - 1) {
                        sb = new StringBuilder();
                        sb.append(string);
                        sb.append(strArr[i2]);
                    } else {
                        sb = new StringBuilder();
                        sb.append(string);
                        sb.append(strArr[i2]);
                        sb.append(",");
                    }
                    string = sb.toString();
                }
            }
            SigmobLog.d("permissionReq:" + string);
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : string;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public void b(String str) {
        d = str;
        SharedPreferences.Editor editorEdit = p.a(this.w).edit();
        editorEdit.putString(Constants.WIND_CONSENT_STATUS, str);
        editorEdit.commit();
    }

    public void b(boolean z) {
        this.x = z;
    }

    public void c(int i2) {
        e = i2;
        SharedPreferences.Editor editorEdit = p.a(this.w).edit();
        editorEdit.putInt(Constants.WIND_USER_AGE, e);
        editorEdit.commit();
        PointEntityGDPR pointEntityGDPR = new PointEntityGDPR();
        pointEntityGDPR.setAge(String.valueOf(i2));
        pointEntityGDPR.setAc_type("401");
        pointEntityGDPR.setSub_category(PointCategory.COPPA);
        pointEntityGDPR.setCategory("privacy");
        pointEntityGDPR.commit();
    }

    public void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (TextUtils.isEmpty(this.p) || !str.equalsIgnoreCase(this.p)) {
                this.p = str;
                SharedPreferences.Editor editorEdit = p.a(this.w).edit();
                editorEdit.putString("uid", str);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    public void c(boolean z) {
        SharedPreferences.Editor editorEdit = p.a(this.w).edit();
        editorEdit.putBoolean(Constants.EXT_GDPR_REGION, z);
        editorEdit.commit();
        g = z && SDKConfig.isGDPRRegion();
    }

    public void d(String str) {
        PointEntityGDPR pointEntityGDPR = new PointEntityGDPR();
        pointEntityGDPR.setUser_consent(str);
        String str2 = "1";
        pointEntityGDPR.setGdpr_region(q() ? "1" : "0");
        try {
            if (!WindAdConsentInformation.getInstance(this.w).isRequestLocationInEeaOrUnknown()) {
                str2 = "0";
            }
            pointEntityGDPR.setGdpr_dialog_region(str2);
        } catch (Throwable unused) {
        }
        pointEntityGDPR.setSub_category(PointCategory.CONSENT);
        pointEntityGDPR.setCategory(PointCategory.GDPR);
        pointEntityGDPR.setAc_type("401");
        pointEntityGDPR.commit();
    }

    public void d(boolean z) {
        this.z = z;
    }

    public int e(String str) {
        Resources resources;
        Context context = this.w;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getIdentifier(str, "style", this.w.getPackageName());
    }

    public void e(boolean z) {
        this.y = z;
    }

    public void f(boolean z) {
        this.A = z;
    }

    public String s() {
        try {
            if (Build.VERSION.SDK_INT > 28 && !SDKConfig.sharedInstance().getOaidApiDisable()) {
                return DeviceHelper.getOAID_API(this.w);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public String t() {
        try {
            return DeviceUtils.x(this.w);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String u() {
        try {
            return DeviceUtils.a(this.w, "SHA1");
        } catch (Throwable unused) {
            return null;
        }
    }

    public String v() {
        try {
            return DeviceUtils.a(this.w, "MD5");
        } catch (Throwable unused) {
            return null;
        }
    }

    public String w() {
        try {
            return this.m.a().b;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean x() {
        try {
            return this.m.a().d;
        } catch (Throwable unused) {
            return false;
        }
    }

    public String y() {
        try {
            return b(-1);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String z() {
        try {
            if (SDKConfig.sharedInstance().isDisableBootMark()) {
                return "";
            }
            if (TextUtils.isEmpty(i)) {
                byte[] bootFromJNI = SigNativeId.getBootFromJNI();
                if (bootFromJNI != null && bootFromJNI.length > 0) {
                    i = new String(bootFromJNI);
                }
                SigmobLog.i("origin bootId:" + i);
                if (!TextUtils.isEmpty(i)) {
                    String strReplaceAll = i.replaceAll("\\s*|\t|\r|\n", "");
                    i = strReplaceAll;
                    if (strReplaceAll.length() > 36) {
                        i = i.substring(0, 36);
                    }
                }
                SigmobLog.i("bootId:" + i);
            }
        } catch (Throwable th) {
            SigmobLog.i("getBootId:" + th.getMessage());
        }
        return i;
    }
}
