package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.view.GCMSnackbarContentLayout;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import m52.k;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/a;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/i$a;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements i.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0961a f49094h = new C0961a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f49096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f49097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMSnackbarContentLayout f49098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NestedScrollView f49099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f49100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o52.e f49101g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49102a;

        public b(l lVar) {
            lVar.getClass();
            this.f49102a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f49102a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49102a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f49103a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49103a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f49105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f49104a = aVar;
            this.f49105b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49104a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49105b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49106a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f49106a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49106a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.multisport_add_sport_leg_fragement);
        this.f49095a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.class), new c(this), new e(this), new d(null, this));
        this.f49101g = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
    }

    public static void u6(a aVar, int i14) {
        k kVar = k.f116754n;
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        k.a aVar2 = k.f116753m;
        o52.e eVar = aVar.f49101g;
        boolean zG = eVar.G();
        boolean zS = eVar.s();
        aVar2.getClass();
        List listB = k.a.b(zG, zS, zL0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((k) obj).f116774j) {
                arrayList.add(obj);
            }
        }
        k[] kVarArr = (k[]) h0.N0(arrayList, new g62.c()).toArray(new k[0]);
        String string = aVar.getString(R.string.lbl_workout_leg_number, String.valueOf(i14 + 1));
        string.getClass();
        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a(string, false, kVarArr, kVar, 2, null);
        Context contextRequireContext = aVar.requireContext();
        contextRequireContext.getClass();
        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext, c0929a, null, new ap.b(aVar, i14, 5), 4, null);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i.a
    public final void C5(int i14) {
        u6(this, i14);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f49096b = new i(this);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        i iVar = this.f49096b;
        if (iVar == null) {
            s.m("adapter");
            throw null;
        }
        recyclerView.setAdapter(iVar);
        View viewFindViewById = view2.findViewById(R.id.add_another_sport_btn);
        viewFindViewById.getClass();
        this.f49097c = (GCMComplexOneLineButton) viewFindViewById;
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.plus);
        if (drawable != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            og2.k.F(R.color.gcm_icon_primary_action, contextRequireContext, drawable);
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f49097c;
            if (gCMComplexOneLineButton == null) {
                s.m("addAnotherLegButton");
                throw null;
            }
            gCMComplexOneLineButton.c(drawable, Float.valueOf(20.0f));
        }
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f49097c;
        if (gCMComplexOneLineButton2 == null) {
            s.m("addAnotherLegButton");
            throw null;
        }
        gCMComplexOneLineButton2.setOnClickListener(new x(this, 26));
        View viewFindViewById2 = view2.findViewById(R.id.snackbar_footer);
        viewFindViewById2.getClass();
        this.f49098d = (GCMSnackbarContentLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.scroll_view);
        viewFindViewById3.getClass();
        this.f49099e = (NestedScrollView) viewFindViewById3;
        m activity = getActivity();
        activity.getClass();
        activity.addMenuProvider(new g62.b(this), getViewLifecycleOwner(), b0.b.CREATED);
        w1 w1Var = this.f49095a;
        final int i14 = 0;
        ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue()).f49142x.f(getViewLifecycleOwner(), new b(new l(this) { // from class: g62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a f76052b;

            {
                this.f76052b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Object obj2;
                WorkoutDetailsDTO workoutDetailsDTO;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar = this.f76052b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g gVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g) obj;
                        if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) {
                            MenuItem menuItem = aVar.f49100f;
                            if (menuItem != null) {
                                menuItem.setEnabled(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) gVar).f49186a);
                            }
                            GCMComplexOneLineButton gCMComplexOneLineButton3 = aVar.f49097c;
                            if (gCMComplexOneLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("addAnotherLegButton");
                                throw null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) gVar;
                            int i16 = aVar2.f49189d;
                            gCMComplexOneLineButton3.setEnabled(aVar2.f49187b);
                            GCMSnackbarContentLayout gCMSnackbarContentLayout = aVar.f49098d;
                            if (i16 != -1) {
                                if (gCMSnackbarContentLayout == null) {
                                    p005kotlin.jvm.internal.s.m("snackBarFooter");
                                    throw null;
                                }
                                gCMSnackbarContentLayout.getMessageView().setText(aVar.getString(i16));
                                GCMSnackbarContentLayout gCMSnackbarContentLayout2 = aVar.f49098d;
                                if (gCMSnackbarContentLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("snackBarFooter");
                                    throw null;
                                }
                                gCMSnackbarContentLayout2.setVisibility(0);
                                NestedScrollView nestedScrollView = aVar.f49099e;
                                if (nestedScrollView == null) {
                                    p005kotlin.jvm.internal.s.m("scrollView");
                                    throw null;
                                }
                                nestedScrollView.post(new eh2.b(aVar, 11));
                            } else {
                                if (gCMSnackbarContentLayout == null) {
                                    p005kotlin.jvm.internal.s.m("snackBarFooter");
                                    throw null;
                                }
                                gCMSnackbarContentLayout.setVisibility(8);
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.C0961a c0961a = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.f49094h;
                        }
                        return Unit.INSTANCE;
                    default:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i iVar2 = aVar.f49096b;
                        if (iVar2 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        if (pVar == null || (workoutDetailsDTO = (WorkoutDetailsDTO) pVar.f128595b) == null || (obj2 = workoutDetailsDTO.Q0) == null) {
                            obj2 = j0.f134944a;
                        }
                        obj2.getClass();
                        ArrayList arrayList = iVar2.f49205c;
                        arrayList.clear();
                        arrayList.addAll(obj2);
                        iVar2.notifyDataSetChanged();
                        if (((Boolean) pVar.f128594a).booleanValue()) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.u6(aVar, 0);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue()).f49143y.f(getViewLifecycleOwner(), new b(new l(this) { // from class: g62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a f76052b;

            {
                this.f76052b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Object obj2;
                WorkoutDetailsDTO workoutDetailsDTO;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar = this.f76052b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g gVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g) obj;
                        if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) {
                            MenuItem menuItem = aVar.f49100f;
                            if (menuItem != null) {
                                menuItem.setEnabled(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) gVar).f49186a);
                            }
                            GCMComplexOneLineButton gCMComplexOneLineButton3 = aVar.f49097c;
                            if (gCMComplexOneLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("addAnotherLegButton");
                                throw null;
                            }
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.g.a) gVar;
                            int i17 = aVar2.f49189d;
                            gCMComplexOneLineButton3.setEnabled(aVar2.f49187b);
                            GCMSnackbarContentLayout gCMSnackbarContentLayout = aVar.f49098d;
                            if (i17 != -1) {
                                if (gCMSnackbarContentLayout == null) {
                                    p005kotlin.jvm.internal.s.m("snackBarFooter");
                                    throw null;
                                }
                                gCMSnackbarContentLayout.getMessageView().setText(aVar.getString(i17));
                                GCMSnackbarContentLayout gCMSnackbarContentLayout2 = aVar.f49098d;
                                if (gCMSnackbarContentLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("snackBarFooter");
                                    throw null;
                                }
                                gCMSnackbarContentLayout2.setVisibility(0);
                                NestedScrollView nestedScrollView = aVar.f49099e;
                                if (nestedScrollView == null) {
                                    p005kotlin.jvm.internal.s.m("scrollView");
                                    throw null;
                                }
                                nestedScrollView.post(new eh2.b(aVar, 11));
                            } else {
                                if (gCMSnackbarContentLayout == null) {
                                    p005kotlin.jvm.internal.s.m("snackBarFooter");
                                    throw null;
                                }
                                gCMSnackbarContentLayout.setVisibility(8);
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.C0961a c0961a = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.f49094h;
                        }
                        return Unit.INSTANCE;
                    default:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i iVar2 = aVar.f49096b;
                        if (iVar2 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        if (pVar == null || (workoutDetailsDTO = (WorkoutDetailsDTO) pVar.f128595b) == null || (obj2 = workoutDetailsDTO.Q0) == null) {
                            obj2 = j0.f134944a;
                        }
                        obj2.getClass();
                        ArrayList arrayList = iVar2.f49205c;
                        arrayList.clear();
                        arrayList.addAll(obj2);
                        iVar2.notifyDataSetChanged();
                        if (((Boolean) pVar.f128594a).booleanValue()) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.u6(aVar, 0);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0961a {
        public /* synthetic */ C0961a(j jVar) {
            this();
        }

        private C0961a() {
        }
    }
}
