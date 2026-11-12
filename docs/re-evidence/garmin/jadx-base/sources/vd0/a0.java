package vd0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l22.a f177149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe0.i f177150c;

    public /* synthetic */ a0(l22.a aVar, pe0.i iVar, int i14) {
        this.f177148a = i14;
        this.f177149b = aVar;
        this.f177150c = iVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f177148a;
        pe0.i iVar = this.f177150c;
        l22.a aVar = this.f177149b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    ls.e eVar = ls.e.TOTAL_TIME;
                    Double d14 = iVar.f137449b;
                    String strB = ss.k.b(eVar, aVar, d14 != null ? Double.valueOf(d14.doubleValue() / ((double) 1000)) : null, 16);
                    l72.x0 x0Var = l72.x0.f111346a;
                    if (strB == null || d53.w.J(strB)) {
                        strB = sn.a.h(mVar, -1940292937, R.string.no_duration_value, mVar);
                    } else {
                        mVar.C(-1940293574);
                        mVar.f();
                    }
                    String str = strB;
                    String strQ = gl1.y.Q(mVar, R.string.activity_stats_details_total_time_label);
                    int i15 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i15, 124, null, t2Var, null, null, str, strQ, null, null, mVar);
                    Integer num = iVar.f137450c;
                    x0Var.a(i15, 124, null, t2Var, null, null, String.valueOf(num != null ? num.intValue() : 0), gl1.y.Q(mVar, R.string.annual_report_recap_sub_total_activities), null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    ls.e eVar2 = ls.e.TOTAL_TIME;
                    Double d15 = iVar.f137449b;
                    String strB2 = ss.k.b(eVar2, aVar, d15 != null ? Double.valueOf(d15.doubleValue() / ((double) 1000)) : null, 16);
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    if (strB2 == null || d53.w.J(strB2)) {
                        strB2 = sn.a.h(mVar2, 119634558, R.string.no_duration_value, mVar2);
                    } else {
                        mVar2.C(119633921);
                        mVar2.f();
                    }
                    String str2 = strB2;
                    String strQ2 = gl1.y.Q(mVar2, R.string.activity_stats_details_total_time_label);
                    int i16 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i16, 124, null, t2Var2, null, null, str2, strQ2, null, null, mVar2);
                    Integer num2 = iVar.f137450c;
                    x0Var2.a(i16, 124, null, t2Var2, null, null, String.valueOf(num2 != null ? num2.intValue() : 0), gl1.y.Q(mVar2, R.string.annual_report_recap_sub_total_activities), null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
