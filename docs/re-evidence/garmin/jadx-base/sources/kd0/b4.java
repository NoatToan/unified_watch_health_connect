package kd0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkd0/b4;", "Leg2/a;", "Ltf2/g;", "activityInfoDataSource", "Lbu0/a;", "addActivityRecordingNotificationGroup", "<init>", "(Ltf2/g;Lbu0/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b4 implements eg2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf2.g f103999a;

    public b4(tf2.g gVar, bu0.a aVar) {
        gVar.getClass();
        aVar.getClass();
        this.f103999a = gVar;
    }

    public static PendingIntent e(Context context) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
        intent.setFlags(335544320);
        LiveActivityActivity.f50544d.getClass();
        Intent intentA = LiveActivityActivity.a.a(context);
        intentA.setFlags(536870912);
        z6.h0 h0VarE = z6.h0.e(context);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        arrayList.add(intent);
        arrayList.add(intentA);
        return h0VarE.f();
    }

    @Override // eg2.a
    public final Notification a(Context context, eg2.b bVar) {
        context.getClass();
        bVar.getClass();
        sz0.f.a aVar = sz0.f.f161394a;
        sz0.e eVar = sz0.e.K0;
        aVar.getClass();
        sz0.f.a.c(context, eVar);
        return Build.VERSION.SDK_INT >= 37 ? c(context, false, bVar) : d(context, false, bVar);
    }

    @Override // eg2.a
    public final Notification b(Context context, eg2.b bVar) {
        context.getClass();
        bVar.getClass();
        eg2.c cVar = bVar.f64007a;
        if (cVar == eg2.c.ACTIVITY_UPDATED) {
            return null;
        }
        boolean z14 = cVar == eg2.c.ACTIVITY_PAUSED || cVar == eg2.c.ACTIVITY_ENDED;
        return Build.VERSION.SDK_INT >= 37 ? c(context, z14, bVar) : d(context, z14, bVar);
    }

    public final Notification c(Context context, boolean z14, eg2.b bVar) {
        Notification.Metric metric;
        zf2.d dVar = bVar.f64009c;
        long j8 = bVar.f64010d;
        String strD = this.f103999a.d(dVar);
        if (z14) {
            Notification.Metric.TimeDifference timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forPausedStopwatch(Duration.ofMillis(j8), 2);
            String string = context.getString(R.string.lbl_time_elapsed);
            string.getClass();
            metric = new Notification.Metric(timeDifferenceForPausedStopwatch, "\u200b\u200c\u200b".concat(string));
        } else {
            Notification.Metric.TimeDifference timeDifferenceForStopwatch = Notification.Metric.TimeDifference.forStopwatch(SystemClock.elapsedRealtime() - j8, 2);
            String string2 = context.getString(R.string.lbl_time_elapsed);
            string2.getClass();
            metric = new Notification.Metric(timeDifferenceForStopwatch, "\u200b\u200c\u200b".concat(string2));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.requestPromotedOngoing", true);
        Notification.Builder builderAddExtras = new Notification.Builder(context, sz0.e.K0.f161386a).setSmallIcon(2131232010).setContentTitle("\u200b\u200c\u200b".concat(strD)).setContentIntent(e(context)).setOngoing(!z14).setOnlyAlertOnce(true).setShowWhen(false).setCategory("service").setVisibility(1).setStyle(new Notification.MetricStyle().addMetric(metric)).addExtras(bundle);
        builderAddExtras.getClass();
        builderAddExtras.setGroup("notification_group_activity_recording");
        builderAddExtras.setGroupSummary(false);
        Notification notificationBuild = builderAddExtras.build();
        notificationBuild.getClass();
        return notificationBuild;
    }

    public final Notification d(Context context, boolean z14, eg2.b bVar) {
        String str;
        String strD = this.f103999a.d(bVar.f64009c);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = bVar.f64010d;
        z6.q qVar = new z6.q(context, sz0.e.K0.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = z6.q.e("\u200b\u200c\u200b".concat(strD));
        qVar.f202686h = e(context);
        boolean z15 = !z14;
        qVar.f202693o = z15;
        qVar.f202692n = z15;
        notification.when = jCurrentTimeMillis - j8;
        qVar.i(2, z15);
        qVar.i(8, true);
        qVar.B = "service";
        qVar.f202691m = 1;
        qVar.E = 1;
        if (z14) {
            c22.j0.f23099a.getClass();
            long j14 = j8 / ((long) 1000);
            long j15 = DateTimeConstants.SECONDS_PER_HOUR;
            long j16 = j14 / j15;
            long j17 = 60;
            long j18 = (j14 % j15) / j17;
            long j19 = j14 % j17;
            if (j16 > 0) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                str = String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j16), Long.valueOf(j18), Long.valueOf(j19)}, 3));
            } else {
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j18), Long.valueOf(j19)}, 2));
            }
            String strConcat = "\u200b\u200c\u200b".concat(str);
            z6.o oVar = new z6.o();
            oVar.f202664e = z6.q.e(strConcat);
            qVar.l(oVar);
        }
        int i14 = bu0.a.f21190a;
        qVar.f202700v = "notification_group_activity_recording";
        qVar.f202701w = false;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        return notificationC;
    }
}
