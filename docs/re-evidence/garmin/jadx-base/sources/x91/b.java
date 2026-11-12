package x91;

import c2.a0;
import c2.x2;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189595a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aa1.c f189596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f189597c;

    public /* synthetic */ b(aa1.c cVar, e23.l lVar) {
        this.f189596b = cVar;
        this.f189597c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0105  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f189595a;
        p3.m.a aVar = p3.m.f135153a;
        e23.l lVar = this.f189597c;
        aa1.c cVar = this.f189596b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.r rVarZ = x2.z(rVarF, h4.d.a.f81537o, 2);
                    String[] months = new DateFormatSymbols().getMonths();
                    months.getClass();
                    i53.f fVarF = i53.a.f(months);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(cVar.f2238f);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(cVar.f2237e);
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(DateTime.now().getMillis());
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new wr1.d(lVar, 3);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wr1.d(lVar, 3);
                            mVar.K(objQ);
                        }
                    }
                    r82.g.a(rVarZ, fVarF, calendar, (e23.l) objQ, calendar2, calendar3, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.r rVarZ2 = x2.z(rVarF2, h4.d.a.f81537o, 2);
                    Double d14 = cVar.f2240h;
                    int iB = d14 != null ? MathKt.b(d14.doubleValue()) : 1;
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new wr1.d(lVar, 4);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new wr1.d(lVar, 4);
                            mVar2.K(objQ2);
                        }
                    }
                    r82.g.g(rVarZ2, ":", ":", "", 1, 143999, iB, (e23.l) objQ2, mVar2, 3510, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(e23.l lVar, aa1.c cVar) {
        this.f189597c = lVar;
        this.f189596b = cVar;
    }
}
