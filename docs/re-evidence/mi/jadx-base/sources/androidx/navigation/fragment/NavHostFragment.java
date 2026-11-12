package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.i;
import defpackage.iig;
import defpackage.jig;
import defpackage.mig;
import defpackage.o3j;
import defpackage.upi;
import defpackage.x5j;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends Fragment implements iig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jig f2687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f2688b = null;
    public View c;
    public int d;
    public boolean e;

    public static NavController t(Fragment fragment) {
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).p();
            }
            Fragment fragmentD0 = parentFragment.getParentFragmentManager().D0();
            if (fragmentD0 instanceof NavHostFragment) {
                return ((NavHostFragment) fragmentD0).p();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return mig.b(view);
        }
        Dialog dialog = fragment instanceof DialogFragment ? ((DialogFragment) fragment).getDialog() : null;
        if (dialog != null && dialog.getWindow() != null) {
            return mig.b(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.e) {
            getParentFragmentManager().o().C(this).l();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        ((DialogFragmentNavigator) this.f2687a.l().d(DialogFragmentNavigator.class)).h(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        jig jigVar = new jig(requireContext());
        this.f2687a = jigVar;
        jigVar.G(this);
        this.f2687a.H(requireActivity().getOnBackPressedDispatcher());
        jig jigVar2 = this.f2687a;
        Boolean bool = this.f2688b;
        jigVar2.b(bool != null && bool.booleanValue());
        this.f2688b = null;
        this.f2687a.I(getViewModelStore());
        v(this.f2687a);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.e = true;
                getParentFragmentManager().o().C(this).l();
            }
            this.d = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f2687a.A(bundle2);
        }
        int i = this.d;
        if (i != 0) {
            this.f2687a.C(i);
        } else {
            Bundle arguments = getArguments();
            int i2 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i2 != 0) {
                this.f2687a.D(i2, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(u());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.c;
        if (view != null && mig.b(view) == this.f2687a) {
            mig.e(this.c, null);
        }
        this.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x5j.p);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x5j.q, 0);
        if (resourceId != 0) {
            this.d = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, o3j.f28701r);
        if (typedArrayObtainStyledAttributes2.getBoolean(o3j.s, false)) {
            this.e = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrimaryNavigationFragmentChanged(boolean z) {
        jig jigVar = this.f2687a;
        if (jigVar != null) {
            jigVar.b(z);
        } else {
            this.f2688b = Boolean.valueOf(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundleB = this.f2687a.B();
        if (bundleB != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundleB);
        }
        if (this.e) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.d;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        mig.e(view, this.f2687a);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.c = view2;
            if (view2.getId() == getId()) {
                mig.e(this.c, this.f2687a);
            }
        }
    }

    @Override // defpackage.iig
    public final NavController p() {
        jig jigVar = this.f2687a;
        if (jigVar != null) {
            return jigVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    @Deprecated
    public i<? extends a.C0048a> s() {
        return new a(requireContext(), getChildFragmentManager(), u());
    }

    public final int u() {
        int id = getId();
        return (id == 0 || id == -1) ? upi.f35998a : id;
    }

    public void v(NavController navController) {
        navController.l().a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.l().a(s());
    }
}
