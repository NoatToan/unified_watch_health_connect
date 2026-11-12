package hx0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleCalendarActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.view.ExpandableTextView;
import g2.m1;
import java.text.SimpleDateFormat;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Unit;
import retrofit2.HttpException;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d f86097b;

    public /* synthetic */ l(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar, int i14) {
        this.f86096a = i14;
        this.f86097b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:134:0x0208  */
    /* JADX WARN: Code duplicated, block: B:135:0x020a  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:203:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:208:0x02db  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:212:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:220:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:221:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:223:0x0304  */
    /* JADX WARN: Code duplicated, block: B:225:0x0308  */
    /* JADX WARN: Code duplicated, block: B:227:0x030c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0313  */
    /* JADX WARN: Code duplicated, block: B:231:0x031a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0321  */
    /* JADX WARN: Code duplicated, block: B:235:0x0328  */
    /* JADX WARN: Code duplicated, block: B:237:0x032f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0336  */
    /* JADX WARN: Code duplicated, block: B:241:0x033d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0344  */
    /* JADX WARN: Code duplicated, block: B:244:0x0349  */
    /* JADX WARN: Code duplicated, block: B:246:0x034d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0351  */
    /* JADX WARN: Code duplicated, block: B:250:0x0355  */
    /* JADX WARN: Code duplicated, block: B:252:0x0359  */
    /* JADX WARN: Code duplicated, block: B:254:0x035d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0361  */
    /* JADX WARN: Code duplicated, block: B:258:0x0365  */
    /* JADX WARN: Code duplicated, block: B:260:0x0369  */
    /* JADX WARN: Code duplicated, block: B:262:0x036d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0371  */
    /* JADX WARN: Code duplicated, block: B:266:0x0375  */
    /* JADX WARN: Code duplicated, block: B:268:0x0379  */
    /* JADX WARN: Code duplicated, block: B:270:0x037d  */
    /* JADX WARN: Code duplicated, block: B:272:0x038c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0394  */
    /* JADX WARN: Code duplicated, block: B:331:0x0513  */
    /* JADX WARN: Code duplicated, block: B:333:0x0517  */
    /* JADX WARN: Code duplicated, block: B:335:0x0521  */
    /* JADX WARN: Code duplicated, block: B:336:0x0526  */
    /* JADX WARN: Code duplicated, block: B:340:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x053f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0548  */
    /* JADX WARN: Code duplicated, block: B:344:0x054d  */
    /* JADX WARN: Code duplicated, block: B:346:0x0551  */
    /* JADX WARN: Code duplicated, block: B:348:0x0555 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:349:0x0557  */
    /* JADX WARN: Code duplicated, block: B:351:0x055f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0566  */
    /* JADX WARN: Code duplicated, block: B:356:0x056f  */
    /* JADX WARN: Code duplicated, block: B:359:0x0578  */
    /* JADX WARN: Code duplicated, block: B:360:0x057d  */
    /* JADX WARN: Code duplicated, block: B:362:0x0580  */
    /* JADX WARN: Code duplicated, block: B:372:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:374:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:376:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:377:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:379:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:396:0x0691  */
    /* JADX WARN: Code duplicated, block: B:398:0x0695  */
    /* JADX WARN: Code duplicated, block: B:400:0x0699  */
    /* JADX WARN: Code duplicated, block: B:402:0x069d  */
    /* JADX WARN: Code duplicated, block: B:404:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x017e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        HttpException httpException;
        boolean z14;
        ww0.l cycleSummary;
        c22.h0 h0VarZ;
        c22.h0 h0VarH;
        Button button;
        String string;
        ww0.a aVarL;
        ww0.a aVar;
        ComposeView composeView;
        Button button2;
        View view2;
        View view3;
        Button button3;
        Boolean pregnancyCycle;
        boolean zBooleanValue;
        c22.h0 h0VarZ2;
        String str;
        String string2;
        boolean z15;
        boolean z16;
        View view4;
        View view5;
        Button button4;
        ComposeView composeView2;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        View view12;
        ExpandableTextView expandableTextView;
        TextView textView;
        ww0.l cycleSummary2;
        View view13;
        ww0.b log;
        ComposeView composeView3;
        boolean zG;
        View view14;
        ComposeView composeView4;
        View view15;
        Button button5;
        TextView textView2;
        ExpandableTextView expandableTextView2;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        View view24;
        View view25;
        ww0.l cycleSummary3;
        ww0.l cycleSummary4;
        int i14 = this.f86096a;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar = this.f86097b;
        int i15 = 1;
        switch (i14) {
            case 0:
                cx0.a aVar2 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar2 = this.f86097b;
                if (aVar2 == null) {
                    dVar2.G6();
                } else {
                    Throwable th3 = aVar2.f56600b;
                    dVar2.w6();
                    if (dVar2.getContext() == null) {
                        httpException = null;
                        z14 = false;
                    } else {
                        ww0.c cVar = (ww0.c) aVar2.f56599a;
                        if (dVar2.f38909k.T1()) {
                            boolean z17 = (cVar == null || (cycleSummary4 = cVar.getCycleSummary()) == null || !cycleSummary4.getIsSkinTempMct()) ? false : true;
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            boolean zP = k1.f37122a.p();
                            BubbleLayout bubbleLayout = dVar2.Y;
                            if (bubbleLayout == null) {
                                p005kotlin.jvm.internal.s.m("mctWithSkinTempTooltip");
                                throw null;
                            }
                            v22.e.r(bubbleLayout, zP && z17);
                            BubbleLayout bubbleLayout2 = dVar2.Y;
                            if (bubbleLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("mctWithSkinTempTooltip");
                                throw null;
                            }
                            bubbleLayout2.setOnClickListener(new j(dVar2, i15));
                        }
                        if (dVar2.S6().equals(new LocalDate())) {
                            i52.a.f91796a.getClass();
                            if (i52.a.l() == ww0.a.PREGNANT && ((o0) dVar2.f38908j.getValue()).A4(dVar2.S6()) == null) {
                                dVar2.K6();
                            } else {
                                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                                boolean zG2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(aVar4);
                                i52.a.f91796a.getClass();
                                if (i52.a.l() == ww0.a.INACTIVE) {
                                    if (cVar != null || (cycleSummary3 = cVar.getCycleSummary()) == null) {
                                        zG = false;
                                    } else {
                                        zG = p005kotlin.jvm.internal.s.g(cycleSummary3.getPregnancyCycle(), Boolean.TRUE);
                                    }
                                    if (zG) {
                                        dVar2.M6();
                                    } else {
                                        dVar2.Y6(null, false);
                                        view14 = dVar2.I;
                                        if (view14 != null) {
                                            p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                            throw null;
                                        }
                                        view14.setVisibility(8);
                                        composeView4 = dVar2.F;
                                        if (composeView4 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                            throw null;
                                        }
                                        composeView4.setVisibility(8);
                                        view15 = dVar2.P;
                                        if (view15 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                            throw null;
                                        }
                                        view15.setVisibility(8);
                                        button5 = dVar2.A;
                                        if (button5 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                            throw null;
                                        }
                                        button5.setVisibility(8);
                                        textView2 = dVar2.X;
                                        if (textView2 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                            throw null;
                                        }
                                        textView2.setVisibility(8);
                                        expandableTextView2 = dVar2.Z;
                                        if (expandableTextView2 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                            throw null;
                                        }
                                        expandableTextView2.setVisibility(8);
                                        view16 = dVar2.L0;
                                        if (view16 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataBarrier");
                                            throw null;
                                        }
                                        view16.setVisibility(8);
                                        view17 = dVar2.M0;
                                        if (view17 != null) {
                                            p005kotlin.jvm.internal.s.m("mctPregnancyOneDayView");
                                            throw null;
                                        }
                                        view17.setVisibility(8);
                                        view18 = dVar2.I;
                                        if (view18 != null) {
                                            p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                            throw null;
                                        }
                                        view18.setVisibility(0);
                                        view19 = dVar2.T;
                                        if (view19 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                            throw null;
                                        }
                                        view19.setVisibility(8);
                                        view20 = dVar2.f38910k0;
                                        if (view20 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                            throw null;
                                        }
                                        view20.setVisibility(8);
                                        view21 = dVar2.H0;
                                        if (view21 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                            throw null;
                                        }
                                        view21.setVisibility(8);
                                        view22 = dVar2.f38919v;
                                        if (view22 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                            throw null;
                                        }
                                        view22.setVisibility(8);
                                        view23 = dVar2.J0;
                                        if (view23 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                            throw null;
                                        }
                                        view23.setVisibility(8);
                                        view24 = dVar2.I0;
                                        if (view24 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                            throw null;
                                        }
                                        view24.setVisibility(8);
                                        view25 = dVar2.K0;
                                        if (view25 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                            throw null;
                                        }
                                        view25.setVisibility(8);
                                    }
                                } else {
                                    if (cVar != null) {
                                        cycleSummary = cVar.getCycleSummary();
                                    } else {
                                        cycleSummary = null;
                                    }
                                    if (cycleSummary == null) {
                                        if (th3 != null) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (i52.a.l() != ww0.a.NONE) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (dVar2.S6().equals(LocalDate.now()) || !z16 || z15) {
                                            view4 = dVar2.I;
                                            if (view4 == null) {
                                                p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                                throw null;
                                            }
                                            view4.setVisibility(8);
                                            view5 = dVar2.P;
                                            if (view5 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                                throw null;
                                            }
                                            view5.setVisibility(8);
                                            button4 = dVar2.A;
                                            if (button4 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                throw null;
                                            }
                                            button4.setVisibility(8);
                                            if (z16) {
                                                dVar2.Y6(null, false);
                                                composeView3 = dVar2.F;
                                                if (composeView3 == null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                    throw null;
                                                }
                                                composeView3.setVisibility(0);
                                            } else {
                                                composeView2 = dVar2.F;
                                                if (composeView2 == null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                    throw null;
                                                }
                                                composeView2.setVisibility(8);
                                            }
                                            if (z15) {
                                                view6 = dVar2.T;
                                                if (view6 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                    throw null;
                                                }
                                                view6.setVisibility(0);
                                                view7 = dVar2.f38910k0;
                                                if (view7 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                                    throw null;
                                                }
                                                view7.setVisibility(8);
                                                view8 = dVar2.H0;
                                                if (view8 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                                    throw null;
                                                }
                                                view8.setVisibility(8);
                                                view9 = dVar2.f38919v;
                                                if (view9 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                                    throw null;
                                                }
                                                view9.setVisibility(8);
                                                view10 = dVar2.J0;
                                                if (view10 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                                    throw null;
                                                }
                                                view10.setVisibility(8);
                                                view11 = dVar2.I0;
                                                if (view11 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                                    throw null;
                                                }
                                                view11.setVisibility(8);
                                                view12 = dVar2.K0;
                                                if (view12 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                                    throw null;
                                                }
                                                view12.setVisibility(8);
                                                expandableTextView = dVar2.Z;
                                                if (expandableTextView != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                                    throw null;
                                                }
                                                expandableTextView.setVisibility(8);
                                                textView = dVar2.X;
                                                if (textView != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                    throw null;
                                                }
                                                textView.setVisibility(8);
                                            } else {
                                                if (cVar != null) {
                                                    cycleSummary2 = cVar.getCycleSummary();
                                                } else {
                                                    cycleSummary2 = null;
                                                }
                                                if (cycleSummary2 == null || !z16) {
                                                    view13 = dVar2.T;
                                                    if (view13 == null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                        throw null;
                                                    }
                                                    view13.setVisibility(8);
                                                    dVar2.I6(null);
                                                    if (cVar != null) {
                                                        log = cVar.getLog();
                                                    } else {
                                                        log = null;
                                                    }
                                                    dVar2.J6(log, null);
                                                } else {
                                                    view6 = dVar2.T;
                                                    if (view6 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                        throw null;
                                                    }
                                                    view6.setVisibility(0);
                                                    view7 = dVar2.f38910k0;
                                                    if (view7 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                                        throw null;
                                                    }
                                                    view7.setVisibility(8);
                                                    view8 = dVar2.H0;
                                                    if (view8 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                                        throw null;
                                                    }
                                                    view8.setVisibility(8);
                                                    view9 = dVar2.f38919v;
                                                    if (view9 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                                        throw null;
                                                    }
                                                    view9.setVisibility(8);
                                                    view10 = dVar2.J0;
                                                    if (view10 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                                        throw null;
                                                    }
                                                    view10.setVisibility(8);
                                                    view11 = dVar2.I0;
                                                    if (view11 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                                        throw null;
                                                    }
                                                    view11.setVisibility(8);
                                                    view12 = dVar2.K0;
                                                    if (view12 != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                                        throw null;
                                                    }
                                                    view12.setVisibility(8);
                                                    expandableTextView = dVar2.Z;
                                                    if (expandableTextView != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                                        throw null;
                                                    }
                                                    expandableTextView.setVisibility(8);
                                                    textView = dVar2.X;
                                                    if (textView != null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                        throw null;
                                                    }
                                                    textView.setVisibility(8);
                                                }
                                            }
                                        } else {
                                            dVar2.Y6(null, false);
                                            View view26 = dVar2.I;
                                            if (view26 == null) {
                                                p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                                throw null;
                                            }
                                            view26.setVisibility(8);
                                            ComposeView composeView5 = dVar2.F;
                                            if (composeView5 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            composeView5.setVisibility(0);
                                            View view27 = dVar2.P;
                                            if (view27 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                                throw null;
                                            }
                                            view27.setVisibility(0);
                                            Button button6 = dVar2.A;
                                            if (button6 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                throw null;
                                            }
                                            button6.setVisibility(8);
                                            TextView textView3 = dVar2.X;
                                            if (textView3 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                throw null;
                                            }
                                            textView3.setVisibility(8);
                                            ExpandableTextView expandableTextView3 = dVar2.Z;
                                            if (expandableTextView3 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                                throw null;
                                            }
                                            expandableTextView3.setVisibility(8);
                                            View view28 = dVar2.T;
                                            if (view28 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                throw null;
                                            }
                                            view28.setVisibility(8);
                                            View view29 = dVar2.f38910k0;
                                            if (view29 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                                throw null;
                                            }
                                            view29.setVisibility(8);
                                            View view30 = dVar2.H0;
                                            if (view30 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                                throw null;
                                            }
                                            view30.setVisibility(8);
                                            View view31 = dVar2.f38919v;
                                            if (view31 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                                throw null;
                                            }
                                            view31.setVisibility(8);
                                            View view32 = dVar2.J0;
                                            if (view32 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                                throw null;
                                            }
                                            view32.setVisibility(8);
                                            View view33 = dVar2.I0;
                                            if (view33 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                                throw null;
                                            }
                                            view33.setVisibility(8);
                                            View view34 = dVar2.K0;
                                            if (view34 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                                throw null;
                                            }
                                            view34.setVisibility(8);
                                        }
                                    } else {
                                        if (p005kotlin.jvm.internal.s.g(cycleSummary.getPregnancyCycle(), Boolean.TRUE)) {
                                            dVar2.M6();
                                            httpException = null;
                                            z14 = false;
                                        } else {
                                            dVar2.Y6(cycleSummary, false);
                                            h0VarZ = cycleSummary.z();
                                            h0VarH = cycleSummary.h();
                                            httpException = null;
                                            if (h0VarH == null && zG2) {
                                                int iB = cycleSummary.b();
                                                c22.j0.f23099a.getClass();
                                                SimpleDateFormat simpleDateFormatW = c22.j0.w("MMM d");
                                                Button button7 = dVar2.A;
                                                if (button7 == null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                    throw null;
                                                }
                                                button7.setText(dVar2.getString(R.string.lbl_view_group_calendar));
                                                if (iB == 1) {
                                                    String str2 = simpleDateFormatW.format(h0VarZ.f23061a.toDate());
                                                    String str3 = simpleDateFormatW.format(h0VarZ.f23062b.toDate());
                                                    TextView textView4 = dVar2.X;
                                                    if (textView4 == null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                        throw null;
                                                    }
                                                    textView4.setText(dVar2.getString(R.string.mct_event_date_range, dVar2.getString(R.string.mct_lbl_period), str2, str3));
                                                } else if (iB == 2) {
                                                    LocalDate localDate = cycleSummary.z().f23062b;
                                                    c22.h0 h0VarQ = cycleSummary.q();
                                                    if (h0VarQ == null) {
                                                        h0VarQ = cycleSummary.s();
                                                        h0VarQ.getClass();
                                                    }
                                                    LocalDate localDate2 = h0VarQ.f23061a;
                                                    c22.h0 h0VarI = jg.b.G(localDate).equals(localDate2) ? null : o53.f0.I(jg.b.G(localDate), jg.b.J(localDate2));
                                                    if (h0VarI == null) {
                                                        vb.h.z("In Phase 2 but follicular range is null");
                                                        return null;
                                                    }
                                                    String str4 = simpleDateFormatW.format(h0VarI.f23061a.toDate());
                                                    String str5 = simpleDateFormatW.format(h0VarI.f23062b.toDate());
                                                    TextView textView5 = dVar2.X;
                                                    if (textView5 == null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                        throw null;
                                                    }
                                                    textView5.setText(dVar2.getString(R.string.mct_event_date_range, dVar2.getString(R.string.mct_follicular_phase), str4, str5));
                                                } else if (iB == 3) {
                                                    c22.h0 h0VarQ2 = cycleSummary.q();
                                                    if (h0VarQ2 == null) {
                                                        vb.h.z("In phase 3 but fertile window is null");
                                                        return null;
                                                    }
                                                    String str6 = simpleDateFormatW.format(h0VarQ2.f23061a.toDate());
                                                    String str7 = simpleDateFormatW.format(h0VarQ2.f23062b.toDate());
                                                    TextView textView6 = dVar2.X;
                                                    if (textView6 == null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                        throw null;
                                                    }
                                                    textView6.setText(dVar2.getString(R.string.mct_event_date_range, dVar2.getString(R.string.mct_fertile_window), str6, str7));
                                                } else if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.c(aVar4) || i52.a.o() == ww0.i.NONE) {
                                                    c22.h0 h0VarS = cycleSummary.s();
                                                    if (h0VarS == null) {
                                                        vb.h.z("In phase 4 but luteal range is null");
                                                        return null;
                                                    }
                                                    String str8 = simpleDateFormatW.format(h0VarS.f23061a.toDate());
                                                    String str9 = simpleDateFormatW.format(h0VarS.f23062b.toDate());
                                                    TextView textView7 = dVar2.X;
                                                    if (textView7 == null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                        throw null;
                                                    }
                                                    textView7.setText(dVar2.getString(R.string.mct_event_date_range, dVar2.getString(R.string.mct_luteal_phase), str8, str9));
                                                } else {
                                                    String str10 = simpleDateFormatW.format(jg.b.G(h0VarH.f23062b).toDate());
                                                    TextView textView8 = dVar2.X;
                                                    if (textView8 == null) {
                                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                        throw null;
                                                    }
                                                    textView8.setText(dVar2.getString(R.string.mct_period_predicted_start_date, str10));
                                                }
                                            } else {
                                                button = dVar2.A;
                                                if (button == null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                    throw null;
                                                }
                                                if (j23.g.a.a(h0VarZ, dVar2.S6())) {
                                                    string = dVar2.getString(R.string.lbl_view_group_calendar);
                                                } else {
                                                    string = dVar2.getString(R.string.mct_add_period);
                                                }
                                                button.setText(string);
                                            }
                                            dVar2.I6(cycleSummary);
                                            aVarL = i52.a.l();
                                            aVar = ww0.a.NONE;
                                            composeView = dVar2.F;
                                            if (aVarL == aVar) {
                                                if (composeView != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                    throw null;
                                                }
                                                composeView.setVisibility(8);
                                                button3 = dVar2.A;
                                                if (button3 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                    throw null;
                                                }
                                                button3.setVisibility(8);
                                                z14 = false;
                                            } else {
                                                if (composeView != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                    throw null;
                                                }
                                                z14 = false;
                                                composeView.setVisibility(0);
                                                button2 = dVar2.A;
                                                if (button2 != null) {
                                                    p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                    throw null;
                                                }
                                                button2.setVisibility(0);
                                            }
                                            view2 = dVar2.P;
                                            if (view2 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                                throw null;
                                            }
                                            view2.setVisibility(8);
                                            view3 = dVar2.T;
                                            if (view3 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                throw null;
                                            }
                                            view3.setVisibility(8);
                                        }
                                        pregnancyCycle = cycleSummary.getPregnancyCycle();
                                        if (pregnancyCycle != null) {
                                            zBooleanValue = pregnancyCycle.booleanValue();
                                        } else {
                                            zBooleanValue = z14;
                                        }
                                        if (!zBooleanValue) {
                                            dVar2.J6(cVar.getLog(), cycleSummary.getCurrentPhase());
                                            if (!dVar2.f38913n && dVar2.S6().equals(LocalDate.now()) && !cycleSummary.I() && d1.i(q92.x.DI_CONNECT_UPLOAD)) {
                                                h0VarZ2 = cycleSummary.z();
                                                if (j23.g.a.a(h0VarZ2, dVar2.S6())) {
                                                    string2 = dVar2.getString(R.string.mct_did_your_period_start_predicted);
                                                } else {
                                                    if (cycleSummary.z().f23062b.plusDays(3).compareTo((ReadablePartial) dVar2.S6()) <= 0) {
                                                        string2 = dVar2.getString(R.string.mct_did_period_happen_from, h0VarZ2.f23061a.toString("MMM d"), h0VarZ2.f23062b.toString("MMM d"));
                                                    } else {
                                                        str = httpException;
                                                    }
                                                    if (str != 0) {
                                                        Context contextRequireContext = dVar2.requireContext();
                                                        contextRequireContext.getClass();
                                                        String string3 = dVar2.getString(R.string.mct_correcting_your_period_dates);
                                                        string3.getClass();
                                                        new r22.k0(contextRequireContext, new r22.k0.a(str, string3, false, false, Integer.valueOf(R.style.Text_Title3_Primary), Integer.valueOf(R.style.Text_Body1_Primary), dVar2.getString(R.string.lbl_yes), null, new m1(28, dVar2, cycleSummary), dVar2.getString(R.string.mct_edit_period), null, new l(dVar2, i15), 1156, null)).show();
                                                    }
                                                }
                                                str = string2;
                                                if (str != 0) {
                                                    Context contextRequireContext2 = dVar2.requireContext();
                                                    contextRequireContext2.getClass();
                                                    String string4 = dVar2.getString(R.string.mct_correcting_your_period_dates);
                                                    string4.getClass();
                                                    new r22.k0(contextRequireContext2, new r22.k0.a(str, string4, false, false, Integer.valueOf(R.style.Text_Title3_Primary), Integer.valueOf(R.style.Text_Body1_Primary), dVar2.getString(R.string.lbl_yes), null, new m1(28, dVar2, cycleSummary), dVar2.getString(R.string.mct_edit_period), null, new l(dVar2, i15), 1156, null)).show();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            httpException = null;
                            z14 = false;
                        } else {
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                            boolean zG3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(aVar5);
                            i52.a.f91796a.getClass();
                            if (i52.a.l() == ww0.a.INACTIVE) {
                                if (cVar != null) {
                                    zG = false;
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    dVar2.M6();
                                } else {
                                    dVar2.Y6(null, false);
                                    view14 = dVar2.I;
                                    if (view14 != null) {
                                        p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                        throw null;
                                    }
                                    view14.setVisibility(8);
                                    composeView4 = dVar2.F;
                                    if (composeView4 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                        throw null;
                                    }
                                    composeView4.setVisibility(8);
                                    view15 = dVar2.P;
                                    if (view15 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                        throw null;
                                    }
                                    view15.setVisibility(8);
                                    button5 = dVar2.A;
                                    if (button5 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                        throw null;
                                    }
                                    button5.setVisibility(8);
                                    textView2 = dVar2.X;
                                    if (textView2 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                        throw null;
                                    }
                                    textView2.setVisibility(8);
                                    expandableTextView2 = dVar2.Z;
                                    if (expandableTextView2 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                        throw null;
                                    }
                                    expandableTextView2.setVisibility(8);
                                    view16 = dVar2.L0;
                                    if (view16 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataBarrier");
                                        throw null;
                                    }
                                    view16.setVisibility(8);
                                    view17 = dVar2.M0;
                                    if (view17 != null) {
                                        p005kotlin.jvm.internal.s.m("mctPregnancyOneDayView");
                                        throw null;
                                    }
                                    view17.setVisibility(8);
                                    view18 = dVar2.I;
                                    if (view18 != null) {
                                        p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                        throw null;
                                    }
                                    view18.setVisibility(0);
                                    view19 = dVar2.T;
                                    if (view19 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                        throw null;
                                    }
                                    view19.setVisibility(8);
                                    view20 = dVar2.f38910k0;
                                    if (view20 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                        throw null;
                                    }
                                    view20.setVisibility(8);
                                    view21 = dVar2.H0;
                                    if (view21 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                        throw null;
                                    }
                                    view21.setVisibility(8);
                                    view22 = dVar2.f38919v;
                                    if (view22 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                        throw null;
                                    }
                                    view22.setVisibility(8);
                                    view23 = dVar2.J0;
                                    if (view23 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                        throw null;
                                    }
                                    view23.setVisibility(8);
                                    view24 = dVar2.I0;
                                    if (view24 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                        throw null;
                                    }
                                    view24.setVisibility(8);
                                    view25 = dVar2.K0;
                                    if (view25 != null) {
                                        p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                        throw null;
                                    }
                                    view25.setVisibility(8);
                                }
                            } else {
                                if (cVar != null) {
                                    cycleSummary = cVar.getCycleSummary();
                                } else {
                                    cycleSummary = null;
                                }
                                if (cycleSummary == null) {
                                    if (th3 != null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (i52.a.l() != ww0.a.NONE) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (dVar2.S6().equals(LocalDate.now())) {
                                        view4 = dVar2.I;
                                        if (view4 == null) {
                                            p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                            throw null;
                                        }
                                        view4.setVisibility(8);
                                        view5 = dVar2.P;
                                        if (view5 == null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                            throw null;
                                        }
                                        view5.setVisibility(8);
                                        button4 = dVar2.A;
                                        if (button4 == null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                            throw null;
                                        }
                                        button4.setVisibility(8);
                                        if (z16) {
                                            dVar2.Y6(null, false);
                                            composeView3 = dVar2.F;
                                            if (composeView3 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            composeView3.setVisibility(0);
                                        } else {
                                            composeView2 = dVar2.F;
                                            if (composeView2 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            composeView2.setVisibility(8);
                                        }
                                        if (z15) {
                                            view6 = dVar2.T;
                                            if (view6 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                throw null;
                                            }
                                            view6.setVisibility(0);
                                            view7 = dVar2.f38910k0;
                                            if (view7 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                                throw null;
                                            }
                                            view7.setVisibility(8);
                                            view8 = dVar2.H0;
                                            if (view8 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                                throw null;
                                            }
                                            view8.setVisibility(8);
                                            view9 = dVar2.f38919v;
                                            if (view9 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                                throw null;
                                            }
                                            view9.setVisibility(8);
                                            view10 = dVar2.J0;
                                            if (view10 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                                throw null;
                                            }
                                            view10.setVisibility(8);
                                            view11 = dVar2.I0;
                                            if (view11 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                                throw null;
                                            }
                                            view11.setVisibility(8);
                                            view12 = dVar2.K0;
                                            if (view12 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                                throw null;
                                            }
                                            view12.setVisibility(8);
                                            expandableTextView = dVar2.Z;
                                            if (expandableTextView != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                                throw null;
                                            }
                                            expandableTextView.setVisibility(8);
                                            textView = dVar2.X;
                                            if (textView != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                throw null;
                                            }
                                            textView.setVisibility(8);
                                        } else {
                                            if (cVar != null) {
                                                cycleSummary2 = cVar.getCycleSummary();
                                            } else {
                                                cycleSummary2 = null;
                                            }
                                            if (cycleSummary2 == null) {
                                            }
                                            view13 = dVar2.T;
                                            if (view13 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                throw null;
                                            }
                                            view13.setVisibility(8);
                                            dVar2.I6(null);
                                            if (cVar != null) {
                                                log = cVar.getLog();
                                            } else {
                                                log = null;
                                            }
                                            dVar2.J6(log, null);
                                        }
                                    } else {
                                        view4 = dVar2.I;
                                        if (view4 == null) {
                                            p005kotlin.jvm.internal.s.m("startTrackingFromInactiveGroup");
                                            throw null;
                                        }
                                        view4.setVisibility(8);
                                        view5 = dVar2.P;
                                        if (view5 == null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                            throw null;
                                        }
                                        view5.setVisibility(8);
                                        button4 = dVar2.A;
                                        if (button4 == null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                            throw null;
                                        }
                                        button4.setVisibility(8);
                                        if (z16) {
                                            dVar2.Y6(null, false);
                                            composeView3 = dVar2.F;
                                            if (composeView3 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            composeView3.setVisibility(0);
                                        } else {
                                            composeView2 = dVar2.F;
                                            if (composeView2 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            composeView2.setVisibility(8);
                                        }
                                        if (z15) {
                                            view6 = dVar2.T;
                                            if (view6 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                throw null;
                                            }
                                            view6.setVisibility(0);
                                            view7 = dVar2.f38910k0;
                                            if (view7 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayAddSymptomsGroup");
                                                throw null;
                                            }
                                            view7.setVisibility(8);
                                            view8 = dVar2.H0;
                                            if (view8 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsGroup");
                                                throw null;
                                            }
                                            view8.setVisibility(8);
                                            view9 = dVar2.f38919v;
                                            if (view9 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplaySymptomsEdit");
                                                throw null;
                                            }
                                            view9.setVisibility(8);
                                            view10 = dVar2.J0;
                                            if (view10 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayAddNotesGroup");
                                                throw null;
                                            }
                                            view10.setVisibility(8);
                                            view11 = dVar2.I0;
                                            if (view11 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleAddNotesSpace");
                                                throw null;
                                            }
                                            view11.setVisibility(8);
                                            view12 = dVar2.K0;
                                            if (view12 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayDisplayNotesGroup");
                                                throw null;
                                            }
                                            view12.setVisibility(8);
                                            expandableTextView = dVar2.Z;
                                            if (expandableTextView != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayEducationText");
                                                throw null;
                                            }
                                            expandableTextView.setVisibility(8);
                                            textView = dVar2.X;
                                            if (textView != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayTimeRemainingLabel");
                                                throw null;
                                            }
                                            textView.setVisibility(8);
                                        } else {
                                            if (cVar != null) {
                                                cycleSummary2 = cVar.getCycleSummary();
                                            } else {
                                                cycleSummary2 = null;
                                            }
                                            if (cycleSummary2 == null) {
                                            }
                                            view13 = dVar2.T;
                                            if (view13 == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                                throw null;
                                            }
                                            view13.setVisibility(8);
                                            dVar2.I6(null);
                                            if (cVar != null) {
                                                log = cVar.getLog();
                                            } else {
                                                log = null;
                                            }
                                            dVar2.J6(log, null);
                                        }
                                    }
                                } else {
                                    if (p005kotlin.jvm.internal.s.g(cycleSummary.getPregnancyCycle(), Boolean.TRUE)) {
                                        dVar2.M6();
                                        httpException = null;
                                        z14 = false;
                                    } else {
                                        dVar2.Y6(cycleSummary, false);
                                        h0VarZ = cycleSummary.z();
                                        h0VarH = cycleSummary.h();
                                        httpException = null;
                                        if (h0VarH == null) {
                                            button = dVar2.A;
                                            if (button == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                throw null;
                                            }
                                            if (j23.g.a.a(h0VarZ, dVar2.S6())) {
                                                string = dVar2.getString(R.string.lbl_view_group_calendar);
                                            } else {
                                                string = dVar2.getString(R.string.mct_add_period);
                                            }
                                            button.setText(string);
                                        } else {
                                            button = dVar2.A;
                                            if (button == null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                throw null;
                                            }
                                            if (j23.g.a.a(h0VarZ, dVar2.S6())) {
                                                string = dVar2.getString(R.string.lbl_view_group_calendar);
                                            } else {
                                                string = dVar2.getString(R.string.mct_add_period);
                                            }
                                            button.setText(string);
                                        }
                                        dVar2.I6(cycleSummary);
                                        aVarL = i52.a.l();
                                        aVar = ww0.a.NONE;
                                        composeView = dVar2.F;
                                        if (aVarL == aVar) {
                                            if (composeView != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            composeView.setVisibility(8);
                                            button3 = dVar2.A;
                                            if (button3 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                throw null;
                                            }
                                            button3.setVisibility(8);
                                            z14 = false;
                                        } else {
                                            if (composeView != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChart");
                                                throw null;
                                            }
                                            z14 = false;
                                            composeView.setVisibility(0);
                                            button2 = dVar2.A;
                                            if (button2 != null) {
                                                p005kotlin.jvm.internal.s.m("menstrualCycleDayChartButton");
                                                throw null;
                                            }
                                            button2.setVisibility(0);
                                        }
                                        view2 = dVar2.P;
                                        if (view2 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayInactiveGroup");
                                            throw null;
                                        }
                                        view2.setVisibility(8);
                                        view3 = dVar2.T;
                                        if (view3 != null) {
                                            p005kotlin.jvm.internal.s.m("menstrualCycleDayNoDataLabel");
                                            throw null;
                                        }
                                        view3.setVisibility(8);
                                    }
                                    pregnancyCycle = cycleSummary.getPregnancyCycle();
                                    if (pregnancyCycle != null) {
                                        zBooleanValue = pregnancyCycle.booleanValue();
                                    } else {
                                        zBooleanValue = z14;
                                    }
                                    if (!zBooleanValue) {
                                        dVar2.J6(cVar.getLog(), cycleSummary.getCurrentPhase());
                                        if (!dVar2.f38913n) {
                                            h0VarZ2 = cycleSummary.z();
                                            if (j23.g.a.a(h0VarZ2, dVar2.S6())) {
                                                string2 = dVar2.getString(R.string.mct_did_your_period_start_predicted);
                                            } else {
                                                if (cycleSummary.z().f23062b.plusDays(3).compareTo((ReadablePartial) dVar2.S6()) <= 0) {
                                                    string2 = dVar2.getString(R.string.mct_did_period_happen_from, h0VarZ2.f23061a.toString("MMM d"), h0VarZ2.f23062b.toString("MMM d"));
                                                } else {
                                                    str = httpException;
                                                }
                                                if (str != 0) {
                                                    Context contextRequireContext3 = dVar2.requireContext();
                                                    contextRequireContext3.getClass();
                                                    String string5 = dVar2.getString(R.string.mct_correcting_your_period_dates);
                                                    string5.getClass();
                                                    new r22.k0(contextRequireContext3, new r22.k0.a(str, string5, false, false, Integer.valueOf(R.style.Text_Title3_Primary), Integer.valueOf(R.style.Text_Body1_Primary), dVar2.getString(R.string.lbl_yes), null, new m1(28, dVar2, cycleSummary), dVar2.getString(R.string.mct_edit_period), null, new l(dVar2, i15), 1156, null)).show();
                                                }
                                            }
                                            str = string2;
                                            if (str != 0) {
                                                Context contextRequireContext4 = dVar2.requireContext();
                                                contextRequireContext4.getClass();
                                                String string6 = dVar2.getString(R.string.mct_correcting_your_period_dates);
                                                string6.getClass();
                                                new r22.k0(contextRequireContext4, new r22.k0.a(str, string6, false, false, Integer.valueOf(R.style.Text_Title3_Primary), Integer.valueOf(R.style.Text_Body1_Primary), dVar2.getString(R.string.lbl_yes), null, new m1(28, dVar2, cycleSummary), dVar2.getString(R.string.mct_edit_period), null, new l(dVar2, i15), 1156, null)).show();
                                            }
                                        }
                                    }
                                }
                            }
                            httpException = null;
                            z14 = false;
                        }
                    }
                    if (!aVar2.f56602d) {
                        if (th3 instanceof HttpException) {
                            httpException = (HttpException) th3;
                        }
                        if ((httpException == null || httpException.code() != 412) ? z14 : true) {
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("editPageSelected", com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.b.Notes);
                            bundle.putString("pendingNote", dVar2.f38914o);
                            DataStorageConsentActivity.a.e(DataStorageConsentActivity.f32194t, dVar2, true, 105, bundle, 12);
                        } else {
                            dVar2.u6(cx0.b.a(th3));
                        }
                        aVar2.f56602d = true;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                ((View) obj).getClass();
                MenstrualCycleCalendarActivity.a aVar7 = MenstrualCycleCalendarActivity.f38783c;
                Context contextRequireContext5 = dVar.requireContext();
                contextRequireContext5.getClass();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.EDIT_RANGE;
                aVar7.getClass();
                dVar.startActivity(MenstrualCycleCalendarActivity.a.a(contextRequireContext5, aVar8));
                dVar.f38913n = true;
                return Unit.INSTANCE;
            default:
                cx0.a aVar9 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                if ((aVar9 != null ? aVar9.f56600b : null) != null && !aVar9.f56602d) {
                    dVar.u6(cx0.b.a(aVar9.f56600b));
                    aVar9.f56602d = true;
                }
                return Unit.INSTANCE;
        }
    }
}
