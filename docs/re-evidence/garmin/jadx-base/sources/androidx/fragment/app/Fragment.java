package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.p1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p1.l1;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.n0, ViewModelStoreOwner, androidx.lifecycle.y, nd.e {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    v mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    x1.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    v mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    r<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.o0 mLifecycleRegistry;
    androidx.lifecycle.b0.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    nd.d mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    m0 mViewLifecycleOwner;
    y0<androidx.lifecycle.n0> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends f.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f7085a;

        public a(Fragment fragment, AtomicReference atomicReference, g.a aVar) {
            this.f7085a = atomicReference;
        }

        @Override // f.c
        public final void a(I i14, z6.b bVar) {
            f.c cVar = (f.c) this.f7085a.get();
            if (cVar != null) {
                cVar.a(i14, bVar);
            } else {
                vb.h.z("Operation cannot be started before fragment is in created state");
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class c extends l {
        public c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.f125386a.a();
            m1.b(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f7089a;

        public e(Fragment fragment, q0 q0Var) {
            this.f7089a = q0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q0 q0Var = this.f7089a;
            if (q0Var.f7325b.isEmpty()) {
                return;
            }
            q0Var.e();
        }
    }

    public class f extends o {
        public f() {
        }

        @Override // androidx.fragment.app.o
        public final View b(int i14) {
            Fragment fragment = Fragment.this;
            View view2 = fragment.mView;
            if (view2 != null) {
                return view2.findViewById(i14);
            }
            kg.f.o("Fragment ", fragment, " does not have a view");
            return null;
        }

        @Override // androidx.fragment.app.o
        public final boolean c() {
            return Fragment.this.mView != null;
        }
    }

    public class g implements androidx.lifecycle.k0 {
        public g() {
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.a aVar) {
            View view2;
            if (aVar != androidx.lifecycle.b0.a.ON_STOP || (view2 = Fragment.this.mView) == null) {
                return;
            }
            view2.cancelPendingInputEvents();
        }
    }

    public class h implements p.a<Void, f.e> {
        public h() {
        }

        @Override // p.a, u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            Fragment fragment = Fragment.this;
            Object obj2 = fragment.mHost;
            return obj2 instanceof f.h ? ((f.h) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class i implements p.a<Void, f.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f.e f7093a;

        public i(Fragment fragment, f.e eVar) {
            this.f7093a = eVar;
        }

        @Override // p.a, u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            return this.f7093a;
        }
    }

    public class j extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p.a f7094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f7095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g.a f7096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f.b f7097d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p.a aVar, AtomicReference atomicReference, g.a aVar2, f.b bVar) {
            super(null);
            this.f7094a = aVar;
            this.f7095b = atomicReference;
            this.f7096c = aVar2;
            this.f7097d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            this.f7095b.set(((f.e) this.f7094a.mo330apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f7096c, this.f7097d));
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<String> f7105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList<String> f7106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f7107i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f7108j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f7109k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f7110l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f7111m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f7112n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f7113o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f7114p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public z6.g0 f7115q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public z6.g0 f7116r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f7117s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public View f7118t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f7119u;

        public k() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f7108j = obj;
            this.f7109k = null;
            this.f7110l = obj;
            this.f7111m = null;
            this.f7112n = obj;
            this.f7115q = null;
            this.f7116r = null;
            this.f7117s = 1.0f;
            this.f7118t = null;
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new w();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = androidx.lifecycle.b0.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new y0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.b0.b bVar = this.mMaxState;
        return (bVar == androidx.lifecycle.b0.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z14) {
        String str;
        if (z14) {
            f8.a aVar = f8.a.f69927a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            f8.a.f69927a.getClass();
            f8.a.c(getTargetFragmentUsageViolation);
            f8.a.c cVarA = f8.a.a(this);
            if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_TARGET_FRAGMENT_USAGE) && f8.a.e(cVarA, getClass(), GetTargetFragmentUsageViolation.class)) {
                f8.a.b(cVarA, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        v vVar = this.mFragmentManager;
        if (vVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return vVar.f7372c.b(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.o0(this);
        nd.d.f125385c.getClass();
        this.mSavedStateRegistryController = nd.d.a.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = q.loadFragmentClass(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e4) {
            throw new InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (java.lang.InstantiationException e14) {
            throw new InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e14);
        } catch (NoSuchMethodException e15) {
            throw new InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e15);
        } catch (InvocationTargetException e16) {
            throw new InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        m0 m0Var = this.mViewLifecycleOwner;
        m0Var.f7299f.a(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> f.c<I> prepareCallInternal(g.a<I, O> aVar, p.a<Void, f.e> aVar2, f.b<O> bVar) {
        if (this.mState > 1) {
            vb.h.z(androidx.core.view.j.j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(aVar2, atomicReference, aVar, bVar));
        return new a(this, atomicReference, aVar);
    }

    private void registerOnPreAttachListener(l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    public boolean J5() {
        return isAdded();
    }

    public void callStartTransitionListener(boolean z14) {
        ViewGroup viewGroup;
        v vVar;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f7119u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (vVar = this.mFragmentManager) == null) {
            return;
        }
        q0 q0VarI = q0.i(viewGroup, vVar);
        q0VarI.k();
        if (z14) {
            this.mHost.f7359c.post(new e(this, q0VarI));
        } else {
            q0VarI.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public o createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            y9.a.a(this).d(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(tn.k.g(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f7372c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final androidx.fragment.app.m getActivity() {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return (androidx.fragment.app.m) rVar.f7357a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f7114p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f7113o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final v getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.f7358b;
    }

    @Override // androidx.lifecycle.y
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && v.R(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a();
        if (application != null) {
            aVar.b(x1.a.f8075f, application);
        }
        aVar.b(m1.f7960a, this);
        aVar.b(m1.f7961b, this);
        if (getArguments() != null) {
            aVar.b(m1.f7962c, getArguments());
        }
        return aVar;
    }

    @Override // androidx.lifecycle.y
    public x1.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            vb.h.z("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && v.R(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new p1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f7100b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f7107i;
    }

    public z6.g0 getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f7115q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f7101c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f7109k;
    }

    public z6.g0 getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f7116r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f7118t;
    }

    @Deprecated
    public final v getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            vb.h.z("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        LayoutInflater layoutInflaterF = rVar.f();
        layoutInflaterF.setFactory2(this.mChildFragmentManager.f7375f);
        return layoutInflaterF;
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public androidx.lifecycle.b0 getF158016a() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public y9.a getLoaderManager() {
        return y9.a.a(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f7104f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final v getParentFragmentManager() {
        v vVar = this.mFragmentManager;
        if (vVar != null) {
            return vVar;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f7099a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f7102d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f7103e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f7117s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f7110l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        f8.a aVar = f8.a.f69927a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        f8.a.f69927a.getClass();
        f8.a.c(getRetainInstanceUsageViolation);
        f8.a.c cVarA = f8.a.a(this);
        if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_RETAIN_INSTANCE_USAGE) && f8.a.e(cVarA, getClass(), GetRetainInstanceUsageViolation.class)) {
            f8.a.b(cVarA, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f7108j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // nd.e
    public final nd.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f125387b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f7111m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f7112n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f7105g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f7106h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i14) {
        return getResources().getString(i14);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        f8.a aVar = f8.a.f69927a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        f8.a.f69927a.getClass();
        f8.a.c(getTargetFragmentRequestCodeUsageViolation);
        f8.a.c cVarA = f8.a.a(this);
        if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_TARGET_FRAGMENT_USAGE) && f8.a.e(cVarA, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            f8.a.b(cVarA, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i14) {
        return getResources().getText(i14);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.n0 getViewLifecycleOwner() {
        m0 m0Var = this.mViewLifecycleOwner;
        if (m0Var != null) {
            return m0Var;
        }
        vb.h.z(androidx.core.view.j.j("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public androidx.lifecycle.s0<androidx.lifecycle.n0> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public y1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            vb.h.z("Can't access ViewModels from detached fragment");
            return null;
        }
        if (getMinimumMaxLifecycleState() == androidx.lifecycle.b0.b.INITIALIZED.ordinal()) {
            vb.h.z("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap<String, y1> map = this.mFragmentManager.Q.f7433c;
        y1 y1Var = map.get(this.mWho);
        if (y1Var != null) {
            return y1Var;
        }
        y1 y1Var2 = new y1();
        map.put(this.mWho, y1Var2);
        return y1Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new w();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        v vVar = this.mFragmentManager;
        if (vVar != null) {
            Fragment fragment = this.mParentFragment;
            vVar.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f7119u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        v vVar = this.mFragmentManager;
        if (vVar == null) {
            return false;
        }
        return vVar.V();
    }

    public final boolean isVisible() {
        View view2;
        return (!isAdded() || isHidden() || (view2 = this.mView) == null || view2.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public Context m0() {
        return getContext();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.X();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i14, int i15, Intent intent) {
        if (v.R(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        r<?> rVar = this.mHost;
        Activity activity = rVar == null ? null : rVar.f7357a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        v vVar = this.mChildFragmentManager;
        if (vVar.f7392w >= 1) {
            return;
        }
        vVar.J = false;
        vVar.K = false;
        vVar.Q.f7436f = false;
        vVar.v(1);
    }

    public Animation onCreateAnimation(int i14, boolean z14, int i15) {
        return null;
    }

    public Animator onCreateAnimator(int i14, boolean z14, int i15) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view2, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view2, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i14 = this.mContentLayoutId;
        if (i14 != 0) {
            return layoutInflater.inflate(i14, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z14) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        r<?> rVar = this.mHost;
        Activity activity = rVar == null ? null : rVar.f7357a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z14) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z14) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z14) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view2, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.X();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        v vVar = this.mChildFragmentManager;
        vVar.J = false;
        vVar.K = false;
        vVar.Q.f7436f = false;
        vVar.v(4);
    }

    public void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.c(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f7358b);
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onAttach()"));
        }
        v vVar = this.mFragmentManager;
        Iterator<z> it3 = vVar.f7386q.iterator();
        while (it3.hasNext()) {
            it3.next().a(vVar, this);
        }
        v vVar2 = this.mChildFragmentManager;
        vVar2.J = false;
        vVar2.K = false;
        vVar2.Q.f7436f = false;
        vVar2.v(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.k(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.X();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z14 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z14 = true;
        }
        return this.mChildFragmentManager.l(menu, menuInflater) | z14;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.X();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new m0(this, getViewModelStore(), new a0.c(this, 11));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        m0 m0Var = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (m0Var.f7298e == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                vb.h.z("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        m0Var.b();
        if (v.R(3)) {
            Objects.toString(this.mView);
            toString();
        }
        View view2 = this.mView;
        m0 m0Var2 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_lifecycle_owner, m0Var2);
        View view3 = this.mView;
        m0 m0Var3 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_view_model_store_owner, m0Var3);
        View view4 = this.mView;
        m0 m0Var4 = this.mViewLifecycleOwner;
        view4.getClass();
        view4.setTag(R.id.view_tree_saved_state_registry_owner, m0Var4);
        this.mViewLifecycleOwnerLiveData.m(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m();
        this.mLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.v(1);
        if (this.mView != null) {
            m0 m0Var = this.mViewLifecycleOwner;
            m0Var.b();
            if (m0Var.f7298e.f7973d.a(androidx.lifecycle.b0.b.CREATED)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.b0.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        l1<y9.b.a> l1Var = y9.a.a(this).f195251b.f195262a;
        int iF = l1Var.f();
        for (int i14 = 0; i14 < iF; i14++) {
            l1Var.g(i14).o();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onDetach()"));
        }
        v vVar = this.mChildFragmentManager;
        if (vVar.L) {
            return;
        }
        vVar.m();
        this.mChildFragmentManager = new w();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z14) {
        onMultiWindowModeChanged(z14);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.q(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.r(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.v(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.b0.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z14) {
        onPictureInPictureModeChanged(z14);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z14 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z14 = true;
        }
        return this.mChildFragmentManager.u(menu) | z14;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zU = v.U(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zU) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zU);
            onPrimaryNavigationFragmentChanged(zU);
            v vVar = this.mChildFragmentManager;
            vVar.t0();
            vVar.s(vVar.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.X();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.o0 o0Var = this.mLifecycleRegistry;
        androidx.lifecycle.b0.a aVar = androidx.lifecycle.b0.a.ON_RESUME;
        o0Var.g(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f7298e.g(aVar);
        }
        v vVar = this.mChildFragmentManager;
        vVar.J = false;
        vVar.K = false;
        vVar.Q.f7436f = false;
        vVar.v(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.X();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.o0 o0Var = this.mLifecycleRegistry;
        androidx.lifecycle.b0.a aVar = androidx.lifecycle.b0.a.ON_START;
        o0Var.g(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f7298e.g(aVar);
        }
        v vVar = this.mChildFragmentManager;
        vVar.J = false;
        vVar.K = false;
        vVar.Q.f7436f = false;
        vVar.v(5);
    }

    public void performStop() {
        v vVar = this.mChildFragmentManager;
        vVar.K = true;
        vVar.Q.f7436f = true;
        vVar.v(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.b0.a.ON_STOP);
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.v(2);
    }

    public final void postponeEnterTransition(long j8, TimeUnit timeUnit) {
        ensureAnimationInfo().f7119u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        v vVar = this.mFragmentManager;
        if (vVar != null) {
            this.mPostponedHandler = vVar.f7393x.f7359c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j8));
    }

    public final <I, O> f.c<I> registerForActivityResult(g.a<I, O> aVar, f.b<O> bVar) {
        return prepareCallInternal(aVar, new h(), bVar);
    }

    public void registerForContextMenu(View view2) {
        view2.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i14) {
        if (this.mHost == null) {
            vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to Activity"));
            return;
        }
        v parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.G == null) {
            parentFragmentManager.f7393x.getClass();
            strArr.getClass();
        } else {
            parentFragmentManager.H.addLast(new v.n(this.mWho, i14));
            parentFragmentManager.G.a(strArr, null);
        }
    }

    public final androidx.fragment.app.m requireActivity() {
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            return activity;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final v requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            vb.h.z(androidx.core.view.j.j("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(this);
        o2.c.t(sb3, " is not a child Fragment, it is directly attached to ", getContext());
        return null;
    }

    public final View requireView() {
        View view2 = getView();
        if (view2 != null) {
            return view2;
        }
        vb.h.z(androidx.core.view.j.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.h0(bundle);
        v vVar = this.mChildFragmentManager;
        vVar.J = false;
        vVar.K = false;
        vVar.Q.f7436f = false;
        vVar.v(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new s0(androidx.core.view.j.j("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.b0.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z14) {
        ensureAnimationInfo().f7114p = Boolean.valueOf(z14);
    }

    public void setAllowReturnTransitionOverlap(boolean z14) {
        ensureAnimationInfo().f7113o = Boolean.valueOf(z14);
    }

    public void setAnimations(int i14, int i15, int i16, int i17) {
        if (this.mAnimationInfo == null && i14 == 0 && i15 == 0 && i16 == 0 && i17 == 0) {
            return;
        }
        ensureAnimationInfo().f7100b = i14;
        ensureAnimationInfo().f7101c = i15;
        ensureAnimationInfo().f7102d = i16;
        ensureAnimationInfo().f7103e = i17;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            vb.h.z("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(z6.g0 g0Var) {
        ensureAnimationInfo().f7115q = g0Var;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f7107i = obj;
    }

    public void setExitSharedElementCallback(z6.g0 g0Var) {
        ensureAnimationInfo().f7116r = g0Var;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f7109k = obj;
    }

    public void setFocusedView(View view2) {
        ensureAnimationInfo().f7118t = view2;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z14) {
        if (this.mHasMenu != z14) {
            this.mHasMenu = z14;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.h();
        }
    }

    public void setInitialSavedState(m mVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            vb.h.z("Fragment already added");
            return;
        }
        if (mVar == null || (bundle = mVar.f7120a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z14) {
        if (this.mMenuVisible != z14) {
            this.mMenuVisible = z14;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i14) {
        if (this.mAnimationInfo == null && i14 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f7104f = i14;
    }

    public void setPopDirection(boolean z14) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f7099a = z14;
    }

    public void setPostOnViewCreatedAlpha(float f14) {
        ensureAnimationInfo().f7117s = f14;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f7110l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z14) {
        f8.a aVar = f8.a.f69927a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        f8.a.f69927a.getClass();
        f8.a.c(setRetainInstanceUsageViolation);
        f8.a.c cVarA = f8.a.a(this);
        if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_RETAIN_INSTANCE_USAGE) && f8.a.e(cVarA, getClass(), SetRetainInstanceUsageViolation.class)) {
            f8.a.b(cVarA, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z14;
        v vVar = this.mFragmentManager;
        if (vVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        y yVar = vVar.Q;
        if (z14) {
            yVar.x4(this);
        } else {
            yVar.z4(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f7108j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f7111m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f7105g = arrayList;
        kVar.f7106h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f7112n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i14) {
        if (fragment != null) {
            f8.a aVar = f8.a.f69927a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, fragment, i14);
            f8.a.f69927a.getClass();
            f8.a.c(setTargetFragmentUsageViolation);
            f8.a.c cVarA = f8.a.a(this);
            if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_TARGET_FRAGMENT_USAGE) && f8.a.e(cVarA, getClass(), SetTargetFragmentUsageViolation.class)) {
                f8.a.b(cVarA, setTargetFragmentUsageViolation);
            }
        }
        v vVar = this.mFragmentManager;
        v vVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (vVar != null && vVar2 != null && vVar != vVar2) {
            vb.h.s(androidx.core.view.j.j("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                androidx.core.view.j.p(fragment, " as the target of ", this, " would create a target cycle", "Setting ");
                return;
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i14;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z14) {
        f8.a aVar = f8.a.f69927a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z14);
        f8.a.f69927a.getClass();
        f8.a.c(setUserVisibleHintViolation);
        f8.a.c cVarA = f8.a.a(this);
        if (cVarA.f69940a.contains(f8.a.EnumC1431a.DETECT_SET_USER_VISIBLE_HINT) && f8.a.e(cVarA, getClass(), SetUserVisibleHintViolation.class)) {
            f8.a.b(cVarA, setUserVisibleHintViolation);
        }
        boolean z15 = false;
        if (!this.mUserVisibleHint && z14 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            v vVar = this.mFragmentManager;
            d0 d0VarH = vVar.h(this);
            Fragment fragment = d0VarH.f7166c;
            if (fragment.mDeferStart) {
                if (vVar.f7371b) {
                    vVar.M = true;
                } else {
                    fragment.mDeferStart = false;
                    d0VarH.i();
                }
            }
        }
        this.mUserVisibleHint = z14;
        if (this.mState < 5 && !z14) {
            z15 = true;
        }
        this.mDeferStart = z15;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z14);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        r<?> rVar = this.mHost;
        if (rVar != null) {
            return rVar.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            a7.b.startActivity(rVar.f7358b, intent, bundle);
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i14, Bundle bundle) {
        if (this.mHost == null) {
            vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to Activity"));
            return;
        }
        v parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E != null) {
            parentFragmentManager.H.addLast(new v.n(this.mWho, i14));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.E.a(intent, null);
            return;
        }
        r<?> rVar = parentFragmentManager.f7393x;
        rVar.getClass();
        intent.getClass();
        if (i14 == -1) {
            a7.b.startActivity(rVar.f7358b, intent, bundle);
        } else {
            vb.h.z("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i14, Intent intent, int i15, int i16, int i17, Bundle bundle) {
        if (this.mHost == null) {
            vb.h.z(androidx.core.view.j.j("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (v.R(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        v parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            r<?> rVar = parentFragmentManager.f7393x;
            rVar.getClass();
            intentSender.getClass();
            if (i14 != -1) {
                vb.h.z("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
            Activity activity = rVar.f7357a;
            if (activity != null) {
                activity.startIntentSenderForResult(intentSender, i14, intent, i15, i16, i17, bundle);
                return;
            } else {
                vb.h.z("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (v.R(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        f.i.a aVar = new f.i.a(intentSender);
        aVar.f67614b = intent;
        aVar.f67616d = i16;
        aVar.f67615c = i15;
        f.i iVarA = aVar.a();
        parentFragmentManager.H.addLast(new v.n(this.mWho, i14));
        if (v.R(2)) {
            toString();
        }
        parentFragmentManager.F.a(iVarA, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f7119u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f7119u = false;
        } else if (Looper.myLooper() != this.mHost.f7359c.getLooper()) {
            this.mHost.f7359c.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append(getClass().getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} (");
        sb3.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb3.append(" id=0x");
            sb3.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb3.append(" tag=");
            sb3.append(this.mTag);
        }
        sb3.append(")");
        return sb3.toString();
    }

    public void unregisterForContextMenu(View view2) {
        view2.setOnCreateContextMenuListener(null);
    }

    public static abstract class l {
        private l() {
        }

        public abstract void a();

        public /* synthetic */ l(b bVar) {
            this();
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f7120a;

        public m(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f7120a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeBundle(this.f7120a);
        }

        public class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new m[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }
        }

        public m(Bundle bundle) {
            this.f7120a = bundle;
        }
    }

    public final String getString(int i14, Object... objArr) {
        return getResources().getString(i14, objArr);
    }

    public final <I, O> f.c<I> registerForActivityResult(g.a<I, O> aVar, f.e eVar, f.b<O> bVar) {
        return prepareCallInternal(aVar, new i(this, eVar), bVar);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    private void restoreViewState() {
        if (v.R(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f7119u = true;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i14) {
        startActivityForResult(intent, i14, null);
    }

    public Fragment(int i14) {
        this();
        this.mContentLayoutId = i14;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }
}
