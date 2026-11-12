package d52;

import c2.t;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.a f57590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.g f57591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n82.f f57592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f57593e;

    public /* synthetic */ n(o82.a aVar, o82.g gVar, n82.f fVar, e23.a aVar2, int i14) {
        this.f57589a = i14;
        this.f57590b = aVar;
        this.f57591c = gVar;
        this.f57592d = fVar;
        this.f57593e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f57589a;
        p3.m.a aVar = p3.m.f135153a;
        n82.f fVar = this.f57592d;
        o82.a aVar2 = this.f57590b;
        t tVar = (t) obj;
        switch (i14) {
            case 0:
                u82.f fVar2 = (u82.f) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                tVar.getClass();
                fVar2.getClass();
                x1 x1Var = p3.n.f135158a;
                LocalDate localDateH = g22.l.h(aVar2.f130843a);
                LocalDate localDateH2 = g22.l.h(aVar2.f130844b);
                z42.d dVar = (z42.d) fVar2.a();
                boolean zB = mVar.B(fVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new k(fVar, 0);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k(fVar, 0);
                        mVar.K(objQ);
                    }
                }
                g52.g.a(localDateH, localDateH2, dVar, this.f57591c, (e23.l) objQ, this.f57593e, mVar, 0);
                break;
            default:
                u82.f fVar3 = (u82.f) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, tVar, fVar3);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar2.B(fVar3) : mVar2.r(fVar3) ? 32 : 16;
                }
                if (mVar2.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var2 = p3.n.f135158a;
                    jq1.d dVar2 = (jq1.d) fVar3.a();
                    LocalDate localDateH3 = g22.l.h(aVar2.f130843a);
                    LocalDate localDateH4 = g22.l.h(aVar2.f130844b);
                    boolean zB2 = mVar2.B(fVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new k(fVar, 14);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k(fVar, 14);
                            mVar2.K(objQ2);
                        }
                    }
                    xq1.e.a(dVar2, localDateH3, localDateH4, this.f57591c, (e23.l) objQ2, this.f57593e, mVar2, jq1.d.f99992c);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
