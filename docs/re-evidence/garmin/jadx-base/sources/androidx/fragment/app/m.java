package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.y1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class m extends b.g implements z6.a.InterfaceC3779a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.o0 mFragmentLifecycleRegistry;
    final p mFragments;
    boolean mResumed;
    boolean mStopped;

    public m() {
        this.mFragments = p.a(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.o0(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new j(this, 0));
        final int i14 = 0;
        addOnConfigurationChangedListener(new k7.b(this) { // from class: androidx.fragment.app.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f7285b;

            {
                this.f7285b = this;
            }

            @Override // k7.b
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        this.f7285b.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f7285b.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        final int i15 = 1;
        addOnNewIntentListener(new k7.b(this) { // from class: androidx.fragment.app.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f7285b;

            {
                this.f7285b = this;
            }

            @Override // k7.b
            public final void accept(Object obj) {
                switch (i15) {
                    case 0:
                        this.f7285b.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f7285b.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new l(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        r<?> rVar = this.mFragments.f7319a;
        rVar.f7360d.c(rVar, rVar, null);
    }

    private static boolean markState(v vVar, androidx.lifecycle.b0.b bVar) {
        boolean zMarkState = false;
        for (Fragment fragment : vVar.f7372c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), bVar);
                }
                m0 m0Var = fragment.mViewLifecycleOwner;
                if (m0Var != null) {
                    m0Var.b();
                    if (m0Var.f7298e.f7973d.a(androidx.lifecycle.b0.b.STARTED)) {
                        fragment.mViewLifecycleOwner.f7298e.i(bVar);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f7973d.a(androidx.lifecycle.b0.b.STARTED)) {
                    fragment.mLifecycleRegistry.i(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view2, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f7319a.f7360d.f7375f.onCreateView(view2, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                y9.a.a(this).d(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f7319a.f7360d.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public v getSupportFragmentManager() {
        return this.mFragments.f7319a.f7360d;
    }

    @Deprecated
    public y9.a getSupportLoaderManager() {
        return y9.a.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.b0.b.CREATED)) {
        }
    }

    @Override // b.g, android.app.Activity
    public void onActivityResult(int i14, int i15, Intent intent) {
        this.mFragments.b();
        super.onActivityResult(i14, i15, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_CREATE);
        w wVar = this.mFragments.f7319a.f7360d;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.f7436f = false;
        wVar.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f7319a.f7360d.m();
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_DESTROY);
    }

    @Override // b.g, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i14, MenuItem menuItem) {
        if (super.onMenuItemSelected(i14, menuItem)) {
            return true;
        }
        if (i14 == 6) {
            return this.mFragments.f7319a.f7360d.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f7319a.f7360d.v(5);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // b.g, android.app.Activity
    public void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        this.mFragments.b();
        super.onRequestPermissionsResult(i14, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.b();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f7319a.f7360d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_RESUME);
        w wVar = this.mFragments.f7319a.f7360d;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.f7436f = false;
        wVar.v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.b();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            w wVar = this.mFragments.f7319a.f7360d;
            wVar.J = false;
            wVar.K = false;
            wVar.Q.f7436f = false;
            wVar.v(4);
        }
        this.mFragments.f7319a.f7360d.A(true);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_START);
        w wVar2 = this.mFragments.f7319a.f7360d;
        wVar2.J = false;
        wVar2.K = false;
        wVar2.Q.f7436f = false;
        wVar2.v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.b();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        w wVar = this.mFragments.f7319a.f7360d;
        wVar.K = true;
        wVar.Q.f7436f = true;
        wVar.v(4);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.b0.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(z6.g0 g0Var) {
        setEnterSharedElementCallback(g0Var != null ? new z6.a.b(g0Var) : null);
    }

    public void setExitSharedElementCallback(z6.g0 g0Var) {
        setExitSharedElementCallback(g0Var != null ? new z6.a.b(g0Var) : null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i14, Bundle bundle) {
        if (i14 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i14, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i14, Intent intent, int i15, int i16, int i17, Bundle bundle) throws IntentSender.SendIntentException {
        if (i14 == -1) {
            startIntentSenderForResult(intentSender, i14, intent, i15, i16, i17, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i14, intent, i15, i16, i17, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // z6.a.InterfaceC3779a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i14) {
    }

    public class a extends r<m> implements a7.e, a7.f, z6.b0, z6.c0, ViewModelStoreOwner, b.w, f.h, nd.e, z, androidx.core.view.o {
        public a() {
            super(m.this);
        }

        @Override // androidx.fragment.app.z
        public final void a(v vVar, Fragment fragment) {
            m.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.o
        public final void addMenuProvider(androidx.core.view.s sVar) {
            m.this.addMenuProvider(sVar);
        }

        @Override // androidx.core.view.o
        public final void addMenuProvider(androidx.core.view.s sVar, androidx.lifecycle.n0 n0Var) {
            throw null;
        }

        @Override // a7.e
        public final void addOnConfigurationChangedListener(k7.b<Configuration> bVar) {
            m.this.addOnConfigurationChangedListener(bVar);
        }

        @Override // z6.b0
        public final void addOnMultiWindowModeChangedListener(k7.b<z6.h> bVar) {
            m.this.addOnMultiWindowModeChangedListener(bVar);
        }

        @Override // z6.c0
        public final void addOnPictureInPictureModeChangedListener(k7.b<z6.e0> bVar) {
            m.this.addOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // a7.f
        public final void addOnTrimMemoryListener(k7.b<Integer> bVar) {
            m.this.addOnTrimMemoryListener(bVar);
        }

        @Override // androidx.fragment.app.r, androidx.fragment.app.o
        public final View b(int i14) {
            return m.this.findViewById(i14);
        }

        @Override // androidx.fragment.app.r, androidx.fragment.app.o
        public final boolean c() {
            Window window = m.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.r
        public final void d(PrintWriter printWriter, String[] strArr) {
            m.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.r
        public final m e() {
            return m.this;
        }

        @Override // androidx.fragment.app.r
        public final LayoutInflater f() {
            m mVar = m.this;
            return mVar.getLayoutInflater().cloneInContext(mVar);
        }

        @Override // androidx.fragment.app.r
        public final boolean g(String str) {
            return z6.a.b(m.this, str);
        }

        @Override // f.h
        public final f.e getActivityResultRegistry() {
            return m.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.n0
        /* JADX INFO: renamed from: getLifecycle */
        public final androidx.lifecycle.b0 getF158017a() {
            return m.this.mFragmentLifecycleRegistry;
        }

        @Override // b.w
        public final b.u getOnBackPressedDispatcher() {
            return m.this.getOnBackPressedDispatcher();
        }

        @Override // nd.e
        public final nd.c getSavedStateRegistry() {
            return m.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public final y1 getViewModelStore() {
            return m.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.r
        public final void h() {
            invalidateMenu();
        }

        @Override // androidx.core.view.o
        public final void invalidateMenu() {
            m.this.invalidateMenu();
        }

        @Override // androidx.core.view.o
        public final void removeMenuProvider(androidx.core.view.s sVar) {
            m.this.removeMenuProvider(sVar);
        }

        @Override // a7.e
        public final void removeOnConfigurationChangedListener(k7.b<Configuration> bVar) {
            m.this.removeOnConfigurationChangedListener(bVar);
        }

        @Override // z6.b0
        public final void removeOnMultiWindowModeChangedListener(k7.b<z6.h> bVar) {
            m.this.removeOnMultiWindowModeChangedListener(bVar);
        }

        @Override // z6.c0
        public final void removeOnPictureInPictureModeChangedListener(k7.b<z6.e0> bVar) {
            m.this.removeOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // a7.f
        public final void removeOnTrimMemoryListener(k7.b<Integer> bVar) {
            m.this.removeOnTrimMemoryListener(bVar);
        }

        @Override // androidx.core.view.o
        public final void addMenuProvider(androidx.core.view.s sVar, androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.b bVar) {
            m.this.addMenuProvider(sVar, n0Var, bVar);
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i14) {
        startActivityFromFragment(fragment, intent, i14, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view2, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view2, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view2, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public m(int i14) {
        super(i14);
        this.mFragments = p.a(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.o0(this);
        this.mStopped = true;
        init();
    }
}
