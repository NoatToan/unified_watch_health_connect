package m62;

import android.view.View;
import com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeActivity;
import lp2.h;

/* JADX INFO: loaded from: classes9.dex */
public class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f116905b;

    public f(g.a aVar, int i14) {
        this.f116905b = aVar;
        this.f116904a = i14;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        g.a aVar = this.f116905b;
        aVar.f116910b.toggle();
        e eVar = aVar.f116911c;
        if (eVar != null) {
            boolean zIsChecked = aVar.f116910b.isChecked();
            g gVar = eVar.f116903a;
            h hVar = gVar.f116907b;
            if (hVar != null) {
                int i14 = gVar.f116908c;
                if (i14 != -1) {
                    gVar.f116906a.get(i14);
                }
                ScheduleWorkoutTypeActivity scheduleWorkoutTypeActivity = (ScheduleWorkoutTypeActivity) hVar.f114244b;
                int i15 = ScheduleWorkoutTypeActivity.f49542g;
                scheduleWorkoutTypeActivity.invalidateOptionsMenu();
                if (zIsChecked) {
                    scheduleWorkoutTypeActivity.f49547e.setChecked(false);
                }
            }
            if (zIsChecked) {
                gVar.f116908c = this.f116904a;
            } else {
                gVar.f116908c = -1;
            }
        }
    }
}
