package f21;

import b82.d2;
import c2.c1;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import i3.mh;
import l72.g3;
import l72.v2;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f68628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f68629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f68630d;

    public /* synthetic */ v(String str, String str2, String str3, int i14) {
        this.f68627a = i14;
        this.f68628b = str;
        this.f68629c = str2;
        this.f68630d = str3;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f68627a;
        String str = this.f68628b;
        String str2 = this.f68629c;
        String str3 = this.f68630d;
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
                    d2 d2Var = d2.f16532a;
                    int i15 = iIntValue & 14;
                    d2Var.f(t2Var, this.f68628b, null, null, 0, 0, mVar, i15, 30);
                    d2Var.f(t2Var, this.f68629c, null, null, 0, 0, mVar, i15, 30);
                    d2Var.f(t2Var, this.f68630d, null, null, 0, 0, mVar, i15, 30);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int i16 = 2;
                c1 c1Var = (c1) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (mVar2.B(c1Var)) {
                        i16 = 4;
                    }
                    iIntValue2 |= i16;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    str.getClass();
                    int iL = d53.w.L(0, 6, str, StringUtils.SPACE);
                    String strSubstring = iL == -1 ? str : str.substring(0, iL);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_distance);
                    String strE0 = d53.w.e0(str, StringUtils.SPACE);
                    int i17 = (iIntValue2 & 14) | (x0.f111348c << 24);
                    x0Var.a(i17, 116, null, c1Var, null, null, strSubstring, strQ, strE0, null, mVar2);
                    str2.getClass();
                    int iL2 = d53.w.L(0, 6, str2, StringUtils.SPACE);
                    x0Var.a(i17, 116, null, c1Var, null, null, iL2 == -1 ? str2 : str2.substring(0, iL2), gl1.y.Q(mVar2, R.string.lbl_total_ascent), d53.w.e0(str2, StringUtils.SPACE), null, mVar2);
                    str3.getClass();
                    int iL3 = d53.w.L(0, 6, str3, StringUtils.SPACE);
                    x0Var.a(i17, 116, null, c1Var, null, null, iL3 == -1 ? str3 : str3.substring(0, iL3), gl1.y.Q(mVar2, R.string.lbl_total_descent), d53.w.e0(str3, StringUtils.SPACE), null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                int i18 = 2;
                c1 c1Var2 = (c1) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c1Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    if (mVar3.B(c1Var2)) {
                        i18 = 4;
                    }
                    iIntValue3 |= i18;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar3);
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarB = v2.b(v2.a(aVar, false, new t21.e(29), mVar3, 6), str, new u72.a(3), mVar3, 0);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    mh.c(this.f68629c, c1Var2.c(rVarB, bVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 131068);
                    if (str3 == null) {
                        mVar3.C(1880576816);
                        mVar3.f();
                    } else {
                        mVar3.C(1880576817);
                        g3.a(0, 0, c1Var2.c(aVar, bVar), str3, mVar3);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                int i19 = 2;
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    if (mVar4.B(t2Var2)) {
                        i19 = 4;
                    }
                    iIntValue4 |= i19;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i24 = iIntValue4;
                    x0 x0Var2 = x0.f111346a;
                    String strQ2 = gl1.y.Q(mVar4, R.string.activity_details_average_heart_rate);
                    String strQ3 = gl1.y.Q(mVar4, R.string.lbl_bpm);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", str2);
                    b92.a aVarB = c0235a.b();
                    int i25 = b92.a.f16960b;
                    int i26 = (x0.f111348c << 24) | (i24 & 14);
                    x0Var2.a(i26, 52, aVarB, t2Var2, null, null, this.f68628b, strQ2, strQ3, null, mVar4);
                    x0Var2.a(i26, 124, null, t2Var2, null, null, this.f68630d, gl1.y.Q(mVar4, R.string.lbl_calories_burned), null, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                int i27 = 2;
                t2 t2Var3 = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    if (mVar5.B(t2Var3)) {
                        i27 = 4;
                    }
                    iIntValue5 |= i27;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i28 = iIntValue5;
                    x0 x0Var3 = x0.f111346a;
                    String strQ4 = gl1.y.Q(mVar5, R.string.lbl_total_steps);
                    int i29 = (x0.f111348c << 24) | (i28 & 14);
                    x0Var3.a(i29, 124, null, t2Var3, null, null, this.f68628b, strQ4, null, null, mVar5);
                    x0Var3.a(i29, 116, null, t2Var3, null, null, this.f68629c, gl1.y.Q(mVar5, R.string.lbl_total_distance_steps), this.f68630d, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            default:
                t2 t2Var4 = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                MoveIQEventDetailsActivity.a aVar2 = MoveIQEventDetailsActivity.f39211k;
                t2Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var4) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    x0 x0Var4 = x0.f111346a;
                    String str4 = this.f68628b;
                    str4.getClass();
                    String strQ5 = gl1.y.Q(mVar6, R.string.lbl_start_time);
                    int i30 = (iIntValue6 & 14) | (x0.f111348c << 24);
                    x0Var4.a(i30, 116, null, t2Var4, null, null, str4, strQ5, this.f68629c, null, mVar6);
                    if (str3 == null) {
                        str3 = "";
                    }
                    x0Var4.a(i30, 124, null, t2Var4, null, null, str3, gl1.y.Q(mVar6, R.string.lbl_time), null, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
