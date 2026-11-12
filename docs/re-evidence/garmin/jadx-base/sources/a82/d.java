package a82;

import c2.a0;
import c2.t2;
import c2.x2;
import d6.h;
import e23.l;
import e23.p;
import e23.q;
import h4.r;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1992a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1995d;

    public /* synthetic */ d(long j8, List list, l lVar) {
        this.f1993b = j8;
        this.f1994c = list;
        this.f1995d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0074  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f1992a;
        Object obj4 = this.f1995d;
        Object obj5 = this.f1994c;
        switch (i14) {
            case 0:
                p pVar = (p) obj5;
                String str = (String) obj4;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    if (pVar == null) {
                        mVar.C(-1099182846);
                    } else {
                        mVar.C(-1975120161);
                        pVar.invoke(mVar, 0);
                    }
                    mVar.f();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97933j, this.f1993b, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    h.f57752b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, h.a(h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar, 0, 0, 130046);
                } else {
                    mVar.e();
                }
                break;
            default:
                List list = (List) obj5;
                l lVar = (l) obj4;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97919d), mVar2);
                    r rVarF = x2.f(aVar, 1.0f);
                    z3.e eVarC = z3.f.c(-165418734, new a31.b(list, 13), mVar2);
                    boolean zB = mVar2.B(lVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new k11.n(lVar, 4);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new k11.n(lVar, 4);
                            mVar2.K(objQ);
                        }
                    }
                    ka0.a.b(rVarF, this.f1993b, list, eVarC, (l) objQ, mVar2, 3078);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(p pVar, long j8, String str) {
        this.f1994c = pVar;
        this.f1993b = j8;
        this.f1995d = str;
    }
}
