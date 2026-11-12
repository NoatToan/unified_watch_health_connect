package ty1;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.u f167132b;

    public /* synthetic */ h1(com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar, int i14) {
        this.f167131a = i14;
        this.f167132b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14 = this.f167131a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = this.f167132b;
        Object[] objArr = 0;
        String string = null;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g02.b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), uVar.C6().D2, uVar.w6(), uVar.C6().H2, gl1.y.Q(mVar, R.string.set_leg_distance_title), null, null, null, null, mVar, 0, 480);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1491450554, new h1(uVar, objArr == true ? 1 : 0), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                bg0.a.c cVar = (bg0.a.c) obj;
                bg0.a.b bVar = (bg0.a.b) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                bVar.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar2 = this.f167132b;
                InlineUnitsTextFieldView inlineUnitsTextFieldView = uVar2.f46276f;
                if (inlineUnitsTextFieldView == null) {
                    p005kotlin.jvm.internal.s.m("swimDistanceView");
                    throw null;
                }
                TextView textView = uVar2.f46279i;
                if (textView != null) {
                    uVar2.E6(false, false, inlineUnitsTextFieldView, textView, cVar, cVar, bVar, null, null);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("swimDistanceRangeView");
                throw null;
            case 3:
                bg0.a.c cVar2 = (bg0.a.c) obj;
                bg0.a.b bVar2 = (bg0.a.b) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                bVar2.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar3 = this.f167132b;
                InlineUnitsTextFieldView inlineUnitsTextFieldView2 = uVar3.f46277g;
                if (inlineUnitsTextFieldView2 == null) {
                    p005kotlin.jvm.internal.s.m("bikeDistanceView");
                    throw null;
                }
                TextView textView2 = uVar3.f46280j;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("bikeDistanceRangeView");
                    throw null;
                }
                bg0.a.c cVar3 = uVar3.f46290v;
                Double d14 = uVar3.f46288r;
                androidx.fragment.app.m activity = uVar3.getActivity();
                if (activity != null) {
                    androidx.fragment.app.m activity2 = uVar3.getActivity();
                    string = activity.getString(R.string.change_leg_distance_alert_title, activity2 != null ? activity2.getString(R.string.lbl_bike) : null);
                }
                uVar3.E6(true, false, inlineUnitsTextFieldView2, textView2, cVar3, cVar2, bVar2, d14, string);
                return Unit.INSTANCE;
            default:
                bg0.a.c cVar4 = (bg0.a.c) obj;
                bg0.a.b bVar3 = (bg0.a.b) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                bVar3.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar4 = this.f167132b;
                InlineUnitsTextFieldView inlineUnitsTextFieldView3 = uVar4.f46278h;
                if (inlineUnitsTextFieldView3 == null) {
                    p005kotlin.jvm.internal.s.m("runDistanceView");
                    throw null;
                }
                TextView textView3 = uVar4.f46281k;
                if (textView3 == null) {
                    p005kotlin.jvm.internal.s.m("runDistanceRangeView");
                    throw null;
                }
                bg0.a.c cVar5 = uVar4.f46291w;
                Double d15 = uVar4.f46289t;
                androidx.fragment.app.m activity3 = uVar4.getActivity();
                if (activity3 != null) {
                    androidx.fragment.app.m activity4 = uVar4.getActivity();
                    string = activity3.getString(R.string.change_leg_distance_alert_title, activity4 != null ? activity4.getString(R.string.lbl_run) : null);
                }
                uVar4.E6(false, true, inlineUnitsTextFieldView3, textView3, cVar5, cVar4, bVar3, d15, string);
                return Unit.INSTANCE;
        }
    }
}
