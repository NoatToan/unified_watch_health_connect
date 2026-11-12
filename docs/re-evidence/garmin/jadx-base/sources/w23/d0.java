package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p43.a2;
import p43.d2;
import p43.g2;
import p43.m1;
import p43.w1;
import t23.d1;
import t23.h1;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f181584h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f181585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f181586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a2 f181587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f181588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f181589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p43.s f181590g;

    public class a implements e23.l<d1, Boolean> {
        public a(d0 d0Var) {
        }

        @Override // e23.l
        public final Boolean invoke(d1 d1Var) {
            return Boolean.valueOf(!d1Var.u());
        }
    }

    public class b implements e23.l<p43.v0, p43.v0> {
        public b() {
        }

        @Override // e23.l
        public final p43.v0 invoke(p43.v0 v0Var) {
            p43.v0 v0Var2 = v0Var;
            d0 d0Var = d0.this;
            if (v0Var2 != null) {
                return d0Var.f181586c.f135795a.e() ? v0Var2 : (p43.v0) d0Var.D0().j(g2.INVARIANT, v0Var2);
            }
            int i14 = d0.f181584h;
            d0Var.getClass();
            return v0Var2;
        }
    }

    public d0(e0 e0Var, a2 a2Var) {
        this.f181585b = e0Var;
        this.f181586c = a2Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void T(int i14) {
        String str = (i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6 || i14 == 8 || i14 == 10 || i14 == 13 || i14 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6 || i14 == 8 || i14 == 10 || i14 == 13 || i14 == 23) ? 3 : 2];
        if (i14 == 2) {
            objArr[0] = "typeArguments";
        } else if (i14 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i14 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i14 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i14 == 8) {
            objArr[0] = "typeArguments";
        } else if (i14 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i14 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i14 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i14) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6 || i14 == 8 || i14 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i14 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i14 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 2 && i14 != 3 && i14 != 5 && i14 != 6 && i14 != 8 && i14 != 10 && i14 != 13 && i14 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public final a2 D0() {
        if (this.f181587d == null) {
            a2 a2Var = this.f181586c;
            if (a2Var.f135795a.e()) {
                this.f181587d = a2Var;
            } else {
                List<d1> parameters = this.f181585b.h().getParameters();
                this.f181588e = new ArrayList(parameters.size());
                this.f181587d = og2.k.H(parameters, a2Var.g(), this, this.f181588e);
                this.f181589f = p13.h0.Y(this.f181588e, new a(this));
            }
        }
        return this.f181587d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t23.e
    public final h1<p43.v0> J() {
        h1<p43.v0> h1VarJ = this.f181585b.J();
        if (h1VarJ == null) {
            return null;
        }
        b bVar = new b();
        if (h1VarJ instanceof t23.w) {
            t23.w wVar = (t23.w) h1VarJ;
            return new t23.w(wVar.f162067a, (t43.i) bVar.invoke(wVar.f162068b));
        }
        if (!(h1VarJ instanceof t23.d0)) {
            lc.u0.r();
            return null;
        }
        Collection<o13.p> collection = ((t23.d0) h1VarJ).f162002a;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        for (o13.p pVar : collection) {
            arrayList.add(new o13.p((x33.f) pVar.f128594a, bVar.invoke((t43.i) pVar.f128595b)));
        }
        return new t23.d0(arrayList);
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.d(this, d14);
    }

    @Override // w23.e0
    public final i43.l N(q43.f fVar) {
        if (fVar == null) {
            T(13);
            throw null;
        }
        i43.l lVarN = this.f181585b.N(fVar);
        if (!this.f181586c.f135795a.e()) {
            return new i43.u(lVarN, D0());
        }
        if (lVarN != null) {
            return lVarN;
        }
        T(14);
        throw null;
    }

    @Override // t23.z
    public final boolean O() {
        return this.f181585b.O();
    }

    @Override // t23.e
    public final i43.l P() {
        i43.l lVarP = this.f181585b.P();
        if (lVarP != null) {
            return lVarP;
        }
        T(15);
        throw null;
    }

    @Override // t23.e
    public final boolean U() {
        return this.f181585b.U();
    }

    @Override // w23.e0, t23.l
    public final t23.e a() {
        t23.e eVarA = this.f181585b.a();
        if (eVarA != null) {
            return eVarA;
        }
        T(21);
        throw null;
    }

    @Override // t23.a1
    public final t23.m b(a2 a2Var) {
        if (a2Var != null) {
            return a2Var.f135795a.e() ? this : new d0(this, a2.f(a2Var.g(), D0().g()));
        }
        T(23);
        throw null;
    }

    @Override // t23.e
    public final i43.l b0() {
        i43.l lVarB0 = this.f181585b.b0();
        if (lVarB0 != null) {
            return lVarB0;
        }
        T(28);
        throw null;
    }

    @Override // t23.e
    public final i43.l c0() {
        return N(f43.e.h(b43.i.c(this.f181585b)));
    }

    @Override // t23.l
    public final t23.l d() {
        t23.l lVarD = this.f181585b.d();
        if (lVarD != null) {
            return lVarD;
        }
        T(22);
        throw null;
    }

    @Override // t23.e, t23.z
    public final t23.a0 g() {
        t23.a0 a0VarG = this.f181585b.g();
        if (a0VarG != null) {
            return a0VarG;
        }
        T(26);
        throw null;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        u23.h annotations = this.f181585b.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        T(19);
        throw null;
    }

    @Override // t23.e
    public final t23.f getKind() {
        t23.f kind = this.f181585b.getKind();
        if (kind != null) {
            return kind;
        }
        T(25);
        throw null;
    }

    @Override // t23.l
    public final x33.f getName() {
        x33.f name = this.f181585b.getName();
        if (name != null) {
            return name;
        }
        T(20);
        throw null;
    }

    @Override // t23.m
    public final t23.y0 getSource() {
        t23.y0.a aVar = t23.y0.f162076a;
        if (aVar != null) {
            return aVar;
        }
        T(29);
        throw null;
    }

    @Override // t23.e, t23.z, t23.o
    public final t23.r getVisibility() {
        t23.r visibility = this.f181585b.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        T(27);
        throw null;
    }

    @Override // t23.h
    public final m1 h() {
        m1 m1VarH = this.f181585b.h();
        if (this.f181586c.f135795a.e()) {
            if (m1VarH != null) {
                return m1VarH;
            }
            T(0);
            throw null;
        }
        if (this.f181590g == null) {
            a2 a2VarD0 = D0();
            Collection<p43.n0> collectionB = m1VarH.b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            Iterator<p43.n0> it = collectionB.iterator();
            while (it.hasNext()) {
                arrayList.add(a2VarD0.j(g2.INVARIANT, it.next()));
            }
            this.f181590g = new p43.s(this, this.f181588e, arrayList, o43.e.f129095e);
        }
        p43.s sVar = this.f181590g;
        if (sVar != null) {
            return sVar;
        }
        T(1);
        throw null;
    }

    @Override // t23.z
    public final boolean isExternal() {
        return this.f181585b.isExternal();
    }

    @Override // t23.e
    public final boolean isInline() {
        return this.f181585b.isInline();
    }

    @Override // t23.e
    public final boolean k() {
        return this.f181585b.k();
    }

    @Override // t23.e
    public final t23.u0 k0() {
        throw new UnsupportedOperationException();
    }

    @Override // t23.i
    public final boolean l() {
        return this.f181585b.l();
    }

    @Override // t23.e
    public final Collection<t23.d> n() {
        Collection<t23.d> collectionN = this.f181585b.n();
        ArrayList arrayList = new ArrayList(collectionN.size());
        for (t23.d dVar : collectionN) {
            arrayList.add(((t23.d) dVar.j0().e(dVar.a()).a(dVar.g()).f(dVar.getVisibility()).q(dVar.getKind()).d().build()).b(D0()));
        }
        return arrayList;
    }

    @Override // t23.e, t23.h
    public final p43.v0 p() {
        return p43.q0.g(h(), d2.e(h().getParameters()), p43.v.f135927a.a(getAnnotations()), false, c0());
    }

    @Override // t23.e, t23.i
    public final List<d1> q() {
        D0();
        ArrayList arrayList = this.f181589f;
        if (arrayList != null) {
            return arrayList;
        }
        T(30);
        throw null;
    }

    @Override // t23.z
    public final boolean q0() {
        return this.f181585b.q0();
    }

    @Override // t23.e
    public final List<t23.u0> r0() {
        List<t23.u0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        T(17);
        throw null;
    }

    @Override // t23.e
    public final t23.d s() {
        return this.f181585b.s();
    }

    @Override // t23.e
    public final boolean s0() {
        return this.f181585b.s0();
    }

    @Override // t23.e
    public final i43.l t(w1 w1Var) {
        return y(w1Var, f43.e.h(b43.i.c(this)));
    }

    @Override // t23.e
    public final boolean t0() {
        return this.f181585b.t0();
    }

    @Override // t23.e
    public final t23.e u0() {
        return this.f181585b.u0();
    }

    @Override // w23.e0
    public final i43.l y(w1 w1Var, q43.f fVar) {
        if (fVar == null) {
            T(6);
            throw null;
        }
        i43.l lVarY = this.f181585b.y(w1Var, fVar);
        if (!this.f181586c.f135795a.e()) {
            return new i43.u(lVarY, D0());
        }
        if (lVarY != null) {
            return lVarY;
        }
        T(7);
        throw null;
    }
}
