package tt1;

import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanActivity;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166410b;

    public /* synthetic */ a(ActiveTrainingPlansActivity activeTrainingPlansActivity, int i14) {
        this.f166409a = i14;
        this.f166410b = activeTrainingPlansActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int iOrdinal;
        int i14 = this.f166409a;
        ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166410b;
        switch (i14) {
            case 0:
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                activeTrainingPlansActivity.oa();
                return Unit.INSTANCE;
            default:
                ActiveTrainingPlansActivity.a aVar2 = ActiveTrainingPlansActivity.f45098w;
                FindTrainingPlanActivity.a aVar3 = FindTrainingPlanActivity.f45585g;
                ut1.e eVar = activeTrainingPlansActivity.f45108n;
                if (eVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                if (eVar.f172584c > 0) {
                    iOrdinal = jw1.a.COMPLETED_NO_ACTIVE.ordinal();
                } else {
                    fy1.i.f73924a.getClass();
                    iOrdinal = (fy1.i.a.o() ? jw1.a.FBTA_PLAN_TYPE_SELECTION : jw1.a.NON_DSW_CAPABLE).ordinal();
                }
                ut1.e eVar2 = activeTrainingPlansActivity.f45108n;
                if (eVar2 == null) {
                    s.m("viewModel");
                    throw null;
                }
                int i15 = eVar2.f172584c;
                String str = activeTrainingPlansActivity.f45113t;
                boolean z14 = str != null;
                aVar3.getClass();
                FindTrainingPlanActivity.a.a(activeTrainingPlansActivity, str, iOrdinal, i15, z14);
                activeTrainingPlansActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
