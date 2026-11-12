package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import defpackage.rk1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f8404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8405b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;

    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f8406k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b$b, reason: collision with other inner class name */
    public static final class C0206b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f8407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8408b;
        public int c;
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;
        public String h;
        public int i;
        public Object j;

        public b a() {
            rk1.j(this.f8407a, "The uri must be set.");
            return new b(this.f8407a, this.f8408b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public C0206b b(int i) {
            this.i = i;
            return this;
        }

        public C0206b c(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public C0206b d(int i) {
            this.c = i;
            return this;
        }

        public C0206b e(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public C0206b f(String str) {
            this.h = str;
            return this;
        }

        public C0206b g(long j) {
            this.g = j;
            return this;
        }

        public C0206b h(long j) {
            this.f = j;
            return this;
        }

        public C0206b i(Uri uri) {
            this.f8407a = uri;
            return this;
        }

        public C0206b j(String str) {
            this.f8407a = Uri.parse(str);
            return this;
        }

        public C0206b k(long j) {
            this.f8408b = j;
            return this;
        }

        public C0206b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        public C0206b(b bVar) {
            this.f8407a = bVar.f8404a;
            this.f8408b = bVar.f8405b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.g;
            this.g = bVar.h;
            this.h = bVar.i;
            this.i = bVar.j;
            this.j = bVar.f8406k;
        }
    }

    public static String c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public C0206b a() {
        return new C0206b();
    }

    public final String b() {
        return c(this.c);
    }

    public boolean d(int i) {
        return (this.j & i) == i;
    }

    public b e(long j) {
        long j2 = this.h;
        return f(j, j2 != -1 ? j2 - j : -1L);
    }

    public b f(long j, long j2) {
        return (j == 0 && this.h == j2) ? this : new b(this.f8404a, this.f8405b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.f8406k);
    }

    public String toString() {
        String strB = b();
        String strValueOf = String.valueOf(this.f8404a);
        long j = this.g;
        long j2 = this.h;
        String str = this.i;
        int i = this.j;
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 70 + strValueOf.length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(strB);
        sb.append(" ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public b(Uri uri) {
        this(uri, 0L, -1L);
    }

    public b(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    public b(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        rk1.a(j4 >= 0);
        rk1.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        rk1.a(z);
        this.f8404a = uri;
        this.f8405b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.f8406k = obj;
    }
}
