package com.huawei.operation.h5pro.jsmodules;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.system.share.Share;
import com.huawei.health.h5pro.jsbridge.system.share.ShareImageObj;
import com.huawei.health.h5pro.jsbridge.system.share.ShareLinkObj;
import com.huawei.health.h5pro.jsbridge.system.share.ShareObj;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.entity.safetydetect.RiskTokenResponse;
import com.huawei.hms.support.api.safetydetect.SafetyDetect;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.h5pro.TrustListCheckerImpl;
import com.huawei.operation.h5pro.bridgeimpl.ShareImpl;
import com.huawei.operation.h5pro.jsmodules.risktoken.CampaignPluginResult;
import com.huawei.operation.utils.Constants;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CampaignJsApi extends JsBaseModule {
    public static final String CAMPAIGN_JS_API = "campaignJsApi";
    private static final Pattern PATTERN_CAMPAIGN_URL = Pattern.compile("^https://[^/]+/(sandbox/cc/|cch5/)h5builder/SportHealth-[^/]+(?:/[^/]+)?/campaign/.*");
    private static final int SHARE_TYPE_IMAGE = 1;
    private static final int SHARE_TYPE_LINK = 0;
    private static final String TAG = "H5PRO_CampaignJsApi";
    private ShareImpl mShareImpl = null;

    public static boolean isCampaignUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(TAG, "isCampaignUrl: url is empty");
            return false;
        }
        boolean zMatches = PATTERN_CAMPAIGN_URL.matcher(str).matches();
        if (zMatches) {
            LogUtil.i(TAG, "isCampaignUrl: isMatcher");
        }
        return zMatches;
    }

    @JavascriptInterface
    public void share(String str, String str2) {
        LogUtil.i(TAG, "share: " + str);
        try {
            int iOptInt = new JSONObject(str2).optInt(Constants.ACTIVITY_SHARE_TYPE, 0);
            LogUtil.i(TAG, "share: shareType -> " + iOptInt);
            if (iOptInt == 0) {
                shareLink(str, str2);
            } else if (iOptInt == 1) {
                shareImage(str, str2);
            } else {
                onCustomCallback(str, -1);
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "share: exception -> " + e.getMessage());
            onCustomCallback(str, -1);
        }
    }

    private void disableShareIcon(ShareObj shareObj) {
        if (shareObj == null) {
            LogUtil.w(TAG, "disableShare: shareObj is null");
            return;
        }
        Map<String, Object> extra = shareObj.getExtra();
        if (extra == null) {
            extra = new HashMap<>(1);
            shareObj.setExtra(extra);
        }
        extra.put(ShareImpl.COLUMN_IS_SHARE_FAMILY, false);
    }

    private void shareLink(final String str, String str2) {
        if (this.mShareImpl == null) {
            this.mShareImpl = new ShareImpl();
        }
        ShareLinkObj shareLinkObj = (ShareLinkObj) GsonUtil.parseContainsMapJson(str2, ShareLinkObj.class);
        disableShareIcon(shareLinkObj);
        this.mShareImpl.shareLink(shareLinkObj, new Share.ShareCallback() { // from class: com.huawei.operation.h5pro.jsmodules.CampaignJsApi.1
            @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
            public void onSuccess() {
                CampaignJsApi.this.onCustomCallback(str, 0);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
            public void onFailure(int i, String str3) {
                LogUtil.e(CampaignJsApi.TAG, "shareLink: " + i + ", msg -> " + str3);
                CampaignJsApi.this.onCustomCallback(str, Integer.valueOf(i));
            }
        });
    }

    private void shareImage(final String str, String str2) {
        if (this.mShareImpl == null) {
            this.mShareImpl = new ShareImpl();
        }
        ShareImageObj shareImageObj = (ShareImageObj) GsonUtil.parseContainsMapJson(str2, ShareImageObj.class);
        disableShareIcon(shareImageObj);
        this.mShareImpl.shareImage(shareImageObj, new Share.ShareCallback() { // from class: com.huawei.operation.h5pro.jsmodules.CampaignJsApi.2
            @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
            public void onSuccess() {
                CampaignJsApi.this.onCustomCallback(str, 0);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
            public void onFailure(int i, String str3) {
                LogUtil.e(CampaignJsApi.TAG, "shareImage: " + i + ", msg -> " + str3);
                CampaignJsApi.this.onCustomCallback(str, Integer.valueOf(i));
            }
        });
    }

    @JavascriptInterface
    public String getAppInfo() {
        LogUtil.i(TAG, "getAppInfo");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bundleName", BaseApplication.d());
            jSONObject.put("appVersionCode", BaseApplication.c());
            jSONObject.put("appVersionName", BaseApplication.i());
        } catch (JSONException e) {
            LogUtil.e(TAG, "getAppInfo: exception -> " + e.getMessage());
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public void getAuthInfo(String str) {
        LogUtil.i(TAG, "getAuthInfo: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("osName", Agent.OS_NAME);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("deviceModel", Build.MODEL);
            String str2 = Build.DISPLAY;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("romVersion", str2);
            jSONObject.put("lang", LanguageUtil.a());
            jSONObject.put("country", GRSManager.c(this.mContext).getCommonCountryCode());
            LoginInit loginInit = LoginInit.getInstance(this.mContext);
            jSONObject.put("deviceType", loginInit.getDeviceType());
            jSONObject.put("minorModel", loginInit.getAccountInfo(1019));
            if (TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
                jSONObject.put("deviceId", loginInit.getDeviceId());
                jSONObject.put("deviceIdType", "9");
                jSONObject.put(JsbMapKeyNames.H5_USER_ID, loginInit.getAccountInfo(1011));
                jSONObject.put("userToken", loginInit.getAccountInfo(1015));
                jSONObject.put("displayName", loginInit.getAccountInfo(1002));
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "getAuthInfo: exception -> " + e.getMessage());
        }
        onCustomCallback(str, jSONObject.toString());
    }

    @JavascriptInterface
    public void getRiskToken(final String str) {
        LogUtil.i(TAG, "enter getRiskToken");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.CampaignJsApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1551xf88dfd8c(str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getRiskToken$0$com-huawei-operation-h5pro-jsmodules-CampaignJsApi, reason: not valid java name */
    /* synthetic */ void m1551xf88dfd8c(final String str) {
        SafetyDetect.getClient(BaseApplication.b()).getRiskToken().addOnSuccessListener(new OnSuccessListener<RiskTokenResponse>() { // from class: com.huawei.operation.h5pro.jsmodules.CampaignJsApi.4
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(RiskTokenResponse riskTokenResponse) {
                LogUtil.i(CampaignJsApi.TAG, "getRiskToken success,riskToken is" + riskTokenResponse.getRiskToken());
                CampaignJsApi.this.onCustomCallback(str, CampaignPluginResult.successResultWithData(riskTokenResponse).toJsonString());
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.operation.h5pro.jsmodules.CampaignJsApi.3
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                LogUtil.e(CampaignJsApi.TAG, "getRiskToken Failure,info is " + exc.getMessage());
                if (exc instanceof ApiException) {
                    ApiException apiException = (ApiException) exc;
                    CampaignJsApi.this.onCustomCallback(str, CampaignPluginResult.errorResult(apiException.getStatusCode(), apiException.getStatusCode()).toJsonString());
                }
            }
        });
    }
}
