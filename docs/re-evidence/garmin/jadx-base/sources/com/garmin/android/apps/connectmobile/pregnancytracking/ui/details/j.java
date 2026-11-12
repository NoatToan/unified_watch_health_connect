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
import c2.t2;
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
import fb1.e0;
import fb1.v;
import fb1.y;
import fb1.z;
import gg1.h0;
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
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p3.p2;
import r22.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/j;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$b;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/c$a;", "<init>", "()V", "a", "c", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends Fragment implements l.b, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f40667v = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseLineChart f40668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f40669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f40670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f40671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f40672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f40673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f40674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f40675h = new w1(s0.f105811a.b(gb1.t.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public db1.s f40676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f40677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hz.b f40678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f40679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f40680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f40681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f40682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f40683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public gb1.f f40684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public db1.m f40685r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v f40686t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/j$a;", "", "", "averageValue", "description", "descriptionWithoutAbbreviation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f40688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f40689c;

        public a(String str, String str2, String str3) {
            com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
            this.f40687a = str;
            this.f40688b = str2;
            this.f40689c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40687a.equals(aVar.f40687a) && this.f40688b.equals(aVar.f40688b) && this.f40689c.equals(aVar.f40689c);
        }

        public final int hashCode() {
            return this.f40689c.hashCode() + wr.g.j(this.f40687a.hashCode() * 31, 31, this.f40688b);
        }

        public final String toString() {
            return am.j.o(this.f40689c, ")", p6.b.i("AverageGlucoseValue(averageValue=", this.f40687a, ", description=", this.f40688b, ", descriptionWithoutAbbreviation="));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/j$c;", "Ljava/util/Comparator;", "Lhz/d;", "Lkotlin/Comparator;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
        public final /* synthetic */ Fragment f40690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40690a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40690a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40691a = aVar;
            this.f40692b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40691a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40692b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f40693a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40693a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public j() {
        j0 j0Var = j0.f134944a;
        this.f40679l = j0Var;
        this.f40680m = j0Var;
        this.f40681n = j0Var;
        this.f40682o = j0Var;
        this.f40683p = new LinkedHashSet();
    }

    public static String v6(Double d14) {
        return d14 == null ? "" : String.valueOf(Math.round(d14.doubleValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A6() throws Throwable {
        String strV6;
        String strV7;
        String strV8;
        List<db1.r> listB;
        List<db1.r> listB2;
        List<db1.r> listB3;
        List<db1.r> listB4;
        List<db1.r> listB5;
        int i14 = 1;
        Integer num = 1;
        w1 w1Var = this.f40675h;
        gb1.t.a aVar = (gb1.t.a) ((gb1.t) w1Var.getValue()).f76709a.get(z6());
        Throwable th3 = null;
        db1.s sVar = aVar != null ? aVar.f76723c : null;
        this.f40676i = sVar;
        if (sVar != null && (listB5 = sVar.b()) != null && listB5.isEmpty()) {
            View view2 = this.f40671d;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("noDataView");
                throw null;
            }
            view2.setVisibility(0);
            View view3 = this.f40673f;
            if (view3 == null) {
                p005kotlin.jvm.internal.s.m("chartContainer");
                throw null;
            }
            view3.setVisibility(8);
            View view4 = this.f40672e;
            if (view4 != null) {
                view4.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("entriesTitle");
                throw null;
            }
        }
        View view5 = this.f40671d;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("noDataView");
            throw null;
        }
        view5.setVisibility(8);
        View view6 = this.f40673f;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("chartContainer");
            throw null;
        }
        view6.setVisibility(0);
        View view7 = this.f40672e;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("entriesTitle");
            throw null;
        }
        view7.setVisibility(0);
        h0 h0VarI = i52.a.i();
        db1.s sVar2 = this.f40676i;
        if (sVar2 != null && (listB4 = sVar2.b()) != null) {
            for (db1.r rVar : listB4) {
                try {
                    Double value = rVar.getValue();
                    if (value != null) {
                        if (h0VarI == h0.MILLI_MOLES_PER_LITER) {
                            tb1.e.a aVar2 = tb1.e.f163745a;
                            double dDoubleValue = value.doubleValue();
                            aVar2.getClass();
                            value = Double.valueOf(tb1.e.a.i(dDoubleValue));
                        }
                        rVar.u(value);
                    }
                } catch (IllegalArgumentException e4) {
                    e4.toString();
                }
            }
        }
        db1.s sVar3 = this.f40676i;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        if (sVar3 != null && (listB3 = sVar3.b()) != null) {
            for (db1.r rVar2 : listB3) {
                LocalDate calendarDate = rVar2.getCalendarDate();
                Object dateTimeAtStartOfDay = calendarDate != null ? calendarDate.toDateTimeAtStartOfDay() : th3;
                if (dateTimeAtStartOfDay == null || rVar2.getLogType() == null) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "PregnancyReportsViewModel", "CalendarDate, Value or LogType in UserGlucoseDTO is null. Ignoring data.");
                } else {
                    ArrayList arrayList = (ArrayList) map4.get(rVar2.getLogType());
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Double value2 = rVar2.getValue();
                    value2.getClass();
                    arrayList.add(new o13.p(dateTimeAtStartOfDay, value2));
                    db1.d logType = rVar2.getLogType();
                    logType.getClass();
                    map4.put(logType, arrayList);
                }
                th3 = th3;
                i14 = i14;
            }
        }
        int i15 = i14;
        Throwable th4 = th3;
        for (Map.Entry entry : map4.entrySet()) {
            db1.d dVar = (db1.d) entry.getKey();
            Iterator it = ((ArrayList) entry.getValue()).iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                B b14 = ((o13.p) next).f128595b;
                if (map.containsKey(dVar)) {
                    Double d14 = (Double) map.get(dVar);
                    map.put(dVar, Double.valueOf(d14 != null ? ((Number) b14).doubleValue() + d14.doubleValue() : 0.0d));
                    Integer num2 = (Integer) map2.get(dVar);
                    map2.put(dVar, Integer.valueOf(num2 != null ? num2.intValue() + 1 : i15));
                } else {
                    map.put(dVar, b14);
                    map2.put(dVar, num);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            db1.d dVar2 = (db1.d) entry2.getKey();
            double dDoubleValue2 = ((Number) entry2.getValue()).doubleValue();
            if (map2.containsKey(dVar2)) {
                Object obj = map2.get(dVar2);
                obj.getClass();
                map3.put(dVar2, Double.valueOf(dDoubleValue2 / ((double) ((Number) obj).intValue())));
            }
        }
        db1.s sVar4 = this.f40676i;
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        if (sVar4 != null && (listB2 = sVar4.b()) != null) {
            for (db1.r rVar3 : listB2) {
                LocalDate calendarDate2 = rVar3.getCalendarDate();
                Object dateTimeAtStartOfDay2 = calendarDate2 != null ? calendarDate2.toDateTimeAtStartOfDay() : th4;
                if (dateTimeAtStartOfDay2 == null || rVar3.getLogType() == null) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var2, "PregnancyReportsViewModel", "CalendarDate, Value or LogType in UserGlucoseDTO is null. Ignoring data.");
                } else {
                    ArrayList arrayList2 = (ArrayList) map8.get(rVar3.getLogType());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    Double value3 = rVar3.getValue();
                    value3.getClass();
                    arrayList2.add(new o13.p(dateTimeAtStartOfDay2, value3));
                    db1.d logType2 = rVar3.getLogType();
                    logType2.getClass();
                    map8.put(logType2, arrayList2);
                }
            }
        }
        Iterator it3 = map8.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            db1.d dVar3 = (db1.d) entry3.getKey();
            Iterator it4 = ((ArrayList) entry3.getValue()).iterator();
            it4.getClass();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                next2.getClass();
                o13.p pVar = (o13.p) next2;
                B b15 = pVar.f128595b;
                Object obj2 = pVar.f128594a;
                if (map5.containsKey(obj2)) {
                    Double d15 = (Double) map5.get(obj2);
                    map5.put(obj2, Double.valueOf(d15 != null ? ((Number) b15).doubleValue() + d15.doubleValue() : 0.0d));
                    Integer num3 = (Integer) map6.get(obj2);
                    map6.put(obj2, Integer.valueOf(num3 != null ? num3.intValue() + 1 : i15));
                } else {
                    map5.put(obj2, b15);
                    map6.put(obj2, num);
                }
            }
            HashMap map9 = new HashMap();
            for (Map.Entry entry4 : map5.entrySet()) {
                DateTime dateTime = (DateTime) entry4.getKey();
                double dDoubleValue3 = ((Number) entry4.getValue()).doubleValue();
                Object obj3 = map6.get(dateTime);
                obj3.getClass();
                map9.put(dateTime, Double.valueOf(dDoubleValue3 / ((double) ((Number) obj3).intValue())));
                num = num;
                it3 = it3;
            }
            map7.put(dVar3, map9);
            map5.clear();
            map6.clear();
        }
        db1.s sVar5 = this.f40676i;
        ArrayList arrayList3 = new ArrayList();
        HashMap map10 = new HashMap();
        if (sVar5 != null && (listB = sVar5.b()) != null) {
            for (db1.r rVar4 : listB) {
                LocalDate calendarDate3 = rVar4.getCalendarDate();
                Object dateTimeAtStartOfDay3 = calendarDate3 != null ? calendarDate3.toDateTimeAtStartOfDay() : th4;
                if (dateTimeAtStartOfDay3 == null || rVar4.getLogType() == null) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var3, "PregnancyReportsViewModel", "CalendarDate, Value or LogType in UserGlucoseDTO is null. Ignoring data.");
                } else {
                    ArrayList arrayList4 = (ArrayList) map10.get(dateTimeAtStartOfDay3);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    Double value4 = rVar4.getValue();
                    value4.getClass();
                    arrayList4.add(value4);
                    map10.put(dateTimeAtStartOfDay3, arrayList4);
                }
            }
        }
        for (Map.Entry entry5 : map10.entrySet()) {
            DateTime dateTime2 = (DateTime) entry5.getKey();
            ArrayList arrayList5 = (ArrayList) entry5.getValue();
            int size = arrayList5.size();
            Iterator it5 = arrayList5.iterator();
            it5.getClass();
            double dDoubleValue4 = 0.0d;
            while (it5.hasNext()) {
                Object next3 = it5.next();
                next3.getClass();
                dDoubleValue4 += ((Number) next3).doubleValue();
            }
            if (!arrayList5.isEmpty()) {
                arrayList3.add(new gb1.a(dateTime2, Double.valueOf(dDoubleValue4 / ((double) size)), Integer.valueOf(size)));
            }
        }
        db1.d dVar4 = db1.d.BEFOREMEAL;
        this.f40679l = w6(dVar4, map7);
        db1.d dVar5 = db1.d.AFTERMEAL;
        this.f40680m = w6(dVar5, map7);
        db1.d dVar6 = db1.d.BEFOREBED;
        this.f40681n = w6(dVar6, map7);
        db1.d dVar7 = db1.d.OTHER;
        this.f40682o = w6(dVar7, map7);
        Context context = getContext();
        if (context != null) {
            y yVar = new y(context);
            this.f40677j = yVar;
            BaseLineChart baseLineChart = this.f40668a;
            if (baseLineChart == null) {
                p005kotlin.jvm.internal.s.m("chart");
                throw th4;
            }
            yVar.l(baseLineChart);
            y yVar2 = this.f40677j;
            if (yVar2 != null) {
                yVar2.f70319g = new o0(this, 10);
            }
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c cVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c(context, p13.h0.b1(this.f40683p), this);
            RecyclerView recyclerView = this.f40669b;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("glucoseChartChips");
                throw th4;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            RecyclerView recyclerView2 = this.f40669b;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("glucoseChartChips");
                throw th4;
            }
            recyclerView2.setAdapter(cVar);
            RecyclerView recyclerView3 = this.f40669b;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("glucoseChartChips");
                throw th4;
            }
            recyclerView3.setPadding(i15, 10, i15, 10);
            RecyclerView recyclerView4 = this.f40669b;
            if (recyclerView4 == null) {
                p005kotlin.jvm.internal.s.m("glucoseChartChips");
                throw th4;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            recyclerView4.addItemDecoration(new z0(contextRequireContext, Integer.valueOf(R.dimen.spacing_small), null, null, null));
        }
        h0 h0VarI2 = i52.a.i();
        h0 h0Var = h0.MILLI_GRAMS_PER_DECILITER;
        String string = h0VarI2 == h0Var ? requireContext().getString(R.string.pregnancy_mgdl) : requireContext().getString(R.string.pregnancy_mmol);
        string.getClass();
        String string2 = i52.a.i() == h0Var ? requireContext().getString(R.string.lbl_mgdl_long) : requireContext().getString(R.string.lbl_mmol_l_long);
        string2.getClass();
        String str = "";
        if (getActivity() != null) {
            String strV9 = map3.containsKey(dVar4) ? v6((Double) map3.get(dVar4)) : "";
            strV7 = map3.containsKey(dVar5) ? v6((Double) map3.get(dVar5)) : "";
            strV8 = map3.containsKey(dVar6) ? v6((Double) map3.get(dVar6)) : "";
            str = strV9;
            strV6 = map3.containsKey(dVar7) ? v6((Double) map3.get(dVar7)) : "";
        } else {
            strV6 = "";
            strV7 = strV6;
            strV8 = strV7;
        }
        if (str.length() == 0) {
            getString(R.string.symbol_double_dash);
        }
        if (strV7.length() == 0) {
            getString(R.string.symbol_double_dash);
        }
        if (strV8.length() == 0) {
            getString(R.string.symbol_double_dash);
        }
        if (strV6.length() == 0) {
            getString(R.string.symbol_double_dash);
        }
        LinkedList linkedList = new LinkedList();
        if (map3.containsKey(dVar4)) {
            String string3 = getString(R.string.pregnancy_before_meal_avg);
            string3.getClass();
            String string4 = getString(R.string.lbl_average_before_meal);
            string4.getClass();
            linkedList.offer(new a(str, string3, string4));
        }
        if (map3.containsKey(dVar5)) {
            String string5 = getString(R.string.pregnancy_after_meal_avg);
            string5.getClass();
            String string6 = getString(R.string.lbl_average_after_meal);
            string6.getClass();
            linkedList.offer(new a(strV7, string5, string6));
        }
        if (map3.containsKey(dVar6)) {
            String string7 = getString(R.string.pregnancy_before_bed_avg);
            string7.getClass();
            String string8 = getString(R.string.lbl_average_before_bed);
            string8.getClass();
            linkedList.offer(new a(strV8, string7, string8));
        }
        if (map3.containsKey(dVar7)) {
            String string9 = getString(R.string.pregnancy_other_avg);
            string9.getClass();
            String string10 = getString(R.string.lbl_average_other);
            string10.getClass();
            linkedList.offer(new a(strV6, string9, string10));
        }
        if (!linkedList.isEmpty()) {
            ArrayList arrayListQ = p13.h0.Q(p13.h0.b1(linkedList), 2);
            ComposeView composeView = this.f40674g;
            if (composeView != null) {
                composeView.setContent(new z3.e(1235231389, true, new e0(arrayListQ, this, string, string2, 0)));
            }
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        this.f40684q = new gb1.f(contextRequireContext2);
        RecyclerView recyclerView5 = this.f40670c;
        if (recyclerView5 == null) {
            p005kotlin.jvm.internal.s.m("glucoseEntries");
            throw th4;
        }
        recyclerView5.setLayoutManager(new LinearLayoutManager(recyclerView5.getContext()));
        recyclerView5.setAdapter(this.f40684q);
        gb1.f fVar = this.f40684q;
        if (fVar != null) {
            if (this.f40676i != null) {
                z6();
                db1.m mVar = this.f40685r;
                ArrayList arrayList6 = fVar.f76663d;
                arrayList6.clear();
                fVar.f76662c = mVar;
                if (p13.h0.L(arrayList3)) {
                    arrayList6.addAll(p13.h0.N0(arrayList3, new gb1.g()));
                }
            }
            gb1.f fVar2 = this.f40684q;
            fVar2.getClass();
            fVar2.notifyDataSetChanged();
            gb1.f fVar3 = this.f40684q;
            fVar3.getClass();
            fVar3.f76664e = new k(this);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.b
    public final void C2() throws Throwable {
        A6();
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
        hz.b bVar = this.f40678k;
        if (bVar != null) {
            ArrayList arrayListD1 = p13.h0.d1(this.f40679l);
            ArrayList arrayListD2 = p13.h0.d1(this.f40680m);
            ArrayList arrayListD3 = p13.h0.d1(this.f40681n);
            ArrayList arrayListD4 = p13.h0.d1(this.f40682o);
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
            y yVar = this.f40677j;
            if (yVar != null) {
                Context context = yVar.f134441a;
                db1.m mVar = this.f40685r;
                LineChart lineChart = yVar.f134442b;
                if (lineChart != null) {
                    DateTime dateTime = bVar.f86378a;
                    DateTime dateTime2 = bVar.f86379b;
                    if (dateTime == null || dateTime2 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayListC0 = p13.h0.C0(p13.h0.C0(p13.h0.C0(arrayListD1, arrayListD2), arrayListD3), arrayListD4);
                    XAxis xAxis = lineChart.getXAxis();
                    xAxis.getClass();
                    xAxis.removeAllLimitLines();
                    LineChart lineChart2 = yVar.f134442b;
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
                    for (Object obj : arrayListC0) {
                        ArrayList arrayList3 = arrayListC0;
                        if (((hz.d) obj).f86389b > 0.0f) {
                            arrayList2.add(obj);
                        }
                        arrayListC0 = arrayList3;
                    }
                    ArrayList arrayList4 = arrayListC0;
                    Iterator it = arrayList2.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            float f14 = ((hz.d) next).f86389b;
                            while (true) {
                                Object next3 = it.next();
                                Iterator it3 = it;
                                float f15 = ((hz.d) next3).f86389b;
                                if (Float.compare(f14, f15) > 0) {
                                    f14 = f15;
                                    next = next3;
                                }
                                if (!it3.hasNext()) {
                                    break;
                                } else {
                                    it = it3;
                                }
                            }
                        }
                    } else {
                        next = null;
                    }
                    hz.d dVar = (hz.d) next;
                    float f16 = 1.0f;
                    float f17 = dVar != null ? dVar.f86389b - 1.0f : 50.0f;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        float f18 = f16;
                        Object next4 = it4.next();
                        Iterator it5 = it4;
                        if (((hz.d) next4).f86389b > 0.0f) {
                            arrayList5.add(next4);
                        }
                        it4 = it5;
                        f16 = f18;
                    }
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
                                } else {
                                    it6 = it7;
                                }
                            }
                        }
                    } else {
                        next2 = null;
                    }
                    hz.d dVar2 = (hz.d) next2;
                    nz.b.a(axisLeft, f17, dVar2 != null ? dVar2.f86389b + f19 : 150.0f);
                    yVar.f134437e = new y.b(yVar, dateTime, mVar);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    if (!arrayListD1.isEmpty()) {
                        db1.d dVar3 = db1.d.BEFOREMEAL;
                        hz.h hVarO = yVar.o(arrayListD1, dateTime, dVar3);
                        hVarO.setHighlightEnabled(true);
                        q6.f.t(context, dVar3.f59001b, arrayList6);
                        String string = context.getString(dVar3.f59000a);
                        string.getClass();
                        arrayList7.add(string);
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO);
                    }
                    if (!arrayListD2.isEmpty()) {
                        db1.d dVar4 = db1.d.AFTERMEAL;
                        hz.h hVarO2 = yVar.o(arrayListD2, dateTime, dVar4);
                        hVarO2.setHighlightEnabled(true);
                        q6.f.t(context, dVar4.f59001b, arrayList6);
                        String string2 = context.getString(dVar4.f59000a);
                        string2.getClass();
                        arrayList7.add(string2);
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO2);
                    }
                    if (!arrayListD3.isEmpty()) {
                        db1.d dVar5 = db1.d.BEFOREBED;
                        hz.h hVarO3 = yVar.o(arrayListD3, dateTime, dVar5);
                        hVarO3.setHighlightEnabled(true);
                        q6.f.t(context, dVar5.f59001b, arrayList6);
                        String string3 = context.getString(dVar5.f59000a);
                        string3.getClass();
                        arrayList7.add(string3);
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO3);
                    }
                    if (!arrayListD4.isEmpty()) {
                        db1.d dVar6 = db1.d.OTHER;
                        hz.h hVarO4 = yVar.o(arrayListD4, dateTime, dVar6);
                        hVarO4.setHighlightEnabled(true);
                        q6.f.t(context, dVar6.f59001b, arrayList6);
                        String string4 = context.getString(dVar6.f59000a);
                        string4.getClass();
                        arrayList7.add(string4);
                        arrayList8.add(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                        arrayList.add(hVarO4);
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.add(yVar.n(j0.f134944a, null));
                        lineChart.setTouchEnabled(false);
                        LineChart lineChart3 = yVar.f134442b;
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
                        LineChart lineChart4 = yVar.f134442b;
                        if (lineChart4 != null) {
                            z zVar = new z(context, lineChart4, arrayList6, arrayList7, arrayList8);
                            zVar.a();
                            if (lineChart4 instanceof BaseLineChart) {
                                ((BaseLineChart) lineChart4).a(zVar.f153412b, zVar.f153413c);
                            }
                        }
                    }
                    yVar.j(new LineData(y.p(dateTime, dateTime2), arrayList));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        this.f40685r = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
        return layoutInflater.inflate(R.layout.fragment_pregnancy_reports_blood_glucose, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws Throwable {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.chart_view);
        viewFindViewById.getClass();
        this.f40668a = (BaseLineChart) viewFindViewById;
        this.f40686t = new v(view2.findViewById(R.id.glucose_chart_highlight));
        View viewFindViewById2 = view2.findViewById(R.id.glucose_chart_chips);
        viewFindViewById2.getClass();
        this.f40669b = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.glucose_entries_title);
        viewFindViewById3.getClass();
        this.f40672e = viewFindViewById3;
        this.f40674g = (ComposeView) view2.findViewById(R.id.glucose_stats);
        View viewFindViewById4 = view2.findViewById(R.id.no_data_lbl);
        viewFindViewById4.getClass();
        this.f40671d = viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.glucose_report_chart_container);
        viewFindViewById5.getClass();
        this.f40673f = viewFindViewById5;
        LocalDate localDateZ6 = z6();
        DateTime dateTimeAtStartOfDay = y6().toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = y6().toDateTimeAtStartOfDay();
        this.f40678k = new hz.c(localDateZ6, null, dateTimeAtStartOfDay2 != null ? dateTimeAtStartOfDay2.toDateTime(DateTimeZone.UTC) : null, dateTimeAtStartOfDay, 0, 18, null).a();
        View viewFindViewById6 = view2.findViewById(R.id.glucose_entries);
        viewFindViewById6.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.f40670c = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f40670c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("glucoseEntries");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        A6();
    }

    public final void u6(t2 t2Var, a aVar, String str, String str2, p3.m mVar, int i14) {
        int i15;
        t2 t2Var2 = t2Var;
        p3.o0 o0VarE = mVar.E(1150099163);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (aVar != null) {
                o0VarE.C(1650172990);
                int i16 = i15;
                x0 x0Var = x0.f111346a;
                String str3 = aVar.f40687a;
                String str4 = aVar.f40688b;
                String str5 = aVar.f40689c;
                int i17 = b92.a.f16960b;
                x0Var.a(((i16 << 6) & 57344) | (i16 & 14) | (x0.f111348c << 24), 52, wz1.a.a(str3 + StringUtils.SPACE + str2 + StringUtils.SPACE + str5), t2Var, null, null, str3, str4, str, null, o0VarE);
                t2Var2 = t2Var;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1650465599);
                x0.f111346a.h(t2Var2, o0VarE, (i15 & 14) | (x0.f111348c << 3));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(this, t2Var2, aVar, str, str2, i14, 18);
        }
    }

    public final ArrayList w6(db1.d dVar, HashMap map) {
        ArrayList arrayList = new ArrayList();
        HashMap map2 = (HashMap) map.get(dVar);
        if (map2 != null) {
            for (DateTime dateTimeAtStartOfDay = z6().toDateTimeAtStartOfDay(); dateTimeAtStartOfDay.isBefore(y6().toDateTimeAtStartOfDay().plusDays(1)); dateTimeAtStartOfDay = dateTimeAtStartOfDay.plusDays(1)) {
                if (map2.containsKey(dateTimeAtStartOfDay)) {
                    Double d14 = (Double) map2.get(dateTimeAtStartOfDay);
                    arrayList.add(new hz.d(dateTimeAtStartOfDay, d14 != null ? (float) d14.doubleValue() : -1.0f));
                } else {
                    arrayList.add(new hz.d(dateTimeAtStartOfDay, -1.0f));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f40683p.add(dVar);
        }
        Collections.sort(arrayList, new c());
        return arrayList;
    }

    public final LocalDate y6() {
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

    public final LocalDate z6() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/j$b;", "", "<init>", "()V", "", "START_DATE_KEY", "Ljava/lang/String;", "END_DATE_KEY", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
