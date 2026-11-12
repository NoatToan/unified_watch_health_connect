package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.huawei.agconnect.apms.Agent;
import com.huawei.health.h5pro.utils.RequestCode;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.videoedit.param.CanvasConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Pattern;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
final class znv extends g {
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private String ag;
    private String ah;
    private String ai;
    private boolean aj;
    private int ak;
    private String al;
    private String am;
    private boolean an;
    private String ap;
    private boolean aq;
    private String ar;
    private JSONObject at;
    private JSONObject au;
    private JSONObject aw;
    private JSONObject ax;
    private JSONArray ay;
    private JSONArray az;
    private JSONObject ba;
    private JSONObject bb;
    private zno bc;
    private String bd;
    private String be;
    private String bg;
    private long as = -1;
    private long ao = -1;
    private long av = -1;

    String e() {
        return this.bd;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public void a(int i, MagnesSettings magnesSettings) {
        try {
            Context contextA = magnesSettings.a();
            switch (i) {
                case 1:
                    this.bd = c(contextA, magnesSettings.b());
                    break;
                case 2:
                    this.be = a(contextA);
                    break;
                case 3:
                    if (this.bc.d(i)) {
                        this.bg = i(contextA);
                    }
                    break;
                case 8:
                    this.al = "5.5.1.release";
                    break;
                case 9:
                    if (this.bc.d(i)) {
                        this.am = lib.android.paypal.com.magnessdk.c.h.d.REMOTE_CONFIG_URL.toString();
                    }
                    break;
                case 14:
                    if (this.bc.d(i)) {
                        this.ab = Build.MODEL;
                    }
                    break;
                case 15:
                    if (this.bc.d(i)) {
                        this.ad = Build.DEVICE;
                    }
                    break;
                case 32:
                    if (this.bc.d(i)) {
                        this.af = h(contextA);
                    }
                    break;
                case 34:
                    if (this.bc.d(i)) {
                        this.ai = magnesSettings.h();
                    }
                    break;
                case 37:
                    if (this.bc.d(i)) {
                        this.aa = Build.VERSION.RELEASE;
                    }
                    break;
                case 38:
                    if (this.bc.d(i)) {
                        this.ah = CanvasConfig.FULL_CONFIG;
                    }
                    break;
                case 47:
                    if (this.bc.d(i)) {
                        this.aj = contextA.getPackageManager().hasSystemFeature("android.hardware.telephony");
                    }
                    break;
                case 52:
                    if (this.bc.d(i)) {
                        this.as = i();
                    }
                    break;
                case 59:
                    if (this.bc.d(i)) {
                        this.an = e.e(contextA);
                    }
                    break;
                case 60:
                    if (this.bc.d(i)) {
                        this.aq = c.d(contextA);
                    }
                    break;
                case 62:
                    if (this.bc.d(i)) {
                        this.ak = magnesSettings.e();
                    }
                    break;
                case 63:
                    if (this.bc.d(i)) {
                        this.ae = i(contextA);
                    }
                    break;
                case 65:
                    if (this.bc.d(i)) {
                        this.ao = d(contextA);
                    }
                    break;
                case 66:
                    if (this.bc.d(i)) {
                        this.av = e(contextA);
                    }
                    break;
                case 69:
                    if (this.bc.d(i)) {
                        this.ac = c(contextA);
                    }
                    break;
                case 70:
                    if (this.bc.d(i)) {
                        this.ag = j(contextA);
                    }
                    break;
                case RequestCode.SCANNER_PERMISSION_REQUEST_CODE /* 86 */:
                    JSONObject jSONObjectB = b(contextA);
                    this.au = jSONObjectB;
                    g.k1 = jSONObjectB.optString("id");
                    break;
                case 88:
                    if (this.bc.k()) {
                        this.ay = this.bc.j();
                    }
                    break;
                case 90:
                    if (this.bc.d(i)) {
                        this.aw = d();
                    }
                    break;
                case 91:
                    if (this.bc.d(i)) {
                        this.at = g(contextA);
                    }
                    break;
                case 93:
                    if (this.bc.d(i)) {
                        this.ax = c();
                    }
                    break;
                case 94:
                    if (this.bc.d(i)) {
                        this.bb = b();
                    }
                    break;
                case 95:
                    if (this.bc.d(i)) {
                        this.ba = f(contextA);
                    }
                    break;
                case 100:
                    if (this.bc.d(i)) {
                        this.ap = c.e(contextA);
                    }
                    break;
                case 101:
                    if (this.bc.d(i)) {
                        this.az = b(magnesSettings);
                    }
                    break;
                case 103:
                    if (this.bc.d(i)) {
                        this.ar = e.a(contextA);
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Boolean[] f54365a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f54366b = 5;

        private static boolean k() {
            String str = Build.PRODUCT;
            return str.matches(".*_?sdk_?.*") || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.VBOX_86P.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENY_MOTION.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.DRIOD_4X.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDY_OSX.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.REMIXEMU.toString());
        }

        private static boolean o() {
            String str = Build.MODEL;
            return str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.SDK.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GOODLE_SDK.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDROID_SDK_BUILD_FOR_X86.toString());
        }

        private static boolean m() {
            String str = Build.MANUFACTURER;
            return str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.UNKNOWN.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENY_MOTION.toString()) || str.contains(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDY_OS.toString());
        }

        private static boolean n() {
            String str = Build.HARDWARE;
            return str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GOLDFISH.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.VBOX_86.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDY.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.RANCHU.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.TTVM_X86.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDROID_X86.toString());
        }

        private static boolean l() {
            return Build.FINGERPRINT.startsWith(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENERIC.toString());
        }

        private static boolean i() {
            String str = Build.DEVICE;
            return str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDY_OSX.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.DROID_4X.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENERIC.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENERIC_X86.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.VBOX_86P.toString());
        }

        private static boolean h() {
            String str = Build.BRAND;
            return str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENERIC.toString()) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.GENERIC_X86.toString()) || str.equals(Agent.OS_NAME) || str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0336c.ANDY_OS.toString());
        }

        private static boolean j() {
            return m() || h() || i() || n() || o() || l() || k();
        }

        private static boolean g() {
            return new File(Environment.getExternalStorageDirectory().toString() + File.separatorChar + "windows" + File.separatorChar + "BstSharedFolder").exists();
        }

        private static boolean f() {
            return znm.c(lib.android.paypal.com.magnessdk.c.f.f40248b, "");
        }

        private static boolean d() {
            return znm.c(lib.android.paypal.com.magnessdk.c.f.f40247a, "");
        }

        private static boolean e() {
            return znm.c(lib.android.paypal.com.magnessdk.c.f.d, "");
        }

        static boolean e(Context context) {
            String strA = a(context);
            return strA != null && strA.contains("1");
        }

        private static boolean a() {
            return znm.c(lib.android.paypal.com.magnessdk.c.f.f40249c, "");
        }

        private static boolean c() {
            return e() || f() || d();
        }

        static String a(Context context) {
            boolean zJ;
            if (f54365a == null) {
                f54365a = new Boolean[f54366b];
                int i = 0;
                while (i < f54366b) {
                    if (i == 0) {
                        zJ = j();
                    } else if (i == 1) {
                        zJ = b();
                    } else if (i == 2) {
                        zJ = a();
                    } else if (i != 3) {
                        zJ = i != 4 ? false : c();
                    } else {
                        zJ = c(context);
                    }
                    f54365a[i] = Boolean.valueOf(zJ);
                    i++;
                }
            }
            return znp.b(f54365a);
        }

        private static boolean c(Context context) {
            return znu.b(context, new ArrayList(Arrays.asList(lib.android.paypal.com.magnessdk.c.f.e)));
        }

        private static boolean b() {
            return g() || znm.c(lib.android.paypal.com.magnessdk.c.f.h, "");
        }
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a(MagnesSettings magnesSettings, znn znnVar, zno znoVar) {
        this.bc = znoVar;
        lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 0, "collecting RiskBlobCoreData");
        a(1, magnesSettings);
        a(2, magnesSettings);
        a(3, magnesSettings);
        a(65, magnesSettings);
        a(66, magnesSettings);
        a(69, magnesSettings);
        a(8, magnesSettings);
        a(9, magnesSettings);
        a(14, magnesSettings);
        a(15, magnesSettings);
        a(70, magnesSettings);
        a(59, magnesSettings);
        a(103, magnesSettings);
        a(60, magnesSettings);
        a(100, magnesSettings);
        a(32, magnesSettings);
        a(86, magnesSettings);
        a(62, magnesSettings);
        a(34, magnesSettings);
        a(37, magnesSettings);
        a(38, magnesSettings);
        a(63, magnesSettings);
        a(47, magnesSettings);
        a(52, magnesSettings);
        a(88, magnesSettings);
        g.j1 = false;
        if (a(znnVar, magnesSettings.e(), g.k1, g.r1, magnesSettings.a())) {
            a(91, magnesSettings);
            a(90, magnesSettings);
            a(93, magnesSettings);
            a(94, magnesSettings);
            a(95, magnesSettings);
            a(101, magnesSettings);
        }
        return a();
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString(), this.bd);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.APP_ID.toString(), this.be);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.ANDROID_ID.toString(), this.ac);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.APP_VERSION.toString(), this.bg);
            String string = lib.android.paypal.com.magnessdk.c.d.APP_FIRST_INSTALL_TIME.toString();
            long j = this.ao;
            Long lValueOf = null;
            jSONObject.put(string, j == -1 ? null : Long.valueOf(j));
            String string2 = lib.android.paypal.com.magnessdk.c.d.APP_LAST_UPDATE_TIME.toString();
            long j2 = this.av;
            jSONObject.put(string2, j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.CONF_URL.toString(), this.am);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.COMP_VERSION.toString(), this.al);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.DEVICE_MODEL.toString(), this.ab);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.DEVICE_NAME.toString(), this.ad);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.GSF_ID.toString(), this.ag);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.IS_EMULATOR.toString(), this.an);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EMULATOR_FLAGS.toString(), this.ar);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.IS_ROOTED.toString(), this.aq);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.ROOTED_FLAGS.toString(), this.ap);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.OS_TYPE.toString(), Agent.OS_NAME);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.OS_VERSION.toString(), this.aa);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.PAYLOAD_TYPE.toString(), this.ah);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SMS_ENABLED.toString(), this.aj);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.MAC_ADDRS.toString(), this.af);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.MAGNES_GUID.toString(), this.au);
            String string3 = lib.android.paypal.com.magnessdk.c.d.MAGNES_SOURCE.toString();
            int i = this.ak;
            jSONObject.put(string3, i == 0 ? null : Integer.valueOf(i));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.NOTIF_TOKEN.toString(), this.ai);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SOURCE_APP_VERSION.toString(), this.ae);
            String string4 = lib.android.paypal.com.magnessdk.c.d.TOTAL_STORAGE_SPACE.toString();
            long j3 = this.as;
            if (j3 != -1) {
                lValueOf = Long.valueOf(j3);
            }
            jSONObject.put(string4, lValueOf);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.NOT_COLLECTIBLE_LIST.toString(), this.ay);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SENSOR_METADATA.toString(), this.az);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SCREEN.toString(), this.at);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.CPU.toString(), this.aw);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.DISK.toString(), this.ax);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SYSTEM.toString(), this.bb);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.USER_AGENT.toString(), this.ba);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.IN_TREATMENT.toString(), g.j1);
            return jSONObject;
        } catch (JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return jSONObject;
        }
    }

    private JSONObject f(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dua", a((Object) WebSettings.getDefaultUserAgent(context)));
            return jSONObject;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return jSONObject;
        }
    }

    private JSONObject g(Context context) {
        float f;
        int iHeight;
        int iWidth;
        int i;
        float f2;
        float f3;
        float f4;
        JSONObject jSONObject = new JSONObject();
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                iWidth = bounds.width();
                iHeight = bounds.height();
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                iWidth = i2;
                iHeight = i3;
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f = displayMetrics.density;
            i = displayMetrics.densityDpi;
            f3 = displayMetrics.scaledDensity;
            f4 = displayMetrics.xdpi;
            f2 = displayMetrics.ydpi;
        } else {
            f = 12345.0f;
            iHeight = 12345;
            iWidth = 12345;
            i = 12345;
            f2 = 12345.0f;
            f3 = 12345.0f;
            f4 = 12345.0f;
        }
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.WIDTH.toString(), a(Integer.valueOf(iWidth)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.HEIGHT.toString(), a(Integer.valueOf(iHeight)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.DENSITY.toString(), a(Float.valueOf(f)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.DENSITY_DPI.toString(), a(Integer.valueOf(i)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.SCALE.toString(), a(Float.valueOf(f3)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.X_DPI.toString(), a(Float.valueOf(f4)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0337d.Y_DPI.toString(), a(Float.valueOf(f2)));
            return jSONObject;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return jSONObject;
        }
    }

    private String h(Context context) {
        WifiInfo connectionInfo = a(context, "android.permission.ACCESS_WIFI_STATE") ? ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo() : null;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    private String j(Context context) {
        Uri uri;
        try {
            uri = Uri.parse("content://com.google.android.gsf.gservices");
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null || !a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, new String[]{"android_id"}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            try {
                if (cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
                    return Long.toHexString(Long.parseLong(cursorQuery.getString(1)));
                }
                return null;
            } catch (NumberFormatException e2) {
                lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
                return null;
            }
        } finally {
            cursorQuery.close();
        }
    }

    private String i(Context context) throws PackageManager.NameNotFoundException {
        return znp.b(context);
    }

    private long i() throws IllegalArgumentException {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f54364c = lib.android.paypal.com.magnessdk.c.k.b.NUMBER_OF_ROOTED_FLAGS.a();
        private static Boolean[] d = null;

        static boolean d(Context context) {
            String strE = e(context);
            if (strE != null) {
                return strE.contains("1");
            }
            return false;
        }

        private static boolean c() {
            String str = Build.TAGS;
            return str != null && str.contains("test-keys");
        }

        private static boolean b() {
            try {
                return new File(e("superUserApk")).exists();
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.e((Class<?>) c.class, 3, e);
                return false;
            }
        }

        private static String e(String str) throws IOException {
            Properties properties = new Properties();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("suFileName=/system/xbin/su\nsuperUserApk=/system/app/Superuser.apk\nemptyIp=0.0.0.0".getBytes("UTF-8"));
            try {
                try {
                    properties.load(byteArrayInputStream);
                } catch (Exception e) {
                    lib.android.paypal.com.magnessdk.log.a.e((Class<?>) c.class, 3, e);
                }
                return properties.getProperty(str);
            } finally {
                byteArrayInputStream.close();
            }
        }

        static String e(Context context) {
            boolean zC;
            lib.android.paypal.com.magnessdk.c.k.a aVar;
            if (d == null) {
                d = new Boolean[f54364c];
                for (int i = 0; i < f54364c; i++) {
                    lib.android.paypal.com.magnessdk.c.k.b bVarA = lib.android.paypal.com.magnessdk.c.k.b.a(i);
                    if (bVarA == null) {
                        return null;
                    }
                    switch (d.e[bVarA.ordinal()]) {
                        case 1:
                            zC = c();
                            continue;
                            d[i] = Boolean.valueOf(zC);
                            break;
                        case 2:
                            zC = d();
                            continue;
                            d[i] = Boolean.valueOf(zC);
                            break;
                        case 3:
                            zC = b();
                            continue;
                            d[i] = Boolean.valueOf(zC);
                            break;
                        case 4:
                            zC = c(context);
                            continue;
                            d[i] = Boolean.valueOf(zC);
                            break;
                        case 5:
                            aVar = lib.android.paypal.com.magnessdk.c.k.a.SU;
                            break;
                        case 6:
                            aVar = lib.android.paypal.com.magnessdk.c.k.a.BUSYBOX;
                            break;
                        case 7:
                            aVar = lib.android.paypal.com.magnessdk.c.k.a.MAGISK;
                            break;
                        default:
                            zC = false;
                            continue;
                            d[i] = Boolean.valueOf(zC);
                            break;
                    }
                    zC = b(aVar.toString());
                    d[i] = Boolean.valueOf(zC);
                }
            }
            return znp.b(d);
        }

        private static boolean b(String str) {
            return znm.c(lib.android.paypal.com.magnessdk.c.k.SU_PATHS.a(), str);
        }

        private static boolean c(Context context) {
            return znu.b(context, new ArrayList(Arrays.asList(lib.android.paypal.com.magnessdk.c.k.KNOWN_ROOT_APPS_PACKAGES.a())));
        }

        private static boolean d() {
            try {
                return new File(e("suFileName")).exists();
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.e((Class<?>) c.class, 3, e);
                return false;
            }
        }

        private c() {
        }
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String property = System.getProperty("os.name");
            String property2 = System.getProperty("os.version");
            if (TextUtils.isEmpty(property)) {
                property = "";
            }
            if (TextUtils.isEmpty(property2)) {
                property2 = "";
            }
            String str = String.format("%s %s", property, property2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.VERSION.toString(), a((Object) str.trim()));
            }
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.BOARD.toString(), a((Object) Build.BOARD));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.BOOTLOADER.toString(), a((Object) Build.BOOTLOADER));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.CPU_ABI1.toString(), a((Object) Build.SUPPORTED_ABIS[0]));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.DISPLAY.toString(), a((Object) Build.DISPLAY));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.RADIO.toString(), a((Object) Build.getRadioVersion()));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.FINGERPRINT.toString(), a((Object) Build.FINGERPRINT));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.HARDWARE.toString(), a((Object) Build.HARDWARE));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.MANUFACTURER.toString(), a((Object) Build.MANUFACTURER));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.PRODUCT.toString(), a((Object) Build.PRODUCT));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.TIME.toString(), a(Long.valueOf(Build.TIME)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.SYSTEM_TYPE.toString(), a((Object) System.getProperty("os.arch")));
            return jSONObject;
        } catch (JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return jSONObject;
        }
    }

    private long e(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        long jC = c(Environment.getDataDirectory().getPath());
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.b.TOTAL_SD.toString(), a(Long.valueOf(a(601))));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.b.TOTAL_UD.toString(), a(Long.valueOf(jC)));
            return jSONObject;
        } catch (JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return jSONObject;
        }
    }

    private long d(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
    }

    private JSONObject d() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            int iB = b(3);
            int iB2 = b(2);
            int iB3 = b(1);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.a.MIN_FREQUENCY.toString(), a(Integer.valueOf(iB2)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.a.MAX_FREQUENCY.toString(), a(Integer.valueOf(iB3)));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.a.CORES.toString(), a(Integer.valueOf(iB)));
            return jSONObject;
        } catch (JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return jSONObject;
        }
    }

    private String c(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private String c(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerAG", 0);
        String string = sharedPreferences.getString("RiskManagerAG", "");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (str == null || str.equals(string)) {
            if (!string.equals("")) {
                return string;
            }
            str = znp.c(true);
        }
        editorEdit.putString("RiskManagerAG", str);
        editorEdit.apply();
        return str;
    }

    private long c(String str) {
        StatFs statFs = new StatFs(str);
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }

        a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    private int b(int i) throws Throwable {
        int length;
        File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
        if (fileArrListFiles == null) {
            length = 12345;
        } else if (i == 3) {
            length = fileArrListFiles.length;
        } else {
            int i2 = 0;
            if (i == 2) {
                int length2 = fileArrListFiles.length;
                int i3 = Integer.MAX_VALUE;
                while (true) {
                    if (i2 >= length2) {
                        length = i3;
                        break;
                    }
                    String strE = znm.e(new File(fileArrListFiles[i2].getPath() + "/cpufreq/cpuinfo_min_freq"));
                    if (strE == null || strE.equals("-403")) {
                        length = g.d;
                        break;
                    }
                    int i4 = Integer.parseInt(strE);
                    if (i4 < i3) {
                        i3 = i4;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int length3 = fileArrListFiles.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        length = i2;
                        break;
                    }
                    File file = new File(fileArrListFiles[i5].getPath() + "/cpufreq/cpuinfo_max_freq");
                    String strE2 = znm.e(file);
                    if (strE2 == null || strE2.equals("-403")) {
                        length = g.d;
                        break;
                    }
                    int i6 = Integer.parseInt(znm.e(file));
                    if (i6 > i2) {
                        i2 = i6;
                    }
                    i5++;
                }
            } else {
                length = 12345;
            }
        }
        if (length == 0 || length == Integer.MAX_VALUE) {
            return 12345;
        }
        return length;
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.k.b.values().length];
            e = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.k.b.IS_TEST_KEYS_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.k.b.IS_SU_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.k.b.IS_SUPER_USER_APK_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.k.b.DETECT_ROOT_MANAGEMENT_APPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_SU.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_BUSYBOX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_MAGISK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private JSONArray b(MagnesSettings magnesSettings) {
        try {
            JSONArray jSONArray = new JSONArray();
            SensorManager sensorManager = (SensorManager) magnesSettings.a().getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor != null) {
                JSONObject jSONObjectC = znp.c(defaultSensor);
                jSONObjectC.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.AC.toString());
                jSONArray.put(jSONObjectC);
            }
            if (defaultSensor2 != null) {
                JSONObject jSONObjectC2 = znp.c(defaultSensor2);
                jSONObjectC2.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.GY.toString());
                jSONArray.put(jSONObjectC2);
            }
            if (defaultSensor3 != null) {
                JSONObject jSONObjectC3 = znp.c(defaultSensor3);
                jSONObjectC3.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.MG.toString());
                jSONArray.put(jSONObjectC3);
            }
            return jSONArray;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e((Class<?>) znv.class, 3, e2);
            return null;
        }
    }

    znv() {
    }
}
