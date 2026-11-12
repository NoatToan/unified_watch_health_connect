package sm1;

import java.util.List;
import lc.m0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.h0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import yg2.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160144a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f160145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f160146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f160147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f160148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f160149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f160150g;

    public /* synthetic */ q(o82.a aVar, s sVar, n82.f fVar, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar, boolean z14, p1 p1Var) {
        this.f160147d = aVar;
        this.f160148e = sVar;
        this.f160149f = fVar;
        this.f160150g = cVar;
        this.f160145b = z14;
        this.f160146c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, o13.l] */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        e23.l lVar;
        int i14 = this.f160144a;
        Object obj5 = this.f160150g;
        p1 p1Var = this.f160146c;
        Object obj6 = this.f160149f;
        Object obj7 = this.f160148e;
        Object obj8 = this.f160147d;
        switch (i14) {
            case 0:
                o82.a aVar = (o82.a) obj8;
                s sVar = (s) obj7;
                n82.f fVar = (n82.f) obj6;
                com.garmin.android.apps.connectmobile.sleep.presentation.c cVar = (com.garmin.android.apps.connectmobile.sleep.presentation.c) obj5;
                u82.f fVar2 = (u82.f) obj2;
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((c2.t) obj).getClass();
                fVar2.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? mVar.B(fVar2) : mVar.r(fVar2) ? 32 : 16;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                    x1 x1Var = p3.n.f135158a;
                    mm1.b bVar = (mm1.b) fVar2.a();
                    DateTime dateTimeK = vb.h.k(aVar.f130843a);
                    DateTime dateTimeK2 = vb.h.k(aVar.f130844b);
                    boolean zB = mVar.B(fVar);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new d52.k(fVar, 21);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d52.k(fVar, 21);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ;
                    if (!this.f160145b || cVar == null) {
                        mVar.C(743018211);
                        mVar.f();
                        lVar = null;
                    } else {
                        mVar.C(742761717);
                        Object objQ2 = mVar.q();
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sk0.n(p1Var, 5);
                            mVar.K(objQ2);
                        }
                        lVar = (e23.l) objQ2;
                        mVar.f();
                    }
                    qn1.a.b(bVar, dateTimeK, dateTimeK2, sVar, lVar2, cVar, lVar, mVar, 8);
                } else {
                    mVar.e();
                }
                break;
            default:
                yg2.h hVar = (yg2.h) obj8;
                m0 m0Var = (m0) obj6;
                p1 p1Var2 = (p1) obj5;
                p3.m mVar2 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var2 = p3.n.f135158a;
                fg2.f fVar3 = (fg2.f) hVar.f196993a.getValue();
                fVar3.getClass();
                fVar3.f71478b.f131773b.f().g();
                Unit unit = Unit.INSTANCE;
                yg2.g gVar = (yg2.g) ((x3) obj7).getF182175a();
                if (gVar == null) {
                    mVar2.C(692243482);
                    mVar2.f();
                } else {
                    mVar2.C(692243483);
                    f0.g(hVar, gVar, (vf2.e) h0.d0((List) hVar.f196999g.getValue()), ((Boolean) p1Var.getF182175a()).booleanValue(), ((Boolean) p1Var2.getF182175a()).booleanValue(), this.f160145b, m0Var, mVar2, 0);
                    mVar2.f();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(yg2.h hVar, x3 x3Var, boolean z14, m0 m0Var, p1 p1Var, p1 p1Var2) {
        this.f160147d = hVar;
        this.f160148e = x3Var;
        this.f160145b = z14;
        this.f160149f = m0Var;
        this.f160146c = p1Var;
        this.f160150g = p1Var2;
    }
}
