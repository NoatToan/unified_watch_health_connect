package b82;

import i3.s5;
import l72.v2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f16740c;

    public /* synthetic */ p1(float f14, long j8) {
        this.f16738a = 0;
        this.f16740c = f14;
        this.f16739b = j8;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f16738a;
        float f14 = this.f16740c;
        long j8 = this.f16739b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                q1 q1Var = q1.f16749a;
                rVar.getClass();
                mVar.C(197021433);
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarB = u1.q.b(f14, j8, rVar, k2.i.f102406a);
                mVar.f();
                return rVarB;
            case 1:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l72.f0 f0Var = l72.f0.f110999a;
                rVar2.getClass();
                mVar2.C(777601861);
                p3.x1 x1Var2 = p3.n.f135158a;
                float f15 = 4;
                g6.f.a aVar = g6.f.f75994b;
                h4.r rVarC = v2.c(rVar2, this.f16739b, 0.25f, this.f16740c, f15, f15, 0, mVar2, (iIntValue & 14) | 1794432, 0);
                mVar2.f();
                return rVarC;
            default:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(1086952978, rVar3, (Integer) obj3, mVar3);
                p3.x1 x1Var3 = p3.n.f135158a;
                h4.r rVarD = l4.k.d(h4.r.S, new s5(f14, j8, 7));
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarThen = rVar3.then(c2.l.C(rVarD, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14));
                mVar3.f();
                return rVarThen;
        }
    }

    public /* synthetic */ p1(long j8, float f14, int i14) {
        this.f16738a = i14;
        this.f16739b = j8;
        this.f16740c = f14;
    }
}
