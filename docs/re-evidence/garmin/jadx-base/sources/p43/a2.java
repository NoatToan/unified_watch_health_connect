package p43;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a2 implements t43.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a2 f135794b = e(w1.f135938a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f135795a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135796a;

        static {
            int[] iArr = new int[c.values().length];
            f135796a = iArr;
            try {
                iArr[c.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f135796a[c.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f135796a[c.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public enum c {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public a2(w1 w1Var) {
        if (w1Var != null) {
            this.f135795a = w1Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        if (i14 != 1 && i14 != 2 && i14 != 8 && i14 != 34 && i14 != 37) {
            switch (i14) {
                default:
                    switch (i14) {
                        default:
                            switch (i14) {
                                default:
                                    switch (i14) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 1 && i14 != 2 && i14 != 8 && i14 != 34 && i14 != 37) {
            switch (i14) {
                case 11:
                case 12:
                case 13:
                    i15 = 2;
                    break;
                default:
                    switch (i14) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i15 = 2;
                            break;
                        default:
                            switch (i14) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i15 = 2;
                                    break;
                                default:
                                    switch (i14) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i15 = 2;
                                            break;
                                        default:
                                            i15 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i15 = 2;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = CoreConstants.CONTEXT_SCOPE_VALUE;
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i14 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i14 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i14 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i14 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i14 != 37) {
            switch (i14) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i14) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i14) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i14) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i14) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 1 && i14 != 2 && i14 != 8 && i14 != 34 && i14 != 37) {
            switch (i14) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i14) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i14) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i14) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static g2 b(g2 g2Var, g2 g2Var2) {
        if (g2Var == null) {
            a(38);
            throw null;
        }
        if (g2Var2 == null) {
            a(39);
            throw null;
        }
        g2 g2Var3 = g2.INVARIANT;
        if (g2Var == g2Var3) {
            if (g2Var2 != null) {
                return g2Var2;
            }
            a(40);
            throw null;
        }
        if (g2Var2 == g2Var3) {
            if (g2Var != null) {
                return g2Var;
            }
            a(41);
            throw null;
        }
        if (g2Var == g2Var2) {
            if (g2Var2 != null) {
                return g2Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + g2Var + "' and projection kind '" + g2Var2 + "' cannot be combined");
    }

    public static c c(g2 g2Var, g2 g2Var2) {
        g2 g2Var3 = g2.IN_VARIANCE;
        if (g2Var == g2Var3 && g2Var2 == g2.OUT_VARIANCE) {
            return c.OUT_IN_IN_POSITION;
        }
        return (g2Var == g2.OUT_VARIANCE && g2Var2 == g2Var3) ? c.IN_IN_OUT_POSITION : c.NO_CONFLICT;
    }

    public static a2 d(n0 n0Var) {
        if (n0Var == null) {
            a(6);
            throw null;
        }
        return e(o1.f135897b.a(n0Var.F0(), n0Var.D0()));
    }

    public static a2 e(w1 w1Var) {
        if (w1Var != null) {
            return new a2(w1Var);
        }
        a(0);
        throw null;
    }

    public static a2 f(w1 w1Var, w1 w1Var2) {
        p005kotlin.jvm.internal.j jVar = null;
        if (w1Var == null) {
            a(3);
            throw null;
        }
        if (w1Var2 == null) {
            a(4);
            throw null;
        }
        a0.f135790d.getClass();
        w1Var.getClass();
        w1Var2.getClass();
        if (w1Var.e()) {
            w1Var = w1Var2;
        } else if (!w1Var2.e()) {
            w1Var = new a0(w1Var, w1Var2, jVar);
        }
        return e(w1Var);
    }

    public static String i(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th3) {
            if (w13.b.m(th3)) {
                throw th3;
            }
            return "[Exception while computing toString(): " + th3 + "]";
        }
    }

    public final w1 g() {
        w1 w1Var = this.f135795a;
        if (w1Var != null) {
            return w1Var;
        }
        a(8);
        throw null;
    }

    public final n0 h(g2 g2Var, n0 n0Var) {
        if (n0Var == null) {
            a(9);
            throw null;
        }
        if (g2Var == null) {
            a(10);
            throw null;
        }
        if (this.f135795a.e()) {
            return n0Var;
        }
        try {
            n0 type = k(new v1(g2Var, n0Var), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (b e4) {
            return r43.l.c(r43.k.f150372k, e4.getMessage());
        }
    }

    public final n0 j(g2 g2Var, n0 n0Var) {
        if (n0Var == null) {
            a(14);
            throw null;
        }
        if (g2Var == null) {
            a(15);
            throw null;
        }
        t1 v1Var = new v1(g2Var, g().f(g2Var, n0Var));
        w1 w1Var = this.f135795a;
        if (!w1Var.e()) {
            try {
                v1Var = k(v1Var, null, 0);
            } catch (b unused) {
                v1Var = null;
            }
        }
        if (w1Var.a() || w1Var.b()) {
            boolean zB = w1Var.b();
            if (v1Var == null) {
                v1Var = null;
            } else if (!v1Var.b()) {
                n0 type = v1Var.getType();
                type.getClass();
                if (d2.c(type, v43.b.f175699a)) {
                    g2 g2VarA = v1Var.a();
                    g2VarA.getClass();
                    if (g2VarA == g2.OUT_VARIANCE) {
                        v1Var = new v1(g2VarA, v43.c.a(type).f175698b);
                    } else if (zB) {
                        v1Var = new v1(g2VarA, v43.c.a(type).f175697a);
                    } else {
                        a2 a2VarE = e(new v43.d());
                        if (!a2VarE.f135795a.e()) {
                            try {
                                v1Var = a2VarE.k(v1Var, null, 0);
                            } catch (b unused2) {
                                v1Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (v1Var == null) {
            return null;
        }
        return v1Var.getType();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x0208  */
    /* JADX WARN: Code duplicated, block: B:108:0x021e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:111:0x0229  */
    /* JADX WARN: Code duplicated, block: B:113:0x022c  */
    /* JADX WARN: Code duplicated, block: B:114:0x022f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0232  */
    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0272  */
    /* JADX WARN: Code duplicated, block: B:139:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final t1 k(t1 t1Var, t23.d1 d1Var, int i14) throws b {
        n0 type;
        g2 g2VarA;
        f2 f2VarI0;
        p43.a aVar;
        v0 v0Var;
        List<t23.d1> parameters;
        List<t1> listD0;
        ArrayList arrayList;
        boolean z14;
        n0 n0VarC;
        t23.d1 d1Var2;
        t1 t1Var2;
        t1 t1VarK;
        int i15;
        a2 a2Var;
        c cVarC;
        u23.a aVarI0;
        u uVar;
        n0 n0VarJ;
        u23.h hVarC;
        int i16;
        n0 n0VarJ2 = null;
        if (t1Var == null) {
            a(18);
            throw null;
        }
        w1 w1Var = this.f135795a;
        if (i14 > 100) {
            androidx.core.view.j.y("Recursion too deep. Most likely infinite loop while substituting ", i(t1Var), "; substitution: ", i(w1Var));
            return null;
        }
        if (!t1Var.b()) {
            n0 type2 = t1Var.getType();
            if (type2 instanceof e2) {
                e2 e2Var = (e2) type2;
                f2 origin = e2Var.getOrigin();
                n0 n0VarN = e2Var.N();
                t1 t1VarK2 = k(new v1(t1Var.a(), origin), d1Var, i14 + 1);
                return t1VarK2.b() ? t1VarK2 : new v1(t1VarK2.a(), og.a.e0(t1VarK2.getType().I0(), j(t1Var.a(), n0VarN)));
            }
            type2.getClass();
            if (!(type2.I0() instanceof b0) && !(type2.I0() instanceof m33.j)) {
                t1 t1VarD = w1Var.d(type2);
                if (t1VarD == null) {
                    t1VarD = null;
                } else if (type2.getAnnotations().I3(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105900z)) {
                    m1 m1VarF0 = t1VarD.getType().F0();
                    if (m1VarF0 instanceof q43.m) {
                        t1 t1Var3 = ((q43.m) m1VarF0).f142801a;
                        g2 g2VarA2 = t1Var3.a();
                        c cVarC2 = c(t1Var.a(), g2VarA2);
                        c cVar = c.OUT_IN_IN_POSITION;
                        if (cVarC2 == cVar) {
                            t1VarD = new v1(t1Var3.getType());
                        } else if (d1Var != null && c(d1Var.m(), g2VarA2) == cVar) {
                            t1VarD = new v1(t1Var3.getType());
                        }
                    }
                }
                g2 g2VarA3 = t1Var.a();
                if (t1VarD == null && (type2.I0() instanceof f0)) {
                    u23.a aVarI1 = type2.I0();
                    u uVar2 = aVarI1 instanceof u ? (u) aVarI1 : null;
                    if (!(uVar2 != null ? uVar2.T() : false)) {
                        f0 f0Var = (f0) type2.I0();
                        v0 v0Var2 = f0Var.f135830c;
                        v0 v0Var3 = f0Var.f135829b;
                        int i17 = i14 + 1;
                        t1 t1VarK3 = k(new v1(g2VarA3, v0Var3), d1Var, i17);
                        t1 t1VarK4 = k(new v1(g2VarA3, v0Var2), d1Var, i17);
                        g2 g2VarA4 = t1VarK3.a();
                        if (t1VarK3.getType() != v0Var3 || t1VarK4.getType() != v0Var2) {
                            return new v1(g2VarA4, q0.b(y1.a(t1VarK3.getType()), y1.a(t1VarK4.getType())));
                        }
                    } else if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.F(type2)) {
                        if (t1VarD != null) {
                            cVarC = c(g2VarA3, t1VarD.a());
                            if (!(type2.F0() instanceof c43.b)) {
                                i16 = a.f135796a[cVarC.ordinal()];
                                if (i16 != 1) {
                                    throw new b("Out-projection in in-position");
                                }
                                if (i16 == 2) {
                                    return new v1(g2.OUT_VARIANCE, type2.F0().e().p());
                                }
                            }
                            aVarI0 = type2.I0();
                            if (aVarI0 instanceof u) {
                                uVar = (u) aVarI0;
                            } else {
                                uVar = null;
                            }
                            if (uVar != null) {
                                uVar = null;
                            } else {
                                uVar = null;
                            }
                            if (t1VarD.b()) {
                                return t1VarD;
                            }
                            if (uVar != null) {
                                n0VarJ = uVar.y(t1VarD.getType());
                            } else {
                                n0VarJ = d2.j(t1VarD.getType(), type2.G0());
                            }
                            if (!type2.getAnnotations().isEmpty()) {
                                hVarC = w1Var.c(type2.getAnnotations());
                                if (hVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (hVarC.I3(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105900z)) {
                                    hVarC = new u23.o(hVarC, new z1());
                                }
                                n0VarJ = o72.t.X(n0VarJ, new u23.n(n0VarJ.getAnnotations(), hVarC));
                            }
                            if (cVarC == c.NO_CONFLICT) {
                                g2VarA3 = b(g2VarA3, t1VarD.a());
                            }
                            return new v1(g2VarA3, n0VarJ);
                        }
                        type = t1Var.getType();
                        g2VarA = t1Var.a();
                        if (!(type.F0().t() instanceof t23.d1)) {
                            f2VarI0 = type.I0();
                            if (f2VarI0 instanceof p43.a) {
                                aVar = (p43.a) f2VarI0;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                v0Var = aVar.f135789c;
                            } else {
                                v0Var = null;
                            }
                            if (v0Var != null) {
                                if (w1Var instanceof i0) {
                                    a2Var = this;
                                } else {
                                    a2Var = this;
                                }
                                n0VarJ2 = a2Var.j(g2.INVARIANT, v0Var);
                            }
                            parameters = type.F0().getParameters();
                            listD0 = type.D0();
                            arrayList = new ArrayList(parameters.size());
                            z14 = false;
                            for (int i18 = 0; i18 < parameters.size(); i18++) {
                                d1Var2 = parameters.get(i18);
                                t1Var2 = listD0.get(i18);
                                t1VarK = k(t1Var2, d1Var2, i14 + 1);
                                i15 = a.f135796a[c(d1Var2.m(), t1VarK.a()).ordinal()];
                                if (i15 != 1) {
                                    t1VarK = d2.l(d1Var2);
                                } else {
                                    t1VarK = d2.l(d1Var2);
                                }
                                if (t1VarK != t1Var2) {
                                    z14 = true;
                                }
                                arrayList.add(t1VarK);
                            }
                            if (z14) {
                                listD0 = arrayList;
                            }
                            u23.h hVarC2 = w1Var.c(type.getAnnotations());
                            listD0.getClass();
                            hVarC2.getClass();
                            n0VarC = y1.c(type, listD0, hVarC2, 4);
                            if (n0VarC instanceof v0) {
                                n0VarC = z0.c((v0) n0VarC, (v0) n0VarJ2);
                            }
                            return new v1(g2VarA, n0VarC);
                        }
                    }
                } else if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.F(type2) && !o72.t.R(type2)) {
                    if (t1VarD != null) {
                        cVarC = c(g2VarA3, t1VarD.a());
                        if (!(type2.F0() instanceof c43.b)) {
                            i16 = a.f135796a[cVarC.ordinal()];
                            if (i16 != 1) {
                                throw new b("Out-projection in in-position");
                            }
                            if (i16 == 2) {
                                return new v1(g2.OUT_VARIANCE, type2.F0().e().p());
                            }
                        }
                        aVarI0 = type2.I0();
                        if (aVarI0 instanceof u) {
                            uVar = (u) aVarI0;
                        } else {
                            uVar = null;
                        }
                        if (uVar != null || !uVar.T()) {
                            uVar = null;
                        }
                        if (t1VarD.b()) {
                            return t1VarD;
                        }
                        if (uVar != null) {
                            n0VarJ = uVar.y(t1VarD.getType());
                        } else {
                            n0VarJ = d2.j(t1VarD.getType(), type2.G0());
                        }
                        if (!type2.getAnnotations().isEmpty()) {
                            hVarC = w1Var.c(type2.getAnnotations());
                            if (hVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (hVarC.I3(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105900z)) {
                                hVarC = new u23.o(hVarC, new z1());
                            }
                            n0VarJ = o72.t.X(n0VarJ, new u23.n(n0VarJ.getAnnotations(), hVarC));
                        }
                        if (cVarC == c.NO_CONFLICT) {
                            g2VarA3 = b(g2VarA3, t1VarD.a());
                        }
                        return new v1(g2VarA3, n0VarJ);
                    }
                    type = t1Var.getType();
                    g2VarA = t1Var.a();
                    if (!(type.F0().t() instanceof t23.d1)) {
                        f2VarI0 = type.I0();
                        if (f2VarI0 instanceof p43.a) {
                            aVar = (p43.a) f2VarI0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            v0Var = aVar.f135789c;
                        } else {
                            v0Var = null;
                        }
                        if (v0Var != null) {
                            if ((w1Var instanceof i0) || !w1Var.b()) {
                                a2Var = this;
                            } else {
                                i0 i0Var = (i0) w1Var;
                                a2Var = new a2(new i0(i0Var.f135856b, i0Var.f135857c, false));
                            }
                            n0VarJ2 = a2Var.j(g2.INVARIANT, v0Var);
                        }
                        parameters = type.F0().getParameters();
                        listD0 = type.D0();
                        arrayList = new ArrayList(parameters.size());
                        z14 = false;
                        while (i18 < parameters.size()) {
                            d1Var2 = parameters.get(i18);
                            t1Var2 = listD0.get(i18);
                            t1VarK = k(t1Var2, d1Var2, i14 + 1);
                            i15 = a.f135796a[c(d1Var2.m(), t1VarK.a()).ordinal()];
                            if (i15 != 1 || i15 == 2) {
                                t1VarK = d2.l(d1Var2);
                            } else if (i15 == 3) {
                                g2 g2VarM = d1Var2.m();
                                g2 g2Var = g2.INVARIANT;
                                if (g2VarM != g2Var && !t1VarK.b()) {
                                    t1VarK = new v1(g2Var, t1VarK.getType());
                                }
                            }
                            if (t1VarK != t1Var2) {
                                z14 = true;
                            }
                            arrayList.add(t1VarK);
                        }
                        if (z14) {
                            listD0 = arrayList;
                        }
                        u23.h hVarC3 = w1Var.c(type.getAnnotations());
                        listD0.getClass();
                        hVarC3.getClass();
                        n0VarC = y1.c(type, listD0, hVarC3, 4);
                        if ((n0VarC instanceof v0) && (n0VarJ2 instanceof v0)) {
                            n0VarC = z0.c((v0) n0VarC, (v0) n0VarJ2);
                        }
                        return new v1(g2VarA, n0VarC);
                    }
                }
            }
        }
        return t1Var;
    }
}
