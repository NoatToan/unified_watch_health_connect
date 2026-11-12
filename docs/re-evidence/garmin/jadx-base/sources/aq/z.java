package aq;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements rk1.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12314b;

    public /* synthetic */ z(Object obj, int i14) {
        this.f12313a = i14;
        this.f12314b = obj;
    }

    @Override // rk1.b.c
    public final void a(ArrayList arrayList) {
        int i14 = this.f12313a;
        Object obj = this.f12314b;
        switch (i14) {
            case 0:
                c0 c0Var = (c0) obj;
                int i15 = c0.f11852i;
                String str = (String) p13.h0.d0(arrayList);
                int i16 = str != null ? Integer.parseInt(str) : 0;
                i0 i0VarV6 = c0Var.v6();
                ArrayList arrayList2 = i0VarV6.f11990a;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).f12286b.i0(Long.valueOf(i16));
                }
                i0VarV6.x4(arrayList2);
                return;
            case 1:
                com.garmin.android.apps.connectmobile.settings.e.a aVar = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                Object obj2 = arrayList.get(0);
                obj2.getClass();
                lVarA.X(Integer.parseInt((String) obj2));
                k32.l lVar = ((com.garmin.android.apps.connectmobile.settings.e) obj).f43411j;
                if (lVar != null) {
                    lVar.h((String) arrayList.get(0));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("userActivityClassItem");
                    throw null;
                }
            case 2:
                MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity = (MenstrualCycleReminderSettingsActivity) obj;
                MenstrualCycleReminderSettingsActivity.a aVar2 = MenstrualCycleReminderSettingsActivity.f39014o;
                Integer numTryParse = Ints.tryParse((String) arrayList.get(0));
                menstrualCycleReminderSettingsActivity.f39020e.setValue(menstrualCycleReminderSettingsActivity, MenstrualCycleReminderSettingsActivity.f39015p[1], Integer.valueOf((numTryParse != null ? numTryParse.intValue() : -1) + 1));
                ((TextView) menstrualCycleReminderSettingsActivity.findViewById(R.id.mct_reminder_settings_period_frequency_value)).setText(((String[]) menstrualCycleReminderSettingsActivity.f39016a.getValue())[menstrualCycleReminderSettingsActivity.da() - 1]);
                return;
            case 3:
                pk1.u uVar = (pk1.u) obj;
                pk1.u.a aVar3 = pk1.u.E;
                int i17 = Integer.parseInt((String) arrayList.get(0)) - 1;
                uVar.B.X(i17);
                GCMSettingsItemView gCMSettingsItemView = uVar.f138323h;
                if (gCMSettingsItemView != null) {
                    gCMSettingsItemView.setSummary(uVar.A6(i17));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("activityClassView");
                    throw null;
                }
            case 4:
                BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView = (BenchmarkExerciseOneRepMaxView) obj;
                int i18 = BenchmarkExerciseOneRepMaxView.f48406i;
                if (arrayList.size() == 1) {
                    Object obj3 = arrayList.get(0);
                    obj3.getClass();
                    int i19 = Integer.parseInt((String) obj3);
                    benchmarkExerciseOneRepMaxView.f48410d = i19;
                    benchmarkExerciseOneRepMaxView.a(benchmarkExerciseOneRepMaxView.f48411e, Integer.valueOf(i19));
                    benchmarkExerciseOneRepMaxView.b();
                    BenchmarkExerciseOneRepMaxView.a aVar4 = benchmarkExerciseOneRepMaxView.onValuesChangedListener;
                    if (aVar4 != null) {
                        aVar4.a(benchmarkExerciseOneRepMaxView.f48410d, benchmarkExerciseOneRepMaxView.f48411e, benchmarkExerciseOneRepMaxView.f48412f);
                        return;
                    }
                    return;
                }
                return;
            default:
                xg1.i<Integer> iVar = ((xg1.g) obj).f190897a;
                if (iVar != null) {
                    Integer numValueOf = Integer.valueOf((String) arrayList.get(0));
                    numValueOf.getClass();
                    iVar.a(numValueOf);
                    return;
                }
                return;
        }
    }
}
