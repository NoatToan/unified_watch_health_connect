package s00;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/f0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends j {
    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        o13.p pVar;
        Intent intentA;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        String string = bundle.getString("pendingActivityUUID");
        String string2 = bundle.getString("pendingActivityDate");
        if (string == null || string2 == null || !GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_mobile_notifications_pa_uploads), true)) {
            if (string == null) {
                a2 a2Var = a2.PENDING_ACTIVITIES;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "PendingActivityUploadPushNotificationHandler", "Unable to post notification. pendingActivityId was invalid or missing.");
            }
            if (string2 == null) {
                a2 a2Var2 = a2.PENDING_ACTIVITIES;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "PendingActivityUploadPushNotificationHandler", "Unable to post notification. calendarDate was invalid or missing.");
                return;
            }
            return;
        }
        sz0.e eVar = sz0.e.R0;
        sz0.f.f161394a.getClass();
        StatusBarNotification[] activeNotifications = sz0.f.a.d(garminConnectMobileApp).getActiveNotifications();
        activeNotifications.getClass();
        boolean z14 = false;
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (p005kotlin.jvm.internal.s.g(statusBarNotification.getNotification().getChannelId(), "PENDING_ACTIVITIES_CHANNEL_ID")) {
                z14 = true;
                break;
            }
        }
        if (z14) {
            sz0.f.f161394a.getClass();
            sz0.f.a.b(garminConnectMobileApp);
        }
        int iD = z14 ? d(cVar) : string.hashCode();
        if (z14) {
            String string3 = garminConnectMobileApp.getString(R.string.lbl_auto_detected_activities);
            string3.getClass();
            pVar = new o13.p(string3, garminConnectMobileApp.getString(R.string.pn_activities_detected));
        } else {
            String string4 = garminConnectMobileApp.getString(R.string.lbl_auto_detected_activity);
            string4.getClass();
            pVar = new o13.p(string4, garminConnectMobileApp.getString(R.string.pn_pending_activity));
        }
        String str = (String) pVar.f128594a;
        String str2 = (String) pVar.f128595b;
        Intent intent = new Intent(garminConnectMobileApp, (Class<?>) DashboardActivity.class);
        intent.setFlags(536870912);
        if (z14) {
            PendingActivitiesActivity.a aVar = PendingActivitiesActivity.f39793d;
            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a c0723a = com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.INSTANCE;
            aVar.getClass();
            intentA = PendingActivitiesActivity.a.a(garminConnectMobileApp, c0723a);
        } else {
            PendingActivitiesActivity.a aVar2 = PendingActivitiesActivity.f39793d;
            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.b bVar = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.b(string, string2);
            aVar2.getClass();
            intentA = PendingActivitiesActivity.a.a(garminConnectMobileApp, bVar);
        }
        intentA.setFlags(536870912);
        j.e(garminConnectMobileApp, eVar, iD, str, str2, TaskStackBuilder.create(garminConnectMobileApp).addNextIntent(intent).addNextIntent(intentA).getPendingIntent(1, 201326592));
        sn.a.o(f12.l.f68084a, true);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.PENDING_ACTIVITY};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ls00/f0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PENDING_ACTIVITY_UUID", "PENDING_ACTIVITY_DATE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
