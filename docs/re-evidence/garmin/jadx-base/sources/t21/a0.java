package t21;

import c2.t2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a0 implements e23.q<t2, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s21.n f161802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f161803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.m.c, Unit> f161804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s21.m f161805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f161806e;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(s21.n nVar, String str, e23.l<? super s21.m.c, Unit> lVar, s21.m mVar, float f14) {
        this.f161802a = nVar;
        this.f161803b = str;
        this.f161804c = lVar;
        this.f161805d = mVar;
        this.f161806e = f14;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    @Override // e23.q
    public final Unit invoke(t2 t2Var, p3.m mVar, Integer num) {
        t2 t2Var2 = t2Var;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        t2Var2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(t2Var2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = this.f161802a.f156151a;
            e23.l<s21.m.c, Unit> lVar = this.f161804c;
            boolean zB = mVar2.B(lVar);
            s21.m mVar3 = this.f161805d;
            boolean zB2 = zB | mVar2.B(mVar3);
            Object objQ = mVar2.q();
            if (zB2) {
                objQ = new z(lVar, mVar3);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new z(lVar, mVar3);
                    mVar2.K(objQ);
                }
            }
            h0.d(t2Var2, z14, this.f161803b, (e23.a) objQ, this.f161806e, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
