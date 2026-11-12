package com.huami.passport.net.tools;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.huami.passport.net.EntityRequest;
import com.huami.passport.net.RestfulRequest;
import com.huami.passport.net.tools.PassportNetworkLogger;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class PassportNetworkLogger {
    private static final String KEYWORD_ERROR_CODE = "error_code";
    private static final String TAG = "PassportNetworkLogger";

    private static void dumpErrorResponse(@NonNull final Request<?> request, @NonNull NetworkResponse networkResponse) {
        try {
            final String str = new String(networkResponse.data);
            if (!TextUtils.isEmpty(str) && str.contains("error_code")) {
                HMLog.info(TAG, new Function0() { // from class: zr5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PassportNetworkLogger.lambda$dumpErrorResponse$3(request, str);
                    }
                });
            }
        } catch (Exception e) {
            HMLog.info(TAG, new Function0() { // from class: as5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PassportNetworkLogger.lambda$dumpErrorResponse$2(e);
                }
            });
        }
    }

    public static void dumpLog(Request<?> request, NetworkResponse networkResponse) {
        if (request == null || networkResponse == null) {
            return;
        }
        dumpRequest(request);
        dumpErrorResponse(request, networkResponse);
    }

    private static void dumpRequest(@NonNull Request<?> request) {
        try {
            final String str = String.format("addRequest[requestId: %s, url: %s]", getRequestId(request), Uri.parse(request.getUrl()).buildUpon().clearQuery().build().toString());
            HMLog.info(TAG, new Function0() { // from class: cs5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PassportNetworkLogger.lambda$dumpRequest$0(str);
                }
            });
        } catch (Exception e) {
            HMLog.info(TAG, new Function0() { // from class: bs5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PassportNetworkLogger.lambda$dumpRequest$1(e);
                }
            });
        }
    }

    private static String getRequestId(@NonNull Request<?> request) {
        try {
            return ((request instanceof EntityRequest) || (request instanceof RestfulRequest)) ? request.getHeaders().get("X-Request-Id") : "RequestId获取失败";
        } catch (Exception e) {
            return "RequestId获取失败[" + e.getMessage() + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$dumpErrorResponse$2(Exception exc) {
        return "请求日志输出失败（response）：" + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$dumpErrorResponse$3(Request request, String str) {
        return String.format("onPassportError[requestId: %s, response: %s]", getRequestId(request), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$dumpRequest$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$dumpRequest$1(Exception exc) {
        return "请求日志输出失败（request）：" + exc.getMessage();
    }
}
