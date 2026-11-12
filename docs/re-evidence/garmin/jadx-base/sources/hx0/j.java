package hx0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleCalendarActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d f86089b;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar, int i14) {
        this.f86088a = i14;
        this.f86089b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Integer currentPhase;
        ww0.c cVar;
        int i14 = this.f86088a;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar = this.f86089b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                Context context = dVar.getContext();
                if (context != null) {
                    dVar.startActivityForResult(MCTSetupActivity.a.a(MCTSetupActivity.f39100c, context, 4), 104);
                    return;
                }
                return;
            case 1:
                dVar.f38909k.G0();
                BubbleLayout bubbleLayout = dVar.Y;
                if (bubbleLayout != null) {
                    bubbleLayout.setVisibility(8);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mctWithSkinTempTooltip");
                    throw null;
                }
            case 2:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                ax0.a aVar3 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                androidx.fragment.app.m mVarRequireActivity = dVar.requireActivity();
                mVarRequireActivity.getClass();
                aVar3.v(mVarRequireActivity);
                return;
            case 3:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                dVar.X6();
                return;
            case 4:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                dVar.X6();
                return;
            case 5:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                dVar.V6();
                return;
            case 6:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                dVar.V6();
                return;
            default:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                boolean zG = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a);
                cx0.a<ww0.c> aVarD = dVar.T6().A4(dVar.S6()).d();
                ww0.l cycleSummary = (aVarD == null || (cVar = aVarD.f56599a) == null) ? null : cVar.getCycleSummary();
                c22.h0 h0VarH = cycleSummary != null ? cycleSummary.h() : null;
                boolean z14 = false;
                if (cycleSummary != null && (currentPhase = cycleSummary.getCurrentPhase()) != null && currentPhase.intValue() == 1) {
                    z14 = true;
                }
                if ((h0VarH == null || !zG) && !z14) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("editPageSelected", com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.b.Calendar);
                    bundle.putSerializable("calendarMode", com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.EDIT_RANGE);
                    dVar.U6(bundle);
                    return;
                }
                MenstrualCycleCalendarActivity.a aVar9 = MenstrualCycleCalendarActivity.f38783c;
                Context contextRequireContext = dVar.requireContext();
                contextRequireContext.getClass();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.NORMAL;
                aVar9.getClass();
                dVar.startActivityForResult(MenstrualCycleCalendarActivity.a.a(contextRequireContext, aVar10), 103);
                return;
        }
    }
}
