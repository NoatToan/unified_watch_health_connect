package sg0;

import android.content.Context;
import android.os.Bundle;
import c22.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessFeedBackPhraseTest;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import java.util.ArrayList;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import r53.p2;
import sk0.g1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f159179b;

    public /* synthetic */ w0(Object obj, int i14) {
        this.f159178a = i14;
        this.f159179b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        int i14 = this.f159178a;
        int i15 = 4;
        int i16 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f159179b;
        switch (i14) {
            case 0:
                ((rk0.y) obj).invoke();
                return Unit.INSTANCE;
            case 1:
                return p3.p0.n((sk0.l0) obj);
            case 2:
                ((GearActivity.w) obj).invoke();
                return Unit.INSTANCE;
            case 3:
                ((sk0.f1) obj).g();
                return Unit.INSTANCE;
            case 4:
                ((g1) obj).g();
                return Unit.INSTANCE;
            case 5:
                return p3.p0.n((sk0.n0) obj);
            case 6:
                SleepReportsActivity.a aVar = SleepReportsActivity.f44239b;
                ((SleepReportsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 7:
                int i17 = CaloriesReportsActivity.f31240b;
                ((CaloriesReportsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 8:
                ((sz0.z) obj).f161534i.M2();
                return Unit.INSTANCE;
            case 9:
                int i18 = TrainingReadinessFeedBackPhraseTest.f46487a;
                ((TrainingReadinessFeedBackPhraseTest) obj).onNavigateUp();
                return Unit.INSTANCE;
            case 10:
                ((NutritionActivity.f) obj).invoke();
                return Unit.INSTANCE;
            case 11:
                OvernightHrvActivity.a aVar2 = OvernightHrvActivity.f39738n;
                tn1.e.a((OvernightHrvActivity) obj, tn1.d.HRV_STATUS, tn1.f.BANNER);
                return Unit.INSTANCE;
            case 12:
                BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView = (BenchmarkExerciseOneRepMaxView) obj;
                int i19 = BenchmarkExerciseOneRepMaxView.f48406i;
                rk1.b.C2900b c2900b = new rk1.b.C2900b(benchmarkExerciseOneRepMaxView.getContext());
                String string = benchmarkExerciseOneRepMaxView.getContext().getString(R.string.strength_training_reps);
                rk1.b.d dVar = c2900b.f153344b;
                dVar.f153346b = string;
                dVar.f153345a = 1;
                c2900b.e(1);
                c2900b.d(20);
                c2900b.c(Integer.valueOf(benchmarkExerciseOneRepMaxView.f48410d));
                Boolean bool = Boolean.FALSE;
                ArrayList arrayList = new ArrayList(1);
                dVar.f153351g = arrayList;
                arrayList.add(bool);
                c2900b.f(new aq.z(benchmarkExerciseOneRepMaxView, i15));
                c2900b.a();
                return Unit.INSTANCE;
            case 13:
                Iterable<j70.b> iterable = (Iterable) ((v2.b) ((v2) obj)).f47386a;
                ArrayList arrayList2 = new ArrayList();
                for (j70.b bVar : iterable) {
                    o70.i.a aVar3 = o70.i.f129998f;
                    String cardType = bVar.getCardType();
                    aVar3.getClass();
                    o70.i iVarA = o70.i.a.a(cardType);
                    if (iVarA != null) {
                        arrayList2.add(iVarA);
                    }
                }
                return arrayList2;
            case 14:
                return new y2((t92.a) obj, i15);
            case 15:
                ((ta0.q0) obj).y4();
                return Unit.INSTANCE;
            case 16:
                return ParametersHolderKt.parametersOf((l90.b) obj);
            case 17:
                p2 p2Var = ((ta0.k0) obj).f163381c;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, null));
                return Unit.INSTANCE;
            case 18:
                tb0.q qVar = (tb0.q) obj;
                qVar.z4("ViewTutorials");
                p2 p2Var2 = qVar.f163687h;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, ub0.m.VIEW_TUTORIALS));
                Unit unit = Unit.INSTANCE;
                qVar.A4(ub0.a.PLAY);
                return Unit.INSTANCE;
            case 19:
                tb0.n nVar = (tb0.n) obj;
                Long l14 = nVar.f163648a;
                return Boolean.valueOf(l14 != null ? nVar.f163652e.o1(l14.longValue()) : false);
            case 20:
                int i24 = td1.b.f163884i;
                return new jd1.i(((td1.b) obj).F6(), objArr2 == true ? 1 : 0, i16, objArr == true ? 1 : 0);
            case 21:
                int i25 = tm0.c.f165349i;
                Bundle arguments = ((tm0.c) obj).getArguments();
                return new tm0.r(arguments != null ? arguments.getLong("GCM_extra_connection_group_id", -1L) : -1L);
            case 22:
                ((com.garmin.android.apps.connectmobile.activities.health.presentation.c) obj).f29048c.invoke();
                return Unit.INSTANCE;
            case 23:
                ((tn.u) obj).f165498c.invoke();
                return Unit.INSTANCE;
            case 24:
                return new on.m(((tn.v) obj).f165501g, 20);
            case 25:
                return new on.m(((com.garmin.android.apps.connectmobile.activities.health.presentation.e) obj).f29061i, 20);
            case 26:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar4 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (p005kotlin.jvm.internal.s.g(aVar4.z6().f204393j, Boolean.TRUE)) {
                    mz1.e0 e0VarZ6 = aVar4.z6();
                    int i26 = mz1.e0.K1;
                    fg0.k kVarD = e0VarZ6.l5().d();
                    fg0.x xVar = e0VarZ6.f204394k;
                    xw1.k kVar = xVar != null ? xVar.f71373i : null;
                    if (kVar == null || kVar.k(kVarD)) {
                        mz1.e0.D5(e0VarZ6, false, 2);
                    } else {
                        e0VarZ6.f204406y.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.keep_my_event), Boolean.valueOf(kVar.m()))));
                    }
                } else {
                    mz1.e0.D5(aVar4.z6(), false, 3);
                }
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.j.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.j.f46094h;
                Context contextRequireContext = ((com.garmin.android.apps.connectmobile.traininginitiative.ui.j) obj).requireContext();
                contextRequireContext.getClass();
                return new l22.a(contextRequireContext);
            case 28:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.m.f46136a.getClass();
                new com.garmin.android.apps.connectmobile.traininginitiative.ui.m().show(((com.garmin.android.apps.connectmobile.traininginitiative.ui.l) obj).requireActivity().getSupportFragmentManager(), "terms");
                return Unit.INSTANCE;
            default:
                MultiLineImeEditText multiLineImeEditText = ((com.garmin.android.apps.connectmobile.traininginitiative.ui.o) obj).f46158i;
                if (multiLineImeEditText != null) {
                    multiLineImeEditText.setCursorVisible(true);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("multiLineImeEditText");
                throw null;
        }
    }
}
