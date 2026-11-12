package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.k;
import androidx.lifecycle.LifecycleOwner;
import androidx.p004activity.OnBackPressedDispatcher;
import androidx.preference.PreferenceHeaderFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.miui.tsmclient.service.DKFRequestService;
import defpackage.mmi;
import defpackage.oti;
import defpackage.p7h;
import defpackage.q7h;
import defpackage.vpi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b0\u00101J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H&¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$f;", "Landroid/view/LayoutInflater;", "inflater", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "buildContentView", "(Landroid/view/LayoutInflater;)Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "Landroidx/preference/Preference;", "header", "", "openPreferenceHeader", "(Landroidx/preference/Preference;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "Landroidx/preference/PreferenceFragmentCompat;", "caller", "pref", "", "onPreferenceStartFragment", "(Landroidx/preference/PreferenceFragmentCompat;Landroidx/preference/Preference;)Z", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreatePreferenceHeader", "()Landroidx/preference/PreferenceFragmentCompat;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewStateRestored", "(Landroid/os/Bundle;)V", "onCreateInitialDetailFragment", "()Landroidx/fragment/app/Fragment;", "Lp7h;", "onBackPressedCallback", "Lp7h;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "<init>", "()V", "InnerOnBackPressedCallback", "preference_release"}, k = 1, mv = {1, 6, 0})
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.f {

    @Nullable
    private p7h onBackPressedCallback;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat$InnerOnBackPressedCallback;", "Lp7h;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$e;", "", "handleOnBackPressed", "()V", "Landroid/view/View;", "panel", "", "slideOffset", "onPanelSlide", "(Landroid/view/View;F)V", "onPanelOpened", "(Landroid/view/View;)V", "onPanelClosed", "Landroidx/preference/PreferenceHeaderFragmentCompat;", "caller", "Landroidx/preference/PreferenceHeaderFragmentCompat;", "<init>", "(Landroidx/preference/PreferenceHeaderFragmentCompat;)V", "preference_release"}, k = 1, mv = {1, 6, 0})
    public static final class InnerOnBackPressedCallback extends p7h implements SlidingPaneLayout.e {

        @NotNull
        private final PreferenceHeaderFragmentCompat caller;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(@NotNull PreferenceHeaderFragmentCompat caller) {
            super(true);
            Intrinsics.checkNotNullParameter(caller, "caller");
            this.caller = caller;
            caller.getSlidingPaneLayout().a(this);
        }

        @Override // defpackage.p7h
        public void handleOnBackPressed() {
            this.caller.getSlidingPaneLayout().b();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void onPanelClosed(@NotNull View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void onPanelOpened(@NotNull View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void onPanelSlide(@NotNull View panel, float slideOffset) {
            Intrinsics.checkNotNullParameter(panel, "panel");
        }
    }

    private final SlidingPaneLayout buildContentView(LayoutInflater inflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(vpi.d);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(vpi.c);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(mmi.f27006b), -1);
        layoutParams.f2996a = getResources().getInteger(oti.f29670b);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(vpi.f37112b);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(mmi.f27005a), -1);
        layoutParams2.f2996a = getResources().getInteger(oti.f29669a);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        return slidingPaneLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-10, reason: not valid java name */
    public static final void m44onViewCreated$lambda10(PreferenceHeaderFragmentCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p7h p7hVar = this$0.onBackPressedCallback;
        Intrinsics.checkNotNull(p7hVar);
        p7hVar.setEnabled(this$0.getChildFragmentManager().s0() == 0);
    }

    private final void openPreferenceHeader(Preference header) {
        if (header.getFragment() == null) {
            openPreferenceHeader(header.getIntent());
            return;
        }
        String fragment = header.getFragment();
        Fragment fragmentA = fragment == null ? null : getChildFragmentManager().x0().a(requireContext().getClassLoader(), fragment);
        if (fragmentA != null) {
            fragmentA.setArguments(header.getExtras());
        }
        if (getChildFragmentManager().s0() > 0) {
            FragmentManager.j jVarR0 = getChildFragmentManager().r0(0);
            Intrinsics.checkNotNullExpressionValue(jVarR0, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().h1(jVarR0.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        k kVarO = childFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
        kVarO.D(true);
        int i = vpi.f37112b;
        Intrinsics.checkNotNull(fragmentA);
        kVarO.w(i, fragmentA);
        if (getSlidingPaneLayout().m()) {
            kVarO.E(DKFRequestService.u0);
        }
        getSlidingPaneLayout().q();
        kVarO.l();
    }

    @NotNull
    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
        k kVarO = parentFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
        kVarO.C(this);
        kVarO.l();
    }

    @Nullable
    public Fragment onCreateInitialDetailFragment() {
        Fragment fragmentK0 = getChildFragmentManager().k0(vpi.c);
        if (fragmentK0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        }
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) fragmentK0;
        if (preferenceFragmentCompat.getPreferenceScreen().n() <= 0) {
            return null;
        }
        int iN = preferenceFragmentCompat.getPreferenceScreen().n();
        int i = 0;
        while (i < iN) {
            int i2 = i + 1;
            Preference preferenceM = preferenceFragmentCompat.getPreferenceScreen().m(i);
            Intrinsics.checkNotNullExpressionValue(preferenceM, "headerFragment.preferenc…reen.getPreference(index)");
            if (preferenceM.getFragment() != null) {
                String fragment = preferenceM.getFragment();
                if (fragment == null) {
                    return null;
                }
                return getChildFragmentManager().x0().a(requireContext().getClassLoader(), fragment);
            }
            i = i2;
        }
        return null;
    }

    @NotNull
    public abstract PreferenceFragmentCompat onCreatePreferenceHeader();

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayoutBuildContentView = buildContentView(inflater);
        if (getChildFragmentManager().k0(vpi.c) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatOnCreatePreferenceHeader = onCreatePreferenceHeader();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            k kVarO = childFragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
            kVarO.D(true);
            kVarO.b(vpi.c, preferenceFragmentCompatOnCreatePreferenceHeader);
            kVarO.l();
        }
        slidingPaneLayoutBuildContentView.setLockMode(3);
        return slidingPaneLayoutBuildContentView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat.f
    public boolean onPreferenceStartFragment(@NotNull PreferenceFragmentCompat caller, @NotNull Preference pref) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(pref, "pref");
        if (caller.getId() == vpi.c) {
            openPreferenceHeader(pref);
            return true;
        }
        if (caller.getId() != vpi.f37112b) {
            return false;
        }
        d dVarX0 = getChildFragmentManager().x0();
        ClassLoader classLoader = requireContext().getClassLoader();
        String fragment = pref.getFragment();
        Intrinsics.checkNotNull(fragment);
        Fragment fragmentA = dVarX0.a(classLoader, fragment);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "childFragmentManager.fra….fragment!!\n            )");
        fragmentA.setArguments(pref.getExtras());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        k kVarO = childFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
        kVarO.D(true);
        kVarO.w(vpi.f37112b, fragmentA);
        kVarO.E(DKFRequestService.u0);
        kVarO.j(null);
        kVarO.l();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.onBackPressedCallback = new InnerOnBackPressedCallback(this);
        SlidingPaneLayout slidingPaneLayout = getSlidingPaneLayout();
        if (!c.U(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    p7h p7hVar = this.this$0.onBackPressedCallback;
                    Intrinsics.checkNotNull(p7hVar);
                    p7hVar.setEnabled(this.this$0.getSlidingPaneLayout().n() && this.this$0.getSlidingPaneLayout().m());
                }
            });
        } else {
            p7h p7hVar = this.onBackPressedCallback;
            Intrinsics.checkNotNull(p7hVar);
            p7hVar.setEnabled(getSlidingPaneLayout().n() && getSlidingPaneLayout().m());
        }
        getChildFragmentManager().addOnBackStackChangedListener(new FragmentManager.n() { // from class: w6i
            @Override // androidx.fragment.app.FragmentManager.n
            public final void a() {
                PreferenceHeaderFragmentCompat.m44onViewCreated$lambda10(this.f37661a);
            }
        });
        Object objRequireContext = requireContext();
        q7h q7hVar = objRequireContext instanceof q7h ? (q7h) objRequireContext : null;
        if (q7hVar == null) {
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = q7hVar.getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        p7h p7hVar2 = this.onBackPressedCallback;
        Intrinsics.checkNotNull(p7hVar2);
        onBackPressedDispatcher.b(viewLifecycleOwner, p7hVar2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Fragment fragmentOnCreateInitialDetailFragment;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null || (fragmentOnCreateInitialDetailFragment = onCreateInitialDetailFragment()) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        k kVarO = childFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
        kVarO.D(true);
        kVarO.w(vpi.f37112b, fragmentOnCreateInitialDetailFragment);
        kVarO.l();
    }

    private final void openPreferenceHeader(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }
}
