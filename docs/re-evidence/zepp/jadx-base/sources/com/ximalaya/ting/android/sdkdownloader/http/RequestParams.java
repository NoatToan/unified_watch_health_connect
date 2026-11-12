package com.ximalaya.ting.android.sdkdownloader.http;

import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.model.track.TrackBaseInfo;
import com.ximalaya.ting.android.sdkdownloader.http.app.HttpRetryHandler;
import com.ximalaya.ting.android.sdkdownloader.http.app.RedirectHandler;
import com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker;
import com.ximalaya.ting.android.sdkdownloader.http.loader.FileLoader;
import com.ximalaya.ting.android.sdkdownloader.task.Priority;
import java.net.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes22.dex */
public class RequestParams extends BaseParams {
    private String d;
    private long e;
    private Proxy f;
    private Executor g;
    private Priority h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private String m;
    private boolean n;
    private int o;
    private HttpRetryHandler p;
    private RedirectHandler q;
    private RequestTracker r;
    private int s;

    public class a implements com.ximalaya.ting.android.sdkdownloader.http.a.InterfaceC1055a {
        public a() {
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.http.a.InterfaceC1055a
        public void a(String str, Object obj) {
            RequestParams.this.addParameter(str, obj);
        }
    }

    public RequestParams() {
        this(null, FileLoader.DATA_SAVE_TYPE_FREE);
    }

    private void b() {
        com.ximalaya.ting.android.sdkdownloader.http.a.a(this, getClass(), new a());
    }

    public void a() throws Throwable {
        if (TextUtils.isEmpty(this.d)) {
            if (this.s != FileLoader.DATA_SAVE_TYPE_PAY) {
                HashMap map = new HashMap();
                map.put("track_id", this.e + "");
                TrackBaseInfo trackInfoSync = CommonRequest.getTrackInfoSync(map);
                if (trackInfoSync != null && !TextUtils.isEmpty(trackInfoSync.getDownloadUrl())) {
                    this.d = trackInfoSync.getDownloadUrl();
                }
                throw new IllegalStateException("uri is empty && @HttpRequest == null");
            }
            this.d = CommonRequest.updateTrackInfoSync(this.e);
        }
        b();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ void addHeader(String str, String str2) {
        super.addHeader(str, str2);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ void addParameter(String str, Object obj) {
        super.addParameter(str, obj);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ void addQueryStringParameter(String str, String str2) {
        super.addQueryStringParameter(str, str2);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ String getCharset() {
        return super.getCharset();
    }

    public int getConnectTimeout() {
        return this.i;
    }

    public int getDataSaveType() {
        return this.s;
    }

    public Executor getExecutor() {
        return this.g;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ List getHeaders() {
        return super.getHeaders();
    }

    public HttpRetryHandler getHttpRetryHandler() {
        return this.p;
    }

    public int getLoadingUpdateMaxTimeSpan() {
        return this.o;
    }

    public int getMaxRetryCount() {
        return this.l;
    }

    public Priority getPriority() {
        return this.h;
    }

    public Proxy getProxy() {
        return this.f;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ List getQueryStringParams() {
        return super.getQueryStringParams();
    }

    public int getReadTimeOut() {
        return this.j;
    }

    public RedirectHandler getRedirectHandler() {
        return this.q;
    }

    public RequestTracker getRequestTracker() {
        return this.r;
    }

    public String getSaveFilePath() {
        return this.m;
    }

    public String getUri() {
        return this.d;
    }

    public boolean isAutoResume() {
        return this.k;
    }

    public boolean isCancelFast() {
        return this.n;
    }

    public void setAutoResume(boolean z) {
        this.k = z;
    }

    public void setCancelFast(boolean z) {
        this.n = z;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ void setCharset(String str) {
        super.setCharset(str);
    }

    public void setConnectTimeout(int i) {
        if (i > 0) {
            this.i = i;
        }
    }

    public void setDataSaveType(int i) {
        this.s = i;
    }

    public void setExecutor(Executor executor) {
        this.g = executor;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public /* bridge */ /* synthetic */ void setHeader(String str, String str2) {
        super.setHeader(str, str2);
    }

    public void setHttpRetryHandler(HttpRetryHandler httpRetryHandler) {
        this.p = httpRetryHandler;
    }

    public void setLoadingUpdateMaxTimeSpan(int i) {
        this.o = i;
    }

    public void setMaxRetryCount(int i) {
        this.l = i;
    }

    public void setPriority(Priority priority) {
        this.h = priority;
    }

    public void setProxy(Proxy proxy) {
        this.f = proxy;
    }

    public void setReadTimeOut(int i) {
        this.j = i;
    }

    public void setRedirectHandler(RedirectHandler redirectHandler) {
        this.q = redirectHandler;
    }

    public void setRequestTracker(RequestTracker requestTracker) {
        this.r = requestTracker;
    }

    public void setSaveFilePath(String str) {
        this.m = str;
    }

    public void setTrackId(long j) {
        this.e = j;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.BaseParams
    public String toString() {
        try {
            a();
        } catch (Throwable unused) {
        }
        String uri = getUri();
        if (TextUtils.isEmpty(uri)) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append(uri.contains("?") ? com.alipay.sdk.m.s.a.l : "?");
        sb.append(super.toString());
        return sb.toString();
    }

    public void uriInvalid() {
        this.d = null;
    }

    public RequestParams(String str, int i) {
        this.h = Priority.DEFAULT;
        this.i = 30000;
        this.j = 30000;
        this.k = true;
        this.l = 2;
        this.n = false;
        this.o = 800;
        this.s = FileLoader.DATA_SAVE_TYPE_FREE;
        this.d = str;
        this.s = i;
    }
}
