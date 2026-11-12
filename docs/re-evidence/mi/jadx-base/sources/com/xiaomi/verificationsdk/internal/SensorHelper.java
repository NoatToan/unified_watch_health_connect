package com.xiaomi.verificationsdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.analytics.AnalyticManager;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.account.passportsdk.account_sso.BuildConfig;
import com.xiaomi.accountsdk.hasheddeviceidlib.HashedDeviceIdUtil;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.EasyMap;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.passport.SecurityDeviceSignManager;
import com.xiaomi.passport.compat.ContextCompat;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.verificationsdk.VerificationManager;
import defpackage.jgl;
import defpackage.ku3;
import defpackage.sf4;
import defpackage.vu3;
import defpackage.w84;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SensorHelper implements SensorEventListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HandlerThread f14355r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f14357b;
    public int c;
    public Handler d;
    public TelephonyManager e;
    public Context f;
    public int g;
    public int h;
    public long i;
    public BatteryReceiver j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONArray f14358k;
    public JSONArray l;
    public JSONArray m;
    public JSONArray n;
    public String o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14356a = "SensorHelper";
    public volatile boolean p = false;
    public volatile boolean q = false;

    public class BatteryReceiver extends BroadcastReceiver {
        public BatteryReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null) {
                SensorHelper.this.g = intent.getExtras().getInt("level");
            }
            if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                SensorHelper.this.h = 0;
            } else if (intent.getIntExtra("status", 1) == 2) {
                SensorHelper.this.h = 1;
            }
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f14360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f14361b;

        public a(long j, CountDownLatch countDownLatch) {
            this.f14360a = j;
            this.f14361b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            SensorHelper sensorHelper = SensorHelper.this;
            sensorHelper.G(sensorHelper.r(sensorHelper.i, this.f14360a));
            this.f14361b.countDown();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VerificationManager.m f14362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14363b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Boolean e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Boolean h;

        public b(VerificationManager.m mVar, String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2) {
            this.f14362a = mVar;
            this.f14363b = str;
            this.c = str2;
            this.d = str3;
            this.e = bool;
            this.f = str4;
            this.g = str5;
            this.h = bool2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                if (this.f14362a == null) {
                    throw new IllegalArgumentException("uploadData :verifyCallback not be null");
                }
                EnvEncryptUtils.a aVarB = EnvEncryptUtils.b(this.f14363b);
                try {
                    Bundle bundle = SecurityDeviceSignManager.sign(SensorHelper.this.f, this.c + this.d + aVarB.f14354b + aVarB.f14353a, null).get(3000L, TimeUnit.MILLISECONDS);
                    if (bundle == null) {
                        string = "";
                    } else if (bundle.getBoolean("booleanResult")) {
                        string = bundle.getString("userData");
                    } else {
                        int i = bundle.getInt("errorCode");
                        String string2 = bundle.getString("errorMessage");
                        AccountLogger.log("SensorHelper", "error code: " + i);
                        AccountLogger.log("SensorHelper", "error msg: " + string2);
                        string = "";
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                } catch (TimeoutException e3) {
                    e3.printStackTrace();
                }
                EasyMap easyMap = new EasyMap();
                if (this.e.booleanValue()) {
                    easyMap.easyPut("s", "");
                    easyMap.easyPut(PluginDeviceInfo.FICONOFF, "");
                } else {
                    easyMap.easyPut("s", aVarB.f14354b);
                    easyMap.easyPut(PluginDeviceInfo.FICONOFF, aVarB.f14353a);
                }
                if (!TextUtils.isEmpty(string)) {
                    easyMap.easyPut(DeviceTagInterface.CUSTOM_TAG_TYPE, string);
                }
                if (!TextUtils.isEmpty(this.d)) {
                    easyMap.easyPut(PluginDeviceInfo.FMODEL, this.d);
                }
                String property = System.getProperty("http.agent");
                EasyMap easyMapEasyPut = new EasyMap().easyPut("User-Agent", property + " AndroidVerifySDK/" + BuildConfig.VERSION_NAME);
                String strB = this.f;
                if (TextUtils.isEmpty(strB)) {
                    strB = w84.b(Locale.getDefault());
                }
                SimpleRequest.StringContent stringContentPostAsString = SimpleRequest.postAsString(sf4.a(this.g, "/captcha/v2/data?") + "k=" + this.c + "&locale=" + strB + "&errorAction=" + this.h, (Map<String, String>) easyMap, (Map<String, String>) null, (Map<String, String>) easyMapEasyPut, true, (Integer) 3000);
                if (stringContentPostAsString == null) {
                    ErrorInfo.ErrorCode errorCode = ErrorInfo.ErrorCode.ERROR_NETWORK_EXCEPTION;
                    this.f14362a.onVerifyFail(SensorHelper.v(errorCode.getCode(), "uploadData:network exception", ErrorInfo.getMsgIdGivenErrorCode(errorCode)));
                    return;
                }
                JSONObject jSONObject = new JSONObject(stringContentPostAsString.getBody());
                int iOptInt = jSONObject.optInt("code");
                String strOptString = jSONObject.optString("msg");
                if (iOptInt != 0) {
                    if (iOptInt == 500) {
                        this.f14362a.onVerifySucess(new VerifyResult.b().e(EnvEncryptUtils.g()).c());
                        return;
                    }
                    this.f14362a.onVerifyFail(SensorHelper.v(iOptInt, "uploadData:" + strOptString, ErrorInfo.getMsgIdGivenErrorCode(ErrorInfo.ErrorCode.ERROR_SERVER)));
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                boolean zOptBoolean = jSONObject2.optBoolean("result");
                String strOptString2 = jSONObject2.optString("token");
                String strOptString3 = jSONObject2.optString("url");
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("extra");
                if (jSONObjectOptJSONObject != null) {
                    jgl.c(jSONObjectOptJSONObject.toString());
                }
                if (!TextUtils.isEmpty(strOptString3)) {
                    this.f14362a.a(strOptString3);
                    return;
                }
                if (zOptBoolean) {
                    this.f14362a.onVerifySucess(new VerifyResult.b().e(strOptString2).d(jgl.b()).c());
                } else {
                    ErrorInfo.ErrorCode errorCode2 = ErrorInfo.ErrorCode.ERROR_HUMANCOMPUTER_VERIFICATION_FAILED;
                    this.f14362a.onVerifyFail(SensorHelper.v(errorCode2.getCode(), "uploadData:human computer verification failed", ErrorInfo.getMsgIdGivenErrorCode(errorCode2)));
                }
            } catch (AccessDeniedException e4) {
                AccountLogger.log("SensorHelper", "", e4);
                ErrorInfo.ErrorCode errorCode3 = ErrorInfo.ErrorCode.ERROR_ACCESSDENIED_EXCEPTION;
                this.f14362a.onVerifyFail(SensorHelper.v(errorCode3.getCode(), "uploadData:" + e4.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode3)));
            } catch (AuthenticationFailureException e5) {
                AccountLogger.log("SensorHelper", "", e5);
                ErrorInfo.ErrorCode errorCode4 = ErrorInfo.ErrorCode.ERROR_AUTHENTICATIONFAILURE_EXCEPTION;
                this.f14362a.onVerifyFail(SensorHelper.v(errorCode4.getCode(), "uploadData:" + e5.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode4)));
            } catch (EnvEncryptUtils.EncryptException e6) {
                AccountLogger.log("SensorHelper", "", e6);
                ErrorInfo.ErrorCode errorCode5 = ErrorInfo.ErrorCode.ERROR_ENCRYPT_EXCEPTION;
                this.f14362a.onVerifyFail(SensorHelper.v(errorCode5.getCode(), "uploadData:" + e6.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode5)));
            } catch (IOException e7) {
                SensorHelper.this.E(this.f14362a, e7);
            } catch (JSONException e8) {
                AccountLogger.log("SensorHelper", "fail to parse JSONObject", e8);
                ErrorInfo.ErrorCode errorCode6 = ErrorInfo.ErrorCode.ERROR_JSON_EXCEPTION;
                this.f14362a.onVerifyFail(SensorHelper.v(errorCode6.getCode(), "uploadData:" + e8.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode6)));
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f14364a;

        public c(long j) {
            this.f14364a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SensorHelper.this.I();
            SensorHelper.this.G(SensorHelper.this.r(this.f14364a, jCurrentTimeMillis));
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SensorEvent f14366a;

        public d(SensorEvent sensorEvent) {
            this.f14366a = sensorEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            SensorHelper sensorHelper = SensorHelper.this;
            sensorHelper.F(sensorHelper.new e(this.f14366a));
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f14368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14369b;

        public e(SensorEvent sensorEvent) {
            this.f14368a = sensorEvent.values;
            this.f14369b = sensorEvent.sensor.getType();
        }

        public String b() {
            StringBuilder sb = new StringBuilder();
            for (float f : this.f14368a) {
                sb.append(f);
                sb.append(",");
            }
            sb.append(d());
            sb.append(",");
            sb.append(System.currentTimeMillis());
            return sb.toString();
        }

        public JSONArray c() throws JSONException {
            double d;
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(System.currentTimeMillis() - SensorHelper.this.i);
            DecimalFormat decimalFormat = new DecimalFormat("##0.0");
            double d2 = 0.0d;
            if (this.f14369b == 5) {
                try {
                    d2 = Double.parseDouble(decimalFormat.format(this.f14368a[0]));
                } catch (Exception unused) {
                }
                jSONArray.put(d2);
            } else {
                for (float f : this.f14368a) {
                    try {
                        d = Double.parseDouble(new DecimalFormat("##0.0000").format(f));
                    } catch (Exception e) {
                        AccountLogger.log("SensorHelper", e.toString());
                        d = 0.0d;
                    }
                    jSONArray.put(d);
                }
            }
            return jSONArray;
        }

        public final int d() {
            int i = this.f14369b;
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i != 5) {
                return i != 6 ? 0 : 5;
            }
            return 4;
        }

        public String toString() {
            return b();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("sensor");
        f14355r = handlerThread;
        handlerThread.start();
    }

    public SensorHelper(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("SensorHelper init : context  should not be null");
        }
        this.f = context;
        this.f14357b = (SensorManager) context.getSystemService("sensor");
        this.d = new Handler(f14355r.getLooper());
        this.e = (TelephonyManager) context.getSystemService("phone");
    }

    public static VerifyError v(int i, String str, int i2) {
        return new VerifyError.a().e(i).g(str).f(i2).d();
    }

    public final int A() {
        try {
            this.f.getPackageManager().getPackageInfo("com.saurik.substrate", 0);
            AccountLogger.log("SensorHelper", "Substrate found on the system.");
            return 1;
        } catch (PackageManager.NameNotFoundException unused) {
            AccountLogger.log("SensorHelper", "Substrate NOT found on the system.");
            return 0;
        }
    }

    public final String B() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public final int C() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return 0;
            }
            for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                    return 1;
                }
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int D() {
        try {
            this.f.getPackageManager().getPackageInfo("de.robv.android.xposed.installer", 0);
            AccountLogger.log("SensorHelper", "Xposed found on the system.");
            return 1;
        } catch (PackageManager.NameNotFoundException unused) {
            AccountLogger.log("SensorHelper", "Xposed NOT found on the system.");
            return 0;
        }
    }

    public final void E(VerificationManager.m mVar, IOException iOException) {
        AccountLogger.log("SensorHelper", "", iOException);
        if (iOException instanceof ConnectException) {
            ErrorInfo.ErrorCode errorCode = ErrorInfo.ErrorCode.ERROR_CONNECT_UNREACHABLE_EXCEPTION;
            mVar.onVerifyFail(v(errorCode.getCode(), "uploadData:" + iOException.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode)));
            return;
        }
        if (iOException instanceof SocketTimeoutException) {
            ErrorInfo.ErrorCode errorCode2 = ErrorInfo.ErrorCode.ERROR_SOCKET_TIMEOUT_EXCEPTION;
            mVar.onVerifyFail(v(errorCode2.getCode(), "uploadData:" + iOException.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode2)));
            return;
        }
        if (iOException instanceof ConnectTimeoutException) {
            ErrorInfo.ErrorCode errorCode3 = ErrorInfo.ErrorCode.ERROR_CONNECT_TIMEOUT_EXCEPTION;
            mVar.onVerifyFail(v(errorCode3.getCode(), "uploadData:" + iOException.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode3)));
            return;
        }
        ErrorInfo.ErrorCode errorCode4 = ErrorInfo.ErrorCode.ERROR_IO_EXCEPTION;
        mVar.onVerifyFail(v(errorCode4.getCode(), "uploadData:" + iOException.toString(), ErrorInfo.getMsgIdGivenErrorCode(errorCode4)));
    }

    public final void F(e eVar) {
        if (this.p) {
            if (this.f14358k == null) {
                this.f14358k = new JSONArray();
            }
            if (this.l == null) {
                this.l = new JSONArray();
            }
            if (this.m == null) {
                this.m = new JSONArray();
            }
            if (this.n == null) {
                this.n = new JSONArray();
            }
            try {
                int i = eVar.f14369b;
                if (i == 1) {
                    this.f14358k.put(eVar.c());
                    return;
                }
                if (i == 2) {
                    this.l.put(eVar.c());
                } else if (i == 5) {
                    this.m.put(eVar.c());
                } else {
                    if (i != 6) {
                        return;
                    }
                    this.n.put(eVar.c());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void G(String str) {
        this.o = str;
    }

    public final void H() {
        this.p = true;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (this.q) {
            return;
        }
        BatteryReceiver batteryReceiver = new BatteryReceiver();
        this.j = batteryReceiver;
        ContextCompat.registerReceiver(this.f, batteryReceiver, intentFilter, true);
        this.q = true;
        this.i = System.currentTimeMillis();
    }

    public void I() {
        if (this.p) {
            this.p = false;
            J();
        }
    }

    public final synchronized void J() {
        try {
            this.f14357b.unregisterListener(this);
            if (this.q) {
                this.f.unregisterReceiver(this.j);
                this.q = false;
            }
        } catch (Exception e2) {
            AccountLogger.log("SensorHelper", e2.toString());
        }
    }

    public void K(String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, VerificationManager.m mVar) {
        jgl.a();
        this.d.post(new b(mVar, str, str2, str3, bool, str4, str5, bool2));
    }

    public void g() {
        if (this.i == 0) {
            AccountLogger.log("SensorHelper", "Collected Data not start");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        I();
        this.d.post(new a(System.currentTimeMillis(), countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public void h() {
        this.o = "";
        this.f14358k = new JSONArray();
        this.l = new JSONArray();
        this.m = new JSONArray();
        this.n = new JSONArray();
    }

    public void i(int i, int i2) {
        this.c = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        H();
        this.d.postDelayed(new c(jCurrentTimeMillis), i2);
    }

    public final void j(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("virtualapp", vu3.e() ? 1 : 0);
        } catch (UnknownValueException e2) {
            e2.printStackTrace();
        }
    }

    public final long k(Context context) {
        try {
            return new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir).lastModified();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public final String l(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final String m() {
        String str;
        Exception e2;
        try {
            str = this.f.getPackageManager().getPackageInfo(this.f.getPackageName(), 0).versionName;
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        return str;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    AccountLogger.log("VersionInfo", "Exception", e2);
                }
            }
            return "";
        } catch (Exception e4) {
            str = "";
            e2 = e4;
        }
    }

    public final long n() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final String o() {
        return Build.MODEL;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.d.post(new d(sensorEvent));
    }

    public String p() {
        return this.o;
    }

    public final String q() {
        return Build.FINGERPRINT;
    }

    public String r(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("type", 2);
            jSONObject.put("startTs", j);
            jSONObject.put("endTs", j2);
            jSONObject2.put(Column.BATTERY, this.g);
            jSONObject2.put("device_id", s());
            jSONObject2.put("app_version", m());
            jSONObject2.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("vpn", C());
            jSONObject2.put("brand_model", o());
            jSONObject2.put(AnalyticManager.EVENT_PARAM_SYSTEM_VERSION, B());
            jSONObject2.put("customed_system", q());
            jSONObject2.put("screen_brightness", z());
            jSONObject2.put("debug", u());
            jSONObject2.put("simulator", t());
            jSONObject2.put("charging", this.h);
            jSONObject2.put("never_lock_screen", w());
            jSONObject2.put("aps", new JSONArray());
            jSONObject2.put("xposed", D());
            jSONObject2.put("substrate", A());
            jSONObject2.put("root", y());
            jSONObject2.put("boot_time", n());
            jSONObject2.put("install_time", k(this.f));
            jSONObject2.put("package_name", x());
            jSONObject2.put(FeedbackConstants.KEY_APP_NAME, l(this.f, x()));
            j(jSONObject2);
            jSONObject.put("env", jSONObject2);
            if (this.f14358k == null) {
                this.f14358k = new JSONArray();
            }
            jSONObject3.put("acceleration", this.f14358k);
            if (this.l == null) {
                this.l = new JSONArray();
            }
            jSONObject3.put("magnetic", this.l);
            if (this.m == null) {
                this.m = new JSONArray();
            }
            jSONObject3.put("light", this.m);
            if (this.n == null) {
                this.n = new JSONArray();
            }
            jSONObject3.put("barometer", this.n);
            jSONObject.put("action", jSONObject3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String s() {
        return new HashedDeviceIdUtil(this.f).getHashedDeviceIdNoThrow();
    }

    public final int t() {
        return ((TelephonyManager) this.f.getSystemService("phone")).getNetworkOperatorName().toLowerCase().equals(PluginPackageConstant.RN_DIR_A) ? 1 : 0;
    }

    public final int u() {
        return Settings.Secure.getInt(this.f.getContentResolver(), "adb_enabled", 0) > 0 ? 1 : 0;
    }

    public final int w() {
        try {
            return Settings.System.getInt(this.f.getContentResolver(), "screen_off_timeout") == Integer.MAX_VALUE ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String x() {
        return this.f.getPackageName();
    }

    public final int y() {
        return ku3.g() ? 1 : 0;
    }

    public final int z() {
        try {
            return Settings.System.getInt(this.f.getContentResolver(), "screen_brightness");
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
