package com.huawei.operation.h5pro;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.jsbridge.system.network.SseRequestInterceptor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.NetworkClientMgrApi;
import com.huawei.networkclient.SseRequestFactory;
import defpackage.oet;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SseRequestInterceptorImpl implements SseRequestInterceptor {
    private static final String BODY = "body";
    private static final String HEADERS = "headers";
    private static final String LANGUAGE_ZN_CN = "zh-CN";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final String REQUEST_TYPE = "requestType";
    private static final String R_TAG = "R_SseRequestImpl";
    private static final String TAG = "SseRequestImpl";
    private static final String TIMEOUT = "timeout";
    private static final String URL = "url";
    private static final String ZH_CN = "zh_CN";

    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    @Override // com.huawei.health.h5pro.jsbridge.system.network.SseRequestInterceptor
    public void startSseRequest(long j, String str, SseRequestInterceptor.SSECallback sSECallback) {
        byte b2;
        LogUtil.a(TAG, "startSseRequest param=", str);
        try {
            Map<String, Object> sseRequestParams = parseSseRequestParams(str);
            String str2 = (String) sseRequestParams.get("url");
            String str3 = (String) sseRequestParams.get(REQUEST_TYPE);
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                String upperCase = str3.toUpperCase(Locale.ENGLISH);
                int iHashCode = upperCase.hashCode();
                if (iHashCode != 70454) {
                    if (iHashCode == 2461856 && upperCase.equals("POST")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (upperCase.equals("GET")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    executeGetRequest(str2, sseRequestParams, j, sSECallback);
                    return;
                }
                if (b2 == 1) {
                    executePostRequest(str2, sseRequestParams, j, sSECallback);
                    return;
                }
                sSECallback.fail("SSECallback requestType not support:" + str3, -1);
                sSECallback.complete("Stream ended", 0);
                ReleaseLogUtil.a(R_TAG, "SSECallback requestType not support:", str3);
                return;
            }
            sSECallback.fail("SSECallback param is error.", -1);
            sSECallback.complete("Stream ended", 0);
            ReleaseLogUtil.a(R_TAG, "SSECallback url:", Boolean.valueOf(!TextUtils.isEmpty(str2)), " requestType:", Boolean.valueOf(!TextUtils.isEmpty(str3)));
        } catch (JSONException e) {
            sSECallback.fail(e.getMessage(), -1);
            sSECallback.complete("Stream ended", 0);
            ReleaseLogUtil.a(R_TAG, "SSECallback JSONException:", ExceptionUtils.c(e));
        }
    }

    private Map<String, Object> parseSseRequestParams(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        map.put("url", jSONObject.getString("url"));
        map.put(REQUEST_TYPE, jSONObject.getString(REQUEST_TYPE));
        map.put(HEADERS, jSONObject.getJSONObject(HEADERS));
        map.put("body", jSONObject.getJSONObject("body"));
        map.put(TIMEOUT, jSONObject.getString(TIMEOUT));
        return map;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.network.SseRequestInterceptor
    public void destroySseRequest(long j, String str) {
        LogUtil.a(TAG, "SSECallback callbackId=", Long.valueOf(j), " param=", str);
        oet.d().e();
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static class SseCallbackImpl implements NetworkClientMgrApi.SSECallback {
        private final long callbackId;
        private final SseRequestInterceptor.SSECallback sseCallback;

        public SseCallbackImpl(long j, SseRequestInterceptor.SSECallback sSECallback) {
            this.callbackId = j;
            this.sseCallback = sSECallback;
        }

        @Override // com.huawei.networkclient.NetworkClientMgrApi.SSECallback
        public void success(String str) {
            LogUtil.a(SseRequestInterceptorImpl.TAG, "SSECallback callbackId=", Long.valueOf(this.callbackId), " data=", str);
            this.sseCallback.success(str);
        }

        @Override // com.huawei.networkclient.NetworkClientMgrApi.SSECallback
        public void fail(String str, int i) {
            LogUtil.a(SseRequestInterceptorImpl.TAG, "SSECallback callbackId=", Long.valueOf(this.callbackId), " errorMsg=", str, " errorCode=", Integer.valueOf(i));
            this.sseCallback.fail(str, i);
        }

        @Override // com.huawei.networkclient.NetworkClientMgrApi.SSECallback
        public void complete(String str, int i) {
            LogUtil.a(SseRequestInterceptorImpl.TAG, "SSECallback callbackId=", Long.valueOf(this.callbackId), " message=", str, " code=", Integer.valueOf(i));
            this.sseCallback.complete(str, i);
        }
    }

    private void executeGetRequest(String str, Map<String, Object> map, long j, SseRequestInterceptor.SSECallback sSECallback) {
        SseRequestFactory sseRequestFactory = new SseRequestFactory(BaseApplication.getContext());
        oet oetVarD = oet.d();
        oetVarD.b(getTimeout(map));
        oetVarD.c(str, sseRequestFactory.a((JSONObject) map.get(HEADERS)), new SseCallbackImpl(j, sSECallback));
    }

    private void executePostRequest(String str, Map<String, Object> map, long j, SseRequestInterceptor.SSECallback sSECallback) {
        SseRequestFactory sseRequestFactory = new SseRequestFactory(BaseApplication.getContext());
        oet oetVarD = oet.d();
        oetVarD.b(getTimeout(map));
        oetVarD.a(str, sseRequestFactory.a((JSONObject) map.get(HEADERS)), sseRequestFactory.c((JSONObject) map.get("body")), new SseCallbackImpl(j, sSECallback));
    }

    private int getTimeout(Map<String, Object> map) {
        Object obj = map.get(TIMEOUT);
        if (obj instanceof String) {
            return qrs.a((String) obj);
        }
        return 0;
    }
}
