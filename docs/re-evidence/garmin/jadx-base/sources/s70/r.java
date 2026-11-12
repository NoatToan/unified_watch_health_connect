package s70;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationActivity;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.HillScoreActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessActivity;
import java.util.Locale;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f157784b;

    public /* synthetic */ r(Context context, int i14) {
        this.f157783a = i14;
        this.f157784b = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f157783a;
        Context context = this.f157784b;
        switch (i14) {
            case 0:
                ht.s sVar = ht.s.f85508a;
                lt.e.l lVar = new lt.e.l(lt.e.a.Tapped);
                sVar.getClass();
                ht.s.a(lVar);
                context.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                return Unit.INSTANCE;
            case 1:
                ((n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null)).k(context);
                return Unit.INSTANCE;
            case 2:
                ((n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null)).h(context);
                return Unit.INSTANCE;
            case 3:
                androidx.room.a0.r(context, EventDashBoardActivity.class);
                return Unit.INSTANCE;
            case 4:
                androidx.room.a0.r(context, EventDashBoardActivity.class);
                return Unit.INSTANCE;
            case 5:
                ht.s sVar2 = ht.s.f85508a;
                lt.e.l lVar2 = new lt.e.l(lt.e.a.Tapped);
                sVar2.getClass();
                ht.s.a(lVar2);
                new androidx.appcompat.app.e.a(context).setTitle(R.string.common_network_reachability_error).setMessage(R.string.msg_check_internet_connection_and_try_again).setPositiveButton(R.string.lbl_settings, new aj1.f(context, 2)).setNegativeButton(R.string.lbl_close, new qh1.j(11)).show();
                return Unit.INSTANCE;
            case 6:
                Toast.makeText(context, R.string.txt_error_occurred, 0).show();
                return Unit.INSTANCE;
            case 7:
                Locale locale = Locale.getDefault();
                locale.getClass();
                String string = context.getString(R.string.garmin_connect_buy_products_url_path_home, c22.s1.b(locale));
                string.getClass();
                gg1.v0.T.getClass();
                g22.a.d(context, Uri.parse(("https://" + gg1.v0.a.b().f77350p).concat(string)));
                return Unit.INSTANCE;
            case 8:
                ht.s sVar3 = ht.s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, o70.t.f130081z);
                sVar3.getClass();
                ht.s.a(kVar);
                HillScoreActivity.f40261p.getClass();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) HillScoreActivity.class));
                return Unit.INSTANCE;
            case 9:
                int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                ((pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null)).a(context);
                return Unit.INSTANCE;
            case 10:
                androidx.room.a0.r(context, HealthStatusActivity.class);
                return Unit.INSTANCE;
            case 11:
                ht.s sVar4 = ht.s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, o70.t.f130076t);
                sVar4.getClass();
                ht.s.a(kVar2);
                context.startActivity(new Intent(context, (Class<?>) HealthStatusActivity.class));
                return Unit.INSTANCE;
            case 12:
                ht.s sVar5 = ht.s.f85508a;
                lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, o70.t.C);
                sVar5.getClass();
                ht.s.a(kVar3);
                context.startActivity(IntensityMinutesReportsActivity.a.b(IntensityMinutesReportsActivity.f36935b, context, DateTime.now()));
                return Unit.INSTANCE;
            case 13:
                lt.e.k kVar4 = new lt.e.k(lt.e.a.TappedBottom, o70.t.C);
                ht.s.f85508a.getClass();
                ht.s.a(kVar4);
                IntensityMinutesReportsActivity.a aVar = IntensityMinutesReportsActivity.f36935b;
                DateTime dateTimeNow = DateTime.now();
                o82.g gVar = o82.g.f130851d;
                aVar.getClass();
                context.startActivity(IntensityMinutesReportsActivity.a.a(context, dateTimeNow, gVar));
                return Unit.INSTANCE;
            case 14:
                context.startActivity(IntensityMinutesReportsActivity.a.b(IntensityMinutesReportsActivity.f36935b, context, DateTime.now()));
                return Unit.INSTANCE;
            case 15:
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachTrainingReadinessView");
                context.startActivity(dh.b.z(TrainingReadinessActivity.class, context, null, false));
                return Unit.INSTANCE;
            case 16:
                int i16 = sz0.i0.f161413r;
                return context;
            case 17:
                int i17 = sz1.p.f161567f;
                tn1.e.a(context, tn1.d.TRAINING_READINESS, tn1.f.HELP);
                return Unit.INSTANCE;
            case 18:
                tn1.e.a(context, tn1.d.TRAINING_READINESS, tn1.f.BANNER);
                return Unit.INSTANCE;
            case 19:
                int i18 = t31.g.f162217g;
                tn1.e.a(context, tn1.d.HRV_STATUS, tn1.f.HELP);
                return Unit.INSTANCE;
            case 20:
                gg1.v0.T.getClass();
                GCMWebViewActivity.fa(context, "", gg1.v0.a.b().k());
                return Unit.INSTANCE;
            case 21:
                ht.s sVar6 = ht.s.f85508a;
                lt.e.k kVar5 = new lt.e.k(lt.e.a.Add, o70.t.B);
                sVar6.getClass();
                ht.s.a(kVar5);
                context.startActivity(HydrationActivity.a.b(HydrationActivity.f36739o, context, DateTime.now()));
                return Unit.INSTANCE;
            case 22:
                ht.s sVar7 = ht.s.f85508a;
                lt.e.k kVar6 = new lt.e.k(lt.e.a.TappedTop, o70.t.B);
                sVar7.getClass();
                ht.s.a(kVar6);
                context.startActivity(HydrationActivity.a.b(HydrationActivity.f36739o, context, DateTime.now()));
                return Unit.INSTANCE;
            case 23:
                ht.s sVar8 = ht.s.f85508a;
                lt.e.k kVar7 = new lt.e.k(lt.e.a.TappedBottom, o70.t.B);
                sVar8.getClass();
                ht.s.a(kVar7);
                HydrationActivity.a aVar2 = HydrationActivity.f36739o;
                DateTime dateTimeNow2 = DateTime.now();
                aVar2.getClass();
                context.startActivity(HydrationActivity.a.a(context, dateTimeNow2, true));
                return Unit.INSTANCE;
            case 24:
                ht.s sVar9 = ht.s.f85508a;
                lt.e.k kVar8 = new lt.e.k(lt.e.a.TappedTop, o70.t.I0);
                sVar9.getClass();
                ht.s.a(kVar8);
                context.startActivity(dh.b.z(StressReportsActivity.class, context, DateTime.now(), false));
                return Unit.INSTANCE;
            case 25:
                ActiveTrainingPlansActivity.a aVar3 = ActiveTrainingPlansActivity.f45098w;
                fy1.i.f73924a.getClass();
                fy1.i.a.v(context);
                return Unit.INSTANCE;
            case 26:
                ht.s sVar10 = ht.s.f85508a;
                lt.e.C2183e c2183e = new lt.e.C2183e(lt.e.a.Tapped, o70.i.f130003k);
                sVar10.getClass();
                ht.s.a(c2183e);
                context.startActivity(dh.b.z(TrainingReadinessActivity.class, context, null, false));
                return Unit.INSTANCE;
            case 27:
                ht.s sVar11 = ht.s.f85508a;
                lt.e.g gVar2 = new lt.e.g(lt.e.a.TappedTop, o70.o.TRAINING_READINESS);
                sVar11.getClass();
                ht.s.a(gVar2);
                context.startActivity(dh.b.z(TrainingReadinessActivity.class, context, null, false));
                return Unit.INSTANCE;
            case 28:
                ht.s sVar12 = ht.s.f85508a;
                lt.e.g gVar3 = new lt.e.g(lt.e.a.LearnMore, o70.o.TRAINING_READINESS);
                sVar12.getClass();
                ht.s.a(gVar3);
                HelpActivity.a.e(HelpActivity.f36653a, this.f157784b, ro0.l.TRAINING_READINESS, null, null, 12);
                return Unit.INSTANCE;
            default:
                ht.s sVar13 = ht.s.f85508a;
                lt.e.g gVar4 = new lt.e.g(lt.e.a.LearnMore, o70.o.TRAINING_READINESS);
                sVar13.getClass();
                ht.s.a(gVar4);
                HelpActivity.a.e(HelpActivity.f36653a, this.f157784b, ro0.l.TRAINING_READINESS, null, null, 12);
                return Unit.INSTANCE;
        }
    }
}
