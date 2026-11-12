package zb0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 {
    public static final void a(Context context, int i14, String str, String str2, Intent intent, boolean z14) {
        context.getClass();
        str.getClass();
        str2.getClass();
        intent.getClass();
        b(context, i14, str, str2, new Intent[]{intent}, z14);
    }

    public static final void b(Context context, int i14, String str, String str2, Intent[] intentArr, boolean z14) {
        PendingIntent activity;
        ds.e0.p(context, str, str2);
        intentArr.getClass();
        sz0.e eVar = sz0.e.f161377p;
        if (z14) {
            ((Intent) p13.u.Q(intentArr)).setFlags(536870912);
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
            intent.setFlags(536870912);
            activity = TaskStackBuilder.create(context).addNextIntent(intent).addNextIntent((Intent) p13.u.Q(intentArr)).getPendingIntent(i14, 201326592);
        } else {
            activity = PendingIntent.getActivity(context, 0, (Intent) p13.u.Q(intentArr), 1140850688);
        }
        z6.q qVar = new z6.q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(str);
        qVar.f202684f = z6.q.e(str2);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(str2);
        qVar.l(oVar);
        qVar.f202691m = 1;
        qVar.i(16, true);
        qVar.f202686h = activity;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, i14, eVar);
    }
}
