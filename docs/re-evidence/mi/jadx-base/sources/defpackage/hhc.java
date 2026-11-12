package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class hhc implements jl5<InputStream> {

    @VisibleForTesting
    public static final b g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0b f20066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20067b;
    public final b c;
    public HttpURLConnection d;
    public InputStream e;
    public volatile boolean f;

    public static class a implements b {
        @Override // hhc.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public hhc(e0b e0bVar, int i) {
        this(e0bVar, i, g);
    }

    public static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    public static boolean h(int i) {
        return i / 100 == 2;
    }

    public static boolean i(int i) {
        return i / 100 == 3;
    }

    @Override // defpackage.jl5
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.jl5
    public void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jl5
    public void c(Priority priority, jl5.a<? super InputStream> aVar) {
        StringBuilder sb;
        String str = "HttpUrlFetcher";
        long jB = epe.b();
        try {
            try {
                aVar.e(j(this.f20066a.i(), 0, null, this.f20066a.e()));
                str = str;
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                    sb.append("Finished http url fetcher fetch in ");
                    double dA = epe.a(jB);
                    sb.append(dA);
                    str = dA;
                }
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.f(e);
                str = str;
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(epe.a(jB));
            }
            throw th;
        }
    }

    @Override // defpackage.jl5
    public void cancel() {
        this.f = true;
    }

    @Override // defpackage.jl5
    public DataSource d() {
        return DataSource.REMOTE;
    }

    public final HttpURLConnection e(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f20067b);
            httpURLConnectionA.setReadTimeout(this.f20067b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    public final InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.e = ai4.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.e = httpURLConnection.getInputStream();
            }
            return this.e;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e);
        }
    }

    public final InputStream j(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionE = e(url, map);
        this.d = httpURLConnectionE;
        try {
            httpURLConnectionE.connect();
            this.e = this.d.getInputStream();
            if (this.f) {
                return null;
            }
            int iF = f(this.d);
            if (h(iF)) {
                return g(this.d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.d.getResponseMessage(), iF);
                } catch (IOException e) {
                    throw new HttpException("Failed to get a response message", iF, e);
                }
            }
            String headerField = this.d.getHeaderField(SimpleRequest.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new HttpException("Bad redirect url: " + headerField, iF, e2);
            }
        } catch (IOException e3) {
            throw new HttpException("Failed to connect or obtain data", f(this.d), e3);
        }
    }

    @VisibleForTesting
    public hhc(e0b e0bVar, int i, b bVar) {
        this.f20066a = e0bVar;
        this.f20067b = i;
        this.c = bVar;
    }
}
