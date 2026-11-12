package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class dj implements e23.q<h4.r, p3.m, Integer, h4.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.t1<Boolean> f87928a;

    public dj(s1.t1<Boolean> t1Var) {
        this.f87928a = t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final h4.r invoke(h4.r rVar, p3.m mVar, Integer num) {
        h4.r rVar2 = rVar;
        p3.m mVar2 = mVar;
        num.intValue();
        mVar2.C(-1498516085);
        p3.x1 x1Var = p3.n.f135158a;
        s1.f0 f0VarB = k9.b(n3.h0.FastSpatial, mVar2);
        s1.f0 f0VarB2 = k9.b(n3.h0.FastEffects, mVar2);
        cj cjVar = new cj(f0VarB);
        p005kotlin.jvm.internal.m mVar3 = p005kotlin.jvm.internal.m.f105803a;
        s1.d2 d2Var = s1.e2.f155568a;
        s1.t1<Boolean> t1Var = this.f87928a;
        s1.a2<Boolean> a2Var = t1Var.f155744a;
        p3.c2 c2Var = t1Var.f155747d;
        boolean zBooleanValue = a2Var.a().booleanValue();
        mVar2.C(-1553362193);
        float f14 = zBooleanValue ? 1.0f : 0.8f;
        mVar2.f();
        Float fValueOf = Float.valueOf(f14);
        boolean zBooleanValue2 = ((Boolean) c2Var.getF182175a()).booleanValue();
        mVar2.C(-1553362193);
        float f15 = zBooleanValue2 ? 1.0f : 0.8f;
        mVar2.f();
        s1.t1.d dVarC = s1.w1.c(t1Var, fValueOf, Float.valueOf(f15), cjVar.invoke(t1Var.f(), mVar2, 0), d2Var, "tooltip transition: scaling", mVar2, 196608);
        bj bjVar = new bj(f0VarB2);
        boolean zBooleanValue3 = t1Var.f155744a.a().booleanValue();
        mVar2.C(2073045083);
        float f16 = zBooleanValue3 ? 1.0f : 0.0f;
        mVar2.f();
        Float fValueOf2 = Float.valueOf(f16);
        boolean zBooleanValue4 = ((Boolean) c2Var.getF182175a()).booleanValue();
        mVar2.C(2073045083);
        float f17 = zBooleanValue4 ? 1.0f : 0.0f;
        mVar2.f();
        h4.r rVarB = o4.s0.b(rVar2, ((Number) dVarC.f155775j.getF182175a()).floatValue(), ((Number) dVarC.f155775j.getF182175a()).floatValue(), ((Number) s1.w1.c(t1Var, fValueOf2, Float.valueOf(f17), bjVar.invoke(t1Var.f(), mVar2, 0), d2Var, "tooltip transition: alpha", mVar2, 196608).f155775j.getF182175a()).floatValue(), 0.0f, null, 131064);
        mVar2.f();
        return rVarB;
    }
}
