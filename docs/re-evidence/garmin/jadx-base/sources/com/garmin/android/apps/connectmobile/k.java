package com.garmin.android.apps.connectmobile;

import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.MSNWorkoutFilterActivity;
import com.garmin.android.music.MusicConfig;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37117b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f37116a = i14;
        this.f37117b = obj;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        int i14 = this.f37116a;
        Object obj2 = this.f37117b;
        switch (i14) {
            case 0:
                List<String> list = l.f37126b;
                ((l) obj2).k();
                return;
            case 1:
                MusicConfig.lambda$init$0((gh2.n) obj2, observable, obj);
                return;
            case 2:
                MSNWorkoutFilterActivity.a aVar = MSNWorkoutFilterActivity.f49506d;
                ((MSNWorkoutFilterActivity) obj2).ea();
                return;
            default:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj2;
                xa1.k kVar = editPowerGuideStrategyActivity.f40389e;
                if (kVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                if (fVar == null) {
                    p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                    throw null;
                }
                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                ab1.d dVar = fVar.f2563a;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = fVar.f2564b;
                if (dVar != null && eVar != null) {
                    y0Var.j(g3.a.c(g3.f35298f));
                    o53.c2 c2Var = kVar.f189759h;
                    w9.a aVarA = androidx.lifecycle.v1.a(kVar);
                    x53.c cVar = o53.s0.f129406a;
                    kVar.f189759h = ge1.b.T(aVarA, x53.b.f189152a, null, new xa1.o(c2Var, dVar, eVar, kVar, fVar, y0Var, null), 2);
                }
                y0Var.f(editPowerGuideStrategyActivity, new EditPowerGuideStrategyActivity.c(new xa1.b(editPowerGuideStrategyActivity, 10)));
                return;
        }
    }
}
