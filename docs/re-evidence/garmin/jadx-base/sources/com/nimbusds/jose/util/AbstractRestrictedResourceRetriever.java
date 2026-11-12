package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.util.List;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public abstract class AbstractRestrictedResourceRetriever implements RestrictedResourceRetriever {
    private int connectTimeout;
    private Map<String, List<String>> headers;
    private int readTimeout;
    private int sizeLimit;

    public AbstractRestrictedResourceRetriever(int i14, int i15, int i16) {
        setConnectTimeout(i14);
        setReadTimeout(i15);
        setSizeLimit(i16);
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getReadTimeout() {
        return this.readTimeout;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getSizeLimit() {
        return this.sizeLimit;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setConnectTimeout(int i14) {
        if (i14 >= 0) {
            this.connectTimeout = i14;
        } else {
            h.s("The connect timeout must not be negative");
        }
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setReadTimeout(int i14) {
        if (i14 >= 0) {
            this.readTimeout = i14;
        } else {
            h.s("The read timeout must not be negative");
        }
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setSizeLimit(int i14) {
        if (i14 >= 0) {
            this.sizeLimit = i14;
        } else {
            h.s("The size limit must not be negative");
        }
    }
}
