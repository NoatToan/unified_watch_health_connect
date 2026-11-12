package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes18.dex */
public class UrlConnectionDownloader implements Downloader {
    public static final String b = "X-Android-Response-Source";
    public static volatile Object c = null;
    private static final String e = "only-if-cached,max-age=2147483647";
    private final Context a;
    private static final Object d = new Object();
    private static final ThreadLocal<StringBuilder> f = new a();

    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public static class b {
        private b() {
        }

        public static void a(Object obj) {
            try {
                ((HttpResponseCache) obj).close();
            } catch (IOException unused) {
            }
        }

        public static Object b(Context context) throws IOException {
            File fileG = u.g(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(fileG, u.a(fileG)) : installed;
        }
    }

    public UrlConnectionDownloader(Context context) {
        this.a = context.getApplicationContext();
    }

    private static void a(Context context) {
        if (c == null) {
            try {
                synchronized (d) {
                    try {
                        if (c == null) {
                            c = b.b(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.squareup.picasso.Downloader
    public Downloader.Response load(Uri uri, int i) throws IOException {
        String string;
        if (Build.VERSION.SDK_INT >= 14) {
            a(this.a);
        }
        HttpURLConnection httpURLConnectionOpenConnection = openConnection(uri);
        httpURLConnectionOpenConnection.setUseCaches(true);
        if (i != 0) {
            if (NetworkPolicy.isOfflineOnly(i)) {
                string = e;
            } else {
                StringBuilder sb = f.get();
                sb.setLength(0);
                if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                    sb.append(HTTP.NO_CACHE);
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                string = sb.toString();
            }
            httpURLConnectionOpenConnection.setRequestProperty("Cache-Control", string);
        }
        int responseCode = httpURLConnectionOpenConnection.getResponseCode();
        if (responseCode < 300) {
            return new Downloader.Response(httpURLConnectionOpenConnection.getInputStream(), u.x(httpURLConnectionOpenConnection.getHeaderField(b)), httpURLConnectionOpenConnection.getHeaderFieldInt("Content-Length", -1));
        }
        httpURLConnectionOpenConnection.disconnect();
        throw new Downloader.ResponseException(responseCode + " " + httpURLConnectionOpenConnection.getResponseMessage(), i, responseCode);
    }

    public HttpURLConnection openConnection(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        if (Build.VERSION.SDK_INT < 14 || c == null) {
            return;
        }
        b.a(c);
    }
}
