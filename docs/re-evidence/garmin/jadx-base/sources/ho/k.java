package ho;

import lc.u0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f84639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f84640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f84641d;

    public /* synthetic */ k(p1 p1Var, p1 p1Var2, p1 p1Var3, int i14) {
        this.f84638a = i14;
        this.f84639b = p1Var;
        this.f84640c = p1Var2;
        this.f84641d = p1Var3;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Double d14 = (Double) obj;
        Double d15 = (Double) obj2;
        eo.e eVar = (eo.e) obj3;
        switch (this.f84638a) {
            case 0:
                eVar.getClass();
                this.f84639b.setValue(d14);
                this.f84640c.setValue(d15);
                this.f84641d.setValue(eVar);
                return Unit.INSTANCE;
            default:
                eVar.getClass();
                this.f84639b.setValue(eVar);
                int i14 = s.a.f84671a[eVar.ordinal()];
                if (i14 == 1) {
                    this.f84640c.setValue(d14);
                } else {
                    if (i14 != 2) {
                        u0.r();
                        return null;
                    }
                    this.f84641d.setValue(d15);
                }
                return Unit.INSTANCE;
        }
    }
}
