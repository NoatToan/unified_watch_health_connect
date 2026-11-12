package p3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.m;
import androidx.media3.exoplayer.ExoPlayer;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgCompleteSetupTwoStepVerificationFragment;
import com.garmin.android.apps.connectmobile.group.details.challenges.GroupDetailChallengeListFragment;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancySegmentedButton;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import db1.u;
import gg1.j0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135226b;

    public /* synthetic */ q1(Object obj, int i14) {
        this.f135225a = i14;
        this.f135226b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        gg1.h0 h0VarA;
        androidx.fragment.app.m activity;
        String str;
        final db1.u weightGoalUserInputs;
        final androidx.fragment.app.m activity2;
        final db1.u weightGoalUserInputs2;
        final androidx.fragment.app.m activity3;
        db1.u weightGoalUserInputs3;
        androidx.fragment.app.m activity4;
        db1.b numOfBabies;
        db1.m mVar;
        of2.b bVar;
        db1.u uVarC;
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        Unit unit;
        char c14 = 1;
        final int i14 = 0;
        switch (this.f135225a) {
            case 0:
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(((s1) obj).f135272b, (j1) this.f135226b));
            case 1:
                c0 c0Var = (c0) this.f135226b;
                s2.a aVar = s2.f135273z;
                c0Var.a(obj);
                return Unit.INSTANCE;
            case 2:
                s2 s2Var = (s2) this.f135226b;
                Throwable th3 = (Throwable) obj;
                s2.a aVar2 = s2.f135273z;
                CancellationException cancellationExceptionA = gl1.d.a("Recomposer effect job completed", th3);
                synchronized (s2Var.f135276c) {
                    try {
                        o53.l1 l1Var = s2Var.f135277d;
                        if (l1Var != null) {
                            s2Var.f135294u.setValue(s2.d.ShuttingDown);
                            l1Var.c(cancellationExceptionA);
                            s2Var.f135291r = null;
                            l1Var.J(new o50.a(21, s2Var, th3));
                        } else {
                            s2Var.f135278e = cancellationExceptionA;
                            s2Var.f135294u.setValue(s2.d.ShutDown);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                f3 f3Var = (f3) this.f135226b;
                q53.w<? super Unit> wVar = f3Var.f135083f;
                wVar.getClass();
                if (!p005kotlin.jvm.internal.s.g(f3Var.f135083f, wVar)) {
                    j2.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                p1.u0<Object> u0Var = f3Var.f135082e;
                Object obj2 = f3Var.f135080c;
                if (u0Var != null) {
                    if (obj2 != null) {
                        j2.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    u0Var.d(obj);
                } else if (obj2 == null) {
                    f3Var.f135080c = obj;
                } else {
                    p1.u0<Object> u0VarA = p1.i1.a();
                    u0VarA.d(obj2);
                    u0VarA.d(obj);
                    f3Var.f135082e = u0VarA;
                    f3Var.f135080c = null;
                }
                return Unit.INSTANCE;
            case 4:
                ((k3) this.f135226b).u(((Double) obj).doubleValue());
                return Unit.INSTANCE;
            case 5:
                ((l3) this.f135226b).i(((Float) obj).floatValue());
                return Unit.INSTANCE;
            case 6:
                ((m3) this.f135226b).t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 7:
                ((n3) this.f135226b).k(((Long) obj).longValue());
                return Unit.INSTANCE;
            case 8:
                ((o3) this.f135226b).setValue(obj);
                return Unit.INSTANCE;
            case 9:
                i63.c cVar = (i63.c) this.f135226b;
                ((List) obj).getClass();
                return cVar;
            case 10:
                CompanionDeviceLinkActivity companionDeviceLinkActivity = (CompanionDeviceLinkActivity) this.f135226b;
                ((Boolean) obj).getClass();
                CompanionDeviceLinkActivity.a aVar3 = CompanionDeviceLinkActivity.f33743a;
                companionDeviceLinkActivity.finish();
                return Unit.INSTANCE;
            case 11:
                z10.b2 b2Var = (z10.b2) this.f135226b;
                v92.k kVar = (v92.k) obj;
                p92.o oVar = p92.o.f136619a;
                if (kVar != null) {
                    b2Var.onChanged(kVar);
                }
                return Unit.INSTANCE;
            case 12:
                final pb1.l lVar = (pb1.l) this.f135226b;
                Logger logger = pb1.l.f136862m;
                int i15 = pb1.l.b.f136874a[((fw.m) obj).f73769b.ordinal()];
                if (i15 == 1) {
                    logger.debug("checkLiveData", "fragmentLoading");
                } else if (i15 == 2) {
                    androidx.fragment.app.m activity5 = lVar.getActivity();
                    if (activity5 != null) {
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = lVar.f136863a;
                        if (gCMPregnancyTwoLineButton == null) {
                            p005kotlin.jvm.internal.s.m("mCycleType");
                            throw null;
                        }
                        gCMPregnancyTwoLineButton.setOnClickListener(new lq.g(27, lVar, activity5));
                    }
                    androidx.fragment.app.m activity6 = lVar.getActivity();
                    if (activity6 != null && (mVar = lVar.v6().f107065h) != null) {
                        LocalDate dueDate = mVar.getDueDate();
                        if (dueDate != null) {
                            lVar.u6().setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(dueDate.toDate()));
                        } else {
                            lVar.u6().setButtonValueLabel(activity6.getString(R.string.no_value));
                        }
                        lVar.u6().setOnClickListener(new bv2.j(mVar, 24, lVar, activity6));
                    }
                    db1.m mVar2 = lVar.v6().f107065h;
                    if (mVar2 != null && (activity4 = lVar.getActivity()) != null && (numOfBabies = mVar2.getNumOfBabies()) != null) {
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = lVar.f136866d;
                        if (gCMPregnancyTwoLineButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mExpectingButton");
                            throw null;
                        }
                        gCMPregnancyTwoLineButton2.setButtonValueLabel(numOfBabies.a(activity4));
                        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                        p0Var.f105807a = numOfBabies.ordinal();
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton3 = lVar.f136866d;
                        if (gCMPregnancyTwoLineButton3 == null) {
                            p005kotlin.jvm.internal.s.m("mExpectingButton");
                            throw null;
                        }
                        ew2.c cVar2 = new ew2.c(activity4, lVar, p0Var, mVar2, 18);
                        lVar = lVar;
                        gCMPregnancyTwoLineButton3.setOnClickListener(cVar2);
                    }
                    db1.m mVar3 = lVar.v6().f107065h;
                    if (mVar3 != null && (weightGoalUserInputs3 = mVar3.getWeightGoalUserInputs()) != null) {
                        GCMPregnancySegmentedButton gCMPregnancySegmentedButton = lVar.f136867e;
                        if (gCMPregnancySegmentedButton == null) {
                            p005kotlin.jvm.internal.s.m("mWeightGainGoalsButton");
                            throw null;
                        }
                        boolean weightGoalRecommendation = weightGoalUserInputs3.getWeightGoalRecommendation();
                        SwitchCompat switchCompat = gCMPregnancySegmentedButton.f41018f;
                        if (switchCompat != null) {
                            switchCompat.setChecked(weightGoalRecommendation);
                        }
                        lVar.w6(weightGoalUserInputs3);
                        GCMPregnancySegmentedButton gCMPregnancySegmentedButton2 = lVar.f136867e;
                        if (gCMPregnancySegmentedButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mWeightGainGoalsButton");
                            throw null;
                        }
                        gCMPregnancySegmentedButton2.setOnSwitchClickListener(new lq.g(28, weightGoalUserInputs3, lVar));
                    }
                    db1.m mVar4 = lVar.v6().f107065h;
                    if (mVar4 != null && (weightGoalUserInputs2 = mVar4.getWeightGoalUserInputs()) != null && (activity3 = lVar.getActivity()) != null) {
                        final p005kotlin.jvm.internal.n0 n0Var = new p005kotlin.jvm.internal.n0();
                        Double weightInGram = weightGoalUserInputs2.getWeightInGram();
                        if (weightInGram != null) {
                            double dDoubleValue = weightInGram.doubleValue();
                            n0Var.f105805a = dDoubleValue;
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton4 = lVar.f136870h;
                            if (gCMPregnancyTwoLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("mWeightButton");
                                throw null;
                            }
                            tb1.e.a aVar4 = tb1.e.f163745a;
                            c22.l3.f23124b.getClass();
                            double dP1 = c22.l3.a.P1(dDoubleValue);
                            aVar4.getClass();
                            gCMPregnancyTwoLineButton4.setButtonValueLabel(tb1.e.a.f(activity3, dP1));
                        } else {
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton5 = lVar.f136870h;
                            if (gCMPregnancyTwoLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("mWeightButton");
                                throw null;
                            }
                            gCMPregnancyTwoLineButton5.setButtonValueLabel(activity3.getString(R.string.no_value));
                        }
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton6 = lVar.f136870h;
                        if (gCMPregnancyTwoLineButton6 == null) {
                            p005kotlin.jvm.internal.s.m("mWeightButton");
                            throw null;
                        }
                        final int i16 = 1;
                        gCMPregnancyTwoLineButton6.setOnClickListener(new View.OnClickListener() { // from class: pb1.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i17 = i16;
                                l lVar2 = lVar;
                                u uVar = weightGoalUserInputs2;
                                n0 n0Var2 = n0Var;
                                switch (i17) {
                                    case 0:
                                        l.a aVar5 = l.f136861l;
                                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                        m mVar5 = activity3;
                                        new j0(mVar5, zY, new i(uVar, lVar2, mVar5), Double.valueOf(n0Var2.f105805a));
                                        break;
                                    default:
                                        l.a aVar6 = l.f136861l;
                                        m mVar6 = activity3;
                                        i iVar = new i(uVar, lVar2, mVar6);
                                        l3.a aVar7 = l3.f23124b;
                                        double d14 = n0Var2.f105805a;
                                        aVar7.getClass();
                                        new j42.b((Context) mVar6, (j42.b.InterfaceC1852b) iVar, l3.a.P1(d14), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, 0, 0, 0, 0, 480, (p005kotlin.jvm.internal.j) null);
                                        break;
                                }
                            }
                        });
                    }
                    db1.m mVar5 = lVar.v6().f107065h;
                    if (mVar5 != null && (weightGoalUserInputs = mVar5.getWeightGoalUserInputs()) != null && (activity2 = lVar.getActivity()) != null) {
                        final p005kotlin.jvm.internal.n0 n0Var2 = new p005kotlin.jvm.internal.n0();
                        Double heightInCm = weightGoalUserInputs.getHeightInCm();
                        if (heightInCm != null) {
                            double dDoubleValue2 = heightInCm.doubleValue();
                            n0Var2.f105805a = dDoubleValue2;
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton7 = lVar.f136871i;
                            if (gCMPregnancyTwoLineButton7 == null) {
                                p005kotlin.jvm.internal.s.m("mHeightButton");
                                throw null;
                            }
                            tb1.e.f163745a.getClass();
                            gCMPregnancyTwoLineButton7.setButtonValueLabel(tb1.e.a.d((float) dDoubleValue2, activity2));
                        } else {
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton8 = lVar.f136871i;
                            if (gCMPregnancyTwoLineButton8 == null) {
                                p005kotlin.jvm.internal.s.m("mHeightButton");
                                throw null;
                            }
                            gCMPregnancyTwoLineButton8.setButtonValueLabel(activity2.getString(R.string.no_value));
                        }
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton9 = lVar.f136871i;
                        if (gCMPregnancyTwoLineButton9 == null) {
                            p005kotlin.jvm.internal.s.m("mHeightButton");
                            throw null;
                        }
                        final int i17 = 0;
                        gCMPregnancyTwoLineButton9.setOnClickListener(new View.OnClickListener() { // from class: pb1.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i18 = i17;
                                l lVar2 = lVar;
                                u uVar = weightGoalUserInputs;
                                n0 n0Var3 = n0Var2;
                                switch (i18) {
                                    case 0:
                                        l.a aVar5 = l.f136861l;
                                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                        m mVar6 = activity2;
                                        new j0(mVar6, zY, new i(uVar, lVar2, mVar6), Double.valueOf(n0Var3.f105805a));
                                        break;
                                    default:
                                        l.a aVar6 = l.f136861l;
                                        m mVar7 = activity2;
                                        i iVar = new i(uVar, lVar2, mVar7);
                                        l3.a aVar7 = l3.f23124b;
                                        double d14 = n0Var3.f105805a;
                                        aVar7.getClass();
                                        new j42.b((Context) mVar7, (j42.b.InterfaceC1852b) iVar, l3.a.P1(d14), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, 0, 0, 0, 0, 480, (p005kotlin.jvm.internal.j) null);
                                        break;
                                }
                            }
                        });
                    }
                    final UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton3 = lVar.f136868f;
                    if (gCMPregnancySegmentedButton3 == null) {
                        p005kotlin.jvm.internal.s.m("mBabyMovementButton");
                        throw null;
                    }
                    boolean zK = i52.a.k();
                    SwitchCompat switchCompat2 = gCMPregnancySegmentedButton3.f41018f;
                    if (switchCompat2 != null) {
                        switchCompat2.setChecked(zK);
                    }
                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton4 = lVar.f136868f;
                    if (gCMPregnancySegmentedButton4 == null) {
                        p005kotlin.jvm.internal.s.m("mBabyMovementButton");
                        throw null;
                    }
                    gCMPregnancySegmentedButton4.setOnSwitchClickListener(new View.OnClickListener() { // from class: pb1.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i18 = i14;
                            UserSettingsDTO userSettingsDTO = userSettingsDTOS;
                            l lVar2 = lVar;
                            switch (i18) {
                                case 0:
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton5 = lVar2.f136868f;
                                    if (gCMPregnancySegmentedButton5 == null) {
                                        s.m("mBabyMovementButton");
                                        throw null;
                                    }
                                    boolean zA = gCMPregnancySegmentedButton5.a();
                                    i52.a aVar5 = i52.a.f91796a;
                                    f12.l.f68084a.getClass();
                                    f12.l.a.a().o4(zA);
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton6 = lVar2.f136868f;
                                    if (gCMPregnancySegmentedButton6 != null) {
                                        userSettingsDTO.e0(gCMPregnancySegmentedButton6.a());
                                        return;
                                    } else {
                                        s.m("mBabyMovementButton");
                                        throw null;
                                    }
                                default:
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton7 = lVar2.f136869g;
                                    if (gCMPregnancySegmentedButton7 == null) {
                                        s.m("mBloodGlucoseButton");
                                        throw null;
                                    }
                                    boolean zA2 = gCMPregnancySegmentedButton7.a();
                                    i52.a aVar6 = i52.a.f91796a;
                                    f12.l.f68084a.getClass();
                                    f12.l.a.a().o0(zA2);
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton8 = lVar2.f136869g;
                                    if (gCMPregnancySegmentedButton8 == null) {
                                        s.m("mBloodGlucoseButton");
                                        throw null;
                                    }
                                    userSettingsDTO.k0(gCMPregnancySegmentedButton8.a());
                                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton10 = lVar2.f136872j;
                                    if (gCMPregnancyTwoLineButton10 == null) {
                                        s.m("mGlucoseMeasurementButton");
                                        throw null;
                                    }
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton9 = lVar2.f136869g;
                                    if (gCMPregnancySegmentedButton9 != null) {
                                        gCMPregnancyTwoLineButton10.setVisibility(gCMPregnancySegmentedButton9.a() ? 0 : 8);
                                        return;
                                    } else {
                                        s.m("mBloodGlucoseButton");
                                        throw null;
                                    }
                            }
                        }
                    });
                    final UserSettingsDTO userSettingsDTOS2 = GCMSettingManager.s();
                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton5 = lVar.f136869g;
                    if (gCMPregnancySegmentedButton5 == null) {
                        p005kotlin.jvm.internal.s.m("mBloodGlucoseButton");
                        throw null;
                    }
                    boolean zN = i52.a.n();
                    SwitchCompat switchCompat3 = gCMPregnancySegmentedButton5.f41018f;
                    if (switchCompat3 != null) {
                        switchCompat3.setChecked(zN);
                    }
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton10 = lVar.f136872j;
                    if (gCMPregnancyTwoLineButton10 == null) {
                        p005kotlin.jvm.internal.s.m("mGlucoseMeasurementButton");
                        throw null;
                    }
                    gCMPregnancyTwoLineButton10.setVisibility(i52.a.n() ? 0 : 8);
                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton6 = lVar.f136869g;
                    if (gCMPregnancySegmentedButton6 == null) {
                        p005kotlin.jvm.internal.s.m("mBloodGlucoseButton");
                        throw null;
                    }
                    final char c15 = c14 == true ? 1 : 0;
                    gCMPregnancySegmentedButton6.setOnSwitchClickListener(new View.OnClickListener() { // from class: pb1.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i18 = c15;
                            UserSettingsDTO userSettingsDTO = userSettingsDTOS2;
                            l lVar2 = lVar;
                            switch (i18) {
                                case 0:
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton7 = lVar2.f136868f;
                                    if (gCMPregnancySegmentedButton7 == null) {
                                        s.m("mBabyMovementButton");
                                        throw null;
                                    }
                                    boolean zA = gCMPregnancySegmentedButton7.a();
                                    i52.a aVar5 = i52.a.f91796a;
                                    f12.l.f68084a.getClass();
                                    f12.l.a.a().o4(zA);
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton8 = lVar2.f136868f;
                                    if (gCMPregnancySegmentedButton8 != null) {
                                        userSettingsDTO.e0(gCMPregnancySegmentedButton8.a());
                                        return;
                                    } else {
                                        s.m("mBabyMovementButton");
                                        throw null;
                                    }
                                default:
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton9 = lVar2.f136869g;
                                    if (gCMPregnancySegmentedButton9 == null) {
                                        s.m("mBloodGlucoseButton");
                                        throw null;
                                    }
                                    boolean zA2 = gCMPregnancySegmentedButton9.a();
                                    i52.a aVar6 = i52.a.f91796a;
                                    f12.l.f68084a.getClass();
                                    f12.l.a.a().o0(zA2);
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton10 = lVar2.f136869g;
                                    if (gCMPregnancySegmentedButton10 == null) {
                                        s.m("mBloodGlucoseButton");
                                        throw null;
                                    }
                                    userSettingsDTO.k0(gCMPregnancySegmentedButton10.a());
                                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton11 = lVar2.f136872j;
                                    if (gCMPregnancyTwoLineButton11 == null) {
                                        s.m("mGlucoseMeasurementButton");
                                        throw null;
                                    }
                                    GCMPregnancySegmentedButton gCMPregnancySegmentedButton11 = lVar2.f136869g;
                                    if (gCMPregnancySegmentedButton11 != null) {
                                        gCMPregnancyTwoLineButton11.setVisibility(gCMPregnancySegmentedButton11.a() ? 0 : 8);
                                        return;
                                    } else {
                                        s.m("mBloodGlucoseButton");
                                        throw null;
                                    }
                            }
                        }
                    });
                    UserSettingsDTO userSettingsDTOS3 = GCMSettingManager.s();
                    wi1.j jVar = userSettingsDTOS3.f43524b;
                    if (jVar == null || (str = jVar.f185539b) == null) {
                        h0VarA = null;
                    } else {
                        gg1.h0.f77238d.getClass();
                        h0VarA = gg1.h0.a.a(str);
                    }
                    if (h0VarA != null && (activity = lVar.getActivity()) != null) {
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton11 = lVar.f136872j;
                        if (gCMPregnancyTwoLineButton11 == null) {
                            p005kotlin.jvm.internal.s.m("mGlucoseMeasurementButton");
                            throw null;
                        }
                        gCMPregnancyTwoLineButton11.setButtonValueLabel(lVar.getString(h0VarA.f77243b));
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton12 = lVar.f136872j;
                        if (gCMPregnancyTwoLineButton12 == null) {
                            p005kotlin.jvm.internal.s.m("mGlucoseMeasurementButton");
                            throw null;
                        }
                        String string = lVar.getString(h0VarA.f77244c);
                        string.getClass();
                        gCMPregnancyTwoLineButton12.setValueContentDescription(string);
                        p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
                        p0Var2.f105807a = h0VarA.ordinal();
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton13 = lVar.f136872j;
                        if (gCMPregnancyTwoLineButton13 == null) {
                            p005kotlin.jvm.internal.s.m("mGlucoseMeasurementButton");
                            throw null;
                        }
                        gCMPregnancyTwoLineButton13.setOnClickListener(new ew2.c(activity, lVar, p0Var2, userSettingsDTOS3, 17));
                    }
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    logger.debug("checkLiveData", "fragmentError");
                }
                return Unit.INSTANCE;
            case 13:
                androidx.navigation.fragment.a aVar5 = (androidx.navigation.fragment.a) this.f135226b;
                lc.v vVar = (lc.v) obj;
                int i18 = androidx.navigation.fragment.a.f10129j;
                vVar.getClass();
                return new androidx.core.view.q(6, aVar5, vVar);
            case 14:
                com.garmin.android.library.backgroundtaskmanagement.e eVar = (com.garmin.android.library.backgroundtaskmanagement.e) this.f135226b;
                if (((o53.p1) eVar.l()).isCancelled()) {
                    eVar.d();
                }
                return Unit.INSTANCE;
            case 15:
                EcgCompleteSetupTwoStepVerificationFragment ecgCompleteSetupTwoStepVerificationFragment = (EcgCompleteSetupTwoStepVerificationFragment) this.f135226b;
                Intent intent = (Intent) obj;
                if (intent != null) {
                    ecgCompleteSetupTwoStepVerificationFragment.f34863b.a(intent, null);
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.USER;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "EcgCompleteSetupTwoStepVerificationFragment", "[navigateToMultiFactorAuthenticationFlow] MFA flow started");
                } else {
                    int i19 = EcgCompleteSetupTwoStepVerificationFragment.f34861c;
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.ONBOARDING;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "EcgCompleteSetupTwoStepVerificationFragment", "[navigateToMultiFactorAuthenticationFlow] MFA flow couldn't be started");
                }
                return Unit.INSTANCE;
            case 16:
                ExoPlayer exoPlayer = (ExoPlayer) this.f135226b;
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                ((i0) obj).getClass();
                return new com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.c(exoPlayer);
            case 17:
                pg2.b bVar2 = (pg2.b) this.f135226b;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != ((Number) ((r53.b2) bVar2.x4()).f150540a.getValue()).intValue() && (bVar = bVar2.f137618b) != null) {
                    qg2.c cVar3 = bVar2.f137617a;
                    pg2.a.f137610c.getClass();
                    pg2.a aVarA = pg2.a.b.a(iIntValue);
                    cVar3.getClass();
                    LinkedHashMap linkedHashMapN = p13.u0.n((Map) bVar.f131734m.f150540a.getValue());
                    linkedHashMapN.put(cVar3, aVarA);
                    bVar.f131733l.k(null, p13.u0.m(linkedHashMapN));
                }
                return Unit.INSTANCE;
            case 18:
                pl1.e eVar2 = (pl1.e) this.f135226b;
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                pl1.e.a aVar7 = pl1.e.f138542h;
                iVar.getClass();
                iVar.clear();
                List<GeoPointDTO> list = eVar2.f138543e;
                if (list == null || list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                List<GeoPointDTO> list2 = eVar2.f138543e;
                if (list2 != null) {
                    GeoPointDTO geoPointDTO = list2.get(0).b() ? list2.get(0) : null;
                    if (geoPointDTO != null) {
                        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                        pVar.b(2131232000);
                        pVar.d(eVar2.y6(geoPointDTO));
                        iVar.x(pVar);
                    }
                    int size = list2.size() - 1;
                    if (size > 0) {
                        GeoPointDTO geoPointDTO2 = list2.get(size).b() ? list2.get(size) : null;
                        if (geoPointDTO2 != null) {
                            com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
                            pVar2.b(2131232001);
                            pVar2.d(eVar2.y6(geoPointDTO2));
                            iVar.x(pVar2);
                        }
                    }
                    com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
                    ie2.p pVar3 = qVar.f50328a;
                    Context context = eVar2.getContext();
                    if (context != null) {
                        pVar3.f93156d = a7.b.getColor(context, R.color.gcm_map_segment_track_path);
                    }
                    pVar3.f93155c = 5.0f;
                    pVar3.f93161i = true;
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        pVar3.f93153a.add(eVar2.y6((GeoPointDTO) it.next()));
                    }
                    iVar.I(qVar);
                    iVar.w();
                }
                return Unit.INSTANCE;
            case 19:
                GroupDetailChallengeListFragment groupDetailChallengeListFragment = (GroupDetailChallengeListFragment) this.f135226b;
                com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                GroupDetailChallengeListFragment.a aVar8 = GroupDetailChallengeListFragment.f36276m;
                g3Var.getClass();
                int i24 = GroupDetailChallengeListFragment.b.f36282a[g3Var.f35300a.ordinal()];
                if (i24 == 1) {
                    groupDetailChallengeListFragment.G6();
                } else if (i24 == 2) {
                    groupDetailChallengeListFragment.w6();
                } else {
                    if (i24 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    groupDetailChallengeListFragment.w6();
                    g22.e.a(groupDetailChallengeListFragment, null);
                }
                return Unit.INSTANCE;
            case 20:
                com.garmin.android.apps.connectmobile.group.details.challenges.e eVar3 = (com.garmin.android.apps.connectmobile.group.details.challenges.e) this.f135226b;
                com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) obj;
                int i25 = com.garmin.android.apps.connectmobile.group.details.challenges.e.a.f36346a[g3Var2.f35300a.ordinal()];
                if (i25 == 1) {
                    eVar3.G6();
                } else if (i25 == 2) {
                    eVar3.w6();
                    GroupDetailsDTO groupDetailsDTO = (GroupDetailsDTO) g3Var2.f35301b;
                    if (groupDetailsDTO != null) {
                        com.garmin.android.apps.connectmobile.group.details.challenges.d dVar = eVar3.f36344k;
                        if (dVar == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        dVar.f36325e = groupDetailsDTO;
                        dVar.notifyItemChanged(0);
                    }
                } else {
                    if (i25 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    eVar3.w6();
                }
                return Unit.INSTANCE;
            case 21:
                po.u uVar = (po.u) this.f135226b;
                fw.m mVar6 = (fw.m) obj;
                int i26 = po.u.G1;
                fw.p pVar4 = mVar6.f73769b;
                if (pVar4 == fw.p.SUCCESS) {
                    ps.y0 y0Var = (ps.y0) mVar6.f73770c;
                    if (y0Var != null) {
                        if (uVar.U0 == null) {
                            uVar.U0 = new ps.p(0L, null, null, null, null, 31, null);
                        }
                        ps.p pVar5 = uVar.U0;
                        pVar5.getClass();
                        long jB = y0Var.getActivityId();
                        List<ps.o0> listD = y0Var.d();
                        List<ps.x0> listF = y0Var.f();
                        uVar.U0 = ps.p.b(pVar5, jB, listD, listF != null ? new ArrayList(listF) : null, null, 24);
                        uVar.g7();
                    } else {
                        Toast.makeText(uVar.getActivity(), R.string.txt_error_occurred, 0).show();
                    }
                } else if (pVar4 == fw.p.ERROR) {
                    Toast.makeText(uVar.getActivity(), R.string.txt_error_occurred, 0).show();
                }
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.activities.map.a aVar9 = (com.garmin.android.apps.connectmobile.activities.map.a) this.f135226b;
                Location location = (Location) obj;
                if (location == null) {
                    com.garmin.android.apps.connectmobile.activities.map.a.C0451a c0451a = com.garmin.android.apps.connectmobile.activities.map.a.f29229m;
                } else if (aVar9.f29232j) {
                    aVar9.v6(com.garmin.android.library.mapsdkadapter.n.c(location), 15);
                    aVar9.f29232j = false;
                }
                return Unit.INSTANCE;
            case 23:
                LineChart lineChart = (LineChart) this.f135226b;
                Highlight highlight = (Highlight) obj;
                int i27 = pr0.f.f139616j;
                return Boolean.valueOf(highlight != null && ((LineData) lineChart.getData()).getEntryForHighlight(highlight).getData() == null);
            case 24:
                pv2.d dVar2 = (pv2.d) this.f135226b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i28 = pv2.d.f141647y;
                dVar2.setHasError(zBooleanValue);
                return Unit.INSTANCE;
            case 25:
                Drawable drawable = (Drawable) this.f135226b;
                q4.f fVar = (q4.f) obj;
                q2.u uVar2 = q2.u.f142195a;
                o4.y yVarA = fVar.getF142543b().a();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (fVar.b() >> 32)), (int) Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                drawable.draw(o4.d.a(yVarA));
                return Unit.INSTANCE;
            case 26:
                KomootConsentActivity komootConsentActivity = (KomootConsentActivity) this.f135226b;
                com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                KomootConsentActivity.a aVar10 = KomootConsentActivity.f39717c;
                int i29 = KomootConsentActivity.b.f39720a[g3Var3.f35300a.ordinal()];
                if (i29 == 1) {
                    List list3 = (List) g3Var3.f35301b;
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(((hk1.a0) it3.next()).o(), "komoot")) {
                                komootConsentActivity.f39719b = true;
                            }
                        }
                    }
                    komootConsentActivity.initComposeScreen(new z3.e(-1481228768, true, new ov1.q(komootConsentActivity, 16)));
                } else if (i29 != 2) {
                    if (i29 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    q31.a.f142402a.getClass();
                    komootConsentActivity.initComposeScreen(q31.a.f142404c);
                }
                return Unit.INSTANCE;
            case 27:
                q81.f fVar2 = (q81.f) this.f135226b;
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                e32.l<o81.d> lVar2 = fVar2.f143346a;
                DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                lVar2.p4(e32.o.f62806i, dateTimeAtStartOfDay);
                return Unit.INSTANCE;
            case 28:
                q81.n nVar = (q81.n) this.f135226b;
                LocalDate localDate2 = (LocalDate) obj;
                localDate2.getClass();
                e32.l<o81.d> lVar3 = nVar.f143346a;
                DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                lVar3.p4(e32.o.f62806i, dateTimeAtStartOfDay2);
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f fVar3 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f) this.f135226b;
                fw.m mVar7 = (fw.m) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar11 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                int i30 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.b.f40995a[mVar7.f73769b.ordinal()];
                if (i30 == 1) {
                    g22.e.l(fVar3);
                    TextView textView = fVar3.f40990e;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("mWeightLoggedTextView");
                        throw null;
                    }
                    textView.setVisibility(8);
                } else if (i30 == 2) {
                    g22.e.f(fVar3);
                    List list4 = (List) mVar7.f73770c;
                    if (list4 != null) {
                        ArrayList arrayListZ = p13.h0.Z(list4);
                        if (arrayListZ.isEmpty()) {
                            db1.u uVarC2 = fVar3.u6().C.getWeightGoalUserInputs();
                            if (uVarC2 != null) {
                                uVarC2.k(null);
                            }
                            qb1.f.N4(fVar3.u6(), null, null, 3);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = fVar3.f40988c;
                            if (gCMComplexTwoLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("mWeightBeforePregnancyButton");
                                throw null;
                            }
                            gCMComplexTwoLineButton2.setButtonRightLabel(fVar3.requireContext().getString(R.string.no_value));
                        } else {
                            db1.n nVar2 = (db1.n) arrayListZ.get(0);
                            Double d14 = nVar2.getWeight();
                            if (d14 != null) {
                                double dDoubleValue3 = d14.doubleValue();
                                db1.u uVarC3 = fVar3.u6().C.getWeightGoalUserInputs();
                                if (uVarC3 != null) {
                                    uVarC3.k(Double.valueOf(dDoubleValue3));
                                }
                                qb1.f.N4(fVar3.u6(), Double.valueOf(dDoubleValue3), null, 2);
                                DateTime dateTimeB = nVar2.getDate();
                                if (dateTimeB != null) {
                                    TextView textView2 = fVar3.f40990e;
                                    if (textView2 == null) {
                                        p005kotlin.jvm.internal.s.m("mWeightLoggedTextView");
                                        throw null;
                                    }
                                    textView2.setVisibility(0);
                                    TextView textView3 = fVar3.f40990e;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("mWeightLoggedTextView");
                                        throw null;
                                    }
                                    textView3.setText(fVar3.requireContext().getString(R.string.pregnancy_logged_on_date, DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(dateTimeB.getMillis()))));
                                    unit = Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                if (unit == null) {
                                    uVarC = fVar3.u6().C.getWeightGoalUserInputs();
                                    if (uVarC != null) {
                                        uVarC.k(null);
                                    }
                                    qb1.f.N4(fVar3.u6(), null, null, 3);
                                    gCMComplexTwoLineButton = fVar3.f40988c;
                                    if (gCMComplexTwoLineButton != null) {
                                        p005kotlin.jvm.internal.s.m("mWeightBeforePregnancyButton");
                                        throw null;
                                    }
                                    gCMComplexTwoLineButton.setButtonRightLabel(fVar3.requireContext().getString(R.string.no_value));
                                }
                            } else {
                                uVarC = fVar3.u6().C.getWeightGoalUserInputs();
                                if (uVarC != null) {
                                    uVarC.k(null);
                                }
                                qb1.f.N4(fVar3.u6(), null, null, 3);
                                gCMComplexTwoLineButton = fVar3.f40988c;
                                if (gCMComplexTwoLineButton != null) {
                                    p005kotlin.jvm.internal.s.m("mWeightBeforePregnancyButton");
                                    throw null;
                                }
                                gCMComplexTwoLineButton.setButtonRightLabel(fVar3.requireContext().getString(R.string.no_value));
                            }
                        }
                    } else {
                        db1.u uVarC4 = fVar3.u6().C.getWeightGoalUserInputs();
                        if (uVarC4 != null) {
                            uVarC4.k(null);
                        }
                        qb1.f.N4(fVar3.u6(), null, null, 3);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = fVar3.f40988c;
                        if (gCMComplexTwoLineButton3 == null) {
                            p005kotlin.jvm.internal.s.m("mWeightBeforePregnancyButton");
                            throw null;
                        }
                        gCMComplexTwoLineButton3.setButtonRightLabel(fVar3.requireContext().getString(R.string.no_value));
                    }
                    fVar3.y6();
                } else {
                    if (i30 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    TextView textView4 = fVar3.f40990e;
                    if (textView4 == null) {
                        p005kotlin.jvm.internal.s.m("mWeightLoggedTextView");
                        throw null;
                    }
                    textView4.setVisibility(8);
                    g22.e.f(fVar3);
                    fVar3.y6();
                }
                return Unit.INSTANCE;
        }
    }
}
