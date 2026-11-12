package vr1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StressReportsActivity f179501b;

    public /* synthetic */ h(StressReportsActivity stressReportsActivity, int i14) {
        this.f179500a = i14;
        this.f179501b = stressReportsActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f179500a;
        StressReportsActivity stressReportsActivity = this.f179501b;
        switch (i14) {
            case 0:
                int i15 = StressReportsActivity.f45013d;
                sd2.f fVar = (sd2.f) ((w61.f) obj).a();
                if (fVar != null) {
                    stressReportsActivity.f45016c.a(stressReportsActivity, new n(fVar).f179557a);
                }
                break;
            default:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                int i16 = StressReportsActivity.f45013d;
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j.getClass();
                Bundle bundle = new Bundle();
                if (iIntValue > 0) {
                    bundle.putString("EXTRAS_AVERAGE_STRESS_VALUE", String.valueOf(iIntValue));
                    bundle.putInt("EXTRAS_AVERAGE_STRESS_LEVEL", jg.b.C(num));
                }
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.STRESS;
                aVar.getClass();
                HelpActivity.a.d(stressReportsActivity, lVar, null, bundle);
                break;
        }
        return Unit.INSTANCE;
    }
}
