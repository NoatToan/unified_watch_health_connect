package com.xiaomi.smarthome.library.http;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.apache.http.NameValuePair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class Request2 {
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    private Map<String, String> mHeaders;
    private String mMethod;
    private List<NameValuePair> mQueryParams;
    private String mUrl;

    public static class Builder {
        private String method;
        private String url;
        private Map<String, String> headers = new HashMap();
        private List<NameValuePair> queryParams = new ArrayList(8);

        public Builder addHeaders(Map<String, String> map) {
            if (map == null) {
                throw new IllegalArgumentException("headers == null");
            }
            this.headers = map;
            return this;
        }

        public Builder addQueries(List<NameValuePair> list) {
            if (list == null) {
                throw new IllegalArgumentException("queries == null");
            }
            this.queryParams = list;
            return this;
        }

        public Request2 build() {
            return new Request2(this);
        }

        public Builder method(String str) {
            if (str == null) {
                throw new IllegalArgumentException("method == null");
            }
            this.method = str;
            return this;
        }

        public Builder url(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.url = str;
            return this;
        }
    }

    public Request2(Builder builder) {
        this.mMethod = builder.method;
        this.mUrl = builder.url;
        this.mHeaders = builder.headers;
        this.mQueryParams = builder.queryParams;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public String getMethod() {
        if (TextUtils.isEmpty(this.mMethod)) {
            throw new IllegalArgumentException("method == null");
        }
        return this.mMethod;
    }

    public List<NameValuePair> getQueryParams() {
        return this.mQueryParams;
    }

    public String getUrl() {
        return this.mUrl;
    }
}
