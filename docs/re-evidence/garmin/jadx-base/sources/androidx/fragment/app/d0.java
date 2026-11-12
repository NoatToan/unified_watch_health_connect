package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.g1;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f7164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f7165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f7166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7167d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7168e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7169a;

        public a(d0 d0Var, View view2) {
            this.f7169a = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            View view3 = this.f7169a;
            view3.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
            view3.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7170a;

        static {
            int[] iArr = new int[androidx.lifecycle.b0.b.values().length];
            f7170a = iArr;
            try {
                iArr[androidx.lifecycle.b0.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7170a[androidx.lifecycle.b0.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7170a[androidx.lifecycle.b0.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7170a[androidx.lifecycle.b0.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public d0(t tVar, f0 f0Var, ClassLoader classLoader, q qVar, Bundle bundle) {
        this.f7164a = tVar;
        this.f7165b = f0Var;
        Fragment fragmentB = ((c0) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).b(qVar, classLoader);
        this.f7166c = fragmentB;
        fragmentB.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentB.setArguments(bundle2);
        if (v.R(2)) {
            Objects.toString(fragmentB);
        }
    }

    public final void a() {
        View view2;
        View view3;
        Fragment fragment = this.f7166c;
        Fragment fragmentI = v.I(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentI != null && !fragmentI.equals(parentFragment)) {
            int i14 = fragment.mContainerId;
            f8.a aVar = f8.a.f69927a;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, fragmentI, i14);
            f8.a.f69927a.getClass();
            f8.a.c(wrongNestedHierarchyViolation);
            f8.a.c cVarA = f8.a.a(fragment);
            if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_WRONG_NESTED_HIERARCHY) && f8.a.e(cVarA, fragment.getClass(), WrongNestedHierarchyViolation.class)) {
                f8.a.b(cVarA, wrongNestedHierarchyViolation);
            }
        }
        ArrayList<Fragment> arrayList = this.f7165b.f7226a;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i15 = iIndexOf - 1; i15 >= 0; i15--) {
                Fragment fragment2 = arrayList.get(i15);
                if (fragment2.mContainer == viewGroup && (view3 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view3) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = arrayList.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zR = v.R(3);
        Fragment fragment = this.f7166c;
        if (zR) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        d0 d0Var = null;
        f0 f0Var = this.f7165b;
        if (fragment2 != null) {
            d0 d0Var2 = f0Var.f7227b.get(fragment2.mWho);
            if (d0Var2 == null) {
                StringBuilder sb3 = new StringBuilder("Fragment ");
                sb3.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb3.append(" declared target fragment ");
                sb3.append(fragment3);
                sb3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb3.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            d0Var = d0Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (d0Var = f0Var.f7227b.get(str)) == null) {
                StringBuilder sb4 = new StringBuilder("Fragment ");
                sb4.append(fragment);
                sb4.append(" declared target fragment ");
                vb.h.z(am.j.o(fragment.mTargetWho, " that does not belong to this FragmentManager!", sb4));
                return;
            }
        }
        if (d0Var != null) {
            d0Var.i();
        }
        v vVar = fragment.mFragmentManager;
        fragment.mHost = vVar.f7393x;
        fragment.mParentFragment = vVar.f7395z;
        t tVar = this.f7164a;
        tVar.g(fragment, false);
        fragment.performAttach();
        tVar.b(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.f7166c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f7168e;
        int i14 = b.f7170a[fragment.mMaxState.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i14 != 3) {
                iMin = i14 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (fragment.mFromLayout) {
            boolean z14 = fragment.mInLayout;
            int i15 = this.f7168e;
            if (z14) {
                iMin = Math.max(i15, 2);
                View view2 = fragment.mView;
                if (view2 != null && view2.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i15 < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        q0.d.a aVar = null;
        if (viewGroup != null) {
            q0 q0VarI = q0.i(viewGroup, fragment.getParentFragmentManager());
            fragment.getClass();
            q0.d dVarF = q0VarI.f(fragment);
            q0.d.a aVar2 = dVarF != null ? dVarF.f7334b : null;
            q0.d dVarG = q0VarI.g(fragment);
            aVar = dVarG != null ? dVarG.f7334b : null;
            int i16 = aVar2 == null ? -1 : q0.e.f7356a[aVar2.ordinal()];
            if (i16 != -1 && i16 != 1) {
                aVar = aVar2;
            }
        }
        if (aVar == q0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVar == q0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (v.R(2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() {
        String resourceName;
        Fragment fragment = this.f7166c;
        if (fragment.mFromLayout) {
            return;
        }
        if (v.R(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i14 = fragment.mContainerId;
            if (i14 != 0) {
                if (i14 == -1) {
                    vb.h.s(androidx.core.view.j.j("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f7394y.b(i14);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = PrivacyUpdateRequestError.UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    f8.a aVar = f8.a.f69927a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
                    f8.a.f69927a.getClass();
                    f8.a.c(wrongFragmentContainerViolation);
                    f8.a.c cVarA = f8.a.a(fragment);
                    if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_WRONG_FRAGMENT_CONTAINER) && f8.a.e(cVarA, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        f8.a.b(cVarA, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (v.R(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            boolean zIsAttachedToWindow = fragment.mView.isAttachedToWindow();
            View view2 = fragment.mView;
            if (zIsAttachedToWindow) {
                WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
                view2.requestApplyInsets();
            } else {
                view2.addOnAttachStateChangeListener(new a(this, view2));
            }
            fragment.performViewCreated();
            this.f7164a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (v.R(2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zR = v.R(3);
        Fragment fragment = this.f7166c;
        if (zR) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z14 = fragment.mRemoving && !fragment.isInBackStack();
        f0 f0Var = this.f7165b;
        if (z14 && !fragment.mBeingSaved) {
            f0Var.i(null, fragment.mWho);
        }
        if (!z14) {
            y yVar = f0Var.f7229d;
            if (!((yVar.f7431a.containsKey(fragment.mWho) && yVar.f7434d) ? yVar.f7435e : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = f0Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        r<?> rVar = fragment.mHost;
        if (rVar instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = f0Var.f7229d.f7435e;
        } else {
            Context context = rVar.f7358b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z14 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            y yVar2 = f0Var.f7229d;
            yVar2.getClass();
            if (v.R(3)) {
                Objects.toString(fragment);
            }
            yVar2.y4(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.f7164a.d(fragment, false);
        for (d0 d0Var : f0Var.d()) {
            if (d0Var != null) {
                Fragment fragment2 = d0Var.f7166c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = f0Var.b(str2);
        }
        f0Var.h(this);
    }

    public final void f() {
        View view2;
        boolean zR = v.R(3);
        Fragment fragment = this.f7166c;
        if (zR) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view2 = fragment.mView) != null) {
            viewGroup.removeView(view2);
        }
        fragment.performDestroyView();
        this.f7164a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.m(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zR = v.R(3);
        Fragment fragment = this.f7166c;
        if (zR) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.f7164a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            y yVar = this.f7165b.f7229d;
            if (!((yVar.f7431a.containsKey(fragment.mWho) && yVar.f7434d) ? yVar.f7435e : true)) {
                return;
            }
        }
        if (v.R(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.f7166c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (v.R(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view2 = fragment.mView;
            if (view2 != null) {
                view2.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f7164a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z14 = this.f7167d;
        Fragment fragment = this.f7166c;
        if (z14) {
            if (v.R(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f7167d = true;
            boolean z15 = false;
            while (true) {
                int iC = c();
                int i14 = fragment.mState;
                f0 f0Var = this.f7165b;
                if (iC == i14) {
                    if (!z15 && i14 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (v.R(3)) {
                            Objects.toString(fragment);
                        }
                        y yVar = f0Var.f7229d;
                        yVar.getClass();
                        if (v.R(3)) {
                            Objects.toString(fragment);
                        }
                        yVar.y4(fragment.mWho, true);
                        f0Var.h(this);
                        if (v.R(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            q0 q0VarI = q0.i(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (v.R(2)) {
                                    Objects.toString(fragment);
                                }
                                q0VarI.d(q0.d.b.GONE, q0.d.a.NONE, this);
                            } else {
                                if (v.R(2)) {
                                    Objects.toString(fragment);
                                }
                                q0VarI.d(q0.d.b.VISIBLE, q0.d.a.NONE, this);
                            }
                        }
                        v vVar = fragment.mFragmentManager;
                        if (vVar != null && fragment.mAdded && v.S(fragment)) {
                            vVar.I = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.p();
                    }
                    return;
                }
                t tVar = this.f7164a;
                if (iC > i14) {
                    switch (i14 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (v.R(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle2 = fragment.mSavedFragmentState;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                tVar.h(fragment, bundle, false);
                                fragment.performCreate(bundle);
                                tVar.c(fragment, bundle, false);
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                            }
                            break;
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (v.R(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment.performActivityCreated(bundle);
                            tVar.a(fragment, bundle, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                q0 q0VarI2 = q0.i(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                q0.d.b.f7348a.getClass();
                                q0.d.b bVarB = q0.d.b.a.b(visibility);
                                bVarB.getClass();
                                if (v.R(2)) {
                                    Objects.toString(fragment);
                                }
                                q0VarI2.d(bVarB, q0.d.a.ADDING, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (v.R(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            tVar.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                } else {
                    switch (i14 - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (f0Var.f7228c.get(fragment.mWho) == null) {
                                    f0Var.i(l(), fragment.mWho);
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (v.R(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                f0Var.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                q0 q0VarI3 = q0.i(viewGroup2, fragment.getParentFragmentManager());
                                if (v.R(2)) {
                                    Objects.toString(fragment);
                                }
                                q0VarI3.d(q0.d.b.REMOVED, q0.d.a.REMOVING, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (v.R(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            tVar.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (v.R(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            tVar.f(fragment, false);
                            break;
                    }
                }
                z15 = true;
            }
        } finally {
            this.f7167d = false;
        }
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.f7166c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            c0 c0Var = (c0) fragment.mSavedFragmentState.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
            if (c0Var != null) {
                fragment.mTargetWho = c0Var.f7158m;
                fragment.mTargetRequestCode = c0Var.f7159n;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = c0Var.f7160o;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e4) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final void k() {
        boolean zR = v.R(3);
        Fragment fragment = this.f7166c;
        if (zR) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                focusedView.requestFocus();
                if (v.R(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (v.R(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f7164a.i(fragment, false);
        this.f7165b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f7166c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, new c0(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f7164a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleI0 = fragment.mChildFragmentManager.i0();
            if (!bundleI0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleI0);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.f7166c;
        if (fragment.mView == null) {
            return;
        }
        if (v.R(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f7299f.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public d0(t tVar, f0 f0Var, Fragment fragment) {
        this.f7164a = tVar;
        this.f7165b = f0Var;
        this.f7166c = fragment;
    }

    public d0(t tVar, f0 f0Var, Fragment fragment, Bundle bundle) {
        this.f7164a = tVar;
        this.f7165b = f0Var;
        this.f7166c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
