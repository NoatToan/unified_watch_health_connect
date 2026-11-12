package jw;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.webkit.CookieManager;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.reminders.MenstrualCycleReminders;
import com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v1;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import com.garmin.device.datatypes.DeviceProfile;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.util.ArrayList;
import java.util.Iterator;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p13.j0;
import zd0.g1;
import zd0.j1;

/* JADX INFO: loaded from: classes7.dex */
public class b0 extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Logger f101227i;

    public class a implements t13.d<Boolean> {
        public a(b0 b0Var) {
        }

        @Override // t13.d
        /* JADX INFO: renamed from: getContext */
        public final t13.g getF157466b() {
            return t13.h.f161748a;
        }

        @Override // t13.d
        public final void resumeWith(Object obj) {
        }
    }

    public b0(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
        super(bVar);
        int i14 = gt2.c.f79010a;
        this.f101227i = gt2.b.f79005a.h("PurgeDataTask");
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        Logger logger = this.f101227i;
        try {
            logger.debug("Starting clearing user cached data.");
            ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).b();
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            bVar.v();
            if (bVar.h().name().equals("CHINA")) {
                GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_country), "CN").apply();
            } else {
                GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_country), LocaleUnitResolver.ImperialCountryCode.US).apply();
            }
            wd2.m.f(GarminConnectMobileApp.f28688j, null);
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListD = rd2.j.d();
            if (arrayListD != null && !arrayListD.isEmpty()) {
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    GCMSettingManager.c(((sd2.f) it.next()).getUnitID());
                }
            }
            for (DeviceProfile deviceProfile : hk0.p.d()) {
                hk0.p.c().e(deviceProfile.getMacAddress());
                if (deviceProfile.getF92743g()) {
                    hk0.p.c().e(deviceProfile.getDualPairingMacAddress());
                }
                logger.debug("Call GDI to disconnect device with unit ID->" + deviceProfile.getF92746j());
            }
            ((m80.a) KoinJavaComponent.get$default(m80.a.class, null, null, 6, null)).c();
            v1 v1Var = v1.f47374a;
            Context context = GarminConnectMobileApp.f28688j;
            v1Var.getClass();
            v1.h(context);
            logger.debug("Terminate all device related services (GDI, Sync, Audio Prompts).");
            ok2.a0.f().i();
            if (qd2.a.b() != null) {
                try {
                    qd2.a.b().f();
                } catch (SQLiteException e4) {
                    logger.error("GCMCacheManager database purge exception.", (Throwable) e4);
                }
            }
            p1.z<String> zVar = td2.a.f163901a;
            td2.a.f163901a = new p1.z<>();
            logger.debug("Database cache purged.");
            NotificationManager notificationManager = (NotificationManager) GarminConnectMobileApp.f28688j.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancelAll();
                logger.debug("Cancelled all Android notifications.");
            }
            yx0.b.f200016a.getClass();
            Object value = yx0.b.f200019d.getValue();
            value.getClass();
            SharedPreferences.Editor editorEdit = ((SharedPreferences) value).edit();
            editorEdit.remove("periodStartDates");
            editorEdit.apply();
            Context context2 = GarminConnectMobileApp.f28688j;
            MenstrualCycleReminders.f39205a.getClass();
            MenstrualCycleReminders.a.a(context2);
            logger.debug("Cleared Menstrual Cycle Tracking Reminders");
            GCMSettingManager.k().g();
            logger.debug("Reset GCS override map.");
            GCMSettingManager.B();
            logger.debug("Called sign-out on GCMSettingManager.");
            bo1.a aVarA = bo1.a.a();
            aVarA.f19238c = 0;
            aVarA.f19236a = null;
            logger.debug("Cleared intelligent user memory cache.");
            CacheDatabase cacheDatabaseI = CacheDatabase.i();
            cacheDatabaseI.e().deleteAll();
            cacheDatabaseI.f().deleteAll();
            cacheDatabaseI.j().b();
            cacheDatabaseI.h().deleteAll();
            cacheDatabaseI.g().deleteAll();
            logger.debug("Cleared 'Room' database cache.");
            kj0.c.f104941a.getClass();
            kj0.c.f104944d.signOut(GarminConnectMobileApp.f28688j);
            logger.debug("Notify GarminPay feature to clean itself up.");
            i31.b bVar2 = (i31.b) KoinJavaComponent.get$default(i31.b.class, null, null, 6, null);
            bVar2.getClass();
            ge1.b.W(t13.h.f161748a, new i31.a(bVar2, null));
            logger.debug("Cleared 'OnboardingRepository'.");
            ff2.c.f71140c.a(GarminConnectMobileApp.f28688j).f71143b.a(null);
            logger.debug("Cleared all data from promotion library.");
            ConnectDatabase.g().f().deleteAll();
            km2.a.j();
            logger.debug("Cleared device capabilities cache.");
            CookieManager.getInstance().removeAllCookies(null);
            logger.debug("Cleared Webview cookies");
            ((o31.a) KoinJavaComponent.get(o31.a.class)).getClass();
            logger.debug("Cleared in app update all local data.");
            iw2.w wVar = iw2.w.f95547a;
            Context context3 = GarminConnectMobileApp.f28688j;
            a aVar = new a(this);
            wVar.getClass();
            x53.c cVar = s0.f129406a;
            x53.b bVar3 = x53.b.f189152a;
            ge1.b.e0(bVar3, new iw2.h(context3, null), aVar);
            logger.debug("Cleared Real Time Settings directory.");
            Context context4 = GarminConnectMobileApp.f28688j;
            GCMUserPersistenceDatabase.f40309a.getClass();
            GCMUserPersistenceDatabase.a.a(context4).f().e();
            logger.debug("Cleared badge rewards unredeemed codes.");
            com.garmin.android.apps.connectmobile.newsfeed.a.f39474b.b();
            com.garmin.android.apps.connectmobile.newsfeed.a.f39475c.setValue(j0.f134944a);
            logger.debug("Cleared news feed cache.");
            fm0.a.f72093a.getClass();
            fm0.a.a();
            fm0.a.f72095c = null;
            fm0.a.f72096d = null;
            logger.debug("Cleared Apollo cache.");
            bz0.o.f22274a.l();
            a23.g.d(GarminConnectMobileApp.f28688j.getCacheDir());
            ((j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null)).a();
            ((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null)).a();
            bu.f fVar = bu.f.f21180a;
            Context context5 = GarminConnectMobileApp.f28688j;
            fVar.getClass();
            bu.f.k(context5);
            ((x01.i) KoinJavaComponent.get$default(x01.i.class, null, null, 6, null)).getClass();
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionStateProvider", "onLogout: resetting nutrition feature state");
            ge1.b.T(o53.c0.a(bVar3), null, null, new x01.g(null), 3);
            ((z70.j) KoinJavaComponent.get$default(z70.j.class, null, null, 6, null)).a();
            logger.debug("Finished clearing user cached data.");
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        } catch (Throwable th3) {
            logger.debug("Finished clearing user cached data.");
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            throw th3;
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}
