package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class vf implements e23.q<s1.t1.b<Boolean>, p3.m, Integer, s1.f0<o4.d0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vf f90027a = new vf();

    @Override // e23.q
    public final s1.f0<o4.d0> invoke(s1.t1.b<Boolean> bVar, p3.m mVar, Integer num) {
        s1.f0<o4.d0> f0VarB;
        p3.m mVar2 = mVar;
        num.intValue();
        mVar2.C(1058649156);
        p3.x1 x1Var = p3.n.f135158a;
        if (bVar.a(Boolean.FALSE, Boolean.TRUE)) {
            mVar2.C(272207019);
            f0VarB = k9.b(n3.h0.DefaultEffects, mVar2);
            mVar2.f();
        } else {
            mVar2.C(272326989);
            f0VarB = k9.b(n3.h0.FastEffects, mVar2);
            mVar2.f();
        }
        mVar2.f();
        return f0VarB;
    }
}
