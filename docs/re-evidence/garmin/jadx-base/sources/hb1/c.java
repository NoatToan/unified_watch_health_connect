package hb1;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.m;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetActivity;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.pickers.ExerciseWeightPickerActivity;
import com.garmin.android.apps.connectmobile.l2;
import o13.p;
import p005kotlin.jvm.internal.s;
import vr2.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f82759d;

    public /* synthetic */ c(m mVar, boolean z14, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar) {
        this.f82756a = 0;
        this.f82758c = mVar;
        this.f82757b = z14;
        this.f82759d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f82756a;
        int i15 = 0;
        boolean z14 = this.f82757b;
        Object obj = this.f82759d;
        Object obj2 = this.f82758c;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                p pVar = new p(mVar.getString(R.string.lbl_delete), new b((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a) obj, 1));
                p pVar2 = new p(mVar.getString(R.string.lbl_cancel), new h51.a(17));
                c22.f fVar = c22.f.f23050a;
                int i16 = z14 ? R.string.pregnancy_delete_record_message : R.string.pregnancy_delete_record_message_short;
                fVar.getClass();
                androidx.appcompat.app.e eVarA = c22.f.a(mVar, R.string.pregnancy_delete_record_question, i16, pVar, pVar2);
                eVarA.setOnShowListener(new d(mVar, i15));
                eVarA.show();
                return;
            case 1:
                q qVar = (q) obj2;
                com.garmin.feature.garminpay.ui.devicesettings.a aVar = (com.garmin.feature.garminpay.ui.devicesettings.a) obj;
                if (qVar != null) {
                    aVar.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.b(qVar, z14, false));
                    return;
                } else {
                    int i17 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                    return;
                }
            default:
                EditExerciseSetActivity editExerciseSetActivity = (EditExerciseSetActivity) obj2;
                EditExerciseSetActivity.a aVar2 = EditExerciseSetActivity.f29932e;
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = ((sq.a) obj).f160521b;
                Long lZ = eVar.Z();
                double dLongValue = 0.0d;
                if ((lZ == null || lZ.longValue() != -1) && ((lZ == null || lZ.longValue() != -2) && lZ != null)) {
                    if (z14) {
                        dLongValue = lZ.longValue() / 1000.0d;
                    } else {
                        l3.a aVar3 = l3.f23124b;
                        double dLongValue2 = lZ.longValue() / 1000.0d;
                        aVar3.getClass();
                        dLongValue = dLongValue2 * 2.20462d;
                    }
                }
                ExerciseWeightPickerActivity.a aVar4 = ExerciseWeightPickerActivity.f29943f;
                String str = eVar.f41115e;
                String str2 = eVar.f41116f;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = editExerciseSetActivity.f29936d;
                if (cVar == null) {
                    s.m("exerciseList");
                    throw null;
                }
                aVar4.getClass();
                Intent intent = new Intent(editExerciseSetActivity, (Class<?>) ExerciseWeightPickerActivity.class);
                if (str == null) {
                    str = "UNKNOWN";
                }
                if (str2 == null) {
                    str2 = "UNKNOWN";
                }
                com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new p("weight", Double.valueOf(dLongValue)), new p("exerciseCategoryKey", str), new p("exerciseKey", str2), new p("exerciseList", cVar)));
                editExerciseSetActivity.startActivityForResult(intent, 50505);
                return;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z14, int i14) {
        this.f82756a = i14;
        this.f82758c = obj;
        this.f82759d = obj2;
        this.f82757b = z14;
    }
}
