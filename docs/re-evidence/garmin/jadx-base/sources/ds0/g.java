package ds0;

import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import b.u;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.CalendarToDeviceSummaryActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.PregnancySettingActivity;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMNestedScrollView;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import e2.i0;
import e2.v;
import e2.x;
import e2.z;
import et1.v1;
import ew1.a1;
import ew1.c1;
import ew1.c2;
import ew1.d2;
import ew1.j2;
import ew1.o2;
import ew1.q1;
import ew1.q2;
import ew1.s2;
import ew1.w0;
import ew1.w1;
import ew1.x2;
import ew1.y0;
import f2.n0;
import f5.z1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import jv1.d0;
import jv1.s;
import lc.u0;
import o13.p;
import o13.t;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p5.k0;
import r22.t1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61074b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f61073a = i14;
        this.f61074b = obj;
    }

    private final Object a(Object obj) {
        int i14;
        s2 s2Var = (s2) this.f61074b;
        tw1.k kVar = (tw1.k) obj;
        s2.a aVar = s2.f66742d;
        int i15 = kVar == null ? -1 : s2.b.f66745a[kVar.ordinal()];
        String str = null;
        if (i15 == 1) {
            fy1.c cVar = fy1.c.f73884a;
            vt1.o oVarA6 = s2Var.w6().a6();
            cVar.getClass();
            i14 = oVarA6 != null ? fy1.c.a.f73888b[oVarA6.ordinal()] : -1;
            if (i14 == 2) {
                str = "CoachSelectBikeBeginnerTrainLevel";
            } else if (i14 == 3) {
                str = "CoachSelectRunBeginnerTrainLevel";
            }
            if (str != null) {
                fy1.c.b(str);
            }
        } else if (i15 == 2) {
            fy1.c cVar2 = fy1.c.f73884a;
            vt1.o oVarA7 = s2Var.w6().a6();
            cVar2.getClass();
            i14 = oVarA7 != null ? fy1.c.a.f73888b[oVarA7.ordinal()] : -1;
            if (i14 == 2) {
                str = "CoachSelectBikeExperiencedTrainLevel";
            } else if (i14 == 3) {
                str = "CoachSelectRunExperiencedTrainLevel";
            }
            if (str != null) {
                fy1.c.b(str);
            }
        }
        if (s2Var.w6().f13385r1) {
            s2Var.w6().G7("FBTSelectTrainingLevelFragment", new c2(4, s2Var, kVar));
        } else {
            aw1.h hVarW6 = s2Var.w6();
            hVarW6.U7(kVar);
            if (!hVarW6.f13385r1) {
                if (!hVarW6.f13383p1 || hVarW6.T5().isEmpty()) {
                    hVarW6.f7();
                } else {
                    hVarW6.l7();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj) {
        x2 x2Var = (x2) this.f61074b;
        d0 d0Var = (d0) obj;
        x2.a aVar = x2.f66834d;
        d0Var.getClass();
        fy1.c.f73884a.getClass();
        fy1.c.b("GarminCoachTrainingHistorySelected");
        x2Var.y6().W7(d0Var);
        aw1.h hVarY6 = x2Var.y6();
        androidx.fragment.app.m mVarRequireActivity = x2Var.requireActivity();
        mVarRequireActivity.getClass();
        if (hVarY6.d7()) {
            s sVarI6 = hVarY6.i6();
            if ((sVarI6 != null ? sVarI6.f101124c : null) == null) {
                aw1.h.n7(hVarY6, mVarRequireActivity);
            } else if (hVarY6.k5()) {
                hVarY6.g7();
            } else {
                hVarY6.m7(mVarRequireActivity);
            }
        } else {
            aw1.h.n7(hVarY6, mVarRequireActivity);
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj) {
        CalendarToDeviceSummaryActivity calendarToDeviceSummaryActivity = (CalendarToDeviceSummaryActivity) this.f61074b;
        CalendarToDeviceSummaryActivity.a aVar = CalendarToDeviceSummaryActivity.f31052g;
        int i14 = CalendarToDeviceSummaryActivity.b.f31059a[((g3) obj).f35300a.ordinal()];
        if (i14 == 1) {
            calendarToDeviceSummaryActivity.showProgressOverlay();
        } else if (i14 == 2) {
            ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).n(calendarToDeviceSummaryActivity, calendarToDeviceSummaryActivity.f31055c, "CalendarToDeviceSummaryActivity");
            calendarToDeviceSummaryActivity.setResult(-1);
            calendarToDeviceSummaryActivity.hideProgressOverlay();
            calendarToDeviceSummaryActivity.finish();
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            calendarToDeviceSummaryActivity.displayFailedMessage();
            calendarToDeviceSummaryActivity.setResult(0);
            calendarToDeviceSummaryActivity.hideProgressOverlay();
            calendarToDeviceSummaryActivity.finish();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj) {
        p63.e eVar = (p63.e) this.f61074b;
        n63.e eVar2 = (n63.e) obj;
        ez0.a aVar = ez0.a.f67467a;
        eVar2.getClass();
        eVar2.f123906e = true;
        eVar2.f123905d = true;
        eVar2.f123903b = false;
        eVar2.f123904c = true;
        eVar2.f123902a = true;
        if (eVar != null) {
            eVar2.f123918q = eVar;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:504:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:505:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:521:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:523:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:525:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:527:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:529:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:531:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:533:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:534:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:536:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:538:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:544:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:550:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:73:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        String strC;
        String strB;
        Throwable th3;
        String string;
        ez1.c cVar;
        String str;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        LinearLayout linearLayout2;
        TextView textView3;
        TextView textView4;
        LinearLayout linearLayout3;
        TextView textView5;
        TextView textView6;
        String string2;
        x xVar;
        ViewGroup viewGroup;
        androidx.fragment.app.m activity;
        u onBackPressedDispatcher;
        androidx.fragment.app.m activity2;
        u onBackPressedDispatcher2;
        tw1.d dVar;
        tw1.c cVar2;
        hv1.f fVar;
        Integer numValueOf;
        u onBackPressedDispatcher3;
        int i14 = this.f61073a;
        double dDoubleValue = 0.0d;
        int i15 = 2;
        int i16 = 3;
        boolean z14 = false;
        z = false;
        boolean z15 = false;
        z = false;
        boolean z16 = false;
        z14 = false;
        x xVar2 = null;
        String str2 = null;
        listI = null;
        List<tw1.d> listI = null;
        Object obj2 = this.f61074b;
        switch (i14) {
            case 0:
                JetLagActivity jetLagActivity = (JetLagActivity) obj2;
                t tVar = jetLagActivity.f36953c;
                g3 g3Var = (g3) obj;
                JetLagActivity.a aVar = JetLagActivity.f36950d;
                int i17 = JetLagActivity.b.f36954a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    List list = (List) g3Var.f35301b;
                    if ((list == null || list.isEmpty()) && !((Boolean) tVar.getValue()).booleanValue()) {
                        jetLagActivity.hideProgressOverlay();
                        os0.c cVar3 = jetLagActivity.f36952b;
                        if (cVar3 != null) {
                            cVar3.f133544c.setContent(new z3.e(1874345837, true, new os0.b(cVar3, z14 ? 1 : 0)));
                        }
                    } else {
                        jetLagActivity.I8(new c(((Boolean) tVar.getValue()).booleanValue()));
                    }
                } else if (i17 == 2) {
                    jetLagActivity.hideProgressOverlay();
                    jetLagActivity.displayFailedMessage();
                    os0.c cVar4 = jetLagActivity.f36952b;
                    if (cVar4 != null) {
                        cVar4.f133544c.setContent(new z3.e(1874345837, true, new os0.b(cVar4, z14 ? 1 : 0)));
                    }
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    jetLagActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 1:
                dz1.k kVar = (dz1.k) obj2;
                my1.d dVar2 = (my1.d) obj;
                if (dVar2 != null) {
                    fg0.u uVar = dVar2.f121503v;
                    fg0.x xVar3 = dVar2.f121502t;
                    TextView textView7 = kVar.f61756m;
                    if (textView7 == null) {
                        p005kotlin.jvm.internal.s.m("dateViewValue");
                        throw null;
                    }
                    ny1.f fVar2 = dVar2.f121486c;
                    List<gg0.j> list2 = dVar2.f121490g;
                    if (fVar2 == ny1.f.CUSTOM) {
                        og0.a aVar2 = og0.a.f131967a;
                        String str3 = dVar2.f121484a;
                        String str4 = dVar2.f121485b;
                        aVar2.getClass();
                        p pVarY = og0.a.y(str3, str4, true);
                        strC = pVarY.f128594a + " - " + pVarY.f128595b;
                    } else {
                        Context contextRequireContext = kVar.requireContext();
                        contextRequireContext.getClass();
                        strC = fVar2.c(contextRequireContext);
                    }
                    textView7.setText(strC);
                    TextView textView8 = kVar.f61751h;
                    if (textView8 == null) {
                        p005kotlin.jvm.internal.s.m("eventTypeValue");
                        throw null;
                    }
                    gg0.f fVar3 = dVar2.f121487d;
                    if (fVar3 != null) {
                        Context contextRequireContext2 = kVar.requireContext();
                        contextRequireContext2.getClass();
                        strB = fVar3.b(contextRequireContext2);
                    } else {
                        strB = "";
                    }
                    textView8.setText(strB);
                    TextView textView9 = kVar.f61762t;
                    if (textView9 == null) {
                        p005kotlin.jvm.internal.s.m("eventLimitRadiusValue");
                        throw null;
                    }
                    ez1.d dVar3 = dVar2.f121489f;
                    Context contextRequireContext3 = kVar.requireContext();
                    contextRequireContext3.getClass();
                    textView9.setText(dVar3.c(contextRequireContext3));
                    TextView textView10 = kVar.f61753j;
                    if (textView10 == null) {
                        p005kotlin.jvm.internal.s.m("participationValue");
                        throw null;
                    }
                    ny1.g gVar = dVar2.f121488e;
                    Context contextRequireContext4 = kVar.requireContext();
                    contextRequireContext4.getClass();
                    textView10.setText(gVar.a(contextRequireContext4));
                    GCMComplexTwoLineButton gCMComplexTwoLineButton = kVar.f61763v;
                    if (gCMComplexTwoLineButton == null) {
                        p005kotlin.jvm.internal.s.m("officialEventsView");
                        throw null;
                    }
                    gCMComplexTwoLineButton.d(list2 != null && list2.contains(gg0.j.OFFICIAL));
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = kVar.f61764w;
                    if (gCMComplexTwoLineButton2 == null) {
                        p005kotlin.jvm.internal.s.m("verifiedEventsView");
                        throw null;
                    }
                    gCMComplexTwoLineButton2.d(list2 != null && list2.contains(gg0.j.VERIFIED));
                    GCMComplexTwoLineButton gCMComplexTwoLineButton3 = kVar.f61765x;
                    if (gCMComplexTwoLineButton3 == null) {
                        p005kotlin.jvm.internal.s.m("userEventsView");
                        throw null;
                    }
                    gCMComplexTwoLineButton3.d(list2 != null && list2.contains(gg0.j.NONE));
                    if (p005kotlin.jvm.internal.s.g(dVar2.f121501r, Boolean.FALSE)) {
                        LinearLayout linearLayout4 = kVar.f61760q;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("radiusView");
                            throw null;
                        }
                        linearLayout4.setEnabled(false);
                        TextView textView11 = kVar.f61761r;
                        if (textView11 == null) {
                            p005kotlin.jvm.internal.s.m("radiusTitle");
                            throw null;
                        }
                        textView11.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                        TextView textView12 = kVar.f61762t;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("eventLimitRadiusValue");
                            throw null;
                        }
                        textView12.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                    }
                    Object[] objArr = xVar3 != null;
                    bg0.a.b bVar = dVar2.f121498o;
                    double d14 = dVar2.f121497n;
                    double d15 = dVar2.f121496m;
                    if (objArr == true) {
                        TextView textView13 = kVar.f61759p;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("eventDurationValue");
                            throw null;
                        }
                        Context contextRequireContext5 = kVar.requireContext();
                        contextRequireContext5.getClass();
                        Integer num = xVar3 != null ? xVar3.f71368d : null;
                        if (num != null && num.intValue() == 5000) {
                            string2 = contextRequireContext5.getString(R.string.personal_records_label_5k_run);
                        } else if (num != null && num.intValue() == 10000) {
                            string2 = contextRequireContext5.getString(R.string.personal_records_label_10k_run);
                        } else {
                            string2 = (num != null && num.intValue() == 21098) ? contextRequireContext5.getString(R.string.atp_lbl_half_marathon) : null;
                        }
                        textView13.setText(string2 != null ? string2 : "");
                    } else {
                        if (uVar != null) {
                            TextView textView14 = kVar.f61759p;
                            if (textView14 == null) {
                                p005kotlin.jvm.internal.s.m("eventDurationValue");
                                throw null;
                            }
                            textView14.setText((uVar == null || (str = uVar.f71358j) == null) ? "" : str);
                        } else if (dVar2.f121491h) {
                            th3 = null;
                            if (dVar2.f121492i == ny1.b.CUSTOM || (cVar = dVar2.f121493j) == ez1.b.CUSTOM || cVar == ez1.a.CUSTOM) {
                                TextView textView15 = kVar.f61759p;
                                if (textView15 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDurationValue");
                                    throw null;
                                }
                                if (d14 > 0.0d && d15 > 0.0d) {
                                    Context contextRequireContext6 = kVar.requireContext();
                                    String strValueOf = String.valueOf(d14);
                                    String strValueOf2 = String.valueOf(d15);
                                    Context contextRequireContext7 = kVar.requireContext();
                                    contextRequireContext7.getClass();
                                    string = contextRequireContext6.getString(R.string.lbl_value_range_with_unit, strValueOf, strValueOf2, bVar.a(contextRequireContext7));
                                } else if (d14 > 0.0d && d15 == 0.0d) {
                                    Context contextRequireContext8 = kVar.requireContext();
                                    String strValueOf3 = String.valueOf(d14);
                                    Context contextRequireContext9 = kVar.requireContext();
                                    contextRequireContext9.getClass();
                                    string = contextRequireContext8.getString(R.string.lbl_greater_than_equal_to_value_unit, strValueOf3, bVar.a(contextRequireContext9));
                                } else if (d14 != 0.0d || d15 <= 0.0d) {
                                    string = kVar.getString(R.string.lbl_surface_type_all);
                                } else {
                                    Context contextRequireContext10 = kVar.requireContext();
                                    String strValueOf4 = String.valueOf(d15);
                                    Context contextRequireContext11 = kVar.requireContext();
                                    contextRequireContext11.getClass();
                                    string = contextRequireContext10.getString(R.string.lbl_less_than_equal_to_value_unit, strValueOf4, bVar.a(contextRequireContext11));
                                }
                                textView15.setText(string);
                            } else {
                                TextView textView16 = kVar.f61759p;
                                if (textView16 == null) {
                                    p005kotlin.jvm.internal.s.m("eventDurationValue");
                                    throw null;
                                }
                                Context contextRequireContext12 = kVar.requireContext();
                                contextRequireContext12.getClass();
                                textView16.setText(cVar.c(contextRequireContext12));
                            }
                        } else {
                            th3 = null;
                            TextView textView17 = kVar.f61759p;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("eventDurationValue");
                                throw null;
                            }
                            ez1.c cVar5 = dVar2.f121494k;
                            Context contextRequireContext13 = kVar.requireContext();
                            contextRequireContext13.getClass();
                            textView17.setText(cVar5.c(contextRequireContext13));
                        }
                        if (kVar.u6().c5()) {
                            if (kVar.u6().T) {
                                kVar.u6().T = false;
                                kVar.v6(true, false);
                            } else {
                                kVar.v6(true, true);
                            }
                        } else if (kVar.u6().P) {
                            kVar.v6(false, true);
                        } else {
                            kVar.u6().T = false;
                            kVar.v6(false, false);
                        }
                        if (xVar3 == null || uVar != null) {
                            linearLayout = kVar.f61749f;
                            if (linearLayout == null) {
                                p005kotlin.jvm.internal.s.m("eventTypeView");
                                throw th3;
                            }
                            linearLayout.setClickable(false);
                            textView = kVar.f61750g;
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("eventTypeTitle");
                                throw th3;
                            }
                            textView.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                            textView2 = kVar.f61751h;
                            if (textView2 == null) {
                                p005kotlin.jvm.internal.s.m("eventTypeValue");
                                throw th3;
                            }
                            textView2.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                            linearLayout2 = kVar.f61757n;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("eventDuration");
                                throw th3;
                            }
                            linearLayout2.setClickable(false);
                            textView3 = kVar.f61758o;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("eventDurationTitle");
                                throw th3;
                            }
                            textView3.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                            textView4 = kVar.f61759p;
                            if (textView4 == null) {
                                p005kotlin.jvm.internal.s.m("eventDurationValue");
                                throw th3;
                            }
                            textView4.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                            if (xVar3 != null) {
                                linearLayout3 = kVar.f61754k;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("dateView");
                                    throw th3;
                                }
                                linearLayout3.setClickable(false);
                                textView5 = kVar.f61755l;
                                if (textView5 == null) {
                                    p005kotlin.jvm.internal.s.m("dateViewTitle");
                                    throw th3;
                                }
                                textView5.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                                textView6 = kVar.f61756m;
                                if (textView6 == null) {
                                    p005kotlin.jvm.internal.s.m("dateViewValue");
                                    throw th3;
                                }
                                textView6.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                            }
                        }
                    }
                    th3 = null;
                    if (kVar.u6().c5()) {
                        if (kVar.u6().T) {
                            kVar.u6().T = false;
                            kVar.v6(true, false);
                        } else {
                            kVar.v6(true, true);
                        }
                    } else if (kVar.u6().P) {
                        kVar.v6(false, true);
                    } else {
                        kVar.u6().T = false;
                        kVar.v6(false, false);
                    }
                    if (xVar3 == null) {
                        linearLayout = kVar.f61749f;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("eventTypeView");
                            throw th3;
                        }
                        linearLayout.setClickable(false);
                        textView = kVar.f61750g;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("eventTypeTitle");
                            throw th3;
                        }
                        textView.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                        textView2 = kVar.f61751h;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("eventTypeValue");
                            throw th3;
                        }
                        textView2.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                        linearLayout2 = kVar.f61757n;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("eventDuration");
                            throw th3;
                        }
                        linearLayout2.setClickable(false);
                        textView3 = kVar.f61758o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("eventDurationTitle");
                            throw th3;
                        }
                        textView3.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                        textView4 = kVar.f61759p;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("eventDurationValue");
                            throw th3;
                        }
                        textView4.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                        if (xVar3 != null) {
                            linearLayout3 = kVar.f61754k;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("dateView");
                                throw th3;
                            }
                            linearLayout3.setClickable(false);
                            textView5 = kVar.f61755l;
                            if (textView5 == null) {
                                p005kotlin.jvm.internal.s.m("dateViewTitle");
                                throw th3;
                            }
                            textView5.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                            textView6 = kVar.f61756m;
                            if (textView6 == null) {
                                p005kotlin.jvm.internal.s.m("dateViewValue");
                                throw th3;
                            }
                            textView6.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                        }
                    } else {
                        linearLayout = kVar.f61749f;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("eventTypeView");
                            throw th3;
                        }
                        linearLayout.setClickable(false);
                        textView = kVar.f61750g;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("eventTypeTitle");
                            throw th3;
                        }
                        textView.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                        textView2 = kVar.f61751h;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("eventTypeValue");
                            throw th3;
                        }
                        textView2.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                        linearLayout2 = kVar.f61757n;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("eventDuration");
                            throw th3;
                        }
                        linearLayout2.setClickable(false);
                        textView3 = kVar.f61758o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("eventDurationTitle");
                            throw th3;
                        }
                        textView3.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                        textView4 = kVar.f61759p;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("eventDurationValue");
                            throw th3;
                        }
                        textView4.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                        if (xVar3 != null) {
                            linearLayout3 = kVar.f61754k;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("dateView");
                                throw th3;
                            }
                            linearLayout3.setClickable(false);
                            textView5 = kVar.f61755l;
                            if (textView5 == null) {
                                p005kotlin.jvm.internal.s.m("dateViewTitle");
                                throw th3;
                            }
                            textView5.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_7));
                            textView6 = kVar.f61756m;
                            if (textView6 == null) {
                                p005kotlin.jvm.internal.s.m("dateViewValue");
                                throw th3;
                            }
                            textView6.setTextColor(a7.b.getColor(kVar.requireContext(), R.color.gray_40_static_opacity_5));
                        }
                    }
                } else {
                    dz1.k.a aVar3 = dz1.k.f61743y;
                }
                return Unit.INSTANCE;
            case 2:
                dz1.m mVar = (dz1.m) obj2;
                my1.d dVar4 = (my1.d) obj;
                dz1.m.a aVar4 = dz1.m.f61773f;
                if (dVar4 != null) {
                    mVar.u6(dVar4.f121488e);
                }
                return Unit.INSTANCE;
            case 3:
                return z.d((e2.s) obj2, ((Integer) obj).intValue());
            case 4:
                i0 i0Var = (i0) obj2;
                i0.c cVar6 = i0Var.f62450q;
                e2.d0 d0Var = i0Var.f62434a;
                boolean z17 = i0Var.f62443j;
                float fFloatValue = ((Float) obj).floatValue();
                i0.a aVar5 = i0.f62432x;
                float f14 = -fFloatValue;
                if ((f14 >= 0.0f || i0Var.c()) && (f14 <= 0.0f || i0Var.e())) {
                    if (Math.abs(i0Var.f62441h) > 0.5f) {
                        b2.e.c("entered drag with non-zero pending scroll");
                    }
                    i0Var.f62437d = true;
                    float f15 = i0Var.f62441h + f14;
                    i0Var.f62441h = f15;
                    if (Math.abs(f15) > 0.5f) {
                        float f16 = i0Var.f62441h;
                        int iRound = Math.round(f16);
                        x xVarJ = ((x) i0Var.f62439f.getF182175a()).j(iRound, !i0Var.f62435b);
                        if (xVarJ == null || (xVar = i0Var.f62436c) == null) {
                            xVar2 = xVarJ;
                        } else {
                            x xVarJ2 = xVar.j(iRound, true);
                            if (xVarJ2 != null) {
                                i0Var.f62436c = xVarJ2;
                                xVar2 = xVarJ;
                            }
                        }
                        if (xVar2 != null) {
                            i0Var.g(xVar2, i0Var.f62435b, true);
                            i0Var.f62455v.setValue(Unit.INSTANCE);
                            float f17 = f16 - i0Var.f62441h;
                            if (z17) {
                                d0Var.e(cVar6, f17, xVar2);
                            }
                        } else {
                            z1 z1Var = i0Var.f62444k;
                            if (z1Var != null) {
                                z1Var.l();
                            }
                            float f18 = f16 - i0Var.f62441h;
                            v vVarJ = i0Var.j();
                            if (z17) {
                                d0Var.e(cVar6, f18, vVarJ);
                            }
                        }
                    }
                    if (Math.abs(i0Var.f62441h) > 0.5f) {
                        f14 -= i0Var.f62441h;
                        i0Var.f62441h = 0.0f;
                    }
                } else {
                    f14 = 0.0f;
                }
                return Float.valueOf(-f14);
            case 5:
                e40.a aVar6 = (e40.a) obj2;
                t1 t1Var = (t1) obj;
                e40.a.C1320a c1320a = e40.a.f62830l;
                t1Var.getClass();
                if (s3.b() && p005kotlin.jvm.internal.s.g(t1Var.f149891a, "0")) {
                    Context contextRequireContext14 = aVar6.requireContext();
                    contextRequireContext14.getClass();
                    s20.f.a(contextRequireContext14);
                } else if (!t1Var.f149897g) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 6:
                for (e63.t.a aVar7 : ((e63.t) obj2).f63270c) {
                    aVar7.f63272a.c(obj, aVar7.f63273b);
                }
                return Unit.INSTANCE;
            case 7:
                PregnancySettingActivity pregnancySettingActivity = (PregnancySettingActivity) obj2;
                fw.m mVar2 = (fw.m) obj;
                int i18 = PregnancySettingActivity.f40435a;
                int i19 = PregnancySettingActivity.a.f40436a[mVar2.f73769b.ordinal()];
                if (i19 == 1) {
                    pregnancySettingActivity.showProgressOverlay();
                } else if (i19 == 2) {
                    pregnancySettingActivity.hideProgressOverlay();
                    Toast.makeText(pregnancySettingActivity, "Success", 0).show();
                } else {
                    if (i19 != 3) {
                        u0.r();
                        return null;
                    }
                    pregnancySettingActivity.hideProgressOverlay();
                    g22.a.a(pregnancySettingActivity, mVar2.f73771d);
                }
                return Unit.INSTANCE;
            case 8:
                SegmentLeaderboardActivity segmentLeaderboardActivity = (SegmentLeaderboardActivity) obj2;
                g3 g3Var2 = (g3) obj;
                SegmentLeaderboardActivity.a aVar8 = SegmentLeaderboardActivity.f41454p;
                g3Var2.getClass();
                fw.p pVar = g3Var2.f35300a;
                SegmentLeaderboardDTO segmentLeaderboardDTO = (SegmentLeaderboardDTO) g3Var2.f35301b;
                int i24 = SegmentLeaderboardActivity.b.f41473a[pVar.ordinal()];
                if (i24 == 1) {
                    segmentLeaderboardActivity.showProgressOverlay();
                } else if (i24 == 2) {
                    segmentLeaderboardActivity.f41467m = true;
                    if (segmentLeaderboardDTO != null) {
                        SegmentLeaderboardDTO segmentLeaderboardDTO2 = segmentLeaderboardActivity.f41464j;
                        if (segmentLeaderboardDTO2 == null || segmentLeaderboardDTO2.f41223d == null || segmentLeaderboardActivity.f41466l) {
                            segmentLeaderboardActivity.f41464j = segmentLeaderboardDTO;
                        } else {
                            SegmentLeaderboardDTO segmentLeaderboardDTO3 = segmentLeaderboardActivity.f41464j;
                            segmentLeaderboardDTO3.getClass();
                            List<SegmentLeaderboardRowDTO> list3 = segmentLeaderboardDTO3.f41223d;
                            list3.getClass();
                            ArrayList arrayList = new ArrayList(list3);
                            List<SegmentLeaderboardRowDTO> list4 = segmentLeaderboardDTO.f41223d;
                            if (list4 != null) {
                                arrayList.addAll(list4);
                                SegmentLeaderboardDTO segmentLeaderboardDTO4 = segmentLeaderboardActivity.f41464j;
                                segmentLeaderboardDTO4.getClass();
                                segmentLeaderboardDTO4.f41223d = arrayList;
                            }
                        }
                        if (segmentLeaderboardActivity.f41466l) {
                            com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b bVar2 = segmentLeaderboardActivity.f41460f;
                            if (bVar2 != null && bVar2.isAdded()) {
                                com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b bVar3 = segmentLeaderboardActivity.f41460f;
                                bVar3.getClass();
                                TextView textView18 = bVar3.f41505k;
                                if (textView18 != null) {
                                    textView18.setVisibility(8);
                                }
                                GCMNestedScrollView gCMNestedScrollView = bVar3.f41504j;
                                if (gCMNestedScrollView != null) {
                                    gCMNestedScrollView.removeAllViews();
                                }
                                GCMNestedScrollView gCMNestedScrollView2 = bVar3.f41504j;
                                if (gCMNestedScrollView2 != null) {
                                    gCMNestedScrollView2.setVisibility(8);
                                }
                            }
                            segmentLeaderboardActivity.f41469o = true;
                        }
                        List<SegmentLeaderboardRowDTO> list5 = segmentLeaderboardDTO.f41223d;
                        if (list5 == null || list5.isEmpty()) {
                            ViewGroup viewGroup2 = segmentLeaderboardActivity.f41462h;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(8);
                            }
                            segmentLeaderboardActivity.f41469o = false;
                        } else {
                            if (segmentLeaderboardActivity.getResources().getConfiguration().orientation == 1 && (viewGroup = segmentLeaderboardActivity.f41462h) != null) {
                                viewGroup.setVisibility(0);
                            }
                            int size = list5.size();
                            segmentLeaderboardActivity.f41468n += size;
                            if (size < 26) {
                                segmentLeaderboardActivity.f41469o = false;
                            }
                        }
                        if (!segmentLeaderboardActivity.isFinishing()) {
                            segmentLeaderboardActivity.ea(segmentLeaderboardActivity.f41464j, segmentLeaderboardActivity.f41467m);
                        }
                    } else if (!segmentLeaderboardActivity.isFinishing()) {
                        segmentLeaderboardActivity.displayFailedMessage();
                    }
                    segmentLeaderboardActivity.hideProgressOverlay();
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    segmentLeaderboardActivity.f41467m = true;
                    if (!segmentLeaderboardActivity.isFinishing()) {
                        segmentLeaderboardActivity.displayFailedMessage();
                    }
                    segmentLeaderboardActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            case 9:
                ei0.b bVar4 = (ei0.b) obj2;
                li0.d0 d0Var2 = (li0.d0) obj;
                d0Var2.getClass();
                LinkedHashSet linkedHashSet = bVar4.f64185d;
                String str5 = d0Var2.f112650c;
                if (h0.R(linkedHashSet, str5)) {
                    z16 = true;
                } else if (str5 != null) {
                    bVar4.f64185d.add(str5);
                }
                return Boolean.valueOf(z16);
            case 10:
                EcomMainActivity ecomMainActivity = (EcomMainActivity) obj2;
                com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a enumC1069a = (com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a) obj;
                int i25 = enumC1069a == null ? -1 : com.garmin.feature.garminpay.providers.gpay.ecom.a.C1055a.f51141a[enumC1069a.ordinal()];
                if (i25 == 1) {
                    EcomMainActivity.ca(ecomMainActivity);
                } else if (i25 == 2) {
                    EcomMainActivity.f51134l.debug("fitPay setup is failed");
                    EcomMainActivity.da(ecomMainActivity);
                } else if (i25 != 3) {
                    EcomMainActivity.da(ecomMainActivity);
                } else {
                    EcomMainActivity.a aVar9 = EcomMainActivity.f51133k;
                    ecomMainActivity.getClass();
                    EcomMainActivity.f51134l.debug("showMaintenanceAlertDialog");
                    androidx.appcompat.app.e eVarF = br2.c.f19585a.f(ecomMainActivity, new eo2.a(ecomMainActivity, i15), new eo2.a(ecomMainActivity, i16));
                    if (eVarF != null) {
                        eVarF.show();
                    }
                }
                return Unit.INSTANCE;
            case 11:
                Double d16 = (Double) obj;
                ((ep0.b) obj2).getClass();
                if ((d16 != null ? d16.doubleValue() : 0.0d) > 0.0d) {
                    return d16;
                }
                return null;
            case 12:
                Window window = (Window) obj2;
                ((p3.i0) obj).getClass();
                if (window != null) {
                    window.setSoftInputMode(32);
                }
                return new v1(window);
            case 13:
                ew1.g gVar2 = (ew1.g) obj2;
                hv1.a aVar10 = (hv1.a) obj;
                ew1.g.a aVar11 = ew1.g.f66460d;
                aVar10.getClass();
                if (aVar10 == hv1.a.ADD_COURSE_PROFILE) {
                    gVar2.w6().s6().j("FBTElevationProfileFragment");
                } else {
                    gVar2.w6().s6().j("FBTSelectCourseFragment");
                }
                return Unit.INSTANCE;
            case 14:
                ew1.n nVar = (ew1.n) obj2;
                double dIntValue = ((Integer) obj).intValue();
                nVar.f66607t = dIntValue;
                if (dIntValue > 0.0d) {
                    GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66592d;
                    if (gCMComplexTwoLineButton4 == null) {
                        p005kotlin.jvm.internal.s.m("goalTimeView");
                        throw null;
                    }
                    gCMComplexTwoLineButton4.setRightIcon(null);
                    nVar.G6((long) nVar.f66607t);
                    nVar.F6(true);
                    AppCompatButton appCompatButton = nVar.f66602n;
                    if (appCompatButton == null) {
                        p005kotlin.jvm.internal.s.m("nextButton");
                        throw null;
                    }
                    if (!nVar.y6().O6() || (nVar.f66607t > 0.0d && nVar.f66606r > 0.0d)) {
                        z15 = true;
                    }
                    appCompatButton.setEnabled(z15);
                } else {
                    AppCompatButton appCompatButton2 = nVar.f66602n;
                    if (appCompatButton2 == null) {
                        p005kotlin.jvm.internal.s.m("nextButton");
                        throw null;
                    }
                    appCompatButton2.setEnabled(false);
                }
                return Unit.INSTANCE;
            case 15:
                hv1.e eVar = (hv1.e) obj;
                w0.a aVar12 = w0.f66806d;
                eVar.getClass();
                ((w0) obj2).w6().C6(eVar);
                return Unit.INSTANCE;
            case 16:
                y0 y0Var = (y0) obj2;
                jv1.x xVar4 = (jv1.x) obj;
                y0.a aVar13 = y0.f66855c;
                xVar4.getClass();
                int i26 = y0.b.f66858a[xVar4.ordinal()];
                if (i26 == 1) {
                    fy1.c.f73884a.getClass();
                    fy1.c.b("GarminCoachNonDSWRaceSelected");
                    y0Var.u6().B7(jv1.x.RACE);
                    y0Var.u6().C7(vt1.e.TRAIN_FOR_A_RACE);
                    y0Var.u6().g6("navigate_to_event_search");
                } else {
                    if (i26 != 2) {
                        u0.r();
                        return null;
                    }
                    fy1.c.f73884a.getClass();
                    fy1.c.b("GarminCoachNonDSWMilestoneSelected");
                    y0Var.u6().B7(jv1.x.ACHIEVE_A_MILESTONE);
                    y0Var.u6().C7(vt1.e.ACHIEVE_A_MILESTONE);
                    y0Var.u6().s6().j("FBTNameYourPlanFragCompose");
                }
                return Unit.INSTANCE;
            case 17:
                a1 a1Var = (a1) obj2;
                tw1.d dVar5 = (tw1.d) obj;
                a1.a aVar14 = a1.f66302e;
                dVar5.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachHoursPerWeekSelected");
                a1Var.z6().D6(dVar5);
                if (a1Var.z6().f13385r1 && (activity = a1Var.getActivity()) != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            case 18:
                c1 c1Var = (c1) obj2;
                vt1.j jVar = (vt1.j) obj;
                c1.a aVar15 = c1.f66352d;
                jVar.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachWorkoutTargetSelected");
                aw1.h hVarY6 = c1Var.y6();
                s sVarI6 = hVarY6.i6();
                hVarY6.k8(sVarI6 != null ? s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, 511) : null);
                if (!hVarY6.f13385r1) {
                    s sVarI7 = hVarY6.i6();
                    if (sVarI7 != null && (cVar2 = sVarI7.f101131j) != null) {
                        listI = cVar2.i();
                    }
                    if ((listI != null ? listI.size() : 0) > 1) {
                        hVarY6.s6().j("FBTItpHoursPerWeekSelectionFragmentCompose");
                    } else if (listI != null && (dVar = (tw1.d) h0.d0(listI)) != null) {
                        fy1.c.b("GarminCoachHoursPerWeekSelected");
                        hVarY6.D6(dVar);
                    }
                }
                if (c1Var.y6().f13385r1 && (activity2 = c1Var.getActivity()) != null && (onBackPressedDispatcher2 = activity2.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher2.d();
                }
                return Unit.INSTANCE;
            case 19:
                k0 k0Var = (k0) obj;
                q1.a aVar16 = q1.f66677f;
                k0Var.getClass();
                p5.h0.n(k0Var, String.valueOf(((jv1.t) obj2).f101150c));
                return Unit.INSTANCE;
            case 20:
                w1 w1Var = (w1) obj2;
                hv1.f fVar4 = (hv1.f) obj;
                w1.a aVar17 = w1.f66814e;
                fVar4.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachTrainingHistorySelected");
                w1Var.y6().L7(fVar4);
                aw1.h hVarY7 = w1Var.y6();
                if (hVarY7.S6()) {
                    jv1.h hVarE5 = hVarY7.E5();
                    jv1.g gVar3 = hVarE5 instanceof jv1.g ? (jv1.g) hVarE5 : null;
                    s sVarI8 = hVarY7.i6();
                    if (sVarI8 == null || (fVar = sVarI8.C) == null) {
                        fVar = hv1.f.ZERO_FOUR;
                    }
                    if (gVar3 != null) {
                        og0.a aVar18 = og0.a.f131967a;
                        Double d17 = gVar3.f101057a;
                        dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                        gg0.i iVar = gVar3.f101058b;
                        if (iVar == null) {
                            iVar = gg0.i.METER;
                        }
                        aVar18.getClass();
                        dDoubleValue = og0.a.g(dDoubleValue, iVar);
                    }
                    LocalDate localDateG5 = hVarY7.G5();
                    tu1.i.f166483a.getClass();
                    Integer numF = tu1.i.a.f(dDoubleValue, fVar);
                    if (localDateG5 == null || numF == null) {
                        numValueOf = null;
                    } else {
                        int iIntValue = numF.intValue();
                        int weeks = Weeks.weeksBetween(LocalDate.now(), localDateG5).getWeeks();
                        if (iIntValue > weeks) {
                            numValueOf = Integer.valueOf(weeks);
                        } else {
                            numValueOf = null;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    s sVarI9 = hVarY7.i6();
                    if ((sVarI9 != null ? sVarI9.C : null) != null) {
                        hVarY7.s7();
                        jv1.e eVar2 = new jv1.e(true, null, null, null, null, null, false, false, numValueOf, hVarY7.t5(((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b(), true), 254, null);
                        s sVarI10 = hVarY7.i6();
                        hVarY7.k8(sVarI10 != null ? s.a(sVarI10, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                        androidx.lifecycle.y0<g3<jv1.e>> y0VarM6 = hVarY7.m6();
                        g3.f35298f.getClass();
                        y0VarM6.j(g3.a.d(eVar2));
                    } else if (hVarY7.Q6()) {
                        hVarY7.i7();
                    } else {
                        hVarY7.s6().j("FBTSelectDistanceOrTimeFragmentCompose");
                    }
                } else if (hVarY7.Q6()) {
                    hVarY7.i7();
                } else {
                    hVarY7.s6().j("FBTSelectDistanceOrTimeFragmentCompose");
                }
                return Unit.INSTANCE;
            case 21:
                z20.e eVar3 = (z20.e) obj;
                d2.a aVar19 = d2.f66384d;
                eVar3.getClass();
                aw1.h hVarW6 = ((d2) obj2).w6();
                s sVarI11 = hVarW6.i6();
                hVarW6.k8(sVarI11 != null ? s.a(sVarI11, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar3, null, -1, 271) : null);
                hVarW6.k7();
                return Unit.INSTANCE;
            case 22:
                vt1.e eVar4 = (vt1.e) obj;
                j2.a aVar20 = j2.f66533d;
                eVar4.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.c(eVar4);
                aw1.h hVar = (aw1.h) ((j2) obj2).f66534b.getValue();
                hVar.C7(eVar4);
                int i27 = aw1.h.b.f13395b[eVar4.ordinal()];
                if (i27 == 1) {
                    if (hVar.b7()) {
                        str2 = "FBTRunningWeeklyAvgDistancePaceFragCompose";
                    } else if (hVar.O6()) {
                        str2 = "FBTSelectSportFragmentCompose";
                    } else if (hVar.e7()) {
                        str2 = "FBTTriathlonTrainingHistoryFragCompose";
                    }
                    hVar.g6(str2);
                } else if (i27 != 2) {
                    if (i27 != 3) {
                        u0.r();
                        return null;
                    }
                    hVar.h7();
                } else if (hVar.O6()) {
                    hVar.s6().j("FBTSelectSportFragmentCompose");
                } else if (hVar.e7()) {
                    hVar.s6().j("FBTTriathlonTrainingHistoryFragCompose");
                } else if (hVar.b7()) {
                    hVar.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                }
                return Unit.INSTANCE;
            case 23:
                o2 o2Var = (o2) obj2;
                vt1.h hVar2 = (vt1.h) obj;
                o2.a aVar21 = o2.f66641d;
                hVar2.getClass();
                if (o2Var.w6().f13385r1) {
                    o2Var.w6().G7("FBTSelectStrengthWorkoutTypeFragment", new c2(i16, o2Var, hVar2));
                } else {
                    o2Var.w6().G6(hVar2);
                    if (o2Var.w6().f13385r1) {
                        o2Var.getParentFragmentManager().a0(0, "FBTReviewInformationFragCompose");
                    }
                }
                return Unit.INSTANCE;
            case 24:
                q2 q2Var = (q2) obj2;
                hv1.i iVar2 = (hv1.i) obj;
                q2.a aVar22 = q2.f66691d;
                iVar2.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachSwimAbilitySelected");
                q2Var.w6().P7(iVar2);
                if (q2Var.w6().f13385r1) {
                    androidx.fragment.app.m activity3 = q2Var.getActivity();
                    if (activity3 != null && (onBackPressedDispatcher3 = activity3.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher3.d();
                    }
                } else {
                    aw1.h hVarW7 = q2Var.w6();
                    if (hVarW7.f13383p1 && !hVarW7.T5().isEmpty() && hVarW7.V6()) {
                        hVarW7.l7();
                    } else {
                        hVarW7.q5();
                    }
                }
                return Unit.INSTANCE;
            case 25:
                return a(obj);
            case 26:
                return b(obj);
            case 27:
                return c(obj);
            case 28:
                return d(obj);
            default:
                return Integer.valueOf(((n0) obj2).c(((Integer) obj).intValue()));
        }
    }
}
