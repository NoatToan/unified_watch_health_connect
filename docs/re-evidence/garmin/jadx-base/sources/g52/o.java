package g52;

import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u82.f f75967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f75968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n82.f f75969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f75970e;

    public /* synthetic */ o(u82.f fVar, o82.a aVar, n82.f fVar2, e23.a aVar2, int i14) {
        this.f75966a = i14;
        this.f75967b = fVar;
        this.f75968c = aVar;
        this.f75969d = fVar2;
        this.f75970e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75966a;
        p3.m.a aVar = p3.m.f135153a;
        n82.f fVar = this.f75969d;
        o82.a aVar2 = this.f75968c;
        u82.f fVar2 = this.f75967b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z42.i iVar = (z42.i) fVar2.a();
                    LocalDate localDateH = g22.l.h(aVar2.f130843a);
                    LocalDate localDateH2 = g22.l.h(aVar2.f130844b);
                    boolean zB = mVar.B(fVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new d52.k(fVar, 2);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d52.k(fVar, 2);
                            mVar.K(objQ);
                        }
                    }
                    k.a(iVar, localDateH, localDateH2, (e23.l) objQ, this.f75970e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    jq1.i iVar2 = (jq1.i) fVar2.a();
                    LocalDate localDateH3 = g22.l.h(aVar2.f130843a);
                    LocalDate localDateH4 = g22.l.h(aVar2.f130844b);
                    boolean zB2 = mVar2.B(fVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new d52.k(fVar, 27);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new d52.k(fVar, 27);
                            mVar2.K(objQ2);
                        }
                    }
                    xq1.i.a(iVar2, localDateH3, localDateH4, (e23.l) objQ2, this.f75970e, mVar2, jq1.i.f100018d);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
