package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f2.o0;
import fb1.w;
import fb1.x;
import fb1.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import r22.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/m;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c$a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends Fragment implements c.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f40713m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseLineChart f40714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f40715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ComposeView f40716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public db1.s f40717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f40718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hz.b f40719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f40720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f40721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f40722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f40723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f40724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public rl1.d f40725l;

    public m() {
        j0 j0Var = j0.f134944a;
        this.f40720g = j0Var;
        this.f40721h = j0Var;
        this.f40722i = j0Var;
        this.f40723j = j0Var;
        this.f40724k = new LinkedHashSet();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection] */
    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c.a
    public final void o(Set<? extends db1.d> set) {
        Object next;
        Object next2;
        set.getClass();
        hz.b bVar = this.f40719f;
        if (bVar != null) {
            ArrayList arrayListD1 = h0.d1(this.f40720g);
            ArrayList arrayListD2 = h0.d1(this.f40721h);
            ArrayList arrayListD3 = h0.d1(this.f40722i);
            ArrayList arrayListD4 = h0.d1(this.f40723j);
            if (!set.contains(db1.d.BEFOREMEAL)) {
                arrayListD1.clear();
            }
            if (!set.contains(db1.d.AFTERMEAL)) {
                arrayListD2.clear();
            }
            if (!set.contains(db1.d.BEFOREBED)) {
                arrayListD3.clear();
            }
            if (!set.contains(db1.d.OTHER)) {
                arrayListD4.clear();
            }
            w wVar = this.f40718e;
            if (wVar != null) {
                Context context = wVar.f134441a;
                LineChart lineChart = wVar.f134442b;
                if (lineChart != null) {
                    DateTime dateTime = bVar.f86378a;
                    DateTime dateTime2 = bVar.f86379b;
                    if (dateTime == null || dateTime2 == null) {
                        return;
                    }
                    ArrayList arrayListC0 = h0.C0(h0.C0(h0.C0(arrayListD1, arrayListD2), arrayListD3), arrayListD4);
                    XAxis xAxis = lineChart.getXAxis();
                    xAxis.getClass();
                    xAxis.removeAllLimitLines();
                    LineChart lineChart2 = wVar.f134442b;
                    XAxisRenderer rendererXAxis = lineChart2 != null ? lineChart2.getRendererXAxis() : null;
                    if (rendererXAxis instanceof gm1.b) {
                        int hours = 3 - (Hours.hoursBetween(dateTime, dateTime.withTimeAtStartOfDay().plusDays(1)).getHours() % 3);
                        gm1.b bVar2 = (gm1.b) rendererXAxis;
                        if (hours >= 0) {
                            bVar2.f121637l = hours;
                        }
                    }
                    YAxis axisLeft = lineChart.getAxisLeft();
                    axisLeft.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : arrayListC0) {
                        if (((hz.d) obj).f86389b > 0.0f) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            float f14 = ((hz.d) next).f86389b;
                            do {
                                Object next3 = it.next();
                                float f15 = ((hz.d) next3).f86389b;
                                if (Float.compare(f14, f15) > 0) {
                                    f14 = f15;
                                    next = next3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    hz.d dVar = (hz.d) next;
                    float f16 = 1.0f;
                    float f17 = dVar != null ? dVar.f86389b - 1.0f : 8.0f;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayListC0) {
                        float f18 = f16;
                        if (((hz.d) obj2).f86389b > 0.0f) {
                            arrayList2.add(obj2);
                        }
                        f16 = f18;
                    }
                    float f19 = f16;
                    Iterator it3 = arrayList2.iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            float f22 = ((hz.d) next2).f86389b;
                            while (true) {
                                Object next4 = it3.next();
                                Iterator it4 = it3;
                                float f24 = ((hz.d) next4).f86389b;
                                if (Float.compare(f22, f24) < 0) {
                                    f22 = f24;
                                    next2 = next4;
                                }
                                if (!it4.hasNext()) {
                                    break;
                                } else {
                                    it3 = it4;
                                }
                            }
                        }
                    } else {
                        next2 = null;
                    }
                    hz.d dVar2 = (hz.d) next2;
                    nz.b.a(axisLeft, f17, dVar2 != null ? dVar2.f86389b + f19 : 24.0f);
                    wVar.f134437e = new w.b(wVar, dateTime);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (!arrayListD1.isEmpty()) {
                        db1.d dVar3 = db1.d.BEFOREMEAL;
                        arrayList6.add(wVar.o(arrayListD1, dateTime, dVar3));
                        q6.f.t(context, dVar3.f59001b, arrayList3);
                        String string = context.getString(dVar3.f59000a);
                        string.getClass();
                        arrayList4.add(string);
                        arrayList5.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                    }
                    if (!arrayListD2.isEmpty()) {
                        db1.d dVar4 = db1.d.AFTERMEAL;
                        arrayList6.add(wVar.o(arrayListD2, dateTime, dVar4));
                        q6.f.t(context, dVar4.f59001b, arrayList3);
                        String string2 = context.getString(dVar4.f59000a);
                        string2.getClass();
                        arrayList4.add(string2);
                        arrayList5.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                    }
                    if (!arrayListD3.isEmpty()) {
                        db1.d dVar5 = db1.d.BEFOREBED;
                        arrayList6.add(wVar.o(arrayListD3, dateTime, dVar5));
                        q6.f.t(context, dVar5.f59001b, arrayList3);
                        String string3 = context.getString(dVar5.f59000a);
                        string3.getClass();
                        arrayList4.add(string3);
                        arrayList5.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                    }
                    if (!arrayListD4.isEmpty()) {
                        db1.d dVar6 = db1.d.OTHER;
                        arrayList6.add(wVar.o(arrayListD4, dateTime, dVar6));
                        q6.f.t(context, dVar6.f59001b, arrayList3);
                        String string4 = context.getString(dVar6.f59000a);
                        string4.getClass();
                        arrayList4.add(string4);
                        arrayList5.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                    }
                    hz.h hVarO = wVar.o(h0.N0(arrayListC0, new x()), dateTime, null);
                    hVarO.setHighlightEnabled(true);
                    arrayList6.add(hVarO);
                    if (arrayList6.isEmpty()) {
                        arrayList6.add(wVar.n(j0.f134944a, null));
                        lineChart.setTouchEnabled(false);
                        LineChart lineChart3 = wVar.f134442b;
                        if (lineChart3 != null) {
                            rl1.e eVar = new rl1.e(context, lineChart3);
                            eVar.a();
                            if (lineChart3 instanceof BaseLineChart) {
                                ((BaseLineChart) lineChart3).a(eVar.f153412b, eVar.f153413c);
                            }
                        }
                    } else {
                        lineChart.setNoDataText(null);
                        lineChart.setTouchEnabled(true);
                        LineChart lineChart4 = wVar.f134442b;
                        if (lineChart4 != null) {
                            z zVar = new z(context, lineChart4, arrayList3, arrayList4, arrayList5);
                            zVar.a();
                            if (lineChart4 instanceof BaseLineChart) {
                                ((BaseLineChart) lineChart4).a(zVar.f153412b, zVar.f153413c);
                            }
                        }
                    }
                    wVar.j(new LineData(wVar.p(dateTime, dateTime2), arrayList6));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_pregnancy_glucose_expandable_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        db1.s sVar;
        String string;
        String string2;
        String string3;
        String string4;
        DateTime dateTimeAtCurrentTime;
        DateTime dateTimeAtCurrentTime2;
        List<db1.r> listB;
        db1.r rVar;
        List<db1.r> listB2;
        ComposeView composeView;
        db1.s sVar2;
        List<db1.r> listB3;
        Parcelable parcelable;
        Integer numValueOf = Integer.valueOf(R.dimen.gcm3_default_padding);
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.glucose_details_chart);
        viewFindViewById.getClass();
        this.f40714a = (BaseLineChart) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.glucose_chart_chips);
        viewFindViewById2.getClass();
        this.f40715b = (RecyclerView) viewFindViewById2;
        this.f40716c = (ComposeView) view2.findViewById(R.id.gcm_stats_row_1);
        this.f40725l = new rl1.d(view2.findViewById(R.id.glucose_chart_values_highlight));
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("EXTRA_PREGNANCY_GLUCOSE_CHART_DATA", db1.s.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("EXTRA_PREGNANCY_GLUCOSE_CHART_DATA");
                if (!(parcelable2 instanceof db1.s)) {
                    parcelable2 = null;
                }
                parcelable = (db1.s) parcelable2;
            }
            sVar = (db1.s) parcelable;
        } else {
            sVar = null;
        }
        this.f40717d = sVar;
        gg1.h0 h0VarI = i52.a.i();
        String strH = com.nimbusds.jose.shaded.gson.internal.a.h(getString(R.string.pregnancy_blood_glucose), " (", getString(h0VarI.f77243b), ")");
        TextView textView = (TextView) view2.findViewById(R.id.glucose_details_chart_title);
        textView.setText(strH);
        textView.setContentDescription(getString(R.string.pregnancy_blood_glucose) + " (" + getString(h0VarI.f77244c) + ")");
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            tb1.e.a aVar = tb1.e.f163745a;
            db1.s sVar3 = this.f40717d;
            Double max = sVar3 != null ? sVar3.getMax() : null;
            aVar.getClass();
            string = tb1.e.a.b(activity, max);
            db1.s sVar4 = this.f40717d;
            string3 = tb1.e.a.b(activity, sVar4 != null ? sVar4.getMin() : null);
            db1.s sVar5 = this.f40717d;
            string4 = tb1.e.a.a(activity, sVar5 != null ? sVar5.getMax() : null);
            db1.s sVar6 = this.f40717d;
            string2 = tb1.e.a.a(activity, sVar6 != null ? sVar6.getMin() : null);
        } else {
            string = "";
            string2 = "";
            string3 = string2;
            string4 = string3;
        }
        if (h0VarI == gg1.h0.MILLI_MOLES_PER_LITER && (sVar2 = this.f40717d) != null && (listB3 = sVar2.b()) != null) {
            for (db1.r rVar2 : listB3) {
                try {
                    Double value = rVar2.getValue();
                    if (value != null) {
                        tb1.e.a aVar2 = tb1.e.f163745a;
                        double dDoubleValue = value.doubleValue();
                        aVar2.getClass();
                        rVar2.u(Double.valueOf(tb1.e.a.i(dDoubleValue)));
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (string.length() == 0) {
            string = getString(R.string.symbol_double_dash);
            string.getClass();
        }
        String str = string;
        if (string3.length() == 0) {
            string3 = getString(R.string.symbol_double_dash);
            string3.getClass();
        }
        String str2 = string3;
        if (string4.length() == 0) {
            string4 = getString(R.string.txt_empty_page_no_data);
            string4.getClass();
        }
        String str3 = string4;
        if (string2.length() == 0) {
            string2 = getString(R.string.txt_empty_page_no_data);
            string2.getClass();
        }
        String str4 = string2;
        db1.s sVar7 = this.f40717d;
        if (sVar7 != null && (listB2 = sVar7.b()) != null && !listB2.isEmpty() && (composeView = this.f40716c) != null) {
            composeView.setContent(new z3.e(-198147428, true, new a51.h(str2, str4, str, str3, 1, (byte) 0)));
        }
        db1.s sVar8 = this.f40717d;
        LocalDate calendarDate = (sVar8 == null || (listB = sVar8.b()) == null || (rVar = listB.get(0)) == null) ? null : rVar.getCalendarDate();
        this.f40719f = new hz.c(calendarDate, null, (calendarDate == null || (dateTimeAtCurrentTime = calendarDate.toDateTimeAtCurrentTime()) == null) ? null : g22.k.A(dateTimeAtCurrentTime).toDateTime(DateTimeZone.UTC), (calendarDate == null || (dateTimeAtCurrentTime2 = calendarDate.toDateTimeAtCurrentTime()) == null) ? null : g22.k.A(dateTimeAtCurrentTime2), 0, 18, null).a();
        this.f40720g = u6(db1.d.BEFOREMEAL);
        this.f40721h = u6(db1.d.AFTERMEAL);
        this.f40722i = u6(db1.d.BEFOREBED);
        this.f40723j = u6(db1.d.OTHER);
        Context context = getContext();
        if (context != null) {
            w wVar = new w(context);
            this.f40718e = wVar;
            BaseLineChart baseLineChart = this.f40714a;
            if (baseLineChart == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            wVar.l(baseLineChart);
            c cVar = new c(context, h0.b1(this.f40724k), this);
            RecyclerView recyclerView = this.f40715b;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            RecyclerView recyclerView2 = this.f40715b;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            recyclerView2.setAdapter(cVar);
            RecyclerView recyclerView3 = this.f40715b;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            recyclerView3.addItemDecoration(new z0(context, Integer.valueOf(R.dimen.spacing_micro), numValueOf, numValueOf, numValueOf));
        }
        w wVar2 = this.f40718e;
        if (wVar2 != null) {
            wVar2.f70313g = new o0(this, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<hz.d>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0 */
    public final List<hz.d> u6(db1.d dVar) {
        ?? arrayList;
        List<db1.r> listB;
        db1.s sVar = this.f40717d;
        if (sVar == null || (listB = sVar.b()) == null) {
            arrayList = j0.f134944a;
        } else {
            ArrayList<db1.r> arrayList2 = new ArrayList();
            for (Object obj : listB) {
                if (((db1.r) obj).getLogType() == dVar) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (db1.r rVar : arrayList2) {
                DateTime userMeasurementTimestamp = rVar.getUserMeasurementTimestamp();
                Double value = rVar.getValue();
                hz.d dVar2 = null;
                Float fValueOf = value != null ? Float.valueOf((float) value.doubleValue()) : null;
                if (userMeasurementTimestamp != null && fValueOf != null) {
                    dVar2 = new hz.d(userMeasurementTimestamp, fValueOf.floatValue());
                }
                if (dVar2 != null) {
                    arrayList.add(dVar2);
                }
            }
        }
        if (!((Collection) arrayList).isEmpty()) {
            this.f40724k.add(dVar);
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/m$a;", "", "<init>", "()V", "", "EXTRA_PREGNANCY_GLUCOSE_CHART_DATA", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
