package com.huawei.hms.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ForegroundBusDelegate implements IBridgeActivityDelegate {
    public static final String HMS_FOREGROUND_REQ_BODY = "HMS_FOREGROUND_REQ_BODY";
    public static final String HMS_FOREGROUND_REQ_HEADER = "HMS_FOREGROUND_REQ_HEADER";
    public static final String HMS_FOREGROUND_REQ_INNER = "HMS_FOREGROUND_REQ_INNER";
    public static final String HMS_FOREGROUND_RESP_HEADER = "HMS_FOREGROUND_RESP_HEADER";
    public static final String INNER_PKG_NAME = "INNER_PACKAGE_NAME";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RequestHeader f12683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ForegroundInnerHeader f12685c = new ForegroundInnerHeader();
    private ResponseHeader d;
    private WeakReference<Activity> e;
    private boolean f;

    class b implements AvailableAdapter.AvailableCallBack {
        private b() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            if (i == 0) {
                ForegroundBusDelegate.this.h();
            } else {
                HMSLog.i("ForegroundBusDelegate", "version check failed");
                ForegroundBusDelegate.this.a(0, "apk version is invalid");
            }
        }
    }

    private BusResponseCallback b(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }

    private void c() {
        if (this.f12683a != null) {
            a(HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED);
        }
    }

    private void d() {
        a(HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY);
    }

    private void e() {
        if (g() == null) {
            HMSLog.e("ForegroundBusDelegate", "checkMinVersion failed, activity must not be null.");
            a(0, "checkMinVersion failed, activity must not be null.");
            return;
        }
        if (this.f) {
            h();
            return;
        }
        if (!Util.isAvailableLibExist(g().getApplicationContext())) {
            if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(g().getApplicationContext(), this.f12685c.getApkVersion()) == 0) {
                h();
                return;
            } else {
                HMSLog.e("ForegroundBusDelegate", "checkMinVersion failed, and no available lib exists.");
                a(0, "apk version is invalid");
                return;
            }
        }
        b bVar = new b();
        AvailableAdapter availableAdapter = new AvailableAdapter(this.f12685c.getApkVersion());
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(g());
        if (iIsHuaweiMobileServicesAvailable == 0) {
            bVar.onComplete(iIsHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            a(g(), availableAdapter, bVar);
        } else {
            bVar.onComplete(iIsHuaweiMobileServicesAvailable);
        }
    }

    private void f() {
        Activity activityG = g();
        if (activityG == null || activityG.isFinishing()) {
            return;
        }
        activityG.finish();
    }

    private Activity g() {
        WeakReference<Activity> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        HMSLog.i("ForegroundBusDelegate", "startApkHubActivity");
        Activity activityG = g();
        if (activityG == null) {
            HMSLog.e("ForegroundBusDelegate", "startApkHubActivity but activity is null");
            return;
        }
        String packageName = this.f ? activityG.getPackageName() : HMSPackageManager.getInstance(activityG.getApplicationContext()).getHMSPackageNameForMultiService();
        if (TextUtils.isEmpty(packageName)) {
            HMSLog.e("ForegroundBusDelegate", "hmsPackageName is null, Service is invalid.");
            a(0, "hmsPackageName is null, Service is invalid.");
            return;
        }
        Intent intent = new Intent(this.f12685c.getAction());
        intent.putExtra(HMS_FOREGROUND_REQ_BODY, this.f12684b);
        try {
            intent.setPackage(packageName);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("ForegroundBusDelegate", "IllegalArgumentException when startApkHubActivity intent.setPackage");
        }
        intent.putExtra("intent.extra.isfullscreen", UIUtil.isActivityFullscreen(activityG));
        intent.setClassName(packageName, "com.huawei.hms.core.activity.UiJumpActivity");
        intent.putExtra(HMS_FOREGROUND_REQ_HEADER, this.f12683a.toJson());
        intent.putExtra("intent.extra.hms.core.DELEGATE_NAME", "com.huawei.hms.core.activity.ForegroundBus");
        try {
            b();
            activityG.startActivityForResult(intent, 431057);
        } catch (ActivityNotFoundException e) {
            HMSLog.e("ForegroundBusDelegate", "Launch sign in Intent failed. hms is probably being updated：", e);
            a(0, "launch bus intent failed");
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 431057;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.e("ForegroundBusDelegate", "activity is null");
            a(0, "activity is null");
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.e("ForegroundBusDelegate", "activity is finishing");
            a(0, "activity is finishing");
            return;
        }
        this.e = new WeakReference<>(activity);
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                a(0, "intent is invalid");
                return;
            }
            String stringExtra = intent.getStringExtra(HMS_FOREGROUND_REQ_HEADER);
            RequestHeader requestHeader = new RequestHeader();
            this.f12683a = requestHeader;
            if (!requestHeader.fromJson(stringExtra)) {
                a(0, "header is invalid");
                return;
            }
            this.f12684b = intent.getStringExtra(HMS_FOREGROUND_REQ_BODY);
            ForegroundInnerHeader foregroundInnerHeader = this.f12685c;
            if (foregroundInnerHeader == null) {
                a(0, "inner header is invalid");
                return;
            }
            foregroundInnerHeader.fromJson(intent.getStringExtra(HMS_FOREGROUND_REQ_INNER));
            if (TextUtils.isEmpty(this.f12683a.getApiName())) {
                a(0, "action is invalid");
                return;
            }
            a();
            if (!TextUtils.isEmpty(intent.getStringExtra(INNER_PKG_NAME))) {
                HMSLog.i("ForegroundBusDelegate", "isUseInnerHms: true");
                this.f = true;
            }
            e();
        } catch (Throwable th) {
            HMSLog.e("ForegroundBusDelegate", "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
            a(0, "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        c();
        this.e = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 431057) {
            return false;
        }
        if (intent != null && intent.hasExtra(HMS_FOREGROUND_RESP_HEADER)) {
            try {
                stringExtra = intent.getStringExtra(HMS_FOREGROUND_RESP_HEADER);
            } catch (Throwable unused) {
                HMSLog.w("ForegroundBusDelegate", "exception occur, HMS_FOREGROUND_RESP_HEADER get failed.");
                stringExtra = "";
            }
            ResponseHeader responseHeader = new ResponseHeader();
            this.d = responseHeader;
            JsonUtil.jsonToEntity(stringExtra, responseHeader);
        }
        d();
        BusResponseCallback busResponseCallbackB = b(this.f12685c.getResponseCallbackKey());
        if (busResponseCallbackB == null) {
            a(i2, intent);
            return true;
        }
        BusResponseResult busResponseResultSucceedReturn = busResponseCallbackB.succeedReturn(this.e.get(), i2, intent);
        if (busResponseResultSucceedReturn == null) {
            a(i2, intent);
            return true;
        }
        a(busResponseResultSucceedReturn.getCode(), busResponseResultSucceedReturn.getIntent());
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }

    private void b() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f12683a);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f12683a.getKitSdkVersion())));
        if (g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(g().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY, mapFromForegroundRequestHeader);
        }
    }

    private void a(int i, Intent intent) {
        HMSLog.i("ForegroundBusDelegate", "succeedReturn");
        Activity activityG = g();
        if (activityG == null) {
            return;
        }
        activityG.setResult(i, IntentUtil.modifyIntentBehaviorsSafe(intent));
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        BusResponseResult busResponseResultInnerError;
        HMSLog.e("ForegroundBusDelegate", str);
        Activity activityG = g();
        if (activityG == null) {
            return;
        }
        BusResponseCallback busResponseCallbackB = b(this.f12685c.getResponseCallbackKey());
        if (busResponseCallbackB == null || (busResponseResultInnerError = busResponseCallbackB.innerError(this.e.get(), i, str)) == null) {
            activityG.setResult(0);
        } else {
            activityG.setResult(busResponseResultInnerError.getCode(), IntentUtil.modifyIntentBehaviorsSafe(busResponseResultInnerError.getIntent()));
        }
        f();
    }

    private static void a(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
        if (activity == null) {
            HMSLog.i("ForegroundBusDelegate", "null activity, could not start resolution intent");
        }
        availableAdapter.startResolution(activity, availableCallBack);
    }

    private void a() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f12683a);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f12683a.getKitSdkVersion())));
        if (g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(g().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED, mapFromForegroundRequestHeader);
        }
    }

    private void a(String str) {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f12683a);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f12683a.getKitSdkVersion())));
        ResponseHeader responseHeader = this.d;
        if (responseHeader != null) {
            mapFromForegroundRequestHeader.put("statusCode", String.valueOf(responseHeader.getStatusCode()));
            mapFromForegroundRequestHeader.put("result", String.valueOf(this.d.getErrorCode()));
        }
        if (g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(g().getApplicationContext(), str, mapFromForegroundRequestHeader);
        }
    }
}
