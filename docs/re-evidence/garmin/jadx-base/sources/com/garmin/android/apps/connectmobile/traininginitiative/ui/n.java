package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/n;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46137f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ry1.a f46138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f46139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f46140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexButton f46141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexButton f46142e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46143a;

        static {
            int[] iArr = new int[zf0.a.values().length];
            try {
                iArr[zf0.a.CREATE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f46143a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/n$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            n nVar = n.this;
            nVar.f46140c.f(false);
            nVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46145a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46145a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46145a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46145a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46146a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46146a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46147a = aVar;
            this.f46148b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46147a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46148b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46149a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46149a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public n() {
        super(R.layout.ti_add_event_main_fragment);
        this.f46139b = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46140c = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46138a = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventMainFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46138a;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46140c, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.find_an_event_button);
        ((GCMComplexButton) viewFindViewById).a(false);
        viewFindViewById.getClass();
        this.f46141d = (GCMComplexButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.create_an_event_button);
        ((GCMComplexButton) viewFindViewById2).a(false);
        viewFindViewById2.getClass();
        this.f46142e = (GCMComplexButton) viewFindViewById2;
        GCMComplexButton gCMComplexButton = this.f46141d;
        if (gCMComplexButton == null) {
            p005kotlin.jvm.internal.s.m("findEventButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexButton.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.n f167217b;

            {
                this.f167217b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.n nVar = this.f167217b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.n.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.f46137f;
                        AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) nVar.f46139b.getValue();
                        zf0.a aVar3 = zf0.a.FIND_EVENT_W_TYPE_SELECTION;
                        aVar3.getClass();
                        ((androidx.lifecycle.y0) addTIEventViewModel.Y.getValue()).m(aVar3);
                        addTIEventViewModel.O5().m("TIAddEventTypeFragment2");
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.n.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.f46137f;
                        AddTIEventViewModel addTIEventViewModel2 = (AddTIEventViewModel) nVar.f46139b.getValue();
                        zf0.a aVar5 = zf0.a.CREATE_EVENT;
                        aVar5.getClass();
                        ((androidx.lifecycle.y0) addTIEventViewModel2.Y.getValue()).m(aVar5);
                        addTIEventViewModel2.O5().m("TIAddEventNameFragment");
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton2 = this.f46142e;
        if (gCMComplexButton2 == null) {
            p005kotlin.jvm.internal.s.m("createEventButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.n f167217b;

            {
                this.f167217b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.n nVar = this.f167217b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.n.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.f46137f;
                        AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) nVar.f46139b.getValue();
                        zf0.a aVar3 = zf0.a.FIND_EVENT_W_TYPE_SELECTION;
                        aVar3.getClass();
                        ((androidx.lifecycle.y0) addTIEventViewModel.Y.getValue()).m(aVar3);
                        addTIEventViewModel.O5().m("TIAddEventTypeFragment2");
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.n.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.f46137f;
                        AddTIEventViewModel addTIEventViewModel2 = (AddTIEventViewModel) nVar.f46139b.getValue();
                        zf0.a aVar5 = zf0.a.CREATE_EVENT;
                        aVar5.getClass();
                        ((androidx.lifecycle.y0) addTIEventViewModel2.Y.getValue()).m(aVar5);
                        addTIEventViewModel2.O5().m("TIAddEventNameFragment");
                        break;
                }
            }
        });
        ((AddTIEventViewModel) this.f46139b.getValue()).o5().f(getViewLifecycleOwner(), new d(new tn2.t(this, 14)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
