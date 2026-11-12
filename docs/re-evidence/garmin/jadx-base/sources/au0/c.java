package au0;

import c2.x2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f12868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12869f;

    public /* synthetic */ c(String str, String str2, boolean z14, e23.l lVar, String str3, int i14) {
        this.f12864a = i14;
        this.f12865b = str;
        this.f12866c = str2;
        this.f12867d = z14;
        this.f12868e = lVar;
        this.f12869f = str3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        double dDoubleValue;
        int i14 = this.f12864a;
        p3.m.a aVar = p3.m.f135153a;
        String str = this.f12869f;
        e23.l lVar = this.f12868e;
        String str2 = this.f12865b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                Double dF = d53.s.f(d53.u.v(str2, ",", ".", false));
                dDoubleValue = dF != null ? dF.doubleValue() : 0.0d;
                boolean zB = mVar.B(lVar) | mVar.B(str);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new g(lVar, str, 0);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g(lVar, str, 0);
                        mVar.K(objQ);
                    }
                }
                xg2.h.a(dDoubleValue, this.f12866c, this.f12867d, (e23.l) objQ, x2.f(h4.r.S, 1.0f), 0L, mVar, 24576);
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                Double dF2 = d53.s.f(d53.u.v(str2, ",", ".", false));
                dDoubleValue = dF2 != null ? dF2.doubleValue() : 0.0d;
                boolean zB2 = mVar2.B(lVar) | mVar2.B(str);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new g(lVar, str, 9);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new g(lVar, str, 9);
                        mVar2.K(objQ2);
                    }
                }
                xg2.h.a(dDoubleValue, this.f12866c, this.f12867d, (e23.l) objQ2, x2.f(h4.r.S, 1.0f), 0L, mVar2, 24576);
                break;
        }
        return Unit.INSTANCE;
    }
}
