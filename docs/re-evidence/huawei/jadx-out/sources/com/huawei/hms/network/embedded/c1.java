package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.config.NetworkConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class c1 extends Request {
    public static final String g = "RequestImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3 f14665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Headers f14666c;
    public h1.e d;
    public NetworkConfig e;
    public Object f;

    public static final class b extends Request.Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d3 f14668b;
        public h1.e d;
        public Object f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14667a = "GET";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Headers.Builder f14669c = new Headers.Builder();
        public NetworkConfig e = new NetworkConfig(null);

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b url(String str) {
            this.f14668b = new d3(str);
            return this;
        }

        public b url(d3 d3Var) {
            this.f14668b = d3Var;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b tag(Object obj) {
            this.f = obj;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b requestBody(RequestBody requestBody) {
            if (requestBody == null || (requestBody instanceof h1.e)) {
                this.d = (h1.e) requestBody;
                return this;
            }
            this.d = new h1.e(requestBody);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b removeHeader(String str) {
            this.f14669c.removeAll(str);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b options(String str) {
            if (TextUtils.isEmpty(str)) {
                Logger.w(c1.g, "Request Builder options == null");
                return this;
            }
            this.e.setOption(str);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b method(String str) {
            this.f14667a = str;
            return this;
        }

        public b headers(Headers.Builder builder) {
            this.f14669c = builder;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public Request build() {
            return new h1.d(new c1(this));
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b addHeader(String str, String str2) {
            this.f14669c.add(str, str2);
            return this;
        }
    }

    public String toString() {
        return super.toString();
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public b newBuilder() {
        b bVar = new b();
        bVar.f14667a = this.f14664a;
        bVar.f14668b = this.f14665b;
        bVar.f14669c = this.f14666c.newBuilder();
        bVar.d = this.d;
        bVar.e = new NetworkConfig(this.e.configObj.toString());
        bVar.f = this.f;
        return bVar;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public String getUrl() {
        return this.f14665b.getUrl();
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public Object getTag() {
        return this.f;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public String getOptions() {
        return this.e.toString();
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public String getMethod() {
        return this.f14664a;
    }

    public d3 getHttpUrl() {
        return this.f14665b;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public Map<String, List<String>> getHeaders() {
        return this.f14666c.toMultimap();
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public RequestBody getBody() {
        return this.d;
    }

    public c1(b bVar) {
        this.f14664a = bVar.f14667a;
        this.f14665b = bVar.f14668b;
        this.f14666c = bVar.f14669c.build();
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
    }
}
