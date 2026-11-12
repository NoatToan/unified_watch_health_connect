package g52;

import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u82.f f75972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f75973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f75974d;

    public /* synthetic */ p(u82.f fVar, o82.a aVar, e23.a aVar2, int i14) {
        this.f75971a = i14;
        this.f75972b = fVar;
        this.f75973c = aVar;
        this.f75974d = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75971a;
        o82.a aVar = this.f75973c;
        u82.f fVar = this.f75972b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z42.i iVar = (z42.i) fVar.a();
                    LocalDate localDateMinusMonths = jg.b.P(g22.l.h(aVar.f130844b)).minusMonths(11);
                    localDateMinusMonths.getClass();
                    i.a(iVar, localDateMinusMonths, jg.b.P(g22.l.h(aVar.f130844b)), this.f75974d, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    jq1.i iVar2 = (jq1.i) fVar.a();
                    LocalDate localDateMinusMonths2 = jg.b.P(g22.l.h(aVar.f130844b)).minusMonths(11);
                    localDateMinusMonths2.getClass();
                    xq1.g.a(iVar2, localDateMinusMonths2, jg.b.P(g22.l.h(aVar.f130844b)), this.f75974d, mVar2, jq1.i.f100018d);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
