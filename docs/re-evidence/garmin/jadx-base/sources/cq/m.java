package cq;

import a42.d0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.e1;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.RenderMode;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.RangeCalendar;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import e2.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.k0;
import o4.z1;
import o72.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s0;
import p006l2.l1;
import p13.j0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x3;
import ps.x1;
import s1.t0;
import s1.t1;
import w52.b0;
import w52.l0;
import w52.v0;
import w52.y;
import w52.y1;
import z2.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55072f;

    public /* synthetic */ m(m0 m0Var, m0 m0Var2, qc.h hVar, boolean z14, p13.k kVar) {
        this.f55067a = 6;
        this.f55069c = m0Var;
        this.f55070d = m0Var2;
        this.f55071e = hVar;
        this.f55068b = z14;
        this.f55072f = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x025f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0292  */
    /* JADX WARN: Code duplicated, block: B:73:0x02d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List<mm1.c> listB;
        List<mm1.c> listB2;
        ArrayList arrayList;
        List<mm1.g> listB3;
        boolean z14;
        ym1.g gVar;
        Integer averageSleepNeed;
        List<mm1.g> listB4;
        ym1.d dVar;
        Double averageSleepSeconds;
        int i14 = this.f55067a;
        int i15 = 12;
        int i16 = 3;
        int i17 = 6;
        int i18 = 4;
        ArrayList arrayListH = null;
        final int i19 = 0;
        boolean z15 = this.f55068b;
        Object obj2 = this.f55072f;
        Object obj3 = this.f55071e;
        final int i24 = 1;
        Object obj4 = this.f55070d;
        Object obj5 = this.f55069c;
        switch (i14) {
            case 0:
                dq.a aVar = (dq.a) obj5;
                m00.a aVar2 = (m00.a) obj4;
                eq.a aVar3 = (eq.a) obj3;
                x1 x1Var = (x1) obj2;
                View view2 = (View) obj;
                CustomLineChart customLineChart = (CustomLineChart) view2.findViewById(R.id.chart_view);
                TextView textView = (TextView) view2.findViewById(R.id.no_chart_data);
                com.garmin.android.apps.connectmobile.activities.newmodel.a activityChartDetails = aVar.getActivityChartDetails();
                if (activityChartDetails != null) {
                    boolean zA0 = activityChartDetails.a0();
                    textView.getClass();
                    v22.e.v(textView, !zA0);
                    customLineChart.getClass();
                    v22.e.v(customLineChart, zA0);
                    if (zA0) {
                        Context context = view2.getContext();
                        context.getClass();
                        qz.a.b(new tz.a(customLineChart, new a(context, aVar2), new x(customLineChart), new b0(customLineChart), new m00.b(customLineChart), null, 32, null), aVar, view2.getContext().getString(R.string.charts_no_charts_available), 4);
                    }
                } else if (!z15) {
                    customLineChart.getClass();
                    customLineChart.setVisibility(8);
                    textView.getClass();
                    textView.setVisibility(0);
                    textView.setText(R.string.lbl_climb_no_activity_uploaded);
                }
                String strH = aVar3.f65015a.h(R.string.common_difficulty);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.activity_climb_information_container);
                ArrayList<o13.p> arrayListA = aVar3.a(x1Var);
                linearLayout.removeAllViews();
                for (o13.p pVar : arrayListA) {
                    A a14 = pVar.f128594a;
                    if (!p005kotlin.jvm.internal.s.g(a14, strH) || z15) {
                        View viewInflate = LayoutInflater.from(view2.getContext()).inflate(R.layout.gcm_label_value_row, (ViewGroup) linearLayout, false);
                        viewInflate.getClass();
                        new eq.b(viewInflate).a((String) a14, (String) pVar.f128595b);
                        if (p005kotlin.jvm.internal.s.g(a14, strH)) {
                            View viewFindViewById = viewInflate.findViewById(R.id.help);
                            viewFindViewById.getClass();
                            viewFindViewById.setVisibility(0);
                            viewFindViewById.setOnClickListener(new com.garmin.android.apps.connectmobile.connectiq.x(view2, i17));
                        }
                        linearLayout.addView(viewInflate);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                final com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj5;
                final v0 v0Var = (v0) obj4;
                e23.l lVar = (e23.l) obj3;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.b(f0Var, null, new z3.e(1574923970, true, new e23.q() { // from class: e62.f
                    @Override // e23.q
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i25 = i19;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar2 = eVar;
                        e2.d dVar2 = (e2.d) obj6;
                        switch (i25) {
                            case 0:
                                m mVar = (m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p3.x1 x1Var2 = n.f135158a;
                                    y.n(v0Var, eVar2.getF24790m().f24692c, mVar, 0);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                m mVar2 = (m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    p3.x1 x1Var3 = n.f135158a;
                                    l0.j(v0Var, eVar2.getF24784g().f69291a, eVar2.getF24784g().f69292b, eVar2.getF24784g().f69293c, eVar2.getF24784g().f69294d, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                f0.b(f0Var, null, new z3.e(-1112549077, true, new e23.q() { // from class: e62.f
                    @Override // e23.q
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i25 = i24;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar2 = eVar;
                        e2.d dVar2 = (e2.d) obj6;
                        switch (i25) {
                            case 0:
                                m mVar = (m) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p3.x1 x1Var2 = n.f135158a;
                                    y.n(v0Var, eVar2.getF24790m().f24692c, mVar, 0);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                m mVar2 = (m) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                dVar2.getClass();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    p3.x1 x1Var3 = n.f135158a;
                                    l0.j(v0Var, eVar2.getF24784g().f69291a, eVar2.getF24784g().f69292b, eVar2.getF24784g().f69293c, eVar2.getF24784g().f69294d, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                f0.b(f0Var, null, new z3.e(1891766410, true, new e23.q() { // from class: e62.h
                    @Override // e23.q
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i25 = i19;
                        boolean z16 = true;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar2 = eVar;
                        e2.d dVar2 = (e2.d) obj6;
                        m mVar = (m) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i25) {
                            case 0:
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p3.x1 x1Var2 = n.f135158a;
                                    String f24788k = eVar2.getF24788k();
                                    String str = eVar2.getF48577a().f48057q;
                                    if (str != null && str.length() != 0) {
                                        z16 = false;
                                    }
                                    y1.c(0, f24788k, mVar, z16);
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                dVar2.getClass();
                                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p3.x1 x1Var3 = n.f135158a;
                                    b0.a(eVar2.getF48577a().f48057q, i62.n.b() + eVar2.getF48577a().f48058r, mVar, 0);
                                } else {
                                    mVar.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                e62.a.f63195a.getClass();
                f0.b(f0Var, null, e62.a.f63196b, 3);
                Iterator<T> it = eVar.getF48577a().Q0.iterator();
                while (it.hasNext()) {
                    f0.b(f0Var, null, new z3.e(1572541488, true, new a42.a(eVar, 19, (h0) it.next(), lVar)), 3);
                }
                f0.b(f0Var, null, new z3.e(-689537208, true, new e62.i(v0Var, i19)), 3);
                if (z15) {
                    f0.b(f0Var, null, new z3.e(-25413497, true, new e23.q() { // from class: e62.h
                        @Override // e23.q
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i25 = i24;
                            boolean z16 = true;
                            com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar2 = eVar;
                            e2.d dVar2 = (e2.d) obj6;
                            m mVar = (m) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            switch (i25) {
                                case 0:
                                    dVar2.getClass();
                                    if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p3.x1 x1Var2 = n.f135158a;
                                        String f24788k = eVar2.getF24788k();
                                        String str = eVar2.getF48577a().f48057q;
                                        if (str != null && str.length() != 0) {
                                            z16 = false;
                                        }
                                        y1.c(0, f24788k, mVar, z16);
                                    } else {
                                        mVar.e();
                                    }
                                    break;
                                default:
                                    dVar2.getClass();
                                    if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        p3.x1 x1Var3 = n.f135158a;
                                        b0.a(eVar2.getF48577a().f48057q, i62.n.b() + eVar2.getF48577a().f48058r, mVar, 0);
                                    } else {
                                        mVar.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                f0.b(f0Var, null, new z3.e(-1980189017, true, new a42.a(eVar, 20, v0Var, fVar)), 3);
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar4 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a) obj5;
                LocalDate localDate = (LocalDate) obj4;
                LocalDate localDate2 = (LocalDate) obj3;
                LocalDate localDate3 = (LocalDate) obj2;
                cx0.a aVar5 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                if (aVar5 == null) {
                    if (z15) {
                        g22.e.l(aVar4);
                    } else {
                        View view3 = aVar4.f38866j;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("loadingView");
                            throw null;
                        }
                        view3.setVisibility(0);
                    }
                    aVar4.f38864h = true;
                } else {
                    aVar4.P1();
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.a aVar6 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.a) aVar5.f56599a;
                    if (aVar5.f56600b != null) {
                        ComposeView composeView = aVar4.f38863g;
                        if (composeView != null) {
                            composeView.setContent(new z3.e(-1874687964, true, new hx0.h(aVar4, localDate2, localDate3, localDate, 0)));
                        }
                        ComposeView composeView2 = aVar4.f38863g;
                        if (composeView2 != null) {
                            composeView2.setVisibility(0);
                        }
                        RangeCalendar rangeCalendar = aVar4.f38867k;
                        if (rangeCalendar == null) {
                            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                            throw null;
                        }
                        rangeCalendar.setVisibility(8);
                        View view4 = aVar4.f38869m;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                    } else if (aVar6 != null) {
                        ComposeView composeView3 = aVar4.f38863g;
                        if (composeView3 != null) {
                            composeView3.setVisibility(8);
                        }
                        RangeCalendar rangeCalendar2 = aVar4.f38867k;
                        if (rangeCalendar2 == null) {
                            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                            throw null;
                        }
                        rangeCalendar2.setVisibility(0);
                        View view5 = aVar4.f38869m;
                        if (view5 != null) {
                            view5.setVisibility(0);
                        }
                        RangeCalendar rangeCalendar3 = aVar4.f38867k;
                        if (rangeCalendar3 == null) {
                            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                            throw null;
                        }
                        rangeCalendar3.post(new fh2.a(rangeCalendar3, i17, aVar6, localDate));
                    }
                }
                return Unit.INSTANCE;
            case 3:
                t0 t0Var = (t0) obj5;
                p1 p1Var = (p1) obj4;
                x3 x3Var = (x3) obj3;
                x3 x3Var2 = (x3) obj2;
                o4.t0 t0Var2 = (o4.t0) obj;
                float fFloatValue = 0.8f;
                float fFloatValue2 = 1.0f;
                t0Var2.v(z15 ? ((Boolean) t0Var.f155743c.getF182175a()).booleanValue() ? 1.0f : 0.8f : ((Number) x3Var.getF182175a()).floatValue());
                if (!z15) {
                    fFloatValue = ((Number) x3Var.getF182175a()).floatValue();
                } else if (((Boolean) t0Var.f155743c.getF182175a()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                t0Var2.w(fFloatValue);
                if (!z15) {
                    fFloatValue2 = ((Number) x3Var2.getF182175a()).floatValue();
                } else if (!((Boolean) t0Var.f155743c.getF182175a()).booleanValue()) {
                    fFloatValue2 = 0.0f;
                }
                t0Var2.c(fFloatValue2);
                t0Var2.T0(((z1) p1Var.getF182175a()).f129048a);
                return Unit.INSTANCE;
            case 4:
                List list = (List) obj5;
                List<c80.u> list2 = (List) obj4;
                Map map = (Map) obj3;
                p1 p1Var2 = (p1) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                if (!list.isEmpty()) {
                    ok0.l.f132499a.getClass();
                    f0.b(f0Var2, "header-collections", ok0.l.f132500b, 2);
                    f0Var2.a(list.size(), new ok0.s.h(new oe2.g(i18), list), new ok0.s.i(ok0.s.g.f132532a, list), new z3.e(802480018, true, new ok0.s.j(list, p1Var2)));
                    if (z15) {
                        f0.b(f0Var2, "collections-footnote", ok0.l.f132501c, 2);
                    }
                }
                for (c80.u uVar : list2) {
                    List list3 = (List) map.get(uVar);
                    if (list3 == null) {
                        list3 = j0.f134944a;
                    }
                    if (!list3.isEmpty()) {
                        f0.b(f0Var2, "header-" + uVar, new z3.e(222440864, true, new ok0.q(uVar, i19)), 2);
                        f0Var2.a(list3.size(), new ok0.s.l(new oe2.g(i17), list3), new ok0.s.m(ok0.s.k.f132539a, list3), new z3.e(802480018, true, new ok0.s.n(list3, p1Var2)));
                    }
                }
                map.getClass();
                if (!map.isEmpty()) {
                    ok0.l.f132499a.getClass();
                    f0.b(f0Var2, "active-gear-disclaimer", ok0.l.f132502d, 2);
                }
                return Unit.INSTANCE;
            case 5:
                lc.m0 m0Var = (lc.m0) obj5;
                WeightReportsActivity weightReportsActivity = (WeightReportsActivity) obj4;
                k0 k0Var = (k0) obj;
                int i25 = WeightReportsActivity.f47991a;
                k0Var.getClass();
                String str = com.garmin.android.apps.connectmobile.weighttracker.presentation.a.b.f48006b.f48004a;
                ?? r14 = this.f55071e;
                nc.n.b(k0Var, str, null, null, null, null, null, null, new z3.e(-62053355, true, new d0(m0Var, weightReportsActivity, (Object) r14, this.f55072f, 29)), 254);
                nc.n.b(k0Var, com.garmin.android.apps.connectmobile.weighttracker.presentation.a.C0938a.f48005b.f48004a, null, null, null, null, null, null, new z3.e(-1184312066, true, new oy0.g(weightReportsActivity, (o13.l) r14, z15, m0Var)), 254);
                return Unit.INSTANCE;
            case 6:
                lc.v vVar = (lc.v) obj;
                int i26 = qc.h.B;
                vVar.getClass();
                ((m0) obj5).f105804a = true;
                ((m0) obj4).f105804a = true;
                ((qc.h) obj3).t(vVar, z15, (p13.k) obj2);
                return Unit.INSTANCE;
            case 7:
                LocalDate localDate4 = (LocalDate) obj5;
                LocalDate localDate5 = (LocalDate) obj4;
                mm1.b bVar = (mm1.b) obj3;
                String str2 = (String) obj2;
                View view6 = (View) obj;
                if (view6 instanceof CustomBarChart) {
                    CustomBarChart customBarChart = (CustomBarChart) view6;
                    Context context2 = customBarChart.getContext();
                    context2.getClass();
                    ym1.a aVar7 = new ym1.a(context2, localDate4, localDate5, z15);
                    ym1.b bVar2 = new ym1.b((BarChart) view6, localDate4, localDate5);
                    BarLineChartBase barLineChartBase = (BarLineChartBase) view6;
                    rz.a aVar8 = new rz.a(customBarChart, aVar7, bVar2, new k00.m(barLineChartBase), new k00.g(barLineChartBase), null, 32, null);
                    ArrayList arrayListG = (bVar == null || (listB2 = bVar.b()) == null) ? null : vm1.a.g(listB2);
                    if (bVar != null && (listB = bVar.b()) != null) {
                        arrayListH = vm1.a.h(listB);
                    }
                    qz.a.b(aVar8, new ym1.c(arrayListG, arrayListH), str2, 4);
                }
                return Unit.INSTANCE;
            case 8:
                LocalDate localDate6 = (LocalDate) obj5;
                LocalDate localDate7 = (LocalDate) obj4;
                mm1.f fVar2 = (mm1.f) obj3;
                String str3 = (String) obj2;
                View view7 = (View) obj;
                if (view7 instanceof CustomBarChart) {
                    CustomBarChart customBarChart2 = (CustomBarChart) view7;
                    Context context3 = customBarChart2.getContext();
                    context3.getClass();
                    rz.a aVar9 = new rz.a(customBarChart2, new ym1.e(context3, localDate6, localDate7, z15), new ym1.f((BarChart) view7, localDate6, localDate7), new k00.m((BarLineChartBase) view7), new sl1.c((Chart) view7), null, 32, null);
                    if (fVar2 == null || (listB4 = fVar2.b()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (mm1.g gVar2 : listB4) {
                            double dDoubleValue = 0.0d;
                            if (gVar2.getWeekStartDate() == null) {
                                gVar2 = null;
                            } else {
                                mm1.g.a values = gVar2.getValues();
                                if ((values != null ? values.getAverageSleepSeconds() : null) == null) {
                                    gVar2 = null;
                                } else {
                                    mm1.g.a values2 = gVar2.getValues();
                                    if ((values2 != null ? values2.getAverageSleepSeconds().doubleValue() : 0.0d) <= 0.0d) {
                                        gVar2 = null;
                                    }
                                }
                            }
                            if (gVar2 != null) {
                                LocalDate localDateY = gl1.y.y(gVar2);
                                mm1.g.a values3 = gVar2.getValues();
                                if (values3 != null && (averageSleepSeconds = values3.getAverageSleepSeconds()) != null) {
                                    dDoubleValue = averageSleepSeconds.doubleValue();
                                }
                                dVar = new ym1.d(localDateY, Integer.valueOf((int) Math.ceil(dDoubleValue)));
                            } else {
                                dVar = null;
                            }
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                    }
                    if (fVar2 != null && (listB3 = fVar2.b()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (mm1.g gVar3 : listB3) {
                            if (gVar3.getWeekStartDate() == null) {
                                z14 = false;
                            } else {
                                mm1.g.a values4 = gVar3.getValues();
                                if ((values4 != null ? values4.getAverageSleepNeed() : null) == null) {
                                    z14 = false;
                                } else {
                                    mm1.g.a values5 = gVar3.getValues();
                                    if ((values5 != null ? values5.getAverageSleepNeed().intValue() : 0) > 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                }
                            }
                            if (!z14) {
                                gVar3 = null;
                            }
                            if (gVar3 != null) {
                                LocalDate localDateY2 = gl1.y.y(gVar3);
                                mm1.g.a values6 = gVar3.getValues();
                                gVar = new ym1.g(localDateY2, Integer.valueOf(((values6 == null || (averageSleepNeed = values6.getAverageSleepNeed()) == null) ? 0 : averageSleepNeed.intValue()) * 60));
                            } else {
                                gVar = null;
                            }
                            if (gVar != null) {
                                arrayList2.add(gVar);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            arrayListH = arrayList2;
                        }
                    }
                    qz.a.b(aVar9, new ym1.c(arrayList, arrayListH), str3, 4);
                }
                return Unit.INSTANCE;
            case 9:
                String str4 = (String) obj4;
                i53.d dVar2 = (i53.d) obj3;
                final e23.l lVar2 = (e23.l) obj2;
                Context context4 = (Context) obj;
                context4.getClass();
                final LottieAnimationView lottieAnimationView = new LottieAnimationView(context4);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setRenderMode((RenderMode) obj5);
                lottieAnimationView.enableMergePathsForKitKatAndAbove(z15);
                lottieAnimationView.setIgnoreDisabledSystemAnimations(true);
                lottieAnimationView.setImageAssetsFolder("images/");
                if (g22.n.d(str4)) {
                    lottieAnimationView.setAnimationFromJson(str4, null);
                }
                if (dVar2 != null) {
                    lottieAnimationView.setImageAssetDelegate(new tr2.b(dVar2, i15));
                }
                lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: ub0.e
                    @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
                    public final void onCompositionLoaded(LottieComposition lottieComposition) {
                        e23.l lVar3 = lVar2;
                        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                        lottieAnimationView2.addAnimatorUpdateListener(new e1(4, lVar3, lottieAnimationView2));
                    }
                });
                return lottieAnimationView;
            case 10:
                lc.y yVar = (lc.y) obj5;
                e23.a aVar10 = (e23.a) obj4;
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                z3.e eVar2 = new z3.e(-1417745931, true, new oy0.g(yVar, this.f55068b, aVar10, new gk1.b(yVar, 9), 4));
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                j0 j0Var = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = s0.f105811a;
                nc.n.a(k0Var2, t0Var3.b(vv0.w.class), k0Var3, j0Var, null, null, null, null, eVar2);
                nc.n.a(k0Var2, t0Var3.b(vv0.z.class), k0Var3, j0Var, null, null, null, null, new z3.e(1487475779, true, new m1(13, aVar10, new gl1.n(i16, aVar10, yVar))));
                nc.n.a(k0Var2, t0Var3.b(vv0.y.class), k0Var3, j0Var, null, null, null, null, new z3.e(-1738821413, true, new qw.b(yVar, aVar10, new gk1.b(yVar, 10), new gk1.b(yVar, 11), 7)));
                nc.n.a(k0Var2, t0Var3.b(vv0.v.class), k0Var3, j0Var, vv0.a0.f180427a, vv0.b0.f180430a, vv0.c0.f180433a, vv0.d0.f180437a, new z3.e(311998938, true, new ul.a(yVar, 5, new vc0.v((ug2.x) obj3, 16), new gk1.b(yVar, i15))));
                nc.n.c(k0Var2, t0Var3.b(vv0.t.class), k0Var3, j0Var, new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null), new z3.e(753531234, true, new vv0.e(i24, aVar10, new ux1.g((e23.a) obj2, 22))));
                return Unit.INSTANCE;
            case 11:
                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar3 = (com.garmin.android.apps.connectmobile.userprofile.presentation.d) obj5;
                e23.l lVar3 = (e23.l) obj4;
                e23.a aVar11 = (e23.a) obj3;
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                z3.e eVar3 = new z3.e(-1113780517, true, new oy0.g(dVar3, this.f55068b, lVar3, aVar11, 5));
                p13.k0 k0Var5 = p13.k0.f134949a;
                k0Var5.getClass();
                j0 j0Var2 = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = s0.f105811a;
                nc.n.a(k0Var4, t0Var4.b(w12.d.b.class), k0Var5, j0Var2, null, null, null, null, eVar3);
                nc.n.a(k0Var4, t0Var4.b(w12.d.c.class), k0Var5, j0Var2, null, null, null, null, new z3.e(460723908, true, new ul.a(dVar3, (lc.m0) obj2, aVar11, 7)));
                return Unit.INSTANCE;
            default:
                w2.n nVar = (w2.n) obj4;
                long jA = x0.a(nVar.t(z15));
                ((q0) obj5).f105808a = jA;
                nVar.G((l1) obj3, jA);
                n4.c.f123541b.getClass();
                ((q0) obj2).f105808a = 0L;
                nVar.f181389y = -1;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(Object obj, boolean z14, Object obj2, Object obj3, Object obj4, int i14) {
        this.f55067a = i14;
        this.f55069c = obj;
        this.f55068b = z14;
        this.f55070d = obj2;
        this.f55071e = obj3;
        this.f55072f = obj4;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z14, Object obj3, Object obj4, int i14) {
        this.f55067a = i14;
        this.f55069c = obj;
        this.f55070d = obj2;
        this.f55068b = z14;
        this.f55071e = obj3;
        this.f55072f = obj4;
    }

    public /* synthetic */ m(lc.m0 m0Var, WeightReportsActivity weightReportsActivity, o13.l lVar, o13.l lVar2, boolean z14) {
        this.f55067a = 5;
        this.f55069c = m0Var;
        this.f55070d = weightReportsActivity;
        this.f55071e = lVar;
        this.f55072f = lVar2;
        this.f55068b = z14;
    }

    public /* synthetic */ m(boolean z14, t0 t0Var, p1 p1Var, t1.d dVar, t1.d dVar2) {
        this.f55067a = 3;
        this.f55068b = z14;
        this.f55069c = t0Var;
        this.f55070d = p1Var;
        this.f55071e = dVar;
        this.f55072f = dVar2;
    }
}
