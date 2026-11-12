package vu0;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f180237b;

    public /* synthetic */ e(j jVar, int i14) {
        this.f180236a = i14;
        this.f180237b = jVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f180236a;
        j jVar = this.f180237b;
        int i15 = 0;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = j.f180247o;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    jVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = j.f180247o;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i18 = ((iIntValue2 << 3) & 112) | 6;
                    rVar.k(z3.f.c(1758991952, new h(rVar, i15), mVar2), mVar2, i18);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, y.Q(mVar2, R.string.lbl_group_track));
                    rVar.a(z3.f.c(-798775111, new tb0.h(rVar, 27, jVar, c0235a.b()), mVar2), mVar2, i18);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = j.f180247o;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    jVar.l(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = j.f180247o;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    jVar.j(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = j.f180247o;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    jVar.n(mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i26 = j.f180247o;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    jVar.k(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i27 = j.f180247o;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    jVar.i(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i28 = j.f180247o;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = n.f135158a;
                    jVar.h(mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                m mVar9 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i29 = j.f180247o;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    jVar.m(mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
            default:
                m mVar10 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i30 = j.f180247o;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    jVar.o(mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
