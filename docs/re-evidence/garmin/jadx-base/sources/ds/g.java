package ds;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import v62.b8;
import v62.f2;
import v62.n7;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f60933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f60934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f60935d;

    public /* synthetic */ g(e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f60932a = i14;
        this.f60933b = aVar;
        this.f60934c = aVar2;
        this.f60935d = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f60932a;
        e23.a aVar = this.f60935d;
        e23.a aVar2 = this.f60934c;
        e23.a aVar3 = this.f60933b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    l72.f0.a aVar4 = l72.f0.a.f111000a;
                    s62.a.f157643a.getClass();
                    t62.b bVar = t62.b.f162798a;
                    aVar4.c(0, 12, this.f60933b, null, gl1.y.Q(mVar, R.string.lbl_share), mVar, b8.a(bVar), false);
                    aVar4.h(0, 12, this.f60934c, null, gl1.y.Q(mVar, R.string.lbl_save), mVar, n7.a(bVar), false);
                    aVar4.h(0, 12, this.f60935d, null, gl1.y.Q(mVar, R.string.lbl_copy), mVar, f2.a(bVar), false);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                h62.k.a(aVar3, aVar2, aVar, (p3.m) obj, p0.t(433));
                break;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b82.c.c(z3.f.c(2083486780, new rg0.g.a(gl1.y.Q(mVar2, R.string.lbl_agree), aVar3, gl1.y.Q(mVar2, R.string.common_cancel), aVar2), mVar2), z3.f.c(830793910, new ak0.p(aVar, 15), mVar2), mVar2, 54);
                } else {
                    mVar2.e();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                u11.c.a(aVar3, aVar2, aVar, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                u11.c.b(aVar3, aVar2, aVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f60932a = i15;
        this.f60933b = aVar;
        this.f60934c = aVar2;
        this.f60935d = aVar3;
    }
}
