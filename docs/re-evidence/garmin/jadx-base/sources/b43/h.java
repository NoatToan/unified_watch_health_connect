package b43;

import java.util.Collections;
import java.util.List;
import p43.g2;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.v0;
import p43.v1;
import t23.r0;
import t23.u0;
import t23.y0;
import w23.o0;
import w23.p0;
import w23.q0;
import w23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    public static class a extends w23.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t23.e eVar, y0 y0Var, boolean z14) {
            t23.r rVar;
            super(eVar, null, u23.h.a.f168228b, true, t23.b.a.DECLARATION, y0Var);
            if (eVar == null) {
                y(0);
                throw null;
            }
            if (y0Var == null) {
                y(1);
                throw null;
            }
            u23.h.f168226x0.getClass();
            List list = Collections.EMPTY_LIST;
            int i14 = i.f15728a;
            t23.f kind = eVar.getKind();
            if (kind == t23.f.ENUM_CLASS || kind.a()) {
                rVar = t23.q.f162046a;
                if (rVar == null) {
                    i.a(49);
                    throw null;
                }
            } else if (i.o(eVar)) {
                if (z14) {
                    rVar = t23.q.f162048c;
                    if (rVar == null) {
                        i.a(50);
                        throw null;
                    }
                } else {
                    rVar = t23.q.f162046a;
                    if (rVar == null) {
                        i.a(51);
                        throw null;
                    }
                }
            } else if (i.j(eVar)) {
                rVar = t23.q.f162057l;
                if (rVar == null) {
                    i.a(52);
                    throw null;
                }
            } else {
                rVar = t23.q.f162050e;
                if (rVar == null) {
                    i.a(53);
                    throw null;
                }
            }
            P0(list, rVar);
        }

        public static /* synthetic */ void y(int i14) {
            Object[] objArr = new Object[3];
            if (i14 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static /* synthetic */ void a(int i14) {
        String str = (i14 == 12 || i14 == 23 || i14 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 12 || i14 == 23 || i14 == 25) ? 2 : 3];
        switch (i14) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i14 == 12) {
            objArr[1] = "createSetter";
        } else if (i14 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i14 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i14) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 12 && i14 != 23 && i14 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static q0 b(t23.a aVar, n0 n0Var, x33.f fVar, u23.h hVar, int i14) {
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (n0Var == null) {
            return null;
        }
        j43.c cVar = new j43.c(aVar, n0Var, fVar, null);
        d53.k kVar = x33.g.f188607a;
        return new q0(aVar, cVar, hVar, x33.f.e(x33.g.f188608b + '_' + i14));
    }

    public static o0 c(u23.h hVar, r0 r0Var) {
        if (hVar != null) {
            return i(r0Var, hVar, true, r0Var.getSource());
        }
        a(14);
        throw null;
    }

    public static p0 d(r0 r0Var, u23.h hVar, u23.h hVar2) {
        if (hVar == null) {
            a(1);
            throw null;
        }
        if (hVar2 == null) {
            a(2);
            throw null;
        }
        y0 source = r0Var.getSource();
        if (source != null) {
            return j(r0Var, hVar, hVar2, true, r0Var.getVisibility(), source);
        }
        a(6);
        throw null;
    }

    public static w23.n0 e(t23.e eVar) {
        if (eVar == null) {
            a(26);
            throw null;
        }
        t23.c0 c0VarC = i.c(eVar);
        t23.b0<b0> b0Var = c0.f15720a;
        c0VarC.getClass();
        b0 b0Var2 = (b0) c0VarC.A(c0.f15720a);
        if (b0Var2 == null) {
            b0Var2 = c.f15719a;
        }
        t23.e eVarA = b0Var2.a(c0VarC);
        if (eVarA == null) {
            return null;
        }
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        t23.a0 a0Var = t23.a0.FINAL;
        t23.q.h hVar = t23.q.f162050e;
        x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.f.f105850b;
        t23.b.a aVar = t23.b.a.SYNTHESIZED;
        w23.n0 n0VarG0 = w23.n0.G0(eVar, c3153a, a0Var, hVar, false, fVar, aVar, eVar.getSource());
        o0 o0Var = new o0(n0VarG0, c3153a, a0Var, hVar, false, false, false, aVar, null, eVar.getSource());
        n0VarG0.I0(o0Var, null, null, null);
        k1.f135863b.getClass();
        k1 k1Var = k1.f135864c;
        m1 m1VarH = eVarA.h();
        List listSingletonList = Collections.singletonList(new v1(eVar.p()));
        p43.q0 q0Var = p43.q0.f135904a;
        k1Var.getClass();
        m1VarH.getClass();
        listSingletonList.getClass();
        v0 v0VarE = p43.q0.e(k1Var, m1VarH, listSingletonList, false, null);
        List list = Collections.EMPTY_LIST;
        n0VarG0.K0(v0VarE, list, null, null, list);
        o0Var.G0(n0VarG0.getReturnType());
        return n0VarG0;
    }

    public static w23.r0 f(t23.e eVar) {
        if (eVar == null) {
            a(24);
            throw null;
        }
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        w23.r0 r0VarO0 = w23.r0.O0(eVar, c3153a, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105851c, t23.b.a.SYNTHESIZED, eVar.getSource());
        x0 x0Var = new x0(r0VarO0, null, 0, c3153a, x33.f.e("value"), f43.e.e(eVar).v(), false, false, false, null, eVar.getSource());
        List<u0> list = Collections.EMPTY_LIST;
        return r0VarO0.H0(null, null, list, list, Collections.singletonList(x0Var), eVar.p(), t23.a0.FINAL, t23.q.f162050e);
    }

    public static w23.r0 g(t23.e eVar) {
        if (eVar == null) {
            a(22);
            throw null;
        }
        u23.h.f168226x0.getClass();
        w23.r0 r0VarO0 = w23.r0.O0(eVar, u23.h.a.f168228b, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105849a, t23.b.a.SYNTHESIZED, eVar.getSource());
        List<u0> list = Collections.EMPTY_LIST;
        return r0VarO0.H0(null, null, list, list, list, f43.e.e(eVar).h(g2.INVARIANT, eVar.p()), t23.a0.FINAL, t23.q.f162050e);
    }

    public static q0 h(t23.a aVar, n0 n0Var, u23.h hVar) {
        if (hVar == null) {
            a(31);
            throw null;
        }
        if (n0Var == null) {
            return null;
        }
        return new q0(aVar, new j43.d(aVar, n0Var, null), hVar);
    }

    public static o0 i(r0 r0Var, u23.h hVar, boolean z14, y0 y0Var) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (y0Var != null) {
            return new o0(r0Var, hVar, r0Var.g(), r0Var.getVisibility(), z14, false, false, t23.b.a.DECLARATION, null, y0Var);
        }
        a(19);
        throw null;
    }

    public static p0 j(r0 r0Var, u23.h hVar, u23.h hVar2, boolean z14, t23.r rVar, y0 y0Var) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (rVar == null) {
            a(10);
            throw null;
        }
        if (y0Var == null) {
            a(11);
            throw null;
        }
        p0 p0Var = new p0(r0Var, hVar, r0Var.g(), rVar, z14, false, false, t23.b.a.DECLARATION, null, y0Var);
        p0Var.f181696m = p0.F0(p0Var, r0Var.getType(), hVar2);
        return p0Var;
    }

    public static boolean k(t23.v vVar) {
        if (vVar.getKind() != t23.b.a.SYNTHESIZED) {
            return false;
        }
        t23.l lVarD = vVar.d();
        int i14 = i.f15728a;
        return i.l(lVarD, t23.f.ENUM_CLASS);
    }
}
