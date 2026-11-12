package ho0;

import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f84706b;

    public /* synthetic */ d(h hVar, int i14) {
        this.f84705a = i14;
        this.f84706b = hVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f84705a;
        h hVar = this.f84706b;
        switch (i14) {
            case 0:
                r rVar = (r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = h.f84713l;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    int i16 = ((iIntValue << 3) & 112) | 6;
                    rVar.k(z3.f.c(245919791, new fe1.a(rVar, 20), mVar), mVar, i16);
                    rVar.a(z3.f.c(1972865240, new g80.e(23, rVar, hVar), mVar), mVar, i16);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                r rVar2 = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = h.f84713l;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    rVar2.D(R.string.lbl_your_heart_rate, mVar2, (iIntValue2 << 3) & 112);
                    int i18 = (iIntValue2 << 6) & 896;
                    rVar2.m(i18, 2, y.P(hVar.f84715g, new Object[]{hVar.f84718j, hVar.f84719k}, mVar2), null, mVar2);
                    rVar2.o(R.string.msg_resting_heart_rate_description, i18, 2, null, mVar2);
                    rVar2.o(R.string.hr_help_high_info, i18, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = h.f84713l;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    hVar.k(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = h.f84713l;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    hVar.h(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = h.f84713l;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    hVar.j(mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i26 = h.f84713l;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    hVar.i(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            default:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i27 = h.f84713l;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    hVar.g(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
