package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import ty1.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/i;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f46067g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f46070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f46071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f46072f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/i$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            i iVar = i.this;
            iVar.f46070d.f(false);
            iVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46074a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46074a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46075a = aVar;
            this.f46076b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46075a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46076b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46077a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46077a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i() {
        super(R.layout.ti_add_create_course_fragment);
        this.f46069c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new c(this), new e(this), new d(null, this));
        this.f46070d = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46068b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventCreateACourseFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46068b;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46070d, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.create_a_course_title_description);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        w1 w1Var = this.f46069c;
        gg0.f fVarD = ((AddTIEventViewModel) w1Var.getValue()).D5().d();
        textView.setText(getString(R.string.no_event_courses_message, fVarD != null ? getString(fVarD.f77148b) : null));
        View viewFindViewById2 = view2.findViewById(R.id.create_a_course_button);
        viewFindViewById2.getClass();
        this.f46071e = (Button) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.skip_button);
        viewFindViewById3.getClass();
        this.f46072f = (Button) viewFindViewById3;
        Button button = this.f46071e;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        final int i14 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.i f167137b;

            {
                this.f167137b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.i iVar = this.f167137b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.i.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.i.f46067g;
                        AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) iVar.f46069c.getValue();
                        androidx.fragment.app.m mVarRequireActivity = iVar.requireActivity();
                        mVarRequireActivity.getClass();
                        addTIEventViewModel.u6(mVarRequireActivity);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.i.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.i.f46067g;
                        AddTIEventViewModel addTIEventViewModel2 = (AddTIEventViewModel) iVar.f46069c.getValue();
                        androidx.fragment.app.m mVarRequireActivity2 = iVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        addTIEventViewModel2.u6(mVarRequireActivity2);
                        break;
                }
            }
        });
        Button button2 = this.f46072f;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("skipButton");
            throw null;
        }
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.i f167137b;

            {
                this.f167137b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.i iVar = this.f167137b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.i.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.i.f46067g;
                        AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) iVar.f46069c.getValue();
                        androidx.fragment.app.m mVarRequireActivity = iVar.requireActivity();
                        mVarRequireActivity.getClass();
                        addTIEventViewModel.u6(mVarRequireActivity);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.i.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.i.f46067g;
                        AddTIEventViewModel addTIEventViewModel2 = (AddTIEventViewModel) iVar.f46069c.getValue();
                        androidx.fragment.app.m mVarRequireActivity2 = iVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        addTIEventViewModel2.u6(mVarRequireActivity2);
                        break;
                }
            }
        });
        ((AddTIEventViewModel) w1Var.getValue()).f46438u1.f(getViewLifecycleOwner(), new w61.g(new tn2.t(this, 13)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
