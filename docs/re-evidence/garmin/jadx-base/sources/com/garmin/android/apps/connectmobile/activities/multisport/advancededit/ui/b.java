package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.z1;
import e23.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p13.h0;
import ps.d1;
import yo.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f29312m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f29313n = b.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f29314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LabelledValuesRangeProgressBar f29315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f29316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f29317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f29318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f29319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wo.e f29320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ap.d f29322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29324k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f29325l = R.string.divide_leg;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/b$b", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0453b implements s {
        public C0453b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.menu_done, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
            if (menuItemFindItem != null) {
                menuItemFindItem.setEnabled(true);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_done) {
                return false;
            }
            b.this.I6();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29327a;

        public c(l lVar) {
            lVar.getClass();
            this.f29327a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f29327a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29327a.invoke(obj);
        }
    }

    public final GCMComplexTwoLineButton A6() {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f29314a;
        if (gCMComplexTwoLineButton != null) {
            return gCMComplexTwoLineButton;
        }
        p005kotlin.jvm.internal.s.m("legMetricButton");
        throw null;
    }

    public abstract p C6();

    public final RecyclerView E6() {
        RecyclerView recyclerView = this.f29317d;
        if (recyclerView != null) {
            return recyclerView;
        }
        p005kotlin.jvm.internal.s.m("selectorRecyclerView");
        throw null;
    }

    /* JADX INFO: renamed from: F6, reason: from getter */
    public int getF29325l() {
        return this.f29325l;
    }

    public final ap.d G6() {
        ap.d dVar = this.f29322i;
        if (dVar != null) {
            return dVar;
        }
        p005kotlin.jvm.internal.s.m("viewModel");
        throw null;
    }

    public int H6(wo.a aVar) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("selectedChartType");
        }
        Set<Integer> setKeySet = aVar.f186398b.keySet();
        setKeySet.getClass();
        return ((Number) h0.a0(setKeySet)).intValue();
    }

    public void I6() {
        v supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        g.a aVar2 = g.f29350h;
        int i14 = this.f29324k;
        p pVarC6 = C6();
        int i15 = this.f29323j;
        aVar2.getClass();
        pVarC6.getClass();
        Bundle bundle = new Bundle(3);
        bundle.putInt("legIndex", i14);
        bundle.putString("legUpdateType", pVarC6.name());
        bundle.putInt("divisionPoint", i15);
        g gVar = new g();
        gVar.setArguments(bundle);
        aVar.l(R.id.multisport_content_frame, gVar, null);
        aVar.d(g.f29351i);
        aVar.e();
    }

    public abstract void J6(int i14, int i15, int i16);

    public void K6(int i14) {
        this.f29323j = i14;
        A6().setButtonBottomLeftLabel(v6(i14));
        z6().setCurrentProgress(i14);
        T6(this.f29321h, i14);
    }

    public final void M6(View view2, d1 d1Var) {
        int i14;
        if (d1Var != null) {
            G6();
            p pVarC6 = C6();
            pVarC6.getClass();
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            l3.a aVar = l3.f23124b;
            double d14 = d1Var.f139787c;
            m3 m3Var = zY ? m3.KILOMETER : m3.MILE;
            aVar.getClass();
            l3.a.j(d14, m3Var);
            int i15 = 1;
            if (ap.d.b.f11603a[pVarC6.ordinal()] == 1) {
                i14 = (int) d1Var.f139786b;
                if (i14 != 1) {
                    i14--;
                }
            } else {
                i14 = (int) d1Var.f139787c;
                if (i14 >= 20) {
                    i14 -= 10;
                }
                i15 = 10;
            }
            vo.b bVar = new vo.b(i15, i14, (int) Math.rint(((double) (i15 + i14)) / 2.0d));
            this.f29323j = bVar.f178994c;
            S6(view2, bVar);
        }
    }

    public void S6(View view2, vo.b bVar) {
        View viewFindViewById = view2.findViewById(R.id.chart_container);
        viewFindViewById.getClass();
        this.f29318e = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.chart_selector_chip_container);
        viewFindViewById2.getClass();
        this.f29317d = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.leg_metric_button);
        viewFindViewById3.getClass();
        this.f29314a = (GCMComplexTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.labelled_slider);
        viewFindViewById4.getClass();
        this.f29315b = (LabelledValuesRangeProgressBar) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.divide_leg_metric_label);
        viewFindViewById5.getClass();
        this.f29316c = (TextView) viewFindViewById5;
        A6().setOnClickListener(new wv2.h(22, this, bVar));
        final int i14 = 0;
        z6().setCustomValueFormatter(new l(this) { // from class: zo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b f206012b;

            {
                this.f206012b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b bVar2 = this.f206012b;
                int iIntValue = ((Integer) obj).intValue();
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                        return bVar2.v6(iIntValue);
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                        i2.a aVar3 = i2.f36769a;
                        aVar3.getClass();
                        i2.a.a(a2.ACTIVITIES, "Progress: " + iIntValue);
                        bVar2.K6(iIntValue);
                        return Unit.INSTANCE;
                    default:
                        bVar2.f29321h = iIntValue;
                        bVar2.T6(iIntValue, bVar2.f29323j);
                        return Unit.INSTANCE;
                }
            }
        });
        final int i15 = 1;
        z6().setProgressChangedCallback(new l(this) { // from class: zo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b f206012b;

            {
                this.f206012b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b bVar2 = this.f206012b;
                int iIntValue = ((Integer) obj).intValue();
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                        return bVar2.v6(iIntValue);
                    case 1:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                        i2.a aVar3 = i2.f36769a;
                        aVar3.getClass();
                        i2.a.a(a2.ACTIVITIES, "Progress: " + iIntValue);
                        bVar2.K6(iIntValue);
                        return Unit.INSTANCE;
                    default:
                        bVar2.f29321h = iIntValue;
                        bVar2.T6(iIntValue, bVar2.f29323j);
                        return Unit.INSTANCE;
                }
            }
        });
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBarZ6 = z6();
        int i16 = bVar.f178992a;
        int i17 = bVar.f178993b;
        int i18 = bVar.f178994c;
        labelledValuesRangeProgressBarZ6.l(i16, i17, Integer.valueOf(i18));
        z6().setCoroutineScope(g22.f.b(this));
        A6().setButtonBottomLeftLabel(v6(i18));
        u6(bVar);
        ap.d dVarG6 = G6();
        int i19 = this.f29324k;
        yo.e eVar = dVarG6.f11593e;
        List<d1> listD = eVar.f198239i.d();
        wo.a aVarB = null;
        d1 d1Var = listD != null ? (d1) h0.e0(i19, listD) : null;
        if (d1Var != null) {
            wo.b bVar2 = eVar.f198238h;
            if (bVar2 == null) {
                p005kotlin.jvm.internal.s.m("chartDataHandler");
                throw null;
            }
            aVarB = bVar2.b(d1Var, null);
        }
        if (aVarB != null) {
            LinkedHashMap<Integer, String> linkedHashMap = aVarB.f186398b;
            this.f29321h = H6(aVarB);
            if (linkedHashMap.isEmpty()) {
                w6().setVisibility(8);
                E6().setVisibility(8);
            } else {
                w6().setVisibility(0);
                E6().setVisibility(0);
                final int i24 = 2;
                E6().setAdapter(new wo.d(new wo.a(Integer.valueOf(this.f29321h), linkedHashMap), new l(this) { // from class: zo.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b f206012b;

                    {
                        this.f206012b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i24;
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b bVar3 = this.f206012b;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i110) {
                            case 0:
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                                return bVar3.v6(iIntValue);
                            case 1:
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                                i2.a aVar3 = i2.f36769a;
                                aVar3.getClass();
                                i2.a.a(a2.ACTIVITIES, "Progress: " + iIntValue);
                                bVar3.K6(iIntValue);
                                return Unit.INSTANCE;
                            default:
                                bVar3.f29321h = iIntValue;
                                bVar3.T6(iIntValue, bVar3.f29323j);
                                return Unit.INSTANCE;
                        }
                    }
                }));
                E6().setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
                RecyclerView recyclerViewE6 = E6();
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                recyclerViewE6.addItemDecoration(new r22.z0(contextRequireContext, Integer.valueOf(R.dimen.spacing_small), null, null, null));
            }
        }
        T6(this.f29321h, i18);
    }

    public final void T6(int i14, int i15) {
        fz.c cVar = C6() == p.TIME ? fz.c.TIME : fz.c.DISTANCE;
        g22.e.l(this);
        ap.d dVarG6 = G6();
        int i16 = this.f29324k;
        cVar.getClass();
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(dVarG6);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.h(y0Var, dVarG6, i14, i16, cVar, null), 2);
        y0Var.f(requireActivity(), new c(new ct2.e(this, i15, cVar, 10)));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.multisport_leg_divide_metric_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new C0453b(), b0.b.RESUMED);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.setTitle(getF29325l());
        }
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f29322i = (ap.d) new x1(mVarRequireActivity).b(p005kotlin.jvm.internal.s0.f105811a.b(ap.d.class));
        View viewFindViewById = view2.findViewById(R.id.chart_legend_container);
        viewFindViewById.getClass();
        this.f29319f = (LinearLayout) viewFindViewById;
        Bundle arguments = getArguments();
        this.f29324k = arguments != null ? arguments.getInt("legIndex", -1) : -1;
        y6(view2);
    }

    public abstract void u6(vo.b bVar);

    public abstract String v6(int i14);

    public final FrameLayout w6() {
        FrameLayout frameLayout = this.f29318e;
        if (frameLayout != null) {
            return frameLayout;
        }
        p005kotlin.jvm.internal.s.m("chartView");
        throw null;
    }

    public void y6(View view2) {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        d1 d1Var = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("leg", d1.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("leg");
                parcelable = (d1) (parcelable2 instanceof d1 ? parcelable2 : null);
            }
            d1Var = (d1) parcelable;
        }
        M6(view2, d1Var);
    }

    public final LabelledValuesRangeProgressBar z6() {
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBar = this.f29315b;
        if (labelledValuesRangeProgressBar != null) {
            return labelledValuesRangeProgressBar;
        }
        p005kotlin.jvm.internal.s.m("labelledSlider");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/b$a;", "", "<init>", "()V", "", "DIVISION_POINT", "Ljava/lang/String;", "LEG_UPDATE_TYPE", "SELECTED_CHART_TYPE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
