package nf0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.BirthDateFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import mt0.h0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnf0/z;", "Lnf0/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class z extends nf0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f125870h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f125871b = new w1(s0.f105811a.b(o.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatButton f125872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScrollView f125873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s2 f125874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FrameLayout f125875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f125876g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f125877a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f125877a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f125877a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f125878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f125879b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f125878a = aVar;
            this.f125879b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f125878a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f125879b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f125880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f125880a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f125880a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public boolean A6() {
        return !(this instanceof BirthDateFragment);
    }

    public abstract void C6(LayoutInflater layoutInflater, LinearLayout linearLayout);

    public abstract void E6();

    public final void F6() {
        s2 s2Var = this.f125874e;
        if (s2Var == null) {
            p005kotlin.jvm.internal.s.m("overlayListener");
            throw null;
        }
        s2Var.showProgressOverlay();
        MenuItem menuItem = this.f125765a;
        if (menuItem != null) {
            menuItem.setEnabled(false);
        }
    }

    public final void hideProgressOverlay() {
        s2 s2Var = this.f125874e;
        if (s2Var == null) {
            p005kotlin.jvm.internal.s.m("overlayListener");
            throw null;
        }
        s2Var.hideProgressOverlay();
        MenuItem menuItem = this.f125765a;
        if (menuItem != null) {
            menuItem.setEnabled(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f125874e = (s2) context;
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.setup_intro_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.onboarding_setup_main_container);
        View viewFindViewById = viewInflate.findViewById(R.id.onboarding_setup_main_btn);
        viewFindViewById.getClass();
        this.f125872c = (AppCompatButton) viewFindViewById;
        w6().setOnClickListener(new h0(this, 11));
        View viewFindViewById2 = viewInflate.findViewById(R.id.setup_overlay_container);
        viewFindViewById2.getClass();
        this.f125875f = (FrameLayout) viewFindViewById2;
        linearLayout.getClass();
        C6(layoutInflater, linearLayout);
        View viewFindViewById3 = viewInflate.findViewById(R.id.onboarding_setup_main_scroll_container);
        viewFindViewById3.getClass();
        this.f125873d = (ScrollView) viewFindViewById3;
        if (A6() && !this.f125876g) {
            y6().post(new l0.e(17, this, linearLayout));
            y6().setOnScrollChangeListener(new k32.m(this, 1));
        }
        this.f125876g = true;
        return viewInflate;
    }

    @Override // nf0.a
    public final void u6() {
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SetupFragment", "[exitSetup] exit onboarding -> cancel");
        z6().K4();
    }

    public final AppCompatButton w6() {
        AppCompatButton appCompatButton = this.f125872c;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        p005kotlin.jvm.internal.s.m("button");
        throw null;
    }

    public final ScrollView y6() {
        ScrollView scrollView = this.f125873d;
        if (scrollView != null) {
            return scrollView;
        }
        p005kotlin.jvm.internal.s.m("scrollView");
        throw null;
    }

    public final o z6() {
        return (o) this.f125871b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnf0/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
