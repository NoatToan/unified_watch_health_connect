package com.xiaomi.infra.galaxy.fds.android.auth;

import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes22.dex */
public interface GalaxyFDSCredential {
    void addHeader(HttpRequestBase httpRequestBase) throws GalaxyFDSClientException;

    String addParam(String str);
}
