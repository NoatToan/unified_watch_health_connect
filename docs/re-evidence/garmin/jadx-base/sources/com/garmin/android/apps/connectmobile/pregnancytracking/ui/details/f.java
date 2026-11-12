package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f2.o0;
import fb1.a0;
import fb1.v;
import fb1.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/f;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$b;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/a$a;", "<init>", "()V", "a", "c", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment implements l.b, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a.InterfaceC0761a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f40604w = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseLineChart f40605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f40606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f40607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f40608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f40609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f40610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f40611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f40612h = new w1(s0.f105811a.b(gb1.t.class), new d(this), new C0767f(this), new e(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fb1.d f40613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hz.b f40614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f40615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f40616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f40617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f40618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f40619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public db1.m f40620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f40621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashMap<DateTime, List<db1.a>> f40622r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ww0.k f40623t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public gb1.d f40624v;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/f$c;", "Ljava/util/Comparator;", "Lhz/d;", "Lkotlin/Comparator;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Comparator<hz.d> {
        @Override // java.util.Comparator
        public final int compare(hz.d dVar, hz.d dVar2) {
            hz.d dVar3 = dVar;
            hz.d dVar4 = dVar2;
            if (dVar4 != null) {
                return (dVar3 == null || !dVar3.f86388a.isBefore(dVar4.f86388a)) ? 1 : -1;
            }
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40628a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40628a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40629a = aVar;
            this.f40630b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40629a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40630b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0767f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40631a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0767f(Fragment fragment) {
            super(0);
            this.f40631a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40631a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f() {
        j0 j0Var = j0.f134944a;
        this.f40615k = j0Var;
        this.f40616l = j0Var;
        this.f40617m = j0Var;
        this.f40618n = j0Var;
        this.f40619o = new LinkedHashSet();
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.b
    public final void C2() {
        z6();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection] */
    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a.InterfaceC0761a
    public final void o(Set<? extends db1.g> set) {
        Object next;
        Object next2;
        set.getClass();
        hz.b bVar = this.f40614j;
        if (bVar != null) {
            ArrayList arrayListD1 = h0.d1(this.f40615k);
            ArrayList arrayListD2 = h0.d1(this.f40616l);
            ArrayList arrayListD3 = h0.d1(this.f40617m);
            ArrayList arrayListD4 = h0.d1(this.f40618n);
            if (!set.contains(db1.g.GENERAL)) {
                arrayListD1.clear();
            }
            if (!set.contains(db1.g.KICKS)) {
                arrayListD2.clear();
            }
            if (!set.contains(db1.g.HICCUPS)) {
                arrayListD3.clear();
            }
            if (!set.contains(db1.g.OTHER)) {
                arrayListD4.clear();
            }
            fb1.d dVar = this.f40613i;
            if (dVar != null) {
                Context context = dVar.f134441a;
                db1.m mVar = this.f40620p;
                gb1.t tVarY6 = y6();
                LineChart lineChart = dVar.f134442b;
                if (lineChart != null) {
                    DateTime dateTime = bVar.f86378a;
                    DateTime dateTime2 = bVar.f86379b;
                    if (dateTime == null || dateTime2 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayListC0 = h0.C0(h0.C0(h0.C0(arrayListD1, arrayListD2), arrayListD3), arrayListD4);
                    XAxis xAxis = lineChart.getXAxis();
                    xAxis.getClass();
                    xAxis.removeAllLimitLines();
                    LineChart lineChart2 = dVar.f134442b;
                    XAxisRenderer rendererXAxis = lineChart2 != null ? lineChart2.getRendererXAxis() : null;
                    if (rendererXAxis instanceof gm1.b) {
                        int days = Days.daysBetween(dateTime.withTimeAtStartOfDay(), dateTime2.withTimeAtStartOfDay()).getDays();
                        gm1.b bVar2 = (gm1.b) rendererXAxis;
                        if (days >= 0) {
                            bVar2.f121637l = days;
                        }
                    }
                    YAxis axisLeft = lineChart.getAxisLeft();
                    axisLeft.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayListC0.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList3 = arrayListC0;
                        Object next3 = it.next();
                        Iterator it3 = it;
                        if (((hz.d) next3).f86389b > 0.0f) {
                            arrayList2.add(next3);
                        }
                        arrayListC0 = arrayList3;
                        it = it3;
                    }
                    ArrayList arrayList4 = arrayListC0;
                    Iterator it4 = arrayList2.iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            float f14 = ((hz.d) next).f86389b;
                            while (true) {
                                Object next4 = it4.next();
                                Iterator it5 = it4;
                                float f15 = ((hz.d) next4).f86389b;
                                if (Float.compare(f14, f15) > 0) {
                                    f14 = f15;
                                    next = next4;
                                }
                                if (!it5.hasNext()) {
                                    break;
                                }
                                it4 = it5;
                                context = context;
                            }
                        }
                    } else {
                        next = null;
                    }
                    hz.d dVar2 = (hz.d) next;
                    float f16 = 1.0f;
                    float f17 = dVar2 != null ? dVar2.f86389b - 1.0f : 0.0f;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayList4) {
                        float f18 = f16;
                        DateTime dateTime3 = dateTime2;
                        if (((hz.d) obj).f86389b > 0.0f) {
                            arrayList5.add(obj);
                        }
                        f16 = f18;
                        dateTime2 = dateTime3;
                    }
                    DateTime dateTime4 = dateTime2;
                    float f19 = f16;
                    Iterator it6 = arrayList5.iterator();
                    if (it6.hasNext()) {
                        next2 = it6.next();
                        if (it6.hasNext()) {
                            float f22 = ((hz.d) next2).f86389b;
                            while (true) {
                                Object next5 = it6.next();
                                Iterator it7 = it6;
                                float f24 = ((hz.d) next5).f86389b;
                                if (Float.compare(f22, f24) < 0) {
                                    f22 = f24;
                                    next2 = next5;
                                }
                                if (!it7.hasNext()) {
                                    break;
                                }
                                dateTime4 = dateTime4;
                                context = context;
                                it6 = it7;
                            }
                        }
                    } else {
                        next2 = null;
                    }
                    hz.d dVar3 = (hz.d) next2;
                    nz.b.a(axisLeft, f17, dVar3 != null ? dVar3.f86389b + f19 : 100.0f);
                    dVar.f134437e = new fb1.d.b(dVar, dateTime, mVar, tVarY6);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    if (!arrayListD1.isEmpty()) {
                        db1.g gVar = db1.g.GENERAL;
                        hz.h hVarO = dVar.o(arrayListD1, dateTime, gVar);
                        hVarO.setHighlightEnabled(true);
                        arrayList6.add(Integer.valueOf(a7.b.getColor(context, gVar.c())));
                        arrayList7.add("GENERAL");
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO);
                    }
                    if (!arrayListD2.isEmpty()) {
                        db1.g gVar2 = db1.g.KICKS;
                        hz.h hVarO2 = dVar.o(arrayListD2, dateTime, gVar2);
                        hVarO2.setHighlightEnabled(true);
                        arrayList6.add(Integer.valueOf(a7.b.getColor(context, gVar2.c())));
                        arrayList7.add("KICKS");
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO2);
                    }
                    if (!arrayListD3.isEmpty()) {
                        db1.g gVar3 = db1.g.HICCUPS;
                        hz.h hVarO3 = dVar.o(arrayListD3, dateTime, gVar3);
                        hVarO3.setHighlightEnabled(true);
                        arrayList6.add(Integer.valueOf(a7.b.getColor(context, gVar3.c())));
                        arrayList7.add("HICCUPS");
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO3);
                    }
                    if (!arrayListD4.isEmpty()) {
                        db1.g gVar4 = db1.g.OTHER;
                        hz.h hVarO4 = dVar.o(arrayListD4, dateTime, gVar4);
                        hVarO4.setHighlightEnabled(true);
                        arrayList6.add(Integer.valueOf(a7.b.getColor(context, gVar4.c())));
                        arrayList7.add("OTHER");
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO4);
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.add(dVar.n(j0.f134944a, null));
                        lineChart.setTouchEnabled(false);
                        LineChart lineChart3 = dVar.f134442b;
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
                        LineChart lineChart4 = dVar.f134442b;
                        if (lineChart4 != null) {
                            z zVar = new z(context, lineChart4, arrayList6, arrayList7, arrayList8);
                            zVar.a();
                            if (lineChart4 instanceof BaseLineChart) {
                                ((BaseLineChart) lineChart4).a(zVar.f153412b, zVar.f153413c);
                            }
                        }
                    }
                    dVar.j(new LineData(fb1.d.p(dateTime, dateTime4), arrayList));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        this.f40620p = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
        return layoutInflater.inflate(R.layout.fragment_pregnancy_reports_baby_movement, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.chart_view);
        viewFindViewById.getClass();
        this.f40605a = (BaseLineChart) viewFindViewById;
        this.f40621q = new v(view2.findViewById(R.id.baby_movement_chart_highlight));
        View viewFindViewById2 = view2.findViewById(R.id.baby_movement_chart_chips);
        viewFindViewById2.getClass();
        this.f40606b = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.baby_movement_entries_title);
        viewFindViewById3.getClass();
        this.f40609e = viewFindViewById3;
        this.f40611g = (ComposeView) view2.findViewById(R.id.baby_movement_stats);
        View viewFindViewById4 = view2.findViewById(R.id.no_data_lbl);
        viewFindViewById4.getClass();
        this.f40608d = viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.baby_movement_report_chart_container);
        viewFindViewById5.getClass();
        this.f40610f = viewFindViewById5;
        LocalDate localDateW6 = w6();
        DateTime dateTimeAtStartOfDay = v6().toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = v6().toDateTimeAtStartOfDay();
        this.f40614j = new hz.c(localDateW6, null, dateTimeAtStartOfDay2 != null ? dateTimeAtStartOfDay2.toDateTime(DateTimeZone.UTC) : null, dateTimeAtStartOfDay, 0, 18, null).a();
        View viewFindViewById6 = view2.findViewById(R.id.baby_movement_entries);
        viewFindViewById6.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.f40607c = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f40607c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("movementEntries");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        z6();
    }

    public final ArrayList u6(db1.g gVar, HashMap map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) map.get(gVar);
        if (arrayList2 != null) {
            for (DateTime dateTimeAtStartOfDay = w6().toDateTimeAtStartOfDay(); dateTimeAtStartOfDay.isBefore(v6().toDateTimeAtStartOfDay().plusDays(1)); dateTimeAtStartOfDay = dateTimeAtStartOfDay.plusDays(1)) {
                if (arrayList2.isEmpty()) {
                    arrayList.add(new hz.d(dateTimeAtStartOfDay, -1.0f));
                    break;
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(new hz.d(dateTimeAtStartOfDay, -1.0f));
                        break;
                        break;
                    }
                    if (p005kotlin.jvm.internal.s.g(((gb1.b) it.next()).f76648a, dateTimeAtStartOfDay)) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (p005kotlin.jvm.internal.s.g(((gb1.b) obj).f76648a, dateTimeAtStartOfDay)) {
                                arrayList3.add(obj);
                            }
                        }
                        Integer num = ((gb1.b) h0.b0(arrayList3)).f76649b;
                        arrayList.add(new hz.d(dateTimeAtStartOfDay, num != null ? num.intValue() : -1.0f));
                        break;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f40619o.add(gVar);
        }
        Collections.sort(arrayList, new c());
        return arrayList;
    }

    public final LocalDate v6() {
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("END_DATE_KEY", LocalDate.class);
            } else {
                Object serializable2 = arguments.getSerializable("END_DATE_KEY");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                return localDate;
            }
        }
        vb.h.z("Can't display Pregnancy Reports with out end date");
        return null;
    }

    public final LocalDate w6() {
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("START_DATE_KEY", LocalDate.class);
            } else {
                Object serializable2 = arguments.getSerializable("START_DATE_KEY");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                return localDate;
            }
        }
        vb.h.z("Can't display Pregnancy Reports with out start date");
        return null;
    }

    public final gb1.t y6() {
        return (gb1.t) this.f40612h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z6() {
        o13.p pVar;
        ComposeView composeView;
        List<ww0.b> listG;
        gb1.t.a aVar = (gb1.t.a) y6().f76709a.get(w6());
        this.f40622r = aVar != null ? aVar.f76724d : null;
        gb1.t.a aVar2 = (gb1.t.a) y6().f76709a.get(w6());
        this.f40623t = aVar2 != null ? aVar2.f76721a : null;
        HashMap<DateTime, List<db1.a>> map = this.f40622r;
        if (map != null && map.isEmpty()) {
            View view2 = this.f40608d;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("noDataView");
                throw null;
            }
            view2.setVisibility(0);
            View view3 = this.f40610f;
            if (view3 == null) {
                p005kotlin.jvm.internal.s.m("chartContainer");
                throw null;
            }
            view3.setVisibility(8);
            View view4 = this.f40609e;
            if (view4 != null) {
                view4.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("entriesTitle");
                throw null;
            }
        }
        View view5 = this.f40608d;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("noDataView");
            throw null;
        }
        view5.setVisibility(8);
        View view6 = this.f40610f;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("chartContainer");
            throw null;
        }
        view6.setVisibility(0);
        View view7 = this.f40609e;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("entriesTitle");
            throw null;
        }
        view7.setVisibility(0);
        y6();
        HashMap mapA4 = gb1.t.A4(this.f40623t);
        y6();
        ww0.k kVar = this.f40623t;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        if (kVar != null && (listG = kVar.g()) != null) {
            for (ww0.b bVar : listG) {
                List<db1.a> listD = bVar.d();
                if (listD != null) {
                    for (db1.a aVar3 : listD) {
                        LocalDate date = bVar.getDate();
                        DateTime dateTimeAtStartOfDay = date != null ? date.toDateTimeAtStartOfDay() : null;
                        if (dateTimeAtStartOfDay != null) {
                            if ((aVar3 != null ? aVar3.getMovementType() : null) != null) {
                                ArrayList arrayList2 = (ArrayList) map2.get(dateTimeAtStartOfDay);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                Integer count = aVar3.getCount();
                                int iIntValue = count != null ? count.intValue() : 0;
                                Integer duration = aVar3.getDuration();
                                arrayList2.add(new o13.p(Integer.valueOf(iIntValue), Integer.valueOf(duration != null ? duration.intValue() : 0)));
                                map2.put(dateTimeAtStartOfDay, arrayList2);
                            }
                        }
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var, "PregnancyReportsViewModel", "CalendarDate, Value or LogType in BabyMovementDTO is null. Ignoring data.");
                    }
                }
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            DateTime dateTime = (DateTime) entry.getKey();
            ArrayList arrayList3 = (ArrayList) entry.getValue();
            int size = arrayList3.size();
            Iterator it = arrayList3.iterator();
            it.getClass();
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                o13.p pVar2 = (o13.p) next;
                iIntValue2 += ((Number) pVar2.f128594a).intValue();
                iIntValue3 += ((Number) pVar2.f128595b).intValue();
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new gb1.b(dateTime, Integer.valueOf(iIntValue2 / size), Integer.valueOf(iIntValue3 / size)));
            }
        }
        HashMap<DateTime, List<db1.a>> map3 = this.f40622r;
        if (map3 != null) {
            y6();
            int iIntValue4 = 0;
            int i14 = 0;
            int iIntValue5 = 0;
            for (Map.Entry<DateTime, List<db1.a>> entry2 : map3.entrySet()) {
                entry2.getKey();
                List<db1.a> value = entry2.getValue();
                if (value != null) {
                    for (db1.a aVar5 : value) {
                        if (aVar5 != null && aVar5.getDuration() != null && aVar5.getCount() != null) {
                            Integer duration2 = aVar5.getDuration();
                            if (duration2 != null) {
                                iIntValue5 += duration2.intValue();
                            }
                            Integer count2 = aVar5.getCount();
                            if (count2 != null) {
                                iIntValue4 += count2.intValue();
                            }
                            i14++;
                        }
                    }
                }
            }
            pVar = new o13.p(Integer.valueOf(iIntValue4 / i14), Integer.valueOf(iIntValue5 / i14));
        } else {
            pVar = null;
        }
        this.f40615k = u6(db1.g.GENERAL, mapA4);
        this.f40616l = u6(db1.g.KICKS, mapA4);
        this.f40617m = u6(db1.g.HICCUPS, mapA4);
        this.f40618n = u6(db1.g.OTHER, mapA4);
        Context context = getContext();
        if (context != null) {
            fb1.d dVar = new fb1.d(context);
            this.f40613i = dVar;
            BaseLineChart baseLineChart = this.f40605a;
            if (baseLineChart == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw null;
            }
            dVar.l(baseLineChart);
            fb1.d dVar2 = this.f40613i;
            if (dVar2 != null) {
                dVar2.f70218g = this.f40623t;
            }
            if (dVar2 != null) {
                dVar2.f70217f = new o0(this, 9);
            }
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a aVar6 = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a(context, h0.b1(this.f40619o), this);
            RecyclerView recyclerView = this.f40606b;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("movementChartChips");
                throw null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            RecyclerView recyclerView2 = this.f40606b;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("movementChartChips");
                throw null;
            }
            recyclerView2.setAdapter(aVar6);
            RecyclerView recyclerView3 = this.f40606b;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("movementChartChips");
                throw null;
            }
            recyclerView3.setPadding(1, 10, 1, 10);
        }
        if (pVar != null) {
            LinkedList linkedList = new LinkedList();
            String strValueOf = String.valueOf(((Number) pVar.f128594a).intValue());
            String string = getString(R.string.pregnancy_avg_movement);
            string.getClass();
            linkedList.offer(new a(strValueOf, string, null, 4, null));
            l3.a aVar7 = l3.f23124b;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            Number number = (Number) pVar.f128595b;
            int iIntValue6 = number.intValue();
            String string2 = requireContext().getString(R.string.no_value_card);
            string2.getClass();
            aVar7.getClass();
            String strV1 = l3.a.v1(contextRequireContext, iIntValue6, string2);
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            String strC = new oi0.h(contextRequireContext2).c(number.intValue(), false);
            if (strC.length() == 0) {
                Context context2 = getContext();
                strC = context2 != null ? context2.getString(R.string.txt_empty_page_no_data) : null;
            }
            String string3 = getString(R.string.pregnancy_avg_duration);
            string3.getClass();
            linkedList.offer(new a(strV1, string3, strC));
            if (!linkedList.isEmpty() && (composeView = this.f40611g) != null) {
                composeView.setContent(new z3.e(-1387152505, true, new a0(linkedList, this, 0)));
            }
        }
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        this.f40624v = new gb1.d(contextRequireContext3);
        RecyclerView recyclerView4 = this.f40607c;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("movementEntries");
            throw null;
        }
        recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext()));
        recyclerView4.setAdapter(this.f40624v);
        gb1.d dVar3 = this.f40624v;
        if (dVar3 != null) {
            if (this.f40622r != null) {
                w6();
                db1.m mVar = this.f40620p;
                ArrayList arrayList4 = dVar3.f76652d;
                arrayList4.clear();
                dVar3.f76651c = mVar;
                if (h0.L(arrayList)) {
                    arrayList4.addAll(h0.N0(arrayList, new gb1.e()));
                }
            }
            gb1.d dVar4 = this.f40624v;
            dVar4.getClass();
            dVar4.notifyDataSetChanged();
            gb1.d dVar5 = this.f40624v;
            dVar5.getClass();
            dVar5.f76653e = new g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/f$b;", "", "<init>", "()V", "", "START_DATE_KEY", "Ljava/lang/String;", "END_DATE_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/f$a;", "", "", "averageValue", "description", "valueContentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f40626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f40627c;

        public a(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.f40625a = str;
            this.f40626b = str2;
            this.f40627c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f40625a, aVar.f40625a) && p005kotlin.jvm.internal.s.g(this.f40626b, aVar.f40626b) && p005kotlin.jvm.internal.s.g(this.f40627c, aVar.f40627c);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f40625a.hashCode() * 31, 31, this.f40626b);
            String str = this.f40627c;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return am.j.o(this.f40627c, ")", p6.b.i("AverageMovementValue(averageValue=", this.f40625a, ", description=", this.f40626b, ", valueContentDescription="));
        }

        public /* synthetic */ a(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, (i14 & 4) != 0 ? null : str3);
        }
    }
}
