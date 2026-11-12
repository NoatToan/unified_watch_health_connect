package p43;

import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r43.i f135814a = r43.l.c(r43.k.f150373l, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r43.i f135815b = r43.l.c(r43.k.f150370i, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f135816c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f135817d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f135818b;

        public a(String str) {
            this.f135818b = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        public static /* synthetic */ void R0(int i14) {
            String str = (i14 == 1 || i14 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i14 == 1 || i14 == 4) ? 2 : 3];
            if (i14 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i14 == 2) {
                objArr[0] = "delegate";
            } else if (i14 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i14 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i14 == 1) {
                objArr[1] = "toString";
            } else if (i14 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i14 == 3) {
                    objArr[2] = "refine";
                } else if (i14 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i14 != 1 && i14 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p43.y, p43.n0
        /* JADX INFO: renamed from: H0 */
        public final n0 K0(q43.f fVar) {
            if (fVar != null) {
                return this;
            }
            R0(3);
            throw null;
        }

        @Override // p43.v0, p43.f2
        public final /* bridge */ /* synthetic */ f2 J0(boolean z14) {
            J0(z14);
            throw null;
        }

        @Override // p43.y, p43.f2
        /* JADX INFO: renamed from: K0 */
        public final f2 H0(q43.f fVar) {
            if (fVar != null) {
                return this;
            }
            R0(3);
            throw null;
        }

        @Override // p43.v0, p43.f2
        public final /* bridge */ /* synthetic */ f2 L0(k1 k1Var) {
            L0(k1Var);
            throw null;
        }

        @Override // p43.v0
        /* JADX INFO: renamed from: M0 */
        public final v0 J0(boolean z14) {
            throw new IllegalStateException(this.f135818b);
        }

        @Override // p43.v0
        /* JADX INFO: renamed from: N0 */
        public final v0 L0(k1 k1Var) {
            if (k1Var != null) {
                throw new IllegalStateException(this.f135818b);
            }
            R0(0);
            throw null;
        }

        @Override // p43.y
        public final v0 O0() {
            throw new IllegalStateException(this.f135818b);
        }

        @Override // p43.y
        /* JADX INFO: renamed from: P0 */
        public final v0 H0(q43.f fVar) {
            if (fVar != null) {
                return this;
            }
            R0(3);
            throw null;
        }

        @Override // p43.y
        public final y Q0(v0 v0Var) {
            throw new IllegalStateException(this.f135818b);
        }

        @Override // p43.v0
        public final String toString() {
            String str = this.f135818b;
            if (str != null) {
                return str;
            }
            R0(1);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        if (i14 != 4 && i14 != 9 && i14 != 11 && i14 != 15 && i14 != 17 && i14 != 19 && i14 != 26 && i14 != 35 && i14 != 48 && i14 != 53 && i14 != 6 && i14 != 7) {
            switch (i14) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 4 && i14 != 9 && i14 != 11 && i14 != 15 && i14 != 17 && i14 != 19 && i14 != 26 && i14 != 35 && i14 != 48 && i14 != 53 && i14 != 6 && i14 != 7) {
            switch (i14) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i14 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i14 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i14 == 11 || i14 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i14 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i14 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i14 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i14 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i14 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i14 != 53) {
            if (i14 != 6 && i14 != 7) {
                switch (i14) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i14) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 4 && i14 != 9 && i14 != 11 && i14 != 15 && i14 != 17 && i14 != 19 && i14 != 26 && i14 != 35 && i14 != 48 && i14 != 53 && i14 != 6 && i14 != 7) {
            switch (i14) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(n0 n0Var) {
        if (n0Var == null) {
            a(28);
            throw null;
        }
        if (n0Var.G0()) {
            return true;
        }
        return (n0Var.I0() instanceof f0) && b(((f0) n0Var.I0()).f135830c);
    }

    public static boolean c(n0 n0Var, e23.l<f2, Boolean> lVar) {
        if (lVar != null) {
            return d(n0Var, lVar, null);
        }
        a(43);
        throw null;
    }

    public static boolean d(n0 n0Var, e23.l<f2, Boolean> lVar, z43.j<n0> jVar) {
        if (lVar == null) {
            a(44);
            throw null;
        }
        if (n0Var == null) {
            return false;
        }
        f2 f2VarI0 = n0Var.I0();
        if (o(n0Var)) {
            return lVar.invoke(f2VarI0).booleanValue();
        }
        if (jVar != null && jVar.contains(n0Var)) {
            return false;
        }
        if (lVar.invoke(f2VarI0).booleanValue()) {
            return true;
        }
        if (jVar == null) {
            z43.j.f202430c.getClass();
            jVar = z43.j.b.a();
        }
        jVar.add(n0Var);
        f0 f0Var = f2VarI0 instanceof f0 ? (f0) f2VarI0 : null;
        if (f0Var != null && (d(f0Var.f135829b, lVar, jVar) || d(f0Var.f135830c, lVar, jVar))) {
            return true;
        }
        if ((f2VarI0 instanceof w) && d(((w) f2VarI0).f135931b, lVar, jVar)) {
            return true;
        }
        m1 m1VarF0 = n0Var.F0();
        if (m1VarF0 instanceof m0) {
            Iterator<n0> it = ((m0) m1VarF0).f135886b.iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, jVar)) {
                    return true;
                }
            }
            return false;
        }
        for (t1 t1Var : n0Var.D0()) {
            if (!t1Var.b() && d(t1Var.getType(), lVar, jVar)) {
                return true;
            }
        }
        return false;
    }

    public static List<t1> e(List<t23.d1> list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<t23.d1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new v1(it.next().p()));
        }
        List<t1> listB1 = p13.h0.b1(arrayList);
        if (listB1 != null) {
            return listB1;
        }
        a(17);
        throw null;
    }

    public static boolean f(n0 n0Var) {
        if (n0Var == null) {
            a(29);
            throw null;
        }
        if (n0Var.F0().t() instanceof t23.e) {
            return false;
        }
        a2 a2VarD = a2.d(n0Var);
        Collection<n0> collectionB = n0Var.F0().b();
        ArrayList arrayList = new ArrayList(collectionB.size());
        for (n0 n0Var2 : collectionB) {
            if (n0Var2 == null) {
                a(21);
                throw null;
            }
            n0 n0VarJ = a2VarD.j(g2.INVARIANT, n0Var2);
            n0 n0VarJ2 = n0VarJ != null ? j(n0VarJ, n0Var.G0()) : null;
            if (n0VarJ2 != null) {
                arrayList.add(n0VarJ2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (g((n0) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(n0 n0Var) {
        if (n0Var == null) {
            a(27);
            throw null;
        }
        if (n0Var.G0()) {
            return true;
        }
        if ((n0Var.I0() instanceof f0) && g(((f0) n0Var.I0()).f135830c)) {
            return true;
        }
        if (n0Var.I0() instanceof w) {
            return false;
        }
        if (h(n0Var)) {
            return f(n0Var);
        }
        if (n0Var instanceof e) {
            t23.d1 d1VarC = ((e) n0Var).f135819b.c();
            return d1VarC == null || f(d1VarC.p());
        }
        m1 m1VarF0 = n0Var.F0();
        if (!(m1VarF0 instanceof m0)) {
            return false;
        }
        Iterator<n0> it = ((m0) m1VarF0).f135886b.iterator();
        while (it.hasNext()) {
            if (g(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(n0 n0Var) {
        if (n0Var == null) {
            a(60);
            throw null;
        }
        if (n0Var != null) {
            return (n0Var.F0().t() instanceof t23.d1 ? (t23.d1) n0Var.F0().t() : null) != null || (n0Var.F0() instanceof q43.p);
        }
        a(63);
        throw null;
    }

    public static f2 i(n0 n0Var, boolean z14) {
        if (n0Var == null) {
            a(3);
            throw null;
        }
        f2 f2VarJ0 = n0Var.I0().J0(z14);
        if (f2VarJ0 != null) {
            return f2VarJ0;
        }
        a(4);
        throw null;
    }

    public static n0 j(n0 n0Var, boolean z14) {
        if (n0Var != null) {
            return z14 ? i(n0Var, true) : n0Var;
        }
        a(8);
        throw null;
    }

    public static v0 k(v0 v0Var, boolean z14) {
        if (v0Var == null) {
            a(5);
            throw null;
        }
        if (!z14) {
            return v0Var;
        }
        v0 v0VarJ0 = v0Var.J0(true);
        if (v0VarJ0 != null) {
            return v0VarJ0;
        }
        a(6);
        throw null;
    }

    public static c1 l(t23.d1 d1Var) {
        if (d1Var != null) {
            return new c1(d1Var);
        }
        a(45);
        throw null;
    }

    public static u1 m(t23.d1 d1Var, d0 d0Var) {
        if (d1Var != null) {
            return d0Var.b() == c2.SUPERTYPE ? new v1(oc.b.J(d1Var)) : new c1(d1Var);
        }
        a(46);
        throw null;
    }

    public static v0 n(m1 m1Var, i43.l lVar, e23.l<q43.f, v0> lVar2) {
        if (m1Var == null) {
            a(12);
            throw null;
        }
        if (lVar == null) {
            a(13);
            throw null;
        }
        List<t1> listE = e(m1Var.getParameters());
        k1.f135863b.getClass();
        return q0.f(k1.f135864c, m1Var, listE, false, lVar, lVar2);
    }

    public static boolean o(n0 n0Var) {
        if (n0Var != null) {
            return n0Var == f135816c || n0Var == f135817d;
        }
        a(0);
        throw null;
    }
}
