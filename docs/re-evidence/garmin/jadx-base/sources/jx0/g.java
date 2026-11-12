package jx0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.GridChartView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMRunningProgressView;
import hx0.o0;
import java.util.List;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.math.MathKt;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljx0/g;", "Ljx0/a;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends jx0.a {
    public static final a E = new a(null);
    public View A;
    public TextView B;
    public TextView C;
    public Button D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f101445o = o13.m.b(new e(this, 1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f101446p = new w1(s0.f105811a.b(o0.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView f101447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f101448r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f101449t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f101450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f101451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f101452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMRunningProgressView f101453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Group f101454z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f101455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f101455a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f101455a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f101456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f101457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f101456a = aVar;
            this.f101457b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f101456a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f101457b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f101458a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f101458a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f101458a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // jx0.a
    public final void I6(ww0.k kVar) {
        List listC;
        LocalDate localDateQ;
        List<ww0.n> listF;
        List<ww0.n> listF2;
        super.I6(kVar);
        int i14 = 8;
        if (s.g(this.f101401k, Boolean.TRUE)) {
            View view2 = this.f101448r;
            if (view2 == null) {
                s.m("menstrualCycleOneCycleSymptomsGroup");
                throw null;
            }
            view2.setVisibility(8);
            View view3 = this.f101449t;
            if (view3 != null) {
                view3.setVisibility(8);
                return;
            } else {
                s.m("menstrualCycleOneCycleNoSymptomsText");
                throw null;
            }
        }
        if (kVar == null || (listF2 = kVar.f()) == null || !(!listF2.isEmpty())) {
            M6().setVisibility(8);
        }
        int i15 = 0;
        ww0.n nVar = (kVar == null || (listF = kVar.f()) == null) ? null : listF.get(0);
        if (nVar == null || nVar.getCycleType() != ww0.a.PREGNANT) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a c0696a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.f39194a;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            c0696a.getClass();
            List<ww0.b> listG = kVar != null ? kVar.g() : null;
            if (listG == null || listG.isEmpty() || (localDateQ = kVar.q()) == null) {
                listC = j0.f134944a;
            } else {
                Integer avgCycleLength = kVar.getAvgCycleLength();
                int iIntValue = avgCycleLength != null ? avgCycleLength.intValue() : jg.b.t(localDateQ).getDayOfMonth();
                listC = u.C(new GridChartView.b[]{com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.b(contextRequireContext, iIntValue, localDateQ, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.e(contextRequireContext, iIntValue, localDateQ, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.c(contextRequireContext, iIntValue, localDateQ, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.a(contextRequireContext, iIntValue, localDateQ, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.d(contextRequireContext, iIntValue, localDateQ, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.g(contextRequireContext, iIntValue, localDateQ, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.f(contextRequireContext, iIntValue, localDateQ, listG)});
            }
            if (listC.isEmpty()) {
                i14 = 0;
                i15 = 8;
            } else {
                n nVar2 = (n) this.f101445o.getValue();
                nVar2.getClass();
                nVar2.f121334c = listC;
                nVar2.notifyDataSetChanged();
            }
            View view4 = this.f101449t;
            if (view4 == null) {
                s.m("menstrualCycleOneCycleNoSymptomsText");
                throw null;
            }
            view4.setVisibility(i14);
            View view5 = this.f101448r;
            if (view5 == null) {
                s.m("menstrualCycleOneCycleSymptomsGroup");
                throw null;
            }
            view5.setVisibility(i15);
            RecyclerView recyclerView = this.f101447q;
            if (recyclerView == null) {
                s.m("menstrualCycleOneCycleSymptomsList");
                throw null;
            }
            recyclerView.setVisibility(i15);
            View view6 = this.f101450v;
            if (view6 != null) {
                view6.setVisibility(i15);
                return;
            } else {
                s.m("menstrualCycleOneCycleSymptomsTitle");
                throw null;
            }
        }
        LocalDate localDateB = nVar.b();
        if (localDateB != null) {
            if (new LocalDate().isBefore(localDateB)) {
                localDateB = new LocalDate();
            }
            db1.m mVarA4 = ((o0) this.f101446p.getValue()).A4(localDateB);
            if (mVarA4 != null) {
                View view7 = this.A;
                if (view7 == null) {
                    s.m("mctPregnancyOneDayView");
                    throw null;
                }
                view7.setVisibility(0);
                TextView textView = this.B;
                if (textView == null) {
                    s.m("pregnancyPregnancyTitle");
                    throw null;
                }
                LocalDate deliveryDate = mVarA4.getDeliveryDate();
                if (deliveryDate == null) {
                    deliveryDate = mVarA4.getEndDate();
                }
                textView.setText(deliveryDate != null ? vb.h.h(deliveryDate.getYear(), getString(R.string.pregnancy_title), StringUtils.SPACE) : getString(R.string.pregnancy_currently_pregnant));
                TextView textView2 = this.C;
                if (textView2 == null) {
                    s.m("pregnancyDescriptionTitle");
                    throw null;
                }
                textView2.setText(getString(R.string.pregnancy_check_details));
                Button button = this.D;
                if (button == null) {
                    s.m("viewPregnancyButton");
                    throw null;
                }
                button.setText(getString(R.string.pregnancy_view_pregnancy));
                K6().setVisibility(8);
                S6().setVisibility(8);
                M6().setVisibility(8);
                View view8 = this.f101449t;
                if (view8 == null) {
                    s.m("menstrualCycleOneCycleNoSymptomsText");
                    throw null;
                }
                view8.setVisibility(8);
                View view9 = this.f101448r;
                if (view9 == null) {
                    s.m("menstrualCycleOneCycleSymptomsGroup");
                    throw null;
                }
                view9.setVisibility(8);
                RecyclerView recyclerView2 = this.f101447q;
                if (recyclerView2 == null) {
                    s.m("menstrualCycleOneCycleSymptomsList");
                    throw null;
                }
                recyclerView2.setVisibility(8);
                View view10 = this.f101450v;
                if (view10 == null) {
                    s.m("menstrualCycleOneCycleSymptomsTitle");
                    throw null;
                }
                view10.setVisibility(8);
                Button button2 = this.D;
                if (button2 != null) {
                    button2.setOnClickListener(new bv2.j(this, 16, localDateB, mVarA4));
                } else {
                    s.m("viewPregnancyButton");
                    throw null;
                }
            }
        }
    }

    @Override // jx0.a
    public final TextView K6() {
        TextView textView = this.f101451w;
        if (textView != null) {
            return textView;
        }
        s.m("menstrualCycleOneCycleLengthCycleData");
        throw null;
    }

    @Override // jx0.a
    public final Group M6() {
        Group group = this.f101454z;
        if (group != null) {
            return group;
        }
        s.m("menstrualCycleOneCycleDataGroup");
        throw null;
    }

    @Override // jx0.a
    public final TextView S6() {
        TextView textView = this.f101452x;
        if (textView != null) {
            return textView;
        }
        s.m("menstrualCycleOneCycleLengthPeriodData");
        throw null;
    }

    @Override // jx0.a
    public final GCMRunningProgressView T6() {
        GCMRunningProgressView gCMRunningProgressView = this.f101453y;
        if (gCMRunningProgressView != null) {
            return gCMRunningProgressView;
        }
        s.m("menstrualCycleOneCycleRunningProgress");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewA6 = A6(viewGroup, layoutInflater, R.layout.fragment_menstrual_cycle_one_cycle);
        View viewFindViewById = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_symptoms_list);
        viewFindViewById.getClass();
        this.f101447q = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_symptoms_group);
        viewFindViewById2.getClass();
        this.f101448r = viewFindViewById2;
        View viewFindViewById3 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_no_symptoms_text);
        viewFindViewById3.getClass();
        this.f101449t = viewFindViewById3;
        View viewFindViewById4 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_symptoms_title);
        viewFindViewById4.getClass();
        this.f101450v = viewFindViewById4;
        View viewFindViewById5 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_length_cycle_data);
        viewFindViewById5.getClass();
        this.f101451w = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_length_period_data);
        viewFindViewById6.getClass();
        this.f101452x = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_running_progress);
        viewFindViewById7.getClass();
        this.f101453y = (GCMRunningProgressView) viewFindViewById7;
        View viewFindViewById8 = viewA6.findViewById(R.id.menstrual_cycle_one_cycle_data_group);
        viewFindViewById8.getClass();
        this.f101454z = (Group) viewFindViewById8;
        View viewFindViewById9 = viewA6.findViewById(R.id.mct_pregnancy_one_day_view);
        viewFindViewById9.getClass();
        this.A = viewFindViewById9;
        View viewFindViewById10 = viewA6.findViewById(R.id.pregnancy_pregnancy_title);
        viewFindViewById10.getClass();
        this.B = (TextView) viewFindViewById10;
        View viewFindViewById11 = viewA6.findViewById(R.id.pregnancy_description_title);
        viewFindViewById11.getClass();
        this.C = (TextView) viewFindViewById11;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.a(contextRequireContext) >= 1.5f) {
            TextView textView = this.C;
            if (textView == null) {
                s.m("pregnancyDescriptionTitle");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            ((LinearLayout.LayoutParams) layoutParams).setMarginStart(getResources().getDimensionPixelSize(R.dimen.spacing_small));
            TextView textView2 = this.C;
            if (textView2 == null) {
                s.m("pregnancyDescriptionTitle");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.getClass();
            ((LinearLayout.LayoutParams) layoutParams2).setMarginEnd(getResources().getDimensionPixelSize(R.dimen.spacing_small));
        }
        View viewFindViewById12 = viewA6.findViewById(R.id.view_pregnancy_button);
        viewFindViewById12.getClass();
        this.D = (Button) viewFindViewById12;
        return viewA6;
    }

    @Override // jx0.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = this.f101447q;
        if (recyclerView == null) {
            s.m("menstrualCycleOneCycleSymptomsList");
            throw null;
        }
        recyclerView.setAdapter((n) this.f101445o.getValue());
        RecyclerView recyclerView2 = this.f101447q;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new mx0.c(MathKt.c(getResources().getDimension(R.dimen.spacing_normal))));
        } else {
            s.m("menstrualCycleOneCycleSymptomsList");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/g$a;", "", "<init>", "()V", "", "CYCLE_REPORT_STATE_KEY_VALUE", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
