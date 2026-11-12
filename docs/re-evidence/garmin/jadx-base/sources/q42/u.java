package q42;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightActivity;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f142683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n82.f f142684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q f142685d;

    public /* synthetic */ u(Context context, n82.f fVar, c.q qVar, int i14) {
        this.f142682a = i14;
        this.f142683b = context;
        this.f142684c = fVar;
        this.f142685d = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f142682a) {
            case 0:
                AddWeightActivity.a aVar = AddWeightActivity.f48007c;
                LocalDate localDateH = g22.l.h(this.f142684c.b().f130843a);
                aVar.getClass();
                this.f142685d.a(AddWeightActivity.a.a(this.f142683b, localDateH), null);
                break;
            default:
                AddBloodPressureActivity.a aVar2 = AddBloodPressureActivity.f30909d;
                DateTime dateTimeAtStartOfDay = g22.l.h(this.f142684c.b().f130843a).toDateTimeAtStartOfDay();
                aVar2.getClass();
                Context context = this.f142683b;
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) AddBloodPressureActivity.class);
                if (dateTimeAtStartOfDay != null) {
                    intent.putExtra("extra.date.time", dateTimeAtStartOfDay.getMillis());
                }
                this.f142685d.a(intent, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
