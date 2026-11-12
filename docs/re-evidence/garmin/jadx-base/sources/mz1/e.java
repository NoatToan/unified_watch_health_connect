package mz1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121678b;

    public /* synthetic */ e(AddTIEventViewModel addTIEventViewModel, int i14) {
        this.f121677a = i14;
        this.f121678b = addTIEventViewModel;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f121677a;
        AddTIEventViewModel addTIEventViewModel = this.f121678b;
        switch (i14) {
            case 0:
                String[] strArr = AddTIEventViewModel.V2;
                return (androidx.lifecycle.y0) addTIEventViewModel.S0.getValue();
            case 1:
                String[] strArr2 = AddTIEventViewModel.V2;
                return (androidx.lifecycle.y0) addTIEventViewModel.f46416j2.getValue();
            case 2:
                String[] strArr3 = AddTIEventViewModel.V2;
                return (androidx.lifecycle.y0) addTIEventViewModel.f46421l2.getValue();
            case 3:
                String[] strArr4 = AddTIEventViewModel.V2;
                return addTIEventViewModel.v5();
            case 4:
                String[] strArr5 = AddTIEventViewModel.V2;
                return (androidx.lifecycle.y0) addTIEventViewModel.K0.getValue();
            case 5:
                String[] strArr6 = AddTIEventViewModel.V2;
                return addTIEventViewModel.A5();
            case 6:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                ht.a.f85464a.getClass();
                ht.a.a(null, "EventCompletionTargetAdded");
                addTIEventViewModel.s5().o(addTIEventViewModel.q5());
                if (addTIEventViewModel.P5() != ny1.g.IN_PERSON || addTIEventViewModel.G5().d() == null) {
                    addTIEventViewModel.c6().j(null);
                } else {
                    addTIEventViewModel.a5();
                }
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.p.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.p.f46166c;
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundle = new Bundle(1);
                bundle.putBoolean("EventIsRace", true);
                Unit unit = Unit.INSTANCE;
                aVar3.getClass();
                ht.a.a(bundle, "EventIsRaceSelection");
                ny1.d dVar = ny1.d.YES;
                dVar.getClass();
                ((androidx.lifecycle.y0) addTIEventViewModel.S0.getValue()).m(dVar);
                addTIEventViewModel.O5().m("TIAddEventShareableFragment");
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.p.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.p.f46166c;
                ht.a aVar5 = ht.a.f85464a;
                Bundle bundle2 = new Bundle(1);
                bundle2.putBoolean("EventIsRace", false);
                Unit unit2 = Unit.INSTANCE;
                aVar5.getClass();
                ht.a.a(bundle2, "EventIsRaceSelection");
                ny1.d dVar2 = ny1.d.NO;
                dVar2.getClass();
                ((androidx.lifecycle.y0) addTIEventViewModel.S0.getValue()).m(dVar2);
                addTIEventViewModel.O5().m("TIAddEventShareableFragment");
                return Unit.INSTANCE;
        }
    }
}
