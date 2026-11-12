package l33;

import p43.c2;
import p43.d2;
import t23.k1;

/* JADX INFO: loaded from: classes3.dex */
public class n0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f109791a;

    public n0(u0 u0Var) {
        this.f109791a = u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, w23.n0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, j33.f, w23.n0] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = u0.f109809m;
        fVar.getClass();
        u0 u0Var = this.f109791a;
        u0 u0Var2 = u0Var.f109811c;
        if (u0Var2 != null) {
            return u0Var2.f109815g.invoke(fVar);
        }
        o33.m mVarE = u0Var.f109813e.invoke().e(fVar);
        if (mVarE == null || mVarE.F()) {
            return null;
        }
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        boolean z14 = !mVarE.isFinal();
        k33.i iVar = u0Var.f109810b;
        k33.f fVarN = gg.b.N(iVar, mVarE);
        k33.c cVar = iVar.f102785a;
        ?? L0 = j33.f.L0(u0Var.q(), fVarN, t23.a0.FINAL, h33.l0.a(mVarE.getVisibility()), z14, mVarE.getName(), cVar.f102760j.a(mVarE), mVarE.isFinal() && mVarE.isStatic());
        r0Var.f105810a = L0;
        L0.I0(null, null, null, null);
        p43.n0 n0VarD = iVar.f102788d.d(mVarE.getType(), gg.b.P(c2.COMMON, false, null, 7));
        if ((p005kotlin.reflect.jvm.internal.impl.builtins.d.H(n0VarD) || p005kotlin.reflect.jvm.internal.impl.builtins.d.I(n0VarD)) && mVarE.isFinal()) {
            mVarE.isStatic();
        }
        w23.n0 n0Var = (w23.n0) r0Var.f105810a;
        p13.j0 j0Var = p13.j0.f134944a;
        n0Var.K0(n0VarD, j0Var, u0Var.p(), null, j0Var);
        t23.l lVarQ = u0Var.q();
        t23.e eVar = lVarQ instanceof t23.e ? (t23.e) lVarQ : null;
        if (eVar != null) {
            r0Var.f105810a = cVar.f102774x.a(eVar, (w23.n0) r0Var.f105810a, iVar);
        }
        T t7 = r0Var.f105810a;
        k1 k1Var = (k1) t7;
        p43.n0 type = ((w23.n0) t7).getType();
        if (k1Var == null) {
            b43.i.a(65);
            throw null;
        }
        if (type == null) {
            b43.i.a(66);
            throw null;
        }
        int i14 = b43.i.f15728a;
        if (!k1Var.Y() && !o72.t.R(type)) {
            if (d2.b(type)) {
                ((w23.n0) r0Var.f105810a).E0(null, new j0(u0Var, mVarE, r0Var));
            } else {
                p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = f43.e.e(k1Var);
                if (p005kotlin.reflect.jvm.internal.impl.builtins.d.H(type)) {
                    ((w23.n0) r0Var.f105810a).E0(null, new j0(u0Var, mVarE, r0Var));
                } else {
                    q43.o oVar = q43.d.f142786a;
                    if (oVar.a(dVarE.v(), type) || oVar.a(dVarE.k("Number").p(), type) || oVar.a(dVarE.e(), type) || q23.m.a(type)) {
                        ((w23.n0) r0Var.f105810a).E0(null, new j0(u0Var, mVarE, r0Var));
                    }
                }
            }
        }
        i33.j jVar = cVar.f102757g;
        t23.r0 r0Var2 = (t23.r0) r0Var.f105810a;
        ((i33.j.a) jVar).getClass();
        if (r0Var2 != null) {
            return (t23.r0) r0Var.f105810a;
        }
        Object[] objArr = new Object[3];
        switch (6) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (6) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
