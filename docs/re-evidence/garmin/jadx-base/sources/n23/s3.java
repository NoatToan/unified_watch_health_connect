package n23;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class s3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.d1 f122607a;

    public s3(t23.d1 d1Var) {
        this.f122607a = d1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Class<?> cls;
        f2<?> f2VarA;
        t23.l lVarD = this.f122607a.d();
        lVarD.getClass();
        if (lVarD instanceof t23.e) {
            return u3.a((t23.e) lVarD);
        }
        if (!(lVarD instanceof t23.b)) {
            lc.u0.t(lVarD, "Unknown type parameter container: ");
            return null;
        }
        t23.l lVarD2 = ((t23.b) lVarD).d();
        lVarD2.getClass();
        if (lVarD2 instanceof t23.e) {
            f2VarA = u3.a((t23.e) lVarD2);
        } else {
            n43.w wVar = lVarD instanceof n43.w ? (n43.w) lVarD : null;
            if (wVar == null) {
                lc.u0.t(lVarD, "Non-class callable descriptor must be deserialized: ");
                return null;
            }
            n43.v vVarG = wVar.G();
            q33.r rVar = vVarG instanceof q33.r ? (q33.r) vVarG : null;
            q33.x xVar = rVar != null ? rVar.f142524d : null;
            y23.e eVar = xVar instanceof y23.e ? (y23.e) xVar : null;
            if (eVar == null || (cls = eVar.f194348a) == null) {
                lc.u0.t(wVar, "Container of deserialized member is not resolved: ");
                return null;
            }
            f2VarA = (f2) p005kotlin.jvm.internal.s0.f105811a.b(cls);
        }
        Object objK = lVarD.K(new c0(f2VarA), Unit.INSTANCE);
        objK.getClass();
        return (v3) objK;
    }
}
