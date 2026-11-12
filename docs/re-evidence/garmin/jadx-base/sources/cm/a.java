package cm;

import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f27955b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f27954a = i14;
        this.f27955b = bVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f27954a;
        b bVar = this.f27955b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b.a aVar = b.f27956g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    bVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b.a aVar2 = b.f27956g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i15 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.activities_trim_activity, mVar2, i15);
                    int i16 = (iIntValue2 << 6) & 896;
                    rVar.o(R.string.activities_trim_help_1, i16, 2, null, mVar2);
                    rVar.t(R.string.lbl_how_it_works, mVar2, i15);
                    rVar.o(R.string.activities_trim_help_2, i16, 2, null, mVar2);
                    if (bVar.f27957f) {
                        mVar2.C(-1037472262);
                        rVar.o(R.string.activities_provisional_finish_point_help, i16, 2, null, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1037376162);
                        mVar2.f();
                    }
                    rVar.t(R.string.activities_updataed_stats_charts, mVar2, i15);
                    rVar.o(R.string.activities_trim_help_3, i16, 2, null, mVar2);
                    rVar.o(R.string.activities_trim_help_4, i16, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
