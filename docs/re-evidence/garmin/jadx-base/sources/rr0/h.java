package rr0;

import android.content.Context;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.a f154208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f154209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f154210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f154211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f154212f;

    public /* synthetic */ h(x00.a aVar, Integer num, String str, Context context, Integer num2, int i14) {
        this.f154207a = i14;
        this.f154208b = aVar;
        this.f154209c = num;
        this.f154210d = str;
        this.f154211e = context;
        this.f154212f = num2;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f154207a;
        Integer num = this.f154212f;
        Context context = this.f154211e;
        Integer num2 = this.f154209c;
        x00.a aVar = this.f154208b;
        switch (i14) {
            case 0:
                l22.a aVar2 = aVar.f188233a;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String strC = aVar.c(num2);
                    String string = aVar2.getString(R.string.lbl_intensity_moderate_short);
                    b92.a aVarA = wz1.a.a(gl1.y.P(R.string.lbl_moderate_intensity, new Object[]{new oi0.h(context).f(num2 != null ? num2.intValue() : 0)}, mVar));
                    int i15 = iIntValue & 14;
                    int i16 = b92.a.f16960b;
                    int i17 = x0.f111348c << 24;
                    String str = this.f154210d;
                    x0Var.a(i15 | i17, 52, aVarA, t2Var, null, null, strC, string, str, null, mVar);
                    String strC2 = aVar.c(num);
                    String string2 = aVar2.getString(R.string.lbl_intensity_vigorous_short);
                    a.f154192a.getClass();
                    x0Var.a(i15 | 196608 | i17, 36, wz1.a.a(gl1.y.P(R.string.lbl_vigorous_intensity, new Object[]{new oi0.h(context).f(num != null ? num.intValue() : 0)}, mVar)), t2Var, a.f154193b, null, strC2, string2, str, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                l22.a aVar3 = aVar.f188233a;
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String string3 = aVar3.getString(R.string.intensity_lbl_avg_weekly_moderate);
                    x0 x0Var2 = x0.f111346a;
                    String strC3 = aVar.c(num2);
                    String strG = e5.g(string3, StringUtils.SPACE, new oi0.h(context).f(num2 != null ? num2.intValue() : 0));
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new rk0.n(16);
                        mVar2.K(objQ);
                    }
                    b92.a aVarA2 = wz1.a.a(oi0.c.A(context, (e23.l) objQ, strG));
                    int i18 = iIntValue2 & 14;
                    int i19 = b92.a.f16960b;
                    int i24 = x0.f111348c << 24;
                    String str2 = this.f154210d;
                    x0Var2.a(i18 | i24, 52, aVarA2, t2Var2, null, null, strC3, string3, str2, null, mVar2);
                    String string4 = aVar3.getString(R.string.intensity_lbl_avg_weekly_vigorous);
                    String strC4 = aVar.c(num);
                    d.f154198a.getClass();
                    z3.e eVar = d.f154200c;
                    String strG2 = e5.g(string4, StringUtils.SPACE, new oi0.h(context).f(num != null ? num.intValue() : 0));
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new rk0.n(17);
                        mVar2.K(objQ2);
                    }
                    x0Var2.a(i18 | 196608 | i24, 36, wz1.a.a(oi0.c.A(context, (e23.l) objQ2, strG2)), t2Var2, eVar, null, strC4, string4, str2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                l22.a aVar4 = aVar.f188233a;
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    x0 x0Var3 = x0.f111346a;
                    String strC5 = aVar.c(num2);
                    String string5 = aVar4.getString(R.string.lbl_intensity_moderate_short);
                    b92.a aVarA3 = wz1.a.a(gl1.y.P(R.string.lbl_moderate_intensity, new Object[]{new oi0.h(context).f(num2 != null ? num2.intValue() : 0)}, mVar3));
                    int i25 = iIntValue3 & 14;
                    int i26 = b92.a.f16960b;
                    int i27 = x0.f111348c << 24;
                    String str3 = this.f154210d;
                    x0Var3.a(i25 | i27, 52, aVarA3, t2Var3, null, null, strC5, string5, str3, null, mVar3);
                    String strC6 = aVar.c(num);
                    String string6 = aVar4.getString(R.string.lbl_intensity_vigorous_short);
                    e.f154201a.getClass();
                    x0Var3.a(i25 | 196608 | i27, 36, wz1.a.a(gl1.y.P(R.string.lbl_vigorous_intensity, new Object[]{new oi0.h(context).f(num != null ? num.intValue() : 0)}, mVar3)), t2Var3, e.f154202b, null, strC6, string6, str3, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
