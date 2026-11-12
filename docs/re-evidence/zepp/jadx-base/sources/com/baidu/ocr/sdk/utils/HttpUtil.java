package com.baidu.ocr.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.exception.SDKError;
import com.baidu.ocr.sdk.model.AccessToken;
import com.baidu.ocr.sdk.model.RequestParams;

/* JADX INFO: loaded from: classes2.dex */
public class HttpUtil {
    private static volatile HttpUtil instance;
    private static Options options = new Options();
    private Handler handler;

    public static class Options {
        private int connectionTimeoutInMillis = 10000;
        private int socketTimeoutInMillis = 10000;

        public int getConnectionTimeoutInMillis() {
            return this.connectionTimeoutInMillis;
        }

        public int getSocketTimeoutInMillis() {
            return this.socketTimeoutInMillis;
        }

        public void setConnectionTimeoutInMillis(int i) {
            this.connectionTimeoutInMillis = i;
        }

        public void setSocketTimeoutInMillis(int i) {
            this.socketTimeoutInMillis = i;
        }
    }

    private HttpUtil() {
    }

    public static HttpUtil getInstance() {
        if (instance == null) {
            synchronized (HttpUtil.class) {
                if (instance == null) {
                    instance = new HttpUtil();
                }
            }
        }
        return instance;
    }

    public static Options getOptions() {
        return options;
    }

    public static void setOptions(Options options2) {
        options = options2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwSDKError(OnResultListener onResultListener, int i, String str) {
        onResultListener.onError(new SDKError(i, str));
    }

    public void getAccessToken(final OnResultListener<AccessToken> onResultListener, String str, String str2) {
        final AccessTokenParser accessTokenParser = new AccessTokenParser();
        HttpsClient httpsClient = new HttpsClient();
        HttpsClient.RequestBody requestBody = new HttpsClient.RequestBody();
        requestBody.setBody(str2);
        HttpsClient.RequestInfo requestInfo = new HttpsClient.RequestInfo(str, requestBody);
        requestInfo.setHeader("Content-Type", "text/html");
        requestInfo.build();
        httpsClient.newCall(requestInfo).enqueue(new HttpsClient.Callback() { // from class: com.baidu.ocr.sdk.utils.HttpUtil.2
            @Override // com.baidu.ocr.sdk.utils.HttpsClient.Callback
            public void onFailure(Throwable th) {
                HttpUtil.throwSDKError(onResultListener, SDKError.ErrorCode.NETWORK_REQUEST_ERROR, "Network error", th);
            }

            @Override // com.baidu.ocr.sdk.utils.HttpsClient.Callback
            public void onResponse(String str3) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    HttpUtil.throwSDKError(onResultListener, 283505, "Server illegal response " + str3);
                    return;
                }
                try {
                    AccessToken accessToken = (AccessToken) accessTokenParser.parse(str3);
                    if (accessToken != null) {
                        OCR.getInstance(null).setAccessToken(accessToken);
                        OCR.getInstance(null).setLicense(accessToken.getLic());
                        onResultListener.onResult(accessToken);
                    } else {
                        HttpUtil.throwSDKError(onResultListener, 283505, "Server illegal response " + str3);
                    }
                } catch (SDKError e) {
                    onResultListener.onError(e);
                } catch (Exception e2) {
                    HttpUtil.throwSDKError(onResultListener, 283505, "Server illegal response " + str3, e2);
                }
            }
        });
    }

    public void init() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    public <T> void post(String str, RequestParams requestParams, final Parser<T> parser, final OnResultListener<T> onResultListener) {
        HttpsClient httpsClient = new HttpsClient();
        HttpsClient.RequestBody requestBody = new HttpsClient.RequestBody();
        requestBody.setStrParams(requestParams.getStringParams());
        requestBody.setFileParams(requestParams.getFileParams());
        HttpsClient.RequestInfo requestInfo = new HttpsClient.RequestInfo(str, requestBody);
        requestInfo.build();
        httpsClient.newCall(requestInfo).enqueue(new HttpsClient.Callback() { // from class: com.baidu.ocr.sdk.utils.HttpUtil.1
            @Override // com.baidu.ocr.sdk.utils.HttpsClient.Callback
            public void onFailure(final Throwable th) {
                HttpUtil.this.handler.post(new Runnable() { // from class: com.baidu.ocr.sdk.utils.HttpUtil.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        HttpUtil.throwSDKError(onResultListener, SDKError.ErrorCode.NETWORK_REQUEST_ERROR, "Network error", th);
                    }
                });
            }

            @Override // com.baidu.ocr.sdk.utils.HttpsClient.Callback
            public void onResponse(String str2) {
                try {
                    final Object obj = parser.parse(str2);
                    HttpUtil.this.handler.post(new Runnable() { // from class: com.baidu.ocr.sdk.utils.HttpUtil.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            onResultListener.onResult(obj);
                        }
                    });
                } catch (OCRError e) {
                    HttpUtil.this.handler.post(new Runnable() { // from class: com.baidu.ocr.sdk.utils.HttpUtil.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            onResultListener.onError(e);
                        }
                    });
                }
            }
        });
    }

    public void release() {
        this.handler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwSDKError(OnResultListener onResultListener, int i, String str, Throwable th) {
        onResultListener.onError(new SDKError(i, str, th));
    }
}
