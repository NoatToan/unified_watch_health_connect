package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f28549g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj.h f28550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f28552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f28553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f28554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f28555f;

    public static class a implements b {
    }

    public interface b {
    }

    public j(aj.h hVar, int i14, b bVar) {
        this.f28550a = hVar;
        this.f28551b = i14;
        this.f28552c = bVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final ui.a b() {
        return ui.a.REMOTE;
    }

    public final InputStream c(URL url, int i14, URL url2, Map<String, String> map) throws HttpException {
        int responseCode;
        int responseCode2 = -1;
        if (i14 >= 5) {
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
        int i15 = this.f28551b;
        try {
            ((a) this.f28552c).getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i15);
            httpURLConnection.setReadTimeout(i15);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f28553d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f28554e = this.f28553d.getInputStream();
                if (this.f28555f) {
                    return null;
                }
                try {
                    responseCode = this.f28553d.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i16 = responseCode / 100;
                if (i16 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f28553d;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f28554e = qj.c.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f28554e = httpURLConnection2.getInputStream();
                        }
                        return this.f28554e;
                    } catch (IOException e4) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new HttpException("Failed to obtain InputStream", responseCode2, e4);
                    }
                }
                if (i16 != 3) {
                    if (responseCode == -1) {
                        throw new HttpException(responseCode);
                    }
                    try {
                        throw new HttpException(this.f28553d.getResponseMessage(), responseCode);
                    } catch (IOException e14) {
                        throw new HttpException("Failed to get a response message", responseCode, e14);
                    }
                }
                String headerField = this.f28553d.getHeaderField(HttpHeaders.LOCATION);
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", responseCode);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return c(url3, i14 + 1, url, map);
                } catch (MalformedURLException e15) {
                    throw new HttpException(fb1.c.n("Bad redirect url: ", headerField), responseCode, e15);
                }
            } catch (IOException e16) {
                try {
                    responseCode2 = this.f28553d.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new HttpException("Failed to connect or obtain data", responseCode2, e16);
            }
        } catch (IOException e17) {
            throw new HttpException("URL.openConnection threw", 0, e17);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f28555f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        InputStream inputStream = this.f28554e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f28553d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f28553d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        aj.h hVar = this.f28550a;
        int i14 = qj.h.f144972a;
        SystemClock.elapsedRealtimeNanos();
        try {
            if (hVar.f3353f == null) {
                hVar.f3353f = new URL(hVar.d());
            }
            aVar.c(c(hVar.f3353f, 0, null, hVar.f3349b.getHeaders()));
        } catch (IOException e4) {
            aVar.e(e4);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    public j(aj.h hVar, int i14) {
        this(hVar, i14, f28549g);
    }
}
