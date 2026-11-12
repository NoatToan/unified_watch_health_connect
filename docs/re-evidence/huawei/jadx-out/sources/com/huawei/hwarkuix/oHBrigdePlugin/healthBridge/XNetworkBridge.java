package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.networkclient.ProgressListener;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.ble.BleConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.tencent.open.utils.HttpUtils;
import defpackage.oer;
import defpackage.oet;
import defpackage.peh;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class XNetworkBridge extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_XNetworkBridge";
    private static final int SUCCESS = 200;
    private static final String TAG = "ArkUIX_XNetworkBridge";

    public XNetworkBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XNetworkBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    private boolean checkNetwork(long j) {
        if (NetworkUtil.i()) {
            return true;
        }
        ohProOnFailure(j, HttpUtils.NetworkUnavailableException.ERROR_INFO);
        return false;
    }

    public void isNetworkAvailable(int i) {
        ReleaseLogUtil.c(R_TAG, "isNetworkAvailable enter");
        boolean zH = NetworkUtil.h();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNetworkAvailable", zH);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isNetworkAvailable put error");
        }
        ReleaseLogUtil.c(R_TAG, "isNetworkAvailable resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getData(int i, String str) {
        Response response = new Response();
        response.data = str;
        response.statusCode = i;
        return HiJsonUtil.d(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getByteData(int i, byte[] bArr) {
        ByteResponse byteResponse = new ByteResponse();
        byteResponse.data = bArr;
        byteResponse.statusCode = i;
        return HiJsonUtil.d(byteResponse);
    }

    public void request(long j, String str) {
        LogUtil.a(TAG, "request enter, callbackId: ", Long.valueOf(j));
        Request request = (Request) peh.b(str, Request.class);
        if (ProfileRequestConstants.PUT_TYPE.equals(request.method)) {
            put(j, request);
            return;
        }
        if ("POST".equals(request.method)) {
            post(j, request);
            return;
        }
        if (ProfileRequestConstants.DELETE_TYPE.equals(request.method)) {
            delete(j, request);
        } else {
            if ("GET".equals(request.method)) {
                get(j, request);
                return;
            }
            ReleaseLogUtil.b(R_TAG, "callbackId:", Long.valueOf(j), "method not support");
            LogUtil.d(TAG, "params is ", str);
            ohProOnFailure(j, getData(-1, "method not support"));
        }
    }

    public void post(final long j, Object obj) {
        Request request;
        LogUtil.a(TAG, "post enter, callbackId ", Long.valueOf(j), " param:", obj);
        if (checkNetwork(j)) {
            if (obj instanceof Request) {
                request = (Request) obj;
            } else {
                request = obj instanceof String ? (Request) peh.b((String) obj, Request.class) : null;
            }
            if (request == null) {
                LogUtil.d(TAG, "params not valid");
                ohProOnFailure(j, getData(-1, "params not valid"));
            } else {
                oet.d().c(request.url, request.headers, HiJsonUtil.d(request.data), String.class, new ResultCallback<String>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge.1
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(String str) {
                        LogUtil.a(XNetworkBridge.TAG, "callbackId:", Long.valueOf(j), "post success,", str);
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnSuccess(j, xNetworkBridge.getData(200, str));
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        long j2 = j;
                        ReleaseLogUtil.b(XNetworkBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnFailure(j, xNetworkBridge.getData(-1, ExceptionUtils.c(th)));
                    }
                });
            }
        }
    }

    public void get(final long j, Object obj) {
        Request request;
        LogUtil.a(TAG, "get enter, callbackId ", Long.valueOf(j), " param:", obj);
        if (checkNetwork(j)) {
            if (obj instanceof Request) {
                request = (Request) obj;
            } else {
                request = obj instanceof String ? (Request) peh.b((String) obj, Request.class) : null;
            }
            if (request == null) {
                LogUtil.d(TAG, "params not valid");
                ohProOnFailure(j, getData(-1, "params not valid"));
            } else if (request.headers != null && "image/jpeg".equals(request.headers.get("Content-type"))) {
                LogUtil.a(TAG, "get image/jpeg");
                oet.d().e(request.url, request.headers, request.data == null ? Collections.EMPTY_MAP : peh.b(HiJsonUtil.d(request.data)), byte[].class, new ResultCallback<byte[]>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge.2
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(byte[] bArr) {
                        LogUtil.a(XNetworkBridge.TAG, "callbackId:", Long.valueOf(j), "get success,", bArr);
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnSuccess(j, xNetworkBridge.getByteData(200, bArr));
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        long j2 = j;
                        ReleaseLogUtil.b(XNetworkBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnFailure(j, xNetworkBridge.getData(-1, ExceptionUtils.c(th)));
                    }
                });
            } else {
                oet.d().e(request.url, request.headers, request.data == null ? Collections.EMPTY_MAP : peh.b(HiJsonUtil.d(request.data)), String.class, new ResultCallback<String>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge.3
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(String str) {
                        LogUtil.a(XNetworkBridge.TAG, "callbackId:", Long.valueOf(j), "get success,", str);
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnSuccess(j, xNetworkBridge.getData(200, str));
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        long j2 = j;
                        ReleaseLogUtil.b(XNetworkBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnFailure(j, xNetworkBridge.getData(-1, ExceptionUtils.c(th)));
                    }
                });
            }
        }
    }

    public void delete(final long j, Object obj) {
        Request request;
        LogUtil.a(TAG, "delete enter, callbackId ", Long.valueOf(j), " param:", obj);
        if (checkNetwork(j)) {
            if (obj instanceof Request) {
                request = (Request) obj;
            } else {
                request = obj instanceof String ? (Request) peh.b((String) obj, Request.class) : null;
            }
            if (request == null) {
                LogUtil.d(TAG, "params not valid");
                ohProOnFailure(j, getData(-1, "params not valid"));
            } else {
                oet.d().c(request.url, request.headers, String.class, new ResultCallback<String>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge.4
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(String str) {
                        LogUtil.a(XNetworkBridge.TAG, "callbackId:", Long.valueOf(j), "delete success,", str);
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnSuccess(j, xNetworkBridge.getData(200, str));
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        long j2 = j;
                        ReleaseLogUtil.b(XNetworkBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnFailure(j, xNetworkBridge.getData(-1, ExceptionUtils.c(th)));
                    }
                });
            }
        }
    }

    public void put(final long j, Object obj) {
        Request request;
        LogUtil.a(TAG, "put enter, callbackId ", Long.valueOf(j), " param:", obj);
        if (checkNetwork(j)) {
            if (obj instanceof Request) {
                request = (Request) obj;
            } else {
                request = obj instanceof String ? (Request) peh.b((String) obj, Request.class) : null;
            }
            if (request == null) {
                LogUtil.d(TAG, "params not valid");
                ohProOnFailure(j, getData(-1, "params not valid"));
            } else {
                oet.d().d(request.url, request.headers, HiJsonUtil.d(request.data), String.class, new ResultCallback<String>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge.5
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(String str) {
                        LogUtil.a(XNetworkBridge.TAG, "callbackId:", Long.valueOf(j), "put success,", str);
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnSuccess(j, xNetworkBridge.getData(200, str));
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        long j2 = j;
                        ReleaseLogUtil.b(XNetworkBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnFailure(j, xNetworkBridge.getData(-1, ExceptionUtils.c(th)));
                    }
                });
            }
        }
    }

    public void downloadFile(final long j, Object obj) {
        Request request;
        LogUtil.a(TAG, "downloadFile enter, callbackId ", Long.valueOf(j), " param:", obj);
        if (checkNetwork(j)) {
            if (obj instanceof Request) {
                request = (Request) obj;
            } else {
                request = obj instanceof String ? (Request) peh.b((String) obj, Request.class) : null;
            }
            if (request == null) {
                LogUtil.d(TAG, "params not valid");
                ohProOnFailure(j, getData(-1, "params not valid"));
            } else {
                oet.d().a(new oer(request.url, request.headers, new File(request.path), new ProgressListener<File>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge.6
                    @Override // com.huawei.networkclient.ProgressListener
                    public void onFinish(File file) {
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnSuccess(j, xNetworkBridge.getData(200, "onFinish"));
                    }

                    @Override // com.huawei.networkclient.ProgressListener
                    public void onProgress(long j2, long j3, boolean z) {
                        if (j3 != 0) {
                            LogUtil.a(XNetworkBridge.TAG, "onProgress,", Long.valueOf(j2 / j3));
                        } else {
                            LogUtil.a(XNetworkBridge.TAG, "onProgress contentLength is 0");
                        }
                    }

                    @Override // com.huawei.networkclient.ProgressListener
                    public void onFail(Throwable th) {
                        long j2 = j;
                        ReleaseLogUtil.b(XNetworkBridge.R_TAG, "callbackId:", Long.valueOf(j2), ExceptionUtils.c(th));
                        XNetworkBridge xNetworkBridge = XNetworkBridge.this;
                        xNetworkBridge.ohProOnFailure(j, xNetworkBridge.getData(-1, ExceptionUtils.c(th)));
                    }
                }));
            }
        }
    }

    /* JADX INFO: loaded from: classes37.dex */
    class Request {

        @SerializedName("data")
        Object data;

        @SerializedName("headers")
        Map<String, String> headers;

        @SerializedName("method")
        String method;

        @SerializedName(BleConstants.KEY_PATH)
        String path;

        @SerializedName("timeout")
        int timeout;

        @SerializedName("url")
        String url;

        Request() {
        }

        public String toString() {
            return "Request{method='" + this.method + "', url='" + this.url + "', data='" + this.data + "', timeout=" + this.timeout + ", headers=" + this.headers + '}';
        }
    }

    /* JADX INFO: loaded from: classes37.dex */
    class Response {
        String data;
        Map<String, String> headers;
        int statusCode;
        String statusText;

        Response() {
        }
    }

    /* JADX INFO: loaded from: classes37.dex */
    class ByteResponse {
        byte[] data;
        int statusCode;

        ByteResponse() {
        }
    }
}
