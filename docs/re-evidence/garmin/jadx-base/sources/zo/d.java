package zo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import tr2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LabelledValuesRangeProgressBar f206018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f206019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f206020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f206021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f206022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ap.d f206023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f206024g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f206025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public wo.e f206026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f206027j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f206028a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f206028a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f206028a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f206028a.invoke(obj);
        }
    }

    public d() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new y(this, 24));
        cVarRegisterForActivityResult.getClass();
        this.f206027j = cVarRegisterForActivityResult;
    }

    public final GCMComplexTwoLineButton A6() {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f206021d;
        if (gCMComplexTwoLineButton != null) {
            return gCMComplexTwoLineButton;
        }
        p005kotlin.jvm.internal.s.m("legMetricButton");
        throw null;
    }

    public final RecyclerView C6() {
        RecyclerView recyclerView = this.f206022e;
        if (recyclerView != null) {
            return recyclerView;
        }
        p005kotlin.jvm.internal.s.m("selectorRecyclerView");
        throw null;
    }

    public final ap.d E6() {
        ap.d dVar = this.f206023f;
        if (dVar != null) {
            return dVar;
        }
        p005kotlin.jvm.internal.s.m("viewModel");
        throw null;
    }

    public abstract void F6(int i14, int i15);

    public abstract void G6(int i14);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.multisport_leg_edit_metric_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f206023f = (ap.d) new x1(mVarRequireActivity).b(s0.f105811a.b(ap.d.class));
        Bundle arguments = getArguments();
        this.f206024g = arguments != null ? arguments.getInt("legIndex") : -1;
        View viewFindViewById = view2.findViewById(R.id.chart_container);
        viewFindViewById.getClass();
        this.f206025h = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.chart_selector_chip_container);
        viewFindViewById2.getClass();
        this.f206022e = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.leg_metric_button);
        viewFindViewById3.getClass();
        this.f206021d = (GCMComplexTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.activity_type_button);
        viewFindViewById4.getClass();
        this.f206020c = (GCMComplexTwoLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.adjust_leg_metric_label);
        viewFindViewById5.getClass();
        this.f206019b = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.labelled_slider);
        viewFindViewById6.getClass();
        this.f206018a = (LabelledValuesRangeProgressBar) viewFindViewById6;
        RecyclerView recyclerViewC6 = C6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        recyclerViewC6.addItemDecoration(new r22.z0(contextRequireContext, Integer.valueOf(R.dimen.spacing_small), null, null, null));
        g22.e.l(this);
        z6().f(getViewLifecycleOwner(), new a(new yt.f(16, this, view2)));
    }

    public abstract void u6(vo.a aVar);

    public abstract String v6(int i14);

    public abstract fz.c w6();

    public final LabelledValuesRangeProgressBar y6() {
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBar = this.f206018a;
        if (labelledValuesRangeProgressBar != null) {
            return labelledValuesRangeProgressBar;
        }
        p005kotlin.jvm.internal.s.m("labelledSlider");
        throw null;
    }

    public abstract w0 z6();
}
