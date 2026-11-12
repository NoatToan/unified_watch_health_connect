package bv2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import bi2.a0;
import bi2.b0;
import bi2.d0;
import bi2.e0;
import bi2.g0;
import bi2.h0;
import bi2.i0;
import bi2.j0;
import bi2.k0;
import bi2.m0;
import bi2.o0;
import bi2.p0;
import bi2.q;
import bi2.r;
import bi2.t;
import bi2.u;
import bi2.v;
import bi2.w;
import bi2.x;
import bi2.y;
import bi2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.LinkedHashMap;
import java.util.Map;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21471f;

    public /* synthetic */ c(Fragment fragment, ii2.b bVar, Map map, ei2.h hVar, String str) {
        this.f21466a = 2;
        this.f21469d = fragment;
        this.f21467b = bVar;
        this.f21468c = map;
        this.f21470e = hVar;
        this.f21471f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Unit unit;
        int i14 = this.f21466a;
        Object obj = this.f21468c;
        Object obj2 = this.f21467b;
        Object obj3 = this.f21471f;
        Object obj4 = this.f21470e;
        Object obj5 = this.f21469d;
        switch (i14) {
            case 0:
                Map map = (Map) obj;
                Fragment fragment = (Fragment) obj5;
                zw2.f fVar = (zw2.f) obj4;
                Object obj6 = (fw2.a) obj3;
                ((dx2.c) obj2).getClass();
                String strA4 = dx2.c.A4(map);
                if (!s.g(strA4, gw2.j.PREFERRED_ACTIVITY_TRACKER.f80000a)) {
                    if (s.g(strA4, gw2.j.HELP_AND_INFO.f80000a) || s.g(strA4, gw2.j.FEATURE_SETUP.f80000a) || s.g(strA4, gw2.j.AVAILABLE_ACCESSORIES.f80000a)) {
                        cx2.i.f56681a.getClass();
                        if (cx2.i.a.b(fragment)) {
                            ew2.g.f66907a.getClass();
                            ew2.g.a.c(strA4, map, fragment);
                            return;
                        }
                        return;
                    }
                    d.f21473b.d(null, "Do not know the custom view type " + map + ". cannot do any action.");
                    return;
                }
                cx2.i.f56681a.getClass();
                if (cx2.i.a.b(fragment)) {
                    if ((fVar instanceof zw2.h) && (obj6 instanceof m)) {
                        d.f21473b.getClass();
                        ((zw2.h) fVar).l(fragment, (ax2.a) obj6);
                        return;
                    }
                    d.f21473b.d(null, "Unknown transform " + fVar + " and view " + obj6 + " for preferred activity tracker ");
                    return;
                }
                return;
            case 1:
                ((ag1.a) obj2).j((SegmentDetailsActivity) obj, (String) obj5, (String) obj4, (String) obj3);
                return;
            case 2:
                Fragment fragment2 = (Fragment) obj5;
                ii2.b bVar = (ii2.b) obj2;
                Map<String, ? extends Object> map2 = (Map) obj;
                ei2.h hVar = (ei2.h) obj4;
                String str = (String) obj3;
                bVar.getClass();
                androidx.fragment.app.m activity = fragment2.getActivity();
                if (!(activity instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b)) {
                    activity = null;
                }
                com.garmin.androiddynamicsettings.app.presentationlayer.b bVar2 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) activity;
                if (bVar2 == null || !bVar2.S9()) {
                    if (bVar2 != null) {
                        return;
                    }
                    zh2.e.f204807a.getClass();
                    if (!((uc0.d) zh2.e.a()).i()) {
                        return;
                    }
                }
                String strD4 = bVar.D4(map2);
                if (strD4 != null) {
                    kh2.a.f104779b.a("setDoubleLabelClickListener: External " + strD4 + " clicked");
                    kh2.k.f104801a.getClass();
                    kh2.k.a.b(strD4, map2, bVar, fragment2);
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
                Map<String, Object> mapZ4 = bVar.z4(map2);
                if (mapZ4 != null) {
                    kh2.a.f104779b.a("setDoubleLabelClickListener: view with children clicked");
                    kh2.k.f104801a.getClass();
                    kh2.k.a.a(fragment2, bVar, map2, mapZ4);
                    Unit unit3 = Unit.INSTANCE;
                    return;
                }
                String strF4 = bVar.F4(map2);
                if (strF4 != null) {
                    kh2.a.f104779b.a("setDoubleLabelClickListener: Section " + strF4 + " clicked");
                    kh2.k.f104801a.getClass();
                    kh2.k.a.c(fragment2, strF4);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    kh2.a.f104779b.a("setDoubleLabelClickListener: View with transform type " + str + " was clicked");
                    if (s.g(str, mh2.h.BIRTH_DATE.f118578a)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(mh2.i.IS_REMOVABLE.f118617a, Boolean.FALSE);
                        kh2.k.f104801a.getClass();
                        kh2.k.a.b("birthdateCustomerSupport", linkedHashMap, bVar, fragment2);
                        Unit unit4 = Unit.INSTANCE;
                        return;
                    }
                    if (str != null) {
                        kh2.k.f104801a.getClass();
                        hi2.d dVar = kh2.k.f104802b;
                        dVar.a("handleTransformAction: for transform ".concat(str));
                        if (str.equals(mh2.h.CUSTOM_STRIDE_DISTANCE.f118578a)) {
                            Context contextRequireContext = fragment2.requireContext();
                            contextRequireContext.getClass();
                            new bi2.n(contextRequireContext, hVar, bVar, map2).l();
                        } else if (str.equals(mh2.h.CUSTOM_STRIDE_STEPS.f118578a)) {
                            Context contextRequireContext2 = fragment2.requireContext();
                            contextRequireContext2.getClass();
                            new bi2.o(contextRequireContext2, hVar, bVar, map2).l();
                        } else if (str.equals(mh2.h.DAILY_STEPS.f118578a)) {
                            Context contextRequireContext3 = fragment2.requireContext();
                            contextRequireContext3.getClass();
                            new h0(contextRequireContext3, hVar, bVar, map2).l();
                        } else if (str.equals(mh2.h.DATE_PICKER.f118578a)) {
                            Context contextRequireContext4 = fragment2.requireContext();
                            contextRequireContext4.getClass();
                            r rVar = new r(contextRequireContext4, hVar, bVar, map2);
                            ge1.b.T(f0.w((n0) rVar.f18249a), null, null, new q(rVar, null), 3);
                        } else if (str.equals(mh2.h.DEFAULT.f118578a)) {
                            Map<String, Object> mapZ5 = bVar.z4(map2);
                            if (mapZ5 != null) {
                                kh2.k.a.a(fragment2, bVar, map2, mapZ5);
                            }
                        } else if (str.equals(mh2.h.FLOORS_CLIMBED.f118578a)) {
                            Context contextRequireContext5 = fragment2.requireContext();
                            contextRequireContext5.getClass();
                            new bi2.s(contextRequireContext5, hVar, bVar, map2).l();
                        } else if (str.equals(mh2.h.TOTAL_STEPS.f118578a)) {
                            Context contextRequireContext6 = fragment2.requireContext();
                            contextRequireContext6.getClass();
                            new bi2.n0(contextRequireContext6, hVar, bVar, map2).l();
                        } else {
                            int i15 = 4;
                            if (str.equals(mh2.h.PICKER_LABEL.f118578a) ? true : str.equals(mh2.h.PICKER.f118578a)) {
                                Context contextRequireContext7 = fragment2.requireContext();
                                contextRequireContext7.getClass();
                                g0 g0Var = new g0(contextRequireContext7, hVar, bVar, map2);
                                g0Var.f18160e.getClass();
                                Context context = g0Var.f18156a;
                                View viewInflate = View.inflate(context, R.layout.dsl_single_number_picker, null);
                                viewInflate.getClass();
                                NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.single_number_picker_1);
                                StyledTextView styledTextView = (StyledTextView) viewInflate.findViewById(R.id.single_label_1);
                                numberPicker.getClass();
                                styledTextView.getClass();
                                ge1.b.T(f0.w((n0) context), null, null, new bi2.f0(g0Var, styledTextView, numberPicker, null), 3);
                                AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DSLBaseDialogStyle).setTitle(g0Var.f18157b.k(g0Var.f18158c, g0Var.f18159d)).setPositiveButton(context.getString(R.string.lbl_ok), new ag0.d(i15, g0Var, numberPicker)).setNegativeButton(context.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate).create();
                                kh2.g.a aVar = kh2.g.f104792a;
                                alertDialogCreate.getClass();
                                aVar.getClass();
                                kh2.g.a.c(alertDialogCreate, context);
                            } else if (str.equals(mh2.h.HEIGHT_PICKER.f118578a)) {
                                Context contextRequireContext8 = fragment2.requireContext();
                                contextRequireContext8.getClass();
                                v vVar = new v(contextRequireContext8, hVar, bVar, map2);
                                vVar.f18271e.getClass();
                                Context context2 = vVar.f18267a;
                                View viewInflate2 = View.inflate(context2, R.layout.dsl_double_number_picker, null);
                                viewInflate2.getClass();
                                NumberPicker numberPicker2 = (NumberPicker) viewInflate2.findViewById(R.id.double_number_picker_1);
                                StyledTextView styledTextView2 = (StyledTextView) viewInflate2.findViewById(R.id.double_label_1);
                                numberPicker2.getClass();
                                styledTextView2.getClass();
                                ge1.b.T(f0.w((n0) context2), null, null, new u(vVar, 1, numberPicker2, styledTextView2, null), 3);
                                NumberPicker numberPicker3 = (NumberPicker) viewInflate2.findViewById(R.id.double_number_picker_2);
                                StyledTextView styledTextView3 = (StyledTextView) viewInflate2.findViewById(R.id.double_label_2);
                                numberPicker3.getClass();
                                styledTextView3.getClass();
                                ge1.b.T(f0.w((n0) context2), null, null, new u(vVar, 2, numberPicker3, styledTextView3, null), 3);
                                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context2, R.style.DSLBaseDialogStyle).setTitle(vVar.f18268b.k(vVar.f18269c, vVar.f18270d)).setPositiveButton(context2.getString(R.string.lbl_ok), new bi2.k(vVar, 1, numberPicker2, numberPicker3)).setNegativeButton(context2.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate2).create();
                                kh2.g.a aVar2 = kh2.g.f104792a;
                                alertDialogCreate2.getClass();
                                aVar2.getClass();
                                kh2.g.a.c(alertDialogCreate2, context2);
                                if (numberPicker2.getValue() >= vVar.f18272f) {
                                    numberPicker3.setMaxValue(vVar.f18274h);
                                } else {
                                    numberPicker3.setMaxValue(vVar.f18273g);
                                }
                                numberPicker2.setOnValueChangedListener(new t(0, numberPicker2, numberPicker3, vVar));
                            } else if (str.equals(mh2.h.HYDRATION_DAILY_GOAL.f118578a)) {
                                Context contextRequireContext9 = fragment2.requireContext();
                                contextRequireContext9.getClass();
                                new y(contextRequireContext9, hVar, bVar, map2).l();
                            } else if (str.equals(mh2.h.INTENSITY_MINUTES.f118578a)) {
                                Context contextRequireContext10 = fragment2.requireContext();
                                contextRequireContext10.getClass();
                                new z(contextRequireContext10, hVar, bVar, map2).l();
                            } else {
                                if (str.equals(mh2.h.MODERATE_INTENSITY_ZONE.f118578a) ? true : str.equals(mh2.h.VIGOROUS_INTENSITY_ZONE.f118578a)) {
                                    Context contextRequireContext11 = fragment2.requireContext();
                                    contextRequireContext11.getClass();
                                    b0 b0Var = new b0(contextRequireContext11, hVar, bVar, map2);
                                    b0Var.f18114e.getClass();
                                    Context context3 = b0Var.f18110a;
                                    View viewInflate3 = View.inflate(context3, R.layout.dsl_single_number_picker, null);
                                    View viewFindViewById = viewInflate3.findViewById(R.id.single_label_1);
                                    viewFindViewById.getClass();
                                    ((StyledTextView) viewFindViewById).setVisibility(8);
                                    View viewFindViewById2 = viewInflate3.findViewById(R.id.single_number_picker_1);
                                    viewFindViewById2.getClass();
                                    b0Var.f18115f = (NumberPicker) viewFindViewById2;
                                    ge1.b.T(f0.w((n0) context3), null, null, new a0(b0Var, null), 3);
                                    AlertDialog alertDialogCreate3 = new AlertDialog.Builder(context3, R.style.DSLBaseDialogStyle).setTitle(b0Var.f18111b.k(b0Var.f18112c, b0Var.f18113d)).setView(viewInflate3).setPositiveButton(context3.getString(R.string.lbl_done), new ai1.a(b0Var, 2)).setCancelable(false).create();
                                    kh2.g.a aVar3 = kh2.g.f104792a;
                                    alertDialogCreate3.getClass();
                                    aVar3.getClass();
                                    kh2.g.a.c(alertDialogCreate3, context3);
                                } else if (str.equals(mh2.h.WEIGHT_PICKER.f118578a)) {
                                    Context contextRequireContext12 = fragment2.requireContext();
                                    contextRequireContext12.getClass();
                                    p0 p0Var = new p0(contextRequireContext12, hVar, bVar, map2);
                                    p0Var.f18246e.getClass();
                                    Context context4 = p0Var.f18242a;
                                    View viewInflate4 = View.inflate(context4, R.layout.dsl_double_number_picker, null);
                                    viewInflate4.getClass();
                                    NumberPicker numberPicker4 = (NumberPicker) viewInflate4.findViewById(R.id.double_number_picker_1);
                                    StyledTextView styledTextView4 = (StyledTextView) viewInflate4.findViewById(R.id.double_label_1);
                                    numberPicker4.getClass();
                                    styledTextView4.getClass();
                                    ge1.b.T(f0.w((n0) context4), null, null, new o0(p0Var, 1, numberPicker4, styledTextView4, null), 3);
                                    NumberPicker numberPicker5 = (NumberPicker) viewInflate4.findViewById(R.id.double_number_picker_2);
                                    StyledTextView styledTextView5 = (StyledTextView) viewInflate4.findViewById(R.id.double_label_2);
                                    numberPicker5.getClass();
                                    styledTextView5.getClass();
                                    ge1.b.T(f0.w((n0) context4), null, null, new o0(p0Var, 2, numberPicker5, styledTextView5, null), 3);
                                    AlertDialog alertDialogCreate4 = new AlertDialog.Builder(context4, R.style.DSLBaseDialogStyle).setTitle(p0Var.f18243b.k(p0Var.f18244c, p0Var.f18245d)).setPositiveButton(context4.getString(R.string.lbl_ok), new bi2.k(p0Var, 3, numberPicker4, numberPicker5)).setView(viewInflate4).setNegativeButton(context4.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).create();
                                    kh2.g.a aVar4 = kh2.g.f104792a;
                                    alertDialogCreate4.getClass();
                                    aVar4.getClass();
                                    kh2.g.a.c(alertDialogCreate4, context4);
                                } else {
                                    boolean zEquals = true;
                                    if (str.equals(mh2.h.SLEEP_BED_TIME_PICKER.f118578a) ? true : str.equals(mh2.h.SLEEP_WAKE_TIME_PICKER.f118578a) ? true : str.equals(mh2.h.TIME_PICKER.f118578a)) {
                                        Context contextRequireContext13 = fragment2.requireContext();
                                        contextRequireContext13.getClass();
                                        k0 k0Var = new k0(contextRequireContext13, hVar, bVar, map2);
                                        Context context5 = k0Var.f18186a;
                                        View viewInflate5 = View.inflate(context5, R.layout.dsl_time_selection_dialog, null);
                                        viewInflate5.getClass();
                                        View viewFindViewById3 = viewInflate5.findViewById(R.id.hours_picker);
                                        viewFindViewById3.getClass();
                                        k0Var.f18191f = viewFindViewById3;
                                        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.single_number_picker_1);
                                        viewFindViewById4.getClass();
                                        k0Var.f18192g = (NumberPicker) viewFindViewById4;
                                        View viewFindViewById5 = viewInflate5.findViewById(R.id.minutes_picker);
                                        viewFindViewById5.getClass();
                                        k0Var.f18193h = viewFindViewById5;
                                        View viewFindViewById6 = viewFindViewById5.findViewById(R.id.single_number_picker_1);
                                        viewFindViewById6.getClass();
                                        k0Var.f18194i = (NumberPicker) viewFindViewById6;
                                        View viewFindViewById7 = viewInflate5.findViewById(R.id.meridies_picker);
                                        viewFindViewById7.getClass();
                                        k0Var.f18195j = viewFindViewById7;
                                        View viewFindViewById8 = viewFindViewById7.findViewById(R.id.single_number_picker_1);
                                        viewFindViewById8.getClass();
                                        k0Var.f18196k = (NumberPicker) viewFindViewById8;
                                        NumberPicker numberPicker6 = k0Var.f18192g;
                                        if (numberPicker6 == null) {
                                            s.m("hoursPicker");
                                            throw null;
                                        }
                                        ge1.b.T(f0.w((n0) context5), null, null, new j0(k0Var, 1, numberPicker6, null), 3);
                                        NumberPicker numberPicker7 = k0Var.f18194i;
                                        if (numberPicker7 == null) {
                                            s.m("minutesPicker");
                                            throw null;
                                        }
                                        ge1.b.T(f0.w((n0) context5), null, null, new j0(k0Var, 2, numberPicker7, null), 3);
                                        NumberPicker numberPicker8 = k0Var.f18196k;
                                        if (numberPicker8 == null) {
                                            s.m("meridiesPicker");
                                            throw null;
                                        }
                                        ge1.b.T(f0.w((n0) context5), null, null, new i0(k0Var, numberPicker8, null), 3);
                                        AlertDialog alertDialogCreate5 = new AlertDialog.Builder(context5, R.style.DSLBaseDialogStyle).setTitle(k0Var.f18187b.k(k0Var.f18188c, k0Var.f18189d)).setPositiveButton(context5.getString(R.string.lbl_ok), new ai1.a(k0Var, 3)).setNegativeButton(context5.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate5).create();
                                        kh2.g.a aVar5 = kh2.g.f104792a;
                                        alertDialogCreate5.getClass();
                                        aVar5.getClass();
                                        kh2.g.a.c(alertDialogCreate5, context5);
                                    } else if (str.equals(mh2.h.TOTAL_BOTTOM_TIME.f118578a)) {
                                        Context contextRequireContext14 = fragment2.requireContext();
                                        contextRequireContext14.getClass();
                                        m0 m0Var = new m0(contextRequireContext14, hVar, bVar, map2);
                                        Context context6 = m0Var.f18213a;
                                        View viewInflate6 = View.inflate(context6, R.layout.dsl_total_bottom_time_dialog, null);
                                        viewInflate6.getClass();
                                        View viewFindViewById9 = viewInflate6.findViewById(R.id.hours_picker);
                                        viewFindViewById9.getClass();
                                        m0Var.f18218f = viewFindViewById9;
                                        View viewFindViewById10 = viewFindViewById9.findViewById(R.id.single_number_picker_1);
                                        viewFindViewById10.getClass();
                                        m0Var.f18219g = (NumberPicker) viewFindViewById10;
                                        View view3 = m0Var.f18218f;
                                        if (view3 == null) {
                                            s.m("hoursView");
                                            throw null;
                                        }
                                        View viewFindViewById11 = view3.findViewById(R.id.single_label_1);
                                        viewFindViewById11.getClass();
                                        m0Var.f18220h = (StyledTextView) viewFindViewById11;
                                        View viewFindViewById12 = viewInflate6.findViewById(R.id.minutes_picker);
                                        viewFindViewById12.getClass();
                                        m0Var.f18221i = viewFindViewById12;
                                        View viewFindViewById13 = viewFindViewById12.findViewById(R.id.single_number_picker_1);
                                        viewFindViewById13.getClass();
                                        m0Var.f18222j = (NumberPicker) viewFindViewById13;
                                        View view4 = m0Var.f18221i;
                                        if (view4 == null) {
                                            s.m("minutesView");
                                            throw null;
                                        }
                                        View viewFindViewById14 = view4.findViewById(R.id.single_label_1);
                                        viewFindViewById14.getClass();
                                        m0Var.f18223k = (StyledTextView) viewFindViewById14;
                                        View viewFindViewById15 = viewInflate6.findViewById(R.id.seconds_picker);
                                        viewFindViewById15.getClass();
                                        m0Var.f18224l = viewFindViewById15;
                                        View viewFindViewById16 = viewFindViewById15.findViewById(R.id.single_number_picker_1);
                                        viewFindViewById16.getClass();
                                        m0Var.f18225m = (NumberPicker) viewFindViewById16;
                                        View view5 = m0Var.f18224l;
                                        if (view5 == null) {
                                            s.m("secondsView");
                                            throw null;
                                        }
                                        View viewFindViewById17 = view5.findViewById(R.id.single_label_1);
                                        viewFindViewById17.getClass();
                                        m0Var.f18226n = (StyledTextView) viewFindViewById17;
                                        NumberPicker numberPicker9 = m0Var.f18219g;
                                        if (numberPicker9 == null) {
                                            s.m("hoursPicker");
                                            throw null;
                                        }
                                        StyledTextView styledTextView6 = m0Var.f18220h;
                                        if (styledTextView6 == null) {
                                            s.m("hoursTextView");
                                            throw null;
                                        }
                                        m0Var.a(1, numberPicker9, styledTextView6);
                                        NumberPicker numberPicker10 = m0Var.f18222j;
                                        if (numberPicker10 == null) {
                                            s.m("minutesPicker");
                                            throw null;
                                        }
                                        StyledTextView styledTextView7 = m0Var.f18223k;
                                        if (styledTextView7 == null) {
                                            s.m("minutesTextView");
                                            throw null;
                                        }
                                        m0Var.a(2, numberPicker10, styledTextView7);
                                        NumberPicker numberPicker11 = m0Var.f18225m;
                                        if (numberPicker11 == null) {
                                            s.m("secondsPicker");
                                            throw null;
                                        }
                                        StyledTextView styledTextView8 = m0Var.f18226n;
                                        if (styledTextView8 == null) {
                                            s.m("secondsTextView");
                                            throw null;
                                        }
                                        m0Var.a(3, numberPicker11, styledTextView8);
                                        AlertDialog alertDialogCreate6 = new AlertDialog.Builder(context6, R.style.DSLBaseDialogStyle).setTitle(m0Var.f18214b.k(m0Var.f18215c, m0Var.f18216d)).setPositiveButton(context6.getString(R.string.lbl_ok), new ai1.a(m0Var, 4)).setNegativeButton(context6.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate6).create();
                                        kh2.g.a aVar6 = kh2.g.f104792a;
                                        alertDialogCreate6.getClass();
                                        aVar6.getClass();
                                        kh2.g.a.c(alertDialogCreate6, context6);
                                    } else {
                                        if (!str.equals(mh2.h.PERIOD_DURATION.f118578a)) {
                                            zEquals = str.equals(mh2.h.PERIOD_CYCLE_LENGTH.f118578a);
                                        }
                                        if (zEquals) {
                                            Context contextRequireContext15 = fragment2.requireContext();
                                            contextRequireContext15.getClass();
                                            e0 e0Var = new e0(contextRequireContext15, hVar, bVar, map2);
                                            e0Var.f18135e.getClass();
                                            Context context7 = e0Var.f18131a;
                                            View viewInflate7 = View.inflate(context7, R.layout.dsl_single_number_picker, null);
                                            viewInflate7.getClass();
                                            NumberPicker numberPicker12 = (NumberPicker) viewInflate7.findViewById(R.id.single_number_picker_1);
                                            StyledTextView styledTextView9 = (StyledTextView) viewInflate7.findViewById(R.id.single_label_1);
                                            numberPicker12.getClass();
                                            styledTextView9.getClass();
                                            ge1.b.T(f0.w((n0) context7), null, null, new d0(e0Var, numberPicker12, styledTextView9, null), 3);
                                            AlertDialog alertDialogCreate7 = new AlertDialog.Builder(context7, R.style.DSLBaseDialogStyle).setTitle(e0Var.f18132b.k(e0Var.f18133c, e0Var.f18134d)).setPositiveButton(context7.getString(R.string.lbl_ok), new ag0.d(3, e0Var, numberPicker12)).setNegativeButton(context7.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate7).create();
                                            kh2.g.a aVar7 = kh2.g.f104792a;
                                            alertDialogCreate7.getClass();
                                            aVar7.getClass();
                                            kh2.g.a.c(alertDialogCreate7, context7);
                                        } else if (str.equals(mh2.h.HYDRATION_CONTAINER.f118578a)) {
                                            Context contextRequireContext16 = fragment2.requireContext();
                                            contextRequireContext16.getClass();
                                            x xVar = new x(contextRequireContext16, hVar, bVar, map2);
                                            xVar.f18283e.getClass();
                                            Context context8 = xVar.f18279a;
                                            View viewInflate8 = View.inflate(context8, R.layout.dsl_hydration_containers, null);
                                            viewInflate8.getClass();
                                            EditText editText = (EditText) viewInflate8.findViewById(R.id.hydration_input_field);
                                            NumberPicker numberPicker13 = (NumberPicker) viewInflate8.findViewById(R.id.hydration_number_picker_1);
                                            numberPicker13.getClass();
                                            editText.getClass();
                                            ge1.b.T(f0.w((n0) context8), null, null, new w(xVar, numberPicker13, editText, null), 3);
                                            AlertDialog alertDialogCreate8 = new AlertDialog.Builder(context8, R.style.DSLBaseDialogStyle).setTitle(xVar.f18280b.k(xVar.f18281c, xVar.f18282d)).setPositiveButton(context8.getString(R.string.lbl_ok), new bi2.k(xVar, editText, numberPicker13)).setNegativeButton(context8.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate8).create();
                                            kh2.g.a aVar8 = kh2.g.f104792a;
                                            alertDialogCreate8.getClass();
                                            aVar8.getClass();
                                            kh2.g.a.c(alertDialogCreate8, context8);
                                        } else if (str.equals(mh2.h.CRITICAL_SWIM_SPEED_PICKER.f118578a)) {
                                            Context contextRequireContext17 = fragment2.requireContext();
                                            contextRequireContext17.getClass();
                                            bi2.m mVar = new bi2.m(contextRequireContext17, hVar, bVar, map2);
                                            ge1.b.T(f0.w((n0) mVar.f18208a), null, null, new bi2.l(mVar, null), 3);
                                        } else {
                                            dVar.b("setDoubleLabelClickListener: unknown transform type ".concat(str));
                                        }
                                    }
                                }
                            }
                        }
                        Unit unit5 = Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                return;
            default:
                Fragment fragment3 = (Fragment) obj5;
                cx2.h hVar2 = zv2.a.f207178c;
                ew2.d.a aVar9 = ew2.d.f66899a;
                ck0.j jVar = new ck0.j(view2, (zw2.a) obj4, fragment3, (zv2.d) obj3, (dx2.c) obj2, (Map) obj, 19);
                aVar9.getClass();
                ew2.d.a.a(jVar, fragment3);
                return;
        }
    }

    public /* synthetic */ c(Fragment fragment, zw2.a aVar, zv2.d dVar, dx2.c cVar, Map map) {
        this.f21466a = 3;
        this.f21469d = fragment;
        this.f21470e = aVar;
        this.f21471f = dVar;
        this.f21467b = cVar;
        this.f21468c = map;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f21466a = i14;
        this.f21467b = obj;
        this.f21468c = obj2;
        this.f21469d = obj3;
        this.f21470e = obj4;
        this.f21471f = obj5;
    }
}
