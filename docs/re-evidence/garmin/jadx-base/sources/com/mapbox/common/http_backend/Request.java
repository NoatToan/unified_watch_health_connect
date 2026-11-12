package com.mapbox.common.http_backend;

import com.google.protobuf.a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.ReadStream;
import j20.x;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Request implements Serializable {
    private final ReadStream body;
    private final int flags;
    private HashMap<String, String> headers;
    private HttpMethod method;
    private final NetworkRestriction networkRestriction;
    private final long timeout;
    private final String url;

    public static final class Builder {
        private ReadStream body;
        private HashMap<String, String> headers;
        private String url;
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(ReadStream readStream) {
            this.body = readStream;
            return this;
        }

        public Request build() {
            if (this.method == null) {
                x.l("method shouldn't be null");
                return null;
            }
            if (this.url == null) {
                x.l("url shouldn't be null");
                return null;
            }
            if (this.headers == null) {
                x.l("headers shouldn't be null");
                return null;
            }
            if (this.networkRestriction != null) {
                return new Request(this.method, this.url, this.headers, this.timeout, this.networkRestriction, this.body, this.flags);
            }
            x.l("networkRestriction shouldn't be null");
            return null;
        }

        public Builder flags(int i14) {
            this.flags = i14;
            return this;
        }

        public Builder headers(HashMap<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder method(HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder timeout(long j8) {
            this.timeout = j8;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private Request(String str, HashMap<String, String> map, ReadStream readStream) {
        this.url = str;
        this.headers = map;
        this.body = readStream;
        this.method = HttpMethod.GET;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Request request = (Request) obj;
        return Objects.equals(this.method, request.method) && Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && Objects.equals(this.body, request.body) && this.flags == request.flags;
    }

    public ReadStream getBody() {
        return this.body;
    }

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.method, this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, this.body, Integer.valueOf(this.flags));
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).body(this.body).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[method: ");
        sb3.append(RecordUtils.fieldToString(this.method));
        sb3.append(", url: ");
        a.k(this.url, ", headers: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.headers));
        sb3.append(", timeout: ");
        a.h(this.timeout, ", networkRestriction: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.networkRestriction));
        sb3.append(", body: ");
        sb3.append(RecordUtils.fieldToString(this.body));
        sb3.append(", flags: ");
        sb3.append(RecordUtils.fieldToString(Integer.valueOf(this.flags)));
        sb3.append("]");
        return sb3.toString();
    }

    private Request(HttpMethod httpMethod, String str, HashMap<String, String> map, long j8, NetworkRestriction networkRestriction, ReadStream readStream, int i14) {
        this.method = httpMethod;
        this.url = str;
        this.headers = map;
        this.timeout = j8;
        this.networkRestriction = networkRestriction;
        this.body = readStream;
        this.flags = i14;
    }
}
