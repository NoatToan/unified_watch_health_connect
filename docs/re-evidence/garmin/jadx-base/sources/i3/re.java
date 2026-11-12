package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class re implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd f89531a;

    public re(wd wdVar) {
        this.f89531a = wdVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            wd wdVar = this.f89531a;
            boolean zB = mVar2.B(wdVar);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new zd(wdVar, 2);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new zd(wdVar, 2);
                    mVar2.K(objQ);
                }
            }
            q2.f89384a.getClass();
            h7.a((e23.a) objQ, null, false, null, null, q2.f89385b, mVar2, 1572864, 62);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
