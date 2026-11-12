package ho0;

import b63.o;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeartRateReportsActivity f84724b;

    public /* synthetic */ i(HeartRateReportsActivity heartRateReportsActivity, int i14) {
        this.f84723a = i14;
        this.f84724b = heartRateReportsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f84723a;
        HeartRateReportsActivity heartRateReportsActivity = this.f84724b;
        switch (i14) {
            case 0:
                int i15 = HeartRateReportsActivity.f36641d;
                qo0.a aVar = (qo0.a) heartRateReportsActivity.f36642a.getValue();
                LocalDate localDate = DateTime.now().toLocalDate();
                localDate.getClass();
                o oVarT = g22.k.t(localDate);
                LocalDate localDate2 = DateTime.now().toLocalDate();
                localDate2.getClass();
                aVar.f145928m.i(new o82.a(oVarT, g22.k.t(localDate2)), true);
                aVar.f145929n.e();
                aVar.f145930o.e();
                break;
            case 1:
                int i16 = HeartRateReportsActivity.f36641d;
                xb0.a.f189862b.getClass();
                xb0.a aVar2 = new xb0.a();
                aVar2.setCancelable(false);
                aVar2.show(heartRateReportsActivity.getSupportFragmentManager(), "");
                break;
            default:
                int i17 = HeartRateReportsActivity.f36641d;
                heartRateReportsActivity.getOnBackPressedDispatcher().d();
                break;
        }
        return Unit.INSTANCE;
    }
}
