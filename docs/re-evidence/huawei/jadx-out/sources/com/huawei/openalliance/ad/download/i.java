package com.huawei.openalliance.ad.download;

import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.net.http.HttpsConfig;
import com.huawei.openalliance.ad.utils.df;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes12.dex */
public class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpURLConnection f18628a;

    @Override // com.huawei.openalliance.ad.download.c
    public HttpConnection d() {
        return new HttpConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        df.a(this.f18628a);
    }

    @Override // com.huawei.openalliance.ad.download.c
    public int c() {
        return this.f18628a.getContentLength();
    }

    @Override // com.huawei.openalliance.ad.download.c
    public int b() {
        return this.f18628a.getResponseCode();
    }

    @Override // com.huawei.openalliance.ad.download.c
    public String a(String str) {
        return this.f18628a.getHeaderField(str);
    }

    @Override // com.huawei.openalliance.ad.download.c
    public InputStream a() {
        return this.f18628a.getInputStream();
    }

    public i(String str, long j) throws com.huawei.openalliance.ad.exception.d {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f18628a = httpURLConnection;
        HttpsConfig.a(httpURLConnection, true, false);
        this.f18628a.setConnectTimeout(10000);
        this.f18628a.setReadTimeout(10000);
        this.f18628a.setUseCaches(false);
        if (j > 0) {
            this.f18628a.setRequestProperty("Range", "bytes=" + j + Constants.LINK);
        }
        this.f18628a.setRequestProperty(j2.v, "identity");
        this.f18628a.connect();
    }
}
