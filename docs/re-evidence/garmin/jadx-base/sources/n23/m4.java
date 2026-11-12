package n23;

import java.lang.reflect.Method;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln23/m4;", "", "<init>", "()V", "Ljava/lang/Class;", "Lq23/h;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m4 f122535a = new m4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x33.b f122536b;

    static {
        x33.b.a aVar = x33.b.f188590d;
        x33.c cVar = new x33.c("java.lang.Void");
        aVar.getClass();
        f122536b = x33.b.a.b(cVar);
    }

    private m4() {
    }

    public static a2.e a(t23.v vVar) {
        String strA = p005kotlin.reflect.jvm.internal.impl.load.java.c.a(vVar);
        if (strA == null) {
            if (vVar instanceof t23.s0) {
                String strB = f43.e.i(vVar).getName().b();
                strB.getClass();
                strA = h33.b0.a(strB);
            } else if (vVar instanceof t23.t0) {
                String strB2 = f43.e.i(vVar).getName().b();
                strB2.getClass();
                strA = "set".concat(h33.b0.b(strB2) ? strB2.substring(2) : w52.u0.h(strB2));
            } else {
                strA = vVar.getName().b();
                strA.getClass();
            }
        }
        return new a2.e(new w33.d.b(strA, q33.b0.a(vVar, 1)));
    }

    public static c2 b(t23.r0 r0Var) {
        r0Var.getClass();
        t23.r0 r0VarA = ((t23.r0) b43.i.r(r0Var)).a();
        r0VarA.getClass();
        if (r0VarA instanceof n43.g0) {
            n43.g0 g0Var = (n43.g0) r0VarA;
            s33.o oVar = g0Var.D;
            z33.g.f<s33.o, v33.a.d> fVar = v33.a.f175425d;
            fVar.getClass();
            v33.a.d dVar = (v33.a.d) u33.f.a(oVar, fVar);
            if (dVar != null) {
                return new c2.c(r0VarA, oVar, dVar, g0Var.E, g0Var.F);
            }
        } else if (r0VarA instanceof j33.f) {
            j33.f fVar2 = (j33.f) r0VarA;
            t23.y0 source = fVar2.getSource();
            n33.a aVar = source instanceof n33.a ? (n33.a) source : null;
            z23.x xVarC = aVar != null ? aVar.c() : null;
            if (xVarC instanceof z23.z) {
                return new c2.a(((z23.z) xVarC).f202076a);
            }
            if (!(xVarC instanceof z23.c0)) {
                j.u("Incorrect resolution sequence for Java field ", r0VarA, " (source = ", xVarC);
                return null;
            }
            Method method = ((z23.c0) xVarC).f202035a;
            t23.t0 t0Var = fVar2.A;
            t23.y0 source2 = t0Var != null ? t0Var.getSource() : null;
            n33.a aVar2 = source2 instanceof n33.a ? (n33.a) source2 : null;
            z23.x xVarC2 = aVar2 != null ? aVar2.c() : null;
            z23.c0 c0Var = xVarC2 instanceof z23.c0 ? (z23.c0) xVarC2 : null;
            return new c2.b(method, c0Var != null ? c0Var.f202035a : null);
        }
        w23.o0 getter = r0VarA.getGetter();
        getter.getClass();
        a2.e eVarA = a(getter);
        t23.t0 setter = r0VarA.getSetter();
        return new c2.d(eVarA, setter != null ? a(setter) : null);
    }

    public static a2 c(t23.v vVar) {
        Method method;
        vVar.getClass();
        t23.v vVarA = ((t23.v) b43.i.r(vVar)).a();
        vVarA.getClass();
        if (!(vVarA instanceof n43.b)) {
            if (vVarA instanceof j33.e) {
                t23.y0 source = ((j33.e) vVarA).getSource();
                n33.a aVar = source instanceof n33.a ? (n33.a) source : null;
                z23.x xVarC = aVar != null ? aVar.c() : null;
                z23.c0 c0Var = xVarC instanceof z23.c0 ? (z23.c0) xVarC : null;
                if (c0Var != null && (method = c0Var.f202035a) != null) {
                    return new a2.c(method);
                }
                lc.u0.t(vVarA, "Incorrect resolution sequence for Java method ");
                return null;
            }
            if (vVarA instanceof j33.b) {
                t23.y0 source2 = ((j33.b) vVarA).getSource();
                n33.a aVar2 = source2 instanceof n33.a ? (n33.a) source2 : null;
                z23.x xVarC2 = aVar2 != null ? aVar2.c() : null;
                if (xVarC2 instanceof z23.w) {
                    return new a2.b(((z23.w) xVarC2).f202074a);
                }
                if (xVarC2 instanceof z23.t) {
                    Class<?> cls = ((z23.t) xVarC2).f202070a;
                    if (cls.isAnnotation()) {
                        return new a2.a(cls);
                    }
                }
                j.u("Incorrect resolution sequence for Java constructor ", vVarA, " (", xVarC2);
                return null;
            }
            if ((!vVarA.getName().equals(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105851c) || !b43.h.k(vVarA)) && (!vVarA.getName().equals(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105849a) || !b43.h.k(vVarA))) {
                x33.f name = vVarA.getName();
                s23.a.f156228e.getClass();
                if (!p005kotlin.jvm.internal.s.g(name, s23.a.f156229f) || !vVarA.f().isEmpty()) {
                    StringBuilder sb3 = new StringBuilder("Unknown origin of ");
                    sb3.append(vVarA);
                    kg.f.t(sb3, " (", vVarA.getClass());
                    return null;
                }
            }
            return a(vVarA);
        }
        n43.w wVar = (n43.w) vVarA;
        z33.n nVarW = wVar.w();
        if (nVarW instanceof s33.j) {
            w33.g gVar = w33.g.f181902a;
            u33.d dVarF = wVar.F();
            u33.h hVarX = wVar.X();
            gVar.getClass();
            w33.d.b bVarC = w33.g.c((s33.j) nVarW, dVarF, hVarX);
            if (bVarC != null) {
                return new a2.e(bVarC);
            }
        }
        if (nVarW instanceof s33.e) {
            w33.g gVar2 = w33.g.f181902a;
            u33.d dVarF2 = wVar.F();
            u33.h hVarX2 = wVar.X();
            gVar2.getClass();
            w33.d.b bVarA = w33.g.a((s33.e) nVarW, dVarF2, hVarX2);
            if (bVarA != null) {
                String str = bVarA.f181895a;
                String str2 = bVarA.f181896b;
                t23.l lVarD = vVar.d();
                lVarD.getClass();
                if (b43.j.b(lVarD)) {
                    return new a2.e(bVarA);
                }
                t23.l lVarD2 = vVar.d();
                lVarD2.getClass();
                if (!b43.j.c(lVarD2)) {
                    return new a2.d(bVarA);
                }
                t23.k kVar = (t23.k) vVar;
                if (kVar.L()) {
                    if (!p005kotlin.jvm.internal.s.g(str, "constructor-impl") || !d53.u.p(str2, ")V", false)) {
                        vb.h.y(bVarA, "Invalid signature: ");
                        return null;
                    }
                } else {
                    if (!p005kotlin.jvm.internal.s.g(str, "constructor-impl")) {
                        vb.h.y(bVarA, "Invalid signature: ");
                        return null;
                    }
                    t23.e eVarE0 = kVar.e0();
                    eVarE0.getClass();
                    x33.b bVarF = f43.e.f(eVarE0);
                    bVarF.getClass();
                    String strB = w33.b.b(bVarF.b());
                    if (d53.u.p(str2, ")V", false)) {
                        String strConcat = d53.w.R(str2, "V").concat(strB);
                        str.getClass();
                        bVarA = new w33.d.b(str, strConcat);
                    } else if (!d53.u.p(str2, strB, false)) {
                        vb.h.y(bVarA, "Invalid signature: ");
                        return null;
                    }
                }
                return new a2.e(bVarA);
            }
        }
        return a(vVarA);
    }
}
