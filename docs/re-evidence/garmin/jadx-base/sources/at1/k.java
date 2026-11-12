package at1;

import e23.p;
import i3.l1;
import i3.o1;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import pt1.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12788a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f12789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f12790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f12791d;

    public /* synthetic */ k(e23.a aVar, v vVar, e23.l lVar) {
        this.f12791d = aVar;
        this.f12789b = vVar;
        this.f12790c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12788a;
        e23.a aVar = this.f12791d;
        e23.l lVar = this.f12790c;
        v vVar = this.f12789b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k2.h hVarA = k2.i.a(j92.b.f97900c.f97912d);
                    l1 l1Var = l1.f88793a;
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar);
                    long jB = d92.b.a(mVar).k().b();
                    l1Var.getClass();
                    o1.a(null, hVarA, l1.a(0, 12, jC, jB, mVar), null, z3.f.c(-79289992, new a42.a(6, aVar, vVar, lVar), mVar), mVar, 196608, 25);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m.a(vVar, lVar, aVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(v vVar, e23.l lVar, e23.a aVar, int i14) {
        this.f12789b = vVar;
        this.f12790c = lVar;
        this.f12791d = aVar;
    }
}
