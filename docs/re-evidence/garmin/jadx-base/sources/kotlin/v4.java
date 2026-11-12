package kotlin;

import e23.p;
import p005kotlin.jvm.internal.w;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class v4 extends w implements p<m, Integer, p005kotlin.Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w4 f91605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f91606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<m, Integer, p005kotlin.Unit> f91607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v4(w4 w4Var, s1 s1Var, p<? super m, ? super Integer, p005kotlin.Unit> pVar) {
        super(2);
        this.f91605a = w4Var;
        this.f91606b = s1Var;
        this.f91607c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    @Override // e23.p
    public final p005kotlin.Unit invoke(m mVar, Integer num) {
        m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            w4 w4Var = this.f91605a;
            m mVar3 = w4Var.f91634a;
            boolean zR = mVar2.r(w4Var);
            Object objQ = mVar2.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new t4(w4Var, null);
                mVar2.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new t4(w4Var, null);
                    mVar2.K(objQ);
                }
            }
            l0.e((p) objQ, mVar3, mVar2);
            boolean zR2 = mVar2.r(w4Var);
            Object objQ2 = mVar2.q();
            if (zR2) {
                objQ2 = new u4(w4Var, null);
                mVar2.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new u4(w4Var, null);
                    mVar2.K(objQ2);
                }
            }
            l0.e((p) objQ2, mVar3, mVar2);
            this.f91606b.a(mVar3, this.f91607c, mVar2, 0);
        } else {
            mVar2.e();
        }
        return p005kotlin.Unit.INSTANCE;
    }
}
