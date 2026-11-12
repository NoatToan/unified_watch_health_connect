package ho0;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.room.a0;
import bz0.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardActivity;
import ht.s;
import hz0.j0;
import java.io.File;
import java.io.IOException;
import kd0.i6;
import kd0.x0;
import o70.t;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f84700b;

    public /* synthetic */ a(Context context, int i14) {
        this.f84699a = i14;
        this.f84700b = context;
    }

    @Override // e23.a
    public final Object invoke() throws IOException {
        int i14 = this.f84699a;
        Context context = this.f84700b;
        switch (i14) {
            case 0:
                b bVar = b.f84701a;
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.HEART_RATE_ZONES;
                aVar.getClass();
                HelpActivity.a.d(context, lVar, "DEFAULT_ACTION", null);
                return Unit.INSTANCE;
            case 1:
                int i15 = h.f84713l;
                tn1.e.a(context, tn1.d.HEART_RATE, tn1.f.HELP);
                return Unit.INSTANCE;
            case 2:
                int i16 = NewsFeedViewModel.f39455j;
                return context;
            case 3:
                int i17 = j0.f86452c;
                o.f22274a.getClass();
                OkHttpClient.Builder builderNewBuilder = o.j().newBuilder();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                return builderNewBuilder.addInterceptor(new pz0.b(applicationContext)).build();
            case 4:
                int i18 = ib0.g.f92463l;
                File fileCreateTempFile = File.createTempFile("captured", ".jpg", context.getCacheDir());
                fileCreateTempFile.deleteOnExit();
                return FileProvider.d(context, "GarminConnectMobileApp.provider", fileCreateTempFile);
            case 5:
                int i19 = id2.o.f93064d;
                return wc2.c.a(context);
            case 6:
                s sVar = s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.f130077v);
                sVar.getClass();
                s.a(kVar);
                context.startActivity(dh.b.z(HeartRateReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 7:
                s sVar2 = s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedTop, t.f130077v);
                sVar2.getClass();
                s.a(kVar2);
                context.startActivity(dh.b.z(HeartRateReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 8:
                HelpActivity.a.e(HelpActivity.f36653a, this.f84700b, ro0.l.TRAIL_POPULARITY, null, null, 12);
                return Unit.INSTANCE;
            case 9:
                int i24 = ix.f.f95592j;
                tn1.e.a(context, tn1.d.BODY_BATTERY, tn1.f.HELP);
                return Unit.INSTANCE;
            case 10:
                tn1.e.a(context, tn1.d.BODY_BATTERY, tn1.f.BANNER);
                return Unit.INSTANCE;
            case 11:
                iz1.a aVar2 = iz1.a.f95860a;
                a0.r(context, EventDashBoardActivity.class);
                return Unit.INSTANCE;
            case 12:
                s sVar3 = s.f85508a;
                lt.e.C2183e c2183e = new lt.e.C2183e(lt.e.a.Tapped, o70.i.f130004l);
                sVar3.getClass();
                s.a(c2183e);
                context.startActivity(dh.b.z(OvernightHrvActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 13:
                s sVar4 = s.f85508a;
                lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.A);
                sVar4.getClass();
                s.a(kVar3);
                OvernightHrvActivity.f39738n.getClass();
                context.getClass();
                context.startActivity(OvernightHrvActivity.a.a(context, null, null));
                return Unit.INSTANCE;
            case 14:
                s sVar5 = s.f85508a;
                lt.e.k kVar4 = new lt.e.k(lt.e.a.TappedBottom, t.A);
                sVar5.getClass();
                s.a(kVar4);
                OvernightHrvActivity.a aVar3 = OvernightHrvActivity.f39738n;
                DateTime dateTimeNow = DateTime.now();
                e32.o oVar = e32.o.f62808k;
                aVar3.getClass();
                context.startActivity(OvernightHrvActivity.a.a(context, dateTimeNow, oVar));
                return Unit.INSTANCE;
            case 15:
                s sVar6 = s.f85508a;
                lt.e.k kVar5 = new lt.e.k(lt.e.a.Tapped, t.X);
                sVar6.getClass();
                s.a(kVar5);
                context.startActivity(dh.b.z(PulseOxActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 16:
                s sVar7 = s.f85508a;
                lt.e.k kVar6 = new lt.e.k(lt.e.a.Tapped, t.X);
                sVar7.getClass();
                s.a(kVar6);
                ic1.e eVar = (ic1.e) KoinJavaComponent.get$default(ic1.e.class, null, null, 6, null);
                DateTime dateTimeNow2 = DateTime.now();
                dateTimeNow2.getClass();
                eVar.c(context, dateTimeNow2);
                return Unit.INSTANCE;
            case 17:
                int i25 = x0.f104416e;
                a0.r(context, ManageFamilyActivity.class);
                return Unit.INSTANCE;
            case 18:
                int i26 = x0.f104416e;
                context.startActivity(AuthorizedViewersActivity.a.a(AuthorizedViewersActivity.f34974m, context));
                return Unit.INSTANCE;
            case 19:
                int i27 = i6.f104121g;
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachIntensityMinutesView");
                context.startActivity(IntensityMinutesReportsActivity.a.b(IntensityMinutesReportsActivity.f36935b, context, DateTime.now()));
                return Unit.INSTANCE;
            case 20:
                int i28 = i6.f104121g;
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachIntensityMinutesView");
                IntensityMinutesReportsActivity.a aVar4 = IntensityMinutesReportsActivity.f36935b;
                DateTime dateTimeNow3 = DateTime.now();
                o82.g gVar = o82.g.f130851d;
                aVar4.getClass();
                context.startActivity(IntensityMinutesReportsActivity.a.a(context, dateTimeNow3, gVar));
                return Unit.INSTANCE;
            case 21:
                int i29 = i6.f104121g;
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachIntensityMinutesView");
                context.startActivity(IntensityMinutesReportsActivity.a.b(IntensityMinutesReportsActivity.f36935b, context, DateTime.now()));
                return Unit.INSTANCE;
            case 22:
                Toast.makeText(context, R.string.lbl_error_occurred, 0).show();
                return Unit.INSTANCE;
            case 23:
                Toast.makeText(context, R.string.lbl_error_occurred, 0).show();
                return Unit.INSTANCE;
            case 24:
                dv0.j.f61394i.getClass();
                dv0.j jVar = new dv0.j();
                context.getClass();
                jVar.show(((androidx.fragment.app.m) context).getSupportFragmentManager(), "PROFILE_BOTTOM_SHEET");
                return Unit.INSTANCE;
            case 25:
                LiveTrackActivity.f38637g.c(context, null);
                return Unit.INSTANCE;
            case 26:
                LiveTrackActivity.f38637g.c(context, null);
                return Unit.INSTANCE;
            case 27:
                MultiDayActivitiesListActivity.f39318c.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) MultiDayActivitiesListActivity.class);
                intent.putExtra("SELF_INVOKE", true);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 28:
                MultiDayActivitiesListActivity.f39318c.getClass();
                context.getClass();
                Intent intent2 = new Intent(context, (Class<?>) MultiDayActivitiesListActivity.class);
                intent2.putExtra("SELF_INVOKE", true);
                context.startActivity(intent2);
                return Unit.INSTANCE;
            default:
                s sVar8 = s.f85508a;
                lt.e.g gVar2 = new lt.e.g(lt.e.a.TappedTop, o70.o.TRAINING_STATUS);
                sVar8.getClass();
                s.a(gVar2);
                TrainingStatusSummaryActivity.f40068w.getClass();
                TrainingStatusSummaryActivity.a.b(context, false);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(x0 x0Var, Context context, int i14) {
        this.f84699a = i14;
        this.f84700b = context;
    }
}
