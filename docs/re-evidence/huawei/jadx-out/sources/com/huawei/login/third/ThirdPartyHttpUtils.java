package com.huawei.login.third;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.common.OpAnalyticsApi;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.BuildConfig;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.ltb;
import defpackage.oet;
import defpackage.oeu;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ThirdPartyHttpUtils {
    private static final String AUTHORIZATION = "Authorization";
    private static final int DEFAULT_HEADER_CAPACITY = 4;
    private static final int DEFAULT_MAP_CAPACITY = 2;
    private static final int DEFAULT_MAP_SIZE = 8;
    private static final int ERR_CODE_UNKNOWN = -1;
    private static final int HTTP_CONNECT_TIME_OUT = 10000;
    private static final int NOT_AUTH = 1;
    private static final String PARAM_ACCESS_TOKEN = "accessToken";
    private static final String PARAM_APP_ID = "appId";
    private static final String PARAM_APP_TYPE = "appType";
    private static final String PARAM_AUTH_CODE = "authorizationCode";
    private static final String PARAM_CLIENT_ID = "thridPartyClientId";
    private static final String PARAM_REFRESH_TOKEN = "refreshToken";
    private static final String PARAM_SITE_ID = "siteID";
    private static final String PARAM_TOKEN = "token";
    private static final String PARAM_TOKEN_TYPE = "tokenType";
    private static final String PARAM_TS = "ts";
    private static final String TAG = "UIDV_3rdPtyHttpUts";
    private static final String X_CLIENT_ID = "x-client-id";

    public interface RequestCallBack {
        void onFailed(int i);

        void onSuccess(String str);
    }

    public static void postToGetAccessToken(String str, String str2, RequestCallBack requestCallBack) {
        LogUtil.a(TAG, "enter postToGetAT");
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.e(TAG, "postToGetAccessToken no network");
            if (requestCallBack != null) {
                requestCallBack.onFailed(-1);
                return;
            }
            return;
        }
        report(str);
        HashMap map = new HashMap();
        map.put(PARAM_AUTH_CODE, str2);
        map.put("appId", String.valueOf(BuildConfig.HMS_APPLICATION_ID));
        postRequest(str, null, map, requestCallBack);
        LogUtil.a(TAG, "end postToGetAT");
    }

    public static void refreshRt(String str, String str2, String str3, RequestCallBack requestCallBack) {
        LogUtil.a(TAG, "enter refreshRT");
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.e(TAG, "refreshRt no network");
            if (requestCallBack != null) {
                requestCallBack.onFailed(-1);
                return;
            }
            return;
        }
        report(str);
        HashMap map = new HashMap(2);
        map.put("refreshToken", str2);
        map.put("appId", String.valueOf(BuildConfig.HMS_APPLICATION_ID));
        postRequest(str, str3, map, requestCallBack);
        LogUtil.a(TAG, "end refreshRT");
    }

    public static void queryUserData(String str, String str2, String str3, RequestCallBack requestCallBack) {
        LogUtil.a(TAG, "enter queryUserData");
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.e(TAG, "queryUserData no network");
            if (requestCallBack != null) {
                requestCallBack.onFailed(-1);
                return;
            }
            return;
        }
        report(str);
        HashMap map = new HashMap(2);
        map.put("accessToken", str2);
        map.put("appId", String.valueOf(BuildConfig.HMS_APPLICATION_ID));
        postRequest(str, str3, map, requestCallBack);
        LogUtil.a(TAG, "end queryUserData");
    }

    public static void queryUserAccount(String str, String str2, String str3, RequestCallBack requestCallBack) {
        LogUtil.a(TAG, "enter queryUserAccount");
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.e(TAG, "queryUserAccount no network");
            if (requestCallBack != null) {
                requestCallBack.onFailed(-1);
                return;
            }
            return;
        }
        report(str);
        HashMap map = new HashMap(8);
        map.put("accessToken", str2);
        map.put(PARAM_CLIENT_ID, String.valueOf(BuildConfig.HMS_APPLICATION_ID));
        map.put(PARAM_SITE_ID, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        map.put("token", str2);
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("ts", String.valueOf(ltb.h()));
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        postRequest(str, str3, map, requestCallBack);
        LogUtil.a(TAG, "end queryUserAccount");
    }

    public static void queryUserHomeCountry(String str, String str2, String str3, RequestCallBack requestCallBack) {
        ReleaseLogUtil.d(TAG, "enter queryUserHomeCountry");
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.e(TAG, "queryUserHomeCountry no network");
            requestCallBack.onFailed(-1);
        } else {
            getRequest(str, getHomeCountryHeader(str3, str2), requestCallBack);
        }
    }

    private static HashMap<String, String> getHomeCountryHeader(String str, String str2) {
        HashMap<String, String> header = getHeader(str);
        header.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str2);
        header.put(X_CLIENT_ID, String.valueOf(BuildConfig.HMS_APPLICATION_ID));
        return header;
    }

    public static void putUserHomeCountryStatus(String str, String str2, String str3, String str4, RequestCallBack requestCallBack) {
        ReleaseLogUtil.d(TAG, "enter putUserHomeCountryStatus");
        if (!NetworkUtil.h()) {
            ReleaseLogUtil.e(TAG, "putUserHomeCountryStatus no network");
            requestCallBack.onFailed(-1);
        } else {
            HashMap map = new HashMap(2);
            map.put("status", str4);
            putRequest(str, getHomeCountryHeader(str3, str2), map, requestCallBack);
        }
    }

    private static void postRequest(final String str, String str2, HashMap<String, String> map, RequestCallBack requestCallBack) {
        if (!"true".equals(KeyValDbManager.d(BaseApplication.getContext()).c("key_wether_to_auth"))) {
            requestCallBack.onFailed(1);
            return;
        }
        final String[] strArr = new String[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oet.d().c(str, getHeader(str2), getParams(map), String.class, new ResultCallback<String>() { // from class: com.huawei.login.third.ThirdPartyHttpUtils.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str3) {
                strArr[0] = str3;
                countDownLatch.countDown();
                LogUtil.a(ThirdPartyHttpUtils.TAG, "postReq-->result:", str3);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                countDownLatch.countDown();
                if (th != null) {
                    ReleaseLogUtil.e(ThirdPartyHttpUtils.TAG, "postRequest throwable:", th.getMessage());
                    ThirdPartyHttpUtils.callbackErrorCode(str, th);
                } else {
                    ReleaseLogUtil.e(ThirdPartyHttpUtils.TAG, "postRequest throwable null");
                }
            }
        });
        try {
            ReleaseLogUtil.d(TAG, "postRequest isOnTime:", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG, "postRequest InterruptedException");
        }
        if (TextUtils.isEmpty(strArr[0])) {
            requestCallBack.onFailed(-1);
        } else {
            requestCallBack.onSuccess(strArr[0]);
        }
    }

    private static void getRequest(final String str, HashMap<String, String> map, RequestCallBack requestCallBack) {
        if (!"true".equals(KeyValDbManager.d(BaseApplication.getContext()).c("key_wether_to_auth"))) {
            requestCallBack.onFailed(1);
            return;
        }
        final String[] strArr = new String[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oet.d().e(str, map, new HashMap(2), String.class, new ResultCallback<String>() { // from class: com.huawei.login.third.ThirdPartyHttpUtils.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                strArr[0] = str2;
                countDownLatch.countDown();
                LogUtil.a(ThirdPartyHttpUtils.TAG, "getRequest-->result:", str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                countDownLatch.countDown();
                if (th != null) {
                    ReleaseLogUtil.e(ThirdPartyHttpUtils.TAG, "getRequest throwable:", th.getMessage());
                    ThirdPartyHttpUtils.callbackErrorCode(str, th);
                } else {
                    ReleaseLogUtil.e(ThirdPartyHttpUtils.TAG, "getRequest throwable null");
                }
            }
        });
        try {
            ReleaseLogUtil.d(TAG, "getRequest isOnTime:", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG, "getRequest InterruptedException");
        }
        if (TextUtils.isEmpty(strArr[0])) {
            requestCallBack.onFailed(-1);
        } else {
            requestCallBack.onSuccess(strArr[0]);
        }
    }

    private static void putRequest(final String str, HashMap<String, String> map, HashMap<String, String> map2, RequestCallBack requestCallBack) {
        if (!"true".equals(KeyValDbManager.d(BaseApplication.getContext()).c("key_wether_to_auth"))) {
            requestCallBack.onFailed(1);
            return;
        }
        final String[] strArr = new String[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oet.d().d(str, map, ofe.c((Object) map2), String.class, new ResultCallback<String>() { // from class: com.huawei.login.third.ThirdPartyHttpUtils.3
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str2) {
                strArr[0] = str2;
                countDownLatch.countDown();
                LogUtil.a(ThirdPartyHttpUtils.TAG, "putRequest-->result:", str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                countDownLatch.countDown();
                if (th != null) {
                    ReleaseLogUtil.e(ThirdPartyHttpUtils.TAG, "putRequest throwable:", th.getMessage());
                    ThirdPartyHttpUtils.callbackErrorCode(str, th);
                } else {
                    ReleaseLogUtil.e(ThirdPartyHttpUtils.TAG, "putRequest throwable null");
                }
            }
        });
        try {
            ReleaseLogUtil.d(TAG, "putRequest isOnTime:", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG, "putRequest InterruptedException");
        }
        if (TextUtils.isEmpty(strArr[0])) {
            requestCallBack.onFailed(-1);
        } else {
            requestCallBack.onSuccess(strArr[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callbackErrorCode(String str, Throwable th) {
        if (!(th instanceof oeu) || TextUtils.isEmpty(str)) {
            return;
        }
        int iE = ((oeu) th).e();
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 0) {
            return;
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        LogUtil.a(TAG, "callbackErrorCode lastPart=", str2, " errorCode=", Integer.valueOf(iE));
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        HuaweiLoginManager.reportErrorCode(str2, iE);
    }

    private static HashMap<String, String> getHeader(String str) {
        HashMap<String, String> map = new HashMap<>(4);
        map.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        map.put("x-version", CommonUtil.c((Context) null));
        if (!TextUtils.isEmpty(str)) {
            map.put("x-huid", str);
        }
        map.put("Content-Type", "application/json");
        return map;
    }

    private static String getParams(HashMap<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        if (map == null || map.size() <= 0 || (r4 = map.entrySet().iterator()) == null) {
            return "";
        }
        stringBuffer.append("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry instanceof Map.Entry) {
                Map.Entry<String, String> entry2 = entry;
                stringBuffer.append("\n\"").append((Object) entry2.getKey()).append("\":\"").append((Object) entry2.getValue()).append("\",");
            }
        }
        String strTrim = stringBuffer.toString().trim();
        return strTrim.substring(0, strTrim.length() + (-1) < 0 ? 0 : strTrim.length() - 1) + "\n}";
    }

    private static void report(String str) {
        OpAnalyticsApi opAnalyticsApi = LoginInit.getInstance(BaseApplication.getContext()).getOpAnalyticsApi();
        if (opAnalyticsApi != null) {
            opAnalyticsApi.onReport(str, Arrays.asList(Thread.currentThread().getStackTrace()).toString());
        }
    }
}
