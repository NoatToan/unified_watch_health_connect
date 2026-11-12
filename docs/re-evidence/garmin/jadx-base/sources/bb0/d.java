package bb0;

import am.z0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.m;
import androidx.lifecycle.v1;
import bb1.g;
import bk0.k;
import bv0.o2;
import bv1.r;
import by1.j;
import by1.v;
import c22.v2;
import c62.t;
import c82.i;
import ca0.b1;
import ca0.n1;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewMultisportWorkoutActivity;
import e23.l;
import java.util.ArrayList;
import java.util.Map;
import jv1.n;
import lc.y;
import o13.u;
import o53.s0;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;
import r22.m0;
import vu1.w;
import zm.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17297c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f17295a = i14;
        this.f17296b = obj;
        this.f17297c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f17295a;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.f17297c;
        Object obj2 = this.f17296b;
        switch (i14) {
            case 0:
                ((p1) obj).setValue((f) obj2);
                return Unit.INSTANCE;
            case 1:
                ((l) obj2).invoke(Long.valueOf(((g) obj).f17320a));
                return Unit.INSTANCE;
            case 2:
                ((l) obj2).invoke((bk0.f) obj);
                return Unit.INSTANCE;
            case 3:
                ((l) obj2).invoke(((k) obj).f18494b);
                return Unit.INSTANCE;
            case 4:
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                ((ActivitiesTrimActivity) obj2).ga().f28873k.j((Double) ((u) obj).f128607c);
                return Unit.INSTANCE;
            case 5:
                bq.c cVar = (bq.c) obj;
                ro0.l lVar = z0.X(((p) obj2).U()) ? ro0.l.SURF_WAVE_DISTANCE : ro0.l.WAKESPORTS_RUN_DISTANCE;
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                m mVar = cVar.f19475a;
                aVar2.getClass();
                HelpActivity.a.d(mVar, lVar, null, null);
                return Unit.INSTANCE;
            case 6:
                bt1.u uVar = (bt1.u) obj2;
                uVar.g(uVar.f21148a, true, (e23.a) obj);
                return Unit.INSTANCE;
            case 7:
                o2.a((sc.f) obj2, null, null, null, (e23.a) obj);
                return Unit.INSTANCE;
            case 8:
                n nVar = (n) obj;
                w wVar = ((bv1.g) obj2).f21408c;
                if (wVar != null) {
                    wVar.v0(nVar.f101079a, nVar.f101101w, nVar.f101102x, nVar.f101089k, nVar.f101090l);
                }
                return Unit.INSTANCE;
            case 9:
                n nVar2 = (n) obj2;
                r rVar = (r) obj;
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachProgressReportView");
                tw1.m mVar2 = nVar2.f101079a;
                uv1.c cVar2 = (mVar2 == null || !mVar2.g0()) ? uv1.c.EVENT : uv1.c.OPEN_LOOP;
                if (mVar2 != null) {
                    FBTProgressReportActivity.a aVar3 = FBTProgressReportActivity.f45512b;
                    Context context = rVar.f21420a.getContext();
                    context.getClass();
                    Activity activity = (Activity) context;
                    long trainingPlanId = mVar2.getTrainingPlanId();
                    fg0.k kVar = nVar2.f101088j;
                    aVar3.getClass();
                    cVar2.getClass();
                    Intent intent = new Intent(activity, (Class<?>) FBTProgressReportActivity.class);
                    intent.putExtra("extras_plan_dto", mVar2);
                    intent.putExtra("extras_event_or_open_loop", cVar2.ordinal());
                    intent.putExtra("extras_training_plan_id", trainingPlanId);
                    intent.putExtra("GCM_extra_sharable_event_dto", kVar);
                    activity.startActivityForResult(intent, 300);
                }
                return Unit.INSTANCE;
            case 10:
                bv2.k kVar2 = (bv2.k) obj2;
                kVar2.f21513f.setImageDrawable((Drawable) obj);
                kVar2.f21513f.setVisibility(0);
                return Unit.INSTANCE;
            case 11:
                Context context2 = (Context) obj2;
                j jVar = j.f22190a;
                HelpActivity.a aVar4 = HelpActivity.f36653a;
                ro0.l lVar2 = ro0.l.STP_BENCHMARK_EXERCISES;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("EXTRA_BENCHMARKS", new ArrayList<>(((dy1.c) ((x3) obj).getF182175a()).f61537c));
                Unit unit = Unit.INSTANCE;
                HelpActivity.a.e(aVar4, context2, lVar2, null, bundle, 4);
                return Unit.INSTANCE;
            case 12:
                Activity activity2 = (Activity) obj2;
                ey1.a aVar5 = (ey1.a) obj;
                by1.m mVar3 = by1.m.f22196a;
                if (activity2 != null) {
                    by1.l lVar3 = new by1.l(activity2, i16);
                    w9.a aVarA = v1.a(aVar5);
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new ey1.c(aVar5, lVar3, activity2, null), 2);
                }
                return Unit.INSTANCE;
            case 13:
                v vVar = v.f22216a;
                ((ey1.a) obj2).J4((Context) obj);
                return Unit.INSTANCE;
            case 14:
                return new dy2.b(((by2.a) obj2).getF204131a(), ((yx2.a) obj) != null, null, 4, null);
            case 15:
                ((c.k) obj2).f22322c = (e23.a) obj;
                return Unit.INSTANCE;
            case 16:
                ((c.l) obj2).f22324d = (e23.p) obj;
                return Unit.INSTANCE;
            case 17:
                ((f12.l) obj2).r((v2) obj);
                return Unit.INSTANCE;
            case 18:
                InlineUnitsTextFieldView inlineUnitsTextFieldView = (InlineUnitsTextFieldView) obj2;
                Context context3 = (Context) obj;
                String title = inlineUnitsTextFieldView.pickerTitle;
                if (title == null && (title = inlineUnitsTextFieldView.getTitle()) == null) {
                    title = "";
                }
                new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(context3, new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a(title, false, (c32.d[]) inlineUnitsTextFieldView.unitList.toArray(new InlineUnitsTextFieldView.a[0]), inlineUnitsTextFieldView.currentUnit, 2, null), new c32.k(inlineUnitsTextFieldView, i15), new c32.j(inlineUnitsTextFieldView, 1));
                return Unit.INSTANCE;
            case 19:
                c60.e.d((androidx.fragment.app.v) obj2, "EditWayPointsBottomSheetFragment");
                ((x40.c) obj).invoke();
                return Unit.INSTANCE;
            case 20:
                ((c60.b) obj2).invoke();
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 21:
                ((c60.a) obj2).invoke();
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 22:
                MultiSportsDetailsActivity.a aVar6 = MultiSportsDetailsActivity.f48440z;
                ((m0) obj2).show(((MultiSportsDetailsActivity) obj).getSupportFragmentManager(), "WORKOUT_SENT_DIALOG_KEY");
                return Unit.INSTANCE;
            case 23:
                ViewMultisportWorkoutActivity viewMultisportWorkoutActivity = (ViewMultisportWorkoutActivity) obj;
                ViewMultisportWorkoutActivity.a aVar7 = ViewMultisportWorkoutActivity.f48481g;
                if (!((lc.m0) obj2).n()) {
                    viewMultisportWorkoutActivity.onBackPressed();
                }
                return Unit.INSTANCE;
            case 24:
                ((p1) obj).setValue(Boolean.FALSE);
                ((t) obj2).c2();
                return Unit.INSTANCE;
            case 25:
                ((l) obj2).invoke((c82.j) obj);
                return Unit.INSTANCE;
            case 26:
                ((l) obj2).invoke((i) obj);
                return Unit.INSTANCE;
            case 27:
                y.l((lc.m0) obj2, new b1.r(((b1.l) obj).f26109a));
                return Unit.INSTANCE;
            case 28:
                return ParametersHolderKt.parametersOf((Map) ((x3) obj).getF182175a(), zb0.l.valueOf(((b1.m) obj2).f26112a));
            default:
                ((lc.m0) obj2).h(new ca0.k(22), new n1.j(((n1.g) obj).f26365a));
                return Unit.INSTANCE;
        }
    }
}
