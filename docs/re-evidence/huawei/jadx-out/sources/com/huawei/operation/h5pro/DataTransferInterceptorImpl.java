package com.huawei.operation.h5pro;

import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.system.network.DataTransferInterceptor;
import com.huawei.health.h5pro.jsbridge.system.network.RequestObj;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.R;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DataTransferInterceptorImpl implements DataTransferInterceptor {
    private static final String TAG = "DataTransferInterceptorImpl";
    public static final String TOKEN_PLACEHOLDER = "TOKEN_PLACEHOLDER";
    private static volatile List<String> sTrustedApiHost;

    public DataTransferInterceptorImpl() {
        init();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.network.DataTransferInterceptor
    public RequestObj dataIntercept(H5ProAppInfo h5ProAppInfo, String str, RequestObj requestObj) {
        if (!TrustListCheckerImpl.isTrustedH5MiniProgram(h5ProAppInfo, str) && !TrustListCheckerImpl.isTrustedUrl(str)) {
            LogUtil.j(TAG, "dataIntercept: unTrusted h5 app");
            return requestObj;
        }
        if (!isTrustedNetworkApi(requestObj.getUrl())) {
            LogUtil.j(TAG, "dataIntercept: unTrusted network api");
            return requestObj;
        }
        requestObj.setHeaders(initHeaders(requestObj.getHeaders()));
        if (TextUtils.isEmpty(requestObj.getRequestBody())) {
            requestObj.setBody(initBody(requestObj.getBody()));
            return requestObj;
        }
        requestObj.setRequestBody(initRequestBody(requestObj.getRequestBody()));
        return requestObj;
    }

    public static Map<String, String> initHeaders(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.a(TAG, "initHeaders: headers is empty");
            return map;
        }
        if (map.containsKey(CloudParamKeys.X_TOKEN_TYPE) && map.containsKey(CloudParamKeys.X_TOKEN) && "1".equalsIgnoreCase(map.get(CloudParamKeys.X_TOKEN_TYPE)) && TOKEN_PLACEHOLDER.equalsIgnoreCase(map.get(CloudParamKeys.X_TOKEN))) {
            LogUtil.a(TAG, "initHeaders: replaces");
            map.put(CloudParamKeys.X_TOKEN, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        }
        return map;
    }

    public static Map<String, Object> initBody(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.a(TAG, "initBody: body is empty");
            return map;
        }
        if (map.containsKey("tokenType") && map.containsKey("token") && "1".equalsIgnoreCase(String.valueOf(map.get("tokenType"))) && TOKEN_PLACEHOLDER.equalsIgnoreCase(String.valueOf(map.get("token")))) {
            LogUtil.a(TAG, "initBody: replaces");
            map.put("token", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        }
        return map;
    }

    private String initRequestBody(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "initRequestBody: body is empty");
            return str;
        }
        try {
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.has("tokenType") && jSONObject.has("token") && "1".equalsIgnoreCase(String.valueOf(jSONObject.get("tokenType"))) && TOKEN_PLACEHOLDER.equalsIgnoreCase(String.valueOf(jSONObject.get("token")))) {
                    LogUtil.a(TAG, "initRequestBody: replaces");
                    jSONObject.put("token", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
                }
            } catch (JSONException e) {
                e = e;
                LogUtil.e(TAG, "initRequestBody: exception -> " + e.getMessage());
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
        return jSONObject == null ? str : jSONObject.toString();
    }

    private static void init() {
        synchronized (DataTransferInterceptorImpl.class) {
            if (sTrustedApiHost == null || sTrustedApiHost.isEmpty()) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.DataTransferInterceptorImpl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            DataTransferInterceptorImpl.initTrustedNetworkApiHost();
                        }
                    });
                } else {
                    initTrustedNetworkApiHost();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initTrustedNetworkApiHost() {
        synchronized (DataTransferInterceptorImpl.class) {
            try {
                if (sTrustedApiHost == null || sTrustedApiHost.isEmpty()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.trusted_network_api_grs_key);
                    if (stringArray != null && stringArray.length != 0) {
                        sTrustedApiHost = new ArrayList(stringArray.length);
                        for (String str : stringArray) {
                            sTrustedApiHost.add(GRSManager.c(BaseApplication.getContext()).getUrl(str));
                        }
                        sTrustedApiHost = Collections.unmodifiableList(sTrustedApiHost);
                        try {
                            LogUtil.a(TAG, "initTrustedNetworkApiHost: duration -> " + Math.subtractExact(System.currentTimeMillis(), jCurrentTimeMillis));
                        } catch (ArithmeticException e) {
                            LogUtil.e(TAG, "initTrustedNetworkApiHost: exception -> " + e.getMessage());
                        }
                    }
                    sTrustedApiHost = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isTrustedNetworkApi(String str) {
        synchronized (DataTransferInterceptorImpl.class) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(TAG, "isTrustedNetworkApiHost: networkApi is empty");
                return false;
            }
            initTrustedNetworkApiHost();
            for (String str2 : sTrustedApiHost) {
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    return true;
                }
            }
            LogUtil.j(TAG, "isTrustedNetworkApiHost: networkApi is untrusted");
            return false;
        }
    }
}
