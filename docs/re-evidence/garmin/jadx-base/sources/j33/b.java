package j33;

import java.util.ArrayList;
import o13.p;
import p13.j0;
import p43.n0;
import t23.l;
import t23.v;
import t23.y0;
import u23.h;
import w23.k;
import w23.q0;
import w23.x;

/* JADX INFO: loaded from: classes3.dex */
public class b extends k implements a {
    public Boolean P;
    public Boolean T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t23.e eVar, b bVar, h hVar, boolean z14, t23.b.a aVar, y0 y0Var) {
        super(eVar, bVar, hVar, z14, aVar, y0Var);
        if (eVar == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (aVar == null) {
            y(2);
            throw null;
        }
        if (y0Var == null) {
            y(3);
            throw null;
        }
        this.P = null;
        this.T = null;
    }

    public static b R0(t23.e eVar, h hVar, boolean z14, n33.a aVar) {
        if (eVar == null) {
            y(4);
            throw null;
        }
        if (hVar == null) {
            y(5);
            throw null;
        }
        if (aVar != null) {
            return new b(eVar, null, hVar, z14, t23.b.a.DECLARATION, aVar);
        }
        y(6);
        throw null;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 11 || i14 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 11 || i14 == 18) ? 2 : 3];
        switch (i14) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i14 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i14 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i14) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 11 && i14 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.k, w23.x
    public final /* bridge */ /* synthetic */ x E0(l lVar, v vVar, h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        return S0(lVar, vVar, aVar, hVar, y0Var);
    }

    @Override // w23.x
    public final void K0(boolean z14) {
        this.P = Boolean.valueOf(z14);
    }

    @Override // w23.x
    public final void L0(boolean z14) {
        this.T = Boolean.valueOf(z14);
    }

    @Override // w23.x, t23.a
    public final boolean M() {
        return this.T.booleanValue();
    }

    @Override // w23.k
    /* JADX INFO: renamed from: N0 */
    public final /* bridge */ /* synthetic */ k E0(l lVar, v vVar, h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        return S0(lVar, vVar, aVar, hVar, y0Var);
    }

    public final b S0(l lVar, v vVar, t23.b.a aVar, h hVar, y0 y0Var) {
        if (lVar == null) {
            y(7);
            throw null;
        }
        if (aVar == null) {
            y(8);
            throw null;
        }
        if (hVar == null) {
            y(9);
            throw null;
        }
        if (y0Var == null) {
            y(10);
            throw null;
        }
        if (aVar != t23.b.a.DECLARATION && aVar != t23.b.a.SYNTHESIZED) {
            com.google.common.util.concurrent.g.a(this, "Attempt at creating a constructor that is not a declaration: \ncopy from: ", "\nnewOwner: ", lVar, "\nkind: ", aVar);
            return null;
        }
        b bVar = new b((t23.e) lVar, (b) vVar, hVar, this.I, aVar, y0Var);
        Boolean bool = this.P;
        bool.getClass();
        bVar.P = bool;
        Boolean bool2 = this.T;
        bool2.getClass();
        bVar.T = bool2;
        return bVar;
    }

    @Override // j33.a
    public final a l0(n0 n0Var, ArrayList arrayList, n0 n0Var2, p pVar) {
        q0 q0VarH;
        b bVarS0 = S0(d(), null, getKind(), getAnnotations(), getSource());
        if (n0Var == null) {
            q0VarH = null;
        } else {
            h.f168226x0.getClass();
            q0VarH = b43.h.h(bVarS0, n0Var, h.a.f168228b);
        }
        bVarS0.H0(q0VarH, this.f181728j, j0.f134944a, getTypeParameters(), gg.b.p(arrayList, f(), bVarS0), n0Var2, g(), getVisibility());
        if (pVar != null) {
            bVarS0.J0((t23.a.InterfaceC3056a) pVar.f128594a, pVar.f128595b);
        }
        return bVarS0;
    }
}
