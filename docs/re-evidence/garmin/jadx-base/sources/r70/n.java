package r70;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute$DeviceLink$$serializer;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute$HomeSettings$$serializer;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute$SelectHomeLayout$$serializer;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m63.f1;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import re2.l0;
import z10.g0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151087a;

    public /* synthetic */ n(int i14) {
        this.f151087a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f151087a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (i14) {
            case 0:
                return (n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null);
            case 1:
                DashboardRoute.Companion companion = DashboardRoute.INSTANCE;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute", t0Var.b(DashboardRoute.class), new k23.d[]{t0Var.b(DashboardRoute.ChooseFocus.class), t0Var.b(DashboardRoute.Dashboard.class), t0Var.b(DashboardRoute.DeviceLink.class), t0Var.b(DashboardRoute.EditEssentials.class), t0Var.b(DashboardRoute.EditInFocus.class), t0Var.b(DashboardRoute.EditSecondaryStats.class), t0Var.b(DashboardRoute.HomeSettings.class), t0Var.b(DashboardRoute.SecondaryStats.class), t0Var.b(DashboardRoute.SelectHomeLayout.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.ChooseFocus", DashboardRoute.ChooseFocus.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.Dashboard", DashboardRoute.Dashboard.INSTANCE, new Annotation[0]), DashboardRoute$DeviceLink$$serializer.f33493a, new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.EditEssentials", DashboardRoute.EditEssentials.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.EditInFocus", DashboardRoute.EditInFocus.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.EditSecondaryStats", DashboardRoute.EditSecondaryStats.INSTANCE, new Annotation[0]), DashboardRoute$HomeSettings$$serializer.f33498a, new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.SecondaryStats", DashboardRoute.SecondaryStats.INSTANCE, new Annotation[0]), DashboardRoute$SelectHomeLayout$$serializer.f33501a}, new Annotation[0]);
            case 2:
                return new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.ChooseFocus", DashboardRoute.ChooseFocus.INSTANCE, new Annotation[0]);
            case 3:
                return new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.Dashboard", DashboardRoute.Dashboard.INSTANCE, new Annotation[0]);
            case 4:
                return new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.EditEssentials", DashboardRoute.EditEssentials.INSTANCE, new Annotation[0]);
            case 5:
                return new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.EditInFocus", DashboardRoute.EditInFocus.INSTANCE, new Annotation[0]);
            case 6:
                return new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.EditSecondaryStats", DashboardRoute.EditSecondaryStats.INSTANCE, new Annotation[0]);
            case 7:
                return new f1("com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute.SecondaryStats", DashboardRoute.SecondaryStats.INSTANCE, new Annotation[0]);
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                r92.f.f151442a.getClass();
                OkHttpClient.Builder builderAuthenticator = new OkHttpClient.Builder().connectTimeout(30L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).authenticator(new r92.h());
                p92.o.f136619a.getClass();
                OkHttpClient.Builder builderAddInterceptor = builderAuthenticator.addInterceptor(new id2.o(((g0) p92.o.l()).f201004a, null, null, 6, null));
                p92.o.l();
                return builderAddInterceptor.addInterceptor(new r92.c(11657)).addInterceptor(new r92.g()).build();
            case 12:
                r92.f.f151442a.getClass();
                OkHttpClient.Builder timeout = new OkHttpClient.Builder().connectTimeout(30L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit);
                p92.o.f136619a.getClass();
                OkHttpClient.Builder builderAddInterceptor2 = timeout.addInterceptor(new id2.o(((g0) p92.o.l()).f201004a, null, null, 6, null));
                p92.o.l();
                OkHttpClient.Builder builderAddInterceptor3 = builderAddInterceptor2.addInterceptor(new r92.c(11657)).addInterceptor(new r92.d(new n(13)));
                int i15 = gt2.c.f79010a;
                return builderAddInterceptor3.addInterceptor(new r92.i(new r92.e(gt2.b.f79005a.i("GConsentLib")))).build();
            case 13:
                r92.f fVar = r92.f.f151442a;
                p92.o.f136619a.getClass();
                return Boolean.valueOf(((g0) p92.o.l()).g());
            case 14:
                rb0.a aVar = rb0.a.f151536a;
                return Unit.INSTANCE;
            case 15:
                PregnancyStopTrackingActivity.a aVar2 = PregnancyStopTrackingActivity.f41001d;
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyStopTrackingActivity");
            case 16:
                int i17 = rb1.f.f151604h;
                int i18 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyStopTrackingCalendarFragment");
            case 17:
                int i19 = rb1.g.f151619k;
                return new y0();
            case 18:
                int i24 = rb1.g.f151619k;
                return new y0();
            case 19:
                int i25 = rb1.g.f151619k;
                return new y0();
            case 20:
                int i26 = rb1.g.f151619k;
                return new y0();
            case 21:
                ve2.l lVar = re2.b.f152220f;
                if (lVar != null) {
                    return lVar;
                }
                kg.f.n("library not initialized");
                return null;
            case 22:
                String str = re2.b.f152222h;
                if (str != null) {
                    return str;
                }
                kg.f.n("library not initialized");
                return null;
            case 23:
                String str2 = re2.b.f152224j;
                if (str2 != null) {
                    return str2;
                }
                kg.f.n("library not initialized");
                return null;
            case 24:
                re2.b bVar = re2.b.f152215a;
                return new cz2.c();
            case 25:
                re2.b bVar2 = re2.b.f152215a;
                return new cz2.c();
            case 26:
                re2.b bVar3 = re2.b.f152215a;
                return new cz2.c();
            case 27:
                re2.b bVar4 = re2.b.f152215a;
                return new cz2.c();
            case 28:
                re2.b bVar5 = re2.b.f152215a;
                return new cz2.c();
            default:
                l0 l0Var = l0.f152316a;
                return new SimpleDateFormat("E MMM d, yyyy h:mm:ss z", Locale.US);
        }
    }
}
