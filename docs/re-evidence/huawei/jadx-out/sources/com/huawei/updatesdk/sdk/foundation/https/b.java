package com.huawei.updatesdk.sdk.foundation.https;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import com.huawei.updatesdk.sdk.foundation.utils.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpURLConnection f29891a = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29894c;

        public String c() {
            return this.f29894c;
        }

        public String b() {
            return this.f29892a;
        }

        public int a() {
            return this.f29893b;
        }
    }

    public void a() {
        HttpURLConnection httpURLConnection = this.f29891a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public a a(String str, String str2, String str3, String str4, Context context) throws Throwable {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        a aVar = new a();
        DataOutputStream dataOutputStream = null;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            HttpURLConnection httpURLConnectionA = a(str, context);
            this.f29891a = httpURLConnectionA;
            httpURLConnectionA.setDoInput(true);
            this.f29891a.setDoOutput(true);
            this.f29891a.setUseCaches(false);
            this.f29891a.setConnectTimeout(5000);
            this.f29891a.setReadTimeout(10000);
            this.f29891a.setRequestMethod("POST");
            this.f29891a.setRequestProperty("Content-Type", "application/x-gzip");
            this.f29891a.setRequestProperty("Content-Encoding", Constants.GZIP);
            this.f29891a.setRequestProperty("Connection", "Keep-Alive");
            this.f29891a.setRequestProperty("User-Agent", str4);
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.f29891a.getOutputStream());
            try {
                dataOutputStream2.write(a(str2.getBytes(str3)));
                dataOutputStream2.flush();
                a(aVar, this.f29891a);
                int responseCode = this.f29891a.getResponseCode();
                aVar.f29893b = responseCode;
                bufferedInputStream2 = responseCode == 200 ? new BufferedInputStream(this.f29891a.getInputStream()) : new BufferedInputStream(this.f29891a.getErrorStream());
                com.huawei.updatesdk.sdk.foundation.utils.b bVar = new com.huawei.updatesdk.sdk.foundation.utils.b();
                byte[] bArrB = com.huawei.updatesdk.sdk.foundation.https.a.a().b();
                while (true) {
                    int i = bufferedInputStream2.read(bArrB);
                    if (i == -1) {
                        break;
                    }
                    bVar.a(bArrB, i);
                }
                com.huawei.updatesdk.sdk.foundation.https.a.a().b(bArrB);
                aVar.f29892a = bVar.a();
                HttpURLConnection httpURLConnection = this.f29891a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                d.a(dataOutputStream2);
                d.a(bufferedInputStream2);
                return aVar;
            } catch (Throwable th2) {
                th = th2;
                BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
                dataOutputStream = dataOutputStream2;
                bufferedInputStream = bufferedInputStream3;
                HttpURLConnection httpURLConnection2 = this.f29891a;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                d.a(dataOutputStream);
                d.a(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    private byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        DataOutputStream dataOutputStream3 = null;
        DataOutputStream dataOutputStream4 = null;
        dataOutputStream3 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream2 = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream, bArr.length));
                try {
                    dataOutputStream2.write(bArr, 0, bArr.length);
                    dataOutputStream2.flush();
                } catch (IOException e) {
                    e = e;
                    dataOutputStream4 = dataOutputStream2;
                    dataOutputStream = dataOutputStream4;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    try {
                        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("HttpsUtil", "gzip error!", e);
                        dataOutputStream2 = dataOutputStream;
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        DataOutputStream dataOutputStream5 = dataOutputStream;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        dataOutputStream3 = dataOutputStream5;
                        d.a(dataOutputStream3);
                        d.a(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream3 = dataOutputStream2;
                    d.a(dataOutputStream3);
                    d.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
            dataOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        d.a(dataOutputStream2);
        d.a(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private void a(a aVar, HttpURLConnection httpURLConnection) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.d("HttpsUtil", "headers is null.");
            return;
        }
        List<String> list = headerFields.get("x-traceId");
        if (list == null || list.isEmpty()) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.d("HttpsUtil", "no x-traceId.");
        } else {
            aVar.f29894c = list.get(0);
        }
    }

    public static HttpURLConnection a(String str, Context context) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactoryNew.getInstance(context, EncryptUtil.genSecureRandom()));
        httpsURLConnection.setHostnameVerifier(new StrictHostnameVerifier());
        return httpsURLConnection;
    }
}
