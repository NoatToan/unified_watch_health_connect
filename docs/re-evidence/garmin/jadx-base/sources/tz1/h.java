package tz1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.room.a0;
import c80.q;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideEnabledActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightActivity;
import e32.o;
import ht.s;
import java.util.Date;
import o70.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.p0;
import ro0.l;
import xz0.p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f167305b;

    public /* synthetic */ h(Context context, int i14) {
        this.f167304a = i14;
        this.f167305b = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f167304a;
        Context context = this.f167305b;
        switch (i14) {
            case 0:
                s sVar = s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.Tapped, t.L0);
                sVar.getClass();
                s.a(kVar);
                context.startActivity(dh.b.z(TrainingReadinessActivity.class, context, null, false));
                return Unit.INSTANCE;
            case 1:
                return p0.n(Boolean.valueOf(zg2.d.a(context)));
            case 2:
                s sVar2 = s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedTop, t.f130064h);
                sVar2.getClass();
                s.a(kVar2);
                context.startActivity(dh.b.z(BloodPressureReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 3:
                s sVar3 = s.f85508a;
                lt.e.k kVar3 = new lt.e.k(lt.e.a.Add, t.f130064h);
                sVar3.getClass();
                s.a(kVar3);
                AddBloodPressureActivity.a aVar = AddBloodPressureActivity.f30909d;
                DateTime dateTimeNow = DateTime.now();
                aVar.getClass();
                AddBloodPressureActivity.a.a(context, dateTimeNow);
                return Unit.INSTANCE;
            case 4:
                s sVar4 = s.f85508a;
                lt.e.k kVar4 = new lt.e.k(lt.e.a.TappedBottom, t.f130064h);
                sVar4.getClass();
                s.a(kVar4);
                context.startActivity(dh.b.z(BloodPressureReportsActivity.class, context, DateTime.now(), true));
                return Unit.INSTANCE;
            case 5:
                AddBloodPressureActivity.a aVar2 = AddBloodPressureActivity.f30909d;
                DateTime dateTimeNow2 = DateTime.now();
                aVar2.getClass();
                AddBloodPressureActivity.a.a(context, dateTimeNow2);
                return Unit.INSTANCE;
            case 6:
                s sVar5 = s.f85508a;
                lt.e.k kVar5 = new lt.e.k(lt.e.a.Tapped, t.f130066j);
                sVar5.getClass();
                s.a(kVar5);
                Intent intent = new Intent(context, (Class<?>) CaloriesReportsActivity.class);
                intent.putExtra("extra.date.time", new Date());
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 7:
                AddWeightActivity.a aVar3 = AddWeightActivity.f48007c;
                LocalDate localDateNow = LocalDate.now();
                aVar3.getClass();
                context.getClass();
                context.startActivity(AddWeightActivity.a.a(context, localDateNow));
                return Unit.INSTANCE;
            case 8:
                AddWeightActivity.a aVar4 = AddWeightActivity.f48007c;
                LocalDate localDateNow2 = LocalDate.now();
                aVar4.getClass();
                context.getClass();
                context.startActivity(AddWeightActivity.a.a(context, localDateNow2));
                return Unit.INSTANCE;
            case 9:
                int i15 = vu0.j.f180247o;
                context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context, q.LIVE_TRACK_PLUS, false));
                return Unit.INSTANCE;
            case 10:
                int i16 = vu0.j.f180247o;
                HelpActivity.a aVar5 = HelpActivity.f36653a;
                l lVar = l.LIVETRACK;
                context.getClass();
                Bundle extras = ((Activity) context).getIntent().getExtras();
                aVar5.getClass();
                HelpActivity.a.d(context, lVar, "PROFILE_AND_PRIVACY", extras);
                return Unit.INSTANCE;
            case 11:
                int i17 = vu0.j.f180247o;
                context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context, q.LIVE_TRACK_PLUS, false));
                return Unit.INSTANCE;
            case 12:
                tn1.e.a(context, tn1.d.TRAINING_READINESS, tn1.f.HELP);
                return Unit.INSTANCE;
            case 13:
                ((u32.a) KoinJavaComponent.get$default(u32.a.class, null, null, 6, null)).b(context);
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                ((pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null)).a(context);
                return Unit.INSTANCE;
            case 15:
                HelpActivity.a.e(HelpActivity.f36653a, this.f167305b, l.PERSONAL_RECORDS, null, null, 12);
                return Unit.INSTANCE;
            case 16:
                HelpActivity.a.e(HelpActivity.f36653a, this.f167305b, l.PERSONAL_RECORDS, null, null, 12);
                return Unit.INSTANCE;
            case 17:
                int i18 = wt0.h.f187018c;
                a0.r(context, LeaderboardActivity.class);
                return Unit.INSTANCE;
            case 18:
                int i19 = LivetrackGroupRideEnabledActivity.f38673a;
                HelpActivity.a.e(HelpActivity.f36653a, this.f167305b, l.SOCIAL_GROUP_RIDE, null, null, 12);
                return Unit.INSTANCE;
            case 19:
                Logger logger = xc0.b.f189904e;
                return new gc0.d(new l22.a(context));
            case 20:
                int i24 = p.f192812n;
                return context;
            case 21:
                g22.a.d(context, Uri.parse("https://www.garmin.com/support/faq/unabletoadddevice"));
                return Unit.INSTANCE;
            case 22:
                s sVar6 = s.f85508a;
                lt.e.k kVar6 = new lt.e.k(lt.e.a.TappedTop, t.f130079x);
                sVar6.getClass();
                s.a(kVar6);
                RunningEconomyReportsActivity.f41149c.getClass();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) RunningEconomyReportsActivity.class));
                return Unit.INSTANCE;
            case 23:
                s sVar7 = s.f85508a;
                lt.e.k kVar7 = new lt.e.k(lt.e.a.TappedBottom, t.f130079x);
                sVar7.getClass();
                s.a(kVar7);
                RunningEconomyReportsActivity.a aVar7 = RunningEconomyReportsActivity.f41149c;
                DateTime.now();
                o.a aVar8 = o.f62804g;
                aVar7.getClass();
                context.getClass();
                Intent intent2 = new Intent(context, (Class<?>) RunningEconomyReportsActivity.class);
                intent2.putExtra("SHOW_FOUR_WEEK_CHART", true);
                context.startActivity(intent2);
                return Unit.INSTANCE;
            case 24:
                context.startActivity(((ub1.i) KoinJavaComponent.get$default(ub1.i.class, null, null, 6, null)).c(context));
                return Unit.INSTANCE;
            case 25:
                context.startActivity(((ub1.j) KoinJavaComponent.get$default(ub1.j.class, null, null, 6, null)).a(context));
                return Unit.INSTANCE;
            case 26:
                HelpActivity.a aVar9 = HelpActivity.f36653a;
                l lVar2 = l.PACE_PRO;
                aVar9.getClass();
                HelpActivity.a.d(context, lVar2, "ELEVATION_SENSITIVITY_ACTION", null);
                return Unit.INSTANCE;
            case 27:
                HelpActivity.a aVar10 = HelpActivity.f36653a;
                l lVar3 = l.PACE_PRO;
                aVar10.getClass();
                HelpActivity.a.d(context, lVar3, "PACING_STRATEGY_ACTION", null);
                return Unit.INSTANCE;
            case 28:
                HelpActivity.a aVar11 = HelpActivity.f36653a;
                l lVar4 = l.PACE_PRO;
                aVar11.getClass();
                HelpActivity.a.d(context, lVar4, "UPHILL_EFFORT_ACTION", null);
                return Unit.INSTANCE;
            default:
                HelpActivity.a aVar12 = HelpActivity.f36653a;
                l lVar5 = l.ACTIVITY_WORKOUT_SELF_EVALUATION;
                aVar12.getClass();
                HelpActivity.a.d(context, lVar5, null, null);
                return Unit.INSTANCE;
        }
    }
}
