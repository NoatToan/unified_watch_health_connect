package xn;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f191608b;

    public /* synthetic */ i(j jVar, int i14) {
        this.f191607a = i14;
        this.f191608b = jVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f191607a;
        j jVar = this.f191608b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j.a aVar = j.f191609g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    jVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j.a aVar2 = j.f191609g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i15 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.lbl_five_hertz_data_title, mVar2, i15);
                    int i16 = (iIntValue2 << 6) & 896;
                    rVar.m(i16, 2, y.P(R.string.lbl_five_hertz_data_paragraph1, new Object[]{jVar.f191610f}, mVar2), null, mVar2);
                    rVar.o(R.string.lbl_five_hertz_data_paragraph2, i16, 2, null, mVar2);
                    rVar.t(R.string.lbl_more_about_five_hertz_title, mVar2, i15);
                    rVar.o(R.string.lbl_more_about_five_hertz_paragraph1, i16, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
