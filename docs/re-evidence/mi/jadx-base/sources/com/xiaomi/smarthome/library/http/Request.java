package com.xiaomi.smarthome.library.http;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public class Request {
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_PUT = "PUT";
    private RequestBody mBody;
    private Map<String, String> mHeaders;
    private String mMethod;
    private List<KeyValuePair> mQueryParams;
    private String mUrl;

    public Request(Builder builder) {
        this.mMethod = builder.method;
        this.mUrl = builder.url;
        this.mHeaders = builder.headers;
        this.mQueryParams = builder.queryParams;
        this.mBody = builder.body;
    }

    public RequestBody getBody() {
        return this.mBody;
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

    public List<KeyValuePair> getQueryParams() {
        return this.mQueryParams;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public static class Builder {
        private RequestBody body;
        private String method;
        private String url;
        private Map<String, String> headers = new HashMap();
        private List<KeyValuePair> queryParams = new ArrayList(8);

        public Builder addHeaders(Map<String, String> map) {
            if (map == null) {
                throw new IllegalArgumentException("headers == null");
            }
            this.headers = map;
            return this;
        }

        public Builder addQueries(List<KeyValuePair> list) {
            if (list == null) {
                throw new IllegalArgumentException("queries == null");
            }
            this.queryParams = list;
            return this;
        }

        public Builder body(RequestBody requestBody) {
            if (requestBody == null) {
                throw new IllegalArgumentException("body == null");
            }
            this.body = requestBody;
            return this;
        }

        public Request build() {
            return new Request(this);
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

        public Builder addQueries(Map<String, String> map) {
            if (map != null) {
                this.queryParams = new ArrayList();
                for (String str : map.keySet()) {
                    this.queryParams.add(new KeyValuePair(str, map.get(str)));
                }
                return this;
            }
            throw new IllegalArgumentException("queries == null");
        }
    }
}
