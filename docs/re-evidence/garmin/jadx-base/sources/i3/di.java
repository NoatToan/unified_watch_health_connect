package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class di implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1.l f87925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f87926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f87927c;

    public di(p1.l lVar, p pVar, boolean z14) {
        this.f87925a = lVar;
        this.f87926b = pVar;
        this.f87927c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p pVar;
        int iA;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            mVar2.C(1866272144);
            p1.l lVar = this.f87925a;
            int i14 = lVar.f134763b;
            int i15 = 0;
            while (true) {
                pVar = this.f87926b;
                if (i15 >= i14) {
                    break;
                }
                if (pVar.f89247a.getF89707a()) {
                    int iC = pVar.f89247a.c();
                    qi.f89469b.getClass();
                    if (iC == qi.f89470c) {
                        iA = lVar.a(i15);
                    } else {
                        iA = lVar.a(i15) % 12;
                    }
                } else {
                    iA = lVar.a(i15);
                }
                int i16 = iA;
                h4.r.a aVar = h4.r.S;
                boolean zK = mVar2.k(i15);
                Object objQ = mVar2.q();
                if (zK) {
                    objQ = new cf.a0(i15, 3);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cf.a0(i15, 3);
                        mVar2.K(objQ);
                    }
                }
                bi.d(p5.v.c((e23.l) objQ, aVar, false), pVar, i16, this.f87927c, mVar2, 0);
                i15++;
            }
            mVar2.f();
            int iC2 = pVar.f89247a.c();
            qi.f89469b.getClass();
            if (iC2 == 0 && pVar.f89247a.getF89707a()) {
                mVar2.C(2020585964);
                h4.r rVarE = f5.g0.e(h4.r.S, q7.InnerCircle);
                n3.f1.f122826a.getClass();
                h4.r rVarQ = c2.x2.q(rVarE, n3.f1.f122828c);
                k2.h hVar = k2.i.f102406a;
                o4.d0.f128823b.getClass();
                bi.a(u1.n.e(rVarQ, o4.d0.f128831j, hVar), bi.f87632b, z3.f.c(-1385767514, new ci(pVar, this.f87927c), mVar2), mVar2, 432);
                mVar2.f();
            } else {
                mVar2.C(2021505641);
                mVar2.f();
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
