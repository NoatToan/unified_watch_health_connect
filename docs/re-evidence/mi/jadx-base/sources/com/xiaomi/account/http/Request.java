package com.xiaomi.account.http;

import android.text.TextUtils;
import defpackage.gv5;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Request {
    public final boolean followRedirects;
    public final Map<String, String> formBody;
    public final Map<String, String> headers;
    public final URI uri;
    public final String url;

    public static class Builder {
        boolean followRedirects = true;
        Map<String, String> formBody;
        Map<String, String> headers;
        URI uri;

        public Builder appendQuery(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            URI uri = this.uri;
            String query = uri.getQuery();
            if (query == null) {
                str2 = str;
            } else {
                str2 = query + gv5.CONNECT_STR + str;
            }
            try {
                this.uri = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment());
                return this;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("unexpected newQuery: " + str);
            }
        }

        public Request build() {
            return new Request(this);
        }

        public Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public Builder formBody(Map<String, String> map) {
            this.formBody = map;
            return this;
        }

        public Builder headers(Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder url(String str) {
            try {
                this.uri = new URI(str);
                return this;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("unexpected url: " + str);
            }
        }
    }

    private Request(Builder builder) {
        URI uri = builder.uri;
        this.uri = uri;
        this.url = uri.toString();
        this.headers = builder.headers;
        this.formBody = builder.formBody;
        this.followRedirects = builder.followRedirects;
    }
}
