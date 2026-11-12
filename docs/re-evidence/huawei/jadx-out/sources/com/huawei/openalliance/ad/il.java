package com.huawei.openalliance.ad;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes12.dex */
public class il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SSLSocketFactory f18968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static X509TrustManager f18969b;

    public static X509TrustManager b() {
        return f18969b;
    }

    public static SSLSocketFactory a() {
        return f18968a;
    }
}
