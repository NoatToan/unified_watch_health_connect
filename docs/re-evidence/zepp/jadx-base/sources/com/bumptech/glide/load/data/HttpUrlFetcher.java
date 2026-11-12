package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {
    private static final String g = "HttpUrlFetcher";
    private static final int h = 5;

    @VisibleForTesting
    public static final b i = new a();
    private static final int j = -1;
    private final GlideUrl a;
    private final int b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    public static class a implements b {
        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i2) {
        this(glideUrl, i2, i);
    }

    private InputStream a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.e = ContentLengthInputStream.obtain(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable(g, 3)) {
                Log.d(g, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.e = httpURLConnection.getInputStream();
        }
        return this.e;
    }

    private static boolean b(int i2) {
        return i2 / 100 == 2;
    }

    private static boolean c(int i2) {
        return i2 / 100 == 3;
    }

    private InputStream d(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.d = this.c.a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.d.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.d.setConnectTimeout(this.b);
        this.d.setReadTimeout(this.b);
        this.d.setUseCaches(false);
        this.d.setDoInput(true);
        this.d.setInstanceFollowRedirects(false);
        this.d.connect();
        this.e = this.d.getInputStream();
        if (this.f) {
            return null;
        }
        int responseCode = this.d.getResponseCode();
        if (b(responseCode)) {
            return a(this.d);
        }
        if (!c(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.d.getResponseMessage(), responseCode);
        }
        String headerField = this.d.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        cleanup();
        return d(url3, i2 + 1, url, map);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.f = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
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

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        StringBuilder sb;
        long logTime = LogTime.getLogTime();
        try {
            dataCallback.onDataReady(d(this.a.toURL(), 0, null, this.a.getHeaders()));
            if (Log.isLoggable(g, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(LogTime.getElapsedMillis(logTime));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable(g, 3)) {
                Log.d(g, "Failed to load data for url", e);
            }
            dataCallback.onLoadFailed(e);
            if (!Log.isLoggable(g, 2)) {
            } else {
                sb = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable(g, 2)) {
                Log.v(g, "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(logTime));
            }
        }
    }

    @VisibleForTesting
    public HttpUrlFetcher(GlideUrl glideUrl, int i2, b bVar) {
        this.a = glideUrl;
        this.b = i2;
        this.c = bVar;
    }
}
