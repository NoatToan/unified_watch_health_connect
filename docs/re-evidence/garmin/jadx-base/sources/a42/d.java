package a42;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f992b;

    public /* synthetic */ d(Context context, ay1.b bVar) {
        this.f991a = 6;
        this.f992b = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f991a;
        Context context = this.f992b;
        switch (i14) {
            case 0:
                ((u32.a) KoinJavaComponent.get$default(u32.a.class, null, null, 6, null)).b(context);
                return Unit.INSTANCE;
            case 1:
                HelpActivity.a.e(HelpActivity.f36653a, this.f992b, ro0.l.RUNNING_ECONOMY, null, null, 12);
                return Unit.INSTANCE;
            case 2:
                ht.s sVar = ht.s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, o70.t.f130075r);
                sVar.getClass();
                ht.s.a(kVar);
                context.startActivity(dh.b.z(FloorsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 3:
                ht.s sVar2 = ht.s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, o70.t.f130075r);
                sVar2.getClass();
                ht.s.a(kVar2);
                context.startActivity(dh.b.z(FloorsActivity.class, context, DateTime.now(), true));
                return Unit.INSTANCE;
            case 4:
                HelpActivity.a.e(HelpActivity.f36653a, this.f992b, ro0.l.EXCLUSIVE_OFFERS, null, null, 12);
                return Unit.INSTANCE;
            case 5:
                context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).e(context, true));
                return Unit.INSTANCE;
            case 6:
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://familydoctor.org/weight-training-and-weight-lifting-safety/")));
                    break;
                } catch (ActivityNotFoundException e4) {
                    a2 a2Var = a2.STRENGTH_TRAINING_PLAN;
                    i2.f36769a.getClass();
                    i2.a.g(a2Var, "openExternalUrl https://familydoctor.org/weight-training-and-weight-lifting-safety/", e4);
                }
                return Unit.INSTANCE;
            case 7:
                context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context, c80.q.NUTRITION, false));
                return Unit.INSTANCE;
            case 8:
                by1.c cVar = by1.c.f22175a;
                ey1.a.B4(rt1.n.a(context), "STPChooseEquipment");
                return Unit.INSTANCE;
            case 9:
                by1.e eVar = by1.e.f22178a;
                ey1.a.B4(rt1.n.a(context), "STPConfirmSchedule");
                return Unit.INSTANCE;
            case 10:
                by1.g gVar = by1.g.f22184a;
                ey1.a.B4(rt1.n.a(context), "STPEquipmentPreferences");
                return Unit.INSTANCE;
            case 11:
                by1.j jVar = by1.j.f22190a;
                ey1.a.B4(rt1.n.a(context), "STPDoYouKnowYourBenchmarks");
                return Unit.INSTANCE;
            case 12:
                by1.o oVar = by1.o.f22201a;
                ey1.a.B4(rt1.n.a(context), "STPSelectPlan");
                return Unit.INSTANCE;
            case 13:
                by1.r rVar = by1.r.f22207a;
                ey1.a.B4(rt1.n.a(context), "STPSetBenchmarks");
                return Unit.INSTANCE;
            case 14:
                by1.v vVar = by1.v.f22216a;
                ey1.a.B4(rt1.n.a(context), "STPSetTrainingDays");
                return Unit.INSTANCE;
            case 15:
                by1.v vVar2 = by1.v.f22216a;
                ey1.a.B4(rt1.n.a(context), "STPSetTrainingDays");
                return Unit.INSTANCE;
            case 16:
                by1.w wVar = by1.w.f22220a;
                ey1.a.B4(rt1.n.a(context), "STPPlanDetails");
                return Unit.INSTANCE;
            case 17:
                by1.x xVar = by1.x.f22221a;
                ey1.a.B4(rt1.n.a(context), "STPSetYourGoal");
                return Unit.INSTANCE;
            case 18:
                by1.x xVar2 = by1.x.f22221a;
                ey1.a.B4(rt1.n.a(context), "STPSetYourGoal");
                return Unit.INSTANCE;
            case 19:
                by1.z zVar = by1.z.f22228a;
                ey1.a.B4(rt1.n.a(context), "STPWorkoutSteps");
                return Unit.INSTANCE;
            case 20:
                return LayoutInflater.from(context).inflate(R.layout.view_generic_list_picker_dialog, (ViewGroup) null);
            case 21:
                SleepReportsActivity.a aVar = SleepReportsActivity.f44239b;
                DateTime dateTimeAtStartOfDay = LocalDate.now().toDateTimeAtStartOfDay();
                en1.c cVar2 = en1.c.COACH;
                Context context2 = this.f992b;
                context2.startActivity(SleepReportsActivity.a.b(aVar, context2, dateTimeAtStartOfDay, cVar2, false, null, null, 56));
                ht.s sVar3 = ht.s.f85508a;
                lt.e.m mVar = new lt.e.m(lt.e.a.Tapped, o70.y.SLEEP_COACH);
                sVar3.getClass();
                ht.s.a(mVar);
                return Unit.INSTANCE;
            case 22:
                ht.s sVar4 = ht.s.f85508a;
                lt.e.C2183e c2183e = new lt.e.C2183e(lt.e.a.Tapped, o70.i.f130001i);
                sVar4.getClass();
                ht.s.a(c2183e);
                ((pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null)).i(context, LocalDate.now(), e32.o.f62806i);
                return Unit.INSTANCE;
            case 23:
                ht.s sVar5 = ht.s.f85508a;
                lt.e.g gVar2 = new lt.e.g(lt.e.a.Tapped, o70.o.SLEEP);
                sVar5.getClass();
                ht.s.a(gVar2);
                ((pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null)).i(context, LocalDate.now(), e32.o.f62806i);
                return Unit.INSTANCE;
            case 24:
                ht.s sVar6 = ht.s.f85508a;
                lt.e.g gVar3 = new lt.e.g(lt.e.a.LearnMore, o70.o.SLEEP);
                sVar6.getClass();
                ht.s.a(gVar3);
                Bundle bundle = new Bundle();
                sn1.b.f160414a.getClass();
                bundle.putParcelable("EXTRA_DATA", sn1.b.b(false));
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.SLEEP_ENHANCED;
                aVar2.getClass();
                HelpActivity.a.d(context, lVar, null, bundle);
                return Unit.INSTANCE;
            case 25:
                ht.s sVar7 = ht.s.f85508a;
                lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, o70.t.Z);
                sVar7.getClass();
                ht.s.a(kVar3);
                ((pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null)).i(context, LocalDate.now(), e32.o.f62806i);
                return Unit.INSTANCE;
            case 26:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$3$0$0(context);
            case 27:
                ht.s sVar8 = ht.s.f85508a;
                lt.e.k kVar4 = new lt.e.k(lt.e.a.Add, o70.t.I);
                sVar8.getClass();
                ht.s.a(kVar4);
                zd1.a.f204221a.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) LifestyleLoggingActivity.class);
                new zd1.a.C3809a(intent).a(g22.l.d(b63.o.INSTANCE));
                Unit unit = Unit.INSTANCE;
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 28:
                ht.s sVar9 = ht.s.f85508a;
                lt.e.k kVar5 = new lt.e.k(lt.e.a.TappedTop, o70.t.I);
                sVar9.getClass();
                ht.s.a(kVar5);
                zd1.a.f204221a.getClass();
                context.getClass();
                Intent intent2 = new Intent(context, (Class<?>) LifestyleLoggingActivity.class);
                new zd1.a.C3809a(intent2).a(g22.l.d(b63.o.INSTANCE));
                Unit unit2 = Unit.INSTANCE;
                context.startActivity(intent2);
                return Unit.INSTANCE;
            default:
                ht.s sVar10 = ht.s.f85508a;
                lt.e.k kVar6 = new lt.e.k(lt.e.a.TappedBottom, o70.t.I);
                sVar10.getClass();
                ht.s.a(kVar6);
                zd1.a aVar3 = zd1.a.f204221a;
                com.google.maps.android.compose.clustering.d dVar = new com.google.maps.android.compose.clustering.d(15);
                aVar3.getClass();
                context.startActivity(zd1.a.a(context, dVar));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Context context, int i14) {
        this.f991a = i14;
        this.f992b = context;
    }

    public /* synthetic */ d(ey1.a aVar, Context context, int i14) {
        this.f991a = i14;
        this.f992b = context;
    }
}
