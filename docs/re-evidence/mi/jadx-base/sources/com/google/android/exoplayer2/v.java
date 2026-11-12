package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import defpackage.bp0;
import defpackage.g83;
import defpackage.j63;
import defpackage.ph8;
import defpackage.rk1;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f8444a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j63<v> f8445b = new ph8();

    public class a extends v {
        @Override // com.google.android.exoplayer2.v
        public int b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.v
        public b g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.v
        public int i() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.v
        public Object m(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.v
        public c o(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.v
        public int p() {
            return 0;
        }
    }

    public static final class b {
        public static final j63<b> h = new ph8();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8447b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public bp0 g = bp0.g;

        public int a(int i) {
            return this.g.d[i].f4432a;
        }

        public long b(int i, int i2) {
            bp0.a aVar = this.g.d[i];
            if (aVar.f4432a != -1) {
                return aVar.d[i2];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.g.f4431b;
        }

        public int d(long j) {
            return this.g.a(j, this.d);
        }

        public int e(long j) {
            return this.g.b(j, this.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return wlq.c(this.f8446a, bVar.f8446a) && wlq.c(this.f8447b, bVar.f8447b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && wlq.c(this.g, bVar.g);
        }

        public long f(int i) {
            return this.g.c[i];
        }

        public long g() {
            return this.g.e;
        }

        public long h() {
            return this.d;
        }

        public int hashCode() {
            Object obj = this.f8446a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f8447b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
        }

        public int i(int i) {
            return this.g.d[i].a();
        }

        public int j(int i, int i2) {
            return this.g.d[i].b(i2);
        }

        public long k() {
            return g83.d(this.e);
        }

        public long l() {
            return this.e;
        }

        public boolean m(int i) {
            return !this.g.d[i].c();
        }

        public b n(Object obj, Object obj2, int i, long j, long j2) {
            return o(obj, obj2, i, j, j2, bp0.g, false);
        }

        public b o(Object obj, Object obj2, int i, long j, long j2, bp0 bp0Var, boolean z) {
            this.f8446a = obj;
            this.f8447b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.g = bp0Var;
            this.f = z;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Object f8448r = new Object();
        public static final Object s = new Object();
        public static final m t = new m.c().h("com.google.android.exoplayer2.Timeline").m(Uri.EMPTY).a();
        public static final j63<c> u = new ph8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f8450b;
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;

        @Deprecated
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public m.f f8451k;
        public boolean l;
        public long m;
        public long n;
        public int o;
        public int p;
        public long q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8449a = f8448r;
        public m c = t;

        public long a() {
            return wlq.W(this.g);
        }

        public long b() {
            return g83.d(this.m);
        }

        public long c() {
            return this.m;
        }

        public long d() {
            return g83.d(this.n);
        }

        public long e() {
            return this.q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return wlq.c(this.f8449a, cVar.f8449a) && wlq.c(this.c, cVar.c) && wlq.c(this.d, cVar.d) && wlq.c(this.f8451k, cVar.f8451k) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p && this.q == cVar.q;
        }

        public boolean f() {
            rk1.g(this.j == (this.f8451k != null));
            return this.f8451k != null;
        }

        public c g(Object obj, m mVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, m.f fVar, long j4, long j5, int i, int i2, long j6) {
            m.g gVar;
            this.f8449a = obj;
            this.c = mVar != null ? mVar : t;
            this.f8450b = (mVar == null || (gVar = mVar.f7949b) == null) ? null : gVar.h;
            this.d = obj2;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = z;
            this.i = z2;
            this.j = fVar != null;
            this.f8451k = fVar;
            this.m = j4;
            this.n = j5;
            this.o = i;
            this.p = i2;
            this.q = j6;
            this.l = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f8449a.hashCode()) * 31) + this.c.hashCode()) * 31;
            Object obj = this.d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            m.f fVar = this.f8451k;
            int iHashCode3 = (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            long j = this.e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
            long j4 = this.m;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.n;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.o) * 31) + this.p) * 31;
            long j6 = this.q;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar).c;
        if (n(i3, cVar).p != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).o;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar.p() != p() || vVar.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i = 0; i < p(); i++) {
            if (!n(i, cVar).equals(vVar.n(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, bVar, true).equals(vVar.g(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i, b bVar) {
        return g(i, bVar, false);
    }

    public abstract b g(int i, b bVar, boolean z);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i = 0; i < p(); i++) {
            iP = (iP * 31) + n(i, cVar).hashCode();
        }
        int i2 = (iP * 31) + i();
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, bVar, true).hashCode();
        }
        return i2;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i, long j) {
        return (Pair) rk1.e(k(cVar, bVar, i, j, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i, long j, long j2) {
        rk1.c(i, 0, p());
        o(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.o;
        f(i2, bVar);
        while (i2 < cVar.p && bVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, bVar).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, bVar, true);
        return Pair.create(rk1.e(bVar.f8447b), Long.valueOf(j - bVar.e));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i);

    public final c n(int i, c cVar) {
        return o(i, cVar, 0L);
    }

    public abstract c o(int i, c cVar, long j);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i, b bVar, c cVar, int i2, boolean z) {
        return d(i, bVar, cVar, i2, z) == -1;
    }
}
