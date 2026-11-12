package ho0;

import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeartRateReportsActivity f84726b;

    public /* synthetic */ j(HeartRateReportsActivity heartRateReportsActivity, int i14) {
        this.f84725a = i14;
        this.f84726b = heartRateReportsActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f84725a;
        HeartRateReportsActivity heartRateReportsActivity = this.f84726b;
        switch (i14) {
            case 0:
                fo0.a aVar = heartRateReportsActivity.f36644c;
                co0.f fVar = (co0.f) obj;
                int i15 = HeartRateReportsActivity.f36641d;
                fVar.getClass();
                if (fVar instanceof co0.f.b) {
                    aVar.k(heartRateReportsActivity, ((co0.f.b) fVar).f28143a);
                } else if (fVar instanceof co0.f.a) {
                    aVar.j(heartRateReportsActivity, ((co0.f.a) fVar).f28142a);
                } else if (fVar instanceof co0.f.d) {
                    aVar.f(heartRateReportsActivity, ((co0.f.d) fVar).f28145a);
                } else {
                    if (!(fVar instanceof co0.f.c)) {
                        u0.r();
                        return null;
                    }
                    aVar.e(heartRateReportsActivity, ((co0.f.c) fVar).f28144a);
                }
                return Unit.INSTANCE;
            case 1:
                int i16 = HeartRateReportsActivity.f36641d;
                sd2.f fVar2 = (sd2.f) ((w61.f) obj).a();
                if (fVar2 != null) {
                    heartRateReportsActivity.f36644c.d(heartRateReportsActivity, fVar2);
                }
                return Unit.INSTANCE;
            default:
                sd2.f fVar3 = (sd2.f) obj;
                int i17 = HeartRateReportsActivity.f36641d;
                fVar3.getClass();
                heartRateReportsActivity.f36644c.d(heartRateReportsActivity, fVar3);
                return Unit.INSTANCE;
        }
    }
}
