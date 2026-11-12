package hx1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhx1/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f86243l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f86244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f86247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f86248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f86249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f86250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f86251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f86252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f86253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f86254k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hx1/f$b", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f fVar = f.this;
            fVar.f86254k.f(false);
            fVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f86256a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f86256a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f86256a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86256a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f86257a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f86257a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f86258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f86259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f86258a = aVar;
            this.f86259b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f86258a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f86259b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: hx1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C1713f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f86260a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1713f(Fragment fragment) {
            super(0);
            this.f86260a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f86260a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f() {
        super(R.layout.gcm4_stp_filter_fragment);
        this.f86244a = new w1(s0.f105811a.b(gx1.b.class), new d(this), new C1713f(this), new e(null, this));
        this.f86254k = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((y0) u6().f80050d.getValue()).j(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f86254k, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.title_text_view);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setText(getString(R.string.lbl_filter));
        View viewFindViewById2 = view2.findViewById(R.id.text_view_cancel);
        viewFindViewById2.getClass();
        this.f86245b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text_view_apply);
        viewFindViewById3.getClass();
        this.f86246c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.reset);
        viewFindViewById4.getClass();
        this.f86247d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.difficulty_view);
        viewFindViewById5.getClass();
        this.f86248e = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.text_view_difficulty_filter);
        viewFindViewById6.getClass();
        this.f86249f = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.plan_type_view);
        viewFindViewById7.getClass();
        this.f86250g = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.text_view_plan_type_filter);
        viewFindViewById8.getClass();
        this.f86251h = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.workouts_view);
        viewFindViewById9.getClass();
        this.f86252i = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.text_view_workouts_filter);
        viewFindViewById10.getClass();
        this.f86253j = (TextView) viewFindViewById10;
        TextView textView = this.f86245b;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("cancel");
            throw null;
        }
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86240b;

            {
                this.f86240b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                f fVar = this.f86240b;
                switch (i15) {
                    case 0:
                        f.a aVar = f.f86243l;
                        m activity = fVar.getActivity();
                        if (activity != null) {
                            activity.setResult(0);
                        }
                        m activity2 = fVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 1:
                        f.a aVar2 = f.f86243l;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_static_plan_filter_dto", (Parcelable) fVar.u6().f80053g.d());
                        m activity3 = fVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        m activity4 = fVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    case 2:
                        f.a aVar3 = f.f86243l;
                        gx1.b bVarU6 = fVar.u6();
                        ex1.a aVarD = bVarU6.x4().d();
                        if (aVarD != null) {
                            aVarD.f66927a = fx1.a.ALL;
                            aVarD.f66928b = fx1.b.ALL;
                            aVarD.f66929c = fx1.e.ALL;
                        }
                        ((y0) bVarU6.f80054h.getValue()).j(fx1.a.ALL);
                        ((y0) bVarU6.f80056j.getValue()).j(fx1.b.ALL);
                        ((y0) bVarU6.f80058l.getValue()).j(fx1.e.ALL);
                        break;
                    case 3:
                        f.a aVar4 = f.f86243l;
                        fVar.u6().y4().m("StpFilterDifficultyFragment");
                        break;
                    case 4:
                        f.a aVar5 = f.f86243l;
                        fVar.u6().y4().m("StpFilterPlanTypeFragment");
                        break;
                    default:
                        f.a aVar6 = f.f86243l;
                        fVar.u6().y4().m("StpFilterWorkoutsPerWeekFragment");
                        break;
                }
            }
        });
        TextView textView2 = this.f86246c;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("apply");
            throw null;
        }
        final int i15 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86240b;

            {
                this.f86240b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                f fVar = this.f86240b;
                switch (i16) {
                    case 0:
                        f.a aVar = f.f86243l;
                        m activity = fVar.getActivity();
                        if (activity != null) {
                            activity.setResult(0);
                        }
                        m activity2 = fVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 1:
                        f.a aVar2 = f.f86243l;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_static_plan_filter_dto", (Parcelable) fVar.u6().f80053g.d());
                        m activity3 = fVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        m activity4 = fVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    case 2:
                        f.a aVar3 = f.f86243l;
                        gx1.b bVarU6 = fVar.u6();
                        ex1.a aVarD = bVarU6.x4().d();
                        if (aVarD != null) {
                            aVarD.f66927a = fx1.a.ALL;
                            aVarD.f66928b = fx1.b.ALL;
                            aVarD.f66929c = fx1.e.ALL;
                        }
                        ((y0) bVarU6.f80054h.getValue()).j(fx1.a.ALL);
                        ((y0) bVarU6.f80056j.getValue()).j(fx1.b.ALL);
                        ((y0) bVarU6.f80058l.getValue()).j(fx1.e.ALL);
                        break;
                    case 3:
                        f.a aVar4 = f.f86243l;
                        fVar.u6().y4().m("StpFilterDifficultyFragment");
                        break;
                    case 4:
                        f.a aVar5 = f.f86243l;
                        fVar.u6().y4().m("StpFilterPlanTypeFragment");
                        break;
                    default:
                        f.a aVar6 = f.f86243l;
                        fVar.u6().y4().m("StpFilterWorkoutsPerWeekFragment");
                        break;
                }
            }
        });
        TextView textView3 = this.f86247d;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("reset");
            throw null;
        }
        final int i16 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86240b;

            {
                this.f86240b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                f fVar = this.f86240b;
                switch (i17) {
                    case 0:
                        f.a aVar = f.f86243l;
                        m activity = fVar.getActivity();
                        if (activity != null) {
                            activity.setResult(0);
                        }
                        m activity2 = fVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 1:
                        f.a aVar2 = f.f86243l;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_static_plan_filter_dto", (Parcelable) fVar.u6().f80053g.d());
                        m activity3 = fVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        m activity4 = fVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    case 2:
                        f.a aVar3 = f.f86243l;
                        gx1.b bVarU6 = fVar.u6();
                        ex1.a aVarD = bVarU6.x4().d();
                        if (aVarD != null) {
                            aVarD.f66927a = fx1.a.ALL;
                            aVarD.f66928b = fx1.b.ALL;
                            aVarD.f66929c = fx1.e.ALL;
                        }
                        ((y0) bVarU6.f80054h.getValue()).j(fx1.a.ALL);
                        ((y0) bVarU6.f80056j.getValue()).j(fx1.b.ALL);
                        ((y0) bVarU6.f80058l.getValue()).j(fx1.e.ALL);
                        break;
                    case 3:
                        f.a aVar4 = f.f86243l;
                        fVar.u6().y4().m("StpFilterDifficultyFragment");
                        break;
                    case 4:
                        f.a aVar5 = f.f86243l;
                        fVar.u6().y4().m("StpFilterPlanTypeFragment");
                        break;
                    default:
                        f.a aVar6 = f.f86243l;
                        fVar.u6().y4().m("StpFilterWorkoutsPerWeekFragment");
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f86248e;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("difficultyView");
            throw null;
        }
        final int i17 = 3;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86240b;

            {
                this.f86240b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                f fVar = this.f86240b;
                switch (i18) {
                    case 0:
                        f.a aVar = f.f86243l;
                        m activity = fVar.getActivity();
                        if (activity != null) {
                            activity.setResult(0);
                        }
                        m activity2 = fVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 1:
                        f.a aVar2 = f.f86243l;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_static_plan_filter_dto", (Parcelable) fVar.u6().f80053g.d());
                        m activity3 = fVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        m activity4 = fVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    case 2:
                        f.a aVar3 = f.f86243l;
                        gx1.b bVarU6 = fVar.u6();
                        ex1.a aVarD = bVarU6.x4().d();
                        if (aVarD != null) {
                            aVarD.f66927a = fx1.a.ALL;
                            aVarD.f66928b = fx1.b.ALL;
                            aVarD.f66929c = fx1.e.ALL;
                        }
                        ((y0) bVarU6.f80054h.getValue()).j(fx1.a.ALL);
                        ((y0) bVarU6.f80056j.getValue()).j(fx1.b.ALL);
                        ((y0) bVarU6.f80058l.getValue()).j(fx1.e.ALL);
                        break;
                    case 3:
                        f.a aVar4 = f.f86243l;
                        fVar.u6().y4().m("StpFilterDifficultyFragment");
                        break;
                    case 4:
                        f.a aVar5 = f.f86243l;
                        fVar.u6().y4().m("StpFilterPlanTypeFragment");
                        break;
                    default:
                        f.a aVar6 = f.f86243l;
                        fVar.u6().y4().m("StpFilterWorkoutsPerWeekFragment");
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = this.f86250g;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("planTypeView");
            throw null;
        }
        final int i18 = 4;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86240b;

            {
                this.f86240b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                f fVar = this.f86240b;
                switch (i19) {
                    case 0:
                        f.a aVar = f.f86243l;
                        m activity = fVar.getActivity();
                        if (activity != null) {
                            activity.setResult(0);
                        }
                        m activity2 = fVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 1:
                        f.a aVar2 = f.f86243l;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_static_plan_filter_dto", (Parcelable) fVar.u6().f80053g.d());
                        m activity3 = fVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        m activity4 = fVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    case 2:
                        f.a aVar3 = f.f86243l;
                        gx1.b bVarU6 = fVar.u6();
                        ex1.a aVarD = bVarU6.x4().d();
                        if (aVarD != null) {
                            aVarD.f66927a = fx1.a.ALL;
                            aVarD.f66928b = fx1.b.ALL;
                            aVarD.f66929c = fx1.e.ALL;
                        }
                        ((y0) bVarU6.f80054h.getValue()).j(fx1.a.ALL);
                        ((y0) bVarU6.f80056j.getValue()).j(fx1.b.ALL);
                        ((y0) bVarU6.f80058l.getValue()).j(fx1.e.ALL);
                        break;
                    case 3:
                        f.a aVar4 = f.f86243l;
                        fVar.u6().y4().m("StpFilterDifficultyFragment");
                        break;
                    case 4:
                        f.a aVar5 = f.f86243l;
                        fVar.u6().y4().m("StpFilterPlanTypeFragment");
                        break;
                    default:
                        f.a aVar6 = f.f86243l;
                        fVar.u6().y4().m("StpFilterWorkoutsPerWeekFragment");
                        break;
                }
            }
        });
        LinearLayout linearLayout3 = this.f86252i;
        if (linearLayout3 == null) {
            p005kotlin.jvm.internal.s.m("workoutsView");
            throw null;
        }
        final int i19 = 5;
        linearLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: hx1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86240b;

            {
                this.f86240b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i19;
                f fVar = this.f86240b;
                switch (i110) {
                    case 0:
                        f.a aVar = f.f86243l;
                        m activity = fVar.getActivity();
                        if (activity != null) {
                            activity.setResult(0);
                        }
                        m activity2 = fVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 1:
                        f.a aVar2 = f.f86243l;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_static_plan_filter_dto", (Parcelable) fVar.u6().f80053g.d());
                        m activity3 = fVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        m activity4 = fVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    case 2:
                        f.a aVar3 = f.f86243l;
                        gx1.b bVarU6 = fVar.u6();
                        ex1.a aVarD = bVarU6.x4().d();
                        if (aVarD != null) {
                            aVarD.f66927a = fx1.a.ALL;
                            aVarD.f66928b = fx1.b.ALL;
                            aVarD.f66929c = fx1.e.ALL;
                        }
                        ((y0) bVarU6.f80054h.getValue()).j(fx1.a.ALL);
                        ((y0) bVarU6.f80056j.getValue()).j(fx1.b.ALL);
                        ((y0) bVarU6.f80058l.getValue()).j(fx1.e.ALL);
                        break;
                    case 3:
                        f.a aVar4 = f.f86243l;
                        fVar.u6().y4().m("StpFilterDifficultyFragment");
                        break;
                    case 4:
                        f.a aVar5 = f.f86243l;
                        fVar.u6().y4().m("StpFilterPlanTypeFragment");
                        break;
                    default:
                        f.a aVar6 = f.f86243l;
                        fVar.u6().y4().m("StpFilterWorkoutsPerWeekFragment");
                        break;
                }
            }
        });
        final int i24 = 0;
        u6().f80053g.f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: hx1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86242b;

            {
                this.f86242b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i25 = i24;
                f fVar = this.f86242b;
                switch (i25) {
                    case 0:
                        ex1.a aVar = (ex1.a) obj;
                        TextView textView4 = fVar.f86249f;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("difficultyFilter");
                            throw null;
                        }
                        fx1.a aVar2 = aVar.f66927a;
                        m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        textView4.setText(aVar2.b(mVarRequireActivity));
                        TextView textView5 = fVar.f86251h;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("planTypeFilter");
                            throw null;
                        }
                        fx1.b bVar = aVar.f66928b;
                        m mVarRequireActivity2 = fVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        textView5.setText(bVar.b(mVarRequireActivity2));
                        TextView textView6 = fVar.f86253j;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("workoutsFilter");
                            throw null;
                        }
                        fx1.e eVar = aVar.f66929c;
                        m mVarRequireActivity3 = fVar.requireActivity();
                        mVarRequireActivity3.getClass();
                        textView6.setText(eVar.b(mVarRequireActivity3));
                        return Unit.INSTANCE;
                    case 1:
                        fx1.a aVar3 = (fx1.a) obj;
                        if (aVar3 != null) {
                            TextView textView7 = fVar.f86249f;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("difficultyFilter");
                                throw null;
                            }
                            m mVarRequireActivity4 = fVar.requireActivity();
                            mVarRequireActivity4.getClass();
                            textView7.setText(aVar3.b(mVarRequireActivity4));
                        } else {
                            f.a aVar4 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fx1.b bVar2 = (fx1.b) obj;
                        if (bVar2 != null) {
                            TextView textView8 = fVar.f86251h;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("planTypeFilter");
                                throw null;
                            }
                            m mVarRequireActivity5 = fVar.requireActivity();
                            mVarRequireActivity5.getClass();
                            textView8.setText(bVar2.b(mVarRequireActivity5));
                        } else {
                            f.a aVar5 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    default:
                        fx1.e eVar2 = (fx1.e) obj;
                        if (eVar2 != null) {
                            TextView textView9 = fVar.f86253j;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("workoutsFilter");
                                throw null;
                            }
                            m mVarRequireActivity6 = fVar.requireActivity();
                            mVarRequireActivity6.getClass();
                            textView9.setText(eVar2.b(mVarRequireActivity6));
                        } else {
                            f.a aVar6 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i25 = 1;
        u6().f80055i.f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: hx1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86242b;

            {
                this.f86242b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i26 = i25;
                f fVar = this.f86242b;
                switch (i26) {
                    case 0:
                        ex1.a aVar = (ex1.a) obj;
                        TextView textView4 = fVar.f86249f;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("difficultyFilter");
                            throw null;
                        }
                        fx1.a aVar2 = aVar.f66927a;
                        m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        textView4.setText(aVar2.b(mVarRequireActivity));
                        TextView textView5 = fVar.f86251h;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("planTypeFilter");
                            throw null;
                        }
                        fx1.b bVar = aVar.f66928b;
                        m mVarRequireActivity2 = fVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        textView5.setText(bVar.b(mVarRequireActivity2));
                        TextView textView6 = fVar.f86253j;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("workoutsFilter");
                            throw null;
                        }
                        fx1.e eVar = aVar.f66929c;
                        m mVarRequireActivity3 = fVar.requireActivity();
                        mVarRequireActivity3.getClass();
                        textView6.setText(eVar.b(mVarRequireActivity3));
                        return Unit.INSTANCE;
                    case 1:
                        fx1.a aVar3 = (fx1.a) obj;
                        if (aVar3 != null) {
                            TextView textView7 = fVar.f86249f;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("difficultyFilter");
                                throw null;
                            }
                            m mVarRequireActivity4 = fVar.requireActivity();
                            mVarRequireActivity4.getClass();
                            textView7.setText(aVar3.b(mVarRequireActivity4));
                        } else {
                            f.a aVar4 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fx1.b bVar2 = (fx1.b) obj;
                        if (bVar2 != null) {
                            TextView textView8 = fVar.f86251h;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("planTypeFilter");
                                throw null;
                            }
                            m mVarRequireActivity5 = fVar.requireActivity();
                            mVarRequireActivity5.getClass();
                            textView8.setText(bVar2.b(mVarRequireActivity5));
                        } else {
                            f.a aVar5 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    default:
                        fx1.e eVar2 = (fx1.e) obj;
                        if (eVar2 != null) {
                            TextView textView9 = fVar.f86253j;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("workoutsFilter");
                                throw null;
                            }
                            m mVarRequireActivity6 = fVar.requireActivity();
                            mVarRequireActivity6.getClass();
                            textView9.setText(eVar2.b(mVarRequireActivity6));
                        } else {
                            f.a aVar6 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i26 = 2;
        u6().f80057k.f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: hx1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86242b;

            {
                this.f86242b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i27 = i26;
                f fVar = this.f86242b;
                switch (i27) {
                    case 0:
                        ex1.a aVar = (ex1.a) obj;
                        TextView textView4 = fVar.f86249f;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("difficultyFilter");
                            throw null;
                        }
                        fx1.a aVar2 = aVar.f66927a;
                        m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        textView4.setText(aVar2.b(mVarRequireActivity));
                        TextView textView5 = fVar.f86251h;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("planTypeFilter");
                            throw null;
                        }
                        fx1.b bVar = aVar.f66928b;
                        m mVarRequireActivity2 = fVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        textView5.setText(bVar.b(mVarRequireActivity2));
                        TextView textView6 = fVar.f86253j;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("workoutsFilter");
                            throw null;
                        }
                        fx1.e eVar = aVar.f66929c;
                        m mVarRequireActivity3 = fVar.requireActivity();
                        mVarRequireActivity3.getClass();
                        textView6.setText(eVar.b(mVarRequireActivity3));
                        return Unit.INSTANCE;
                    case 1:
                        fx1.a aVar3 = (fx1.a) obj;
                        if (aVar3 != null) {
                            TextView textView7 = fVar.f86249f;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("difficultyFilter");
                                throw null;
                            }
                            m mVarRequireActivity4 = fVar.requireActivity();
                            mVarRequireActivity4.getClass();
                            textView7.setText(aVar3.b(mVarRequireActivity4));
                        } else {
                            f.a aVar4 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fx1.b bVar2 = (fx1.b) obj;
                        if (bVar2 != null) {
                            TextView textView8 = fVar.f86251h;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("planTypeFilter");
                                throw null;
                            }
                            m mVarRequireActivity5 = fVar.requireActivity();
                            mVarRequireActivity5.getClass();
                            textView8.setText(bVar2.b(mVarRequireActivity5));
                        } else {
                            f.a aVar5 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    default:
                        fx1.e eVar2 = (fx1.e) obj;
                        if (eVar2 != null) {
                            TextView textView9 = fVar.f86253j;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("workoutsFilter");
                                throw null;
                            }
                            m mVarRequireActivity6 = fVar.requireActivity();
                            mVarRequireActivity6.getClass();
                            textView9.setText(eVar2.b(mVarRequireActivity6));
                        } else {
                            f.a aVar6 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i27 = 3;
        u6().f80059m.f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: hx1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f86242b;

            {
                this.f86242b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i28 = i27;
                f fVar = this.f86242b;
                switch (i28) {
                    case 0:
                        ex1.a aVar = (ex1.a) obj;
                        TextView textView4 = fVar.f86249f;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("difficultyFilter");
                            throw null;
                        }
                        fx1.a aVar2 = aVar.f66927a;
                        m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        textView4.setText(aVar2.b(mVarRequireActivity));
                        TextView textView5 = fVar.f86251h;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("planTypeFilter");
                            throw null;
                        }
                        fx1.b bVar = aVar.f66928b;
                        m mVarRequireActivity2 = fVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        textView5.setText(bVar.b(mVarRequireActivity2));
                        TextView textView6 = fVar.f86253j;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("workoutsFilter");
                            throw null;
                        }
                        fx1.e eVar = aVar.f66929c;
                        m mVarRequireActivity3 = fVar.requireActivity();
                        mVarRequireActivity3.getClass();
                        textView6.setText(eVar.b(mVarRequireActivity3));
                        return Unit.INSTANCE;
                    case 1:
                        fx1.a aVar3 = (fx1.a) obj;
                        if (aVar3 != null) {
                            TextView textView7 = fVar.f86249f;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("difficultyFilter");
                                throw null;
                            }
                            m mVarRequireActivity4 = fVar.requireActivity();
                            mVarRequireActivity4.getClass();
                            textView7.setText(aVar3.b(mVarRequireActivity4));
                        } else {
                            f.a aVar4 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    case 2:
                        fx1.b bVar2 = (fx1.b) obj;
                        if (bVar2 != null) {
                            TextView textView8 = fVar.f86251h;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("planTypeFilter");
                                throw null;
                            }
                            m mVarRequireActivity5 = fVar.requireActivity();
                            mVarRequireActivity5.getClass();
                            textView8.setText(bVar2.b(mVarRequireActivity5));
                        } else {
                            f.a aVar5 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                    default:
                        fx1.e eVar2 = (fx1.e) obj;
                        if (eVar2 != null) {
                            TextView textView9 = fVar.f86253j;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("workoutsFilter");
                                throw null;
                            }
                            m mVarRequireActivity6 = fVar.requireActivity();
                            mVarRequireActivity6.getClass();
                            textView9.setText(eVar2.b(mVarRequireActivity6));
                        } else {
                            f.a aVar6 = f.f86243l;
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final gx1.b u6() {
        return (gx1.b) this.f86244a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
