package com.xmlywind.windad;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.services.b;
import com.xmlywind.sdk.base.services.j;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.a;
import com.xmlywind.sdk.common.a.c;
import com.xmlywind.sdk.common.e.d;
import com.xmlywind.sdk.common.e.f;
import com.xmlywind.sdk.common.mta.BuriedPointManager;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntityCommon;
import com.xmlywind.sdk.common.mta.PointType;
import com.xmlywind.sdk.common.utils.g;
import com.xmlywind.sdk.common.utils.p;
import com.xmlywind.volley.s;
import com.xmlywind.windad.common.AdapterClsUtil;
import com.xmlywind.windad.common.PointEntityWindUtils;
import com.xmlywind.windad.consent.ConsentStatus;
import com.xmlywind.windad.consent.WindAdConsentInformation;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class WindAds {
    public static final String AD_SCENE = "ad_scene";
    private static volatile WindAds a;
    private Context e;
    private boolean f;
    private WeakReference<Activity> h;
    private int i;
    private boolean b = true;
    private boolean c = false;
    private WindConsentStatus g = WindConsentStatus.UNKNOWN;
    private WindAgeRestrictedUserStatus j = WindAgeRestrictedUserStatus.WindAgeRestrictedStatusUnknown;
    private boolean k = true;
    private boolean m = true;
    private WindAdOptions d = null;
    private Handler l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.xmlywind.windad.WindAds$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConsentStatus.values().length];
            a = iArr;
            try {
                iArr[ConsentStatus.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConsentStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConsentStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private WindAds() {
    }

    private static void a(Context context) {
        f.a(context);
    }

    private void b(Context context) {
        f.a().a(new d(SDKConfig.getGDPRRegionURL(), new d.a() { // from class: com.xmlywind.windad.WindAds.1
            @Override // com.xmlywind.volley.n.a
            public void onErrorResponse(s sVar) {
                WindAds.this.i();
            }

            @Override // com.xmlywind.sdk.common.e.d.a
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        Boolean boolValueOf = Boolean.valueOf(jSONObject.getBoolean(Constants.IS_REQUEST_IN_EEA_OR_UNKNOWN));
                        if (boolValueOf != null) {
                            a.n().c(boolValueOf.booleanValue());
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                WindAds.this.i();
            }
        }, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        try {
            j.a("LocationService", a.b() && !SDKConfig.sharedInstance().isDisable_up_location());
        } catch (Throwable th) {
            SigmobLog.e("updateLocationMonitor fail", th);
        }
    }

    private static void e() {
        try {
            j.a("AppInstallService", true);
        } catch (Throwable th) {
            SigmobLog.e("initAppInstallService fail", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        try {
            j.a("WifiScanService", a.b() && SDKConfig.sharedInstance().isEnableWifiScanList());
        } catch (Throwable th) {
            SigmobLog.e("updateWifiScanService fail", th);
        }
    }

    private static void g() {
        try {
            j.a("DownloadService", true);
        } catch (Throwable th) {
            SigmobLog.e("initDownloadService fail", th);
        }
    }

    public static String getUserId() {
        return a.a();
    }

    public static String getVersion() {
        return Constants.SDK_VERSION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h() {
        PointEntityCommon pointEntityCommon = new PointEntityCommon();
        pointEntityCommon.setAc_type(PointType.WIND_COMMON);
        pointEntityCommon.setCategory(PointCategory.AGGRE_INIT);
        pointEntityCommon.setIs_mediation(sharedAds().getOptions().getUseMediation() ? "1" : "0");
        pointEntityCommon.setAppinfo_switch(!SDKConfig.sharedInstance().isDisableUpAppInfo() ? "1,1" : "0,0");
        int i = a.n().an() != null ? 1 : 0;
        boolean zIsDisable_up_location = SDKConfig.sharedInstance().isDisable_up_location();
        int i2 = zIsDisable_up_location ? 0 : i;
        pointEntityCommon.setLocation_switch((!zIsDisable_up_location ? 1 : 0) + "," + i2);
        HashMap map = new HashMap();
        map.put("is_minor", this.b ? "0" : "1");
        map.put("is_unpersonalized", this.m ? "0" : "1");
        pointEntityCommon.setOptions(map);
        pointEntityCommon.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        BuriedPointManager.clearLogDB();
        g();
        e();
        a();
        a.n().d(getUserGDPRConsentStatus().a());
        h();
        SDKConfig.sharedInstance().setOnSDKUpdateListener(new SDKConfig.a() { // from class: com.xmlywind.windad.WindAds.2
            @Override // com.xmlywind.sdk.common.SDKConfig.a
            public void onUpdate() {
                WindAds.d();
                WindAds.f();
                b.a();
            }
        }).startUpdate();
        if (SDKConfig.sharedInstance().isEnable_report_crash()) {
            com.xmlywind.sdk.common.c.a.a().b();
        }
        if (SDKConfig.sharedInstance().isEnable_debug_level()) {
            AdapterClsUtil.checkAdapterCls();
        }
        j();
    }

    private void j() {
        g.a(this.e).a();
    }

    private void k() {
        if (this.e != null) {
            try {
                a.n().c(p.a(this.e).getBoolean(Constants.USER_GDPR_REGION, false));
            } catch (Throwable unused) {
            }
        }
    }

    public static void requestPermission(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        boolean zB = a.b(activity, "android.permission.READ_PHONE_STATE");
        boolean zB2 = a.b(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        boolean zB3 = a.b(activity, "android.permission.ACCESS_FINE_LOCATION");
        if (zB && zB2 && zB3) {
            return;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION"}, 0);
    }

    public static void setUserId(String str) {
        a.a(str);
    }

    public static WindAds sharedAds() {
        if (a == null) {
            synchronized (WindAds.class) {
                if (a == null) {
                    a = new WindAds();
                    a.setDebugEnable(true);
                }
            }
        }
        return a;
    }

    public void a() {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new Runnable() { // from class: com.xmlywind.windad.WindAds.3
            @Override // java.lang.Runnable
            public void run() {
                BuriedPointManager.getInstance().sendPoint();
            }
        }, 0L, SDKConfig.sharedInstance().getSendLogInterval() * 1000, TimeUnit.MILLISECONDS);
    }

    public boolean canCollectPersonalInformation() {
        return a.b();
    }

    public void debugDeviceID() {
        boolean z;
        boolean z2 = true;
        try {
            String strY = a.n().y();
            if (TextUtils.isEmpty(strY)) {
                z = false;
            } else {
                SigmobLog.i(String.format("debug device Type: IMEI,  ID => %s", strY));
                z = true;
            }
            try {
                String strW = a.n().w();
                if (!TextUtils.isEmpty(strW)) {
                    SigmobLog.i(String.format("debug device Type: gaid, ID => %s", strW));
                    z = true;
                }
                if (TextUtils.isEmpty(a.n().Y())) {
                    z2 = z;
                } else {
                    SigmobLog.i(String.format("debug device Type oaid, ID => %s", strW));
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            z2 = false;
        }
        if (z2) {
            return;
        }
        SigmobLog.e(String.format("can't find any can be used debug valid Device Type", new Object[0]));
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public WindAgeRestrictedUserStatus getAgeRestrictedStatus() {
        Context context;
        try {
            WindAgeRestrictedUserStatus windAgeRestrictedUserStatus = this.j;
            WindAgeRestrictedUserStatus windAgeRestrictedUserStatus2 = WindAgeRestrictedUserStatus.WindAgeRestrictedStatusUnknown;
            if (windAgeRestrictedUserStatus == windAgeRestrictedUserStatus2 && (context = this.e) != null) {
                int i = p.a(context).getInt(Constants.WIND_AGERESTRICTED_STATUS, windAgeRestrictedUserStatus2.getValue());
                WindAgeRestrictedUserStatus windAgeRestrictedUserStatus3 = WindAgeRestrictedUserStatus.WindAgeRestrictedStatusNO;
                if (i == windAgeRestrictedUserStatus3.getValue()) {
                    this.j = windAgeRestrictedUserStatus3;
                } else {
                    windAgeRestrictedUserStatus3 = WindAgeRestrictedUserStatus.WindAgeRestrictedStatusYES;
                    if (i == windAgeRestrictedUserStatus3.getValue()) {
                        this.j = windAgeRestrictedUserStatus3;
                    } else {
                        this.j = windAgeRestrictedUserStatus2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return this.j;
    }

    public Context getContext() {
        return this.e.getApplicationContext();
    }

    public Handler getHandler() {
        if (this.l == null) {
            this.l = new Handler(Looper.getMainLooper());
        }
        return this.l;
    }

    public WindAdOptions getOptions() {
        return this.d;
    }

    public int getUserAge() {
        Context context;
        try {
            if (this.i == 0 && (context = this.e) != null) {
                this.i = p.a(context).getInt(Constants.WIND_CONSENT_STATUS, 0);
            }
        } catch (Throwable unused) {
        }
        return this.i;
    }

    public WindConsentStatus getUserGDPRConsentStatus() {
        Context context;
        WindConsentStatus windConsentStatus = this.g;
        WindConsentStatus windConsentStatus2 = WindConsentStatus.UNKNOWN;
        if (windConsentStatus == windConsentStatus2 && (context = this.e) != null) {
            try {
                String string = p.a(context).getString(Constants.WIND_CONSENT_STATUS, windConsentStatus2.a());
                WindConsentStatus windConsentStatus3 = WindConsentStatus.ACCEPT;
                if (string.equals(windConsentStatus3.a())) {
                    this.g = windConsentStatus3;
                } else {
                    windConsentStatus3 = WindConsentStatus.DENIED;
                    if (string.equals(windConsentStatus3.a())) {
                        this.g = windConsentStatus3;
                    } else {
                        this.g = windConsentStatus2;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return this.g;
    }

    public String getWindUid() {
        try {
            return a.n().ac();
        } catch (Exception e) {
            e.printStackTrace();
            return "Please initialize the SDK properly first";
        }
    }

    public boolean isAdult() {
        return this.b;
    }

    public boolean isDebugEnable() {
        return this.f;
    }

    public boolean isInit() {
        return this.c;
    }

    public boolean isPersonalizedAdvertisingOn() {
        return this.m;
    }

    public void loadConsentStatus() {
        WindConsentStatus windConsentStatus;
        try {
            getUserGDPRConsentStatus();
            k();
            WindConsentStatus windConsentStatus2 = this.g;
            WindConsentStatus windConsentStatus3 = WindConsentStatus.UNKNOWN;
            if (windConsentStatus2 == windConsentStatus3) {
                int i = AnonymousClass4.a[WindAdConsentInformation.getInstance(this.e).getConsentStatus().ordinal()];
                if (i == 1) {
                    windConsentStatus = WindConsentStatus.ACCEPT;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        setUserGDPRConsentStatus(windConsentStatus3);
                        return;
                    }
                    windConsentStatus = WindConsentStatus.DENIED;
                }
                setUserGDPRConsentStatus(windConsentStatus);
            }
        } catch (Throwable unused) {
        }
    }

    public void setActivity(Activity activity) {
        this.h = new WeakReference<>(activity);
    }

    public void setAdult(boolean z) {
        this.b = z;
        if (this.c) {
            a.n().d(this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public void setDebugEnable(boolean z) {
        Level level;
        this.f = z;
        if (Constants.IS_TEST.booleanValue()) {
            if (z) {
                level = Level.FINE;
            } else {
                level = Level.SEVERE;
            }
        } else if (z) {
            level = Level.INFO;
        } else {
            level = Level.SEVERE;
        }
        SigmobLog.setSdkHandlerLevel(level);
    }

    public void setIsAgeRestrictedUser(WindAgeRestrictedUserStatus windAgeRestrictedUserStatus) {
        this.j = windAgeRestrictedUserStatus;
        if (!this.c || a.n() == null) {
            return;
        }
        a.n().a(this.j.getValue());
    }

    public void setPersonalizedAdvertisingOn(boolean z) {
        this.m = z;
        if (this.c) {
            a.n().e(this.m);
        }
    }

    public void setUserAge(int i) {
        this.i = i;
        if (!this.c || a.n() == null) {
            return;
        }
        a.n().c(i);
    }

    public void setUserGDPRConsentStatus(WindConsentStatus windConsentStatus) {
        this.g = windConsentStatus;
        if (!this.c || a.n() == null) {
            return;
        }
        a.n().b(windConsentStatus.a());
        a.n().d(getUserGDPRConsentStatus().a());
    }

    public void setUserGDPRDialogRegion(boolean z) {
        this.k = z;
        if (!this.c || a.n() == null) {
            return;
        }
        a.n().a(z);
        a.n().d(getUserGDPRConsentStatus().a());
    }

    public boolean startWithOptions(Context context, WindAdOptions windAdOptions) {
        String str;
        if (context != null) {
            if (windAdOptions == null || TextUtils.isEmpty(windAdOptions.getAppId())) {
                str = "invalid Options " + windAdOptions;
            } else {
                if (this.c || Build.VERSION.SDK_INT < 18) {
                    SigmobLog.i("already startWithOptions");
                    return true;
                }
                try {
                    this.d = windAdOptions;
                    this.e = context.getApplicationContext();
                    com.xmlywind.sdk.common.utils.d.a(context.getApplicationContext(), Constants.SDK_FOLDER);
                    a.n().a(context.getApplicationContext(), windAdOptions.getAppId(), windAdOptions.getAppKey());
                    c.a(context.getApplicationContext());
                    loadConsentStatus();
                    a.n().b(this.g.a());
                    a.n().c(getUserAge());
                    a.n().a(getAgeRestrictedStatus().getValue());
                    a.n().d(this.b);
                    a.n().e(this.m);
                    a(context.getApplicationContext());
                    b(context);
                    WindAdLifecycleManager.initialize((Application) context.getApplicationContext());
                    this.c = true;
                    return true;
                } catch (Throwable th) {
                    SigmobLog.e("startWithOptions", th);
                    try {
                        PointEntityWindUtils.WindError("error", null, null, WindAdError.ERROR_SIGMOB_INIT_FAIL.getErrorCode(), th.getMessage(), null);
                    } catch (Throwable th2) {
                        SigmobLog.e("startWithOptions", th2);
                    }
                }
            }
            return false;
        }
        str = "ApplicationContext is null ";
        SigmobLog.e(str);
        return false;
    }
}
