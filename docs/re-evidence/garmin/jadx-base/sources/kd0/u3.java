package kd0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/u3;", "Lvi1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u3 implements vi1.a {
    @Override // vi1.a
    public final vi1.c a() {
        return new vi1.c((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // vi1.a
    public final void b(long j8, boolean z14) {
        String string;
        String string2;
        String string3;
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null || (string = fVarI.getDisplayName()) == null) {
            string = contextA.getString(R.string.no_value);
            string.getClass();
        }
        if (z14) {
            string2 = contextA.getString(R.string.lbl_assistance_plus_enabled);
            string2.getClass();
            string3 = contextA.getString(R.string.assistance_plus_enabled_geofencing_msg, string, contextA.getString(R.string.assistance_plus_this_country));
            string3.getClass();
        } else {
            string2 = contextA.getString(R.string.lbl_assistance_plus_disabled);
            string2.getClass();
            string3 = contextA.getString(R.string.assistance_plus_contacts_disabled_geofencing_msg, string, contextA.getString(R.string.assistance_plus_this_country));
            string3.getClass();
        }
        a().r(string2, string3);
        Intent intent = new Intent(contextA, (Class<?>) SafetyFeaturesActivity.class);
        intent.addFlags(335544320);
        sz0.e eVar = sz0.e.f161383x;
        z6.q qVar = new z6.q(contextA, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(string2);
        qVar.f202684f = z6.q.e(string3);
        qVar.i(16, true);
        qVar.B = "service";
        qVar.f202691m = 0;
        qVar.D = a7.b.getColor(contextA, R.color.gcm_text_primary_action);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(string3);
        qVar.l(oVar);
        qVar.f202686h = PendingIntent.getActivity(contextA, 0, intent, 1140850688);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(contextA, notificationC, 32, eVar);
    }

    @Override // vi1.a
    public final void c(long j8, PendingIntent pendingIntent) {
        String string;
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null || (string = fVarI.getProductDisplayName()) == null) {
            string = contextA.getString(R.string.no_value);
            string.getClass();
        }
        sz0.e eVar = sz0.e.f161383x;
        z6.q qVar = new z6.q(contextA, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(contextA.getString(R.string.lte_activated_notification_title));
        qVar.f202684f = z6.q.e(contextA.getString(R.string.lte_device_active_lte_subscription, string));
        qVar.f202686h = pendingIntent;
        qVar.i(16, true);
        qVar.B = "service";
        qVar.f202691m = 0;
        qVar.D = a7.b.getColor(contextA, R.color.gcm_text_primary_action);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(contextA.getString(R.string.lte_device_active_lte_subscription, string));
        qVar.l(oVar);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(contextA, notificationC, 32, eVar);
    }

    @Override // vi1.a
    public final t3 d() {
        return new t3();
    }

    @Override // vi1.a
    public final s3 e() {
        return new s3();
    }
}
