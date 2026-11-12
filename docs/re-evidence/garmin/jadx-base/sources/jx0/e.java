package jx0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionActivity;
import com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutsActivity;
import i3.d6;
import java.text.NumberFormat;
import java.util.ArrayList;
import kl0.d.b;
import m63.k1;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.u;
import p005kotlin.jvm.internal.v;
import p13.x;
import p3.p0;
import r53.k2;
import r53.p2;
import r53.s;
import r53.u1;
import z10.i3;
import z10.k3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101437b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f101436a = i14;
        this.f101437b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f101436a;
        Object obj = this.f101437b;
        switch (i14) {
            case 0:
                f fVar = (f) obj;
                f.a aVar = f.f101438w;
                Context contextRequireContext = fVar.requireContext();
                contextRequireContext.getClass();
                Bundle bundle = (Bundle) fVar.f101402l.getValue();
                return new h(contextRequireContext, bundle != null ? bundle.getInt("REPORT_SIZE") : 6);
            case 1:
                g.a aVar2 = g.E;
                Context contextRequireContext2 = ((g) obj).requireContext();
                contextRequireContext2.getClass();
                return new n(contextRequireContext2);
            case 2:
                int i15 = MultiDayActivitiesCreationActivity.f39228b;
                ((MultiDayActivitiesCreationActivity) obj).finish();
                return Unit.INSTANCE;
            case 3:
                ((jy0.h) obj).M3();
                return Unit.INSTANCE;
            case 4:
                return new l22.a(((k00.h) obj).f101981a);
            case 5:
                ((l11.k) obj).x4();
                return Unit.INSTANCE;
            case 6:
                return new k3.g((k3.h) obj);
            case 7:
                return ((k3.g) obj).f102512a.e().floatValue() == 1.0f ? k3.h.Visible : k3.h.Hidden;
            case 8:
                Paint paint = new Paint(65);
                paint.setColor(-16777216);
                paint.setTypeface(Typeface.SANS_SERIF);
                paint.setStyle(Paint.Style.FILL);
                Context contextM0 = ((k40.c) obj).f102832a.m0();
                if (contextM0 != null) {
                    paint.setTextSize(contextM0.getResources().getDimension(R.dimen.andfont_caption));
                }
                return paint;
            case 9:
                ((k62.d) obj).x4();
                return Unit.INSTANCE;
            case 10:
                ((d6) obj).invoke();
                return Unit.INSTANCE;
            case 11:
                ((fv0.d) obj).invoke();
                return Unit.INSTANCE;
            case 12:
                MyWorkoutsActivity.a aVar3 = MyWorkoutsActivity.f49529a;
                ((MyWorkoutsActivity) obj).finish();
                return Unit.INSTANCE;
            case 13:
                k63.f fVar2 = (k63.f) obj;
                return Integer.valueOf(k1.e(fVar2, fVar2.f103243k));
            case 14:
                LanguageSelectionActivity.a aVar4 = LanguageSelectionActivity.f40328b;
                ((LanguageSelectionActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 15:
                return (y0) ((kb1.e) obj).f103824d.getValue();
            case 16:
                FindMyDeviceActivity.a aVar5 = FindMyDeviceActivity.f43421e;
                Bundle extras = ((FindMyDeviceActivity) obj).getIntent().getExtras();
                return ParametersHolderKt.parametersOf(extras != null ? Long.valueOf(extras.getLong("extra_device_id")) : null);
            case 17:
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.c((ki1.l.b.a) obj);
                return Unit.INSTANCE;
            case 18:
                p2 p2Var = ((kk1.g) obj).f105154h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, kk1.j.a((kk1.j) value, false, true, null, false, 60)));
                return Unit.INSTANCE;
            case 19:
                kl0.d dVar = (kl0.d) obj;
                hl0.k kVar = dVar.f105235a;
                il0.a aVar6 = dVar.f105238d;
                int globalLayoutId = aVar6.getGlobalLayoutId();
                kVar.getClass();
                return s.K(new u1(s.f(new hl0.l(kVar, globalLayoutId, null)), dVar.f105239e, dVar.new b(null)), v1.a(dVar), k2.a.a(k2.f150703a, 2), new kl0.c(aVar6, null, 2, null));
            case 20:
                int i16 = GroupCreationActivity.f36131b;
                ((GroupCreationActivity) obj).finish();
                return Unit.INSTANCE;
            case 21:
                return p0.n(Float.valueOf((((km0.d) obj).ordinal() + 1) / km0.d.f105312i.getF134973e()));
            case 22:
                Object obj2 = ((u) obj).f105813a;
                v vVar = obj2 instanceof v ? (v) obj2 : null;
                if (vVar != null) {
                    return vVar.findJavaDeclaration();
                }
                return null;
            case 23:
                ((kp2.b) obj).f106016d.c(kp2.b.c.C2045b.f106026a);
                return Unit.INSTANCE;
            case 24:
                ((kp2.c) obj).f106031c.c(kp2.c.AbstractC2049c.a.f106039a);
                return Unit.INSTANCE;
            case 25:
                LeaderboardActivity.a aVar7 = LeaderboardActivity.f37145i;
                i3 i3VarMa = ((LeaderboardActivity) obj).ma();
                i3VarMa.getClass();
                ge1.b.T(v1.a(i3VarMa), null, null, new k3(i3VarMa, null), 3);
                return Unit.INSTANCE;
            case 26:
                MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity = (MenstrualCycleReminderSettingsActivity) obj;
                MenstrualCycleReminderSettingsActivity.a aVar8 = MenstrualCycleReminderSettingsActivity.f39014o;
                String string = menstrualCycleReminderSettingsActivity.getString(R.string.mct_one_day_before);
                string.getClass();
                ArrayList arrayListM = x.m(string);
                for (int i17 = 2; i17 < 7; i17++) {
                    String string2 = menstrualCycleReminderSettingsActivity.getString(R.string.mct_days_before, NumberFormat.getIntegerInstance().format(Integer.valueOf(i17)));
                    string2.getClass();
                    arrayListM.add(string2);
                }
                return (String[]) arrayListM.toArray(new String[0]);
            case 27:
                return MultiDayActivitiesDetailActivity.ca((MultiDayActivitiesDetailActivity) obj);
            case 28:
                EventTrainingPlanIntegrationActivity.a aVar9 = EventTrainingPlanIntegrationActivity.f46267e;
                ht.a.f85464a.getClass();
                ht.a.a(null, "DoNotCreateTrainingPlanFromEventFlow");
                ((EventTrainingPlanIntegrationActivity) obj).ea(null);
                return Unit.INSTANCE;
            default:
                return (s5.c) obj;
        }
    }
}
