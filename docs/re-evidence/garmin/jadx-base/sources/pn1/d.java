package pn1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p40.r;
import pf0.j;
import sm1.a0;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f138673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f138674c;

    public /* synthetic */ d(s sVar, e23.a aVar, int i14) {
        this.f138672a = i14;
        this.f138673b = sVar;
        this.f138674c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14 = this.f138672a;
        e23.a aVar = this.f138674c;
        s sVar = this.f138673b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                e.b(sVar, aVar, (m) obj, p0.t(1));
                break;
            case 1:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.d.a(((a0) s9.c.c(sVar.f160188h, mVar).getF182175a()).f160085a, z3.f.c(-437071610, new r(aVar, 7), mVar), null, null, null, z3.f.c(408211210, new d(sVar, aVar, 3), mVar), mVar, 196656, 28);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                g.a(sVar, aVar, (m) obj, p0.t(1));
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zB = mVar2.B(aVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new j(aVar, 11);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new j(aVar, 11);
                            mVar2.K(objQ);
                        }
                    }
                    e.b(sVar, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(s sVar, e23.a aVar, int i14, int i15) {
        this.f138672a = i15;
        this.f138673b = sVar;
        this.f138674c = aVar;
    }
}
