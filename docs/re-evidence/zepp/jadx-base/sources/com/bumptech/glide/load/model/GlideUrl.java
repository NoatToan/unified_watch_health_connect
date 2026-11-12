package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GlideUrl implements Key {
    private static final String h = "@#&=*+-_.,:!?()/~'%;$";
    private final Headers a;

    @Nullable
    private final URL b;

    @Nullable
    private final String c;

    @Nullable
    private String d;

    @Nullable
    private URL e;

    @Nullable
    private volatile byte[] f;
    private int g;

    public GlideUrl(URL url) {
        this(url, Headers.DEFAULT);
    }

    private byte[] a() {
        if (this.f == null) {
            this.f = getCacheKey().getBytes(Key.CHARSET);
        }
        return this.f;
    }

    private String b() {
        if (TextUtils.isEmpty(this.d)) {
            String string = this.c;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) Preconditions.checkNotNull(this.b)).toString();
            }
            this.d = Uri.encode(string, h);
        }
        return this.d;
    }

    private URL c() throws MalformedURLException {
        if (this.e == null) {
            this.e = new URL(b());
        }
        return this.e;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        return getCacheKey().equals(glideUrl.getCacheKey()) && this.a.equals(glideUrl.a);
    }

    public String getCacheKey() {
        String str = this.c;
        return str != null ? str : ((URL) Preconditions.checkNotNull(this.b)).toString();
    }

    public Map<String, String> getHeaders() {
        return this.a.getHeaders();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.g == 0) {
            int iHashCode = getCacheKey().hashCode();
            this.g = iHashCode;
            this.g = (iHashCode * 31) + this.a.hashCode();
        }
        return this.g;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return b();
    }

    public URL toURL() throws MalformedURLException {
        return c();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(a());
    }

    public GlideUrl(String str) {
        this(str, Headers.DEFAULT);
    }

    public GlideUrl(URL url, Headers headers) {
        this.b = (URL) Preconditions.checkNotNull(url);
        this.c = null;
        this.a = (Headers) Preconditions.checkNotNull(headers);
    }

    public GlideUrl(String str, Headers headers) {
        this.b = null;
        this.c = Preconditions.checkNotEmpty(str);
        this.a = (Headers) Preconditions.checkNotNull(headers);
    }
}
