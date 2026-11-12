package lp1;

import c2.t2;
import i3.dd;
import i3.uc;
import i3.ud;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114203a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f114204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f114205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f114206d;

    public /* synthetic */ u(long j8, long j14, uc ucVar) {
        this.f114204b = j8;
        this.f114205c = j14;
        this.f114206d = ucVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f114203a;
        Object obj4 = this.f114206d;
        switch (i14) {
            case 0:
                v vVar = (v) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    long j8 = this.f114204b;
                    String strA = j8 > 0 ? vVar.f114208b.a(j8) : vVar.f114208b.f114198d;
                    int i15 = iIntValue;
                    x0 x0Var = x0.f111346a;
                    String str = vVar.f114209c;
                    int i16 = (i15 & 14) | (x0.f111348c << 24);
                    x0Var.a(i16, 124, null, t2Var, null, null, strA, str, null, null, mVar);
                    long j14 = this.f114205c;
                    s sVar = vVar.f114208b;
                    x0Var.a(i16, 124, null, t2Var, null, null, j14 > 0 ? sVar.a(j14) : sVar.f114198d, vVar.f114210d, null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                uc ucVar = (uc) obj4;
                ud udVar = (ud) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                udVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? mVar2.B(udVar) : mVar2.r(udVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    dd ddVar = dd.f87874a;
                    h4.r.a aVar = h4.r.S;
                    long j15 = this.f114204b;
                    boolean zL = mVar2.l(j15);
                    long j16 = this.f114205c;
                    boolean zL2 = zL | mVar2.l(j16);
                    Object objQ = mVar2.q();
                    if (zL2) {
                        cq.f fVar = new cq.f(j15, j16, 2);
                        mVar2.K(fVar);
                        objQ = fVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            cq.f fVar2 = new cq.f(j15, j16, 2);
                            mVar2.K(fVar2);
                            objQ = fVar2;
                        }
                    }
                    ddVar.c(udVar, l4.k.f(aVar, (e23.l) objQ), false, ucVar, null, null, 0.0f, 0.0f, mVar2, 100663296 | ud.f89909t | (iIntValue2 & 14), 244);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(long j8, v vVar, long j14) {
        this.f114204b = j8;
        this.f114206d = vVar;
        this.f114205c = j14;
    }
}
