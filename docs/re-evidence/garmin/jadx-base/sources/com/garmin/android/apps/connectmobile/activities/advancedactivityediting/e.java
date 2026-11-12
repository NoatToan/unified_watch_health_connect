package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import am.x0;
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
import bm.e0;
import bm.h0;
import bm.i0;
import bm.j0;
import bm.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.github.mikephil.chartingv2.charts.LineChart;
import e23.l;
import java.util.List;
import lc.u0;
import lo.l3;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f28888i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f28889j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f28890a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.class), new C0442e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LineChart f28891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f28892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f28893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f28894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public im.b f28895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f28896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f28897h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28898a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28898a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/advancedactivityediting/e$c", "", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f28899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f28900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a f28901c;

        public c(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, e eVar, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar) {
            this.f28899a = dVar;
            this.f28900b = eVar;
            this.f28901c = aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f28902a;

        public d(l lVar) {
            lVar.getClass();
            this.f28902a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f28902a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28902a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0442e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28903a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0442e(Fragment fragment) {
            super(0);
            this.f28903a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f28903a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f28904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f28905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f28904a = aVar;
            this.f28905b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f28904a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f28905b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28906a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f28906a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f28906a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f28889j = gt2.b.f79005a.h("TrimDistanceFragment");
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
        ht.a.a(null, "Distance");
        this.f28896g = (ComposeView) view2.findViewById(R.id.trim_activity_metrics);
        View viewFindViewById = view2.findViewById(R.id.trim_activity_chart_view);
        viewFindViewById.getClass();
        this.f28891b = (LineChart) viewFindViewById;
        this.f28892c = view2.findViewById(R.id.trim_activity_chart_header_view);
        this.f28893d = (LinearLayout) view2.findViewById(R.id.chart_legend_container);
        View viewFindViewById2 = view2.findViewById(R.id.trim_activity_chart_container);
        viewFindViewById2.getClass();
        this.f28897h = (LinearLayout) viewFindViewById2;
        final int i14 = 0;
        v6().f28874l.f(getViewLifecycleOwner(), new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i15) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV6 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV6.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV6.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV7.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV7.f28867e, dVarV7.f28869g, context2, cVar2, dVarV7.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV7.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        y6();
        LinearLayout linearLayout = this.f28897h;
        if (linearLayout == null) {
            s.m("mChartContainer");
            throw null;
        }
        linearLayout.setOnClickListener(new a32.b(this, 16));
        m activity = getActivity();
        if (activity == null || (hVar = v6().f28869g) == null) {
            return;
        }
        g22.e.l(this);
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV6 = v6();
        final int i15 = 1;
        dVarV6.D4(hVar.f29448a).f(activity, new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i16) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV7.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV7.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV8 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV8.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV8.f28867e, dVarV8.f28869g, context2, cVar2, dVarV8.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV8.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        ((y0) dVarV6.f28882v.getValue()).f(activity, new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i17) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV7.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV7.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV8 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV8.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV8.f28867e, dVarV8.f28869g, context2, cVar2, dVarV8.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV8.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 3;
        ((y0) dVarV6.f28883w.getValue()).f(activity, new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i18) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV7.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV7.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV8 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV8.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV8.f28867e, dVarV8.f28869g, context2, cVar2, dVarV8.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV8.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 4;
        ((y0) dVarV6.f28884x.getValue()).f(activity, new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i19 = i18;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i19) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV7.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV7.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV8 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV8.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV8.f28867e, dVarV8.f28869g, context2, cVar2, dVarV8.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV8.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i19 = 5;
        dVarV6.F4().f(activity, new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i110 = i19;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i110) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV7.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV7.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV8 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV8.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV8.f28867e, dVarV8.f28869g, context2, cVar2, dVarV8.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV8.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i24 = 6;
        dVarV6.E4().f(activity, new d(new l(this) { // from class: bm.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18800b;

            {
                this.f18800b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                List<o20.a> list;
                q qVar;
                int i110 = i24;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18800b;
                switch (i110) {
                    case 0:
                        Double d14 = (Double) obj;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV7 = eVar.v6();
                        Context context = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV7.f28864b;
                        if (cVar != null) {
                            cVar.m(d14 != null ? d14.doubleValue() : 0.0d);
                        }
                        dVarV7.N4(context);
                        eVar.z6(eVar.v6(), com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) ((fw.m) obj).f73770c;
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV8 = eVar.v6();
                        Context context2 = eVar.getContext();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarV8.f28869g;
                        if (activityDetailChartDTO != null && hVar2 != null && context2 != null) {
                            fz.c cVar2 = fz.c.DISTANCE;
                            cVar2.getClass();
                            im.b bVarA = m.a(dVarV8.f28867e, dVarV8.f28869g, context2, cVar2, dVarV8.f28871i);
                            eVar.f28895f = bVarA;
                            if (bVarA != null) {
                                q qVar2 = new q(context2, bVarA, 0, bVarA.f94122l.size() - 1, false, cVar2);
                                eVar.f28894e = qVar2;
                                qVar2.f145356k = eVar.f28893d;
                                qVar2.o();
                                LineChart lineChart = eVar.f28891b;
                                if (lineChart == null) {
                                    p005kotlin.jvm.internal.s.m("mChartView");
                                    throw null;
                                }
                                qVar2.l(lineChart);
                                View view3 = eVar.f28892c;
                                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.chart_title)) != null) {
                                    textView.setText(bVarA.getF113511u1());
                                }
                                String f113511u1 = bVarA.getF113511u1();
                                if (f113511u1 == null) {
                                    f113511u1 = "";
                                }
                                ((y0) dVarV8.f28878p.getValue()).m(f113511u1);
                            }
                        }
                        g22.e.f(eVar);
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                        eVar.y6();
                        return Unit.INSTANCE;
                    case 5:
                        Integer num = (Integer) obj;
                        q qVar3 = eVar.f28894e;
                        if (num != null) {
                            if (qVar3 != null) {
                                int iIntValue = num.intValue();
                                qVar3.f18849m = iIntValue;
                                x xVar = qVar3.f18858x;
                                if (xVar != null) {
                                    xVar.f18873h = iIntValue;
                                }
                            }
                            eVar.w6();
                        } else {
                            if (qVar3 != null) {
                                qVar3.f18849m = 0;
                                x xVar2 = qVar3.f18858x;
                                if (xVar2 != null) {
                                    xVar2.f18873h = 0;
                                }
                            }
                            if (qVar3 != null) {
                                qVar3.z();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            q qVar4 = eVar.f28894e;
                            if (qVar4 != null) {
                                int iIntValue2 = num2.intValue();
                                qVar4.f18850n = iIntValue2;
                                x xVar3 = qVar4.f18858x;
                                if (xVar3 != null) {
                                    xVar3.f18874i = iIntValue2;
                                }
                            }
                            eVar.w6();
                        } else {
                            im.b bVar = eVar.f28895f;
                            if (bVar != null && (list = bVar.f94122l) != null && (qVar = eVar.f28894e) != null) {
                                int size = list.size() - 1;
                                qVar.f18850n = size;
                                x xVar4 = qVar.f18858x;
                                if (xVar4 != null) {
                                    xVar4.f18874i = size;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final void u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar) {
        v supportFragmentManager;
        int[] iArr;
        e0 e0Var;
        v supportFragmentManager2;
        double d14;
        x0 x0VarC;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarV6 = v6();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = v6().f28869g;
        String str = (hVar == null || (x0VarC = hVar.C()) == null) ? null : x0VarC.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        int i14 = 0;
        if (!am.z0.b(x0.I0, str)) {
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.g.T.getClass();
            aVar.getClass();
            Bundle bundle = new Bundle();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.g gVar = new com.garmin.android.apps.connectmobile.activities.advancedactivityediting.g();
            bundle.putBoolean("EXTRA_IS_SWIMMING", false);
            bundle.putInt("EXTRA_DISTANCE_PICKER", aVar.ordinal());
            gVar.setArguments(bundle);
            gVar.f149884y = new h0(dVarV6, this, gVar, aVar, 0);
            gVar.A = new i0(gVar, aVar, this);
            gVar.f149885z = new i0(gVar, aVar, this);
            gVar.f149880t = getString(R.string.lbl_mile);
            gVar.f149881v = getString(R.string.lbl_km);
            m activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            gVar.show(supportFragmentManager, "DISTANCE_PICKER_DIALOG");
            return;
        }
        r22.f.X.getClass();
        r22.f fVar = new r22.f();
        fVar.w6(x.d(l3.METER));
        aVar.getClass();
        if (dVarV6.f28864b == null) {
            iArr = new int[]{0, 0};
        } else {
            int i15 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.a.f28887a[aVar.ordinal()];
            if (i15 == 1) {
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVarV6.f28864b;
                cVar.getClass();
                iArr = new int[]{0, ((int) cVar.f28854k.f18788a) + 1};
            } else if (i15 == 2) {
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar2 = dVarV6.f28864b;
                int i16 = ((cVar2 == null || (e0Var = cVar2.f28853j) == null) ? 0 : (int) e0Var.f18788a) - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                iArr = new int[]{0, i16};
            } else {
                if (i15 != 3) {
                    u0.r();
                    return;
                }
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar3 = dVarV6.f28864b;
                cVar3.getClass();
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar4 = dVarV6.f28864b;
                cVar4.getClass();
                iArr = new int[]{((int) cVar3.f28852i.f18788a) + 1, ((int) cVar4.f28854k.f18788a) + 1};
            }
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        fVar.f149839m = i17;
        fVar.f149840n = i18;
        fVar.f149836j = true;
        fVar.f149843q = true;
        if (dVarV6.f28864b != null) {
            int i19 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.a.f28887a[aVar.ordinal()];
            if (i19 == 1) {
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar5 = dVarV6.f28864b;
                cVar5.getClass();
                d14 = cVar5.f28851h.f18788a;
            } else if (i19 == 2) {
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar6 = dVarV6.f28864b;
                cVar6.getClass();
                d14 = cVar6.f28852i.f18788a;
            } else if (i19 != 3) {
                u0.r();
                return;
            } else {
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar7 = dVarV6.f28864b;
                cVar7.getClass();
                d14 = cVar7.f28853j.f18788a;
            }
            i14 = (int) d14;
        }
        fVar.v6(i14);
        fVar.T = new c(dVarV6, this, aVar);
        m activity2 = getActivity();
        if (activity2 == null || (supportFragmentManager2 = activity2.getSupportFragmentManager()) == null) {
            return;
        }
        fVar.show(supportFragmentManager2, "DISTANCE_PICKER_DIALOG");
    }

    public final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d v6() {
        return (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.f28890a.getValue();
    }

    public final void w6() {
        f28889j.info("TrimDistanceFragment", "startDistance:  " + ((y0) v6().f28883w.getValue()) + "endTime:  " + ((y0) v6().f28884x.getValue()));
        q qVar = this.f28894e;
        if (qVar != null) {
            qVar.y();
        }
    }

    public final void y6() {
        ComposeView composeView = this.f28896g;
        if (composeView != null) {
            composeView.setContent(new z3.e(783166394, true, new j0(this, 0)));
        }
    }

    public final void z6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar) {
        Context context;
        Double dA4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVar, "SUMDISTANCE", null, aVar, bm.n.SUM_DISTANCE_TO_SUM_DURATION, this.f28895f, 2);
        if (dA4 != null && (context = getContext()) != null) {
            double dDoubleValue = dA4.doubleValue();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVar.f28864b;
            if (cVar != null) {
                int i14 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28860b[aVar.ordinal()];
                if (i14 == 1) {
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.s(cVar, Integer.valueOf((int) dDoubleValue), null, null, null, 14);
                } else if (i14 == 2) {
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.q(cVar, Integer.valueOf((int) dDoubleValue), null, null, null, 14);
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return;
                    }
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.o(cVar, Integer.valueOf((int) dDoubleValue), null, null, null, 14);
                }
            }
            dVar.O4(context);
        }
        int i15 = b.f28898a[aVar.ordinal()];
        if (i15 == 1) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "DistanceStartClick");
            dVar.K4(this.f28895f, "SUMDISTANCE", fz.c.DISTANCE);
        } else if (i15 == 2) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "DistanceEndClick");
            dVar.J4(this.f28895f, "SUMDISTANCE", fz.c.DISTANCE);
        } else {
            ht.a.f85464a.getClass();
            ht.a.a(null, "DistanceTotalClick");
            im.b bVar = this.f28895f;
            fz.c cVar2 = fz.c.DISTANCE;
            dVar.K4(bVar, "SUMDISTANCE", cVar2);
            dVar.J4(this.f28895f, "SUMDISTANCE", cVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DISTANCE_PICKER_DIALOG", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
