package t23;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p43.g2;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o43.n f162015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f162016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.h<x33.c, h0> f162017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.h<a, e> f162018d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x33.b f162019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Integer> f162020b;

        public a(x33.b bVar, List<Integer> list) {
            bVar.getClass();
            list.getClass();
            this.f162019a = bVar;
            this.f162020b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f162019a.equals(aVar.f162019a) && this.f162020b.equals(aVar.f162020b);
        }

        public final int hashCode() {
            return this.f162020b.hashCode() + (this.f162019a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ClassRequest(classId=");
            sb3.append(this.f162019a);
            sb3.append(", typeParametersCount=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f162020b, sb3);
        }
    }

    public static final class b extends w23.l {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f162021i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f162022j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final p43.s f162023k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o43.n nVar, l lVar, x33.f fVar, boolean z14, int i14) {
            super(nVar, lVar, fVar, y0.f162076a, false);
            nVar.getClass();
            lVar.getClass();
            fVar.getClass();
            this.f162021i = z14;
            j23.l lVarO = j23.t.o(0, i14);
            ArrayList arrayList = new ArrayList(p13.y.r(lVarO, 10));
            Iterator<Integer> it = lVarO.iterator();
            while (((j23.k) it).f96801c) {
                int iNextInt = ((p13.p0) it).nextInt();
                u23.h.f168226x0.getClass();
                arrayList.add(w23.w0.H0(this, u23.h.a.f168228b, g2.INVARIANT, x33.f.e("T" + iNextInt), iNextInt, nVar));
            }
            this.f162022j = arrayList;
            List listN = o72.t.n(this);
            int i15 = f43.e.f68881a;
            c0 c0VarC = b43.i.c(this);
            c0VarC.getClass();
            this.f162023k = new p43.s(this, listN, p13.a1.b(c0VarC.e().e()), nVar);
        }

        @Override // t23.e
        public final h1<p43.v0> J() {
            return null;
        }

        @Override // w23.e0
        public final i43.l N(q43.f fVar) {
            fVar.getClass();
            return i43.l.b.f91061b;
        }

        @Override // t23.z
        public final boolean O() {
            return false;
        }

        @Override // t23.e
        public final i43.l P() {
            return i43.l.b.f91061b;
        }

        @Override // t23.e
        public final boolean U() {
            return false;
        }

        @Override // t23.e, t23.z
        public final a0 g() {
            return a0.FINAL;
        }

        @Override // u23.a
        public final u23.h getAnnotations() {
            u23.h.f168226x0.getClass();
            return u23.h.a.f168228b;
        }

        @Override // t23.e
        public final f getKind() {
            return f.CLASS;
        }

        @Override // t23.e, t23.z, t23.o
        public final r getVisibility() {
            q.h hVar = q.f162050e;
            hVar.getClass();
            return hVar;
        }

        @Override // t23.h
        public final p43.m1 h() {
            return this.f162023k;
        }

        @Override // w23.l, t23.z
        public final boolean isExternal() {
            return false;
        }

        @Override // t23.e
        public final boolean isInline() {
            return false;
        }

        @Override // t23.e
        public final boolean k() {
            return false;
        }

        @Override // t23.i
        public final boolean l() {
            return this.f162021i;
        }

        @Override // t23.e
        public final Collection<d> n() {
            return p13.l0.f134950a;
        }

        @Override // t23.e, t23.i
        public final List<d1> q() {
            return this.f162022j;
        }

        @Override // t23.z
        public final boolean q0() {
            return false;
        }

        @Override // t23.e
        public final d s() {
            return null;
        }

        @Override // t23.e
        public final boolean s0() {
            return false;
        }

        @Override // t23.e
        public final boolean t0() {
            return false;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // t23.e
        public final e u0() {
            return null;
        }
    }

    public g0(o43.n nVar, c0 c0Var) {
        nVar.getClass();
        c0Var.getClass();
        this.f162015a = nVar;
        this.f162016b = c0Var;
        this.f162017c = nVar.e(new e0(this));
        this.f162018d = nVar.e(new f0(this));
    }

    public final e a(x33.b bVar, List<Integer> list) {
        bVar.getClass();
        list.getClass();
        return (e) ((o43.e.k) this.f162018d).invoke(new a(bVar, list));
    }
}
