package com.garmin.android.apps.connectmobile.performance.trainingload;

import a71.o;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.view.SwitchButton;
import e23.l;
import fw.m;
import fw.p;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;
import v13.i;
import vb.h;
import vd0.s0;
import w61.r0;
import w61.x;
import x61.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/e;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment implements com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f40217t = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f40220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tz.a<a71.e> f40221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Fragment f40222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SwitchButton f40223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CustomLineChart f40224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CustomLegendView f40225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f40226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f40227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f40228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ComposeView f40229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ViewGroup f40230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f40231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f40232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f40233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FrameLayout f40234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a4.b f40235r = new a4.b(this, 3);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40236a;

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
            f40236a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingload.SevenDayTrainingLoadSummaryFragment$onDeviceChanged$1", f = "SevenDayTrainingLoadSummaryFragment.kt", l = {344}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40237a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f40239c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new c(this.f40239c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40237a;
            if (i14 == 0) {
                r.b(obj);
                x xVar = e.this.f40220c;
                if (xVar != null) {
                    this.f40237a = 1;
                    if (xVar.A4(this.f40239c, true, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/performance/trainingload/e$d", "Le32/e;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends e32.e<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DateTime f40241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DateTime f40242c;

        public d(DateTime dateTime, DateTime dateTime2) {
            this.f40241b = dateTime;
            this.f40242c = dateTime2;
        }

        @Override // e32.e
        public final void a(Boolean bool) {
            e eVar = e.this;
            x xVar = eVar.f40220c;
            if (xVar != null) {
                y0<m<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var = xVar.f183282q;
                DateTime dateTime = this.f40241b;
                DateTime dateTime2 = this.f40242c;
                w61.i.a(y0Var, xVar.F4(5, dateTime, dateTime2, false), xVar.f183281p, new s0(xVar, 7, dateTime, dateTime2)).f(eVar.getViewLifecycleOwner(), eVar.f40235r);
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.trainingload.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0752e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40243a;

        public C0752e(l lVar) {
            lVar.getClass();
            this.f40243a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40243a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40243a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b
    public final void m5(String str) {
        ge1.b.T(f0.w(this), null, null, new c(str, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f40218a = arguments.getLong("GCM_extra_start_date");
            this.f40219b = arguments.getLong("GCM_extra_end_date");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_seven_day_load_summary_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var;
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setD;
        y0 y0Var2;
        m mVar;
        super.onResume();
        if (this.f40222e == null) {
            Fragment fragmentG = getChildFragmentManager().G("DeviceFragmentTag");
            this.f40222e = fragmentG;
            if (fragmentG == null || !(fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                return;
            }
            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
            if (bVar.isAdded()) {
                x xVar = this.f40220c;
                bVar.u6((xVar == null || (y0Var2 = xVar.f183271g) == null || (mVar = (m) y0Var2.d()) == null) ? null : (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c);
                x xVar2 = this.f40220c;
                if (xVar2 == null || (y0Var = xVar2.f183272h) == null || (setD = y0Var.d()) == null) {
                    return;
                }
                bVar.v6(h0.b1(setD));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        y0 y0Var;
        y0 y0Var2;
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var3;
        y0<m<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var4;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        v22.e.g(R.color.gcm_background_hero, view2);
        View viewFindViewById = view2.findViewById(R.id.chart_acute_load);
        viewFindViewById.getClass();
        this.f40233p = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.acute_load_chart_container);
        viewFindViewById2.getClass();
        this.f40230m = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.acute_chart_title);
        TextView textView = (TextView) viewFindViewById3;
        textView.setContentDescription(textView.getContext().getString(R.string.lbl_chart_ada_content_description, textView.getText().toString()));
        viewFindViewById3.getClass();
        this.f40231n = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.acute_load_container);
        viewFindViewById4.getClass();
        this.f40228k = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.chart_switcher);
        viewFindViewById5.getClass();
        this.f40223f = (SwitchButton) viewFindViewById5;
        View view3 = this.f40233p;
        if (view3 == null) {
            s.m("acuteLoadChartView");
            throw null;
        }
        View viewFindViewById6 = view3.findViewById(R.id.acute_load_summary_chart);
        viewFindViewById6.getClass();
        this.f40224g = (CustomLineChart) viewFindViewById6;
        View view4 = this.f40233p;
        if (view4 == null) {
            s.m("acuteLoadChartView");
            throw null;
        }
        View viewFindViewById7 = view4.findViewById(R.id.view_custom_legend);
        String string = view2.getContext().getString(R.string.lbl_4w_timeline);
        string.getClass();
        ((CustomLegendView) viewFindViewById7).setChartTitle(string);
        viewFindViewById7.getClass();
        this.f40225h = (CustomLegendView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.seven_day_load_summary_scroll_view);
        viewFindViewById8.getClass();
        View viewFindViewById9 = view2.findViewById(R.id.acute_load_value);
        viewFindViewById9.getClass();
        this.f40226i = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.acute_load_message);
        viewFindViewById10.getClass();
        this.f40227j = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.acute_load_tab_no_data);
        viewFindViewById11.getClass();
        this.f40229l = (ComposeView) viewFindViewById11;
        v childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarB = j.b(childFragmentManager, childFragmentManager);
        com.garmin.android.apps.connectmobile.performance.stats.improvement.b.f40115g.getClass();
        final int i14 = 1;
        aVarB.j(R.id.tabbed_pager_optional_view, new com.garmin.android.apps.connectmobile.performance.stats.improvement.b(), "DeviceFragmentTag", 1);
        Unit unit = Unit.INSTANCE;
        aVarB.e();
        View viewFindViewById12 = view2.findViewById(R.id.tabbed_pager_optional_view);
        viewFindViewById12.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById12;
        this.f40234q = frameLayout;
        frameLayout.setVisibility(8);
        DateTime dateTime = new DateTime(this.f40218a);
        DateTime dateTime2 = new DateTime(this.f40219b);
        androidx.fragment.app.m activity = getActivity();
        final int i15 = 0;
        if (activity != null) {
            CustomLineChart customLineChart = this.f40224g;
            if (customLineChart == null) {
                s.m("sevenDayLoadSummaryChart");
                throw null;
            }
            Context context = view2.getContext();
            context.getClass();
            b71.f fVar = new b71.f(context, dateTime, dateTime2, null, 8, null);
            CustomLineChart customLineChart2 = this.f40224g;
            if (customLineChart2 == null) {
                s.m("sevenDayLoadSummaryChart");
                throw null;
            }
            b71.g gVar = new b71.g(customLineChart2, dateTime, dateTime2);
            CustomLineChart customLineChart3 = this.f40224g;
            if (customLineChart3 == null) {
                s.m("sevenDayLoadSummaryChart");
                throw null;
            }
            k00.m mVar = new k00.m(customLineChart3);
            CustomLegendView customLegendView = this.f40225h;
            if (customLegendView == null) {
                s.m("customLegendView");
                throw null;
            }
            tz.a<a71.e> aVar = new tz.a<>(customLineChart, fVar, gVar, mVar, null, customLegendView, 16, null);
            aVar.c();
            this.f40221d = aVar;
            SwitchButton switchButton = this.f40223f;
            if (switchButton == null) {
                s.m("chartSwitcher");
                throw null;
            }
            switchButton.setListener(new a71.f(this, i15));
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            LocalDate localDate2 = dateTime2.toLocalDate();
            localDate2.getClass();
            o oVar = new o(view2, localDate, localDate2);
            oVar.a(null);
            this.f40232o = oVar;
            l22.a aVar2 = new l22.a(activity);
            Resources resources = activity.getResources();
            resources.getClass();
            r0 r0Var = new r0(new k(aVar2, resources), null, null, false, 14, null);
            androidx.fragment.app.m activity2 = getActivity();
            this.f40220c = (x) (activity2 != null ? new x1(activity2, r0Var).b(p005kotlin.jvm.internal.s0.f105811a.b(x.class)) : null);
        }
        x xVar = this.f40220c;
        if (xVar != null && (y0Var4 = xVar.f183282q) != null) {
            y0Var4.f(getViewLifecycleOwner(), new C0752e(new l(this) { // from class: a71.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.trainingload.e f1771b;

                {
                    this.f1771b = this;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x003a  */
                /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0046  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    FrameLayout frameLayout2;
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.performance.trainingload.e eVar = this.f1771b;
                    switch (i16) {
                        case 0:
                            fw.m mVar2 = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar3 = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                            Fragment fragmentG = eVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                if (bVar.isAdded()) {
                                    bVar.u6(mVar2 != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar2.f73770c : null);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            Set set = (Set) obj;
                            if (set != null) {
                                com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar4 = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                                if (!(!set.isEmpty()) || set.size() < 2) {
                                    frameLayout2 = eVar.f40234q;
                                    if (frameLayout2 != null) {
                                        s.m("deviceSelectorContainer");
                                        throw null;
                                    }
                                    frameLayout2.setVisibility(8);
                                } else {
                                    Fragment fragment = eVar.f40222e;
                                    if (fragment != null && (fragment instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragment;
                                        if (bVar2.isAdded()) {
                                            bVar2.v6(h0.b1(set));
                                        }
                                    }
                                }
                            } else {
                                frameLayout2 = eVar.f40234q;
                                if (frameLayout2 != null) {
                                    s.m("deviceSelectorContainer");
                                    throw null;
                                }
                                frameLayout2.setVisibility(8);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        x xVar2 = this.f40220c;
        if (xVar2 != null && (y0Var3 = xVar2.f183272h) != null) {
            y0Var3.f(getViewLifecycleOwner(), new C0752e(new l(this) { // from class: a71.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.trainingload.e f1771b;

                {
                    this.f1771b = this;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x003a  */
                /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0046  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    FrameLayout frameLayout2;
                    int i16 = i14;
                    com.garmin.android.apps.connectmobile.performance.trainingload.e eVar = this.f1771b;
                    switch (i16) {
                        case 0:
                            fw.m mVar2 = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar3 = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                            Fragment fragmentG = eVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                if (bVar.isAdded()) {
                                    bVar.u6(mVar2 != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar2.f73770c : null);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            Set set = (Set) obj;
                            if (set != null) {
                                com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar4 = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                                if (!(!set.isEmpty()) || set.size() < 2) {
                                    frameLayout2 = eVar.f40234q;
                                    if (frameLayout2 != null) {
                                        s.m("deviceSelectorContainer");
                                        throw null;
                                    }
                                    frameLayout2.setVisibility(8);
                                } else {
                                    Fragment fragment = eVar.f40222e;
                                    if (fragment != null && (fragment instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                        com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragment;
                                        if (bVar2.isAdded()) {
                                            bVar2.v6(h0.b1(set));
                                        }
                                    }
                                }
                            } else {
                                frameLayout2 = eVar.f40234q;
                                if (frameLayout2 != null) {
                                    s.m("deviceSelectorContainer");
                                    throw null;
                                }
                                frameLayout2.setVisibility(8);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        x xVar3 = this.f40220c;
        if (xVar3 != null && (y0Var2 = xVar3.L0) != null) {
            y0Var2.f(getViewLifecycleOwner(), new d(dateTime, dateTime2));
        }
        x xVar4 = this.f40220c;
        if (xVar4 == null || (y0Var = xVar4.H0) == null) {
            return;
        }
        y0Var.f(getViewLifecycleOwner(), new C0752e(new a4.a(this, i14, dateTime, dateTime2)));
    }

    public final void u6(boolean z14) {
        SwitchButton switchButton = this.f40223f;
        if (switchButton == null) {
            s.m("chartSwitcher");
            throw null;
        }
        switchButton.setChecked(z14 ? 1 : 0);
        CustomLineChart customLineChart = this.f40224g;
        if (customLineChart == null) {
            s.m("sevenDayLoadSummaryChart");
            throw null;
        }
        boolean z15 = !z14;
        v22.e.v(customLineChart, z15);
        ViewGroup viewGroup = this.f40228k;
        if (viewGroup == null) {
            s.m("acuteLoadContainer");
            throw null;
        }
        v22.e.v(viewGroup, z15);
        TextView textView = this.f40231n;
        if (textView == null) {
            s.m("acuteChartTitle");
            throw null;
        }
        v22.e.v(textView, z15);
        o oVar = this.f40232o;
        if (oVar != null) {
            v22.e.v(oVar.f1792c, z14);
        } else {
            s.m("trainingLoadRatioViewBinder");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v6(a71.e eVar) {
        o13.p pVar;
        Throwable th3;
        List list;
        a71.e eVar2;
        List<a71.d> list2;
        boolean z14 = eVar != null ? eVar.f1760j : false;
        boolean z15 = !z14;
        boolean z16 = eVar != null ? eVar.f1762l : false;
        boolean z17 = eVar != null ? eVar.f1759i : false;
        int i14 = 1;
        boolean z18 = eVar != null ? eVar.f1765o : true;
        CustomLineChart customLineChart = this.f40224g;
        Throwable th4 = null;
        if (customLineChart == null) {
            s.m("sevenDayLoadSummaryChart");
            throw null;
        }
        v22.e.v(customLineChart, z15);
        ViewGroup viewGroup = this.f40228k;
        if (viewGroup == null) {
            s.m("acuteLoadContainer");
            throw null;
        }
        v22.e.v(viewGroup, (z14 || z18) ? false : true);
        ViewGroup viewGroup2 = this.f40230m;
        if (viewGroup2 == null) {
            s.m("acuteLoadChartContainer");
            throw null;
        }
        v22.e.v(viewGroup2, (z14 || z18) ? false : true);
        if (!z14) {
            o oVar = this.f40232o;
            if (oVar == null) {
                s.m("trainingLoadRatioViewBinder");
                throw null;
            }
            oVar.f1799j.c(z16);
        }
        SwitchButton switchButton = this.f40223f;
        if (switchButton == null) {
            s.m("chartSwitcher");
            throw null;
        }
        v22.e.v(switchButton, z17);
        tz.a<a71.e> aVar = this.f40221d;
        if (aVar != null) {
            Context context = getContext();
            qz.a.b(aVar, eVar, context != null ? context.getString(R.string.txt_empty_page_no_data) : null, 4);
        }
        boolean z19 = !z14 && z18;
        ComposeView composeView = this.f40229l;
        if (composeView == null) {
            s.m("acuteNoDataView");
            throw null;
        }
        v22.e.v(composeView, z19);
        if (z19) {
            ComposeView composeView2 = this.f40229l;
            if (composeView2 == null) {
                s.m("acuteNoDataView");
                throw null;
            }
            composeView2.setContent(new z3.e(-1029552353, true, new a71.h(this, 0)));
        }
        if ((eVar != null ? eVar.f1752b : null) == null || eVar.f1766p == null) {
            pVar = new o13.p(eVar != null ? eVar.f1752b : null, eVar != null ? eVar.f1756f : null);
        } else {
            String string = getString(R.string.string_short_dash_line_string_pattern);
            string.getClass();
            String string2 = getString(R.string.tr_factor_acute_load);
            string2.getClass();
            String string3 = getString(R.string.gcm_training_status_paused_label);
            string3.getClass();
            String string4 = getString(R.string.lbl_resume_training_status);
            string4.getClass();
            pVar = new o13.p(String.format(string, Arrays.copyOf(new Object[]{eVar.f1752b, string2}, 2)), e5.g(string3, ". ", string4));
        }
        String str = (String) pVar.f128594a;
        String str2 = (String) pVar.f128595b;
        TextView textView = this.f40226i;
        if (textView == null) {
            s.m("sevenDayLoadValue");
            throw null;
        }
        v22.e.o(textView, str);
        TextView textView2 = this.f40227j;
        if (textView2 == null) {
            s.m("sevenDayLoadMessage");
            throw null;
        }
        v22.e.o(textView2, str2);
        if (eVar == null || (list2 = eVar.f1751a) == null) {
            th3 = null;
            list = j0.f134944a;
        } else {
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                a71.d dVar = (a71.d) it.next();
                DateTime dateTime = eVar.f1766p;
                if (dateTime != null && g22.k.h(dateTime.minusDays(i14), dVar.f1742f.withTimeAtStartOfDay())) {
                    double d14 = dVar.f1737a;
                    double d15 = dVar.f1738b;
                    double d16 = dVar.f1739c;
                    double d17 = dVar.f1740d;
                    double d18 = dVar.f1741e;
                    DateTime dateTime2 = dVar.f1742f;
                    String str3 = dVar.f1743g;
                    String str4 = dVar.f1744h;
                    String str5 = dVar.f1745i;
                    String str6 = dVar.f1747k;
                    String str7 = dVar.f1748l;
                    boolean z24 = dVar.f1749m;
                    String str8 = dVar.f1750n;
                    dateTime2.getClass();
                    str3.getClass();
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    str8.getClass();
                    dVar = new a71.d(d14, d15, d16, d17, d18, dateTime2, str3, str4, str5, true, str6, str7, z24, str8);
                }
                arrayList.add(dVar);
                th4 = th4;
                it = it;
                i14 = 1;
            }
            th3 = th4;
            list = arrayList;
        }
        List list3 = list;
        if (eVar != null) {
            String str9 = eVar.f1752b;
            String str10 = eVar.f1753c;
            String str11 = eVar.f1754d;
            String str12 = eVar.f1755e;
            String str13 = eVar.f1756f;
            String str14 = eVar.f1757g;
            String str15 = eVar.f1758h;
            boolean z25 = eVar.f1759i;
            boolean z26 = eVar.f1760j;
            boolean z27 = eVar.f1761k;
            boolean z28 = eVar.f1762l;
            a71.c cVar = eVar.f1763m;
            l<? super View, Unit> lVar = eVar.f1764n;
            boolean z29 = eVar.f1765o;
            DateTime dateTime3 = eVar.f1766p;
            boolean z34 = eVar.f1767q;
            list3.getClass();
            str12.getClass();
            str13.getClass();
            str14.getClass();
            str15.getClass();
            lVar.getClass();
            eVar2 = new a71.e(list3, str9, str10, str11, str12, str13, str14, str15, z25, z26, z27, z28, cVar, lVar, z29, dateTime3, z34);
        } else {
            eVar2 = th3;
        }
        o oVar2 = this.f40232o;
        if (oVar2 == null) {
            s.m("trainingLoadRatioViewBinder");
            throw th3;
        }
        oVar2.a(eVar2);
        if (eVar == null || !eVar.f1767q) {
            FrameLayout frameLayout = this.f40234q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                s.m("deviceSelectorContainer");
                throw th3;
            }
        }
        FrameLayout frameLayout2 = this.f40234q;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        } else {
            s.m("deviceSelectorContainer");
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/e$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
