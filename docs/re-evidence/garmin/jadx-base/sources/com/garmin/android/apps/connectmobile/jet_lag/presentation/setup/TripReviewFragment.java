package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.TripDetailsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripReviewFragment;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import lc.u0;
import ls0.t;
import o13.h;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.x;
import yr0.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/TripReviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TripReviewFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37070a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ls0.c f37071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ms0.a f37072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f37073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f37074e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37075a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37075a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37076a;

        public b(l lVar) {
            lVar.getClass();
            this.f37076a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f37076a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37076a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f37077a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37077a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37079b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37078a = aVar;
            this.f37079b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37078a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37079b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f37080a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37080a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static void v6(TripReviewFragment tripReviewFragment, Integer num, int i14) {
        if ((i14 & 1) != 0) {
            num = null;
        }
        boolean z14 = (i14 & 2) != 0;
        TextView textView = tripReviewFragment.f37074e;
        if (textView == null) {
            s.m("msgError");
            throw null;
        }
        if (num != null) {
            textView.setText(tripReviewFragment.getString(num.intValue()));
        }
        textView.setVisibility(z14 ? 0 : 8);
        if (z14) {
            return;
        }
        ms0.a aVar = tripReviewFragment.f37072c;
        if (aVar == null) {
            s.m("destinationsAdapter");
            throw null;
        }
        aVar.f120454e.clear();
        aVar.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f37071b = (ls0.c) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.trip_review_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f37071b = null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0160  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:60:0x01af  */
    /* JADX WARN: Code duplicated, block: B:81:0x0190 A[SYNTHETIC] */
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
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        List<Integer> listB1;
        o13.p pVar;
        int size;
        int i14;
        o13.p pVar2;
        int i15;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.msg_confirm_trip);
        viewFindViewById.getClass();
        final int i16 = 1;
        v22.e.v(viewFindViewById, !u6().z4());
        View viewFindViewById2 = view2.findViewById(R.id.msg_error);
        viewFindViewById2.getClass();
        this.f37074e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.btn_finish);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f37073d = button;
        button.setText(u6().z4() ? R.string.lbl_save : R.string.lbl_finish);
        Button button2 = this.f37073d;
        if (button2 == null) {
            s.m("btnFinish");
            throw null;
        }
        button2.setOnClickListener(new js0.d(this, 19));
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarU6 = u6();
        j jVar = eVarU6.f37108f;
        ArrayList arrayListD0 = eVarU6.f37107e;
        if (jVar != null) {
            arrayListD0 = h0.D0(arrayListD0, jVar);
        }
        final int i17 = 0;
        this.f37072c = new ms0.a(new l(this) { // from class: ls0.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripReviewFragment f114770b;

            {
                this.f114770b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean zQ;
                switch (i17) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        TripReviewFragment tripReviewFragment = this.f114770b;
                        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarU7 = tripReviewFragment.u6();
                        yr0.j jVar2 = eVarU7.f37108f;
                        ArrayList arrayListD1 = eVarU7.f37107e;
                        if (jVar2 != null) {
                            arrayListD1 = h0.D0(arrayListD1, jVar2);
                        }
                        int size2 = arrayListD1.size();
                        while (size2 > iIntValue) {
                            size2--;
                            NavHostFragment.f10124e.getClass();
                            NavHostFragment.a.a(tripReviewFragment).m();
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var = (g3) obj;
                        int i18 = TripReviewFragment.a.f37075a[g3Var.f35300a.ordinal()];
                        TripReviewFragment tripReviewFragment2 = this.f114770b;
                        if (i18 == 1) {
                            g22.e.f(tripReviewFragment2);
                            yr0.o oVar = (yr0.o) g3Var.f35301b;
                            if (oVar != null) {
                                ns0.b.f127812a.getClass();
                                zQ = ns0.b.q(oVar);
                            } else {
                                zQ = false;
                            }
                            if (oVar != null) {
                                if (tripReviewFragment2.u6().z4()) {
                                    androidx.fragment.app.m mVarRequireActivity = tripReviewFragment2.requireActivity();
                                    TripDetailsActivity.f37000i.getClass();
                                    Intent intentPutExtra = new Intent().putExtra("EXTRA_UPDATED_TRIP", oVar);
                                    intentPutExtra.getClass();
                                    mVarRequireActivity.setResult(-1, intentPutExtra);
                                } else {
                                    tripReviewFragment2.requireActivity().setResult(-1);
                                }
                            }
                            c cVar = tripReviewFragment2.f37071b;
                            if (cVar != null) {
                                cVar.f7(zQ);
                            }
                        } else if (i18 == 2) {
                            g22.e.f(tripReviewFragment2);
                            g22.e.c(tripReviewFragment2);
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.l(tripReviewFragment2);
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        View viewFindViewById4 = requireView().findViewById(R.id.destinations_list);
        viewFindViewById4.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ms0.a aVar = this.f37072c;
        if (aVar == null) {
            s.m("destinationsAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        ms0.a aVar2 = this.f37072c;
        if (aVar2 == null) {
            s.m("destinationsAdapter");
            throw null;
        }
        ArrayList arrayList = aVar2.f120453d;
        arrayList.clear();
        if (arrayListD0 != null && !arrayListD0.isEmpty()) {
            arrayList.addAll(arrayListD0);
        }
        aVar2.notifyDataSetChanged();
        ns0.c.f127813a.getClass();
        arrayListD0.getClass();
        j jVar2 = (j) h0.n0(arrayListD0);
        if (jVar2 != null) {
            j.Companion companion = j.INSTANCE;
            LocalDate localDateB = jVar2.b("yyyy-MM-dd'T'HH:mm:ss.S");
            if (localDateB != null && localDateB.isBefore(LocalDate.now())) {
                ms0.a aVar3 = this.f37072c;
                if (aVar3 == null) {
                    s.m("destinationsAdapter");
                    throw null;
                }
                aVar3.A(p13.w.c(Integer.valueOf(arrayListD0.size() - 1)));
                v6(this, Integer.valueOf(R.string.msg_validation_arrival_date_in_the_past), 2);
                Button button3 = this.f37073d;
                if (button3 == null) {
                    s.m("btnFinish");
                    throw null;
                }
                button3.setEnabled(false);
            }
        }
        ms0.a aVar4 = this.f37072c;
        if (aVar4 == null) {
            s.m("destinationsAdapter");
            throw null;
        }
        if (aVar4.f120454e.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ns0.b.f127812a.getClass();
            if (arrayListD0.size() != 1) {
                if (arrayListD0.size() == 2) {
                    o13.p pVar3 = new o13.p(arrayListD0.get(0), arrayListD0.get(1));
                    if (ns0.b.a(pVar3) && ns0.b.b(pVar3)) {
                        listB1 = arrayList2;
                        listB1 = arrayList2;
                        if (arrayListD0.size() > 2) {
                            size = arrayListD0.size() - 1;
                            i14 = 0;
                            while (i14 < size) {
                                i15 = i14 + 1;
                                pVar2 = new o13.p(arrayListD0.get(i14), arrayListD0.get(i15));
                                ns0.b.f127812a.getClass();
                                if (!ns0.b.a(pVar2)) {
                                    arrayList2.add(Integer.valueOf(i14));
                                    arrayList2.add(Integer.valueOf(i15));
                                }
                                i14 = i15;
                            }
                        }
                        pVar = new o13.p(arrayListD0.get(0), arrayListD0.get(arrayListD0.size() - 1));
                        ns0.b.f127812a.getClass();
                        if (!ns0.b.b(pVar)) {
                            arrayList2.add(0);
                            arrayList2.add(Integer.valueOf(arrayListD0.size() - 1));
                        }
                        listB1 = h0.b1(h0.f1(arrayList2));
                    } else {
                        listB1 = arrayList2;
                        listB1 = arrayList2;
                        arrayList2.addAll(x.d(0, 1));
                        listB1 = arrayList2;
                    }
                } else {
                    listB1 = arrayList2;
                    listB1 = arrayList2;
                    if (arrayListD0.size() > 2) {
                        size = arrayListD0.size() - 1;
                        i14 = 0;
                        while (i14 < size) {
                            i15 = i14 + 1;
                            pVar2 = new o13.p(arrayListD0.get(i14), arrayListD0.get(i15));
                            ns0.b.f127812a.getClass();
                            if (!ns0.b.a(pVar2)) {
                                arrayList2.add(Integer.valueOf(i14));
                                arrayList2.add(Integer.valueOf(i15));
                            }
                            i14 = i15;
                        }
                    }
                    pVar = new o13.p(arrayListD0.get(0), arrayListD0.get(arrayListD0.size() - 1));
                    ns0.b.f127812a.getClass();
                    if (!ns0.b.b(pVar)) {
                        arrayList2.add(0);
                        arrayList2.add(Integer.valueOf(arrayListD0.size() - 1));
                    }
                    listB1 = h0.b1(h0.f1(arrayList2));
                }
            }
            listB1 = arrayList2;
            if (!listB1.isEmpty()) {
                ms0.a aVar5 = this.f37072c;
                if (aVar5 == null) {
                    s.m("destinationsAdapter");
                    throw null;
                }
                aVar5.A(listB1);
                v6(this, Integer.valueOf(R.string.error_cities_do_not_match), 2);
            }
        }
        u6().f37115m.f(getViewLifecycleOwner(), new b(new l(this) { // from class: ls0.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripReviewFragment f114770b;

            {
                this.f114770b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean zQ;
                switch (i16) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        TripReviewFragment tripReviewFragment = this.f114770b;
                        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarU7 = tripReviewFragment.u6();
                        yr0.j jVar3 = eVarU7.f37108f;
                        ArrayList arrayListD1 = eVarU7.f37107e;
                        if (jVar3 != null) {
                            arrayListD1 = h0.D0(arrayListD1, jVar3);
                        }
                        int size2 = arrayListD1.size();
                        while (size2 > iIntValue) {
                            size2--;
                            NavHostFragment.f10124e.getClass();
                            NavHostFragment.a.a(tripReviewFragment).m();
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var = (g3) obj;
                        int i18 = TripReviewFragment.a.f37075a[g3Var.f35300a.ordinal()];
                        TripReviewFragment tripReviewFragment2 = this.f114770b;
                        if (i18 == 1) {
                            g22.e.f(tripReviewFragment2);
                            yr0.o oVar = (yr0.o) g3Var.f35301b;
                            if (oVar != null) {
                                ns0.b.f127812a.getClass();
                                zQ = ns0.b.q(oVar);
                            } else {
                                zQ = false;
                            }
                            if (oVar != null) {
                                if (tripReviewFragment2.u6().z4()) {
                                    androidx.fragment.app.m mVarRequireActivity = tripReviewFragment2.requireActivity();
                                    TripDetailsActivity.f37000i.getClass();
                                    Intent intentPutExtra = new Intent().putExtra("EXTRA_UPDATED_TRIP", oVar);
                                    intentPutExtra.getClass();
                                    mVarRequireActivity.setResult(-1, intentPutExtra);
                                } else {
                                    tripReviewFragment2.requireActivity().setResult(-1);
                                }
                            }
                            c cVar = tripReviewFragment2.f37071b;
                            if (cVar != null) {
                                cVar.f7(zQ);
                            }
                        } else if (i18 == 2) {
                            g22.e.f(tripReviewFragment2);
                            g22.e.c(tripReviewFragment2);
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.l(tripReviewFragment2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        t tVar = new t(view2, 0);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(view2, tVar);
    }

    public final com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e u6() {
        return (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e) this.f37070a.getValue();
    }
}
