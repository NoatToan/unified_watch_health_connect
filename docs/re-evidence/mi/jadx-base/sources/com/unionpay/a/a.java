package com.unionpay.a;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f10737a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10738b;

    public a(String str) {
        this.f10738b = str;
    }

    public final SSLContext a() {
        if (this.f10737a == null) {
            this.f10737a = a(this.f10738b);
        }
        return this.f10737a;
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(a.class);
    }

    public int hashCode() {
        return a.class.hashCode();
    }

    private static SSLContext a(String str) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new b(str)}, null);
            return sSLContext;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }
}
