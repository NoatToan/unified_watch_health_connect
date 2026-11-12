package com.nimbusds.jose.util;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface RestrictedResourceRetriever extends ResourceRetriever {
    int getConnectTimeout();

    Map<String, List<String>> getHeaders();

    int getReadTimeout();

    int getSizeLimit();

    void setConnectTimeout(int i14);

    void setHeaders(Map<String, List<String>> map);

    void setReadTimeout(int i14);

    void setSizeLimit(int i14);
}
