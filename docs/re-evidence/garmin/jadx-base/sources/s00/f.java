package s00;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/f;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f155294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f155295b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s00/f$b", "Landroid/content/BroadcastReceiver;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                f fVar = f.this;
                if (iHashCode != 754193783) {
                    if (iHashCode == 1893979211 && action.equals("ACTIVITY_DETAILS_CLOSE")) {
                        fVar.f155294a = false;
                        return;
                    }
                    return;
                }
                if (action.equals("ACTIVITY_DETAILS_OPEN")) {
                    fVar.f155294a = true;
                    Bundle extras = intent.getExtras();
                    fVar.f155295b = extras != null ? extras.getLong("activityId") : 0L;
                }
            }
        }
    }

    static {
        new a(null);
    }

    public f() {
        b bVar = new b();
        GarminConnectMobileApp.f28685g.getClass();
        z9.a aVarA = z9.a.a(GarminConnectMobileApp.a.a());
        aVarA.getClass();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTIVITY_DETAILS_OPEN");
        intentFilter.addAction("ACTIVITY_DETAILS_CLOSE");
        aVarA.b(intentFilter, bVar);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        String string;
        Intent intentA;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        String string2 = bundle.getString("activity-id");
        Long lJ = string2 != null ? d53.t.j(string2) : null;
        if (lJ == null || !GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_mobile_notifications_activity_uploads), true)) {
            if (lJ == null) {
                a2 a2Var = a2.ACTIVITIES;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "ActivityUploadPushNotificationHandler", "Unable to post notification. activityId was invalid or missing.");
                return;
            }
            return;
        }
        if (this.f155294a) {
            if (lJ.longValue() == this.f155295b) {
                GarminConnectMobileApp.f28685g.getClass();
                z9.a.a(GarminConnectMobileApp.a.a()).c(new Intent("ACTIVITY_DETAILS_REFRESH"));
                return;
            }
        }
        Object systemService = garminConnectMobileApp.getSystemService("notification");
        systemService.getClass();
        sz0.e eVar = sz0.e.f161379r;
        int iD = d(cVar);
        String string3 = garminConnectMobileApp.getString(R.string.launcher_name_garmin_connect);
        string3.getClass();
        StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
        activeNotifications.getClass();
        int length = activeNotifications.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                string = garminConnectMobileApp.getString(R.string.activities_single_upload_finished_notification_message);
                string.getClass();
                aq.b bVar = new aq.b();
                bVar.f11823b = lJ.longValue();
                am.h hVar = am.h.VIEW_EDIT;
                if (hVar != null) {
                    bVar.f11824c = hVar;
                }
                intentA = bVar.a(garminConnectMobileApp);
                break;
            }
            if (activeNotifications[i14].getId() == iD) {
                string = garminConnectMobileApp.getString(R.string.activities_multiple_upload_finished_notification_message);
                string.getClass();
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                intentA = com.garmin.android.apps.connectmobile.navigation.b.a.a(garminConnectMobileApp, ActivitiesListActivity.class, null);
                am.g gVar = am.g.f3942f;
                gVar.getClass();
                intentA.putExtra("activity_list_mode", (Parcelable) gVar).getClass();
                break;
            }
            i14++;
        }
        String str = string;
        intentA.setFlags(536870912);
        j.e(garminConnectMobileApp, eVar, iD, string3, str, PendingIntent.getActivity(garminConnectMobileApp, 1, intentA, 201326592));
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.ACTIVITY_UPLOADED};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls00/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTIVITY_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
