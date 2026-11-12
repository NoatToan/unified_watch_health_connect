package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew1/s2;", "Lew1/u;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s2 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66742d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f66744c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66746b;

        static {
            int[] iArr = new int[tw1.k.values().length];
            try {
                iArr[tw1.k.BEGINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tw1.k.INTERMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66745a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fw.p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f66746b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/s2$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b.u onBackPressedDispatcher;
            a aVar = s2.f66742d;
            s2 s2Var = s2.this;
            if (s2Var.w6().f13385r1) {
                s2Var.w6().v7("FBTSelectTrainingLevelFragment");
            } else {
                s2Var.w6().U7(null);
                s2Var.w6().L1.setValue(null);
            }
            f(false);
            androidx.fragment.app.m activity = s2Var.getActivity();
            if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.d();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.fragments.FBTSelectTrainingLevelFragment$onViewCreated$2$1$1$1$1", f = "FBTSelectTrainingLevelFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s2.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = s2.f66742d;
            s2 s2Var = s2.this;
            if (s2Var.w6().M1.f150540a.getValue() == null) {
                aw1.h hVarW6 = s2Var.w6();
                ge1.b.T(androidx.lifecycle.v1.a(hVarW6), null, null, new aw1.v(hVarW6, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66749a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66749a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66750a = aVar;
            this.f66751b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66750a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66751b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f66752a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66752a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public s2() {
        super(R.layout.fbt_activity_view);
        this.f66743b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new e(this), new g(this), new f(null, this));
        this.f66744c = new c();
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(activity.getString(R.string.set_schedule));
            b.u onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66744c, viewLifecycleOwner);
        }
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-1874034588, true, new r2(this, 0)));
    }

    @Override // ew1.u
    public final boolean v6() {
        return false;
    }

    public final aw1.h w6() {
        return (aw1.h) this.f66743b.getValue();
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTSelectTrainingLevelFragment";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/s2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
