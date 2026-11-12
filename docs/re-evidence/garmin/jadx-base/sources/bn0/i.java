package bn0;

import android.content.DialogInterface;
import android.content.Intent;
import ca0.o1;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.ScheduledEventsActivity;
import com.garmin.android.apps.connectmobile.s2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2 f19002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19003e;

    public /* synthetic */ i(ScheduledEventsActivity scheduledEventsActivity, String str, long j8, ab1.m mVar) {
        this.f18999a = 1;
        this.f19002d = scheduledEventsActivity;
        this.f19000b = str;
        this.f19001c = j8;
        this.f19003e = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f18999a;
        String str = this.f19000b;
        Object obj = this.f19003e;
        long j8 = this.f19001c;
        s2 s2Var = this.f19002d;
        switch (i15) {
            case 0:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) s2Var;
                String str2 = (String) obj;
                GroupRideShareActivity.a aVar = GroupRideShareActivity.f36417i;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                groupRideShareActivity.da(j8, str, str2);
                break;
            case 1:
                ScheduledEventsActivity scheduledEventsActivity = (ScheduledEventsActivity) s2Var;
                ab1.m mVar = (ab1.m) obj;
                ScheduledEventsActivity.a aVar2 = ScheduledEventsActivity.f40379d;
                CreatePowerGuideStrategyActivity.a aVar3 = CreatePowerGuideStrategyActivity.f40374b;
                Double dValueOf = Double.valueOf(mVar.f2607b);
                String str3 = mVar.f2606a;
                aVar3.getClass();
                str.getClass();
                Intent intent = new Intent(scheduledEventsActivity, (Class<?>) CreatePowerGuideStrategyActivity.class);
                intent.putExtra("GCM_extra_course_id", str);
                intent.putExtra("GCM_extra_power_guide_id_to_replace", j8);
                intent.putExtra("GCM_extra_event_distance", dValueOf);
                intent.putExtra("GCM_extra_event_name", str3);
                scheduledEventsActivity.startActivity(intent);
                scheduledEventsActivity.finish();
                break;
            default:
                dialogInterface.dismiss();
                DeviceSetupActivity.f33758b.c(((yo0.c) s2Var).f198339b, o1.ADD_DEVICE, new l90.d(Long.valueOf(j8), this.f19000b, (String) obj, false, 8, null), 0);
                break;
        }
    }

    public /* synthetic */ i(s2 s2Var, long j8, String str, String str2, int i14) {
        this.f18999a = i14;
        this.f19002d = s2Var;
        this.f19001c = j8;
        this.f19000b = str;
        this.f19003e = str2;
    }
}
