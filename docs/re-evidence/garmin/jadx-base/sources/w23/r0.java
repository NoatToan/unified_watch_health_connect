package w23;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p43.a2;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class r0 extends x implements t23.x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t23.l lVar, t23.x0 x0Var, u23.h hVar, x33.f fVar, t23.b.a aVar, t23.y0 y0Var) {
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
        if (y0Var != null) {
        } else {
            y(4);
            throw null;
        }
    }

    public static r0 O0(t23.l lVar, u23.h hVar, x33.f fVar, t23.b.a aVar, t23.y0 y0Var) {
        if (lVar == null) {
            y(5);
            throw null;
        }
        if (hVar == null) {
            y(6);
            throw null;
        }
        if (fVar == null) {
            y(7);
            throw null;
        }
        if (aVar == null) {
            y(8);
            throw null;
        }
        if (y0Var != null) {
            return new r0(lVar, null, hVar, fVar, aVar, y0Var);
        }
        y(9);
        throw null;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 13 || i14 == 18 || i14 == 23 || i14 == 24 || i14 == 29 || i14 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 13 || i14 == 18 || i14 == 23 || i14 == 24 || i14 == 29 || i14 == 30) ? 2 : 3];
        switch (i14) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i14 == 13 || i14 == 18 || i14 == 23) {
            objArr[1] = "initialize";
        } else if (i14 == 24) {
            objArr[1] = "getOriginal";
        } else if (i14 == 29) {
            objArr[1] = "copy";
        } else if (i14 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i14) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 13 && i14 != 18 && i14 != 23 && i14 != 24 && i14 != 29 && i14 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.x
    public x E0(t23.l lVar, t23.v vVar, u23.h hVar, x33.f fVar, t23.b.a aVar, t23.y0 y0Var) {
        if (lVar == null) {
            y(25);
            throw null;
        }
        if (aVar == null) {
            y(26);
            throw null;
        }
        if (hVar == null) {
            y(27);
            throw null;
        }
        t23.x0 x0Var = (t23.x0) vVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new r0(lVar, x0Var, hVar, fVar, aVar, y0Var);
    }

    @Override // w23.x, t23.b
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public t23.x0 f0(t23.l lVar, t23.a0 a0Var, t23.r rVar, t23.b.a aVar) {
        return (t23.x0) super.f0(lVar, a0Var, rVar, aVar);
    }

    @Override // w23.x, w23.p, w23.o, t23.l
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final t23.x0 a() {
        t23.x0 x0Var = (t23.x0) super.a();
        if (x0Var != null) {
            return x0Var;
        }
        y(24);
        throw null;
    }

    @Override // w23.x
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final r0 H0(t23.u0 u0Var, t23.u0 u0Var2, List<t23.u0> list, List<? extends d1> list2, List<j1> list3, p43.n0 n0Var, t23.a0 a0Var, t23.r rVar) {
        if (list == null) {
            y(14);
            throw null;
        }
        if (list2 == null) {
            y(15);
            throw null;
        }
        if (list3 == null) {
            y(16);
            throw null;
        }
        if (rVar != null) {
            return R0(u0Var, u0Var2, list, list2, list3, n0Var, a0Var, rVar, null);
        }
        y(17);
        throw null;
    }

    public r0 R0(t23.u0 u0Var, t23.u0 u0Var2, List<t23.u0> list, List<? extends d1> list2, List<j1> list3, p43.n0 n0Var, t23.a0 a0Var, t23.r rVar, Map<? extends t23.a.InterfaceC3056a<?>, ?> map) {
        if (list == null) {
            y(19);
            throw null;
        }
        if (list2 == null) {
            y(20);
            throw null;
        }
        if (list3 == null) {
            y(21);
            throw null;
        }
        if (rVar == null) {
            y(22);
            throw null;
        }
        super.H0(u0Var, u0Var2, list, list2, list3, n0Var, a0Var, rVar);
        if (map != null && !map.isEmpty()) {
            this.F = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // w23.x, t23.v
    public t23.v.a<? extends t23.x0> j0() {
        return I0(a2.f135794b);
    }
}
