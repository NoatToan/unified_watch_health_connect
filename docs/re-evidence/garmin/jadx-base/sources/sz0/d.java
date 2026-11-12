package sz0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class d {
    public static void a() {
        com.garmin.android.apps.connectmobile.segments.presentation.g gVarA;
        com.garmin.android.apps.connectmobile.segments.presentation.g.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b;
        synchronized (com.garmin.android.apps.connectmobile.segments.presentation.g.class) {
            gVarA = com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b.a();
        }
        if (gVarA.a().isEmpty()) {
            return;
        }
        c.b().a(b.a(b.a.STRAVA_PROMO));
    }

    public static void b() {
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE == null || arrayListE.isEmpty()) {
            return;
        }
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            if (km2.a.d(((sd2.f) it.next()).getUnitID(), km2.a.c())) {
                c.b().a(b.a(b.a.STRAVA_LIVE_SUFFER_SCORE));
                com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_strava_live_suffer_score_app_notification_created, GCMSettingManager.f41536b.edit(), true);
                return;
            }
        }
    }

    public static void c() {
        c.b().a(b.a(b.a.CATCH_UP_FEATURES));
        c.b().a(b.a(b.a.CHALLENGES));
        c.b().a(b.a(b.a.LIVETRACK_AUTOSTART));
        c.b().a(b.a(b.a.STRAVA_BEACON));
        c.b().a(b.a(b.a.TRUEUP));
        c.b().a(b.a(b.a.MICROSOFT_OFFICE_365_SYNC));
        a();
        b();
    }
}
