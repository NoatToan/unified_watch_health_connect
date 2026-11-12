package wq;

import p005kotlin.Unit;
import ps.x1;
import qs.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f186541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f186542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f186543d;

    public /* synthetic */ b(x1 x1Var, e23.p pVar, int i14, int i15) {
        this.f186540a = i15;
        this.f186541b = x1Var;
        this.f186542c = pVar;
        this.f186543d = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f186540a) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                x1 x1Var = this.f186541b;
                Integer numFalls = x1Var.getNumFalls();
                if (numFalls != null && numFalls.intValue() == 0 && iIntValue >= 0) {
                    x1Var.E3(w.CLIMB_COMPLETED);
                }
                x1Var.r3(num);
                Integer numFalls2 = x1Var.getNumFalls();
                x1Var.n2(numFalls2 != null && numFalls2.intValue() == 0);
                this.f186542c.invoke(x1Var, Integer.valueOf(this.f186543d));
                break;
            case 1:
                w wVar = (w) obj;
                wVar.getClass();
                x1 x1Var2 = this.f186541b;
                x1Var2.E3(wVar);
                this.f186542c.invoke(x1Var2, Integer.valueOf(this.f186543d));
                break;
            default:
                Double d14 = (Double) obj;
                d14.getClass();
                x1 x1Var3 = this.f186541b;
                x1Var3.s3(d14);
                this.f186542c.invoke(x1Var3, Integer.valueOf(this.f186543d));
                break;
        }
        return Unit.INSTANCE;
    }
}
