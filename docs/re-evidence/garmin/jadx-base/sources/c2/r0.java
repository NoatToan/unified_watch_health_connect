package c2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f22856b;

    public /* synthetic */ r0(e23.q qVar) {
        this.f22855a = 0;
        this.f22856b = qVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f22855a;
        e23.q qVar = this.f22856b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    qVar.invoke(d1.f22620b, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                h82.e.a(qVar, mVar, p3.p0.t(7));
                break;
            default:
                num.getClass();
                h82.e.b(qVar, mVar, p3.p0.t(7));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r0(e23.q qVar, int i14, int i15) {
        this.f22855a = i15;
        this.f22856b = qVar;
    }
}
