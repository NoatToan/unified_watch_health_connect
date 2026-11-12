package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import lc.m0;
import lc.t0;
import lc.y;
import lc.z0;
import n23.j;
import o13.m;
import o13.t;
import ov1.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pc.e;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10124e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f10125a = m.b(new u(this, 13));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f10126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10128d;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.f10128d) {
            v parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.w(this);
            aVar.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        u6();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f10128d = true;
            v parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.w(this);
            aVar.e();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id3 = getId();
        if (id3 == 0 || id3 == -1) {
            id3 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id3);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view2 = this.f10126b;
        if (view2 != null && t0.a(view2) == u6()) {
            view2.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f10126b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z0.f111919b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f10127c = resourceId;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.f137176c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f10128d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.f10128d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (!(view2 instanceof ViewGroup)) {
            j.t("created host view ", view2, " is not a ViewGroup");
            return;
        }
        m0 m0VarU6 = u6();
        t0 t0Var = t0.f111876a;
        view2.setTag(R.id.nav_controller_view_tag, m0VarU6);
        ViewGroup viewGroup = (ViewGroup) view2;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view3 = (View) parent;
            this.f10126b = view3;
            if (view3.getId() == getId()) {
                View view4 = this.f10126b;
                view4.getClass();
                view4.setTag(R.id.nav_controller_view_tag, u6());
            }
        }
    }

    public final m0 u6() {
        return (m0) this.f10125a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$a;", "", "<init>", "()V", "", "KEY_GRAPH_ID", "Ljava/lang/String;", "KEY_START_DESTINATION_ARGS", "KEY_NAV_CONTROLLER_STATE", "KEY_DEFAULT_NAV_HOST", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static y a(Fragment fragment) {
            Dialog dialog;
            Window window;
            fragment.getClass();
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).u6();
                }
                Fragment fragment2 = parentFragment.getParentFragmentManager().A;
                if (fragment2 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragment2).u6();
                }
            }
            View view2 = fragment.getView();
            if (view2 != null) {
                return t0.a(view2);
            }
            View decorView = null;
            i iVar = fragment instanceof i ? (i) fragment : null;
            if (iVar != null && (dialog = iVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return t0.a(decorView);
            }
            h.z(androidx.core.view.j.j("Fragment ", fragment, " does not have a NavController set"));
            return null;
        }

        private a() {
        }
    }
}
