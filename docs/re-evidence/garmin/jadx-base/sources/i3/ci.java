package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ci implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f87807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f87808b;

    public ci(p pVar, boolean z14) {
        this.f87807a = pVar;
        this.f87808b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = bi.f87642l.f134763b;
            for (int i15 = 0; i15 < i14; i15++) {
                int iA = bi.f87642l.a(i15);
                h4.r.a aVar = h4.r.S;
                boolean zK = mVar2.k(i15);
                Object objQ = mVar2.q();
                if (zK) {
                    objQ = new cf.a0(i15, 4);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cf.a0(i15, 4);
                        mVar2.K(objQ);
                    }
                }
                bi.d(p5.v.c((e23.l) objQ, aVar, false), this.f87807a, iA, this.f87808b, mVar2, 0);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
