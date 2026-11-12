package ew1;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import kotlin.w3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew1/s1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66734c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f66736b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/s1$b", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f(false);
            a aVar = s1.f66734c;
            s1 s1Var = s1.this;
            aw1.h hVarU6 = s1Var.u6();
            jv1.s sVarI6 = hVarU6.i6();
            hVarU6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147422207, 511) : null);
            androidx.fragment.app.m activity = s1Var.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f66738a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66738a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66739a = aVar;
            this.f66740b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66739a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66740b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66741a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66741a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66741a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public s1() {
        super(R.layout.fbt_activity_view);
        this.f66735a = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new c(this), new e(this), new d(null, this));
        this.f66736b = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        b.u onBackPressedDispatcher;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.set_schedule));
        }
        androidx.fragment.app.m activity2 = getActivity();
        if (activity2 != null && (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) != null) {
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66736b, viewLifecycleOwner);
        }
        g22.e.f(this);
        View viewFindViewById = view2.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(1682473782, true, new dh1.a(this, 18)));
    }

    public final aw1.h u6() {
        return (aw1.h) this.f66735a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/s1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
