package ty1;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import i3.e5;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167243b;

    public /* synthetic */ u(com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar, int i14) {
        this.f167242a = i14;
        this.f167243b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:182:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:185:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:187:0x0402  */
    /* JADX WARN: Code duplicated, block: B:191:0x040f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0413  */
    /* JADX WARN: Code duplicated, block: B:196:0x042c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0432  */
    /* JADX WARN: Code duplicated, block: B:200:0x0436  */
    /* JADX WARN: Code duplicated, block: B:202:0x043b  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:244:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:247:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:266:0x0507  */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Throwable, o53.d0, t13.d, t13.g] */
    /* JADX WARN: Type inference failed for: r0v99 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        Boolean boolValueOf2;
        fg0.d customGoal;
        fg0.d customGoal2;
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        String str;
        ?? r14;
        fg0.k kVar;
        String str2;
        String str3;
        String string;
        fg0.d customGoal3;
        Double value;
        fg0.d customGoal4;
        Double value2;
        fg0.d customGoal5;
        fg0.d customGoal6;
        String string2;
        fg0.d customGoal7;
        Double value3;
        Double value4;
        String shareableEventUuid;
        TextView textView;
        Integer num;
        int iIntValue;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2;
        GCMComplexTwoLineButton gCMComplexTwoLineButton3;
        int i14 = this.f167242a;
        int i15 = 0;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167243b;
        switch (i14) {
            case 0:
                ps.r rVar = (ps.r) obj;
                if (rVar != null) {
                    fg0.k kVar2 = eVar.f45937i;
                    if (kVar2 == null) {
                        p005kotlin.jvm.internal.s.m("eventDTO");
                        throw null;
                    }
                    fg0.j eventCustomization = kVar2.getEventCustomization();
                    gg0.h unitType = (eventCustomization == null || (customGoal2 = eventCustomization.getCustomGoal()) == null) ? null : customGoal2.getUnitType();
                    int i16 = unitType == null ? -1 : com.garmin.android.apps.connectmobile.traininginitiative.ui.e.b.f45943a[unitType.ordinal()];
                    if (i16 == 1) {
                        ps.q1 summaryDTO = rVar.getSummaryDTO();
                        Double distance = summaryDTO != null ? summaryDTO.getDistance() : null;
                        fg0.k kVar3 = eVar.f45937i;
                        if (kVar3 == null) {
                            p005kotlin.jvm.internal.s.m("eventDTO");
                            throw null;
                        }
                        fg0.j eventCustomization2 = kVar3.getEventCustomization();
                        fg0.d customGoal8 = eventCustomization2 != null ? eventCustomization2.getCustomGoal() : null;
                        if (distance == null || customGoal8 == null) {
                            boolValueOf = null;
                        } else {
                            double dDoubleValue = distance.doubleValue();
                            eVar.w6();
                            boolValueOf = Boolean.valueOf(dDoubleValue >= mz1.e0.b5(customGoal8));
                        }
                        if (boolValueOf != null) {
                            zBooleanValue = boolValueOf.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (i16 == 2) {
                        ps.q1 summaryDTO2 = rVar.getSummaryDTO();
                        Double duration = summaryDTO2 != null ? summaryDTO2.getDuration() : null;
                        fg0.k kVar4 = eVar.f45937i;
                        if (kVar4 == null) {
                            p005kotlin.jvm.internal.s.m("eventDTO");
                            throw null;
                        }
                        fg0.j eventCustomization3 = kVar4.getEventCustomization();
                        Double value5 = (eventCustomization3 == null || (customGoal = eventCustomization3.getCustomGoal()) == null) ? null : customGoal.getValue();
                        if (duration == null || value5 == null) {
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(duration.doubleValue() <= value5.doubleValue());
                        }
                        if (boolValueOf2 != null) {
                            zBooleanValue = boolValueOf2.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    GCMComplexTwoLineButton gCMComplexTwoLineButton4 = eVar.f45933e;
                    if (zBooleanValue) {
                        if (gCMComplexTwoLineButton4 == null) {
                            p005kotlin.jvm.internal.s.m("mEditEventGoal");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setRightIcon(eVar.v6());
                    } else {
                        if (gCMComplexTwoLineButton4 == null) {
                            p005kotlin.jvm.internal.s.m("mEditEventGoal");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setRightIcon(null);
                    }
                } else {
                    GCMComplexTwoLineButton gCMComplexTwoLineButton5 = eVar.f45933e;
                    if (gCMComplexTwoLineButton5 == null) {
                        p005kotlin.jvm.internal.s.m("mEditEventGoal");
                        throw null;
                    }
                    gCMComplexTwoLineButton5.setRightIcon(null);
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                if (eVar.w6().x5()) {
                    gCMComplexTwoLineButton = eVar.f45935g;
                    if (gCMComplexTwoLineButton != null) {
                        p005kotlin.jvm.internal.s.m("mTrainingPriority");
                        throw null;
                    }
                    gCMComplexTwoLineButton.setVisibility(8);
                } else {
                    fg0.k kVar5 = eVar.f45937i;
                    if (kVar5 == null) {
                        p005kotlin.jvm.internal.s.m("eventDTO");
                        throw null;
                    }
                    gg0.f eventType = kVar5.getEventType();
                    if (eventType == null || !(eventType.e() || eventType.f() || eventType.g())) {
                        gCMComplexTwoLineButton = eVar.f45935g;
                        if (gCMComplexTwoLineButton != null) {
                            p005kotlin.jvm.internal.s.m("mTrainingPriority");
                            throw null;
                        }
                        gCMComplexTwoLineButton.setVisibility(8);
                    } else {
                        eVar.y6();
                    }
                }
                return Unit.INSTANCE;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                if (zBooleanValue2) {
                    eVar.z6();
                }
                return Unit.INSTANCE;
            default:
                fg0.k kVar6 = (fg0.k) obj;
                if (kVar6 != null) {
                    eVar.f45937i = kVar6;
                    boolean zK0 = kVar6.k0();
                    GCMComplexTwoLineButton gCMComplexTwoLineButton6 = eVar.f45934f;
                    if (zK0) {
                        if (gCMComplexTwoLineButton6 == null) {
                            p005kotlin.jvm.internal.s.m("mRaceTimePrediction");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setVisibility(0);
                        l3.a aVar3 = l3.f23124b;
                        fg0.j eventCustomization4 = kVar6.getEventCustomization();
                        Long predictedRaceTimeDuration = eventCustomization4 != null ? eventCustomization4.getPredictedRaceTimeDuration() : null;
                        aVar3.getClass();
                        String strG1 = l3.a.g1(predictedRaceTimeDuration);
                        fg0.j eventCustomization5 = kVar6.getEventCustomization();
                        String strG2 = l3.a.g1(eventCustomization5 != null ? eventCustomization5.getProjectedRaceTimeDuration() : null);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = eVar.f45934f;
                        if (gCMComplexTwoLineButton7 == null) {
                            p005kotlin.jvm.internal.s.m("mRaceTimePrediction");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setButtonBottomLeftLabel(eVar.getString(R.string.lbl_current, strG1));
                        if (strG2 != null) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton8 = eVar.f45934f;
                            if (gCMComplexTwoLineButton8 == null) {
                                p005kotlin.jvm.internal.s.m("mRaceTimePrediction");
                                throw null;
                            }
                            gCMComplexTwoLineButton8.setButtonBottomLeftLabel(j20.x.d(gCMComplexTwoLineButton8.getButtonBottomLeftLabel(), StringUtils.SPACE, eVar.getString(R.string.center_dot), StringUtils.SPACE, eVar.getString(R.string.lbl_projection, strG2)));
                        }
                    } else {
                        if (gCMComplexTwoLineButton6 == null) {
                            p005kotlin.jvm.internal.s.m("mRaceTimePrediction");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setVisibility(8);
                    }
                    fg0.j eventCustomization6 = kVar6.getEventCustomization();
                    if ((eventCustomization6 != null ? eventCustomization6.h() : null) != null) {
                        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = eVar.f45933e;
                        if (gCMComplexTwoLineButton9 == null) {
                            p005kotlin.jvm.internal.s.m("mEditEventGoal");
                            throw null;
                        }
                        gCMComplexTwoLineButton9.setVisibility(8);
                        ComposeView composeView = eVar.f45936h;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("legGoalsView");
                            throw null;
                        }
                        composeView.setVisibility(0);
                        ComposeView composeView2 = eVar.f45936h;
                        if (composeView2 == null) {
                            p005kotlin.jvm.internal.s.m("legGoalsView");
                            throw null;
                        }
                        composeView2.setContent(new z3.e(-398899170, true, new v(eVar, kVar6, i15)));
                    } else {
                        fg0.j eventCustomization7 = kVar6.getEventCustomization();
                        if ((eventCustomization7 != null ? eventCustomization7.getCustomGoal() : null) != null) {
                            ComposeView composeView3 = eVar.f45936h;
                            if (composeView3 == null) {
                                p005kotlin.jvm.internal.s.m("legGoalsView");
                                throw null;
                            }
                            composeView3.setVisibility(8);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = eVar.f45933e;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("mEditEventGoal");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.setVisibility(0);
                            fg0.d completionTarget = kVar6.getCompletionTarget();
                            double dDoubleValue2 = 0.0d;
                            if ((completionTarget != null ? completionTarget.getUnitType() : null) == gg0.h.TIME) {
                                fg0.j eventCustomization8 = kVar6.getEventCustomization();
                                if (eventCustomization8 != null && (customGoal5 = eventCustomization8.getCustomGoal()) != null) {
                                    eVar.w6();
                                    double dB5 = mz1.e0.b5(customGoal5);
                                    fg0.d completionTarget2 = kVar6.getCompletionTarget();
                                    if (completionTarget2 != null && (value4 = completionTarget2.getValue()) != null) {
                                        dDoubleValue2 = value4.doubleValue();
                                    }
                                    kVar = kVar6;
                                    double d14 = dDoubleValue2;
                                    gg0.f eventType2 = kVar.getEventType();
                                    str2 = "mTrainingPriority";
                                    if (eventType2 != null) {
                                        str3 = "mEditEventGoal";
                                        if (eventType2.e()) {
                                            fg0.j eventCustomization9 = kVar.getEventCustomization();
                                            if (eventCustomization9 != null && (customGoal7 = eventCustomization9.getCustomGoal()) != null && (value3 = customGoal7.getValue()) != null) {
                                                String strValueOf = String.valueOf(value3.doubleValue());
                                                og0.a aVar4 = og0.a.f131967a;
                                                Context contextRequireContext = eVar.requireContext();
                                                contextRequireContext.getClass();
                                                aVar4.getClass();
                                                String string3 = eVar.getString(R.string.string_space_string_pattern, strValueOf, og0.a.q(contextRequireContext));
                                                string3.getClass();
                                                double d15 = dB5 / d14;
                                                q3 q3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                                                l3.a aVar5 = l3.f23124b;
                                                Context contextRequireContext2 = eVar.requireContext();
                                                aVar5.getClass();
                                                String string4 = eVar.getString(R.string.string_space_string_pattern, l3.a.M0(contextRequireContext2, d15, q3Var, l3.f23130h, true), eVar.getString(R.string.lbl_speed));
                                                string4.getClass();
                                                GCMComplexTwoLineButton gCMComplexTwoLineButton11 = eVar.f45933e;
                                                if (gCMComplexTwoLineButton11 == null) {
                                                    p005kotlin.jvm.internal.s.m(str3);
                                                    throw null;
                                                }
                                                gCMComplexTwoLineButton11.setButtonBottomLeftLabel(eVar.getString(R.string.string_space_string_bracket_pattern, string3, string4));
                                            }
                                        }
                                    } else {
                                        str3 = "mEditEventGoal";
                                    }
                                    og0.a.f131967a.getClass();
                                    String strB = og0.a.b(d14, dB5);
                                    fg0.j eventCustomization10 = kVar.getEventCustomization();
                                    if (eventCustomization10 != null && (customGoal6 = eventCustomization10.getCustomGoal()) != null) {
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton12 = eVar.f45933e;
                                        if (gCMComplexTwoLineButton12 == null) {
                                            p005kotlin.jvm.internal.s.m(str3);
                                            throw null;
                                        }
                                        String strF = customGoal6.f();
                                        Context contextRequireContext3 = eVar.requireContext();
                                        contextRequireContext3.getClass();
                                        String strQ = og0.a.q(contextRequireContext3);
                                        String strV = d53.u.v(strB, ".", ":", false);
                                        eVar.w6();
                                        Context contextRequireContext4 = eVar.requireContext();
                                        contextRequireContext4.getClass();
                                        bg0.a.f17827a.getClass();
                                        if (bg0.a.C0255a.e()) {
                                            string2 = contextRequireContext4.getString(R.string.lbl_pace_unit_km);
                                            string2.getClass();
                                        } else {
                                            string2 = contextRequireContext4.getString(R.string.lbl_pace_unit_mi);
                                            string2.getClass();
                                        }
                                        String string5 = eVar.getString(R.string.lbl_pace);
                                        StringBuilder sbL = e5.l(strF, StringUtils.SPACE, strQ, " (", strV);
                                        sn.a.t(sbL, StringUtils.SPACE, string2, StringUtils.SPACE, string5);
                                        sbL.append(")");
                                        gCMComplexTwoLineButton12.setButtonBottomLeftLabel(sbL.toString());
                                    }
                                }
                                str = "eventDTO";
                            } else {
                                kVar = kVar6;
                                str2 = "mTrainingPriority";
                                str3 = "mEditEventGoal";
                                fg0.d completionTarget3 = kVar.getCompletionTarget();
                                if (completionTarget3 != null) {
                                    l3.a aVar6 = l3.f23124b;
                                    fg0.j eventCustomization11 = kVar.getEventCustomization();
                                    Long lValueOf = (eventCustomization11 == null || (customGoal4 = eventCustomization11.getCustomGoal()) == null || (value2 = customGoal4.getValue()) == null) ? null : Long.valueOf((long) value2.doubleValue());
                                    aVar6.getClass();
                                    String strG3 = l3.a.g1(lValueOf);
                                    eVar.w6();
                                    double dB6 = mz1.e0.b5(completionTarget3);
                                    fg0.j eventCustomization12 = kVar.getEventCustomization();
                                    if (eventCustomization12 != null && (customGoal3 = eventCustomization12.getCustomGoal()) != null && (value = customGoal3.getValue()) != null) {
                                        dDoubleValue2 = value.doubleValue();
                                    }
                                    double d16 = dDoubleValue2;
                                    gg0.f eventType3 = kVar.getEventType();
                                    if (eventType3 != null) {
                                        str = "eventDTO";
                                        if (eventType3.e()) {
                                            String string6 = eVar.getString(R.string.string_space_string_pattern, l3.a.M0(eVar.requireContext(), dB6 / d16, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, l3.f23130h, true), eVar.getString(R.string.lbl_speed));
                                            string6.getClass();
                                            GCMComplexTwoLineButton gCMComplexTwoLineButton13 = eVar.f45933e;
                                            if (gCMComplexTwoLineButton13 == null) {
                                                p005kotlin.jvm.internal.s.m(str3);
                                                throw null;
                                            }
                                            gCMComplexTwoLineButton13.setButtonBottomLeftLabel(eVar.getString(R.string.string_space_string_bracket_pattern, strG3, string6));
                                        }
                                    } else {
                                        str = "eventDTO";
                                    }
                                    if (kVar.getEventType() == gg0.f.f77136l) {
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton14 = eVar.f45933e;
                                        if (gCMComplexTwoLineButton14 == null) {
                                            p005kotlin.jvm.internal.s.m(str3);
                                            throw null;
                                        }
                                        gCMComplexTwoLineButton14.setButtonBottomLeftLabel(strG3);
                                    } else {
                                        og0.a.f131967a.getClass();
                                        String strB2 = og0.a.b(d16, dB6);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton15 = eVar.f45933e;
                                        if (gCMComplexTwoLineButton15 == null) {
                                            p005kotlin.jvm.internal.s.m(str3);
                                            throw null;
                                        }
                                        String strV2 = d53.u.v(strB2, ".", ":", false);
                                        eVar.w6();
                                        Context contextRequireContext5 = eVar.requireContext();
                                        contextRequireContext5.getClass();
                                        bg0.a.f17827a.getClass();
                                        if (bg0.a.C0255a.e()) {
                                            string = contextRequireContext5.getString(R.string.lbl_pace_unit_km);
                                            string.getClass();
                                        } else {
                                            string = contextRequireContext5.getString(R.string.lbl_pace_unit_mi);
                                            string.getClass();
                                        }
                                        String string7 = eVar.getString(R.string.lbl_pace);
                                        string7.getClass();
                                        String lowerCase = string7.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(strG3);
                                        sb3.append(" (");
                                        sb3.append(strV2);
                                        sb3.append(StringUtils.SPACE);
                                        gCMComplexTwoLineButton15.setButtonBottomLeftLabel(e5.h(sb3, string, StringUtils.SPACE, lowerCase, ")"));
                                    }
                                } else {
                                    str = "eventDTO";
                                }
                            }
                        } else {
                            kVar = kVar6;
                            str2 = "mTrainingPriority";
                            str3 = "mEditEventGoal";
                            str = "eventDTO";
                            TextView textView2 = eVar.f45932d;
                            if (textView2 == null) {
                                p005kotlin.jvm.internal.s.m("mTrainingTitle");
                                throw null;
                            }
                            textView2.setVisibility(0);
                            ComposeView composeView4 = eVar.f45936h;
                            if (composeView4 == null) {
                                p005kotlin.jvm.internal.s.m("legGoalsView");
                                throw null;
                            }
                            composeView4.setVisibility(8);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton16 = eVar.f45933e;
                            if (gCMComplexTwoLineButton16 == null) {
                                p005kotlin.jvm.internal.s.m(str3);
                                throw null;
                            }
                            gCMComplexTwoLineButton16.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton17 = eVar.f45933e;
                            if (gCMComplexTwoLineButton17 == null) {
                                p005kotlin.jvm.internal.s.m(str3);
                                throw null;
                            }
                            gCMComplexTwoLineButton17.setButtonBottomLeftLabel(eVar.getString(R.string.finish_goal));
                        }
                        if (eVar.w6().x5()) {
                            gCMComplexTwoLineButton2 = eVar.f45933e;
                            if (gCMComplexTwoLineButton2 != null) {
                                p005kotlin.jvm.internal.s.m(str3);
                                throw null;
                            }
                            gCMComplexTwoLineButton2.setClickable(false);
                            gCMComplexTwoLineButton2.setOnClickListener(null);
                            gCMComplexTwoLineButton3 = eVar.f45935g;
                            if (gCMComplexTwoLineButton3 != null) {
                                p005kotlin.jvm.internal.s.m(str2);
                                throw null;
                            }
                            gCMComplexTwoLineButton3.setVisibility(8);
                        } else {
                            shareableEventUuid = kVar.getShareableEventUuid();
                            if (shareableEventUuid != null || shareableEventUuid.length() == 0) {
                                textView = eVar.f45932d;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("mTrainingTitle");
                                    throw null;
                                }
                                textView.setVisibility(8);
                            }
                            num = (Integer) ((androidx.lifecycle.s0) eVar.w6().f121691l1.getValue()).d();
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue > 1) {
                                eVar.y6();
                            }
                        }
                        r14 = 0;
                    }
                    kVar = kVar6;
                    str2 = "mTrainingPriority";
                    str3 = "mEditEventGoal";
                    str = "eventDTO";
                    if (eVar.w6().x5()) {
                        gCMComplexTwoLineButton2 = eVar.f45933e;
                        if (gCMComplexTwoLineButton2 != null) {
                            p005kotlin.jvm.internal.s.m(str3);
                            throw null;
                        }
                        gCMComplexTwoLineButton2.setClickable(false);
                        gCMComplexTwoLineButton2.setOnClickListener(null);
                        gCMComplexTwoLineButton3 = eVar.f45935g;
                        if (gCMComplexTwoLineButton3 != null) {
                            p005kotlin.jvm.internal.s.m(str2);
                            throw null;
                        }
                        gCMComplexTwoLineButton3.setVisibility(8);
                    } else {
                        shareableEventUuid = kVar.getShareableEventUuid();
                        if (shareableEventUuid != null) {
                            textView = eVar.f45932d;
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("mTrainingTitle");
                                throw null;
                            }
                            textView.setVisibility(8);
                        } else {
                            textView = eVar.f45932d;
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("mTrainingTitle");
                                throw null;
                            }
                            textView.setVisibility(8);
                        }
                        num = (Integer) ((androidx.lifecycle.s0) eVar.w6().f121691l1.getValue()).d();
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue > 1) {
                            eVar.y6();
                        }
                    }
                    r14 = 0;
                } else {
                    str = "eventDTO";
                    r14 = 0;
                }
                fg0.k kVar7 = eVar.f45937i;
                if (kVar7 != null) {
                    ge1.b.T(o53.f0.w(eVar), r14, r14, new a0(eVar, kVar7, r14), 3);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m(str);
                throw r14;
        }
    }
}
