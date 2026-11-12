package b12;

import e23.q;
import jf.v;
import jf.w;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements q<w, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f14400a;

    public e(float f14) {
        this.f14400a = f14;
    }

    @Override // e23.q
    public final Unit invoke(w wVar, m mVar, Integer num) {
        w wVar2 = wVar;
        m mVar2 = mVar;
        int iIntValue = num.intValue();
        wVar2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(wVar2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (((jf.d.c) p0.c(wVar2.getF98679b().f98632q, mVar2, 0).getF182175a()) instanceof jf.d.c.C1894d) {
                mVar2.C(482493876);
                v.b(wVar2, null, null, null, null, null, 0.0f, null, false, mVar2, iIntValue & 14);
                mVar2.f();
            } else {
                mVar2.C(482495741);
                k.a(this.f14400a, mVar2, 0);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
