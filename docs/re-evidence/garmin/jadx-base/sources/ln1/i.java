package ln1;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.e5;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn1.d f113673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.c f113674c;

    public /* synthetic */ i(mn1.d dVar, km1.c cVar, int i14) {
        this.f113672a = i14;
        this.f113673b = dVar;
        this.f113674c = cVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strE;
        String strE2;
        int i14 = this.f113672a;
        km1.c cVar = this.f113674c;
        mn1.d dVar = this.f113673b;
        t2 t2Var = (t2) obj;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    Integer numQ = cVar.q();
                    if (numQ == null || (strE = String.valueOf(numQ.intValue())) == null) {
                        strE = dVar.e();
                    }
                    String str = strE;
                    l22.b bVar = dVar.f119771a;
                    x0 x0Var = x0.f111346a;
                    String string = bVar.getString(R.string.lbl_awakenings_greater_than_5m);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", bVar.a(R.string.lbl_number_awakenings_longer_5_minutes, str));
                    b92.a aVarB = c0235a.b();
                    int i15 = b92.a.f16960b;
                    int i16 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i16, 60, aVarB, t2Var, null, null, str, string, null, null, mVar);
                    Integer restlessMomentsCount = cVar.getRestlessMomentsCount();
                    if (restlessMomentsCount == null || (strE2 = String.valueOf(restlessMomentsCount.intValue())) == null) {
                        strE2 = dVar.e();
                    }
                    Integer restlessMomentsCount2 = cVar.getRestlessMomentsCount();
                    x0Var.a(i16, 124, null, t2Var, null, null, strE2, (restlessMomentsCount2 != null && restlessMomentsCount2.intValue() == 1) ? bVar.getString(R.string.lbl_restless_moment) : bVar.getString(R.string.lbl_restless_moments), null, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i17 = iIntValue2;
                    x0 x0Var2 = x0.f111346a;
                    String strD = dVar.d(cVar.e0());
                    String strQ = y.Q(mVar2, R.string.title_stress);
                    int i18 = (i17 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i18, 124, null, t2Var, null, null, strD, strQ, null, null, mVar2);
                    Double dG = cVar.g();
                    String strValueOf = String.valueOf(dG != null ? Integer.valueOf((int) dG.doubleValue()) : null);
                    String strQ2 = y.Q(mVar2, R.string.lbl_avg_stress_level);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    l22.b bVar2 = dVar.f119771a;
                    c0235a2.f16962a.put("merge", e5.g(bVar2.getString(R.string.lbl_avg_stress_level), StringUtils.SPACE, (dG == null || dG.doubleValue() <= 0.0d) ? bVar2.getString(R.string.txt_empty_page_no_data) : String.valueOf((int) dG.doubleValue())));
                    b92.a aVarB2 = c0235a2.b();
                    int i19 = b92.a.f16960b;
                    x0Var2.a(i18, 60, aVarB2, t2Var, null, null, strValueOf, strQ2, null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
