package zb0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f203623b;

    public r0(Context context, long j8) {
        this.f203622a = context;
        this.f203623b = j8;
    }

    public final void a(boolean z14) {
        PendingIntent activities;
        int i14 = z14 ? R.string.edge_connection_established_lbl : R.string.edge_connection_lost_lbl;
        Context context = this.f203622a;
        String string = context.getString(i14);
        String string2 = context.getString(z14 ? R.string.edge_connection_established_description : R.string.edge_connection_lost_description);
        z6.q qVar = new z6.q(context, sz0.e.f161381v.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(string);
        qVar.f202684f = z6.q.e(string2);
        int i15 = 0;
        qVar.f202691m = 0;
        qVar.i(16, true);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(string2);
        qVar.l(oVar);
        long j8 = this.f203623b;
        if (z14) {
            Intent intentD = l2.d(context, DeviceDetailsActivity.class, "GCM_deviceUnitID", j8);
            intentD.putExtra("GCM_extra_find_my_edge_notification", true);
            activities = PendingIntent.getActivity(context, 0, intentD, 201326592);
        } else {
            com.garmin.android.apps.connectmobile.navigation.b.b();
            Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
            Intent intentD2 = l2.d(context, DeviceDetailsActivity.class, "GCM_deviceUnitID", j8);
            intentD2.putExtra("LAUNCH_MAPS", true);
            activities = PendingIntent.getActivities(context, 0, new Intent[]{intent, intentD2}, 201326592);
        }
        qVar.f202686h = activities;
        Notification notificationC = qVar.c();
        while (j8 != 0) {
            int i16 = (int) (j8 % 10);
            j8 /= 10;
            i15 += i16;
        }
        sz0.e eVar = sz0.e.f161381v;
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, i15 + 23, eVar);
    }
}
