package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.MagnesSource;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.g;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
final class zns extends g {
    private TelephonyManager ac;
    private ConnectivityManager ae;
    private String af;
    private String ag;
    private WifiManager ai;
    private PowerManager aj;
    private BatteryManager ak;
    private String al;
    private LocationManager am;
    private String an;
    private PackageManager ao;
    private String ap;
    private Location aq;
    private String ar;
    private String as;
    private String at;
    private JSONObject au;
    private JSONObject av;
    private JSONObject aw;
    private String ax;
    private String ay;
    private String az;
    private String ba;
    private JSONObject bb;
    private JSONObject bc;
    private zno bd;
    private String be;
    private boolean bf;
    private String bg;
    private Handler bh;
    private String bi;
    private String bj;
    private String bl;
    private String bm;
    private String bn;
    private String bo;
    private String bp;
    private String bq;
    private String br;
    private List<String> bs;
    private List<String> bt;
    private List<String> bu;
    private String bw;
    private boolean by;
    private boolean bz;
    private boolean ca;
    private boolean cb;
    private boolean cc;
    private boolean cd;
    private boolean ce;
    private boolean cf;
    private boolean cg;
    private boolean ch;
    private NetworkInfo ci;
    private boolean cj;
    private boolean ck;
    private Map<String, String> cl;
    private WifiInfo cn;
    private int co = -1;
    private long cp = -1;
    private int cu = -1;
    private int ad = -1;
    private int ab = -1;
    private int ah = -1;
    private long bv = -1;
    private long bx = -1;
    private long cq = -1;
    private int cm = -1;
    private int cv = -1;
    private int ct = -1;
    private int aa = -1;
    private znt bk = znt.b();

    @Override // lib.android.paypal.com.magnessdk.g
    public void a(int i, MagnesSettings magnesSettings) {
        WifiInfo wifiInfo;
        TelephonyManager telephonyManager;
        WifiInfo wifiInfo2;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        String meid;
        try {
            Context contextA = magnesSettings.a();
            if (i == 4) {
                if (this.bd.d(i)) {
                    this.co = this.cv;
                    return;
                }
                return;
            }
            String bssid = null;
            String networkOperator = null;
            List<String> list = null;
            ssid = null;
            ssid = null;
            String ssid = null;
            String strA = null;
            bssid = null;
            bssid = null;
            if (i == 5) {
                if (this.bd.d(i)) {
                    if (Build.VERSION.SDK_INT < 27) {
                        wifiInfo = this.cn;
                        if (wifiInfo != null) {
                            bssid = wifiInfo.getBSSID();
                        }
                    } else if (h() && (wifiInfo = this.cn) != null) {
                        bssid = wifiInfo.getBSSID();
                    }
                    this.af = bssid;
                    return;
                }
                return;
            }
            if (i == 6) {
                if (this.bd.d(i)) {
                    this.cp = this.cq;
                    return;
                }
                return;
            }
            if (i == 42) {
                if (this.bd.d(i)) {
                    this.bl = znp.c(true);
                    return;
                }
                return;
            }
            if (i == 43) {
                if (this.bd.d(i)) {
                    this.bz = new ServiceState().getRoaming();
                    return;
                }
                return;
            }
            if (i == 45) {
                if (this.bd.d(i)) {
                    TelephonyManager telephonyManager4 = this.ac;
                    if (telephonyManager4 != null) {
                        strA = a(telephonyManager4);
                    }
                    this.bo = strA;
                    return;
                }
                return;
            }
            if (i == 46) {
                if (this.bd.d(i) && this.ce && (telephonyManager = this.ac) != null) {
                    if (Build.VERSION.SDK_INT < 29 || this.ca) {
                        this.bi = telephonyManager.getSimSerialNumber();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 48) {
                if (this.bd.d(i)) {
                    if (Build.VERSION.SDK_INT < 27) {
                        wifiInfo2 = this.cn;
                        if (wifiInfo2 != null) {
                            ssid = wifiInfo2.getSSID();
                        }
                    } else if (h() && (wifiInfo2 = this.cn) != null) {
                        ssid = wifiInfo2.getSSID();
                    }
                    this.bm = ssid;
                    return;
                }
                return;
            }
            if (i == 49) {
                if (this.bd.d(i) && this.ce && (telephonyManager2 = this.ac) != null) {
                    if (Build.VERSION.SDK_INT < 29 || this.ca) {
                        this.br = telephonyManager2.getSubscriberId();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 71) {
                if (this.bd.d(i)) {
                    this.ar = i();
                    return;
                }
                return;
            }
            if (i == 72) {
                if (this.bd.d(i)) {
                    this.ap = f();
                    return;
                }
                return;
            }
            if (i == 84) {
                if (this.bd.d(i)) {
                    this.bt = j() ? b(this.ai) : null;
                    return;
                }
                return;
            }
            if (i == 85) {
                this.bq = c(this.bw, this.an, this.bv, this.bd.f());
                return;
            }
            if (i == 11) {
                if (this.bd.d(i)) {
                    this.at = c();
                    return;
                }
                return;
            }
            if (i == 13) {
                if (this.bd.d(i) && this.ce && (telephonyManager3 = this.ac) != null) {
                    if (Build.VERSION.SDK_INT < 29 || this.ca) {
                        if (telephonyManager3.getPhoneType() == 1) {
                            meid = this.ac.getImei();
                        } else if (this.ac.getPhoneType() != 2) {
                            return;
                        } else {
                            meid = this.ac.getMeid();
                        }
                        this.az = meid;
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 16) {
                if (this.bd.d(i)) {
                    this.bx = SystemClock.uptimeMillis();
                    return;
                }
                return;
            }
            if (i == 21) {
                if (this.bd.d(i)) {
                    this.ay = e();
                    return;
                }
                return;
            }
            if (i == 23) {
                if (this.bd.d(i)) {
                    List<String> listB = b();
                    if (!listB.isEmpty()) {
                        list = listB;
                    }
                    this.bs = list;
                    return;
                }
                return;
            }
            if (i == 53) {
                if (this.bd.d(i)) {
                    this.ba = TimeZone.getDefault().getDisplayName(TimeZone.getDefault().inDaylightTime(new Date()), 1, Locale.ENGLISH);
                    return;
                }
                return;
            }
            if (i == 68) {
                if (this.bd.d(i) && this.ce && this.ac != null) {
                    if (Build.VERSION.SDK_INT < 29 || this.ca) {
                        this.al = Build.getSerial();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 75) {
                if (this.bd.d(i)) {
                    this.bu = d(true);
                    return;
                }
                return;
            }
            if (i == 87) {
                this.bp = d();
                return;
            }
            if (i == 89) {
                if (this.bd.d(i)) {
                    this.aw = e(contextA, this.ak, this.aj);
                    return;
                }
                return;
            }
            if (i == 98) {
                if (this.bd.d(i)) {
                    this.bb = g(contextA);
                    return;
                }
                return;
            }
            if (i == 99) {
                if (this.bd.d(i)) {
                    this.ch = d(contextA);
                    return;
                }
                return;
            }
            switch (i) {
                case 27:
                    if (this.bd.d(i)) {
                        this.bg = Locale.getDefault().getCountry();
                    }
                    break;
                case 28:
                    if (this.bd.d(i)) {
                        this.be = Locale.getDefault().getLanguage();
                    }
                    break;
                case 29:
                    if (this.bd.d(i)) {
                        this.aq = h() ? e(this.am) : null;
                    }
                    break;
                case 30:
                    if (this.bd.d(i)) {
                        this.ah = this.cm;
                    }
                    break;
                default:
                    switch (i) {
                        case 56:
                            if (this.bd.d(i)) {
                                TelephonyManager telephonyManager5 = this.ac;
                                if (telephonyManager5 != null) {
                                    networkOperator = telephonyManager5.getNetworkOperator();
                                }
                                this.ag = networkOperator;
                            }
                            break;
                        case 57:
                            if (this.bd.d(i)) {
                                this.ab = this.aa;
                            }
                            break;
                        case 58:
                            if (this.bd.d(i)) {
                                this.ad = this.ct;
                            }
                            break;
                        default:
                            switch (i) {
                                case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
                                    if (this.bd.d(i)) {
                                        this.by = TimeZone.getDefault().inDaylightTime(new Date());
                                    }
                                    break;
                                case 80:
                                    if (this.bd.d(i)) {
                                        this.cu = TimeZone.getDefault().getOffset(new Date().getTime());
                                    }
                                    break;
                                case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
                                    this.ax = d(this.bw + this.bv);
                                    break;
                                case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                                    if (this.bd.d(i) && znq.d().e.e() == MagnesSource.PAYPAL.getVersion()) {
                                        i(contextA);
                                        this.as = e(contextA);
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 91:
                                            if (this.bd.d(i)) {
                                                this.bc = f(contextA);
                                            }
                                            break;
                                        case GolfCourseInfo.DATA_LENGTH /* 92 */:
                                            if (this.bd.d(i)) {
                                                this.au = j(contextA);
                                            }
                                            break;
                                        case 93:
                                            if (this.bd.d(i)) {
                                                this.av = c(contextA);
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (AssertionError e) {
            e = e;
            a.e((Class<?>) zns.class, 3, e);
        } catch (Exception e2) {
            e = e2;
            a.e((Class<?>) zns.class, 3, e);
        }
    }

    JSONObject b(MagnesSettings magnesSettings, znn znnVar, zno znoVar, String str, String str2, HashMap<String, String> map, Handler handler) {
        TelephonyManager telephonyManager;
        a.e((Class<?>) zns.class, 0, "collecting RiskBlobDynamicData");
        this.bd = znoVar;
        Context contextA = magnesSettings.a();
        this.cd = magnesSettings.f();
        this.ac = (TelephonyManager) contextA.getSystemService("phone");
        this.ai = (WifiManager) contextA.getApplicationContext().getSystemService("wifi");
        this.am = (LocationManager) contextA.getSystemService("location");
        this.ae = (ConnectivityManager) contextA.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        this.ak = (BatteryManager) contextA.getSystemService("batterymanager");
        this.aj = (PowerManager) contextA.getSystemService("power");
        this.ao = contextA.getPackageManager();
        boolean zA = a(contextA, "android.permission.ACCESS_FINE_LOCATION");
        this.cg = zA;
        boolean z = true;
        this.cb = zA || a(contextA, "android.permission.ACCESS_COARSE_LOCATION");
        this.cf = a(contextA, "android.permission.READ_EXTERNAL_STORAGE");
        this.cc = a(contextA, "android.permission.WRITE_EXTERNAL_STORAGE");
        this.ce = a(contextA, "android.permission.READ_PHONE_STATE");
        this.cj = a(contextA, "android.permission.ACCESS_NETWORK_STATE");
        this.ck = a(contextA, "android.permission.ACCESS_WIFI_STATE");
        this.cl = map;
        this.bv = System.currentTimeMillis();
        this.bn = znoVar.h();
        this.an = str2;
        this.bw = str;
        this.bh = handler;
        if (str2 == null) {
            this.an = znp.c(false);
        }
        c(this.ac);
        WifiManager wifiManager = this.ai;
        if (wifiManager != null) {
            this.cn = this.ck ? wifiManager.getConnectionInfo() : null;
        }
        ConnectivityManager connectivityManager = this.ae;
        if (connectivityManager != null) {
            this.ci = this.cj ? connectivityManager.getActiveNetworkInfo() : null;
        }
        if (i >= 29) {
            if (!a(contextA, "android.permission.READ_PRIVILEGED_PHONE_STATE") && ((telephonyManager = this.ac) == null || !telephonyManager.hasCarrierPrivileges())) {
                z = false;
            }
            this.ca = z;
        }
        this.bk.a(znoVar, handler, magnesSettings);
        a(82, magnesSettings);
        a(81, magnesSettings);
        a(16, magnesSettings);
        a(21, magnesSettings);
        a(75, magnesSettings);
        a(23, magnesSettings);
        a(27, magnesSettings);
        a(28, magnesSettings);
        a(56, magnesSettings);
        a(72, magnesSettings);
        a(42, magnesSettings);
        a(43, magnesSettings);
        a(45, magnesSettings);
        a(53, magnesSettings);
        a(80, magnesSettings);
        a(71, magnesSettings);
        a(4, magnesSettings);
        a(57, magnesSettings);
        a(58, magnesSettings);
        a(6, magnesSettings);
        a(30, magnesSettings);
        a(29, magnesSettings);
        a(13, magnesSettings);
        a(68, magnesSettings);
        a(49, magnesSettings);
        a(84, magnesSettings);
        a(5, magnesSettings);
        a(48, magnesSettings);
        a(11, magnesSettings);
        a(85, magnesSettings);
        a(46, magnesSettings);
        a(79, magnesSettings);
        a(87, magnesSettings);
        a(98, magnesSettings);
        a(99, magnesSettings);
        g.j1 = false;
        if (this.bf && a(znnVar, magnesSettings.e(), g.k1, "s", magnesSettings.a())) {
            this.bk.e(magnesSettings, this.an, this.bb);
        }
        if (a(znnVar, magnesSettings.e(), g.k1, g.r1, magnesSettings.a())) {
            a(89, magnesSettings);
            a(92, magnesSettings);
            a(93, magnesSettings);
            a(91, magnesSettings);
        }
        a.e((Class<?>) zns.class, 0, "finishing RiskBlobDynamicData");
        return a();
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a(MagnesSettings magnesSettings, znn znnVar, zno znoVar) {
        return b(magnesSettings, znnVar, znoVar, this.bw, null, null, this.bh);
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pairing_id", this.an);
            String string = c.e.BASE_STATION_ID.toString();
            int i = this.co;
            Integer numValueOf = null;
            jSONObject.put(string, i == -1 ? null : Integer.valueOf(i));
            jSONObject.put(c.e.BSSID.toString(), this.af);
            jSONObject.put(c.e.BSSID_ARRAY.toString(), this.bt == null ? null : new JSONArray((Collection) this.bt));
            String string2 = c.e.CELL_ID.toString();
            long j = this.cp;
            jSONObject.put(string2, j == -1 ? null : Long.valueOf(j));
            jSONObject.put(c.e.CONN_TYPE.toString(), this.at);
            jSONObject.put(c.e.CONF_VERSION.toString(), this.bn);
            jSONObject.put(c.e.IS_DEV_MODE_ON.toString(), this.ch);
            jSONObject.put(c.e.DEVICE_ID.toString(), this.az);
            jSONObject.put(c.e.DC_ID.toString(), this.ax);
            String string3 = c.e.DEVICE_UPTIME.toString();
            long j2 = this.bx;
            jSONObject.put(string3, j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put(c.e.IP_ADDRS.toString(), this.ay);
            jSONObject.put(c.e.IP_ADDRESSES.toString(), this.bu == null ? null : new JSONArray((Collection) this.bu));
            jSONObject.put(c.e.KNOWN_APPS.toString(), this.bs == null ? null : new JSONArray((Collection) this.bs));
            jSONObject.put(c.e.LOCALE_COUNTRY.toString(), this.bg);
            jSONObject.put(c.e.LOCALE_LANG.toString(), this.be);
            jSONObject.put(c.e.LOCATION.toString(), b(this.aq));
            String string4 = c.e.LOCATION_AREA_CODE.toString();
            int i2 = this.ah;
            jSONObject.put(string4, i2 == -1 ? null : Integer.valueOf(i2));
            jSONObject.put(c.e.PHONE_TYPE.toString(), this.bj);
            jSONObject.put(c.e.RISK_COMP_SESSION_ID.toString(), this.bl);
            jSONObject.put(c.e.ROAMING.toString(), this.bz);
            jSONObject.put(c.e.SIM_OPERATOR_NAME.toString(), this.bo);
            jSONObject.put(c.e.SIM_SERIAL_NUMBER.toString(), this.bi);
            jSONObject.put(c.e.SSID.toString(), this.bm);
            String string5 = c.e.CDMA_NETWORK_ID.toString();
            int i3 = this.ab;
            jSONObject.put(string5, i3 == -1 ? null : Integer.valueOf(i3));
            String string6 = c.e.CDMA_SYSTEM_ID.toString();
            int i4 = this.ad;
            jSONObject.put(string6, i4 == -1 ? null : Integer.valueOf(i4));
            jSONObject.put(c.e.SUBSCRIBER_ID.toString(), this.br);
            String string7 = c.e.TIMESTAMP.toString();
            long j3 = this.bv;
            jSONObject.put(string7, j3 == -1 ? null : Long.valueOf(j3));
            jSONObject.put(c.e.TZ_NAME.toString(), this.ba);
            jSONObject.put(c.e.DS.toString(), this.by);
            String string8 = c.e.TZ.toString();
            int i5 = this.cu;
            if (i5 != -1) {
                numValueOf = Integer.valueOf(i5);
            }
            jSONObject.put(string8, numValueOf);
            jSONObject.put(c.e.NETWORK_OPERATOR.toString(), this.ag);
            jSONObject.put(c.e.SERIAL_NUMBER.toString(), this.al);
            jSONObject.put(c.e.VPN_SETTING.toString(), this.ar);
            jSONObject.put(c.e.PROXY_SETTING.toString(), this.ap);
            jSONObject.put(c.e.C.toString(), this.as);
            jSONObject.put(c.e.MG_ID.toString(), this.bq);
            jSONObject.put(c.e.PL.toString(), this.bp);
            jSONObject.put(c.e.BATTERY.toString(), this.aw);
            jSONObject.put(c.e.MEMORY.toString(), this.au);
            jSONObject.put(c.e.DISK.toString(), this.av);
            jSONObject.put(c.e.SCREEN.toString(), this.bc);
            jSONObject.put(c.e.SR.toString(), this.bb);
            jSONObject.put(c.e.T.toString(), g.j1);
            e(jSONObject);
            return jSONObject;
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return jSONObject;
        }
    }

    private boolean h() {
        return this.cd && this.cb;
    }

    private void i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerCT", 0);
        int i = sharedPreferences.getInt("RiskManagerCT", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i2 = 1;
        if (i > 0 && i < Integer.MAX_VALUE) {
            i2 = 1 + i;
        }
        editorEdit.putInt("RiskManagerCT", i2);
        editorEdit.apply();
    }

    private boolean j() {
        return this.cd && this.cg;
    }

    private JSONObject g(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = false;
            jSONObject.put(c.l.AC.toString(), (sensorManager == null || sensorManager.getDefaultSensor(1) == null) ? false : true);
            jSONObject.put(c.l.GY.toString(), (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true);
            String string = c.l.MG.toString();
            if (sensorManager != null && sensorManager.getDefaultSensor(2) != null) {
                z = true;
            }
            jSONObject.put(string, z);
            return jSONObject;
        } catch (JSONException e) {
            a.e((Class<?>) zns.class, 3, e);
            return jSONObject;
        }
    }

    private JSONObject f(Context context) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            a.e((Class<?>) zns.class, 3, e);
            i = g.d;
        }
        try {
            jSONObject.put("brightness", a(Integer.valueOf(i)));
        } catch (JSONException e2) {
            a.e((Class<?>) zns.class, 3, e2);
        }
        return jSONObject;
    }

    private String i() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp() && !networkInterface.getInterfaceAddresses().isEmpty()) {
                    String name = networkInterface.getName();
                    String[] strArr = {"ppp", "tun", "tap", "ipsec", "utun"};
                    for (int i = 0; i < 5; i++) {
                        if (name.toLowerCase().startsWith(strArr[i])) {
                            return name;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return null;
        }
    }

    private JSONObject j(Context context) {
        long j;
        long j2;
        JSONObject jSONObject = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long j3 = runtime.totalMemory();
        long jFreeMemory = runtime.freeMemory();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.availMem;
            j2 = memoryInfo.totalMem;
        } else {
            j = 12345;
            j2 = 12345;
        }
        try {
            jSONObject.put(c.e.EnumC0338c.FREE.toString(), a(Long.valueOf(j)));
            jSONObject.put(c.e.EnumC0338c.TOTAL.toString(), a(Long.valueOf(j2)));
            jSONObject.put(c.e.EnumC0338c.FREE_RUNTIME.toString(), a(Long.valueOf(jFreeMemory)));
            jSONObject.put(c.e.EnumC0338c.TOTAL_RUNTIME.toString(), a(Long.valueOf(j3)));
            jSONObject.put(c.e.EnumC0338c.MAX_RUNTIME.toString(), a(Long.valueOf(jMaxMemory)));
            return jSONObject;
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return jSONObject;
        }
    }

    private String f() {
        String property;
        String property2 = System.getProperty("http.proxyHost");
        if (property2 == null || (property = System.getProperty("http.proxyPort")) == null) {
            return null;
        }
        return "host=" + property2 + ",port=" + property;
    }

    private boolean d(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    private String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cb ? 1 : 0);
        sb.append(this.ce ? 1 : 0);
        sb.append(this.ck ? 1 : 0);
        sb.append(this.cj ? 1 : 0);
        sb.append(this.cf ? 1 : 0);
        sb.append(this.cc ? 1 : 0);
        return sb.toString();
    }

    private JSONObject c(Context context) {
        File file;
        JSONObject jSONObject = new JSONObject();
        boolean zEquals = Environment.getExternalStorageState().equals("mounted");
        File[] externalFilesDirs = context.getExternalFilesDirs("");
        boolean z = false;
        if (externalFilesDirs != null && externalFilesDirs.length > 1 && externalFilesDirs[0] != null && (file = externalFilesDirs[1]) != null && zEquals && Environment.isExternalStorageRemovable(file)) {
            z = true;
        }
        long jC = c(Environment.getDataDirectory().getPath());
        long jA = super.a(600);
        try {
            jSONObject.put(c.e.b.MOUNTED.toString(), z);
            jSONObject.put(c.e.b.FREE_SD.toString(), a(Long.valueOf(jA)));
            jSONObject.put(c.e.b.FREE_UD.toString(), a(Long.valueOf(jC)));
            return jSONObject;
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return jSONObject;
        }
    }

    private String e() {
        List<String> listD = d(false);
        if (listD == null) {
            return null;
        }
        return listD.get(0);
    }

    private String e(Context context) {
        return context.getSharedPreferences("RiskManagerCT", 0).getInt("RiskManagerCT", 0) + "";
    }

    private String c() {
        c.b.a aVar;
        if (Build.VERSION.SDK_INT >= 29) {
            ConnectivityManager connectivityManager = this.ae;
            if (connectivityManager != null) {
                NetworkCapabilities networkCapabilities = this.cj ? connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) : null;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(0)) {
                        aVar = c.b.a.MOBILE;
                    } else if (networkCapabilities.hasTransport(1)) {
                        aVar = c.b.a.WIFI;
                    } else if (networkCapabilities.hasTransport(3)) {
                        aVar = c.b.a.ETHERNET;
                    } else if (networkCapabilities.hasTransport(4)) {
                        aVar = c.b.a.VPN;
                    } else if (networkCapabilities.hasTransport(2)) {
                        aVar = c.b.a.BLUETOOTH;
                    } else if (networkCapabilities.hasTransport(5)) {
                        aVar = c.b.a.WIFI_AWARE;
                    } else if (networkCapabilities.hasTransport(6)) {
                        aVar = c.b.a.LOWPAN;
                    }
                    return aVar.toString();
                }
            }
        } else {
            NetworkInfo networkInfo = this.ci;
            if (networkInfo != null) {
                return networkInfo.getTypeName();
            }
        }
        return null;
    }

    private long c(String str) {
        StatFs statFs = new StatFs(str);
        return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    private void e(JSONObject jSONObject) {
        Map<String, String> map = this.cl;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    a.e((Class<?>) zns.class, 3, e);
                }
            }
        }
    }

    private void c(TelephonyManager telephonyManager) {
        String str;
        List<CellInfo> allCellInfo;
        if (telephonyManager == null) {
            return;
        }
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType != 0) {
            try {
                if (phoneType == 1) {
                    this.bj = "gsm";
                    allCellInfo = j() ? telephonyManager.getAllCellInfo() : null;
                    if (allCellInfo == null || allCellInfo.size() == 0) {
                        return;
                    }
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo instanceof CellInfoGsm) {
                            this.cm = ((CellInfoGsm) cellInfo).getCellIdentity().getLac();
                            this.cq = ((CellInfoGsm) cellInfo).getCellIdentity().getCid();
                        }
                        if (cellInfo instanceof CellInfoLte) {
                            this.cm = ((CellInfoLte) cellInfo).getCellIdentity().getTac();
                            this.cq = ((CellInfoLte) cellInfo).getCellIdentity().getCi();
                        }
                        if (cellInfo instanceof CellInfoWcdma) {
                            this.cm = ((CellInfoWcdma) cellInfo).getCellIdentity().getLac();
                            this.cq = ((CellInfoWcdma) cellInfo).getCellIdentity().getCid();
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (znr.b(cellInfo)) {
                                this.cm = znr.aF_(cellInfo).getCellIdentity().getLac();
                                this.cq = znr.aF_(cellInfo).getCellIdentity().getCid();
                            }
                            if (kh.h(cellInfo)) {
                                CellIdentityNr cellIdentityNrW_ = kh.w_(kh.x_(cellInfo).getCellIdentity());
                                this.cm = cellIdentityNrW_.getTac();
                                this.cq = cellIdentityNrW_.getNci();
                            }
                        }
                    }
                    return;
                }
                if (phoneType == 2) {
                    this.bj = "cdma";
                    allCellInfo = j() ? telephonyManager.getAllCellInfo() : null;
                    if (allCellInfo == null || allCellInfo.size() == 0) {
                        return;
                    }
                    for (CellInfo cellInfo2 : allCellInfo) {
                        if (cellInfo2 instanceof CellInfoCdma) {
                            this.cv = ((CellInfoCdma) cellInfo2).getCellIdentity().getBasestationId();
                            this.aa = ((CellInfoCdma) cellInfo2).getCellIdentity().getNetworkId();
                            this.ct = ((CellInfoCdma) cellInfo2).getCellIdentity().getSystemId();
                        }
                    }
                    return;
                }
                str = "unknown (" + telephonyManager.getPhoneType() + Constants.RIGHT_BRACKET_ONLY;
            } catch (Exception e) {
                a.e((Class<?>) zns.class, 3, e);
                return;
            }
        } else {
            str = "none";
        }
        this.bj = str;
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : this.bd.e()) {
                if (znu.e(this.ao, new Intent().setComponent(ComponentName.unflattenFromString(str)))) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
        }
        return arrayList;
    }

    private String d(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            str = "invalid input in dc method";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArrDigest) {
            sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    private JSONObject b(Location location) {
        if (location == null) {
            return null;
        }
        try {
            return new JSONObject("{\"lat\":" + location.getLatitude() + ",\"lng\":" + location.getLongitude() + ",\"acc\":" + location.getAccuracy() + ",\"timestamp\":" + location.getTime() + "}");
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return null;
        }
    }

    private JSONObject e(Context context, BatteryManager batteryManager, PowerManager powerManager) {
        int intExtra;
        int intExtra2;
        int intExtra3;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        JSONObject jSONObject = new JSONObject();
        int i = 12345;
        double d = 12345.0d;
        if (intentRegisterReceiver != null) {
            double intExtra4 = intentRegisterReceiver.getIntExtra("level", 12345);
            int intExtra5 = intentRegisterReceiver.getIntExtra("scale", 12345);
            intExtra = intentRegisterReceiver.getIntExtra(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, 12345);
            intExtra2 = intentRegisterReceiver.getIntExtra("voltage", 12345);
            intExtra3 = intentRegisterReceiver.getIntExtra("status", 12345);
            int intExtra6 = intentRegisterReceiver.getIntExtra("plugged", 12345);
            if (intExtra4 != 12345.0d && intExtra5 != 12345) {
                intExtra4 /= (double) intExtra5;
            }
            d = intExtra4;
            i = intExtra6;
        } else {
            intExtra = 12345;
            intExtra2 = 12345;
            intExtra3 = 12345;
        }
        int intProperty = batteryManager.getIntProperty(2);
        boolean zIsPowerSaveMode = powerManager.isPowerSaveMode();
        try {
            jSONObject.put(c.e.a.CURRENT.toString(), a(Integer.valueOf(intProperty)));
            jSONObject.put(c.e.a.LEVEL.toString(), new DecimalFormat(".##").format(a(Double.valueOf(d))));
            jSONObject.put(c.e.a.METHOD.toString(), a(Integer.valueOf(i)));
            jSONObject.put(c.e.a.LOW_POWER.toString(), a(Integer.valueOf(zIsPowerSaveMode ? 1 : 0)));
            jSONObject.put(c.e.a.STATE.toString(), a(Integer.valueOf(intExtra3)));
            jSONObject.put(c.e.a.TEMP.toString(), a(Integer.valueOf(intExtra)));
            jSONObject.put(c.e.a.VOLTAGE.toString(), a(Integer.valueOf(intExtra2)));
            return jSONObject;
        } catch (JSONException e) {
            a.e((Class<?>) zns.class, 3, e);
            return jSONObject;
        }
    }

    private List<String> d(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (z || !inetAddressNextElement.isLinkLocalAddress())) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        if (inetAddressNextElement instanceof Inet6Address) {
                            arrayList3.add(hostAddress);
                        } else {
                            arrayList2.add(hostAddress);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private ArrayList<String> b(WifiManager wifiManager) {
        String bssid;
        int i;
        if (wifiManager == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.size() == 0 || (bssid = wifiManager.getConnectionInfo().getBSSID()) == null || bssid.equals("00:00:00:00:00:00")) {
            return null;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < scanResults.size(); i4++) {
            if (!bssid.equals(scanResults.get(i4).BSSID) && i2 < (i = scanResults.get(i4).level)) {
                i3 = i4;
                i2 = i;
            }
        }
        arrayList.add(bssid);
        if (i3 != -1) {
            arrayList.add(scanResults.get(i3).BSSID);
        }
        return arrayList;
    }

    private String c(String str, String str2, long j, String str3) throws Exception {
        StringBuilder sb;
        String string;
        if (znp.c(str) && znp.c(str2) && znp.c(Long.valueOf(j))) {
            string = "invalid_input";
        } else {
            if (znp.c(str)) {
                str = "";
            }
            if (znp.c(str2)) {
                str2 = "";
            }
            if (znp.c(Long.valueOf(j))) {
                sb = new StringBuilder();
                sb.append(str);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(j);
            }
            sb.append(str2);
            string = sb.toString();
        }
        String strA = znp.a("SG1hY1NIQTI1Ng==");
        String strA2 = znp.c(Long.valueOf(j)) ? znp.a(str3) : znp.a(str3) + j;
        Mac mac = Mac.getInstance(strA);
        mac.init(new SecretKeySpec(strA2.getBytes(), strA));
        byte[] bArrDoFinal = mac.doFinal(string.getBytes());
        StringBuilder sb2 = new StringBuilder();
        for (byte b2 : bArrDoFinal) {
            sb2.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb2.toString().substring(0, 32);
    }

    private String a(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getSimOperatorName();
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return null;
        }
    }

    private Location e(LocationManager locationManager) {
        Location lastKnownLocation = null;
        if (locationManager == null) {
            return null;
        }
        try {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
                if (lastKnownLocation != null) {
                    return lastKnownLocation;
                }
            }
            return lastKnownLocation;
        } catch (Exception e) {
            a.e((Class<?>) zns.class, 3, e);
            return null;
        }
    }

    zns(boolean z) {
        this.bf = z;
    }
}
