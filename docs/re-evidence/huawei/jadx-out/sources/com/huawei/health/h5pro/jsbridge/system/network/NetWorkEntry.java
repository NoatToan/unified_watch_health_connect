package com.huawei.health.h5pro.jsbridge.system.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.Constants;
import defpackage.oet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class NetWorkEntry extends JsBaseModule {
    private static DataTransferInterceptor d;
    private static SseRequestInterceptor e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private oet f6848a;

    /* JADX INFO: loaded from: classes28.dex */
    public static class a implements ResultCallback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f6850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<NetWorkEntry> f6851b;

        public a(long j, NetWorkEntry netWorkEntry) {
            this.f6850a = j;
            this.f6851b = new WeakReference<>(netWorkEntry);
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            NetWorkEntry netWorkEntry = (NetWorkEntry) GeneralUtil.getReferent(this.f6851b);
            if (netWorkEntry != null) {
                netWorkEntry.onFailureCallback(this.f6850a, th == null ? Constants.NULL : th.getMessage());
                return;
            }
            LogUtil.w("InnerResultCallback", "onFailure: netWorkEntry is null, " + this.f6850a);
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            NetWorkEntry netWorkEntry = (NetWorkEntry) GeneralUtil.getReferent(this.f6851b);
            if (netWorkEntry != null) {
                netWorkEntry.onSuccessCallback(this.f6850a, str);
                return;
            }
            LogUtil.w("InnerResultCallback", "onSuccess: netWorkEntry is null, " + this.f6850a);
        }
    }

    private String a(String str, RequestObj requestObj) {
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            LogUtil.w(this.TAG, com.huawei.health.h5pro.core.a.a("initUrlParams: invalid url -> ", str));
            return str;
        }
        if (TextUtils.isEmpty(Uri.parse(str).getQuery())) {
            HashMap<String, String> map = new HashMap<>();
            d(map, requestObj.getBody());
            d(map, GsonUtil.parseMapJson(requestObj.getRequestBody()));
            if (!map.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(TextUtils.concat(entry.getKey(), "=", entry.getValue(), "&"));
                }
                return TextUtils.concat(str, "?", sb.substring(0, sb.length() - 1)).toString();
            }
        }
        return str;
    }

    private void a(long j, RequestObj requestObj) {
        LogUtil.i(this.TAG, "post");
        if (this.f6848a == null) {
            this.f6848a = oet.d();
        }
        String requestBody = requestObj.getRequestBody();
        oet oetVar = this.f6848a;
        String url = requestObj.getUrl();
        Map<String, String> headers = requestObj.getHeaders();
        if (TextUtils.isEmpty(requestBody)) {
            requestBody = GsonUtil.toJson(requestObj.getBody());
        }
        oetVar.c(url, headers, requestBody, String.class, new a(j, this));
    }

    private void b(long j, RequestObj requestObj) {
        LogUtil.i(this.TAG, "put");
        if (this.f6848a == null) {
            this.f6848a = oet.d();
        }
        String requestBody = requestObj.getRequestBody();
        oet oetVar = this.f6848a;
        String url = requestObj.getUrl();
        Map<String, String> headers = requestObj.getHeaders();
        if (TextUtils.isEmpty(requestBody)) {
            requestBody = GsonUtil.toJson(requestObj.getBody());
        }
        oetVar.d(url, headers, requestBody, String.class, new a(j, this));
    }

    private void c(long j, RequestObj requestObj) {
        LogUtil.i(this.TAG, "delete");
        if (this.f6848a == null) {
            this.f6848a = oet.d();
        }
        this.f6848a.c(a(requestObj.getUrl(), requestObj), requestObj.getHeaders(), String.class, new a(j, this));
    }

    private void d(HashMap<String, String> map, Map<String, Object> map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj instanceof String) {
                map.put(str, (String) obj);
            } else {
                map.put(str, obj == null ? "" : String.valueOf(obj));
            }
        }
    }

    private void e(long j, RequestObj requestObj) {
        LogUtil.i(this.TAG, "get");
        HashMap<String, String> map = new HashMap<>();
        d(map, requestObj.getBody());
        d(map, GsonUtil.parseMapJson(requestObj.getRequestBody()));
        if (this.f6848a == null) {
            this.f6848a = oet.d();
        }
        this.f6848a.e(requestObj.getUrl(), requestObj.getHeaders(), map, String.class, new a(j, this));
    }

    public static void setDataTransferInterceptor(DataTransferInterceptor dataTransferInterceptor) {
        d = dataTransferInterceptor;
    }

    public static void setSseRequest(SseRequestInterceptor sseRequestInterceptor) {
        e = sseRequestInterceptor;
    }

    @JavascriptInterface
    public void destroySseRequest(long j, String str) {
        LogUtil.i(this.TAG, "stopSseRequest");
        SseRequestInterceptor sseRequestInterceptor = e;
        if (sseRequestInterceptor != null) {
            sseRequestInterceptor.destroySseRequest(j, str);
        } else {
            LogUtil.e(this.TAG, "stopSseRequest mSseRequestInterceptor == null");
            onFailureCallback(j, "something fail", -1);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        this.f6848a = null;
    }

    @JavascriptInterface
    public void request(long j, String str) {
        H5ProInstance h5ProInstance;
        LogUtil.i(this.TAG, "request");
        RequestObj requestObjDataIntercept = (RequestObj) GsonUtil.parseContainsMapJson(str, RequestObj.class);
        if (requestObjDataIntercept == null || TextUtils.isEmpty(requestObjDataIntercept.getUrl())) {
            onFailureCallback(j, "Invalid parameter.");
            return;
        }
        DataTransferInterceptor dataTransferInterceptor = d;
        if (dataTransferInterceptor != null && (h5ProInstance = this.mH5ProInstance) != null) {
            requestObjDataIntercept = dataTransferInterceptor.dataIntercept(h5ProInstance.getAppInfo(), this.mH5ProInstance.getUrl(), requestObjDataIntercept);
        }
        String requestType = requestObjDataIntercept.getRequestType();
        Locale locale = Locale.ENGLISH;
        if (TextUtils.equals(requestType.toUpperCase(locale), RequestObj.RequestType.POST.name())) {
            a(j, requestObjDataIntercept);
            return;
        }
        if (TextUtils.equals(requestObjDataIntercept.getRequestType().toUpperCase(locale), RequestObj.RequestType.GET.name())) {
            e(j, requestObjDataIntercept);
            return;
        }
        if (TextUtils.equals(requestObjDataIntercept.getRequestType().toUpperCase(locale), RequestObj.RequestType.DELETE.name())) {
            c(j, requestObjDataIntercept);
            return;
        }
        if (TextUtils.equals(requestObjDataIntercept.getRequestType().toUpperCase(locale), RequestObj.RequestType.PUT.name())) {
            b(j, requestObjDataIntercept);
            return;
        }
        LogUtil.w(this.TAG, requestObjDataIntercept.getRequestType() + ": Not implemented");
    }

    @JavascriptInterface
    public void startSseRequest(final long j, String str) {
        LogUtil.i(this.TAG, "startSseRequest");
        SseRequestInterceptor sseRequestInterceptor = e;
        if (sseRequestInterceptor != null) {
            sseRequestInterceptor.startSseRequest(j, str, new SseRequestInterceptor.SSECallback() { // from class: com.huawei.health.h5pro.jsbridge.system.network.NetWorkEntry.3
                @Override // com.huawei.health.h5pro.jsbridge.system.network.SseRequestInterceptor.SSECallback
                public void complete(String str2, int i) {
                    NetWorkEntry.this.onCompleteCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.network.SseRequestInterceptor.SSECallback
                public void fail(String str2, int i) {
                    NetWorkEntry.this.onFailureCallback(j, str2);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.network.SseRequestInterceptor.SSECallback
                public void success(String str2) {
                    NetWorkEntry.this.onSuccessCallback(j, str2);
                }
            });
            return;
        }
        LogUtil.e(this.TAG, "startSseRequest mSseRequestInterceptor == null");
        onFailureCallback(j, "something fail", -1);
        onCompleteCallback(j, "finished", 0);
    }
}
