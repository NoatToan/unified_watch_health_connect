package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.p004activity.OnBackPressedDispatcher;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.ActivityResultRegistry;
import androidx.p004activity.result.IntentSenderRequest;
import androidx.p004activity.result.contract.ActivityResultContract;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.Constants;
import defpackage.haa;
import defpackage.iqf;
import defpackage.kpe;
import defpackage.on0;
import defpackage.p7h;
import defpackage.q7h;
import defpackage.qsi;
import defpackage.s5n;
import defpackage.zaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean R = false;
    public ActivityResultLauncher<Intent> C;
    public ActivityResultLauncher<IntentSenderRequest> D;
    public ActivityResultLauncher<String[]> E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList<androidx.fragment.app.a> L;
    public ArrayList<Boolean> M;
    public ArrayList<Fragment> N;
    public androidx.fragment.app.g O;
    public FragmentStrictMode.Policy P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2342b;
    public ArrayList<androidx.fragment.app.a> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public ArrayList<n> m;
    public FragmentHostCallback<?> v;
    public FragmentContainer w;
    public Fragment x;
    public Fragment y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<o> f2341a = new ArrayList<>();
    public final androidx.fragment.app.j c = new androidx.fragment.app.j();
    public final androidx.fragment.app.e f = new androidx.fragment.app.e(this);
    public final p7h h = new b(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, BackStackState> j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f2343k = Collections.synchronizedMap(new HashMap());
    public final Map<String, m> l = Collections.synchronizedMap(new HashMap());
    public final androidx.fragment.app.f n = new androidx.fragment.app.f(this);
    public final CopyOnWriteArrayList<haa> o = new CopyOnWriteArrayList<>();
    public final Consumer<Configuration> p = new Consumer() { // from class: v9a
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            this.f36638a.V0((Configuration) obj);
        }
    };
    public final Consumer<Integer> q = new Consumer() { // from class: w9a
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            this.f37744a.W0((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Consumer<MultiWindowModeChangedInfo> f2344r = new Consumer() { // from class: x9a
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            this.f38886a.X0((MultiWindowModeChangedInfo) obj);
        }
    };
    public final Consumer<PictureInPictureModeChangedInfo> s = new Consumer() { // from class: y9a
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            this.f39955a.Y0((PictureInPictureModeChangedInfo) obj);
        }
    };
    public final MenuProvider t = new c();
    public int u = -1;
    public androidx.fragment.app.d z = null;
    public androidx.fragment.app.d A = new d();
    private s5n mSpecialEffectsControllerFactory = null;
    public s5n B = new e();
    public ArrayDeque<LaunchedFragmentInfo> F = new ArrayDeque<>();
    public Runnable Q = new f();

    public class a implements ActivityResultCallback<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.p004activity.result.ActivityResultCallback
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.F.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f2347a;
            int i2 = launchedFragmentInfoPollFirst.f2348b;
            Fragment fragmentI = FragmentManager.this.c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Permission request result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    public class b extends p7h {
        public b(boolean z) {
            super(z);
        }

        @Override // defpackage.p7h
        public void handleOnBackPressed() {
            FragmentManager.this.I0();
        }
    }

    public class c implements MenuProvider {
        public c() {
        }

        @Override // androidx.core.view.MenuProvider
        public void a(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.E(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public void b(Menu menu) {
            FragmentManager.this.M(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public void c(Menu menu) {
            FragmentManager.this.Q(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean d(MenuItem menuItem) {
            return FragmentManager.this.L(menuItem);
        }
    }

    public class d extends androidx.fragment.app.d {
        public d() {
        }

        @Override // androidx.fragment.app.d
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.z0().b(FragmentManager.this.z0().f(), str, null);
        }
    }

    public class e implements s5n {
        public e() {
        }

        @Override // defpackage.s5n
        public androidx.fragment.app.l a(ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.c0(true);
        }
    }

    public class g implements haa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f2355a;

        public g(Fragment fragment) {
            this.f2355a = fragment;
        }

        @Override // defpackage.haa
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f2355a.onAttachFragment(fragment);
        }
    }

    public class h implements ActivityResultCallback<ActivityResult> {
        public h() {
        }

        @Override // androidx.p004activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.F.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f2347a;
            int i = launchedFragmentInfoPollFirst.f2348b;
            Fragment fragmentI = FragmentManager.this.c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i, activityResult.c(), activityResult.a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Activity result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    public class i implements ActivityResultCallback<ActivityResult> {
        public i() {
        }

        @Override // androidx.p004activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.F.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f2347a;
            int i = launchedFragmentInfoPollFirst.f2348b;
            Fragment fragmentI = FragmentManager.this.c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i, activityResult.c(), activityResult.a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Intent Sender result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    public interface j {
        int getId();

        String getName();
    }

    public static class k extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.p004activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            Intent intentA = intentSenderRequest.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                intentA.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.e()).b(null).c(intentSenderRequest.d(), intentSenderRequest.c()).a();
                }
            }
            intent.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p004activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static abstract class l {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public static class m implements zaa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f2359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zaa f2360b;
        public final LifecycleEventObserver c;

        public m(Lifecycle lifecycle, zaa zaaVar, LifecycleEventObserver lifecycleEventObserver) {
            this.f2359a = lifecycle;
            this.f2360b = zaaVar;
            this.c = lifecycleEventObserver;
        }

        @Override // defpackage.zaa
        public void a(String str, Bundle bundle) {
            this.f2360b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.f2359a.getState().isAtLeast(state);
        }

        public void c() {
            this.f2359a.removeObserver(this.c);
        }
    }

    public interface n {
        void a();
    }

    public interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2362b;
        public final int c;

        public p(String str, int i, int i2) {
            this.f2361a = str;
            this.f2362b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.y;
            if (fragment == null || this.f2362b >= 0 || this.f2361a != null || !fragment.getChildFragmentManager().k1()) {
                return FragmentManager.this.n1(arrayList, arrayList2, this.f2361a, this.f2362b, this.c);
            }
            return false;
        }
    }

    public static Fragment G0(View view) {
        Object tag = view.getTag(qsi.f31805a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean M0(int i2) {
        return R || Log.isLoggable("FragmentManager", i2);
    }

    public static void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.G(-1);
                aVar.L();
            } else {
                aVar.G(1);
                aVar.K();
            }
            i2++;
        }
    }

    public static <F extends Fragment> F j0(View view) {
        F f2 = (F) o0(view);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager n0(View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentO0 = o0(view);
        if (fragmentO0 != null) {
            if (fragmentO0.isAdded()) {
                return fragmentO0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentO0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static Fragment o0(View view) {
        while (view != null) {
            Fragment fragmentG0 = G0(view);
            if (fragmentG0 != null) {
                return fragmentG0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static int v1(int i2) {
        int i3 = DKFRequestService.s0;
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 8194) {
            i3 = Constants.PUT_DATA_CODE_HCI;
            if (i2 == 8197) {
                return 4100;
            }
            if (i2 == 4099) {
                return DKFRequestService.u0;
            }
            if (i2 != 4100) {
                return 0;
            }
        }
        return i3;
    }

    public void A() {
        this.H = false;
        this.I = false;
        this.O.l(false);
        U(0);
    }

    public LayoutInflater.Factory2 A0() {
        return this.f;
    }

    public final void A1(String str, Bundle bundle) {
        m mVar = this.l.get(str);
        if (mVar == null || !mVar.b(Lifecycle.State.STARTED)) {
            this.f2343k.put(str, bundle);
        } else {
            mVar.a(str, bundle);
        }
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting fragment result with key ");
            sb.append(str);
            sb.append(" and result ");
            sb.append(bundle);
        }
    }

    public void B(Configuration configuration, boolean z) {
        if (z && (this.v instanceof OnConfigurationChangedProvider)) {
            H1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.B(configuration, true);
                }
            }
        }
    }

    public androidx.fragment.app.f B0() {
        return this.n;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void B1(final String str, LifecycleOwner lifecycleOwner, final zaa zaaVar) {
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.f2343k.get(str)) != null) {
                    zaaVar.a(str, bundle);
                    FragmentManager.this.t(str);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    FragmentManager.this.l.remove(str);
                }
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        m mVarPut = this.l.put(str, new m(lifecycle, zaaVar, lifecycleEventObserver));
        if (mVarPut != null) {
            mVarPut.c();
        }
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting FragmentResultListener with key ");
            sb.append(str);
            sb.append(" lifecycleOwner ");
            sb.append(lifecycle);
            sb.append(" and listener ");
            sb.append(zaaVar);
        }
    }

    public boolean C(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment C0() {
        return this.x;
    }

    public void C1(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void D() {
        this.H = false;
        this.I = false;
        this.O.l(false);
        U(1);
    }

    public Fragment D0() {
        return this.y;
    }

    public void D1(Fragment fragment) {
        if (fragment == null || (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.y;
            this.y = fragment;
            N(fragment2);
            N(this.y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && Q0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public s5n E0() {
        s5n s5nVar = this.mSpecialEffectsControllerFactory;
        if (s5nVar != null) {
            return s5nVar;
        }
        Fragment fragment = this.x;
        return fragment != null ? fragment.mFragmentManager.E0() : this.B;
    }

    public final void E1(Fragment fragment) {
        ViewGroup viewGroupW0 = w0(fragment);
        if (viewGroupW0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupW0.getTag(qsi.c) == null) {
            viewGroupW0.setTag(qsi.c, fragment);
        }
        ((Fragment) viewGroupW0.getTag(qsi.c)).setPopDirection(fragment.getPopDirection());
    }

    public void F() {
        this.J = true;
        c0(true);
        Z();
        s();
        U(-1);
        Object obj = this.v;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.q);
        }
        Object obj2 = this.v;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.p);
        }
        Object obj3 = this.v;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.f2344r);
        }
        Object obj4 = this.v;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.s);
        }
        Object obj5 = this.v;
        if (obj5 instanceof iqf) {
            ((iqf) obj5).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.remove();
            this.g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.C;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.D.unregister();
            this.E.unregister();
        }
    }

    public FragmentStrictMode.Policy F0() {
        return this.P;
    }

    public void F1(Fragment fragment) {
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void G() {
        U(1);
    }

    public final void G1() {
        Iterator<androidx.fragment.app.h> it = this.c.k().iterator();
        while (it.hasNext()) {
            f1(it.next());
        }
    }

    public void H(boolean z) {
        if (z && (this.v instanceof OnTrimMemoryProvider)) {
            H1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.H(true);
                }
            }
        }
    }

    public ViewModelStore H0(Fragment fragment) {
        return this.O.i(fragment);
    }

    public final void H1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new kpe("FragmentManager"));
        FragmentHostCallback<?> fragmentHostCallback = this.v;
        try {
            if (fragmentHostCallback != null) {
                fragmentHostCallback.h("  ", null, printWriter, new String[0]);
            } else {
                Y("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public void I(boolean z, boolean z2) {
        if (z2 && (this.v instanceof OnMultiWindowModeChangedProvider)) {
            H1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.I(z, true);
                }
            }
        }
    }

    public void I0() {
        c0(true);
        if (this.h.isEnabled()) {
            k1();
        } else {
            this.g.d();
        }
    }

    public void I1(l lVar) {
        this.n.p(lVar);
    }

    public void J(Fragment fragment) {
        Iterator<haa> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public void J0(Fragment fragment) {
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        E1(fragment);
    }

    public final void J1() {
        synchronized (this.f2341a) {
            try {
                if (this.f2341a.isEmpty()) {
                    this.h.setEnabled(s0() > 0 && R0(this.x));
                } else {
                    this.h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void K() {
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.K();
            }
        }
    }

    public void K0(Fragment fragment) {
        if (fragment.mAdded && N0(fragment)) {
            this.G = true;
        }
    }

    public boolean L(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean L0() {
        return this.J;
    }

    public void M(Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void N(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public final boolean N0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.p();
    }

    public void O() {
        U(5);
    }

    public final boolean O0() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.x.getParentFragmentManager().O0();
    }

    public void P(boolean z, boolean z2) {
        if (z2 && (this.v instanceof OnPictureInPictureModeChangedProvider)) {
            H1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.P(z, true);
                }
            }
        }
    }

    public boolean P0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public boolean Q(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && Q0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean Q0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void R() {
        J1();
        N(this.y);
    }

    public boolean R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.D0()) && R0(fragmentManager.x);
    }

    public void S() {
        this.H = false;
        this.I = false;
        this.O.l(false);
        U(7);
    }

    public boolean S0(int i2) {
        return this.u >= i2;
    }

    public void T() {
        this.H = false;
        this.I = false;
        this.O.l(false);
        U(5);
    }

    public boolean T0() {
        return this.H || this.I;
    }

    public final void U(int i2) {
        try {
            this.f2342b = true;
            this.c.d(i2);
            c1(i2, false);
            Iterator<androidx.fragment.app.l> it = v().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.f2342b = false;
            c0(true);
        } catch (Throwable th) {
            this.f2342b = false;
            throw th;
        }
    }

    public void V() {
        this.I = true;
        this.O.l(true);
        U(4);
    }

    public final /* synthetic */ void V0(Configuration configuration) {
        if (O0()) {
            B(configuration, false);
        }
    }

    public void W() {
        U(2);
    }

    public final /* synthetic */ void W0(Integer num) {
        if (O0() && num.intValue() == 80) {
            H(false);
        }
    }

    public final void X() {
        if (this.K) {
            this.K = false;
            G1();
        }
    }

    public final /* synthetic */ void X0(MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        if (O0()) {
            I(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
        }
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.I(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f2341a) {
            try {
                int size3 = this.f2341a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        o oVar = this.f2341a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(oVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final /* synthetic */ void Y0(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        if (O0()) {
            P(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
        }
    }

    public final void Z() {
        Iterator<androidx.fragment.app.l> it = v().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public void Z0(Fragment fragment, String[] strArr, int i2) {
        if (this.E == null) {
            this.v.k(fragment, strArr, i2);
            return;
        }
        this.F.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        this.E.launch(strArr);
    }

    public void a0(o oVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.f2341a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2341a.add(oVar);
                    y1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a1(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.C == null) {
            this.v.m(fragment, intent, i2, bundle);
            return;
        }
        this.F.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (intent != null && bundle != null) {
            intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
        }
        this.C.launch(intent);
    }

    public void addFragmentOnAttachListener(haa haaVar) {
        this.o.add(haaVar);
    }

    public void addOnBackStackChangedListener(n nVar) {
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        this.m.add(nVar);
    }

    public final void b0(boolean z) {
        if (this.f2342b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            q();
        }
        if (this.L == null) {
            this.L = new ArrayList<>();
            this.M = new ArrayList<>();
        }
    }

    public void b1(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.D == null) {
            this.v.n(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ActivityOptions ");
                sb.append(bundle);
                sb.append(" were added to fillInIntent ");
                sb.append(intent2);
                sb.append(" for fragment ");
                sb.append(fragment);
            }
            intent2.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.b(intentSender).b(intent2).c(i4, i3).a();
        this.F.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (M0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(fragment);
            sb2.append("is launching an IntentSender for result ");
        }
        this.D.launch(intentSenderRequestA);
    }

    public boolean c0(boolean z) {
        b0(z);
        boolean z2 = false;
        while (q0(this.L, this.M)) {
            z2 = true;
            this.f2342b = true;
            try {
                r1(this.L, this.M);
                r();
            } catch (Throwable th) {
                r();
                throw th;
            }
        }
        J1();
        X();
        this.c.b();
        return z2;
    }

    public void c1(int i2, boolean z) {
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.u) {
            this.u = i2;
            this.c.t();
            G1();
            if (this.G && (fragmentHostCallback = this.v) != null && this.u == 7) {
                fragmentHostCallback.o();
                this.G = false;
            }
        }
    }

    public void d0(o oVar, boolean z) {
        if (z && (this.v == null || this.J)) {
            return;
        }
        b0(z);
        if (oVar.a(this.L, this.M)) {
            this.f2342b = true;
            try {
                r1(this.L, this.M);
                r();
            } catch (Throwable th) {
                r();
                throw th;
            }
        }
        J1();
        X();
        this.c.b();
    }

    public void d1() {
        if (this.v == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.l(false);
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void e1(FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.h hVar : this.c.k()) {
            Fragment fragmentK = hVar.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                hVar.b();
            }
        }
    }

    public final void f0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z = arrayList.get(i2).f2426r;
        ArrayList<Fragment> arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.N.addAll(this.c.o());
        Fragment fragmentD0 = D0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            fragmentD0 = !arrayList2.get(i4).booleanValue() ? aVar.M(this.N, fragmentD0) : aVar.O(this.N, fragmentD0);
            z2 = z2 || aVar.i;
        }
        this.N.clear();
        if (!z && this.u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator<androidx.fragment.app.k.a> it = arrayList.get(i5).c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f2428b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.c.r(x(fragment));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i2, i3);
        boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (zBooleanValue) {
                for (int size = aVar2.c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.c.get(size).f2428b;
                    if (fragment2 != null) {
                        x(fragment2).m();
                    }
                }
            } else {
                Iterator<androidx.fragment.app.k.a> it2 = aVar2.c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f2428b;
                    if (fragment3 != null) {
                        x(fragment3).m();
                    }
                }
            }
        }
        c1(this.u, true);
        for (androidx.fragment.app.l lVar : w(arrayList, i2, i3)) {
            lVar.r(zBooleanValue);
            lVar.p();
            lVar.g();
        }
        while (i2 < i3) {
            androidx.fragment.app.a aVar3 = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue() && aVar3.v >= 0) {
                aVar3.v = -1;
            }
            aVar3.N();
            i2++;
        }
        if (z2) {
            t1();
        }
    }

    public void f1(androidx.fragment.app.h hVar) {
        Fragment fragmentK = hVar.k();
        if (fragmentK.mDeferStart) {
            if (this.f2342b) {
                this.K = true;
            } else {
                fragmentK.mDeferStart = false;
                hVar.m();
            }
        }
    }

    public boolean g0() {
        boolean zC0 = c0(true);
        p0();
        return zC0;
    }

    public void g1() {
        a0(new p(null, -1, 0), false);
    }

    public Fragment h0(String str) {
        return this.c.f(str);
    }

    public void h1(int i2, int i3) {
        i1(i2, i3, false);
    }

    public void i(androidx.fragment.app.a aVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(aVar);
    }

    public final int i0(String str, int i2, boolean z) {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i2 >= 0 && i2 == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.getName())) && (i2 < 0 || i2 != aVar2.v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public void i1(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            a0(new p(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public androidx.fragment.app.h j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str);
        }
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        androidx.fragment.app.h hVarX = x(fragment);
        fragment.mFragmentManager = this;
        this.c.r(hVarX);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (N0(fragment)) {
                this.G = true;
            }
        }
        return hVarX;
    }

    public void j1(String str, int i2) {
        a0(new p(str, -1, i2), false);
    }

    public void k(Fragment fragment) {
        this.O.a(fragment);
    }

    public Fragment k0(int i2) {
        return this.c.g(i2);
    }

    public boolean k1() {
        return m1(null, -1, 0);
    }

    public int l() {
        return this.i.getAndIncrement();
    }

    public Fragment l0(String str) {
        return this.c.h(str);
    }

    public boolean l1(int i2, int i3) {
        if (i2 >= 0) {
            return m1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public void m(FragmentHostCallback<?> fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        String str;
        LifecycleOwner lifecycleOwner;
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = fragmentHostCallback;
        this.w = fragmentContainer;
        this.x = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new g(fragment));
        } else if (fragmentHostCallback instanceof haa) {
            addFragmentOnAttachListener((haa) fragmentHostCallback);
        }
        if (this.x != null) {
            J1();
        }
        if (fragmentHostCallback instanceof q7h) {
            q7h q7hVar = (q7h) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = q7hVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = q7hVar;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = q7hVar;
            onBackPressedDispatcher.b(lifecycleOwner, this.h);
        }
        if (fragment != null) {
            this.O = fragment.mFragmentManager.t0(fragment);
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.O = androidx.fragment.app.g.g(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore());
        } else {
            this.O = new androidx.fragment.app.g(false);
        }
        this.O.l(T0());
        this.c.A(this.O);
        Object obj = this.v;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.registerSavedStateProvider("android:support:fragments", new SavedStateRegistry.SavedStateProvider() { // from class: z9a
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    return this.f41043a.U0();
                }
            });
            Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
            if (bundleConsumeRestoredStateForKey != null) {
                u1(bundleConsumeRestoredStateForKey);
            }
        }
        Object obj2 = this.v;
        if (obj2 instanceof on0) {
            ActivityResultRegistry activityResultRegistry = ((on0) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.C = activityResultRegistry.i(str2 + "StartActivityForResult", new ActivityResultContracts.StartActivityForResult(), new h());
            this.D = activityResultRegistry.i(str2 + "StartIntentSenderForResult", new k(), new i());
            this.E = activityResultRegistry.i(str2 + "RequestPermissions", new ActivityResultContracts.RequestMultiplePermissions(), new a());
        }
        Object obj3 = this.v;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.q);
        }
        Object obj5 = this.v;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f2344r);
        }
        Object obj6 = this.v;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.s);
        }
        Object obj7 = this.v;
        if ((obj7 instanceof iqf) && fragment == null) {
            ((iqf) obj7).addMenuProvider(this.t);
        }
    }

    public Fragment m0(String str) {
        return this.c.i(str);
    }

    public final boolean m1(String str, int i2, int i3) {
        c0(false);
        b0(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().k1()) {
            return true;
        }
        boolean zN1 = n1(this.L, this.M, str, i2, i3);
        if (zN1) {
            this.f2342b = true;
            try {
                r1(this.L, this.M);
                r();
            } catch (Throwable th) {
                r();
                throw th;
            }
        }
        J1();
        X();
        this.c.b();
        return zN1;
    }

    public void n(Fragment fragment) {
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (M0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fragment);
            }
            if (N0(fragment)) {
                this.G = true;
            }
        }
    }

    public boolean n1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int iI0 = i0(str, i2, (i3 & 1) != 0);
        if (iI0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iI0; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public androidx.fragment.app.k o() {
        return new androidx.fragment.app.a(this);
    }

    public void o1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            H1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public boolean p() {
        boolean zN0 = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                zN0 = N0(fragment);
            }
            if (zN0) {
                return true;
            }
        }
        return false;
    }

    public final void p0() {
        Iterator<androidx.fragment.app.l> it = v().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    public void p1(l lVar, boolean z) {
        this.n.o(lVar, z);
    }

    public final void q() {
        if (T0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean q0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2341a) {
            if (this.f2341a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f2341a.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.f2341a.get(i2).a(arrayList, arrayList2);
                }
                this.f2341a.clear();
                this.v.g().removeCallbacks(this.Q);
                return zA;
            } catch (Throwable th) {
                this.f2341a.clear();
                this.v.g().removeCallbacks(this.Q);
                throw th;
            }
        }
    }

    public void q1(Fragment fragment) {
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.c.u(fragment);
            if (N0(fragment)) {
                this.G = true;
            }
            fragment.mRemoving = true;
            E1(fragment);
        }
    }

    public final void r() {
        this.f2342b = false;
        this.M.clear();
        this.L.clear();
    }

    public j r0(int i2) {
        return this.d.get(i2);
    }

    public final void r1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f2426r) {
                if (i3 != i2) {
                    f0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f2426r) {
                        i3++;
                    }
                }
                f0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            f0(arrayList, arrayList2, i3, size);
        }
    }

    public void removeFragmentOnAttachListener(haa haaVar) {
        this.o.remove(haaVar);
    }

    public void removeOnBackStackChangedListener(n nVar) {
        ArrayList<n> arrayList = this.m;
        if (arrayList != null) {
            arrayList.remove(nVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b A[LOOP:1: B:13:0x0045->B:15:0x004b, LOOP_END] */
    public final void s() {
        boolean zJ;
        Iterator<BackStackState> it;
        Iterator<String> it2;
        FragmentHostCallback<?> fragmentHostCallback = this.v;
        if (!(fragmentHostCallback instanceof ViewModelStoreOwner)) {
            if (fragmentHostCallback.f() instanceof Activity) {
                zJ = !((Activity) this.v.f()).isChangingConfigurations();
            }
            it = this.j.values().iterator();
            while (it.hasNext()) {
                it2 = it.next().f2311a.iterator();
                while (it2.hasNext()) {
                    this.c.p().c(it2.next());
                }
            }
        }
        zJ = this.c.p().j();
        if (!zJ) {
            return;
        }
        it = this.j.values().iterator();
        while (it.hasNext()) {
            it2 = it.next().f2311a.iterator();
            while (it2.hasNext()) {
                this.c.p().c(it2.next());
            }
        }
    }

    public int s0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void s1(Fragment fragment) {
        this.O.k(fragment);
    }

    public final void t(String str) {
        this.f2343k.remove(str);
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing fragment result with key ");
            sb.append(str);
        }
    }

    public final androidx.fragment.app.g t0(Fragment fragment) {
        return this.O.f(fragment);
    }

    public final void t1() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2).a();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.v;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append(AbstractJsonLexerKt.NULL);
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str) {
        m mVarRemove = this.l.remove(str);
        if (mVarRemove != null) {
            mVarRemove.c();
        }
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing FragmentResultListener for key ");
            sb.append(str);
        }
    }

    public FragmentContainer u0() {
        return this.w;
    }

    public void u1(Parcelable parcelable) {
        androidx.fragment.app.h hVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.v.f().getClassLoader());
                this.f2343k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.v.f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.c.x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.c.v();
        Iterator<String> it = fragmentManagerState.f2363a.iterator();
        while (it.hasNext()) {
            FragmentState fragmentStateB = this.c.B(it.next(), null);
            if (fragmentStateB != null) {
                Fragment fragmentE = this.O.e(fragmentStateB.f2366b);
                if (fragmentE != null) {
                    if (M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragmentE);
                    }
                    hVar = new androidx.fragment.app.h(this.n, this.c, fragmentE, fragmentStateB);
                } else {
                    hVar = new androidx.fragment.app.h(this.n, this.c, this.v.f().getClassLoader(), x0(), fragmentStateB);
                }
                Fragment fragmentK = hVar.k();
                fragmentK.mFragmentManager = this;
                if (M0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(fragmentK.mWho);
                    sb2.append("): ");
                    sb2.append(fragmentK);
                }
                hVar.o(this.v.f().getClassLoader());
                this.c.r(hVar);
                hVar.u(this.u);
            }
        }
        for (Fragment fragment : this.O.h()) {
            if (!this.c.c(fragment.mWho)) {
                if (M0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.f2363a);
                }
                this.O.k(fragment);
                fragment.mFragmentManager = this;
                androidx.fragment.app.h hVar2 = new androidx.fragment.app.h(this.n, this.c, fragment);
                hVar2.u(1);
                hVar2.m();
                fragment.mRemoving = true;
                hVar2.m();
            }
        }
        this.c.w(fragmentManagerState.f2364b);
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList<>(fragmentManagerState.c.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarC = backStackRecordStateArr[i2].c(this);
                if (M0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i2);
                    sb4.append(" (index ");
                    sb4.append(aVarC.v);
                    sb4.append("): ");
                    sb4.append(aVarC);
                    PrintWriter printWriter = new PrintWriter(new kpe("FragmentManager"));
                    aVarC.J("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVarC);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.d);
        String str3 = fragmentManagerState.e;
        if (str3 != null) {
            Fragment fragmentH0 = h0(str3);
            this.y = fragmentH0;
            N(fragmentH0);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                this.j.put(arrayList2.get(i3), fragmentManagerState.g.get(i3));
            }
        }
        this.F = new ArrayDeque<>(fragmentManagerState.h);
    }

    public final Set<androidx.fragment.app.l> v() {
        HashSet hashSet = new HashSet();
        Iterator<androidx.fragment.app.h> it = this.c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.l.n(viewGroup, E0()));
            }
        }
        return hashSet;
    }

    public Fragment v0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentH0 = h0(string);
        if (fragmentH0 == null) {
            H1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentH0;
    }

    public final Set<androidx.fragment.app.l> w(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<androidx.fragment.app.k.a> it = arrayList.get(i2).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2428b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(androidx.fragment.app.l.o(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final ViewGroup w0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.w.d()) {
            View viewC = this.w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public Bundle U0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        p0();
        Z();
        c0(true);
        this.H = true;
        this.O.l(true);
        ArrayList<String> arrayListY = this.c.y();
        ArrayList<FragmentState> arrayListM = this.c.m();
        if (arrayListM.isEmpty()) {
            M0(2);
        } else {
            ArrayList<String> arrayListZ = this.c.z();
            ArrayList<androidx.fragment.app.a> arrayList = this.d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState(this.d.get(i2));
                    if (M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i2);
                        sb.append(": ");
                        sb.append(this.d.get(i2));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f2363a = arrayListY;
            fragmentManagerState.f2364b = arrayListZ;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.i.get();
            Fragment fragment = this.y;
            if (fragment != null) {
                fragmentManagerState.e = fragment.mWho;
            }
            fragmentManagerState.f.addAll(this.j.keySet());
            fragmentManagerState.g.addAll(this.j.values());
            fragmentManagerState.h = new ArrayList<>(this.F);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f2343k.keySet()) {
                bundle.putBundle("result_" + str, this.f2343k.get(str));
            }
            for (FragmentState fragmentState : arrayListM) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f2366b, bundle2);
            }
        }
        return bundle;
    }

    public androidx.fragment.app.h x(Fragment fragment) {
        androidx.fragment.app.h hVarN = this.c.n(fragment.mWho);
        if (hVarN != null) {
            return hVarN;
        }
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(this.n, this.c, fragment);
        hVar.o(this.v.f().getClassLoader());
        hVar.u(this.u);
        return hVar;
    }

    public androidx.fragment.app.d x0() {
        androidx.fragment.app.d dVar = this.z;
        if (dVar != null) {
            return dVar;
        }
        Fragment fragment = this.x;
        return fragment != null ? fragment.mFragmentManager.x0() : this.A;
    }

    public Fragment.SavedState x1(Fragment fragment) {
        androidx.fragment.app.h hVarN = this.c.n(fragment.mWho);
        if (hVarN == null || !hVarN.k().equals(fragment)) {
            H1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return hVarN.r();
    }

    public void y(Fragment fragment) {
        if (M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (M0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fragment);
            }
            this.c.u(fragment);
            if (N0(fragment)) {
                this.G = true;
            }
            E1(fragment);
        }
    }

    public List<Fragment> y0() {
        return this.c.o();
    }

    public void y1() {
        synchronized (this.f2341a) {
            try {
                if (this.f2341a.size() == 1) {
                    this.v.g().removeCallbacks(this.Q);
                    this.v.g().post(this.Q);
                    J1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        this.H = false;
        this.I = false;
        this.O.l(false);
        U(4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FragmentHostCallback<?> z0() {
        return this.v;
    }

    public void z1(Fragment fragment, boolean z) {
        ViewGroup viewGroupW0 = w0(fragment);
        if (viewGroupW0 == null || !(viewGroupW0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupW0).setDrawDisappearingViewsLast(!z);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2348b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f2347a = str;
            this.f2348b = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2347a);
            parcel.writeInt(this.f2348b);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f2347a = parcel.readString();
            this.f2348b = parcel.readInt();
        }
    }
}
