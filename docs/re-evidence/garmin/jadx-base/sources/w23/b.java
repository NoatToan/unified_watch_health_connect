package w23;

import java.util.Collections;
import java.util.List;
import p43.a2;
import p43.d2;
import p43.w1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.f f181570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.j<p43.v0> f181571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.j<i43.l> f181572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.j<t23.u0> f181573e;

    public class a implements e23.a<p43.v0> {
        public a() {
        }

        @Override // e23.a
        public final p43.v0 invoke() {
            b bVar = b.this;
            i43.l lVarC0 = bVar.c0();
            w23.a aVar = new w23.a(this);
            r43.i iVar = d2.f135814a;
            return r43.l.f(bVar) ? r43.l.c(r43.k.f150372k, bVar.toString()) : d2.n(bVar.h(), lVarC0, aVar);
        }
    }

    /* JADX INFO: renamed from: w23.b$b, reason: collision with other inner class name */
    public class C3384b implements e23.a<i43.l> {
        public C3384b() {
        }

        @Override // e23.a
        public final i43.l invoke() {
            return new i43.h(b.this.c0());
        }
    }

    public class c implements e23.a<t23.u0> {
        public c() {
        }

        @Override // e23.a
        public final t23.u0 invoke() {
            return new y(b.this);
        }
    }

    public b(o43.n nVar, x33.f fVar) {
        if (nVar == null) {
            T(0);
            throw null;
        }
        if (fVar == null) {
            T(1);
            throw null;
        }
        this.f181570b = fVar;
        this.f181571c = nVar.g(new a());
        this.f181572d = nVar.g(new C3384b());
        this.f181573e = nVar.g(new c());
    }

    public static /* synthetic */ void T(int i14) {
        String str = (i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5 || i14 == 6 || i14 == 9 || i14 == 12 || i14 == 14 || i14 == 16 || i14 == 17 || i14 == 19 || i14 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5 || i14 == 6 || i14 == 9 || i14 == 12 || i14 == 14 || i14 == 16 || i14 == 17 || i14 == 19 || i14 == 20) ? 2 : 3];
        switch (i14) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i14 == 2) {
            objArr[1] = "getName";
        } else if (i14 == 3) {
            objArr[1] = "getOriginal";
        } else if (i14 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i14 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i14 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i14 == 9 || i14 == 12 || i14 == 14 || i14 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i14 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i14 == 19) {
            objArr[1] = "substitute";
        } else if (i14 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i14) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5 && i14 != 6 && i14 != 9 && i14 != 12 && i14 != 14 && i14 != 16 && i14 != 17 && i14 != 19 && i14 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // t23.a1
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public t23.e b(a2 a2Var) {
        if (a2Var != null) {
            return a2Var.f135795a.e() ? this : new d0(this, a2Var);
        }
        T(18);
        throw null;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.d(this, d14);
    }

    @Override // w23.e0, t23.e, t23.l
    public final t23.h a() {
        return this;
    }

    @Override // w23.e0, t23.l
    public final t23.l a() {
        return this;
    }

    @Override // t23.e
    public i43.l b0() {
        i43.l lVarInvoke = this.f181572d.invoke();
        if (lVarInvoke != null) {
            return lVarInvoke;
        }
        T(4);
        throw null;
    }

    @Override // t23.e
    public i43.l c0() {
        i43.l lVarN = N(f43.e.h(b43.i.c(this)));
        if (lVarN != null) {
            return lVarN;
        }
        T(17);
        throw null;
    }

    @Override // t23.l
    public final x33.f getName() {
        x33.f fVar = this.f181570b;
        if (fVar != null) {
            return fVar;
        }
        T(2);
        throw null;
    }

    @Override // t23.e
    public final t23.u0 k0() {
        t23.u0 u0VarInvoke = this.f181573e.invoke();
        if (u0VarInvoke != null) {
            return u0VarInvoke;
        }
        T(5);
        throw null;
    }

    @Override // t23.e, t23.h
    public final p43.v0 p() {
        p43.v0 v0VarInvoke = this.f181571c.invoke();
        if (v0VarInvoke != null) {
            return v0VarInvoke;
        }
        T(20);
        throw null;
    }

    @Override // t23.e
    public List<t23.u0> r0() {
        List<t23.u0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        T(6);
        throw null;
    }

    @Override // t23.e
    public final i43.l t(w1 w1Var) {
        i43.l lVarY = y(w1Var, f43.e.h(b43.i.c(this)));
        if (lVarY != null) {
            return lVarY;
        }
        T(16);
        throw null;
    }

    @Override // w23.e0
    public i43.l y(w1 w1Var, q43.f fVar) {
        if (fVar == null) {
            T(11);
            throw null;
        }
        if (!w1Var.e()) {
            return new i43.u(N(fVar), a2.e(w1Var));
        }
        i43.l lVarN = N(fVar);
        if (lVarN != null) {
            return lVarN;
        }
        T(12);
        throw null;
    }

    @Override // w23.e0, t23.e, t23.l
    public final t23.e a() {
        return this;
    }
}
