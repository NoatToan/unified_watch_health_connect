package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import defpackage.hw3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gw3<T extends hw3> implements k9l, s, Loader.b<cw3>, Loader.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19387b;
    public final Format[] c;
    public final boolean[] d;
    public final T e;
    public final s.a<gw3<T>> f;
    public final l.a g;
    public final h h;
    public final Loader i;
    public final ew3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<f92> f19388k;
    public final List<f92> l;
    public final r m;
    public final r[] n;
    public final h92 o;
    public cw3 p;
    public Format q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b<T> f19389r;
    public long s;
    public long t;
    public int u;
    public f92 v;
    public boolean w;

    public final class a implements k9l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final gw3<T> f19390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f19391b;
        public final int c;
        public boolean d;

        public a(gw3<T> gw3Var, r rVar, int i) {
            this.f19390a = gw3Var;
            this.f19391b = rVar;
            this.c = i;
        }

        private void b() {
            if (this.d) {
                return;
            }
            gw3.this.g.i(gw3.this.f19387b[this.c], gw3.this.c[this.c], 0, null, gw3.this.t);
            this.d = true;
        }

        @Override // defpackage.k9l
        public void a() {
        }

        public void c() {
            rk1.g(gw3.this.d[this.c]);
            gw3.this.d[this.c] = false;
        }

        @Override // defpackage.k9l
        public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (gw3.this.H()) {
                return -3;
            }
            if (gw3.this.v != null && gw3.this.v.h(this.c + 1) <= this.f19391b.C()) {
                return -3;
            }
            b();
            return this.f19391b.S(a1aVar, decoderInputBuffer, i, gw3.this.w);
        }

        @Override // defpackage.k9l
        public boolean isReady() {
            return !gw3.this.H() && this.f19391b.K(gw3.this.w);
        }

        @Override // defpackage.k9l
        public int k(long j) {
            if (gw3.this.H()) {
                return 0;
            }
            int iE = this.f19391b.E(j, gw3.this.w);
            if (gw3.this.v != null) {
                iE = Math.min(iE, gw3.this.v.h(this.c + 1) - this.f19391b.C());
            }
            this.f19391b.e0(iE);
            if (iE > 0) {
                b();
            }
            return iE;
        }
    }

    public interface b<T extends hw3> {
        void d(gw3<T> gw3Var);
    }

    public gw3(int i, int[] iArr, Format[] formatArr, T t, s.a<gw3<T>> aVar, r61 r61Var, long j, c cVar, com.google.android.exoplayer2.drm.b.a aVar2, h hVar, l.a aVar3) {
        this.f19386a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f19387b = iArr;
        this.c = formatArr == null ? new Format[0] : formatArr;
        this.e = t;
        this.f = aVar;
        this.g = aVar3;
        this.h = hVar;
        this.i = new Loader("ChunkSampleStream");
        this.j = new ew3();
        ArrayList<f92> arrayList = new ArrayList<>();
        this.f19388k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new r[length];
        this.d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        r[] rVarArr = new r[i3];
        r rVarK = r.k(r61Var, (Looper) rk1.e(Looper.myLooper()), cVar, aVar2);
        this.m = rVarK;
        iArr2[0] = i;
        rVarArr[0] = rVarK;
        while (i2 < length) {
            r rVarL = r.l(r61Var);
            this.n[i2] = rVarL;
            int i4 = i2 + 1;
            rVarArr[i4] = rVarL;
            iArr2[i4] = this.f19387b[i2];
            i2 = i4;
        }
        this.o = new h92(iArr2, rVarArr);
        this.s = j;
        this.t = j;
    }

    public final void A(int i) {
        int iMin = Math.min(N(i, 0), this.u);
        if (iMin > 0) {
            wlq.G0(this.f19388k, 0, iMin);
            this.u -= iMin;
        }
    }

    public final void B(int i) {
        rk1.g(!this.i.j());
        int size = this.f19388k.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!F(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = E().h;
        f92 f92VarC = C(i);
        if (this.f19388k.isEmpty()) {
            this.s = this.t;
        }
        this.w = false;
        this.g.D(this.f19386a, f92VarC.g, j);
    }

    public final f92 C(int i) {
        f92 f92Var = this.f19388k.get(i);
        ArrayList<f92> arrayList = this.f19388k;
        wlq.G0(arrayList, i, arrayList.size());
        this.u = Math.max(this.u, this.f19388k.size());
        int i2 = 0;
        this.m.u(f92Var.h(0));
        while (true) {
            r[] rVarArr = this.n;
            if (i2 >= rVarArr.length) {
                return f92Var;
            }
            r rVar = rVarArr[i2];
            i2++;
            rVar.u(f92Var.h(i2));
        }
    }

    public T D() {
        return this.e;
    }

    public final f92 E() {
        ArrayList<f92> arrayList = this.f19388k;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean F(int i) {
        int iC;
        f92 f92Var = this.f19388k.get(i);
        if (this.m.C() > f92Var.h(0)) {
            return true;
        }
        int i2 = 0;
        do {
            r[] rVarArr = this.n;
            if (i2 >= rVarArr.length) {
                return false;
            }
            iC = rVarArr[i2].C();
            i2++;
        } while (iC <= f92Var.h(i2));
        return true;
    }

    public final boolean G(cw3 cw3Var) {
        return cw3Var instanceof f92;
    }

    public boolean H() {
        return this.s != -9223372036854775807L;
    }

    public final void I() {
        int iN = N(this.m.C(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > iN) {
                return;
            }
            this.u = i + 1;
            J(i);
        }
    }

    public final void J(int i) {
        f92 f92Var = this.f19388k.get(i);
        Format format = f92Var.d;
        if (!format.equals(this.q)) {
            this.g.i(this.f19386a, format, f92Var.e, f92Var.f, f92Var.g);
        }
        this.q = format;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void o(cw3 cw3Var, long j, long j2, boolean z) {
        this.p = null;
        this.v = null;
        mie mieVar = new mie(cw3Var.f14794a, cw3Var.f14795b, cw3Var.e(), cw3Var.d(), j, j2, cw3Var.a());
        this.h.d(cw3Var.f14794a);
        this.g.r(mieVar, cw3Var.c, this.f19386a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h);
        if (z) {
            return;
        }
        if (H()) {
            Q();
        } else if (G(cw3Var)) {
            C(this.f19388k.size() - 1);
            if (this.f19388k.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.k(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void q(cw3 cw3Var, long j, long j2) {
        this.p = null;
        this.e.h(cw3Var);
        mie mieVar = new mie(cw3Var.f14794a, cw3Var.f14795b, cw3Var.e(), cw3Var.d(), j, j2, cw3Var.a());
        this.h.d(cw3Var.f14794a);
        this.g.u(mieVar, cw3Var.c, this.f19386a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h);
        this.f.k(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Loader.c s(cw3 cw3Var, long j, long j2, IOException iOException, int i) {
        Loader.c cVarH;
        long jA = cw3Var.a();
        boolean zG = G(cw3Var);
        int size = this.f19388k.size() - 1;
        boolean z = (jA != 0 && zG && F(size)) ? false : true;
        mie mieVar = new mie(cw3Var.f14794a, cw3Var.f14795b, cw3Var.e(), cw3Var.d(), j, j2, jA);
        h.a aVar = new h.a(mieVar, new ljf(cw3Var.c, this.f19386a, cw3Var.d, cw3Var.e, cw3Var.f, g83.d(cw3Var.g), g83.d(cw3Var.h)), iOException, i);
        if (!this.e.j(cw3Var, z, iOException, z ? this.h.c(aVar) : -9223372036854775807L)) {
            cVarH = null;
        } else if (z) {
            cVarH = Loader.f;
            if (zG) {
                rk1.g(C(size) == cw3Var);
                if (this.f19388k.isEmpty()) {
                    this.s = this.t;
                }
            }
        } else {
            toe.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jA2 = this.h.a(aVar);
            cVarH = jA2 != -9223372036854775807L ? Loader.h(false, jA2) : Loader.g;
        }
        boolean z2 = !cVarH.c();
        this.g.w(mieVar, cw3Var.c, this.f19386a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h, iOException, z2);
        if (z2) {
            this.p = null;
            this.h.d(cw3Var.f14794a);
            this.f.k(this);
        }
        return cVarH;
    }

    public final int N(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f19388k.size()) {
                return this.f19388k.size() - 1;
            }
        } while (this.f19388k.get(i2).h(0) <= i);
        return i2 - 1;
    }

    public void O() {
        P(null);
    }

    public void P(b<T> bVar) {
        this.f19389r = bVar;
        this.m.R();
        for (r rVar : this.n) {
            rVar.R();
        }
        this.i.m(this);
    }

    public final void Q() {
        this.m.V();
        for (r rVar : this.n) {
            rVar.V();
        }
    }

    public void R(long j) {
        f92 f92Var;
        boolean Z;
        this.t = j;
        if (H()) {
            this.s = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.f19388k.size()) {
                f92Var = this.f19388k.get(i2);
                long j2 = f92Var.g;
                if (j2 == j && f92Var.f17542k == -9223372036854775807L) {
                    break;
                } else if (j2 <= j) {
                    i2++;
                }
            }
            f92Var = null;
            break;
        }
        if (f92Var != null) {
            Z = this.m.Y(f92Var.h(0));
        } else {
            Z = this.m.Z(j, j < g());
        }
        if (Z) {
            this.u = N(this.m.C(), 0);
            r[] rVarArr = this.n;
            int length = rVarArr.length;
            while (i < length) {
                rVarArr[i].Z(j, true);
                i++;
            }
            return;
        }
        this.s = j;
        this.w = false;
        this.f19388k.clear();
        this.u = 0;
        if (!this.i.j()) {
            this.i.g();
            Q();
            return;
        }
        this.m.r();
        r[] rVarArr2 = this.n;
        int length2 = rVarArr2.length;
        while (i < length2) {
            rVarArr2[i].r();
            i++;
        }
        this.i.f();
    }

    public gw3<T>.a S(long j, int i) {
        for (int i2 = 0; i2 < this.n.length; i2++) {
            if (this.f19387b[i2] == i) {
                rk1.g(!this.d[i2]);
                this.d[i2] = true;
                this.n[i2].Z(j, true);
                return new a(this, this.n[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.k9l
    public void a() throws IOException {
        this.i.a();
        this.m.N();
        if (this.i.j()) {
            return;
        }
        this.e.a();
    }

    public long b(long j, brl brlVar) {
        return this.e.b(j, brlVar);
    }

    @Override // com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        List<f92> listEmptyList;
        long j2;
        if (this.w || this.i.j() || this.i.i()) {
            return false;
        }
        boolean zH = H();
        if (zH) {
            listEmptyList = Collections.emptyList();
            j2 = this.s;
        } else {
            listEmptyList = this.l;
            j2 = E().h;
        }
        this.e.f(j, j2, listEmptyList, this.j);
        ew3 ew3Var = this.j;
        boolean z = ew3Var.f17125b;
        cw3 cw3Var = ew3Var.f17124a;
        ew3Var.a();
        if (z) {
            this.s = -9223372036854775807L;
            this.w = true;
            return true;
        }
        if (cw3Var == null) {
            return false;
        }
        this.p = cw3Var;
        if (G(cw3Var)) {
            f92 f92Var = (f92) cw3Var;
            if (zH) {
                long j3 = f92Var.g;
                long j4 = this.s;
                if (j3 != j4) {
                    this.m.b0(j4);
                    for (r rVar : this.n) {
                        rVar.b0(this.s);
                    }
                }
                this.s = -9223372036854775807L;
            }
            f92Var.j(this.o);
            this.f19388k.add(f92Var);
        } else if (cw3Var instanceof gad) {
            ((gad) cw3Var).f(this.o);
        }
        this.g.A(new mie(cw3Var.f14794a, cw3Var.f14795b, this.i.n(cw3Var, this, this.h.e(cw3Var.c))), cw3Var.c, this.f19386a, cw3Var.d, cw3Var.e, cw3Var.f, cw3Var.g, cw3Var.h);
        return true;
    }

    @Override // defpackage.k9l
    public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (H()) {
            return -3;
        }
        f92 f92Var = this.v;
        if (f92Var != null && f92Var.h(0) <= this.m.C()) {
            return -3;
        }
        I();
        return this.m.S(a1aVar, decoderInputBuffer, i, this.w);
    }

    @Override // com.google.android.exoplayer2.source.s
    public long e() {
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.s;
        }
        long jMax = this.t;
        f92 f92VarE = E();
        if (!f92VarE.g()) {
            if (this.f19388k.size() > 1) {
                ArrayList<f92> arrayList = this.f19388k;
                f92VarE = arrayList.get(arrayList.size() - 2);
            } else {
                f92VarE = null;
            }
        }
        if (f92VarE != null) {
            jMax = Math.max(jMax, f92VarE.h);
        }
        return Math.max(jMax, this.m.z());
    }

    @Override // com.google.android.exoplayer2.source.s
    public void f(long j) {
        if (this.i.i() || H()) {
            return;
        }
        if (!this.i.j()) {
            int iG = this.e.g(j, this.l);
            if (iG < this.f19388k.size()) {
                B(iG);
                return;
            }
            return;
        }
        cw3 cw3Var = (cw3) rk1.e(this.p);
        if (!(G(cw3Var) && F(this.f19388k.size() - 1)) && this.e.d(j, cw3Var, this.l)) {
            this.i.f();
            if (G(cw3Var)) {
                this.v = (f92) cw3Var;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.s
    public long g() {
        if (H()) {
            return this.s;
        }
        if (this.w) {
            return Long.MIN_VALUE;
        }
        return E().h;
    }

    @Override // com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.i.j();
    }

    @Override // defpackage.k9l
    public boolean isReady() {
        return !H() && this.m.K(this.w);
    }

    @Override // defpackage.k9l
    public int k(long j) {
        if (H()) {
            return 0;
        }
        int iE = this.m.E(j, this.w);
        f92 f92Var = this.v;
        if (f92Var != null) {
            iE = Math.min(iE, f92Var.h(0) - this.m.C());
        }
        this.m.e0(iE);
        I();
        return iE;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void l() {
        this.m.T();
        for (r rVar : this.n) {
            rVar.T();
        }
        this.e.release();
        b<T> bVar = this.f19389r;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void u(long j, boolean z) {
        if (H()) {
            return;
        }
        int iX = this.m.x();
        this.m.q(j, z, true);
        int iX2 = this.m.x();
        if (iX2 > iX) {
            long jY = this.m.y();
            int i = 0;
            while (true) {
                r[] rVarArr = this.n;
                if (i >= rVarArr.length) {
                    break;
                }
                rVarArr[i].q(jY, z, this.d[i]);
                i++;
            }
        }
        A(iX2);
    }
}
