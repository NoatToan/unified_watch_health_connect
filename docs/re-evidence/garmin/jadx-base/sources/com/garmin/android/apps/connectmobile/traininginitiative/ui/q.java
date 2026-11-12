package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSegmentedButton;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import ty1.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/q;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46204j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f46207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScrollView f46208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMSegmentedButton f46209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMSegmentedButton f46210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f46211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f46212i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/q$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            q qVar = q.this;
            AddTIEventViewModel addTIEventViewModelA6 = qVar.A6();
            GCMSegmentedButton gCMSegmentedButton = qVar.f46209f;
            if (gCMSegmentedButton == null) {
                p005kotlin.jvm.internal.s.m("shareableButton");
                throw null;
            }
            addTIEventViewModelA6.E6(gCMSegmentedButton.a());
            AddTIEventViewModel addTIEventViewModelA7 = qVar.A6();
            GCMSegmentedButton gCMSegmentedButton2 = qVar.f46210g;
            if (gCMSegmentedButton2 == null) {
                p005kotlin.jvm.internal.s.m("visibleButton");
                throw null;
            }
            addTIEventViewModelA7.H6(gCMSegmentedButton2.a());
            qVar.f46207d.f(false);
            qVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46214a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f46214a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46214a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46214a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46215a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46215a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46217b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46216a = aVar;
            this.f46217b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46216a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46217b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46218a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46218a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public q() {
        super(R.layout.ti_add_event_shareable_fragment);
        this.f46206c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new d(this), new f(this), new e(null, this));
        this.f46207d = new b();
    }

    public final AddTIEventViewModel A6() {
        return (AddTIEventViewModel) this.f46206c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46205b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventShareableFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46205b;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46207d, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.activity_scroll_container);
        viewFindViewById.getClass();
        this.f46208e = (ScrollView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.shareable_button);
        viewFindViewById2.getClass();
        this.f46209f = (GCMSegmentedButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.visible_button);
        viewFindViewById3.getClass();
        this.f46210g = (GCMSegmentedButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.fragment_next_button);
        viewFindViewById4.getClass();
        this.f46212i = (Button) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.bottom_layout);
        viewFindViewById5.getClass();
        this.f46211h = (LinearLayout) viewFindViewById5;
        GCMSegmentedButton gCMSegmentedButton = this.f46209f;
        if (gCMSegmentedButton == null) {
            p005kotlin.jvm.internal.s.m("shareableButton");
            throw null;
        }
        final int i14 = 0;
        gCMSegmentedButton.setOnSwitchClickListener(new View.OnClickListener(this) { // from class: ty1.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.q f167252b;

            {
                this.f167252b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = this.f167252b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (!s3.b()) {
                            AddTIEventViewModel addTIEventViewModelA6 = qVar.A6();
                            GCMSegmentedButton gCMSegmentedButton2 = qVar.f46209f;
                            if (gCMSegmentedButton2 != null) {
                                addTIEventViewModelA6.E6(gCMSegmentedButton2.a());
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("shareableButton");
                                throw null;
                            }
                        }
                        Context contextRequireContext = qVar.requireContext();
                        contextRequireContext.getClass();
                        l1.a(contextRequireContext);
                        GCMSegmentedButton gCMSegmentedButton3 = qVar.f46209f;
                        if (gCMSegmentedButton3 != null) {
                            gCMSegmentedButton3.c();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("shareableButton");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        AddTIEventViewModel addTIEventViewModelA7 = qVar.A6();
                        GCMSegmentedButton gCMSegmentedButton4 = qVar.f46210g;
                        if (gCMSegmentedButton4 != null) {
                            addTIEventViewModelA7.H6(gCMSegmentedButton4.a());
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("visibleButton");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventPrivacyAdded");
                        int i16 = 0;
                        if (!qVar.A6().p6() || qVar.A6().P4()) {
                            AddTIEventViewModel addTIEventViewModelA8 = qVar.A6();
                            addTIEventViewModelA8.C2 = false;
                            addTIEventViewModelA8.O5().m("TIAddLocationFragment");
                            return;
                        } else {
                            androidx.fragment.app.m activity = qVar.getActivity();
                            TrainingInitiativeEventActivity trainingInitiativeEventActivity = activity instanceof TrainingInitiativeEventActivity ? (TrainingInitiativeEventActivity) activity : null;
                            if (trainingInitiativeEventActivity != null) {
                                trainingInitiativeEventActivity.ka().Y5().f(trainingInitiativeEventActivity, new TrainingInitiativeEventActivity.c(new n2(trainingInitiativeEventActivity, i16)));
                                return;
                            }
                            return;
                        }
                }
            }
        });
        GCMSegmentedButton gCMSegmentedButton2 = this.f46210g;
        if (gCMSegmentedButton2 == null) {
            p005kotlin.jvm.internal.s.m("visibleButton");
            throw null;
        }
        final int i15 = 1;
        gCMSegmentedButton2.setOnSwitchClickListener(new View.OnClickListener(this) { // from class: ty1.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.q f167252b;

            {
                this.f167252b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = this.f167252b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (!s3.b()) {
                            AddTIEventViewModel addTIEventViewModelA6 = qVar.A6();
                            GCMSegmentedButton gCMSegmentedButton3 = qVar.f46209f;
                            if (gCMSegmentedButton3 != null) {
                                addTIEventViewModelA6.E6(gCMSegmentedButton3.a());
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("shareableButton");
                                throw null;
                            }
                        }
                        Context contextRequireContext = qVar.requireContext();
                        contextRequireContext.getClass();
                        l1.a(contextRequireContext);
                        GCMSegmentedButton gCMSegmentedButton4 = qVar.f46209f;
                        if (gCMSegmentedButton4 != null) {
                            gCMSegmentedButton4.c();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("shareableButton");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        AddTIEventViewModel addTIEventViewModelA7 = qVar.A6();
                        GCMSegmentedButton gCMSegmentedButton5 = qVar.f46210g;
                        if (gCMSegmentedButton5 != null) {
                            addTIEventViewModelA7.H6(gCMSegmentedButton5.a());
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("visibleButton");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventPrivacyAdded");
                        int i17 = 0;
                        if (!qVar.A6().p6() || qVar.A6().P4()) {
                            AddTIEventViewModel addTIEventViewModelA8 = qVar.A6();
                            addTIEventViewModelA8.C2 = false;
                            addTIEventViewModelA8.O5().m("TIAddLocationFragment");
                            return;
                        } else {
                            androidx.fragment.app.m activity = qVar.getActivity();
                            TrainingInitiativeEventActivity trainingInitiativeEventActivity = activity instanceof TrainingInitiativeEventActivity ? (TrainingInitiativeEventActivity) activity : null;
                            if (trainingInitiativeEventActivity != null) {
                                trainingInitiativeEventActivity.ka().Y5().f(trainingInitiativeEventActivity, new TrainingInitiativeEventActivity.c(new n2(trainingInitiativeEventActivity, i17)));
                                return;
                            }
                            return;
                        }
                }
            }
        });
        Button button = this.f46212i;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        final int i16 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.q f167252b;

            {
                this.f167252b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = this.f167252b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (!s3.b()) {
                            AddTIEventViewModel addTIEventViewModelA6 = qVar.A6();
                            GCMSegmentedButton gCMSegmentedButton3 = qVar.f46209f;
                            if (gCMSegmentedButton3 != null) {
                                addTIEventViewModelA6.E6(gCMSegmentedButton3.a());
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("shareableButton");
                                throw null;
                            }
                        }
                        Context contextRequireContext = qVar.requireContext();
                        contextRequireContext.getClass();
                        l1.a(contextRequireContext);
                        GCMSegmentedButton gCMSegmentedButton4 = qVar.f46209f;
                        if (gCMSegmentedButton4 != null) {
                            gCMSegmentedButton4.c();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("shareableButton");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        AddTIEventViewModel addTIEventViewModelA7 = qVar.A6();
                        GCMSegmentedButton gCMSegmentedButton5 = qVar.f46210g;
                        if (gCMSegmentedButton5 != null) {
                            addTIEventViewModelA7.H6(gCMSegmentedButton5.a());
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("visibleButton");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventPrivacyAdded");
                        int i18 = 0;
                        if (!qVar.A6().p6() || qVar.A6().P4()) {
                            AddTIEventViewModel addTIEventViewModelA8 = qVar.A6();
                            addTIEventViewModelA8.C2 = false;
                            addTIEventViewModelA8.O5().m("TIAddLocationFragment");
                            return;
                        } else {
                            androidx.fragment.app.m activity = qVar.getActivity();
                            TrainingInitiativeEventActivity trainingInitiativeEventActivity = activity instanceof TrainingInitiativeEventActivity ? (TrainingInitiativeEventActivity) activity : null;
                            if (trainingInitiativeEventActivity != null) {
                                trainingInitiativeEventActivity.ka().Y5().f(trainingInitiativeEventActivity, new TrainingInitiativeEventActivity.c(new n2(trainingInitiativeEventActivity, i18)));
                                return;
                            }
                            return;
                        }
                }
            }
        });
        final int i17 = 0;
        ((androidx.lifecycle.s0) A6().V0.getValue()).f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: ty1.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.q f167258b;

            {
                this.f167258b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = this.f167258b;
                Boolean bool = (Boolean) obj;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            GCMSegmentedButton gCMSegmentedButton3 = qVar.f46209f;
                            if (gCMSegmentedButton3 == null) {
                                p005kotlin.jvm.internal.s.m("shareableButton");
                                throw null;
                            }
                            gCMSegmentedButton3.b(zBooleanValue);
                            GCMSegmentedButton gCMSegmentedButton4 = qVar.f46210g;
                            if (gCMSegmentedButton4 == null) {
                                p005kotlin.jvm.internal.s.m("visibleButton");
                                throw null;
                            }
                            if (gCMSegmentedButton4.getVisibility() == 8 && zBooleanValue) {
                                qVar.A6().H6(zBooleanValue);
                                GCMSegmentedButton gCMSegmentedButton5 = qVar.f46210g;
                                if (gCMSegmentedButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                SwitchCompat switchCompat = gCMSegmentedButton5.f47801f;
                                if (switchCompat != null && !switchCompat.isChecked()) {
                                    switchCompat.setChecked(true);
                                }
                                GCMSegmentedButton gCMSegmentedButton6 = qVar.f46210g;
                                if (gCMSegmentedButton6 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                v22.e.r(gCMSegmentedButton6, zBooleanValue);
                            } else if (!zBooleanValue) {
                                GCMSegmentedButton gCMSegmentedButton7 = qVar.f46210g;
                                if (gCMSegmentedButton7 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                gCMSegmentedButton7.setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (bool != null) {
                            boolean zBooleanValue2 = bool.booleanValue();
                            GCMSegmentedButton gCMSegmentedButton8 = qVar.f46210g;
                            if (gCMSegmentedButton8 == null) {
                                p005kotlin.jvm.internal.s.m("visibleButton");
                                throw null;
                            }
                            gCMSegmentedButton8.b(zBooleanValue2);
                        }
                        return Unit.INSTANCE;
                    default:
                        ScrollView scrollView = qVar.f46208e;
                        if (scrollView == null) {
                            p005kotlin.jvm.internal.s.m("scrollView");
                            throw null;
                        }
                        v22.e.r(scrollView, !bool.booleanValue());
                        LinearLayout linearLayout = qVar.f46211h;
                        if (linearLayout != null) {
                            v22.e.r(linearLayout, !bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("bottomButtonLayout");
                        throw null;
                }
            }
        }));
        final int i18 = 1;
        ((androidx.lifecycle.s0) A6().f46399b1.getValue()).f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: ty1.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.q f167258b;

            {
                this.f167258b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = this.f167258b;
                Boolean bool = (Boolean) obj;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            GCMSegmentedButton gCMSegmentedButton3 = qVar.f46209f;
                            if (gCMSegmentedButton3 == null) {
                                p005kotlin.jvm.internal.s.m("shareableButton");
                                throw null;
                            }
                            gCMSegmentedButton3.b(zBooleanValue);
                            GCMSegmentedButton gCMSegmentedButton4 = qVar.f46210g;
                            if (gCMSegmentedButton4 == null) {
                                p005kotlin.jvm.internal.s.m("visibleButton");
                                throw null;
                            }
                            if (gCMSegmentedButton4.getVisibility() == 8 && zBooleanValue) {
                                qVar.A6().H6(zBooleanValue);
                                GCMSegmentedButton gCMSegmentedButton5 = qVar.f46210g;
                                if (gCMSegmentedButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                SwitchCompat switchCompat = gCMSegmentedButton5.f47801f;
                                if (switchCompat != null && !switchCompat.isChecked()) {
                                    switchCompat.setChecked(true);
                                }
                                GCMSegmentedButton gCMSegmentedButton6 = qVar.f46210g;
                                if (gCMSegmentedButton6 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                v22.e.r(gCMSegmentedButton6, zBooleanValue);
                            } else if (!zBooleanValue) {
                                GCMSegmentedButton gCMSegmentedButton7 = qVar.f46210g;
                                if (gCMSegmentedButton7 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                gCMSegmentedButton7.setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (bool != null) {
                            boolean zBooleanValue2 = bool.booleanValue();
                            GCMSegmentedButton gCMSegmentedButton8 = qVar.f46210g;
                            if (gCMSegmentedButton8 == null) {
                                p005kotlin.jvm.internal.s.m("visibleButton");
                                throw null;
                            }
                            gCMSegmentedButton8.b(zBooleanValue2);
                        }
                        return Unit.INSTANCE;
                    default:
                        ScrollView scrollView = qVar.f46208e;
                        if (scrollView == null) {
                            p005kotlin.jvm.internal.s.m("scrollView");
                            throw null;
                        }
                        v22.e.r(scrollView, !bool.booleanValue());
                        LinearLayout linearLayout = qVar.f46211h;
                        if (linearLayout != null) {
                            v22.e.r(linearLayout, !bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("bottomButtonLayout");
                        throw null;
                }
            }
        }));
        final int i19 = 2;
        ((androidx.lifecycle.s0) A6().f46436t1.getValue()).f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: ty1.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.q f167258b;

            {
                this.f167258b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = this.f167258b;
                Boolean bool = (Boolean) obj;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            GCMSegmentedButton gCMSegmentedButton3 = qVar.f46209f;
                            if (gCMSegmentedButton3 == null) {
                                p005kotlin.jvm.internal.s.m("shareableButton");
                                throw null;
                            }
                            gCMSegmentedButton3.b(zBooleanValue);
                            GCMSegmentedButton gCMSegmentedButton4 = qVar.f46210g;
                            if (gCMSegmentedButton4 == null) {
                                p005kotlin.jvm.internal.s.m("visibleButton");
                                throw null;
                            }
                            if (gCMSegmentedButton4.getVisibility() == 8 && zBooleanValue) {
                                qVar.A6().H6(zBooleanValue);
                                GCMSegmentedButton gCMSegmentedButton5 = qVar.f46210g;
                                if (gCMSegmentedButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                SwitchCompat switchCompat = gCMSegmentedButton5.f47801f;
                                if (switchCompat != null && !switchCompat.isChecked()) {
                                    switchCompat.setChecked(true);
                                }
                                GCMSegmentedButton gCMSegmentedButton6 = qVar.f46210g;
                                if (gCMSegmentedButton6 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                v22.e.r(gCMSegmentedButton6, zBooleanValue);
                            } else if (!zBooleanValue) {
                                GCMSegmentedButton gCMSegmentedButton7 = qVar.f46210g;
                                if (gCMSegmentedButton7 == null) {
                                    p005kotlin.jvm.internal.s.m("visibleButton");
                                    throw null;
                                }
                                gCMSegmentedButton7.setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                        if (bool != null) {
                            boolean zBooleanValue2 = bool.booleanValue();
                            GCMSegmentedButton gCMSegmentedButton8 = qVar.f46210g;
                            if (gCMSegmentedButton8 == null) {
                                p005kotlin.jvm.internal.s.m("visibleButton");
                                throw null;
                            }
                            gCMSegmentedButton8.b(zBooleanValue2);
                        }
                        return Unit.INSTANCE;
                    default:
                        ScrollView scrollView = qVar.f46208e;
                        if (scrollView == null) {
                            p005kotlin.jvm.internal.s.m("scrollView");
                            throw null;
                        }
                        v22.e.r(scrollView, !bool.booleanValue());
                        LinearLayout linearLayout = qVar.f46211h;
                        if (linearLayout != null) {
                            v22.e.r(linearLayout, !bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("bottomButtonLayout");
                        throw null;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
