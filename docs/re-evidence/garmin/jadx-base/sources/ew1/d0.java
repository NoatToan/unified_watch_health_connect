package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import kotlin.w3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lew1/d0;", "Lew1/u;", "<init>", "()V", "a", "", "hasGCPlusSubscription", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66371e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f66374d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66375a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66375a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/d0$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            jv1.e eVarY5;
            a aVar = d0.f66371e;
            d0 d0Var = d0.this;
            if (d0Var.w6().I0) {
                aw1.h hVarW6 = d0Var.w6();
                hVarW6.I0 = false;
                hVarW6.F5().m(null);
            } else {
                d0Var.w6().l5();
                d0Var.w6().q6().m(null);
            }
            d0Var.f66374d.f(false);
            if (!d0Var.w6().e7() || d0Var.w6().Z6()) {
                if (d0Var.f66373c) {
                    d0Var.getParentFragmentManager().a0(0, "FBTGoalTypeSelectionFragment");
                    return;
                } else {
                    d0Var.requireActivity().getOnBackPressedDispatcher().d();
                    return;
                }
            }
            d0Var.getParentFragmentManager().Z();
            if (d0Var.getParentFragmentManager().G("FBTCoachRecommendationFragCompose") == null) {
                aw1.h hVarW7 = d0Var.w6();
                androidx.fragment.app.m mVarRequireActivity = d0Var.requireActivity();
                mVarRequireActivity.getClass();
                jv1.s sVarI6 = hVarW7.i6();
                fg0.k kVar = sVarI6 != null ? sVarI6.f101124c : null;
                fg0.k kVarA = kVar != null ? eg0.c.a(kVar, hVarW7.d6()) : hVarW7.n5();
                fg0.j jVarD6 = hVarW7.d6();
                List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH = jVarD6 != null ? jVarD6.h() : null;
                if (listH != null && !listH.isEmpty()) {
                    ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).d(mVarRequireActivity, kVarA, hVarW7.c6(), hVarW7.Y5());
                    return;
                }
                fg0.j jVarD7 = hVarW7.d6();
                if (jVarD7 == null || !jVarD7.y()) {
                    ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).i(mVarRequireActivity, kVarA, true, hVarW7.c6(), Integer.valueOf(hVarW7.Y5()), hVarW7.f13385r1, (!hVarW7.J6() || (eVarY5 = hVarW7.y5()) == null || eVarY5.f101039h) ? false : true, hVarW7.h5(mVarRequireActivity, kVarA));
                } else {
                    ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).g(mVarRequireActivity, kVarA, true, hVarW7.c6(), Integer.valueOf(hVarW7.Y5()), hVarW7.f13385r1);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.fragments.FBTCoachSelectionComposeFragment$onViewCreated$3$1$1$1$1", f = "FBTCoachSelectionComposeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d0.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = d0.f66371e;
            d0 d0Var = d0.this;
            if (d0Var.w6().A5().d() == null) {
                aw1.h hVarW6 = d0Var.w6();
                Context contextRequireContext = d0Var.requireContext();
                contextRequireContext.getClass();
                hVarW6.z5(vw1.c.d(contextRequireContext));
            }
            aw1.h hVarW7 = d0Var.w6();
            ge1.b.T(androidx.lifecycle.v1.a(hVarW7), null, null, new aw1.n(hVarW7, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66378a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66378a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66379a = aVar;
            this.f66380b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66379a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66380b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f66381a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66381a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d0() {
        super(R.layout.fbt_activity_view);
        this.f66372b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new e(this), new g(this), new f(null, this));
        this.f66374d = new c();
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).h();
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(activity.getString(R.string.select_a_plan));
            b.u onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66374d, viewLifecycleOwner);
        }
        ((androidx.lifecycle.s0) w6().K1.getValue()).f(getViewLifecycleOwner(), new i0.b(new z(this, 0)));
        vt1.o oVar = w6().f13391x1;
        vt1.o oVar2 = vt1.o.f180181l;
        if (oVar == oVar2) {
            w6().S7(oVar2, null);
        }
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-198382784, true, new b0(this, 0)));
    }

    @Override // ew1.u
    public final boolean v6() {
        return false;
    }

    public final aw1.h w6() {
        return (aw1.h) this.f66372b.getValue();
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTCoachSelectionComposeFragment";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
