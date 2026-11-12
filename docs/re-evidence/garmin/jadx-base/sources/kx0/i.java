package kx0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MCTSettingsContraceptionActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTCycleTypeActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.mlkit.common.MlKitException;
import db1.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import qb1.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107050b;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar, int i14) {
        this.f107049a = i14;
        this.f107050b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        db1.m mVar;
        int i14 = this.f107049a;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107050b;
        switch (i14) {
            case 0:
                cx0.a aVar2 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                if (aVar2 == null) {
                    g22.e.l(aVar);
                } else {
                    g22.e.f(aVar);
                    Throwable th3 = aVar2.f56600b;
                    if (th3 != null) {
                        g22.e.d(aVar, cx0.b.a(th3));
                        aVar.C6(null, null);
                    } else {
                        if (aVar.f39072v) {
                            sn.a.o(f12.l.f68084a, true);
                        }
                        aVar.C6(Boolean.valueOf(aVar.f39072v), null);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                fw.m mVar2 = (fw.m) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                fw.p pVar = mVar2.f73769b;
                T t7 = mVar2.f73770c;
                int i15 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.b.f39077a[pVar.ordinal()];
                if (i15 == 1) {
                    g22.e.l(aVar);
                    aVar.f39073w = true;
                } else if (i15 == 2) {
                    if (t7 != 0 && !((Collection) t7).isEmpty()) {
                        i52.a.f91796a.getClass();
                        if (i52.a.l() != ww0.a.PREGNANT) {
                            for (db1.m mVar3 : (List) t7) {
                                if ((mVar3 != null ? mVar3.getDeliveryDate() : null) == null) {
                                    if ((mVar3 != null ? mVar3.getEndDate() : null) == null) {
                                        qb1.f fVar = (qb1.f) aVar.f39067q1.getValue();
                                        ge1.b.T(v1.a(fVar), null, null, new w(GCMSettingManager.s(), fVar, null), 3);
                                        i52.a aVar3 = i52.a.f91796a;
                                        ww0.a aVar4 = ww0.a.PREGNANT;
                                        aVar3.getClass();
                                        i52.a.t(aVar4);
                                    }
                                }
                            }
                        }
                    }
                    if (((Boolean) aVar.f39061n1.getValue()).booleanValue()) {
                        if (aVar.f39039d == ww0.a.PREGNANT) {
                            PregnancyStopTrackingActivity.a aVar5 = PregnancyStopTrackingActivity.f41001d;
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            aVar5.getClass();
                            PregnancyStopTrackingActivity.a.a(contextRequireContext, null);
                        } else {
                            MCTCycleTypeActivity.a aVar6 = MCTCycleTypeActivity.f39091e;
                            Context context = aVar.getContext();
                            ww0.a aVar7 = aVar.f39037c;
                            ww0.a aVar8 = aVar.f39039d;
                            aVar6.getClass();
                            aVar.startActivityForResult(MCTCycleTypeActivity.a.a(context, aVar7, aVar8), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                        }
                    }
                    if (((Boolean) aVar.f39063o1.getValue()).booleanValue()) {
                        MCTSettingsContraceptionActivity.a aVar9 = MCTSettingsContraceptionActivity.f39006d;
                        Context contextRequireContext2 = aVar.requireContext();
                        contextRequireContext2.getClass();
                        ww0.i iVar = aVar.f39043f;
                        aVar9.getClass();
                        iVar.getClass();
                        Intent intent = new Intent(contextRequireContext2, (Class<?>) MCTSettingsContraceptionActivity.class);
                        intent.putExtra("SELECTED_CONTRACEPTIVE_KEY", iVar);
                        aVar.startActivityForResult(intent, 202);
                    }
                    g22.e.f(aVar);
                    aVar.f39073w = false;
                    if (((Boolean) aVar.f39059m1.getValue()).booleanValue()) {
                        ScrollView scrollView = aVar.D;
                        if (scrollView == null) {
                            p005kotlin.jvm.internal.s.m("mScrollView");
                            throw null;
                        }
                        ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(new l(viewTreeObserver, aVar));
                        }
                    }
                    tb1.c.a aVar10 = tb1.c.f163744a;
                    ww0.a aVar11 = aVar.f39039d;
                    aVar10.getClass();
                    if (tb1.c.a.a(aVar11) && (mVar = aVar.w6().f107065h) != null) {
                        u weightGoalUserInputs = mVar.getWeightGoalUserInputs();
                        aVar.f39074x = db1.m.b(mVar, weightGoalUserInputs != null ? u.b(weightGoalUserInputs) : null);
                        aVar.B = mVar.getDueDate();
                    }
                    ArrayList arrayList = aVar.w6().f107066i;
                    if (arrayList == null || arrayList.isEmpty()) {
                        View view2 = aVar.E;
                        if (view2 == null) {
                            p005kotlin.jvm.internal.s.m("pregnancyBottomSettingsFragment");
                            throw null;
                        }
                        view2.setVisibility(8);
                    } else {
                        pb1.b.a aVar12 = pb1.b.f136832c;
                        ArrayList arrayList2 = aVar.w6().f107066i;
                        arrayList2.getClass();
                        aVar12.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("extra_pregnancy_history_list", new ArrayList<>(arrayList2));
                        pb1.b bVar = new pb1.b();
                        bVar.setArguments(bundle);
                        v fragmentManager = aVar.getFragmentManager();
                        androidx.fragment.app.a aVar13 = fragmentManager != null ? new androidx.fragment.app.a(fragmentManager) : null;
                        if (aVar13 != null) {
                            aVar13.j(R.id.pregnancy_bottom_settings_fragment, bVar, "PregnancySettingsBottomFragment", 1);
                        }
                        if (aVar13 != null) {
                            aVar13.e();
                        }
                        View view3 = aVar.E;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("pregnancyBottomSettingsFragment");
                            throw null;
                        }
                        view3.setVisibility(0);
                    }
                    View view4 = aVar.E;
                    if (view4 == null) {
                        p005kotlin.jvm.internal.s.m("pregnancyBottomSettingsFragment");
                        throw null;
                    }
                    view4.setVisibility(8);
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(aVar);
                    aVar.f39073w = false;
                    g22.e.a(aVar, mVar2.f73771d);
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                int i16 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.b.f39077a[((fw.m) obj).f73769b.ordinal()];
                if (i16 == 1) {
                    g22.e.l(aVar);
                } else if (i16 == 2) {
                    g22.e.f(aVar);
                    Boolean bool = Boolean.TRUE;
                    if (aVar.f39072v) {
                        sn.a.o(f12.l.f68084a, true);
                    }
                    aVar.C6(Boolean.valueOf(aVar.f39072v), bool);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(aVar);
                    androidx.appcompat.app.e.a aVar14 = new androidx.appcompat.app.e.a(aVar.requireContext());
                    aVar14.setTitle(R.string.pregnancy_error_saving_title);
                    aVar14.setMessage(aVar.getString(R.string.pregnancy_error_saving_message));
                    aVar14.setPositiveButton(R.string.lbl_ok, new f(aVar, 1));
                    androidx.appcompat.app.e eVarCreate = aVar14.create();
                    eVarCreate.getClass();
                    eVarCreate.show();
                }
                return Unit.INSTANCE;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                aVar.f39047h = iIntValue;
                TextView textView = aVar.P0;
                if (textView != null) {
                    aVar.M6(textView, iIntValue);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("mctSettingsPeriodDurationValue");
                throw null;
            case 4:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 <= 100 && aVar.f39045g > 100) {
                    aVar.f39053k = true;
                } else if (iIntValue2 <= 100) {
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                } else if (aVar.f39045g <= 100) {
                    aVar.f39053k = false;
                }
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a.getClass();
                j23.l lVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39090b;
                if (lVar.d(iIntValue2) && !lVar.d(aVar.f39045g)) {
                    aVar.f39049i = true;
                } else if (!lVar.d(iIntValue2) && lVar.d(aVar.f39045g)) {
                    aVar.f39049i = false;
                }
                aVar.f39045g = iIntValue2;
                TextView textView2 = aVar.O0;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("mctSettingsCycleLengthValue");
                    throw null;
                }
                aVar.M6(textView2, iIntValue2);
                aVar.T6();
                aVar.K6();
                return Unit.INSTANCE;
            default:
                cx0.a aVar15 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                if (aVar15 == null) {
                    g22.e.l(aVar);
                } else {
                    UserSettingsDTO userSettingsDTOS = (UserSettingsDTO) aVar15.f56599a;
                    if (userSettingsDTOS == null) {
                        userSettingsDTOS = GCMSettingManager.s();
                    }
                    aVar.f39035b = userSettingsDTOS;
                    aVar.y6();
                    aVar.E6(false);
                    aVar.A6();
                }
                return Unit.INSTANCE;
        }
    }
}
