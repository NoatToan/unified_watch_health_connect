package w23;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p43.a2;

/* JADX INFO: loaded from: classes3.dex */
public class k extends x implements t23.d {
    public final boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t23.e eVar, t23.k kVar, u23.h hVar, boolean z14, t23.b.a aVar, t23.y0 y0Var) {
        super(eVar, kVar, hVar, x33.h.f188614f, aVar, y0Var);
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
        this.I = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void y(int i14) {
        String str;
        int i15;
        if (i14 != 21 && i14 != 27) {
            switch (i14) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 21 && i14 != 27) {
            switch (i14) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i15 = 2;
                    break;
                default:
                    i15 = 3;
                    break;
            }
        } else {
            i15 = 2;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i14 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i14 != 27) {
            switch (i14) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i14) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 21 && i14 != 27) {
            switch (i14) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.x
    /* JADX INFO: renamed from: D0 */
    public final t23.v f0(t23.l lVar, t23.a0 a0Var, t23.r rVar, t23.b.a aVar) {
        return (t23.d) super.f0(lVar, a0Var, rVar, aVar);
    }

    @Override // w23.x, t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.l(this, d14);
    }

    @Override // t23.k
    public final boolean L() {
        return this.I;
    }

    @Override // w23.x
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public k E0(t23.l lVar, t23.v vVar, u23.h hVar, x33.f fVar, t23.b.a aVar, t23.y0 y0Var) {
        if (lVar == null) {
            y(23);
            throw null;
        }
        if (aVar == null) {
            y(24);
            throw null;
        }
        if (hVar == null) {
            y(25);
            throw null;
        }
        t23.b.a aVar2 = t23.b.a.DECLARATION;
        if (aVar == aVar2 || aVar == t23.b.a.SYNTHESIZED) {
            return new k((t23.e) lVar, this, hVar, this.I, aVar2, y0Var);
        }
        com.google.common.util.concurrent.g.a(this, "Attempt at creating a constructor that is not a declaration: \ncopy from: ", "\nnewOwner: ", lVar, "\nkind: ", aVar);
        return null;
    }

    @Override // w23.p, t23.l
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final t23.e d() {
        t23.e eVar = (t23.e) super.d();
        if (eVar != null) {
            return eVar;
        }
        y(17);
        throw null;
    }

    public final void P0(List list, t23.r rVar) {
        if (list == null) {
            y(13);
            throw null;
        }
        if (rVar != null) {
            Q0(list, rVar, d().q());
        } else {
            y(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void Q0(List list, t23.r rVar, List list2) {
        t23.u0 u0VarK0;
        List<t23.u0> listR0;
        if (list == null) {
            y(10);
            throw null;
        }
        if (rVar == null) {
            y(11);
            throw null;
        }
        if (list2 == null) {
            y(12);
            throw null;
        }
        t23.e eVarD = d();
        if (eVarD.l()) {
            t23.l lVarD = eVarD.d();
            if (lVarD instanceof t23.e) {
                u0VarK0 = ((t23.e) lVarD).k0();
            } else {
                u0VarK0 = null;
            }
        } else {
            u0VarK0 = null;
        }
        t23.e eVarD2 = d();
        if (eVarD2.r0().isEmpty()) {
            listR0 = Collections.EMPTY_LIST;
            if (listR0 == null) {
                y(16);
                throw null;
            }
        } else {
            listR0 = eVarD2.r0();
            if (listR0 == null) {
                y(15);
                throw null;
            }
        }
        H0(null, u0VarK0, listR0, list2, list, null, t23.a0.FINAL, rVar);
    }

    @Override // w23.x, w23.p, w23.o, t23.l
    public final t23.d a() {
        t23.d dVar = (t23.d) super.a();
        if (dVar != null) {
            return dVar;
        }
        y(19);
        throw null;
    }

    @Override // w23.x, t23.v, t23.a1
    public final t23.d b(a2 a2Var) {
        if (a2Var != null) {
            return (t23.d) super.b(a2Var);
        }
        y(20);
        throw null;
    }

    @Override // t23.k
    public final t23.e e0() {
        t23.e eVarD = d();
        if (eVarD != null) {
            return eVarD;
        }
        y(18);
        throw null;
    }

    @Override // w23.x, t23.b
    public final t23.b f0(t23.e eVar, t23.a0 a0Var, t23.p pVar, t23.b.a aVar) {
        return (t23.d) super.f0(eVar, a0Var, pVar, aVar);
    }

    @Override // w23.x, t23.b
    public final void i0(Collection<? extends t23.b> collection) {
        if (collection != null) {
            return;
        }
        y(22);
        throw null;
    }

    @Override // w23.x, t23.b, t23.a
    public final Collection<? extends t23.v> o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        y(21);
        throw null;
    }
}
