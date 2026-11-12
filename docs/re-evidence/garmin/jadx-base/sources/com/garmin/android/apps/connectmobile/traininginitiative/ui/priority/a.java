package com.garmin.android.apps.connectmobile.traininginitiative.ui.priority;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import fg0.k;
import fw.p;
import iz1.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import ww1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/priority/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0894a f46181e = new C0894a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.b f46184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f46185d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46186a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46186a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/priority/a$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a.this;
            aVar.f46185d.f(false);
            aVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46188a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46188a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46189a = aVar;
            this.f46190b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46189a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46190b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46191a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46191a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.composable_container);
        this.f46182a = new w1(s0.f105811a.b(i.class), new d(this), new f(this), new e(null, this));
        this.f46184c = new a4.b(this, 29);
        this.f46185d = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        o13.p<k, g> pVar;
        g gVar;
        String trainingPlanName;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46185d, viewLifecycleOwner);
        m activity = getActivity();
        String strA = null;
        TrainingPrioritySelectionActivity trainingPrioritySelectionActivity = activity instanceof TrainingPrioritySelectionActivity ? (TrainingPrioritySelectionActivity) activity : null;
        if (trainingPrioritySelectionActivity != null) {
            String string = getString(R.string.itp_find_a_plan);
            string.getClass();
            trainingPrioritySelectionActivity.updateActionBar(string, 2);
        }
        g3<o13.p<k, g>> g3VarD = u6().Z4().d();
        if (g3VarD != null && (pVar = g3VarD.f35301b) != null && (gVar = pVar.f128595b) != null) {
            ww1.i iVar = gVar.f187765c;
            if (iVar == null || (trainingPlanName = iVar.getTrainingPlanName()) == null) {
                xw1.d dVar = gVar.f187766d;
                if (dVar != null) {
                    vt1.a.C3360a c3360a = vt1.a.f180073b;
                    int workoutPlanId = (int) dVar.getWorkoutPlanId();
                    c3360a.getClass();
                    strA = vt1.a.C3360a.a(workoutPlanId);
                }
            } else {
                strA = trainingPlanName;
            }
        }
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(-985515769, true, new iz1.b(strA, this, 0)));
        u6().M4().f(getViewLifecycleOwner(), this.f46184c);
    }

    public final i u6() {
        return (i) this.f46182a.getValue();
    }

    public final void v6() {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_sharable_event_dto", u6().I);
        intent.putExtra("extra_show_event_added_snack_bar", u6().Z);
        m activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/priority/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0894a {
        public /* synthetic */ C0894a(j jVar) {
            this();
        }

        private C0894a() {
        }
    }
}
