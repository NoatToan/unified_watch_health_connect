package wu1;

import e23.p;
import jv1.n;
import p005kotlin.Unit;
import p3.m;
import p3.x1;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f187319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f187320c;

    public /* synthetic */ i(n nVar, j jVar, int i14) {
        this.f187318a = i14;
        this.f187319b = nVar;
        this.f187320c = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f187318a;
        j jVar = this.f187320c;
        n nVar = this.f187319b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(615159112, new i(nVar, jVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    tw1.n nVar2 = nVar.f101082d;
                    if ((nVar2 != null ? nVar2.b() : null) == o.f180178i) {
                        mVar2.C(-420260258);
                        yu1.i.g(nVar, jVar.f187321b, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-420162887);
                        yu1.g.c(nVar, jVar.f187321b, mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
