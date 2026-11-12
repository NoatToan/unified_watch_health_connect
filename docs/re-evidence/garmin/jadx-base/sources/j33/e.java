package j33;

import d53.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o13.p;
import p43.a2;
import p43.n0;
import t23.a0;
import t23.d1;
import t23.j1;
import t23.l;
import t23.r;
import t23.u0;
import t23.v;
import t23.x0;
import t23.y0;
import u23.h;
import w23.q0;
import w23.r0;
import w23.x;
import w43.s;

/* JADX INFO: loaded from: classes3.dex */
public class e extends r0 implements j33.a {
    public static final a T = new a();
    public static final b X = new b();
    public c I;
    public final boolean P;

    public static class a implements t23.a.InterfaceC3056a<j1> {
    }

    public static class b implements t23.a.InterfaceC3056a<Boolean> {
    }

    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f96960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f96961b;

        c(boolean z14, boolean z15) {
            this.f96960a = z14;
            this.f96961b = z15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, x0 x0Var, h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var, boolean z14) {
        super(lVar, x0Var, hVar, fVar, aVar, y0Var);
        if (lVar == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (fVar == null) {
            y(2);
            throw null;
        }
        if (aVar == null) {
            y(3);
            throw null;
        }
        if (y0Var == null) {
            y(4);
            throw null;
        }
        this.I = null;
        this.P = z14;
    }

    public static e S0(l lVar, k33.f fVar, x33.f fVar2, n33.a aVar, boolean z14) {
        if (lVar == null) {
            y(5);
            throw null;
        }
        if (fVar2 == null) {
            y(7);
            throw null;
        }
        if (aVar != null) {
            return new e(lVar, null, fVar, fVar2, t23.b.a.DECLARATION, aVar, z14);
        }
        y(8);
        throw null;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 13 || i14 == 18 || i14 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 13 || i14 == 18 || i14 == 21) ? 2 : 3];
        switch (i14) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i14 == 13) {
            objArr[1] = "initialize";
        } else if (i14 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i14 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i14) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 13 && i14 != 18 && i14 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.r0, w23.x
    public final x E0(l lVar, v vVar, h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        if (lVar == null) {
            y(14);
            throw null;
        }
        if (aVar == null) {
            y(15);
            throw null;
        }
        if (hVar == null) {
            y(16);
            throw null;
        }
        x0 x0Var = (x0) vVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(lVar, x0Var, hVar, fVar, aVar, y0Var, this.P);
        c cVar = this.I;
        eVar.T0(cVar.f96960a, cVar.f96961b);
        return eVar;
    }

    @Override // w23.x, t23.a
    public final boolean M() {
        return this.I.f96961b;
    }

    @Override // w23.r0
    public final r0 R0(u0 u0Var, u0 u0Var2, List<u0> list, List<? extends d1> list2, List<j1> list3, n0 n0Var, a0 a0Var, r rVar, Map<? extends t23.a.InterfaceC3056a<?>, ?> map) {
        w43.g bVar;
        if (list == null) {
            y(9);
            throw null;
        }
        if (list2 == null) {
            y(10);
            throw null;
        }
        if (list3 == null) {
            y(11);
            throw null;
        }
        if (rVar == null) {
            y(12);
            throw null;
        }
        super.R0(u0Var, u0Var2, list, list2, list3, n0Var, a0Var, rVar, map);
        s.f182025a.getClass();
        for (w43.h hVar : s.f182026b) {
            k kVar = hVar.f182002b;
            x33.f fVar = hVar.f182001a;
            if (fVar == null || p005kotlin.jvm.internal.s.g(getName(), fVar)) {
                if (kVar != null) {
                    String strB = getName().b();
                    strB.getClass();
                    if (!kVar.d(strB)) {
                        continue;
                    }
                }
                Collection<x33.f> collection = hVar.f182003c;
                if (collection == null || collection.contains(getName())) {
                    for (w43.f fVar2 : hVar.f182005e) {
                        String strB2 = fVar2.b(this);
                        if (strB2 != null) {
                            bVar = new w43.g.b(strB2);
                            this.f181731m = bVar.f181998a;
                            return this;
                        }
                    }
                    String strInvoke = hVar.f182004d.invoke(this);
                    bVar = strInvoke != null ? new w43.g.b(strInvoke) : w43.g.c.f182000b;
                    this.f181731m = bVar.f181998a;
                    return this;
                }
            }
        }
        bVar = w43.g.a.f181999b;
        this.f181731m = bVar.f181998a;
        return this;
    }

    public final void T0(boolean z14, boolean z15) {
        c cVar;
        if (z14) {
            cVar = z15 ? c.STABLE_SYNTHESIZED : c.STABLE_DECLARED;
        } else {
            cVar = z15 ? c.NON_STABLE_SYNTHESIZED : c.NON_STABLE_DECLARED;
        }
        if (cVar != null) {
            this.I = cVar;
        } else {
            vb.h.z("@NotNull method kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus.get must not return null");
        }
    }

    @Override // j33.a
    public final j33.a l0(n0 n0Var, ArrayList arrayList, n0 n0Var2, p pVar) {
        q0 q0VarH;
        ArrayList arrayListP = gg.b.p(arrayList, f(), this);
        if (n0Var == null) {
            q0VarH = null;
        } else {
            h.f168226x0.getClass();
            q0VarH = b43.h.h(this, n0Var, h.a.f168228b);
        }
        x.a aVarI0 = I0(a2.f135794b);
        aVarI0.f181749g = arrayListP;
        aVarI0.f181753k = n0Var2;
        aVarI0.f181751i = q0VarH;
        aVarI0.f181758p = true;
        aVarI0.f181757o = true;
        e eVar = (e) aVarI0.f181766x.F0(aVarI0);
        if (pVar != null) {
            eVar.J0((t23.a.InterfaceC3056a) pVar.f128594a, pVar.f128595b);
        }
        if (eVar != null) {
            return eVar;
        }
        y(21);
        throw null;
    }
}
