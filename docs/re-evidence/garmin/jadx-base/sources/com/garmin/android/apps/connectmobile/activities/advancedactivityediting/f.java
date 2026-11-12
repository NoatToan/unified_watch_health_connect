package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bm.o0;
import bm.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.github.mikephil.chartingv2.charts.LineChart;
import e23.l;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28907h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f28908i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f28909a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.class), new d(this), new C0443f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LineChart f28910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f28911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f28912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f28913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public im.b f28914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f28915g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28916a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28916a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f28917a;

        public c(l lVar) {
            lVar.getClass();
            this.f28917a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f28917a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28917a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f28918a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f28918a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f28919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f28920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f28919a = aVar;
            this.f28920b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f28919a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f28920b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0443f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0443f(Fragment fragment) {
            super(0);
            this.f28921a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f28921a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f28908i = gt2.b.f79005a.h("TrimActivityFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_trim_activity, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ht.a.f85464a.getClass();
        ht.a.a(null, "Time");
        this.f28915g = (ComposeView) view2.findViewById(R.id.trim_activity_metrics);
        View viewFindViewById = view2.findViewById(R.id.trim_activity_chart_view);
        viewFindViewById.getClass();
        this.f28910b = (LineChart) viewFindViewById;
        this.f28911c = view2.findViewById(R.id.trim_activity_chart_header_view);
        this.f28912d = (LinearLayout) view2.findViewById(R.id.chart_legend_container);
        View viewFindViewById2 = view2.findViewById(R.id.trim_activity_chart_container);
        viewFindViewById2.getClass();
        y6();
        m activity = getActivity();
        if (activity == null || (hVar = v6().f28869g) == null) {
            return;
        }
        g22.e.l(this);
        final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV6 = v6();
        final int i14 = 0;
        dVarV6.D4(hVar.f29448a).f(activity, new c(new l(this) { // from class: bm.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18829b;

            {
                this.f18829b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18829b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = fVar.v6();
                        Context context = fVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV7.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context != null) {
                            fz.c cVar = fz.c.TIME;
                            cVar.getClass();
                            im.b bVarA = m.a(dVarV7.f28867e, dVarV7.f28869g, context, cVar, dVarV7.f28871i);
                            fVar.f28914f = bVarA;
                            if (bVarA != null) {
                                q qVar = new q(context, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar);
                                fVar.f28913e = qVar;
                                qVar.f145356k = fVar.f28912d;
                                qVar.o();
                                LineChart lineChart = fVar.f28910b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar.l(lineChart);
                                View view3 = fVar.f28911c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV7.f28878p.getValue()).m(f113511u1);
                                dVarV7.y4(fVar.getContext(), bVarA);
                            }
                        }
                        g22.e.f(fVar);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        ((y0) dVarV6.f28879q.getValue()).f(activity, new c(new l(this) { // from class: bm.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18829b;

            {
                this.f18829b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18829b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = fVar.v6();
                        Context context = fVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV7.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context != null) {
                            fz.c cVar = fz.c.TIME;
                            cVar.getClass();
                            im.b bVarA = m.a(dVarV7.f28867e, dVarV7.f28869g, context, cVar, dVarV7.f28871i);
                            fVar.f28914f = bVarA;
                            if (bVarA != null) {
                                q qVar = new q(context, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar);
                                fVar.f28913e = qVar;
                                qVar.f145356k = fVar.f28912d;
                                qVar.o();
                                LineChart lineChart = fVar.f28910b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar.l(lineChart);
                                View view3 = fVar.f28911c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV7.f28878p.getValue()).m(f113511u1);
                                dVarV7.y4(fVar.getContext(), bVarA);
                            }
                        }
                        g22.e.f(fVar);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        ((y0) dVarV6.f28880r.getValue()).f(activity, new c(new l(this) { // from class: bm.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18829b;

            {
                this.f18829b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18829b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = fVar.v6();
                        Context context = fVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV7.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context != null) {
                            fz.c cVar = fz.c.TIME;
                            cVar.getClass();
                            im.b bVarA = m.a(dVarV7.f28867e, dVarV7.f28869g, context, cVar, dVarV7.f28871i);
                            fVar.f28914f = bVarA;
                            if (bVarA != null) {
                                q qVar = new q(context, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar);
                                fVar.f28913e = qVar;
                                qVar.f145356k = fVar.f28912d;
                                qVar.o();
                                LineChart lineChart = fVar.f28910b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar.l(lineChart);
                                View view3 = fVar.f28911c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV7.f28878p.getValue()).m(f113511u1);
                                dVarV7.y4(fVar.getContext(), bVarA);
                            }
                        }
                        g22.e.f(fVar);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 3;
        ((y0) dVarV6.f28881t.getValue()).f(activity, new c(new l(this) { // from class: bm.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18829b;

            {
                this.f18829b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18829b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = fVar.v6();
                        Context context = fVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV7.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context != null) {
                            fz.c cVar = fz.c.TIME;
                            cVar.getClass();
                            im.b bVarA = m.a(dVarV7.f28867e, dVarV7.f28869g, context, cVar, dVarV7.f28871i);
                            fVar.f28914f = bVarA;
                            if (bVarA != null) {
                                q qVar = new q(context, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar);
                                fVar.f28913e = qVar;
                                qVar.f145356k = fVar.f28912d;
                                qVar.o();
                                LineChart lineChart = fVar.f28910b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar.l(lineChart);
                                View view3 = fVar.f28911c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV7.f28878p.getValue()).m(f113511u1);
                                dVarV7.y4(fVar.getContext(), bVarA);
                            }
                        }
                        g22.e.f(fVar);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                        fVar.y6();
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 0;
        dVarV6.F4().f(activity, new c(new l(this) { // from class: bm.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18838b;

            {
                this.f18838b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                List<o20.a> list;
                q qVar;
                Integer num = (Integer) obj;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18838b;
                        q qVar2 = fVar.f28913e;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = dVarV6;
                        if (num != null) {
                            if (qVar2 != null) {
                                int iIntValue = num.intValue();
                                qVar2.f18849m = iIntValue;
                                x xVar = qVar2.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            fVar.w6();
                            dVar.y4(fVar.getContext(), fVar.f28914f);
                        } else {
                            if (qVar2 != null) {
                                qVar2.f18849m = 0;
                                x xVar2 = qVar2.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar2 != null) {
                                qVar2.z();
                            }
                            dVar.y4(fVar.getContext(), fVar.f28914f);
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = this.f18838b;
                        if (num != null) {
                            q qVar3 = fVar2.f28913e;
                            if (qVar3 != null) {
                                int iIntValue2 = num.intValue();
                                qVar3.f18850n = iIntValue2;
                                x xVar3 = qVar3.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            fVar2.w6();
                            dVarV6.y4(fVar2.getContext(), fVar2.f28914f);
                        } else {
                            im.b bVar = fVar2.f28914f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = fVar2.f28913e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i19 = 1;
        dVarV6.E4().f(activity, new c(new l(this) { // from class: bm.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18838b;

            {
                this.f18838b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                List<o20.a> list;
                q qVar;
                Integer num = (Integer) obj;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18838b;
                        q qVar2 = fVar.f28913e;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = dVarV6;
                        if (num != null) {
                            if (qVar2 != null) {
                                int iIntValue = num.intValue();
                                qVar2.f18849m = iIntValue;
                                x xVar = qVar2.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            fVar.w6();
                            dVar.y4(fVar.getContext(), fVar.f28914f);
                        } else {
                            if (qVar2 != null) {
                                qVar2.f18849m = 0;
                                x xVar2 = qVar2.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar2 != null) {
                                qVar2.z();
                            }
                            dVar.y4(fVar.getContext(), fVar.f28914f);
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = this.f18838b;
                        if (num != null) {
                            q qVar3 = fVar2.f28913e;
                            if (qVar3 != null) {
                                int iIntValue2 = num.intValue();
                                qVar3.f18850n = iIntValue2;
                                x xVar3 = qVar3.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            fVar2.w6();
                            dVarV6.y4(fVar2.getContext(), fVar2.f28914f);
                        } else {
                            im.b bVar = fVar2.f28914f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = fVar2.f28913e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    public final void u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar) {
        v supportFragmentManager;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV6 = v6();
        h.Y.getClass();
        bVar.getClass();
        Bundle bundle = new Bundle();
        h hVar = new h();
        bundle.putBoolean("EXTRA_DISABLE_HOURS", false);
        bundle.putInt("EXTRA_TIME_PICKER", bVar.ordinal());
        hVar.setArguments(bundle);
        hVar.f149616x = new a73.f(this, 5, dVarV6, bVar);
        m activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        hVar.show(supportFragmentManager, "DURATION_PICKER_FRAGMENT");
    }

    public final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d v6() {
        return (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.f28909a.getValue();
    }

    public final void w6() {
        f28908i.info("TrimActivityFragment", "startTime:  " + ((y0) v6().f28880r.getValue()) + "endTime:  " + ((y0) v6().f28881t.getValue()));
        q qVar = this.f28913e;
        if (qVar != null) {
            qVar.y();
        }
    }

    public final void y6() {
        ComposeView composeView = this.f28915g;
        if (composeView != null) {
            composeView.setContent(new z3.e(630177810, true, new o0(this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DURATION_PICKER_FRAGMENT", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
