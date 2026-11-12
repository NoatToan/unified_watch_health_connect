package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.ListItemView;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.io.Serializable;
import lc.u0;
import mt0.h0;
import o13.m;
import o13.t;
import o62.r;
import o62.s;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f49637i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListItemView f49639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpinnerDialogView f49640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f49641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f49642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m52.d f49643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f49644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f49645h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49646a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.NumberOfTimes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.RepeatUntil.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49646a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49647a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f49647a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f49647a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49647a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0981d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0981d(Fragment fragment) {
            super(0);
            this.f49648a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49648a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f49650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f49649a = aVar;
            this.f49650b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49649a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49650b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f49651a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49651a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d() {
        super(R.layout.workout_round_type);
        this.f49638a = new w1(s0.f105811a.b(r.class), new C0981d(this), new f(this), new e(null, this));
        final int i14 = 0;
        this.f49644g = m.b(new e23.a(this) { // from class: o62.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d f129752b;

            {
                this.f129752b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d dVar = this.f129752b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i;
                        Context contextRequireContext = dVar.requireContext();
                        contextRequireContext.getClass();
                        return new p62.p(contextRequireContext);
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i;
                        Context contextRequireContext2 = dVar.requireContext();
                        contextRequireContext2.getClass();
                        return new p62.q(contextRequireContext2);
                }
            }
        });
        final int i15 = 1;
        this.f49645h = m.b(new e23.a(this) { // from class: o62.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d f129752b;

            {
                this.f129752b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d dVar = this.f129752b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i;
                        Context contextRequireContext = dVar.requireContext();
                        contextRequireContext.getClass();
                        return new p62.p(contextRequireContext);
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i;
                        Context contextRequireContext2 = dVar.requireContext();
                        contextRequireContext2.getClass();
                        return new p62.q(contextRequireContext2);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        m52.d dVar = null;
        this.f49642e = arguments != null ? Boolean.valueOf(arguments.getBoolean("SKIP_LAST_REST_STEP")) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments2.getSerializable("EXTRA_LAST_STEP_TYPE", m52.d.class);
            } else {
                Serializable serializable2 = arguments2.getSerializable("EXTRA_LAST_STEP_TYPE");
                serializable = (m52.d) (serializable2 instanceof m52.d ? serializable2 : null);
            }
            dVar = (m52.d) serializable;
        }
        this.f49643f = dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.list_item_round_type);
        viewFindViewById.getClass();
        ListItemView listItemView = (ListItemView) viewFindViewById;
        this.f49639b = listItemView;
        listItemView.setOnClickListener(new h0(this, 28));
        ListItemView listItemView2 = this.f49639b;
        if (listItemView2 == null) {
            p005kotlin.jvm.internal.s.m("editRoundTypeView");
            throw null;
        }
        listItemView2.setEnabled(v6().f129757d);
        View viewFindViewById2 = view2.findViewById(R.id.skip_last_rest_step_toggle_view);
        viewFindViewById2.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById2;
        this.f49641d = gCMComplexTwoLineButton;
        if (this.f49642e == null) {
            gCMComplexTwoLineButton.setVisibility(8);
        } else {
            gCMComplexTwoLineButton.setVisibility(0);
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f49641d;
            if (gCMComplexTwoLineButton2 == null) {
                p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                throw null;
            }
            gCMComplexTwoLineButton2.f(true);
            int dimension = (int) getResources().getDimension(R.dimen.spacing_xxlarge);
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f49641d;
            if (gCMComplexTwoLineButton3 == null) {
                p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                throw null;
            }
            gCMComplexTwoLineButton3.f47786f.setPadding(0, 0, dimension, 0);
            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f49641d;
            if (gCMComplexTwoLineButton4 == null) {
                p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                throw null;
            }
            gCMComplexTwoLineButton4.setEnabled(true);
            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f49641d;
            if (gCMComplexTwoLineButton5 == null) {
                p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                throw null;
            }
            Boolean bool = this.f49642e;
            gCMComplexTwoLineButton5.g(bool != null ? bool.booleanValue() : false);
            m52.d dVar = this.f49643f;
            if (dVar == null || dVar != m52.d.REST) {
                GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f49641d;
                if (gCMComplexTwoLineButton6 == null) {
                    p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                    throw null;
                }
                gCMComplexTwoLineButton6.setButtonTopLabel(getString(R.string.lbl_workout_skip_last_step, getString(R.string.workout_step_type_recovery)));
                GCMComplexTwoLineButton gCMComplexTwoLineButton7 = this.f49641d;
                if (gCMComplexTwoLineButton7 == null) {
                    p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                    throw null;
                }
                gCMComplexTwoLineButton7.setButtonBottomLeftLabel(getString(R.string.msg_workout_skip_last_step_toggle, u0.j(getString(R.string.workout_step_type_recovery))));
            } else {
                GCMComplexTwoLineButton gCMComplexTwoLineButton8 = this.f49641d;
                if (gCMComplexTwoLineButton8 == null) {
                    p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                    throw null;
                }
                gCMComplexTwoLineButton8.setButtonTopLabel(getString(R.string.lbl_workout_skip_last_step, getString(R.string.workout_step_type_rest)));
                GCMComplexTwoLineButton gCMComplexTwoLineButton9 = this.f49641d;
                if (gCMComplexTwoLineButton9 == null) {
                    p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                    throw null;
                }
                gCMComplexTwoLineButton9.setButtonBottomLeftLabel(getString(R.string.msg_workout_skip_last_step_toggle, u0.j(getString(R.string.workout_step_type_rest))));
            }
            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = this.f49641d;
            if (gCMComplexTwoLineButton10 == null) {
                p005kotlin.jvm.internal.s.m("skipLastRestStepView");
                throw null;
            }
            gCMComplexTwoLineButton10.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 9));
        }
        View viewFindViewById3 = view2.findViewById(R.id.list_item_round_condition);
        viewFindViewById3.getClass();
        SpinnerDialogView spinnerDialogView = (SpinnerDialogView) viewFindViewById3;
        this.f49640c = spinnerDialogView;
        spinnerDialogView.setShowSubtitle(false);
        v6().f129755b.f(getViewLifecycleOwner(), new c(new nw0.f(this, 3)));
        w6(g8.i.K(v6().x4()));
        if (v6().f129758e) {
            SpinnerDialogView spinnerDialogView2 = this.f49640c;
            if (spinnerDialogView2 == null) {
                p005kotlin.jvm.internal.s.m("roundConditionView");
                throw null;
            }
            spinnerDialogView2.callOnClick();
            v6().f129758e = false;
        }
    }

    public final p62.r u6() {
        int i14 = b.f49646a[g8.i.K(v6().x4()).ordinal()];
        if (i14 == 1) {
            return (p62.r) this.f49644g.getValue();
        }
        if (i14 == 2) {
            return (p62.r) this.f49645h.getValue();
        }
        u0.r();
        return null;
    }

    public final r v6() {
        return (r) this.f49638a.getValue();
    }

    public final void w6(s sVar) {
        ListItemView listItemView = this.f49639b;
        if (listItemView == null) {
            p005kotlin.jvm.internal.s.m("editRoundTypeView");
            throw null;
        }
        listItemView.setSubtitle(getString(sVar.f129769b));
        SpinnerDialogView spinnerDialogView = this.f49640c;
        if (spinnerDialogView == null) {
            p005kotlin.jvm.internal.s.m("roundConditionView");
            throw null;
        }
        String strA = u6().a(v6().x4());
        if (strA != null) {
            spinnerDialogView.setTitle(strA);
        }
        spinnerDialogView.setOnSpinnerValuesChangeListener(u6().b(v6().x4()));
        spinnerDialogView.setOnSpinnerListRowClickListener(u6().c(v6().x4()));
        p62.r rVarU6 = u6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        spinnerDialogView.setOnSpinnerDialogButtonClickListener(rVarU6.e(contextRequireContext, v6().x4()));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/d$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
