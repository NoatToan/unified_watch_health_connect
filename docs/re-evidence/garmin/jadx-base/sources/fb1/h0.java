package fb1;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n f70246b;

    public /* synthetic */ h0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n nVar, int i14) {
        this.f70245a = i14;
        this.f70246b = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f70245a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n nVar = this.f70246b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n.f40726p;
                LocalDate localDate = (LocalDate) nVar.f40741o.getValue();
                DateTime dateTimeAtStartOfDay = localDate != null ? localDate.toDateTimeAtStartOfDay(DateTimeZone.getDefault()) : null;
                Context context = nVar.getContext();
                if (context != null) {
                    nVar.startActivity(dh.b.z(WeightReportsActivity.class, context, dateTimeAtStartOfDay, true));
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n.f40726p;
                Toast.makeText(nVar.getContext(), "Navigate to Calendar page", 0).show();
                break;
        }
    }
}
