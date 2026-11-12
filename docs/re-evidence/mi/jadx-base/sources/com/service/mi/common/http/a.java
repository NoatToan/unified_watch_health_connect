package com.service.mi.common.http;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.btc;
import defpackage.fip;
import defpackage.fpe;
import defpackage.gtk;
import defpackage.htk;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public class a implements btc, HttpLoggingInterceptor.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OkHttpClient f10601b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10600a = getClass().getSimpleName();
    public final MediaType c = MediaType.parse("application/json;charset=UTF-8");
    public final Gson d = new GsonBuilder().disableHtmlEscaping().create();

    public static class b implements X509TrustManager {
        public b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            fpe.e("TrustAllCerts", " checkClientTrusted");
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            fpe.d("checkClientTrusted chain:" + x509CertificateArr + ", authType:" + str);
            if (x509CertificateArr == null) {
                throw new CertificateException("checkServerTrusted: chain array is null");
            }
            if (x509CertificateArr.length <= 0) {
                throw new CertificateException("checkServerTrusted: chain is empty");
            }
            try {
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    x509Certificate.checkValidity();
                }
            } catch (CertificateExpiredException e) {
                fpe.f("checkServerTrusted is CertificateExpiredException " + e.getLocalizedMessage());
                throw new CertificateException(e);
            } catch (CertificateNotYetValidException e2) {
                fpe.f("checkServerTrusted is CertificateNotYetValidException " + e2.getLocalizedMessage());
                throw new CertificateException(e2);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static class c implements HostnameVerifier {
        public c() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            fpe.d("verify hostname:" + str);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public a() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(this);
        httpLoggingInterceptor.c(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().sslSocketFactory(b(), new b()).hostnameVerifier(new c()).addInterceptor(httpLoggingInterceptor).addInterceptor(new gtk()).addInterceptor(new fip()).addInterceptor(new htk());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10601b = builderAddInterceptor.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).build();
    }

    @Override // defpackage.btc
    public <T> String a(String str, T t, Map<String, String> map) {
        RequestBody requestBodyCreate = RequestBody.create(this.c, this.d.toJson(t));
        try {
            Headers.Builder builder = new Headers.Builder();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.add(entry.getKey(), entry.getValue());
                }
            }
            Response responseExecute = this.f10601b.newCall(new Request.Builder().url(str).headers(builder.build()).post(requestBodyCreate).build()).execute();
            if (responseExecute == null) {
                return null;
            }
            if (!responseExecute.isSuccessful() && responseExecute.code() != 401) {
                return null;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            Objects.requireNonNull(responseBodyBody);
            return responseBodyBody.string();
        } catch (Exception e) {
            fpe.g(this.f10600a, "postSync Exception:" + e.getMessage());
            return null;
        }
    }

    public final SSLSocketFactory b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new b()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            fpe.g(this.f10600a, "createSSLSocketFactory Exception:" + e.getMessage());
            return null;
        }
    }

    @Override // defpackage.btc
    public String get(String str) {
        try {
            Response responseExecute = this.f10601b.newCall(new Request.Builder().url(str).get().build()).execute();
            if (responseExecute == null || !responseExecute.isSuccessful()) {
                return null;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            Objects.requireNonNull(responseBodyBody);
            return responseBodyBody.string();
        } catch (Exception e) {
            fpe.g(this.f10600a, "Get Exception:" + e.getMessage());
            return null;
        }
    }

    @Override // com.service.mi.common.http.HttpLoggingInterceptor.a
    public void log(String str) {
        fpe.e(this.f10600a, "log:" + str);
    }
}
