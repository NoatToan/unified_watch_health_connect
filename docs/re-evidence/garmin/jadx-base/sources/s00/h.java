package s00;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls00/h;", "Ls00/j;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends j {
    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        String string = garminConnectMobileApp.getString(R.string.common_garmin_connect);
        string.getClass();
        String string2 = garminConnectMobileApp.getString(R.string.you_have_authorized_viewers);
        string2.getClass();
        Intent intentA = AuthorizedViewersActivity.a.a(AuthorizedViewersActivity.f34974m, garminConnectMobileApp);
        intentA.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(garminConnectMobileApp, 0, intentA, 1140850688);
        sz0.e eVar = sz0.e.f161383x;
        z6.q qVar = new z6.q(garminConnectMobileApp, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.g(string);
        qVar.f(string2);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(string2);
        qVar.l(oVar);
        qVar.i(16, true);
        qVar.B = "social";
        qVar.f202691m = 0;
        qVar.f202686h = activity;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.a aVar = sz0.f.f161394a;
        int iD = d(n00.c.AUTHORIZED_VIEWER_REMINDER);
        aVar.getClass();
        sz0.f.a.f(garminConnectMobileApp, notificationC, iD, eVar);
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.AUTHORIZED_VIEWER_REMINDER};
    }
}
