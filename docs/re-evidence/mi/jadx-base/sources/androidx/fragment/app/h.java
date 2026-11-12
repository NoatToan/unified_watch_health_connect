package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import defpackage.qsi;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f2417b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2418a;

        public a(View view) {
            this.f2418a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2418a.removeOnAttachStateChangeListener(this);
            androidx.core.view.c.n0(this.f2418a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2420a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f2420a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2420a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2420a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2420a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(f fVar, j jVar, Fragment fragment) {
        this.f2416a = fVar;
        this.f2417b = jVar;
        this.c = fragment;
    }

    public void a() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        f fVar = this.f2416a;
        Fragment fragment2 = this.c;
        fVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int iJ = this.f2417b.j(this.c);
        Fragment fragment = this.c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    public void c() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        h hVarN = null;
        if (fragment2 != null) {
            h hVarN2 = this.f2417b.n(fragment2.mWho);
            if (hVarN2 == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            hVarN = hVarN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (hVarN = this.f2417b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (hVarN != null) {
            hVarN.m();
        }
        Fragment fragment4 = this.c;
        fragment4.mHost = fragment4.mFragmentManager.z0();
        Fragment fragment5 = this.c;
        fragment5.mParentFragment = fragment5.mFragmentManager.C0();
        this.f2416a.g(this.c, false);
        this.c.performAttach();
        this.f2416a.b(this.c, false);
    }

    public int d() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.e;
        int i = b.f2420a[fragment.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.mContainer;
        l.e.b bVarL = viewGroup != null ? l.o(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (bVarL == l.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == l.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(iMin);
            sb.append(" for ");
            sb.append(this.c);
        }
        return iMin;
    }

    public void e() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.c.mState = 1;
            return;
        }
        this.f2416a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        f fVar = this.f2416a;
        Fragment fragment3 = this.c;
        fVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() {
        String resourceName;
        if (this.c.mFromLayout) {
            return;
        }
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i = fragment2.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.u0().c(this.c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.mContainerId) + " (" + resourceName + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.onWrongFragmentContainer(this.c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.mView.setTag(qsi.f31805a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (androidx.core.view.c.T(this.c.mView)) {
                androidx.core.view.c.n0(this.c.mView);
            } else {
                View view2 = this.c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.c.performViewCreated();
            f fVar = this.f2416a;
            Fragment fragment7 = this.c;
            fVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.c.mView.getVisibility();
            this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
            Fragment fragment8 = this.c;
            if (fragment8.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment8.mView.findFocus();
                if (viewFindFocus != null) {
                    this.c.setFocusedView(viewFindFocus);
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("requestFocus: Saved focused view ");
                        sb2.append(viewFindFocus);
                        sb2.append(" for Fragment ");
                        sb2.append(this.c);
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }

    public void g() {
        Fragment fragmentF;
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (z) {
            Fragment fragment2 = this.c;
            if (!fragment2.mBeingSaved) {
                this.f2417b.B(fragment2.mWho, null);
            }
        }
        if (!z && !this.f2417b.p().m(this.c)) {
            String str = this.c.mTargetWho;
            if (str != null && (fragmentF = this.f2417b.f(str)) != null && fragmentF.mRetainInstance) {
                this.c.mTarget = fragmentF;
            }
            this.c.mState = 0;
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.c.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.f2417b.p().j();
        } else if (fragmentHostCallback.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) fragmentHostCallback.f()).isChangingConfigurations();
        }
        if ((z && !this.c.mBeingSaved) || zIsChangingConfigurations) {
            this.f2417b.p().b(this.c);
        }
        this.c.performDestroy();
        this.f2416a.d(this.c, false);
        for (h hVar : this.f2417b.k()) {
            if (hVar != null) {
                Fragment fragmentK = hVar.k();
                if (this.c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f2417b.f(str2);
        }
        this.f2417b.s(this);
    }

    public void h() {
        View view;
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.f2416a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.c);
        }
        this.c.performDetach();
        this.f2416a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f2417b.p().m(this.c)) {
            return;
        }
        if (FragmentManager.M0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("initState called for fragment: ");
            sb2.append(this.c);
        }
        this.c.initState();
    }

    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.M0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(qsi.f31805a, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                f fVar = this.f2416a;
                Fragment fragment5 = this.c;
                fVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.c;
                int i = fragment.mState;
                if (iD == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.c.mBeingSaved) {
                        if (FragmentManager.M0(3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cleaning up state of never attached fragment: ");
                            sb2.append(this.c);
                        }
                        this.f2417b.p().b(this.c);
                        this.f2417b.s(this);
                        if (FragmentManager.M0(3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("initState called for fragment: ");
                            sb3.append(this.c);
                        }
                        this.c.initState();
                    }
                    Fragment fragment2 = this.c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            l lVarO = l.o(viewGroup, fragment2.getParentFragmentManager());
                            if (this.c.mHidden) {
                                lVarO.c(this);
                            } else {
                                lVarO.e(this);
                            }
                        }
                        Fragment fragment3 = this.c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.K0(fragment3);
                        }
                        Fragment fragment4 = this.c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.c.mChildFragmentManager.K();
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f2417b.q(fragment.mWho) == null) {
                                s();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.M0(3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("movefrom ACTIVITY_CREATED: ");
                                sb4.append(this.c);
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.mBeingSaved) {
                                s();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment6 = this.c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                l.o(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.c.mState = 3;
                            break;
                        case 4:
                            w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                l.o(viewGroup3, fragment.getParentFragmentManager()).b(l.e.c.b(this.c.mView.getVisibility()), this);
                            }
                            this.c.mState = 4;
                            break;
                        case 5:
                            v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.d = false;
        }
    }

    public void n() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.c);
        }
        this.c.performPause();
        this.f2416a.f(this.c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.c);
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.M0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.c.mView.findFocus());
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.f2416a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.c.performSaveInstanceState(bundle);
        this.f2416a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.mView != null) {
            t();
        }
        if (this.c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.mSavedViewState);
        }
        if (this.c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
        }
        if (!this.c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
        }
        return bundle;
    }

    public Fragment.SavedState r() {
        Bundle bundleQ;
        if (this.c.mState <= -1 || (bundleQ = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleQ);
    }

    public void s() {
        FragmentState fragmentState = new FragmentState(this.c);
        Fragment fragment = this.c;
        if (fragment.mState <= -1 || fragmentState.m != null) {
            fragmentState.m = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            fragmentState.m = bundleQ;
            if (this.c.mTargetWho != null) {
                if (bundleQ == null) {
                    fragmentState.m = new Bundle();
                }
                fragmentState.m.putString("android:target_state", this.c.mTargetWho);
                int i = this.c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.m.putInt("android:target_req_state", i);
                }
            }
        }
        this.f2417b.B(this.c.mWho, fragmentState);
    }

    public void t() {
        if (this.c.mView == null) {
            return;
        }
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.c);
            sb.append(" with view ");
            sb.append(this.c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.mSavedViewRegistryState = bundle;
    }

    public void u(int i) {
        this.e = i;
    }

    public void v() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.c);
        }
        this.c.performStart();
        this.f2416a.k(this.c, false);
    }

    public void w() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.c);
        }
        this.c.performStop();
        this.f2416a.l(this.c, false);
    }

    public h(f fVar, j jVar, ClassLoader classLoader, d dVar, FragmentState fragmentState) {
        this.f2416a = fVar;
        this.f2417b = jVar;
        Fragment fragmentA = fragmentState.a(dVar, classLoader);
        this.c = fragmentA;
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(fragmentA);
        }
    }

    public h(f fVar, j jVar, Fragment fragment, FragmentState fragmentState) {
        this.f2416a = fVar;
        this.f2417b = jVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
