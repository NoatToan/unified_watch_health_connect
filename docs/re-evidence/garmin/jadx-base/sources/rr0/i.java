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
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.a f154214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f154215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f154216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f154217e;

    public /* synthetic */ i(x00.a aVar, Integer num, String str, Context context, int i14) {
        this.f154213a = i14;
        this.f154214b = aVar;
        this.f154215c = num;
        this.f154216d = str;
        this.f154217e = context;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f154213a;
        Context context = this.f154217e;
        Integer num = this.f154215c;
        x00.a aVar = this.f154214b;
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
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    int iIntValue2 = 0;
                    String strC = aVar.c(num);
                    String string = aVar.f188233a.getString(R.string.challenge_leaderboard_header_total_label);
                    oi0.h hVar = new oi0.h(context);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    }
                    b92.a aVarA = wz1.a.a(gl1.y.P(R.string.lbl_total_intensity_credits_today, new Object[]{hVar.f(iIntValue2)}, mVar));
                    int i15 = iIntValue & 14;
                    int i16 = b92.a.f16960b;
                    int i17 = x0.f111348c;
                    x0Var.a((i17 << 24) | i15, 52, aVarA, t2Var, null, null, strC, string, this.f154216d, null, mVar);
                    x0Var.h(t2Var, mVar, (i17 << 3) | i15);
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String string2 = aVar.f188233a.getString(R.string.common_lbl_avg_daily_total);
                    int i18 = iIntValue3;
                    x0 x0Var2 = x0.f111346a;
                    String strC2 = aVar.c(num);
                    String strG = e5.g(string2, StringUtils.SPACE, new oi0.h(context).f(num != null ? num.intValue() : 0));
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new rk0.n(13);
                        mVar2.K(objQ);
                    }
                    b92.a aVarA2 = wz1.a.a(oi0.c.A(context, (e23.l) objQ, strG));
                    int i19 = i18 & 14;
                    int i24 = b92.a.f16960b;
                    int i25 = x0.f111348c;
                    x0Var2.a(i19 | (i25 << 24), 52, aVarA2, t2Var2, null, null, strC2, string2, this.f154216d, null, mVar2);
                    x0Var2.h(t2Var2, mVar2, (i25 << 3) | i19);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
