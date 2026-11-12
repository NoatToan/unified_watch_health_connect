package l71;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsActivity;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import ht.s;
import o70.o;
import o70.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f110861b;

    public /* synthetic */ g(Context context, int i14) {
        this.f110860a = i14;
        this.f110861b = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f110860a;
        Context context = this.f110861b;
        switch (i14) {
            case 0:
                s sVar = s.f85508a;
                lt.e.g gVar = new lt.e.g(lt.e.a.TappedBottom, o.TRAINING_STATUS);
                sVar.getClass();
                s.a(gVar);
                TrainingStatusSummaryActivity.f40068w.getClass();
                TrainingStatusSummaryActivity.a.b(context, true);
                return Unit.INSTANCE;
            case 1:
                s sVar2 = s.f85508a;
                lt.e.g gVar2 = new lt.e.g(lt.e.a.LearnMore, o.TRAINING_STATUS);
                sVar2.getClass();
                s.a(gVar2);
                HelpActivity.a.e(HelpActivity.f36653a, this.f110861b, l.TRAINING_STATUS, null, null, 12);
                return Unit.INSTANCE;
            case 2:
                s sVar3 = s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.Tapped, t.f130078w);
                sVar3.getClass();
                s.a(kVar);
                RunningToleranceReportsActivity.f41161b.getClass();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) RunningToleranceReportsActivity.class));
                return Unit.INSTANCE;
            case 3:
                s sVar4 = s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.f130080y);
                sVar4.getClass();
                s.a(kVar2);
                ((il.b) KoinJavaComponent.get$default(il.b.class, null, null, 6, null)).a(context);
                return Unit.INSTANCE;
            case 4:
                s sVar5 = s.f85508a;
                lt.e.k kVar3 = new lt.e.k(lt.e.a.Tapped, t.f130071n);
                sVar5.getClass();
                s.a(kVar3);
                FitnessAgeReportsActivity.f35216c.getClass();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) FitnessAgeReportsActivity.class));
                return Unit.INSTANCE;
            case 5:
                s sVar6 = s.f85508a;
                lt.e.C2183e c2183e = new lt.e.C2183e(lt.e.a.Tapped, o70.i.f129999g);
                sVar6.getClass();
                s.a(c2183e);
                context.startActivity(dh.b.z(BodyBatteryReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 6:
                s sVar7 = s.f85508a;
                lt.e.g gVar3 = new lt.e.g(lt.e.a.Tapped, o.BODY_BATTERY);
                sVar7.getClass();
                s.a(gVar3);
                context.startActivity(dh.b.z(BodyBatteryReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 7:
                s sVar8 = s.f85508a;
                lt.e.g gVar4 = new lt.e.g(lt.e.a.LearnMore, o.BODY_BATTERY);
                sVar8.getClass();
                s.a(gVar4);
                Bundle bundle = new Bundle();
                HelpActivity.a aVar = HelpActivity.f36653a;
                l lVar = l.BODY_BATTERY;
                aVar.getClass();
                HelpActivity.a.d(context, lVar, null, bundle);
                return Unit.INSTANCE;
            case 8:
                s sVar9 = s.f85508a;
                lt.e.k kVar4 = new lt.e.k(lt.e.a.TappedTop, t.f130065i);
                sVar9.getClass();
                s.a(kVar4);
                context.startActivity(dh.b.z(BodyBatteryReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 9:
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                l lVar2 = l.PACE_PRO;
                aVar2.getClass();
                HelpActivity.a.d(context, lVar2, null, null);
                return Unit.INSTANCE;
            case 10:
                return g8.i.u(context);
            case 11:
                s sVar10 = s.f85508a;
                lt.e.k kVar5 = new lt.e.k(lt.e.a.Tapped, t.Y);
                sVar10.getClass();
                s.a(kVar5);
                context.startActivity(dh.b.z(RespirationReportsActivity.class, context, null, false));
                return Unit.INSTANCE;
            case 12:
                HelpActivity.a.e(HelpActivity.f36653a, this.f110861b, l.RUNNING_TOLERANCE, null, null, 12);
                return Unit.INSTANCE;
            case 13:
                s sVar11 = s.f85508a;
                lt.e.k kVar6 = new lt.e.k(lt.e.a.Add, t.f130067k);
                sVar11.getClass();
                s.a(kVar6);
                ((h60.b) KoinJavaComponent.get$default(h60.b.class, null, null, 6, null)).b(context);
                return Unit.INSTANCE;
            case 14:
                s sVar12 = s.f85508a;
                lt.e.k kVar7 = new lt.e.k(lt.e.a.Tapped, t.f130067k);
                sVar12.getClass();
                s.a(kVar7);
                CriticalSwimSpeedReportsActivity.f33109a.getClass();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) CriticalSwimSpeedReportsActivity.class));
                return Unit.INSTANCE;
            case 15:
                int i15 = o62.l.f129705g;
                ((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).n(context);
                return Unit.INSTANCE;
            case 16:
                Toast.makeText(context, "Clicked on Grand Canyon Trail", 0).show();
                return Unit.INSTANCE;
            case 17:
                Toast.makeText(context, "Clicked on Grand Canyon Trail Earned", 0).show();
                return Unit.INSTANCE;
            case 18:
                Toast.makeText(context, "Clicked on Everest Base Camp", 0).show();
                return Unit.INSTANCE;
            case 19:
                Toast.makeText(context, "Clicked on K2 Pakistan Climb", 0).show();
                return Unit.INSTANCE;
            case 20:
                Toast.makeText(context, "Clicked on Placeholder", 0).show();
                return Unit.INSTANCE;
            case 21:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
            case 22:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
            case 23:
                Toast.makeText(context, "Action clicked", 0).show();
                return Unit.INSTANCE;
            case 24:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
            case 25:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
            case 26:
                Toast.makeText(context, "Action clicked", 0).show();
                return Unit.INSTANCE;
            case 27:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
            case 28:
                Toast.makeText(context, "Action clicked", 0).show();
                return Unit.INSTANCE;
            default:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
        }
    }
}
