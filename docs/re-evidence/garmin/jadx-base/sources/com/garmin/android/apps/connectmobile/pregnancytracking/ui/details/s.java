package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

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
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/s;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$b;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends Fragment implements l.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40826f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f40827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f40828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ib1.a f40829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public db1.m f40830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f40831e = new w1(s0.f105811a.b(gb1.t.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f40832a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40832a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40833a = aVar;
            this.f40834b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40833a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40834b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40835a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40835a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40835a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.b
    public final void C2() {
        u6();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        this.f40830d = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
        return layoutInflater.inflate(R.layout.fragment_pregnancy_reports_notes, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.no_data_lbl);
        viewFindViewById.getClass();
        this.f40827a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pregnancy_reports_notes_list);
        viewFindViewById2.getClass();
        this.f40828b = (RecyclerView) viewFindViewById2;
        ib1.a aVar = new ib1.a();
        this.f40829c = aVar;
        RecyclerView recyclerView = this.f40828b;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("mNotesRecyclerView");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        ib1.a aVar2 = this.f40829c;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        aVar2.f92515c = this;
        u6();
    }

    public final void u6() {
        Object serializable;
        LinkedHashMap linkedHashMap = ((gb1.t) this.f40831e.getValue()).f76709a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("START_DATE_KEY", LocalDate.class);
            } else {
                Serializable serializable2 = arguments.getSerializable("START_DATE_KEY");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                gb1.t.a aVar = (gb1.t.a) linkedHashMap.get(localDate);
                db1.l lVar = aVar != null ? aVar.f76722b : null;
                if (lVar == null) {
                    v6(false);
                    return;
                }
                List<db1.k> listB = lVar.b();
                if (listB == null) {
                    v6(false);
                    return;
                }
                if (!listB.isEmpty()) {
                    ib1.a aVar2 = this.f40829c;
                    if (aVar2 == null) {
                        p005kotlin.jvm.internal.s.m("adapter");
                        throw null;
                    }
                    ArrayList arrayListZ = h0.Z(listB);
                    aVar2.f92514b = this.f40830d;
                    ArrayList arrayList = aVar2.f92513a;
                    arrayList.clear();
                    arrayList.addAll(h0.N0(arrayListZ, new ib1.b()));
                    ib1.a aVar3 = this.f40829c;
                    if (aVar3 == null) {
                        p005kotlin.jvm.internal.s.m("adapter");
                        throw null;
                    }
                    aVar3.notifyDataSetChanged();
                }
                v6(!listB.isEmpty());
                return;
            }
        }
        vb.h.z("Can't display Pregnancy Reports with out start date");
    }

    public final void v6(boolean z14) {
        RecyclerView recyclerView = this.f40828b;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("mNotesRecyclerView");
            throw null;
        }
        recyclerView.setVisibility(z14 ? 0 : 8);
        TextView textView = this.f40827a;
        if (textView != null) {
            textView.setVisibility(z14 ? 8 : 0);
        } else {
            p005kotlin.jvm.internal.s.m("mNoDataTextView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/s$a;", "", "<init>", "()V", "", "START_DATE_KEY", "Ljava/lang/String;", "END_DATE_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
