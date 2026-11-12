package g52;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b92.a f75949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o82.g f75950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f75951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b92.a f75952f;

    public /* synthetic */ a(String str, b92.a aVar, o82.g gVar, String str2, b92.a aVar2, int i14) {
        this.f75947a = i14;
        this.f75948b = str;
        this.f75949c = aVar;
        this.f75950d = gVar;
        this.f75951e = str2;
        this.f75952f = aVar2;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f75947a;
        o82.g gVar = this.f75950d;
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
                    int i15 = iIntValue;
                    x0 x0Var = x0.f111346a;
                    String strQ = y.Q(mVar, R.string.common_lbl_avg_daily);
                    int i16 = i15 & 14;
                    int i17 = b92.a.f16960b;
                    int i18 = x0.f111348c;
                    int i19 = i16 | (i18 << 24);
                    x0Var.a(i19, 60, this.f75949c, t2Var, null, null, this.f75948b, strQ, null, null, mVar);
                    if (gVar == o82.g.f130853f) {
                        mVar.C(-1957926968);
                        x0Var.a(i19, 60, this.f75952f, t2Var, null, null, this.f75951e, y.Q(mVar, R.string.lbl_average_weekly), null, null, mVar);
                        mVar.f();
                    } else {
                        mVar.C(-1957692732);
                        x0Var.h(t2Var, mVar, (i18 << 3) | i16);
                        mVar.f();
                    }
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
                    int i24 = iIntValue2;
                    x0 x0Var2 = x0.f111346a;
                    String strQ2 = y.Q(mVar2, R.string.lbl_average_daily);
                    int i25 = i24 & 14;
                    int i26 = b92.a.f16960b;
                    int i27 = x0.f111348c;
                    int i28 = i25 | (i27 << 24);
                    x0Var2.a(i28, 60, this.f75949c, t2Var, null, null, this.f75948b, strQ2, null, null, mVar2);
                    if (gVar == o82.g.f130851d) {
                        mVar2.C(831566460);
                        x0Var2.h(t2Var, mVar2, (i27 << 3) | i25);
                        mVar2.f();
                    } else {
                        mVar2.C(831625701);
                        x0Var2.a(i28, 60, this.f75952f, t2Var, null, null, this.f75951e, y.Q(mVar2, R.string.lbl_average_weekly), null, null, mVar2);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
