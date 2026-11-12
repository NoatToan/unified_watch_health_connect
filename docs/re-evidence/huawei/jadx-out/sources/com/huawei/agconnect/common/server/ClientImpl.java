package com.huawei.agconnect.common.server;

import android.content.Context;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.https.OKHttpBuilder;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public class ClientImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4907b = "ClientImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f4908c = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OKHttpBuilder f4909a;

    public OkHttpClient a(long j, TimeUnit timeUnit) {
        return this.f4909a.buildWithTimeOut(j, timeUnit);
    }

    public OkHttpClient a() {
        return this.f4909a.build();
    }

    public ClientImpl a(Authenticator authenticator) {
        if (authenticator != null) {
            this.f4909a.authenticator(authenticator);
        }
        return this;
    }

    private OKHttpBuilder a(Context context) {
        OKHttpBuilder oKHttpBuilder;
        try {
            try {
                try {
                    try {
                        this.f4909a = new OKHttpBuilder().sslSocketFactory(SecureSSLSocketFactoryNew.getInstance(context), new SecureX509TrustManager(context));
                    } catch (IllegalAccessException e) {
                        Logger.e(f4907b, "IllegalAccessException", e);
                        oKHttpBuilder = new OKHttpBuilder();
                        this.f4909a = oKHttpBuilder;
                    } catch (KeyManagementException e2) {
                        Logger.e(f4907b, "KeyManagementException", e2);
                        oKHttpBuilder = new OKHttpBuilder();
                        this.f4909a = oKHttpBuilder;
                    }
                } catch (KeyStoreException e3) {
                    Logger.e(f4907b, "KeyStoreException", e3);
                    oKHttpBuilder = new OKHttpBuilder();
                    this.f4909a = oKHttpBuilder;
                } catch (Throwable th) {
                    Logger.e(f4907b, "Throwable", th);
                    oKHttpBuilder = new OKHttpBuilder();
                    this.f4909a = oKHttpBuilder;
                }
            } catch (IOException e4) {
                Logger.e(f4907b, "IOException", e4);
                oKHttpBuilder = new OKHttpBuilder();
                this.f4909a = oKHttpBuilder;
            } catch (NoSuchAlgorithmException e5) {
                Logger.e(f4907b, "NoSuchAlgorithmException", e5);
                oKHttpBuilder = new OKHttpBuilder();
                this.f4909a = oKHttpBuilder;
            } catch (CertificateException e6) {
                Logger.e(f4907b, "CertificateException", e6);
                oKHttpBuilder = new OKHttpBuilder();
                this.f4909a = oKHttpBuilder;
            }
            return this.f4909a;
        } catch (Throwable th2) {
            this.f4909a = new OKHttpBuilder();
            throw th2;
        }
    }

    public ClientImpl(Context context, List<Interceptor> list, boolean z) {
        this.f4909a = a(context);
        if (list != null && list.size() > 0) {
            Iterator<Interceptor> it = list.iterator();
            while (it.hasNext()) {
                this.f4909a.addInterceptor(it.next());
            }
        }
        if (z) {
            this.f4909a.connectTimeout(5000L).readTimeout(5000L).writeTimeout(5000L);
        }
    }
}
