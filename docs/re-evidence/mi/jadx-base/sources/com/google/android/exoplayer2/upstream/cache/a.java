package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import defpackage.di4;
import defpackage.e93;
import defpackage.e9i;
import defpackage.ei4;
import defpackage.fxp;
import defpackage.i93;
import defpackage.rk1;
import defpackage.s1p;
import defpackage.wlq;
import defpackage.zo5;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f8417b;
    public final com.google.android.exoplayer2.upstream.a c;
    public final com.google.android.exoplayer2.upstream.a d;
    public final e93 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public com.google.android.exoplayer2.upstream.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.exoplayer2.upstream.b f8418k;
    public com.google.android.exoplayer2.upstream.a l;
    public long m;
    public long n;
    public long o;
    public i93 p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8419r;
    public long s;
    public long t;

    public interface b {
    }

    public static final class c implements com.google.android.exoplayer2.upstream.a.InterfaceC0205a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Cache f8420a;
        public zo5.a c;
        public boolean e;
        public com.google.android.exoplayer2.upstream.a.InterfaceC0205a f;
        public PriorityTaskManager g;
        public int h;
        public int i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8421b = new FileDataSource.a();
        public e93 d = e93.f16403a;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a() {
            com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a = this.f;
            return c(interfaceC0205a != null ? interfaceC0205a.a() : null, this.i, this.h);
        }

        public final a c(com.google.android.exoplayer2.upstream.a aVar, int i, int i2) {
            zo5 zo5VarA;
            Cache cache = (Cache) rk1.e(this.f8420a);
            if (this.e || aVar == null) {
                zo5VarA = null;
            } else {
                zo5.a aVar2 = this.c;
                zo5VarA = aVar2 != null ? aVar2.a() : new CacheDataSink.a().b(cache).a();
            }
            return new a(cache, aVar, this.f8421b.a(), zo5VarA, this.d, i, this.g, i2, null);
        }

        public c d(Cache cache) {
            this.f8420a = cache;
            return this;
        }

        public c e(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this.f = interfaceC0205a;
            return this;
        }
    }

    public static Uri s(Cache cache, String str, Uri uri) {
        Uri uriB = di4.b(cache.a(str));
        return uriB != null ? uriB : uri;
    }

    public final void A(com.google.android.exoplayer2.upstream.b bVar, boolean z) throws IOException {
        i93 i93VarC;
        long jMin;
        com.google.android.exoplayer2.upstream.b bVarA;
        com.google.android.exoplayer2.upstream.a aVar;
        String str = (String) wlq.j(bVar.i);
        if (this.f8419r) {
            i93VarC = null;
        } else if (this.f) {
            try {
                i93VarC = this.f8416a.c(str, this.n, this.o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            i93VarC = this.f8416a.f(str, this.n, this.o);
        }
        if (i93VarC == null) {
            aVar = this.d;
            bVarA = bVar.a().h(this.n).g(this.o).a();
        } else if (i93VarC.d) {
            Uri uriFromFile = Uri.fromFile((File) wlq.j(i93VarC.e));
            long j = i93VarC.f20898b;
            long j2 = this.n - j;
            long jMin2 = i93VarC.c - j2;
            long j3 = this.o;
            if (j3 != -1) {
                jMin2 = Math.min(jMin2, j3);
            }
            bVarA = bVar.a().i(uriFromFile).k(j).h(j2).g(jMin2).a();
            aVar = this.f8417b;
        } else {
            if (i93VarC.c()) {
                jMin = this.o;
            } else {
                jMin = i93VarC.c;
                long j4 = this.o;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            bVarA = bVar.a().h(this.n).g(jMin).a();
            aVar = this.c;
            if (aVar == null) {
                aVar = this.d;
                this.f8416a.e(i93VarC);
                i93VarC = null;
            }
        }
        this.t = (this.f8419r || aVar != this.d) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            rk1.g(u());
            if (aVar == this.d) {
                return;
            }
            try {
                r();
            } catch (Throwable th) {
                if (!((i93) wlq.j(i93VarC)).b()) {
                    throw th;
                }
                this.f8416a.e(i93VarC);
                throw th;
            }
        }
        if (i93VarC != null && i93VarC.b()) {
            this.p = i93VarC;
        }
        this.l = aVar;
        this.f8418k = bVarA;
        this.m = 0L;
        long jB = aVar.b(bVarA);
        ei4 ei4Var = new ei4();
        if (bVarA.h == -1 && jB != -1) {
            this.o = jB;
            ei4.g(ei4Var, this.n + jB);
        }
        if (w()) {
            Uri uriH = aVar.h();
            this.i = uriH;
            ei4.h(ei4Var, bVar.f8404a.equals(uriH) ^ true ? this.i : null);
        }
        if (x()) {
            this.f8416a.h(str, ei4Var);
        }
    }

    public final void B(String str) throws IOException {
        this.o = 0L;
        if (x()) {
            ei4 ei4Var = new ei4();
            ei4.g(ei4Var, this.n);
            this.f8416a.h(str, ei4Var);
        }
    }

    public final int C(com.google.android.exoplayer2.upstream.b bVar) {
        if (this.g && this.q) {
            return 0;
        }
        return (this.h && bVar.h == -1) ? 1 : -1;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) throws IOException {
        try {
            String strA = this.e.a(bVar);
            com.google.android.exoplayer2.upstream.b bVarA = bVar.a().f(strA).a();
            this.j = bVarA;
            this.i = s(this.f8416a, strA, bVarA.f8404a);
            this.n = bVar.g;
            int iC = C(bVar);
            boolean z = iC != -1;
            this.f8419r = z;
            if (z) {
                z(iC);
            }
            if (this.f8419r) {
                this.o = -1L;
            } else {
                long jD = di4.d(this.f8416a.a(strA));
                this.o = jD;
                if (jD != -1) {
                    long j = jD - bVar.g;
                    this.o = j;
                    if (j < 0) {
                        throw new DataSourceException(0);
                    }
                }
            }
            long jMin = bVar.h;
            if (jMin != -1) {
                long j2 = this.o;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.o = jMin;
            }
            long j3 = this.o;
            if (j3 > 0 || j3 == -1) {
                A(bVarA, false);
            }
            long j4 = bVar.h;
            return j4 != -1 ? j4 : this.o;
        } catch (Throwable th) {
            t(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        this.j = null;
        this.i = null;
        this.n = 0L;
        y();
        try {
            r();
        } catch (Throwable th) {
            t(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        return w() ? this.d.d() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.f8417b.f(fxpVar);
        this.d.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() throws IOException {
        com.google.android.exoplayer2.upstream.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.f8418k = null;
            this.l = null;
            i93 i93Var = this.p;
            if (i93Var != null) {
                this.f8416a.e(i93Var);
                this.p = null;
            }
        }
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        com.google.android.exoplayer2.upstream.b bVar = (com.google.android.exoplayer2.upstream.b) rk1.e(this.j);
        com.google.android.exoplayer2.upstream.b bVar2 = (com.google.android.exoplayer2.upstream.b) rk1.e(this.f8418k);
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        try {
            if (this.n >= this.t) {
                A(bVar, true);
            }
            int i4 = ((com.google.android.exoplayer2.upstream.a) rk1.e(this.l)).read(bArr, i, i2);
            if (i4 != -1) {
                if (v()) {
                    this.s += (long) i4;
                }
                long j = i4;
                this.n += j;
                this.m += j;
                long j2 = this.o;
                if (j2 != -1) {
                    this.o = j2 - j;
                }
                return i4;
            }
            if (w()) {
                long j3 = bVar2.h;
                if (j3 != -1) {
                    i3 = i4;
                    if (this.m < j3) {
                    }
                } else {
                    i3 = i4;
                }
                B((String) wlq.j(bVar.i));
                return i3;
            }
            i3 = i4;
            long j4 = this.o;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            r();
            A(bVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            t(th);
            throw th;
        }
    }

    public final void t(Throwable th) {
        if (v() || (th instanceof Cache.CacheException)) {
            this.q = true;
        }
    }

    public final boolean u() {
        return this.l == this.d;
    }

    public final boolean v() {
        return this.l == this.f8417b;
    }

    public final boolean w() {
        return !v();
    }

    public final boolean x() {
        return this.l == this.c;
    }

    public final void y() {
    }

    public final void z(int i) {
    }

    public a(Cache cache, com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.a aVar2, zo5 zo5Var, e93 e93Var, int i, PriorityTaskManager priorityTaskManager, int i2, b bVar) {
        this.f8416a = cache;
        this.f8417b = aVar2;
        this.e = e93Var == null ? e93.f16403a : e93Var;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        if (aVar == null) {
            this.d = g.f8434a;
            this.c = null;
        } else {
            aVar = priorityTaskManager != null ? new e9i(aVar, priorityTaskManager, i2) : aVar;
            this.d = aVar;
            this.c = zo5Var != null ? new s1p(aVar, zo5Var) : null;
        }
    }
}
