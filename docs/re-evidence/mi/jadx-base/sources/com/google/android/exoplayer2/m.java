package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import defpackage.j63;
import defpackage.ph8;
import defpackage.rk1;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    public static final j63<m> f = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f7949b;
    public final f c;
    public final n d;
    public final d e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7951b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7950a.equals(bVar.f7950a) && wlq.c(this.f7951b, bVar.f7951b);
        }

        public int hashCode() {
            int iHashCode = this.f7950a.hashCode() * 31;
            Object obj = this.f7951b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public b(Uri uri, Object obj) {
            this.f7950a = uri;
            this.f7951b = obj;
        }
    }

    public static final class c {
        public float A;
        public float B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f7953b;
        public String c;
        public long d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public Uri i;
        public Map<String, String> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public UUID f7954k;
        public boolean l;
        public boolean m;
        public boolean n;
        public List<Integer> o;
        public byte[] p;
        public List<StreamKey> q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f7955r;
        public List<h> s;
        public Uri t;
        public Object u;
        public Object v;
        public n w;
        public long x;
        public long y;
        public long z;

        public m a() {
            g gVar;
            rk1.g(this.i == null || this.f7954k != null);
            Uri uri = this.f7953b;
            if (uri != null) {
                String str = this.c;
                UUID uuid = this.f7954k;
                e eVar = uuid != null ? new e(uuid, this.i, this.j, this.l, this.n, this.m, this.o, this.p) : null;
                Uri uri2 = this.t;
                gVar = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.u) : null, this.q, this.f7955r, this.s, this.v);
            } else {
                gVar = null;
            }
            String str2 = this.f7952a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            d dVar = new d(this.d, this.e, this.f, this.g, this.h);
            f fVar = new f(this.x, this.y, this.z, this.A, this.B);
            n nVar = this.w;
            if (nVar == null) {
                nVar = n.i;
            }
            return new m(str3, dVar, gVar, fVar, nVar);
        }

        public c b(String str) {
            this.f7955r = str;
            return this;
        }

        public c c(long j) {
            this.z = j;
            return this;
        }

        public c d(float f) {
            this.B = f;
            return this;
        }

        public c e(long j) {
            this.y = j;
            return this;
        }

        public c f(float f) {
            this.A = f;
            return this;
        }

        public c g(long j) {
            this.x = j;
            return this;
        }

        public c h(String str) {
            this.f7952a = (String) rk1.e(str);
            return this;
        }

        public c i(String str) {
            this.c = str;
            return this;
        }

        public c j(List<StreamKey> list) {
            this.q = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c k(List<h> list) {
            this.s = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c l(Object obj) {
            this.v = obj;
            return this;
        }

        public c m(Uri uri) {
            this.f7953b = uri;
            return this;
        }

        public c n(String str) {
            return m(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.e = Long.MIN_VALUE;
            this.o = Collections.emptyList();
            this.j = Collections.emptyMap();
            this.q = Collections.emptyList();
            this.s = Collections.emptyList();
            this.x = -9223372036854775807L;
            this.y = -9223372036854775807L;
            this.z = -9223372036854775807L;
            this.A = -3.4028235E38f;
            this.B = -3.4028235E38f;
        }

        public c(m mVar) {
            this();
            d dVar = mVar.e;
            this.e = dVar.f7957b;
            this.f = dVar.c;
            this.g = dVar.d;
            this.d = dVar.f7956a;
            this.h = dVar.e;
            this.f7952a = mVar.f7948a;
            this.w = mVar.d;
            f fVar = mVar.c;
            this.x = fVar.f7960a;
            this.y = fVar.f7961b;
            this.z = fVar.c;
            this.A = fVar.d;
            this.B = fVar.e;
            g gVar = mVar.f7949b;
            if (gVar != null) {
                this.f7955r = gVar.f;
                this.c = gVar.f7963b;
                this.f7953b = gVar.f7962a;
                this.q = gVar.e;
                this.s = gVar.g;
                this.v = gVar.h;
                e eVar = gVar.c;
                if (eVar != null) {
                    this.i = eVar.f7959b;
                    this.j = eVar.c;
                    this.l = eVar.d;
                    this.n = eVar.f;
                    this.m = eVar.e;
                    this.o = eVar.g;
                    this.f7954k = eVar.f7958a;
                    this.p = eVar.a();
                }
                b bVar = gVar.d;
                if (bVar != null) {
                    this.t = bVar.f7950a;
                    this.u = bVar.f7951b;
                }
            }
        }
    }

    public static final class d {
        public static final j63<d> f = new ph8();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7957b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7956a == dVar.f7956a && this.f7957b == dVar.f7957b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public int hashCode() {
            long j = this.f7956a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f7957b;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
        }

        public d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f7956a = j;
            this.f7957b = j2;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f7958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7959b;
        public final Map<String, String> c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final List<Integer> g;
        public final byte[] h;

        public byte[] a() {
            byte[] bArr = this.h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f7958a.equals(eVar.f7958a) && wlq.c(this.f7959b, eVar.f7959b) && wlq.c(this.c, eVar.c) && this.d == eVar.d && this.f == eVar.f && this.e == eVar.e && this.g.equals(eVar.g) && Arrays.equals(this.h, eVar.h);
        }

        public int hashCode() {
            int iHashCode = this.f7958a.hashCode() * 31;
            Uri uri = this.f7959b;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
        }

        public e(UUID uuid, Uri uri, Map<String, String> map, boolean z, boolean z2, boolean z3, List<Integer> list, byte[] bArr) {
            rk1.a((z2 && uri == null) ? false : true);
            this.f7958a = uuid;
            this.f7959b = uri;
            this.c = map;
            this.d = z;
            this.f = z2;
            this.e = z3;
            this.g = list;
            this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    public static final class f {
        public static final f f = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public static final j63<f> g = new ph8();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7961b;
        public final long c;
        public final float d;
        public final float e;

        public f(long j, long j2, long j3, float f2, float f3) {
            this.f7960a = j;
            this.f7961b = j2;
            this.c = j3;
            this.d = f2;
            this.e = f3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f7960a == fVar.f7960a && this.f7961b == fVar.f7961b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e;
        }

        public int hashCode() {
            long j = this.f7960a;
            long j2 = this.f7961b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f2 = this.d;
            int iFloatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.e;
            return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7963b;
        public final e c;
        public final b d;
        public final List<StreamKey> e;
        public final String f;
        public final List<h> g;
        public final Object h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f7962a.equals(gVar.f7962a) && wlq.c(this.f7963b, gVar.f7963b) && wlq.c(this.c, gVar.c) && wlq.c(this.d, gVar.d) && this.e.equals(gVar.e) && wlq.c(this.f, gVar.f) && this.g.equals(gVar.g) && wlq.c(this.h, gVar.h);
        }

        public int hashCode() {
            int iHashCode = this.f7962a.hashCode() * 31;
            String str = this.f7963b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.c;
            int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.e.hashCode()) * 31;
            String str2 = this.f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.g.hashCode()) * 31;
            Object obj = this.h;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        public g(Uri uri, String str, e eVar, b bVar, List<StreamKey> list, String str2, List<h> list2, Object obj) {
            this.f7962a = uri;
            this.f7963b = str;
            this.c = eVar;
            this.d = bVar;
            this.e = list;
            this.f = str2;
            this.g = list2;
            this.h = obj;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7965b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;

        public h(Uri uri, String str, String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f7964a.equals(hVar.f7964a) && this.f7965b.equals(hVar.f7965b) && wlq.c(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e && wlq.c(this.f, hVar.f);
        }

        public int hashCode() {
            int iHashCode = ((this.f7964a.hashCode() * 31) + this.f7965b.hashCode()) * 31;
            String str = this.c;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
            String str2 = this.f;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public h(Uri uri, String str, String str2, int i, int i2, String str3) {
            this.f7964a = uri;
            this.f7965b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = str3;
        }
    }

    public static m b(Uri uri) {
        return new c().m(uri).a();
    }

    public static m c(String str) {
        return new c().n(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return wlq.c(this.f7948a, mVar.f7948a) && this.e.equals(mVar.e) && wlq.c(this.f7949b, mVar.f7949b) && wlq.c(this.c, mVar.c) && wlq.c(this.d, mVar.d);
    }

    public int hashCode() {
        int iHashCode = this.f7948a.hashCode() * 31;
        g gVar = this.f7949b;
        return ((((((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public m(String str, d dVar, g gVar, f fVar, n nVar) {
        this.f7948a = str;
        this.f7949b = gVar;
        this.c = fVar;
        this.d = nVar;
        this.e = dVar;
    }
}
