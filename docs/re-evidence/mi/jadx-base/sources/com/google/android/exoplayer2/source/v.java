package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import defpackage.fxp;
import defpackage.mem;
import defpackage.r61;
import defpackage.rk1;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends com.google.android.exoplayer2.source.a {
    public final com.google.android.exoplayer2.upstream.b g;
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a h;
    public final Format i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.h f8284k;
    public final boolean l;
    public final com.google.android.exoplayer2.v m;
    public final com.google.android.exoplayer2.m n;
    public fxp o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.h f8286b = new com.google.android.exoplayer2.upstream.f();
        public boolean c = true;
        public Object d;
        public String e;

        public b(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this.f8285a = (com.google.android.exoplayer2.upstream.a.InterfaceC0205a) rk1.e(interfaceC0205a);
        }

        @Deprecated
        public v a(Uri uri, Format format, long j) {
            String str = format.f7815a;
            if (str == null) {
                str = this.e;
            }
            return new v(str, new com.google.android.exoplayer2.m.h(uri, (String) rk1.e(format.l), format.c, format.d), this.f8285a, j, this.f8286b, this.c, this.d);
        }

        public v b(com.google.android.exoplayer2.m.h hVar, long j) {
            return new v(this.e, hVar, this.f8285a, j, this.f8286b, this.c, this.d);
        }

        public b c(com.google.android.exoplayer2.upstream.h hVar) {
            if (hVar == null) {
                hVar = new com.google.android.exoplayer2.upstream.f();
            }
            this.f8286b = hVar;
            return this;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        this.o = fxpVar;
        C(this.m);
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        return new u(this.g, this.h, this.o, this.i, this.j, this.f8284k, w(aVar), this.l);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        ((u) jVar).m();
    }

    public v(String str, com.google.android.exoplayer2.m.h hVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, long j, com.google.android.exoplayer2.upstream.h hVar2, boolean z, Object obj) {
        this.h = interfaceC0205a;
        this.j = j;
        this.f8284k = hVar2;
        this.l = z;
        com.google.android.exoplayer2.m mVarA = new com.google.android.exoplayer2.m.c().m(Uri.EMPTY).h(hVar.f7964a.toString()).k(Collections.singletonList(hVar)).l(obj).a();
        this.n = mVarA;
        this.i = new Format.b().S(str).e0(hVar.f7965b).V(hVar.c).g0(hVar.d).c0(hVar.e).U(hVar.f).E();
        this.g = new com.google.android.exoplayer2.upstream.b.C0206b().i(hVar.f7964a).b(1).a();
        this.m = new mem(j, true, false, false, null, mVarA);
    }
}
