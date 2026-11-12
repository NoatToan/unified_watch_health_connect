package i3;

import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class qe implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f89457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd f89458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f89459c;

    public qe(long j8, wd wdVar, String str) {
        this.f89457a = j8;
        this.f89458b = wdVar;
        this.f89459c = str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            c1.f87691a.getClass();
            b1 b1VarC = c1.c(0L, this.f89457a, 0L, mVar2, 13);
            wd wdVar = this.f89458b;
            boolean zB = mVar2.B(wdVar);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new zd(wdVar, 1);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new zd(wdVar, 1);
                    mVar2.K(objQ);
                }
            }
            h1.c((e23.a) objQ, null, false, null, b1VarC, null, null, null, z3.f.c(521110564, new pe(this.f89459c), mVar2), mVar2, C.ENCODING_PCM_32BIT, 494);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
