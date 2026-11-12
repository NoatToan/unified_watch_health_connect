package i3;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase_Impl;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.courses.filter.CourseSortFilterActivity;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.golf.courses.presentation.DownloadedGolfCoursesActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.TripDetailsActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import com.garmin.android.apps.connectmobile.webtranslation.WebTranslationDatabase_Impl;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.google.android.material.appbar.AppBarLayout;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f88052b;

    public /* synthetic */ f2(Object obj, int i14) {
        this.f88051a = i14;
        this.f88052b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() throws Throwable {
        e23.a<Unit> aVar;
        Object value;
        int i14 = this.f88051a;
        char c14 = 1;
        Object obj = this.f88052b;
        switch (i14) {
            case 0:
                g2 g2Var = (g2) obj;
                ge1.b.T(g2Var.getCoroutineScope(), null, null, new g2.a.C1735a(g2Var, null), 3);
                return Unit.INSTANCE;
            case 1:
                ((h8) obj).f88296a.invoke();
                return Unit.INSTANCE;
            case 2:
                return ((mc) obj).f88995d;
            case 3:
                ud udVar = (ud) obj;
                int i15 = ud.f89909t;
                if (!((Boolean) udVar.f89923n.getF182175a()).booleanValue() && (aVar = udVar.f89911b) != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 4:
                int i16 = WebTranslationDatabase_Impl.f47966d;
                return new com.garmin.android.apps.connectmobile.webtranslation.b((WebTranslationDatabase_Impl) obj);
            case 5:
                i63.e eVar = (i63.e) obj;
                k63.f fVarE = k63.k.e("kotlinx.serialization.Polymorphic", k63.c.a.f103222a, new k63.e[0], new ho0.g(eVar, 21));
                k23.d<T> dVar = eVar.f91884a;
                dVar.getClass();
                return new k63.b(fVarE, dVar);
            case 6:
                ia0.g gVar = (ia0.g) obj;
                ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new ia0.f(gVar, null), 3);
                return Unit.INSTANCE;
            case 7:
                return ParametersHolderKt.parametersOf((u53.d) obj);
            case 8:
                return new androidx.recyclerview.widget.s(new id1.h((id1.c) obj, 3, 0));
            case 9:
                FitnessAgeReportsActivity.a aVar2 = FitnessAgeReportsActivity.f35216c;
                ((FitnessAgeReportsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 10:
                Logger logger = in2.d.f94559c;
                rd2.j jVar = rd2.f.a().f152045a;
                String str = ((in2.d) obj).f94560a;
                jVar.getClass();
                sd2.j jVarF = rd2.j.f(str);
                Long lValueOf = jVarF != null ? Long.valueOf(jVarF.f158686c) : null;
                if (lValueOf != null) {
                    return (in2.a) KoinJavaComponent.get$default(in2.f.class, null, new gl1.m(c14 == true ? 1 : 0, lValueOf), 2, null);
                }
                in2.d.a aVar3 = new in2.d.a();
                ds.e0.u("Failed to retrieve unit ID for mac address ", str, ", socket message handler will always return -1", in2.d.f94559c);
                return aVar3;
            case 11:
                int i17 = RecentSelectedExercisesDatabase_Impl.f29921d;
                return new com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a((RecentSelectedExercisesDatabase_Impl) obj);
            case 12:
                TripDetailsActivity tripDetailsActivity = (TripDetailsActivity) obj;
                TripDetailsActivity.a aVar4 = TripDetailsActivity.f37000i;
                is0.k kVarCa = tripDetailsActivity.ca();
                yr0.o oVar = tripDetailsActivity.ca().f94939a;
                Long l14 = oVar != null ? oVar.f199036a : null;
                if (l14 != null) {
                    w9.a aVarA = androidx.lifecycle.v1.a(kVarCa);
                    x53.c cVar = o53.s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new is0.j(kVarCa, l14, null), 2);
                }
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                return Unit.INSTANCE;
            case 13:
                int i18 = BodyBatteryReportsActivity.f30937b;
                ((BodyBatteryReportsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 14:
                return ((j02.h0) obj).f();
            case 15:
                j2.i iVar = (j2.i) obj;
                iVar.D.invoke(Boolean.valueOf(!iVar.C));
                return Unit.INSTANCE;
            case 16:
                return ParametersHolderKt.parametersOf(Boolean.valueOf(((com.garmin.android.apps.connectmobile.contacts.emergency.d) obj).f32643b));
            case 17:
                l20.l lVar = (l20.l) obj;
                int i19 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                return ParametersHolderKt.parametersOf(Boolean.valueOf(lVar == l20.l.LIVETRACK));
            case 18:
                CourseSortFilterActivity.a aVar5 = CourseSortFilterActivity.f32768c;
                ((CourseSortFilterActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 19:
                jd.m mVar = (jd.m) obj;
                return mVar.f98256a.a(mVar.f98257b);
            case 20:
                jd1.a aVar6 = (jd1.a) obj;
                int i24 = jd1.a.f98392c;
                return new jd1.i(aVar6.fa(), aVar6.da());
            case 21:
                jd1.f fVar = (jd1.f) obj;
                int i25 = jd1.f.f98420q;
                return new jd1.i(fVar.F6(), fVar.w6());
            case 22:
                jf1.b bVar = (jf1.b) obj;
                bVar.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new jf1.e(bVar, null), 3);
                return Unit.INSTANCE;
            case 23:
                RunningToleranceReportsActivity.a aVar7 = RunningToleranceReportsActivity.f41161b;
                ((RunningToleranceReportsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 24:
                int i26 = jj2.a.f98963c;
                return (AppBarLayout) ((jj2.a) obj).findViewById(R.id.app_bar_layout);
            case 25:
                int i27 = DownloadedGolfCoursesActivity.f35747b;
                ((DownloadedGolfCoursesActivity) obj).onBackPressed();
                return Unit.INSTANCE;
            case 26:
                r53.p2 p2Var = ((jl1.g) obj).f99524g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, jl1.d.a((jl1.d) value, false, false, null, null, null, null, null, 125)));
                return Unit.INSTANCE;
            case 27:
                String str2 = DeveloperSettingsActivity.f51946n;
                return Toast.makeText((DeveloperSettingsActivity) obj, "", 0);
            case 28:
                ((js0.a) obj).d();
                return Unit.INSTANCE;
            default:
                jx0.a.C1950a c1950a = jx0.a.f101397n;
                com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
                return com.garmin.android.apps.connectmobile.l2.a.b().c((jx0.a) obj);
        }
    }
}
