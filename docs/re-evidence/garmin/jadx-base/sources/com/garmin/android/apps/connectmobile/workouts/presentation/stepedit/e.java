package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import lc.u0;
import o62.r;
import o62.s;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49652d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMCheckableRow f49654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMCheckableRow f49655c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49656a;

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
            f49656a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49657a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f49657a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f49657a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49657a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f49658a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49658a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0982e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f49660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0982e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f49659a = aVar;
            this.f49660b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49659a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49660b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f49661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f49661a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49661a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        super(R.layout.workout_repeat_type_selection);
        this.f49653a = new w1(s0.f105811a.b(r.class), new d(this), new f(this), new C0982e(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_of_round_button);
        viewFindViewById.getClass();
        this.f49654b = (GCMCheckableRow) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.repeat_until_time_is_button);
        viewFindViewById2.getClass();
        this.f49655c = (GCMCheckableRow) viewFindViewById2;
        u6();
        ((r) this.f49653a.getValue()).f129755b.f(getViewLifecycleOwner(), new c(new nw0.f(this, 4)));
        GCMCheckableRow gCMCheckableRow = this.f49654b;
        if (gCMCheckableRow == null) {
            p005kotlin.jvm.internal.s.m("iterationButton");
            throw null;
        }
        final int i14 = 0;
        gCMCheckableRow.setOnClickListener(new View.OnClickListener(this) { // from class: o62.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e f129773b;

            {
                this.f129773b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e eVar = this.f129773b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.f49652d;
                        r rVar = (r) eVar.f49653a.getValue();
                        s sVar = s.NumberOfTimes;
                        sVar.getClass();
                        rVar.x4().f48227l = sVar.f129768a;
                        rVar.f129754a.j(sVar);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.f49652d;
                        r rVar2 = (r) eVar.f49653a.getValue();
                        s sVar2 = s.RepeatUntil;
                        sVar2.getClass();
                        rVar2.x4().f48227l = sVar2.f129768a;
                        rVar2.f129754a.j(sVar2);
                        break;
                }
            }
        });
        GCMCheckableRow gCMCheckableRow2 = this.f49655c;
        if (gCMCheckableRow2 == null) {
            p005kotlin.jvm.internal.s.m("durationButton");
            throw null;
        }
        final int i15 = 1;
        gCMCheckableRow2.setOnClickListener(new View.OnClickListener(this) { // from class: o62.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e f129773b;

            {
                this.f129773b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e eVar = this.f129773b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.f49652d;
                        r rVar = (r) eVar.f49653a.getValue();
                        s sVar = s.NumberOfTimes;
                        sVar.getClass();
                        rVar.x4().f48227l = sVar.f129768a;
                        rVar.f129754a.j(sVar);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.f49652d;
                        r rVar2 = (r) eVar.f49653a.getValue();
                        s sVar2 = s.RepeatUntil;
                        sVar2.getClass();
                        rVar2.x4().f48227l = sVar2.f129768a;
                        rVar2.f129754a.j(sVar2);
                        break;
                }
            }
        });
    }

    public final void u6() {
        int i14 = b.f49656a[g8.i.K(((r) this.f49653a.getValue()).x4()).ordinal()];
        if (i14 == 1) {
            GCMCheckableRow gCMCheckableRow = this.f49654b;
            if (gCMCheckableRow == null) {
                p005kotlin.jvm.internal.s.m("iterationButton");
                throw null;
            }
            gCMCheckableRow.setChecked(true);
            GCMCheckableRow gCMCheckableRow2 = this.f49655c;
            if (gCMCheckableRow2 != null) {
                gCMCheckableRow2.setChecked(false);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("durationButton");
                throw null;
            }
        }
        if (i14 != 2) {
            u0.r();
            return;
        }
        GCMCheckableRow gCMCheckableRow3 = this.f49654b;
        if (gCMCheckableRow3 == null) {
            p005kotlin.jvm.internal.s.m("iterationButton");
            throw null;
        }
        gCMCheckableRow3.setChecked(false);
        GCMCheckableRow gCMCheckableRow4 = this.f49655c;
        if (gCMCheckableRow4 != null) {
            gCMCheckableRow4.setChecked(true);
        } else {
            p005kotlin.jvm.internal.s.m("durationButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/e$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
