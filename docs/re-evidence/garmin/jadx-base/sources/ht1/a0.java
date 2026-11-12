package ht1;

import c2.x2;
import i3.h7;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a0 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2.t f85533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<pt1.u, Unit> f85534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.u f85535c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(c2.t tVar, e23.l<? super pt1.u, Unit> lVar, pt1.u uVar) {
        this.f85533a = tVar;
        this.f85534b = lVar;
        this.f85535c = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97901d.f97905d;
            h4.r rVarQ = x2.q(aVar, f14);
            h4.d.f81522a.getClass();
            h4.r rVarC = this.f85533a.c(rVarQ, h4.d.a.f81526d);
            float f15 = 3;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarU = c2.l.u(rVarC, f14 / f15, (-f14) / f15);
            e23.l<pt1.u, Unit> lVar = this.f85534b;
            boolean zB = mVar2.B(lVar);
            pt1.u uVar = this.f85535c;
            boolean zR = zB | mVar2.r(uVar);
            Object objQ = mVar2.q();
            if (zR) {
                objQ = new z(lVar, uVar);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new z(lVar, uVar);
                    mVar2.K(objQ);
                }
            }
            c.f85540a.getClass();
            h7.a((e23.a) objQ, rVarU, false, null, null, c.f85542c, mVar2, 1572864, 60);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
