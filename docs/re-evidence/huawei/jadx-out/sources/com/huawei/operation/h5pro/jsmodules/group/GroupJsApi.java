package com.huawei.operation.h5pro.jsmodules.group;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.cua;
import defpackage.exf;
import defpackage.jpg;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GroupJsApi extends JsBaseModule {
    private static final String ACTIVITY_ID = "activityId";
    private static final String ACTIVITY_NAME = "activityName";
    private static final String BEGIN_TIME = "beginTime";
    private static final String DEEPLINK = "deeplink";
    private static final String GROUP_ID = "groupId";
    private static final String STATUS = "status";
    private static final String TAG = "GroupJsApi";
    private cua groupUtil;
    private H5LocationSharingSubscriber subscriber;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.groupUtil = cua.a();
        this.subscriber = new H5LocationSharingSubscriber();
    }

    @JavascriptInterface
    public void registerLocationSharingListener(long j) {
        this.subscriber.setCallbackId(j);
        this.groupUtil.e(this.subscriber);
        updateLocationSharingToH5(j, this.groupUtil.e(), this.groupUtil.d(), this.groupUtil.h());
    }

    @JavascriptInterface
    public void pushActivityInfo(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.groupUtil.a(jSONObject.getString("activityId"), jSONObject.getString("groupId"), jSONObject.getString("activityName"));
            onSuccessCallback(j, true);
        } catch (JSONException e) {
            LogUtil.a(TAG, "pushActivityInfo JSONException:", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void enableLocationSharing(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.groupUtil.d(jSONObject.optBoolean("status"), jSONObject.optString("activityId", ""), jSONObject.optString("groupId", ""), jSONObject.optLong(BEGIN_TIME, 0L), jSONObject.optString("activityName", ""));
            onSuccessCallback(j, true);
        } catch (JSONException e) {
            LogUtil.a(TAG, "enableLocationSharing JSONException:", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void setMiniBarStatus(long j, String str) {
        LogUtil.a(TAG, "setMiniBarStatus enter");
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.groupUtil.e(jSONObject.optBoolean("status", false), jSONObject.optString(DEEPLINK, ""), jSONObject.optString("activityName", ""));
            onSuccessCallback(j, true);
        } catch (JSONException e) {
            LogUtil.a(TAG, "enableLocationSharing JSONException:", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void getOrientation(long j) {
        LogUtil.a(TAG, "getOrientation enter");
        onSuccessCallback(j, Float.valueOf(this.groupUtil.b()));
    }

    @JavascriptInterface
    public void getLocation(long j) {
        LogUtil.a(TAG, "getLocation enter");
        jpg jpgVarC = this.groupUtil.c();
        if (jpgVarC == null) {
            LogUtil.a(TAG, "getLocation is empty");
            onFailureCallback(j, "location is empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JsbMapKeyNames.H5_LOC_LON, jpgVarC.f38787a);
            jSONObject.put(JsbMapKeyNames.H5_LOC_LAT, jpgVarC.d);
            LogUtil.a(TAG, "getLocation: ", jSONObject);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(TAG, "getLocation jsonException:", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void updateLocation(final long j) {
        LogUtil.a(TAG, "updateLocation enter");
        this.groupUtil.c(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.group.GroupJsApi$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1605xefdb50ff(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateLocation$0$com-huawei-operation-h5pro-jsmodules-group-GroupJsApi, reason: not valid java name */
    /* synthetic */ void m1605xefdb50ff(long j, int i, Object obj) {
        if (i == 0) {
            onSuccessCallback(j, true);
        } else {
            onFailureCallback(i, (String) obj);
        }
    }

    @JavascriptInterface
    public void setLocationUploadInterval(long j, int i) {
        LogUtil.a(TAG, "setLocationUploadInterval interval:", Integer.valueOf(i));
        this.groupUtil.c(i);
    }

    @JavascriptInterface
    public void isSupportLocShare(final long j) {
        LogUtil.a(TAG, "isSupportLocShare enter");
        this.groupUtil.e(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.group.GroupJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1604x2bfa4f6c(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$isSupportLocShare$1$com-huawei-operation-h5pro-jsmodules-group-GroupJsApi, reason: not valid java name */
    /* synthetic */ void m1604x2bfa4f6c(long j, int i, Object obj) {
        if (i == 0) {
            onSuccessCallback(j, obj);
        } else {
            onFailureCallback(i, (String) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationSharingToH5(long j, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("activityId", str);
            jSONObject.put("groupId", str2);
            jSONObject.put("status", z);
            LogUtil.a(TAG, "updateLocationSharingToH5: ", jSONObject);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(TAG, "updateLocationSharingToH5 jsonException:", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        this.groupUtil.a(this.subscriber);
    }

    /* JADX INFO: loaded from: classes13.dex */
    class H5LocationSharingSubscriber extends exf {
        private long callbackId;

        private H5LocationSharingSubscriber() {
        }

        public void setCallbackId(long j) {
            this.callbackId = j;
        }

        @Override // defpackage.exf
        public void onLocationSharingChanged(String str, String str2, boolean z) {
            GroupJsApi.this.updateLocationSharingToH5(this.callbackId, str, str2, z);
        }
    }
}
