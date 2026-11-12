package r23;

import am.j;
import j23.k;
import j23.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o43.n;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.p0;
import p13.w;
import p13.x;
import p13.y;
import p43.g2;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.v0;
import p43.v1;
import t23.a0;
import t23.b1;
import t23.c0;
import t23.d1;
import t23.h0;
import t23.h1;
import t23.q;
import t23.r;
import t23.u;
import t23.y0;
import vb.h;
import w23.w0;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends w23.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x33.b f149945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x33.b f149946n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f149947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f149948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f149949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f149950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2817b f149951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f149952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<d1> f149953l;

    /* JADX INFO: renamed from: r23.b$b, reason: collision with other inner class name */
    public final class C2817b extends p43.b {
        public C2817b() {
            super(b.this.f149947f);
        }

        @Override // p43.m1
        public final boolean C() {
            return true;
        }

        @Override // p43.n
        public final Collection<n0> d() {
            List<x33.b> listK;
            b bVar = b.this;
            f fVar = bVar.f149949h;
            int i14 = bVar.f149950i;
            f.a aVar = f.a.f149959c;
            if (s.g(fVar, aVar)) {
                listK = w.c(b.f149945m);
            } else if (s.g(fVar, f.b.f149960c)) {
                listK = x.k(b.f149946n, new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l, aVar.a(i14)));
            } else {
                f.d dVar = f.d.f149962c;
                if (s.g(fVar, dVar)) {
                    listK = w.c(b.f149945m);
                } else {
                    if (!s.g(fVar, f.c.f149961c)) {
                        int i15 = a53.a.f1481a;
                        h.z("should not be called");
                        return null;
                    }
                    listK = x.k(b.f149946n, new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105854f, dVar.a(i14)));
                }
            }
            c0 c0VarD = bVar.f149948g.d();
            ArrayList arrayList = new ArrayList(y.r(listK, 10));
            for (x33.b bVar2 : listK) {
                t23.e eVarA = u.a(c0VarD, bVar2);
                if (eVarA == null) {
                    l2.m("Built-in class ", bVar2, " not found");
                    return null;
                }
                List listT0 = p13.h0.T0(eVarA.h().getParameters().size(), bVar.f149953l);
                ArrayList arrayList2 = new ArrayList(y.r(listT0, 10));
                Iterator it = listT0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new v1(((d1) it.next()).p()));
                }
                k1.f135863b.getClass();
                arrayList.add(q0.d(k1.f135864c, eVarA, arrayList2));
            }
            return p13.h0.b1(arrayList);
        }

        @Override // p43.m1
        public final List<d1> getParameters() {
            return b.this.f149953l;
        }

        @Override // p43.n
        public final b1 h() {
            return b1.a.f161998a;
        }

        @Override // p43.b
        /* JADX INFO: renamed from: m */
        public final t23.e t() {
            return b.this;
        }

        @Override // p43.b, p43.m1
        public final t23.h t() {
            return b.this;
        }

        public final String toString() {
            return b.this.toString();
        }
    }

    static {
        new a(null);
        f149945m = new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l, x33.f.e("Function"));
        f149946n = new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105857i, x33.f.e("KFunction"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, h0 h0Var, f fVar, int i14) {
        super(nVar, fVar.a(i14));
        nVar.getClass();
        h0Var.getClass();
        fVar.getClass();
        this.f149947f = nVar;
        this.f149948g = h0Var;
        this.f149949h = fVar;
        this.f149950i = i14;
        this.f149951j = new C2817b();
        this.f149952k = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        l lVar = new l(1, i14);
        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((k) it).f96801c) {
            int iNextInt = ((p0) it).nextInt();
            g2 g2Var = g2.IN_VARIANCE;
            String strH = j.h(iNextInt, "P");
            u23.h.f168226x0.getClass();
            arrayList.add(w0.H0(this, u23.h.a.f168228b, g2Var, x33.f.e(strH), arrayList.size(), this.f149947f));
            arrayList2.add(Unit.INSTANCE);
        }
        g2 g2Var2 = g2.OUT_VARIANCE;
        u23.h.f168226x0.getClass();
        arrayList.add(w0.H0(this, u23.h.a.f168228b, g2Var2, x33.f.e("R"), arrayList.size(), this.f149947f));
        this.f149953l = p13.h0.b1(arrayList);
        c.a aVar = c.f149955a;
        f fVar2 = this.f149949h;
        aVar.getClass();
        fVar2.getClass();
        if (fVar2.equals(f.a.f149959c) || fVar2.equals(f.d.f149962c) || fVar2.equals(f.b.f149960c)) {
            return;
        }
        fVar2.equals(f.c.f149961c);
    }

    @Override // t23.e
    public final h1<v0> J() {
        return null;
    }

    @Override // w23.e0
    public final i43.l N(q43.f fVar) {
        fVar.getClass();
        return this.f149952k;
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

    @Override // t23.l
    public final t23.l d() {
        return this.f149948g;
    }

    @Override // t23.e, t23.z
    public final a0 g() {
        return a0.ABSTRACT;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        u23.h.f168226x0.getClass();
        return u23.h.a.f168228b;
    }

    @Override // t23.e
    public final t23.f getKind() {
        return t23.f.INTERFACE;
    }

    @Override // t23.m
    public final y0 getSource() {
        y0.a aVar = y0.f162076a;
        aVar.getClass();
        return aVar;
    }

    @Override // t23.e, t23.z, t23.o
    public final r getVisibility() {
        q.h hVar = q.f162050e;
        hVar.getClass();
        return hVar;
    }

    @Override // t23.h
    public final m1 h() {
        return this.f149951j;
    }

    @Override // t23.z
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
        return false;
    }

    @Override // t23.e
    public final Collection n() {
        return j0.f134944a;
    }

    @Override // t23.e, t23.i
    public final List<d1> q() {
        return this.f149953l;
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // t23.e
    public final /* bridge */ /* synthetic */ t23.d s() {
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
        String strB = getName().b();
        strB.getClass();
        return strB;
    }

    @Override // t23.e
    public final /* bridge */ /* synthetic */ t23.e u0() {
        return null;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
