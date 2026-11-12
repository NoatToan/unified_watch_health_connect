package ty1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lty1/j0;", "Lcom/garmin/android/apps/connectmobile/o1$a;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements com.garmin.android.apps.connectmobile.o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.j f167143a;

    public j0(com.garmin.android.apps.connectmobile.traininginitiative.ui.j jVar) {
        this.f167143a = jVar;
    }

    @Override // com.garmin.android.apps.connectmobile.o1.a
    public final void a(boolean z14) {
        gg0.f fVar;
        DateTime dateTimeNow;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.j jVar = this.f167143a;
        if (!z14) {
            com.garmin.android.apps.connectmobile.traininginitiative.ui.j.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.j.f46094h;
            AddTIEventViewModel addTIEventViewModelA6 = jVar.A6();
            fg0.u uVar = jVar.A6().f204397n;
            if (uVar == null || (fVar = uVar.f71349a) == null) {
                fVar = gg0.f.f77130f;
            }
            addTIEventViewModelA6.x6(fVar);
            return;
        }
        Calendar calendar = Calendar.getInstance();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.j.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.j.f46094h;
        fg0.u uVar2 = jVar.A6().f204397n;
        if (uVar2 == null || (dateTimeNow = uVar2.f71354f) == null) {
            dateTimeNow = DateTime.now();
        }
        calendar.set(dateTimeNow.getYear(), dateTimeNow.getMonthOfYear(), dateTimeNow.getDayOfMonth());
        calendar.setTime(dateTimeNow.toDate());
        MaterialCalendarView materialCalendarView = jVar.f46099f;
        if (materialCalendarView == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        materialCalendarView.setSelectedDate(calendar);
        MaterialCalendarView materialCalendarView2 = jVar.f46099f;
        if (materialCalendarView2 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        materialCalendarView2.setCurrentDate(calendar);
        MaterialCalendarView materialCalendarView3 = jVar.f46099f;
        if (materialCalendarView3 != null) {
            materialCalendarView3.f();
        } else {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
    }
}
