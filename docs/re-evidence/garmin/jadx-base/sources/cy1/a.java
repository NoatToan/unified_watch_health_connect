package cy1;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import b11.k;
import b21.l4;
import b63.u;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.performancescores.endurancescore.presentation.EnduranceScoreActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import ht.s;
import java.util.List;
import o70.o;
import o70.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import ro0.l;
import rt1.n;
import ub1.g;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f56795b;

    public /* synthetic */ a(Context context, int i14) {
        this.f56794a = i14;
        this.f56795b = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f56794a;
        Context context = this.f56795b;
        switch (i14) {
            case 0:
                b bVar = b.f56796a;
                ey1.a.B4(n.a(context), "STPWorkoutSteps");
                return Unit.INSTANCE;
            case 1:
                d dVar = d.f56799a;
                ey1.a.B4(n.a(context), "STPSetRepIntensity");
                return Unit.INSTANCE;
            case 2:
                e eVar = e.f56800a;
                ey1.a.B4(n.a(context), "STPSetNumberOfWorkouts");
                return Unit.INSTANCE;
            case 3:
                f fVar = f.f56801a;
                ey1.a.B4(n.a(context), "STPSetPrimaryLifts");
                return Unit.INSTANCE;
            case 4:
                List<String> list = dy2.b.f61650c;
                return context.getSharedPreferences("subscription_cache_prefs", 0);
            case 5:
                s sVar = s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.f130070m);
                sVar.getClass();
                s.a(kVar);
                EnduranceScoreActivity.f40255b.getClass();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) EnduranceScoreActivity.class));
                return Unit.INSTANCE;
            case 6:
                HelpActivity.a.e(HelpActivity.f36653a, this.f56795b, l.TRAIL_DIFFICULTY, null, null, 12);
                return Unit.INSTANCE;
            case 7:
                WorkoutPreCreateActivity.a aVar = WorkoutPreCreateActivity.f48888d;
                ((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).p(context);
                return Unit.INSTANCE;
            case 8:
                s sVar2 = s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.J0);
                sVar2.getClass();
                s.a(kVar2);
                TrainingStatusSummaryActivity.f40068w.getClass();
                context.startActivity(TrainingStatusSummaryActivity.a.a(context, "TRAINING_LOAD_DEST"));
                return Unit.INSTANCE;
            case 9:
                s sVar3 = s.f85508a;
                lt.e.k kVar3 = new lt.e.k(lt.e.a.Tapped, t.J0);
                sVar3.getClass();
                s.a(kVar3);
                TrainingStatusSummaryActivity.f40068w.getClass();
                context.startActivity(TrainingStatusSummaryActivity.a.a(context, "TRAINING_LOAD_DEST"));
                return Unit.INSTANCE;
            case 10:
                s sVar4 = s.f85508a;
                lt.e.k kVar4 = new lt.e.k(lt.e.a.Tapped, t.P);
                sVar4.getClass();
                s.a(kVar4);
                TrainingStatusSummaryActivity.f40068w.getClass();
                context.startActivity(TrainingStatusSummaryActivity.a.a(context, "LOAD_FOCUS_DEST"));
                return Unit.INSTANCE;
            case 11:
                Toast.makeText(context, context.getString(R.string.msg_unable_to_share_location_friends), 0).show();
                return Unit.INSTANCE;
            case 12:
                Toast.makeText(context, context.getString(R.string.msg_unable_to_share_location), 0).show();
                return Unit.INSTANCE;
            case 13:
                Toast.makeText(context, context.getString(R.string.msg_unable_to_share_location), 0).show();
                return Unit.INSTANCE;
            case 14:
                s sVar5 = s.f85508a;
                lt.e.k kVar5 = new lt.e.k(lt.e.a.Tapped, t.P0);
                sVar5.getClass();
                s.a(kVar5);
                MenstrualCycleDetailsActivity.a aVar2 = MenstrualCycleDetailsActivity.f38784t;
                DateTime dateTimeNow = DateTime.now();
                aVar2.getClass();
                context.startActivity(MenstrualCycleDetailsActivity.a.a(context, false, false, dateTimeNow));
                return Unit.INSTANCE;
            case 15:
                s sVar6 = s.f85508a;
                lt.e.k kVar6 = new lt.e.k(lt.e.a.Add, t.P0);
                sVar6.getClass();
                s.a(kVar6);
                MenstrualCycleSymptomActivity.f38817c.getClass();
                MenstrualCycleSymptomActivity.a.c(context, null);
                return Unit.INSTANCE;
            case 16:
                s sVar7 = s.f85508a;
                lt.e.k kVar7 = new lt.e.k(lt.e.a.Tapped, t.P0);
                sVar7.getClass();
                s.a(kVar7);
                MenstrualCycleDetailsActivity.a aVar3 = MenstrualCycleDetailsActivity.f38784t;
                DateTime dateTimeNow2 = DateTime.now();
                aVar3.getClass();
                context.startActivity(MenstrualCycleDetailsActivity.a.a(context, false, false, dateTimeNow2));
                return Unit.INSTANCE;
            case 17:
                s sVar8 = s.f85508a;
                lt.e.k kVar8 = new lt.e.k(lt.e.a.Tapped, t.P0);
                sVar8.getClass();
                s.a(kVar8);
                MenstrualCycleDetailsActivity.a aVar4 = MenstrualCycleDetailsActivity.f38784t;
                DateTime dateTimeNow3 = DateTime.now();
                aVar4.getClass();
                context.startActivity(MenstrualCycleDetailsActivity.a.a(context, false, false, dateTimeNow3));
                return Unit.INSTANCE;
            case 18:
                s sVar9 = s.f85508a;
                lt.e.g gVar = new lt.e.g(lt.e.a.LearnMore, o.NUTRITION);
                sVar9.getClass();
                s.a(gVar);
                context.startActivity(((g) KoinJavaComponent.get$default(g.class, null, null, 6, null)).g(context, q.NUTRITION, false));
                return Unit.INSTANCE;
            case 19:
                s sVar10 = s.f85508a;
                lt.e.g gVar2 = new lt.e.g(lt.e.a.LearnMore, o.NUTRITION);
                sVar10.getClass();
                s.a(gVar2);
                l4.m mVar = new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (k) null, false, 12, (j) null);
                NutritionActivity.a aVar5 = NutritionActivity.f39581f;
                Context context2 = this.f56795b;
                context2.startActivity(NutritionActivity.a.a(aVar5, context2, null, null, mVar, false, false, 54));
                return Unit.INSTANCE;
            case 20:
                s sVar11 = s.f85508a;
                lt.e.g gVar3 = new lt.e.g(lt.e.a.LearnMore, o.NUTRITION);
                sVar11.getClass();
                s.a(gVar3);
                NutritionActivity.a aVar6 = NutritionActivity.f39581f;
                Context context3 = this.f56795b;
                context3.startActivity(NutritionActivity.a.a(aVar6, context3, null, null, null, false, false, 62));
                return Unit.INSTANCE;
            case 21:
                s sVar12 = s.f85508a;
                lt.e.g gVar4 = new lt.e.g(lt.e.a.Add, o.NUTRITION);
                sVar12.getClass();
                s.a(gVar4);
                l4.m mVar2 = new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (k) null, false, 12, (j) null);
                NutritionActivity.a aVar7 = NutritionActivity.f39581f;
                Context context4 = this.f56795b;
                context4.startActivity(NutritionActivity.a.a(aVar7, context4, null, null, mVar2, false, false, 54));
                return Unit.INSTANCE;
            case 22:
                s sVar13 = s.f85508a;
                lt.e.g gVar5 = new lt.e.g(lt.e.a.Tapped, o.NUTRITION);
                sVar13.getClass();
                s.a(gVar5);
                NutritionActivity.a aVar8 = NutritionActivity.f39581f;
                Context context5 = this.f56795b;
                context5.startActivity(NutritionActivity.a.a(aVar8, context5, null, null, null, false, false, 62));
                return Unit.INSTANCE;
            case 23:
                s sVar14 = s.f85508a;
                lt.e.g gVar6 = new lt.e.g(lt.e.a.Tapped, o.NUTRITION);
                sVar14.getClass();
                s.a(gVar6);
                NutritionActivity.a aVar9 = NutritionActivity.f39581f;
                o82.g gVar7 = o82.g.f130853f;
                Context context6 = this.f56795b;
                context6.startActivity(NutritionActivity.a.a(aVar9, context6, null, gVar7, null, false, false, 58));
                return Unit.INSTANCE;
            case 24:
                s sVar15 = s.f85508a;
                lt.e.g gVar8 = new lt.e.g(lt.e.a.Tapped, o.NUTRITION);
                sVar15.getClass();
                s.a(gVar8);
                NutritionActivity.a aVar10 = NutritionActivity.f39581f;
                Context context7 = this.f56795b;
                context7.startActivity(NutritionActivity.a.a(aVar10, context7, null, null, null, false, false, 62));
                return Unit.INSTANCE;
            case 25:
                s sVar16 = s.f85508a;
                lt.e.g gVar9 = new lt.e.g(lt.e.a.Add, o.NUTRITION);
                sVar16.getClass();
                s.a(gVar9);
                b21.b.a(context);
                return Unit.INSTANCE;
            case 26:
                s sVar17 = s.f85508a;
                lt.e.k kVar9 = new lt.e.k(lt.e.a.Tapped, t.f130069l);
                sVar17.getClass();
                s.a(kVar9);
                context.startActivity(new Intent(context, (Class<?>) CyclingAbilityReportsActivity.class));
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar2 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
                com.garmin.android.apps.connectmobile.googlehealthconnect.b.EnumC0626b enumC0626b = com.garmin.android.apps.connectmobile.googlehealthconnect.b.EnumC0626b.LEARN_MORE;
                bVar2.getClass();
                com.garmin.android.apps.connectmobile.googlehealthconnect.b.b(enumC0626b);
                lg.d.C(context, "https://support.garmin.com/sas/gcapp/?contentId=JToBEy0jfe6pIygark2Ui5");
                return Unit.INSTANCE;
            case 28:
                s sVar18 = s.f85508a;
                lt.e.b bVar3 = new lt.e.b(lt.e.a.Tapped, o70.b.LIVE_ACTIVITY, null, 4, null);
                sVar18.getClass();
                s.a(bVar3);
                context.startActivity(new Intent(context, (Class<?>) LiveActivityActivity.class));
                return Unit.INSTANCE;
            default:
                PendingActivitiesActivity.a aVar11 = PendingActivitiesActivity.f39793d;
                com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a c0723a = com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.INSTANCE;
                aVar11.getClass();
                context.getClass();
                c0723a.getClass();
                context.startActivity(PendingActivitiesActivity.a.a(context, c0723a));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(ey1.a aVar, Context context, int i14) {
        this.f56794a = i14;
        this.f56795b = context;
    }
}
