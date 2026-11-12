package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import fw.p;
import java.util.LinkedHashMap;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import w61.a0;
import w61.i;
import w61.r0;
import w61.w;
import w61.x;
import x61.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f40183k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.b f40184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CustomBarChart f40185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CustomLegendView f40186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b71.b f40187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rz.a<List<e71.f>, d00.a> f40188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f40189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ComposeView f40192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f40193j;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.trainingload.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0750b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40194a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40194a = iArr;
        }
    }

    public b() {
        super(R.layout.gcm4_exercise_load_summary_fragment);
        this.f40184a = new a4.b(this, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f40190g = arguments.getLong("GCM_extra_start_date");
            this.f40191h = arguments.getLong("GCM_extra_end_date");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        y0<w61.f<o13.p<Long, String>>> y0Var;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f40192i = (ComposeView) view2.findViewById(R.id.exercise_load_list);
        View viewFindViewById = view2.findViewById(R.id.exercise_load_info_text);
        viewFindViewById.getClass();
        this.f40193j = (TextView) viewFindViewById;
        LocalDate localDate = new LocalDate(this.f40190g);
        LocalDate localDate2 = new LocalDate(this.f40191h);
        View viewFindViewById2 = view2.findViewById(R.id.view_custom_legend);
        String string = view2.getContext().getString(R.string.lbl_daily_totals);
        string.getClass();
        ((CustomLegendView) viewFindViewById2).setChartTitle(string);
        viewFindViewById2.getClass();
        this.f40186c = (CustomLegendView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.exercise_load_summary_chart);
        viewFindViewById3.getClass();
        this.f40185b = (CustomBarChart) viewFindViewById3;
        CustomBarChart customBarChart = this.f40185b;
        if (customBarChart == null) {
            s.m("barChart");
            throw null;
        }
        this.f40187d = new b71.b(customBarChart, localDate, localDate2);
        CustomBarChart customBarChart2 = this.f40185b;
        if (customBarChart2 == null) {
            s.m("barChart");
            throw null;
        }
        Context context = view2.getContext();
        context.getClass();
        b71.a aVar = new b71.a(context, localDate, localDate2);
        b71.b bVar = this.f40187d;
        if (bVar == null) {
            s.m("chartRenderer");
            throw null;
        }
        CustomBarChart customBarChart3 = this.f40185b;
        if (customBarChart3 == null) {
            s.m("barChart");
            throw null;
        }
        b71.d dVar = new b71.d(customBarChart3);
        CustomLegendView customLegendView = this.f40186c;
        if (customLegendView == null) {
            s.m("customLegendView");
            throw null;
        }
        rz.a<List<e71.f>, d00.a> aVar2 = new rz.a<>(customBarChart2, aVar, bVar, dVar, null, customLegendView, 16, null);
        this.f40188e = aVar2;
        aVar2.c();
        m activity = getActivity();
        if (activity != null) {
            l22.a aVar3 = new l22.a(activity);
            Resources resources = activity.getResources();
            resources.getClass();
            r0 r0Var = new r0(new k(aVar3, resources), null, null, false, 14, null);
            m activity2 = getActivity();
            x xVar = (x) (activity2 != null ? new x1(activity2, r0Var).b(s0.f105811a.b(x.class)) : null);
            this.f40189f = xVar;
            if (xVar != null) {
                long j8 = this.f40190g;
                long j14 = this.f40191h;
                y0<fw.m<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var2 = xVar.f183282q;
                DateTime dateTime = new DateTime(j8);
                DateTime dateTime2 = new DateTime(j14);
                LinkedHashMap linkedHashMap = xVar.f183286w;
                o13.p pVar = new o13.p(dateTime, dateTime2);
                androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) linkedHashMap.get(pVar);
                if (s0Var == null) {
                    DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
                    dateTimeFormatterForPattern.getClass();
                    List listK = p13.x.k("trainingEffectLabel", "activityTrainingLoad", "startLocal", "distance", "activityType", "activitySubType", "deviceId", "parentId", "trainingEffectLabelSrvrCalc", "activityTrainingLoadSrvrCalc");
                    w0 w0Var = new w0();
                    ge1.b.T(v1.a(xVar), null, null, new a0(dateTime, dateTimeFormatterForPattern, dateTime2, listK, true, w0Var, null), 3);
                    linkedHashMap.put(pVar, w0Var);
                    s0Var = w0Var;
                }
                i.a(y0Var2, s0Var, null, new w(xVar, 2)).f(getViewLifecycleOwner(), this.f40184a);
            }
            x xVar2 = this.f40189f;
            if (xVar2 == null || (y0Var = xVar2.C) == null) {
                return;
            }
            y0Var.f(activity, new w61.g(new a03.f(activity, 4)));
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void u6(e71.g gVar) {
        List<e71.f> list = gVar != null ? gVar.f63305a : null;
        if (list == null) {
            list = j0.f134944a;
        }
        if (list.isEmpty()) {
            b71.b bVar = this.f40187d;
            if (bVar == null) {
                s.m("chartRenderer");
                throw null;
            }
            h00.c cVar = bVar.f16310a;
            cVar.b();
            cVar.f80607k = false;
            cVar.f80608l = false;
            b71.b.C0231b c0231b = bVar.f16311b;
            c0231b.f();
            c0231b.g();
            c0231b.h();
            rz.a<List<e71.f>, d00.a> aVar = this.f40188e;
            if (aVar == null) {
                s.m("chartConfigurator");
                throw null;
            }
            aVar.c();
        } else {
            List listG0 = h0.G0(list);
            ComposeView composeView = this.f40192i;
            if (composeView != null) {
                composeView.setContent(new z3.e(1984289866, true, new a71.a(listG0, this, 0)));
            }
        }
        rz.a<List<e71.f>, d00.a> aVar2 = this.f40188e;
        if (aVar2 == null) {
            s.m("chartConfigurator");
            throw null;
        }
        qz.a.b(aVar2, list, getString(R.string.common_no_data), 4);
        TextView textView = this.f40193j;
        if (textView != null) {
            v22.e.o(textView, gVar != null ? gVar.f63306b : null);
        } else {
            s.m("exerciseLoadInfoText");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/b$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
