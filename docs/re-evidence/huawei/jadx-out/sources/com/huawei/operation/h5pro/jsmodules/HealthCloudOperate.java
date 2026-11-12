package com.huawei.operation.h5pro.jsmodules;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.h5pro.DataTransferInterceptorImpl;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.fxl;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
class HealthCloudOperate {
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final String TAG = "HealthCloudOperate";
    private final oet mNetworkClientMgr = oet.d();
    private final HealthDataCloudFactory mHealthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());

    HealthCloudOperate() {
    }

    void request(String str, final ResultCallback<String> resultCallback) {
        LogUtil.a(TAG, "request");
        if (resultCallback == null) {
            LogUtil.j(TAG, "callback is null");
            return;
        }
        final ParamObj paramObj = (ParamObj) GsonUtil.parseContainsMapJson(str, ParamObj.class);
        if (paramObj == null) {
            resultCallback.onFailure(new RuntimeException("post: failed to parse the parameter"));
            return;
        }
        String str2 = paramObj.urlKey;
        if (TextUtils.isEmpty(str2)) {
            resultCallback.onFailure(new RuntimeException("post: urlKey is empty"));
            return;
        }
        final String str3 = paramObj.urlPath;
        final String str4 = paramObj.method;
        GRSManager.c(BaseApplication.getContext()).d(str2, new GrsQueryCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthCloudOperate.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str5) {
                if (TextUtils.isEmpty(str5)) {
                    resultCallback.onFailure(new RuntimeException(String.format(Locale.ENGLISH, "%s: baseUrl(GRS) is empty", str4)));
                } else if ("POST".equalsIgnoreCase(str4) || "GET".equalsIgnoreCase(str4)) {
                    HealthCloudOperate.this.request(str4, String.format(Locale.ENGLISH, "%s%s", str5, str3), paramObj, resultCallback);
                } else {
                    resultCallback.onFailure(new RuntimeException(String.format(Locale.ENGLISH, "this method(%s) is not supported currently", str4)));
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                resultCallback.onFailure(new RuntimeException(String.format(Locale.ENGLISH, "%s: failed to obtain the GRS, code is %d", str4, Integer.valueOf(i))));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void request(String str, String str2, ParamObj paramObj, ResultCallback<String> resultCallback) {
        LogUtil.d(TAG, str + ": url -> " + str2);
        boolean zIsTrustedNetworkApi = DataTransferInterceptorImpl.isTrustedNetworkApi(str2);
        Map<String, String> commonHeaders = getCommonHeaders();
        Map<? extends String, ? extends String> map = paramObj.headers;
        String str3 = paramObj.body;
        Map<String, Object> mapInitBody = paramObj.bodyMap;
        if (map != null && !map.isEmpty()) {
            if (zIsTrustedNetworkApi) {
                commonHeaders.putAll(DataTransferInterceptorImpl.initHeaders(map));
            } else {
                commonHeaders.putAll(map);
            }
        }
        LogUtil.d(TAG, str + ": requestHeaders -> " + commonHeaders);
        if (!TextUtils.isEmpty(str3)) {
            mapInitBody = GsonUtil.parseMapJson(str3);
        }
        if (zIsTrustedNetworkApi) {
            mapInitBody = DataTransferInterceptorImpl.initBody(mapInitBody);
        }
        if ("GET".equalsIgnoreCase(str)) {
            Map<String, String> mapInitGetParams = initGetParams(this.mHealthDataCloudFactory.getBody(mapInitBody));
            LogUtil.d(TAG, "get: requestBody -> " + mapInitGetParams);
            this.mNetworkClientMgr.e(str2, commonHeaders, mapInitGetParams, String.class, resultCallback);
            return;
        }
        if ((mapInitBody == null || mapInitBody.isEmpty()) && !TextUtils.isEmpty(str3)) {
            LogUtil.d(TAG, "post: body -> " + str3);
            this.mNetworkClientMgr.c(str2, commonHeaders, str3, String.class, resultCallback);
            return;
        }
        Map<String, Object> commonParams = getCommonParams();
        if (mapInitBody != null && !mapInitBody.isEmpty()) {
            commonParams.putAll(mapInitBody);
        }
        String strC = ofe.c(commonParams);
        LogUtil.d(TAG, "post: requestBody -> " + strC);
        this.mNetworkClientMgr.c(str2, commonHeaders, strC, String.class, resultCallback);
    }

    private Map<String, String> getCommonHeaders() {
        Map<String, String> headers = this.mHealthDataCloudFactory.getHeaders();
        Context context = BaseApplication.getContext();
        if (!LoginInit.getInstance(context).isBrowseMode()) {
            headers.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1008);
            headers.put(CloudParamKeys.X_TOKEN, accountInfo);
            headers.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        }
        headers.put(CloudParamKeys.X_CLIENT_TIMEZONE, HiDateUtil.c((String) null));
        headers.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(context));
        headers.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        headers.put(CloudParamKeys.X_APP_TYPE, String.valueOf(AppTypeUtils.getAppType()));
        headers.put(CloudParamKeys.X_SITE_ID, LoginInit.getInstance(context).getAccountInfo(1009));
        headers.put(CloudParamKeys.X_APP_ID, BaseApplication.getAppPackage());
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        headers.put(CloudParamKeys.X_DEVICE_ID, deviceId);
        headers.put(CloudParamKeys.X_DEVICE_TYPE, LoginInit.getInstance(context).getDeviceType());
        return headers;
    }

    private Map<String, Object> getCommonParams() {
        Map<String, Object> body = this.mHealthDataCloudFactory.getBody("");
        body.put("phoneType", PhoneInfoUtils.getHuaweiManufaturerOrEmui());
        body.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        String strA = LanguageUtil.a();
        body.put("language", strA);
        body.put("lang", strA);
        body.put("manufacturer", Build.MANUFACTURER);
        body.put("timeZone", HiDateUtil.c((String) null));
        body.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        body.put("countryCode", loginInit.getAccountInfo(1010));
        body.put("siteId", loginInit.getAccountInfo(1009));
        return body;
    }

    private Map<String, String> initGetParams(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    map2.put(entry.getKey(), (String) value);
                } else {
                    map2.put(entry.getKey(), value == null ? "" : String.valueOf(value));
                }
            }
        }
        return map2;
    }

    static class ParamObj {

        @SerializedName(TtmlNode.TAG_BODY)
        private String body;

        @SerializedName("bodyMap")
        private Map<String, Object> bodyMap;

        @SerializedName("headers")
        private Map<String, String> headers;

        @SerializedName("method")
        private String method;

        @SerializedName("urlKey")
        private String urlKey;

        @SerializedName("urlPath")
        private String urlPath;

        private ParamObj() {
        }
    }
}
