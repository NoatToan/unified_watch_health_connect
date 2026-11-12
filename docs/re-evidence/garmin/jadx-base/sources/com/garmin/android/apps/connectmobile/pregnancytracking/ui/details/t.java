package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.GridChartView;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms.PregnancyFourWeekGridChartView;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.math.MathKt;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/t;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends Fragment implements l.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40857f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public db1.m f40858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f40859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f40860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f40861d = new w1(s0.f105811a.b(gb1.t.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f40862e = o13.m.b(new e40.d(this, 28));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f40863a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40863a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40865b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40864a = aVar;
            this.f40865b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40864a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40865b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40866a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40866a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.b
    public final void C2() {
        v6();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        this.f40858a = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
        return layoutInflater.inflate(R.layout.fragment_pregnancy_reports_symptoms, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.no_data_lbl);
        viewFindViewById.getClass();
        this.f40859b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pregnancy_reports_symptoms_list);
        viewFindViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f40860c = recyclerView;
        recyclerView.setAdapter((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms.a) this.f40862e.getValue());
        RecyclerView recyclerView2 = this.f40860c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("mSymptomsRecyclerView");
            throw null;
        }
        recyclerView2.addItemDecoration(new mx0.c(MathKt.c(getResources().getDimension(R.dimen.spacing_normal))));
        v6();
    }

    public final LocalDate u6() {
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

    public final void v6() {
        List<GridChartView.b> listC;
        List list;
        List list2;
        List listK;
        gb1.t.a aVar = (gb1.t.a) ((gb1.t) this.f40861d.getValue()).f76709a.get(u6());
        ww0.k kVar = aVar != null ? aVar.f76721a : null;
        if (kVar == null) {
            w6(false);
            return;
        }
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a c0696a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.f39194a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        LocalDate localDateU6 = u6();
        db1.m mVar = this.f40858a;
        LocalDate dueDate = mVar != null ? mVar.getDueDate() : null;
        c0696a.getClass();
        List<ww0.b> listG = kVar.g();
        if (listG == null || listG.isEmpty()) {
            listC = j0.f134944a;
        } else {
            int i14 = localDateU6.plusDays(27).isAfter(dueDate) ? 14 : 28;
            listC = p13.u.C(new GridChartView.b[]{com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.b(contextRequireContext, i14, localDateU6, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.e(contextRequireContext, i14, localDateU6, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.c(contextRequireContext, i14, localDateU6, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.a(contextRequireContext, i14, localDateU6, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.d(contextRequireContext, i14, localDateU6, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.g(contextRequireContext, i14, localDateU6, listG), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a.C0696a.f(contextRequireContext, i14, localDateU6, listG)});
        }
        List listK2 = j0.f134944a;
        db1.m mVar2 = this.f40858a;
        if (mVar2 != null) {
            tb1.e.a aVar2 = tb1.e.f163745a;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            LocalDate localDateU7 = u6();
            aVar2.getClass();
            LocalDate pregnancyCycleStart = mVar2.getPregnancyCycleStart();
            if (pregnancyCycleStart != null) {
                int days = Days.daysBetween(pregnancyCycleStart, localDateU7).getDays() / 7;
                int i15 = days + 3;
                String string = contextRequireContext2.getString(R.string.pregnancy_week_abbreviation);
                string.getClass();
                listK = i15 >= 42 ? x.k(androidx.core.view.j.f(days, string), androidx.core.view.j.f(days + 1, string)) : x.k(androidx.core.view.j.f(days, string), androidx.core.view.j.f(days + 1, string), androidx.core.view.j.f(days + 2, string), androidx.core.view.j.f(i15, string));
            } else {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "PregnancyTrackingUtil", "Pregnancy cycle start date should not be null");
                listK = listK2;
            }
            LocalDate localDateU8 = u6();
            LocalDate pregnancyCycleStart2 = mVar2.getPregnancyCycleStart();
            if (pregnancyCycleStart2 != null) {
                int days2 = Days.daysBetween(pregnancyCycleStart2, localDateU8).getDays() / 7;
                int i16 = days2 + 3;
                listK2 = i16 >= 42 ? x.k(Integer.valueOf(days2), Integer.valueOf(days2 + 1)) : x.k(Integer.valueOf(days2), Integer.valueOf(days2 + 1), Integer.valueOf(days2 + 2), Integer.valueOf(i16));
            } else {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "PregnancyTrackingUtil", "Pregnancy cycle start date should not be null");
            }
            list2 = listK2;
            list = listK;
        } else {
            list = listK2;
            list2 = list;
        }
        if (!listC.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (GridChartView.b bVar : listC) {
                ArrayList arrayList2 = new ArrayList();
                for (GridChartView.c cVar : bVar.f39187c) {
                    arrayList2.add(new PregnancyFourWeekGridChartView.c(cVar.f39189a, cVar.f39190b));
                }
                arrayList.add(new PregnancyFourWeekGridChartView.b(bVar.f39185a, bVar.f39186b, arrayList2, bVar.f39188d, list, list2));
            }
            o13.t tVar = this.f40862e;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms.a aVar5 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms.a) tVar.getValue();
            aVar5.getClass();
            aVar5.f121334c = arrayList;
            aVar5.notifyDataSetChanged();
            ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms.a) tVar.getValue()).notifyDataSetChanged();
        }
        w6(!listC.isEmpty());
    }

    public final void w6(boolean z14) {
        RecyclerView recyclerView = this.f40860c;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("mSymptomsRecyclerView");
            throw null;
        }
        recyclerView.setVisibility(z14 ? 0 : 8);
        TextView textView = this.f40859b;
        if (textView != null) {
            textView.setVisibility(z14 ? 8 : 0);
        } else {
            p005kotlin.jvm.internal.s.m("mNoDataTextView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/t$a;", "", "<init>", "()V", "", "START_DATE_KEY", "Ljava/lang/String;", "END_DATE_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
