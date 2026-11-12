package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public Fragment A;
    public f.g E;
    public f.g F;
    public f.g G;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ArrayList<androidx.fragment.app.a> N;
    public ArrayList<Boolean> O;
    public ArrayList<Fragment> P;
    public y Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7371b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f7374e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.u f7376g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.fragment.app.u f7387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.fragment.app.u f7388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.fragment.app.u f7389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.u f7390u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.fragment.app.r<?> f7393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.fragment.app.o f7394y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Fragment f7395z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<q> f7370a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f7372c = new f0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f7373d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.s f7375f = new androidx.fragment.app.s(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.fragment.app.a f7377h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7378i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f7379j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f7380k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f7381l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, Bundle> f7382m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, o> f7383n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<p> f7384o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.fragment.app.t f7385p = new androidx.fragment.app.t(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList<z> f7386q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f7391v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7392w = -1;
    public androidx.fragment.app.q B = null;
    public final d C = new d();
    public final e D = new e(this);
    public ArrayDeque<n> H = new ArrayDeque<>();
    public final f R = new f();

    public class a implements f.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // f.b
        public final void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                iArr[i14] = ((Boolean) arrayList.get(i14)).booleanValue() ? 0 : -1;
            }
            v vVar = v.this;
            n nVarPollFirst = vVar.H.pollFirst();
            if (nVarPollFirst == null) {
                toString();
                return;
            }
            String str = nVarPollFirst.f7408a;
            int i15 = nVarPollFirst.f7409b;
            Fragment fragmentC = vVar.f7372c.c(str);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onRequestPermissionsResult(i15, strArr, iArr);
        }
    }

    public class b extends b.s {
        public b(boolean z14) {
            super(z14);
        }

        @Override // b.s
        public final void a() {
            boolean zR = v.R(3);
            v vVar = v.this;
            if (zR) {
                Objects.toString(vVar);
            }
            if (v.R(3)) {
                Objects.toString(vVar.f7377h);
            }
            androidx.fragment.app.a aVar = vVar.f7377h;
            if (aVar != null) {
                aVar.f7127u = false;
                aVar.r();
                vVar.f7377h.n(new a0.c(vVar, 12), true);
                vVar.f7377h.e();
                vVar.f7378i = true;
                vVar.D();
                vVar.f7378i = false;
                vVar.f7377h = null;
            }
        }

        @Override // b.s
        public final void b() {
            boolean zR = v.R(3);
            v vVar = v.this;
            if (zR) {
                Objects.toString(vVar);
            }
            b bVar = vVar.f7379j;
            ArrayList<p> arrayList = vVar.f7384o;
            vVar.f7378i = true;
            vVar.A(true);
            vVar.f7378i = false;
            if (vVar.f7377h == null) {
                if (bVar.f13818b) {
                    vVar.b0();
                    return;
                } else {
                    vVar.f7376g.d();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(v.K(vVar.f7377h));
                for (p pVar : arrayList) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        pVar.b((Fragment) it.next(), true);
                    }
                }
            }
            Iterator<g0.a> it3 = vVar.f7377h.f7235c.iterator();
            while (it3.hasNext()) {
                Fragment fragment = it3.next().f7253b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            for (q0 q0Var : vVar.g(new ArrayList(Collections.singletonList(vVar.f7377h)), 0, 1)) {
                ArrayList arrayList2 = q0Var.f7326c;
                q0Var.l(arrayList2);
                q0Var.c(arrayList2);
            }
            Iterator<g0.a> it4 = vVar.f7377h.f7235c.iterator();
            while (it4.hasNext()) {
                Fragment fragment2 = it4.next().f7253b;
                if (fragment2 != null && fragment2.mContainer == null) {
                    vVar.h(fragment2).i();
                }
            }
            vVar.f7377h = null;
            vVar.t0();
            if (v.R(3)) {
                boolean z14 = bVar.f13818b;
                vVar.toString();
            }
        }

        @Override // b.s
        public final void c(b.c cVar) {
            boolean zR = v.R(2);
            v vVar = v.this;
            if (zR) {
                Objects.toString(vVar);
            }
            if (vVar.f7377h != null) {
                for (q0 q0Var : vVar.g(new ArrayList(Collections.singletonList(vVar.f7377h)), 0, 1)) {
                    q0Var.getClass();
                    ArrayList arrayList = q0Var.f7326c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        p13.d0.v(arrayList2, ((q0.d) it.next()).f7343k);
                    }
                    List listB1 = p13.h0.b1(p13.h0.g1(arrayList2));
                    int size = listB1.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((q0.b) listB1.get(i14)).d(cVar, q0Var.f7324a);
                    }
                }
                Iterator<p> it3 = vVar.f7384o.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        }

        @Override // b.s
        public final void d(b.c cVar) {
            boolean zR = v.R(3);
            v vVar = v.this;
            if (zR) {
                Objects.toString(vVar);
            }
            vVar.x();
            vVar.getClass();
            vVar.y(vVar.new s(), false);
        }
    }

    public class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void M1(Menu menu) {
            v.this.r(menu);
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            v.this.l(menu, menuInflater);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            v.this.u(menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            return v.this.q(menuItem);
        }
    }

    public class d extends androidx.fragment.app.q {
        public d() {
        }

        @Override // androidx.fragment.app.q
        public final Fragment instantiate(ClassLoader classLoader, String str) {
            androidx.fragment.app.r<?> rVar = v.this.f7393x;
            Context context = rVar.f7358b;
            rVar.getClass();
            return Fragment.instantiate(context, str, null);
        }
    }

    public class e implements r0 {
        public e(v vVar) {
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v.this.A(true);
        }
    }

    public class g implements androidx.lifecycle.k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f7402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.b0 f7403c;

        public g(String str, b0 b0Var, androidx.lifecycle.b0 b0Var2) {
            this.f7401a = str;
            this.f7402b = b0Var;
            this.f7403c = b0Var2;
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.a aVar) {
            Bundle bundle;
            androidx.lifecycle.b0.a aVar2 = androidx.lifecycle.b0.a.ON_START;
            v vVar = v.this;
            String str = this.f7401a;
            if (aVar == aVar2 && (bundle = vVar.f7382m.get(str)) != null) {
                this.f7402b.g(bundle, str);
                vVar.f7382m.remove(str);
            }
            if (aVar == androidx.lifecycle.b0.a.ON_DESTROY) {
                this.f7403c.d(this);
                vVar.f7383n.remove(str);
            }
        }
    }

    public class h implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f7405a;

        public h(v vVar, Fragment fragment) {
            this.f7405a = fragment;
        }

        @Override // androidx.fragment.app.z
        public final void a(v vVar, Fragment fragment) {
            this.f7405a.onAttachFragment(fragment);
        }
    }

    public class i implements f.b<f.a> {
        public i() {
        }

        @Override // f.b
        public final void a(f.a aVar) {
            f.a aVar2 = aVar;
            v vVar = v.this;
            n nVarPollLast = vVar.H.pollLast();
            if (nVarPollLast == null) {
                toString();
                return;
            }
            String str = nVarPollLast.f7408a;
            int i14 = nVarPollLast.f7409b;
            Fragment fragmentC = vVar.f7372c.c(str);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(i14, aVar2.f67585a, aVar2.f67586b);
        }
    }

    public class j implements f.b<f.a> {
        public j() {
        }

        @Override // f.b
        public final void a(f.a aVar) {
            f.a aVar2 = aVar;
            v vVar = v.this;
            n nVarPollFirst = vVar.H.pollFirst();
            if (nVarPollFirst == null) {
                toString();
                return;
            }
            String str = nVarPollFirst.f7408a;
            int i14 = nVarPollFirst.f7409b;
            Fragment fragmentC = vVar.f7372c.c(str);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(i14, aVar2.f67585a, aVar2.f67586b);
        }
    }

    public interface k {
        String getName();
    }

    public static class l extends g.a<f.i, f.a> {
        @Override // g.a
        public final Intent a(Context context, f.i iVar) {
            Bundle bundleExtra;
            f.i iVarA = iVar;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = iVarA.f67610b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    f.i.a aVar = new f.i.a(iVarA.f67609a);
                    aVar.f67614b = null;
                    int i14 = iVarA.f67612d;
                    int i15 = iVarA.f67611c;
                    aVar.f67616d = i14;
                    aVar.f67615c = i15;
                    iVarA = aVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVarA);
            if (v.R(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // g.a
        public final f.a c(int i14, Intent intent) {
            return new f.a(i14, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void onFragmentActivityCreated(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(v vVar, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(v vVar, Fragment fragment) {
        }

        public void onFragmentDetached(v vVar, Fragment fragment) {
        }

        public void onFragmentPaused(v vVar, Fragment fragment) {
        }

        public void onFragmentPreAttached(v vVar, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(v vVar, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(v vVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(v vVar, Fragment fragment) {
        }

        public void onFragmentStopped(v vVar, Fragment fragment) {
        }

        public void onFragmentViewCreated(v vVar, Fragment fragment, View view2, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(v vVar, Fragment fragment) {
        }
    }

    public static class o implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.b0 f7410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f7411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.lifecycle.k0 f7412c;

        public o(androidx.lifecycle.b0 b0Var, b0 b0Var2, androidx.lifecycle.k0 k0Var) {
            this.f7410a = b0Var;
            this.f7411b = b0Var2;
            this.f7412c = k0Var;
        }

        @Override // androidx.fragment.app.b0
        public final void g(Bundle bundle, String str) {
            this.f7411b.g(bundle, str);
        }
    }

    public interface p {
        default void a(Fragment fragment, boolean z14) {
        }

        default void b(Fragment fragment, boolean z14) {
        }

        void onBackStackChanged();
    }

    public interface q {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class r implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7415c;

        public r(String str, int i14, int i15) {
            this.f7413a = str;
            this.f7414b = i14;
            this.f7415c = i15;
        }

        @Override // androidx.fragment.app.v.q
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = v.this.A;
            if (fragment != null && this.f7414b < 0 && this.f7413a == null && fragment.getChildFragmentManager().b0()) {
                return false;
            }
            return v.this.d0(arrayList, arrayList2, this.f7413a, this.f7414b, this.f7415c);
        }
    }

    public class s implements q {
        public s() {
        }

        @Override // androidx.fragment.app.v.q
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            ArrayList<androidx.fragment.app.a> arrayList3;
            ArrayList<Boolean> arrayList4;
            boolean zD0;
            boolean zR = v.R(2);
            v vVar = v.this;
            if (zR) {
                Objects.toString(vVar.f7370a);
            }
            ArrayList<androidx.fragment.app.a> arrayList5 = vVar.f7373d;
            ArrayList<p> arrayList6 = vVar.f7384o;
            if (arrayList5.isEmpty()) {
                zD0 = false;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
            } else {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) am.j.f(1, vVar.f7373d);
                vVar.f7377h = aVar;
                Iterator<g0.a> it = aVar.f7235c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f7253b;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zD0 = vVar.d0(arrayList3, arrayList4, null, -1, 0);
            }
            if (!arrayList6.isEmpty() && arrayList3.size() > 0) {
                boolean zBooleanValue = arrayList4.get(arrayList3.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.addAll(v.K(it3.next()));
                }
                for (p pVar : arrayList6) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        pVar.a((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
            return zD0;
        }
    }

    public class t implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7418a;

        public t(String str) {
            this.f7418a = str;
        }

        @Override // androidx.fragment.app.v.q
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            v vVar = v.this;
            androidx.fragment.app.c cVarRemove = vVar.f7381l.remove(this.f7418a);
            boolean z14 = false;
            if (cVarRemove == null) {
                return false;
            }
            HashMap map = new HashMap();
            for (androidx.fragment.app.a aVar : arrayList) {
                if (aVar.f7129w) {
                    Iterator<g0.a> it = aVar.f7235c.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().f7253b;
                        if (fragment != null) {
                            map.put(fragment.mWho, fragment);
                        }
                    }
                }
            }
            List<String> list = cVarRemove.f7144a;
            HashMap map2 = new HashMap(list.size());
            for (String str : list) {
                Fragment fragment2 = (Fragment) map.get(str);
                if (fragment2 != null) {
                    map2.put(fragment2.mWho, fragment2);
                } else {
                    Bundle bundleI = vVar.f7372c.i(null, str);
                    if (bundleI != null) {
                        ClassLoader classLoader = vVar.f7393x.f7358b.getClassLoader();
                        Fragment fragmentB = ((c0) bundleI.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).b(vVar.P(), classLoader);
                        fragmentB.mSavedFragmentState = bundleI;
                        if (bundleI.getBundle("savedInstanceState") == null) {
                            fragmentB.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle = bundleI.getBundle("arguments");
                        if (bundle != null) {
                            bundle.setClassLoader(classLoader);
                        }
                        fragmentB.setArguments(bundle);
                        map2.put(fragmentB.mWho, fragmentB);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (androidx.fragment.app.b bVar : cVarRemove.f7145b) {
                ArrayList<String> arrayList4 = bVar.f7131b;
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
                bVar.b(aVar2);
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    String str2 = arrayList4.get(i14);
                    if (str2 != null) {
                        Fragment fragment3 = (Fragment) map2.get(str2);
                        if (fragment3 == null) {
                            vb.h.z(e5.h(new StringBuilder("Restoring FragmentTransaction "), bVar.f7135f, " failed due to missing saved state for Fragment (", str2, ")"));
                            return false;
                        }
                        aVar2.f7235c.get(i14).f7253b = fragment3;
                    }
                }
                arrayList3.add(aVar2);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((androidx.fragment.app.a) it3.next()).a(arrayList, arrayList2);
                z14 = true;
            }
            return z14;
        }
    }

    public class u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7420a;

        public u(String str) {
            this.f7420a = str;
        }

        @Override // androidx.fragment.app.v.q
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Throwable {
            int i14;
            v vVar = v.this;
            String str = this.f7420a;
            int iE = vVar.E(-1, str, true);
            if (iE < 0) {
                return false;
            }
            int i15 = iE;
            while (true) {
                Throwable th3 = null;
                if (i15 >= vVar.f7373d.size()) {
                    HashSet hashSet = new HashSet();
                    int i16 = iE;
                    while (i16 < vVar.f7373d.size()) {
                        androidx.fragment.app.a aVar = vVar.f7373d.get(i16);
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        for (g0.a aVar2 : aVar.f7235c) {
                            Fragment fragment = aVar2.f7253b;
                            if (fragment != null) {
                                Throwable th4 = th3;
                                if (!aVar2.f7254c || (i14 = aVar2.f7252a) == 1 || i14 == 2 || i14 == 8) {
                                    hashSet.add(fragment);
                                    hashSet2.add(fragment);
                                }
                                int i17 = aVar2.f7252a;
                                if (i17 == 1 || i17 == 2) {
                                    hashSet3.add(fragment);
                                }
                                th3 = th4;
                            }
                        }
                        Throwable th5 = th3;
                        hashSet2.removeAll(hashSet3);
                        if (!hashSet2.isEmpty()) {
                            StringBuilder sbL = hb.a.l("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                            sbL.append(hashSet2.size() == 1 ? StringUtils.SPACE + hashSet2.iterator().next() : "s " + hashSet2);
                            sbL.append(" in ");
                            sbL.append(aVar);
                            sbL.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                            vVar.r0(new IllegalArgumentException(sbL.toString()));
                            throw th5;
                        }
                        i16++;
                        th3 = th5;
                    }
                    Throwable th6 = th3;
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                        if (fragment2.mRetainInstance) {
                            StringBuilder sbL2 = hb.a.l("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbL2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                            sbL2.append("fragment ");
                            sbL2.append(fragment2);
                            vVar.r0(new IllegalArgumentException(sbL2.toString()));
                            throw th6;
                        }
                        for (Fragment fragment3 : fragment2.mChildFragmentManager.f7372c.e()) {
                            if (fragment3 != null) {
                                arrayDeque.addLast(fragment3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((Fragment) it.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(vVar.f7373d.size() - iE);
                    for (int i18 = iE; i18 < vVar.f7373d.size(); i18++) {
                        arrayList4.add(th6);
                    }
                    androidx.fragment.app.c cVar = new androidx.fragment.app.c(arrayList3, arrayList4);
                    for (int size = vVar.f7373d.size() - 1; size >= iE; size--) {
                        androidx.fragment.app.a aVarRemove = vVar.f7373d.remove(size);
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(aVarRemove);
                        aVar3.r();
                        arrayList4.set(size - iE, new androidx.fragment.app.b(aVar3));
                        aVarRemove.f7129w = true;
                        arrayList.add(aVarRemove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    vVar.f7381l.put(str, cVar);
                    return true;
                }
                androidx.fragment.app.a aVar4 = vVar.f7373d.get(i15);
                if (!aVar4.f7250r) {
                    vVar.r0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar4 + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
                i15++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.fragment.app.u] */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.fragment.app.u] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.fragment.app.u] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.fragment.app.u] */
    public v() {
        final int i14 = 0;
        this.f7387r = new k7.b(this) { // from class: androidx.fragment.app.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7369b;

            {
                this.f7369b = this;
            }

            @Override // k7.b
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        v vVar = this.f7369b;
                        if (vVar.T()) {
                            vVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        v vVar2 = this.f7369b;
                        if (vVar2.T() && num.intValue() == 80) {
                            vVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        z6.h hVar = (z6.h) obj;
                        v vVar3 = this.f7369b;
                        if (vVar3.T()) {
                            vVar3.o(hVar.f202636a, false);
                        }
                        break;
                    default:
                        z6.e0 e0Var = (z6.e0) obj;
                        v vVar4 = this.f7369b;
                        if (vVar4.T()) {
                            vVar4.t(e0Var.f202612a, false);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f7388s = new k7.b(this) { // from class: androidx.fragment.app.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7369b;

            {
                this.f7369b = this;
            }

            @Override // k7.b
            public final void accept(Object obj) {
                switch (i15) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        v vVar = this.f7369b;
                        if (vVar.T()) {
                            vVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        v vVar2 = this.f7369b;
                        if (vVar2.T() && num.intValue() == 80) {
                            vVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        z6.h hVar = (z6.h) obj;
                        v vVar3 = this.f7369b;
                        if (vVar3.T()) {
                            vVar3.o(hVar.f202636a, false);
                        }
                        break;
                    default:
                        z6.e0 e0Var = (z6.e0) obj;
                        v vVar4 = this.f7369b;
                        if (vVar4.T()) {
                            vVar4.t(e0Var.f202612a, false);
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f7389t = new k7.b(this) { // from class: androidx.fragment.app.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7369b;

            {
                this.f7369b = this;
            }

            @Override // k7.b
            public final void accept(Object obj) {
                switch (i16) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        v vVar = this.f7369b;
                        if (vVar.T()) {
                            vVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        v vVar2 = this.f7369b;
                        if (vVar2.T() && num.intValue() == 80) {
                            vVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        z6.h hVar = (z6.h) obj;
                        v vVar3 = this.f7369b;
                        if (vVar3.T()) {
                            vVar3.o(hVar.f202636a, false);
                        }
                        break;
                    default:
                        z6.e0 e0Var = (z6.e0) obj;
                        v vVar4 = this.f7369b;
                        if (vVar4.T()) {
                            vVar4.t(e0Var.f202612a, false);
                        }
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f7390u = new k7.b(this) { // from class: androidx.fragment.app.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7369b;

            {
                this.f7369b = this;
            }

            @Override // k7.b
            public final void accept(Object obj) {
                switch (i17) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        v vVar = this.f7369b;
                        if (vVar.T()) {
                            vVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        v vVar2 = this.f7369b;
                        if (vVar2.T() && num.intValue() == 80) {
                            vVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        z6.h hVar = (z6.h) obj;
                        v vVar3 = this.f7369b;
                        if (vVar3.T()) {
                            vVar3.o(hVar.f202636a, false);
                        }
                        break;
                    default:
                        z6.e0 e0Var = (z6.e0) obj;
                        v vVar4 = this.f7369b;
                        if (vVar4.T()) {
                            vVar4.t(e0Var.f202612a, false);
                        }
                        break;
                }
            }
        };
    }

    public static v H(View view2) {
        androidx.fragment.app.m mVar;
        Fragment fragmentI = I(view2);
        if (fragmentI != null) {
            if (fragmentI.isAdded()) {
                return fragmentI.getChildFragmentManager();
            }
            androidx.core.view.j.w(fragmentI, " that owns View ", view2, " has already been destroyed. Nested fragments should always use the child FragmentManager.", "The Fragment ");
            return null;
        }
        Context context = view2.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                mVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.m) {
                mVar = (androidx.fragment.app.m) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (mVar != null) {
            return mVar.getSupportFragmentManager();
        }
        kg.f.o("View ", view2, " is not within a subclass of FragmentActivity.");
        return null;
    }

    public static Fragment I(View view2) {
        while (view2 != null) {
            Object tag = view2.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet K(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i14 = 0; i14 < aVar.f7235c.size(); i14++) {
            Fragment fragment = aVar.f7235c.get(i14).f7253b;
            if (fragment != null && aVar.f7241i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean R(int i14) {
        return Log.isLoggable("FragmentManager", i14);
    }

    public static boolean S(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zS = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f7372c.e()) {
            if (fragment2 != null) {
                zS = S(fragment2);
            }
            if (zS) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        v vVar = fragment.mFragmentManager;
        return fragment.equals(vVar.A) && U(vVar.f7395z);
    }

    public final boolean A(boolean z14) {
        boolean zA;
        ArrayList<q> arrayList;
        androidx.fragment.app.a aVar;
        z(z14);
        if (!this.f7378i && (aVar = this.f7377h) != null) {
            aVar.f7127u = false;
            aVar.r();
            if (R(3)) {
                Objects.toString(this.f7377h);
                Objects.toString(this.f7370a);
            }
            this.f7377h.s(false, false);
            this.f7370a.add(0, this.f7377h);
            Iterator<g0.a> it = this.f7377h.f7235c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f7253b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f7377h = null;
        }
        boolean z15 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList2 = this.N;
            ArrayList<Boolean> arrayList3 = this.O;
            synchronized (this.f7370a) {
                if (this.f7370a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f7370a.size();
                        int i14 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.f7370a;
                            if (i14 >= size) {
                                break;
                            }
                            zA |= arrayList.get(i14).a(arrayList2, arrayList3);
                            i14++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f7393x.f7359c.removeCallbacks(this.R);
                    } catch (Throwable th3) {
                        this.f7370a.clear();
                        this.f7393x.f7359c.removeCallbacks(this.R);
                        throw th3;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f7371b = true;
            try {
                g0(this.N, this.O);
                e();
                z15 = true;
            } catch (Throwable th4) {
                e();
                throw th4;
            }
        }
        t0();
        if (this.M) {
            this.M = false;
            for (d0 d0Var : this.f7372c.d()) {
                Fragment fragment2 = d0Var.f7166c;
                if (fragment2.mDeferStart) {
                    if (this.f7371b) {
                        this.M = true;
                    } else {
                        fragment2.mDeferStart = false;
                        d0Var.i();
                    }
                }
            }
        }
        this.f7372c.f7227b.values().removeAll(Collections.singleton(null));
        return z15;
    }

    public final void B(androidx.fragment.app.a aVar, boolean z14) {
        if (z14 && (this.f7393x == null || this.L)) {
            return;
        }
        z(z14);
        androidx.fragment.app.a aVar2 = this.f7377h;
        if (aVar2 != null) {
            aVar2.f7127u = false;
            aVar2.r();
            if (R(3)) {
                Objects.toString(this.f7377h);
                Objects.toString(aVar);
            }
            this.f7377h.s(false, false);
            this.f7377h.a(this.N, this.O);
            Iterator<g0.a> it = this.f7377h.f7235c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f7253b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f7377h = null;
        }
        aVar.a(this.N, this.O);
        this.f7371b = true;
        try {
            g0(this.N, this.O);
            e();
            t0();
            boolean z15 = this.M;
            f0 f0Var = this.f7372c;
            if (z15) {
                this.M = false;
                for (d0 d0Var : f0Var.d()) {
                    Fragment fragment2 = d0Var.f7166c;
                    if (fragment2.mDeferStart) {
                        if (this.f7371b) {
                            this.M = true;
                        } else {
                            fragment2.mDeferStart = false;
                            d0Var.i();
                        }
                    }
                }
            }
            f0Var.f7227b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th3) {
            e();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0233 A[PHI: r15
      0x0233: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:105:0x0220, B:109:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v40 */
    public final void C(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i14, int i15) {
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        ?? r14;
        int i18 = i14;
        boolean z16 = arrayList.get(i18).f7250r;
        ArrayList<Fragment> arrayList3 = this.P;
        if (arrayList3 == null) {
            this.P = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<Fragment> arrayList4 = this.P;
        f0 f0Var = this.f7372c;
        arrayList4.addAll(f0Var.f());
        Fragment fragment = this.A;
        int i19 = i18;
        boolean z17 = false;
        while (true) {
            int i24 = 1;
            if (i19 >= i15) {
                boolean z18 = z16;
                boolean z19 = z17;
                this.P.clear();
                if (!z18 && this.f7392w >= 1) {
                    for (int i25 = i18; i25 < i15; i25++) {
                        Iterator<g0.a> it = arrayList.get(i25).f7235c.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f7253b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                f0Var.g(h(fragment2));
                            }
                        }
                    }
                }
                int i26 = i18;
                while (i26 < i15) {
                    androidx.fragment.app.a aVar = arrayList.get(i26);
                    if (!arrayList2.get(i26).booleanValue()) {
                        aVar.q(1);
                        v vVar = aVar.f7126t;
                        ArrayList<g0.a> arrayList5 = aVar.f7235c;
                        int size = arrayList5.size();
                        int i27 = 0;
                        while (i27 < size) {
                            g0.a aVar2 = arrayList5.get(i27);
                            Fragment fragment3 = aVar2.f7253b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = aVar.f7129w;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(aVar.f7240h);
                                fragment3.setSharedElementNames(aVar.f7248p, aVar.f7249q);
                            }
                            switch (aVar2.f7252a) {
                                case 1:
                                    i16 = i26;
                                    fragment3.setAnimations(aVar2.f7255d, aVar2.f7256e, aVar2.f7257f, aVar2.f7258g);
                                    vVar.l0(fragment3, false);
                                    vVar.a(fragment3);
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 2:
                                default:
                                    sn.a.z(aVar2.f7252a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    i16 = i26;
                                    fragment3.setAnimations(aVar2.f7255d, aVar2.f7256e, aVar2.f7257f, aVar2.f7258g);
                                    vVar.f0(fragment3);
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 4:
                                    i16 = i26;
                                    fragment3.setAnimations(aVar2.f7255d, aVar2.f7256e, aVar2.f7257f, aVar2.f7258g);
                                    vVar.getClass();
                                    if (R(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        vVar.q0(fragment3);
                                    }
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 5:
                                    i16 = i26;
                                    fragment3.setAnimations(aVar2.f7255d, aVar2.f7256e, aVar2.f7257f, aVar2.f7258g);
                                    vVar.l0(fragment3, false);
                                    if (R(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 6:
                                    i16 = i26;
                                    fragment3.setAnimations(aVar2.f7255d, aVar2.f7256e, aVar2.f7257f, aVar2.f7258g);
                                    vVar.i(fragment3);
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 7:
                                    i16 = i26;
                                    fragment3.setAnimations(aVar2.f7255d, aVar2.f7256e, aVar2.f7257f, aVar2.f7258g);
                                    vVar.l0(fragment3, false);
                                    vVar.d(fragment3);
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 8:
                                    vVar.p0(fragment3);
                                    i16 = i26;
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 9:
                                    vVar.p0(null);
                                    i16 = i26;
                                    i27++;
                                    i26 = i16;
                                    break;
                                case 10:
                                    aVar2.f7259h = fragment3.mMaxState;
                                    vVar.o0(fragment3, aVar2.f7260i);
                                    i16 = i26;
                                    i27++;
                                    i26 = i16;
                                    break;
                            }
                            return;
                        }
                    }
                    aVar.q(-1);
                    v vVar2 = aVar.f7126t;
                    ArrayList<g0.a> arrayList6 = aVar.f7235c;
                    boolean z24 = true;
                    for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                        g0.a aVar3 = arrayList6.get(size2);
                        Fragment fragment4 = aVar3.f7253b;
                        if (fragment4 != null) {
                            fragment4.mBeingSaved = aVar.f7129w;
                            fragment4.setPopDirection(z24);
                            int i28 = aVar.f7240h;
                            int i29 = 8194;
                            int i30 = 4097;
                            if (i28 != 4097) {
                                if (i28 != 8194) {
                                    i29 = 4100;
                                    if (i28 != 8197) {
                                        i30 = 4099;
                                        if (i28 != 4099) {
                                            i29 = i28 != 4100 ? 0 : 8197;
                                        } else {
                                            i29 = i30;
                                        }
                                    }
                                } else {
                                    i29 = i30;
                                }
                            }
                            fragment4.setNextTransition(i29);
                            fragment4.setSharedElementNames(aVar.f7249q, aVar.f7248p);
                        }
                        switch (aVar3.f7252a) {
                            case 1:
                                fragment4.setAnimations(aVar3.f7255d, aVar3.f7256e, aVar3.f7257f, aVar3.f7258g);
                                z24 = true;
                                vVar2.l0(fragment4, true);
                                vVar2.f0(fragment4);
                                break;
                            case 2:
                            default:
                                sn.a.z(aVar3.f7252a, "Unknown cmd: ");
                                break;
                            case 3:
                                fragment4.setAnimations(aVar3.f7255d, aVar3.f7256e, aVar3.f7257f, aVar3.f7258g);
                                vVar2.a(fragment4);
                                z24 = true;
                                break;
                            case 4:
                                fragment4.setAnimations(aVar3.f7255d, aVar3.f7256e, aVar3.f7257f, aVar3.f7258g);
                                vVar2.getClass();
                                if (R(2)) {
                                    Objects.toString(fragment4);
                                }
                                if (fragment4.mHidden) {
                                    fragment4.mHidden = false;
                                    fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                }
                                z24 = true;
                                break;
                            case 5:
                                fragment4.setAnimations(aVar3.f7255d, aVar3.f7256e, aVar3.f7257f, aVar3.f7258g);
                                vVar2.l0(fragment4, true);
                                if (R(2)) {
                                    Objects.toString(fragment4);
                                }
                                if (!fragment4.mHidden) {
                                    fragment4.mHidden = true;
                                    fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    vVar2.q0(fragment4);
                                }
                                z24 = true;
                                break;
                            case 6:
                                fragment4.setAnimations(aVar3.f7255d, aVar3.f7256e, aVar3.f7257f, aVar3.f7258g);
                                vVar2.d(fragment4);
                                z24 = true;
                                break;
                            case 7:
                                fragment4.setAnimations(aVar3.f7255d, aVar3.f7256e, aVar3.f7257f, aVar3.f7258g);
                                vVar2.l0(fragment4, true);
                                vVar2.i(fragment4);
                                z24 = true;
                                break;
                            case 8:
                                vVar2.p0(null);
                                z24 = true;
                                break;
                            case 9:
                                vVar2.p0(fragment4);
                                z24 = true;
                                break;
                            case 10:
                                aVar3.f7260i = fragment4.mMaxState;
                                vVar2.o0(fragment4, aVar3.f7259h);
                                z24 = true;
                                break;
                        }
                        return;
                    }
                    i26++;
                }
                boolean zBooleanValue = arrayList2.get(i15 - 1).booleanValue();
                ArrayList<p> arrayList7 = this.f7384o;
                if (z19 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<androidx.fragment.app.a> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.addAll(K(it3.next()));
                    }
                    if (this.f7377h == null) {
                        for (p pVar : arrayList7) {
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                pVar.a((Fragment) it4.next(), zBooleanValue);
                            }
                        }
                        for (p pVar2 : arrayList7) {
                            Iterator it5 = linkedHashSet.iterator();
                            while (it5.hasNext()) {
                                pVar2.b((Fragment) it5.next(), zBooleanValue);
                            }
                        }
                    }
                }
                for (int i34 = i18; i34 < i15; i34++) {
                    androidx.fragment.app.a aVar4 = arrayList.get(i34);
                    if (zBooleanValue) {
                        for (int size3 = aVar4.f7235c.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = aVar4.f7235c.get(size3).f7253b;
                            if (fragment5 != null) {
                                h(fragment5).i();
                            }
                        }
                    } else {
                        Iterator<g0.a> it6 = aVar4.f7235c.iterator();
                        while (it6.hasNext()) {
                            Fragment fragment6 = it6.next().f7253b;
                            if (fragment6 != null) {
                                h(fragment6).i();
                            }
                        }
                    }
                }
                W(this.f7392w, true);
                for (q0 q0Var : g(arrayList, i18, i15)) {
                    q0Var.f7328e = zBooleanValue;
                    q0Var.k();
                    q0Var.e();
                }
                while (i18 < i15) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i18);
                    if (arrayList2.get(i18).booleanValue() && aVar5.f7128v >= 0) {
                        aVar5.f7128v = -1;
                    }
                    if (aVar5.f7251s != null) {
                        for (int i35 = 0; i35 < aVar5.f7251s.size(); i35++) {
                            aVar5.f7251s.get(i35).run();
                        }
                        aVar5.f7251s = null;
                    }
                    i18++;
                }
                if (z19) {
                    for (int i36 = 0; i36 < arrayList7.size(); i36++) {
                        arrayList7.get(i36).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.a aVar6 = arrayList.get(i19);
            boolean zBooleanValue2 = arrayList2.get(i19).booleanValue();
            ArrayList<Fragment> arrayList8 = this.P;
            if (zBooleanValue2) {
                z14 = z16;
                i17 = i19;
                z15 = z17;
                ArrayList<g0.a> arrayList9 = aVar6.f7235c;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    g0.a aVar7 = arrayList9.get(size4);
                    int i37 = aVar7.f7252a;
                    if (i37 != i24) {
                        if (i37 != 3) {
                            switch (i37) {
                                case 6:
                                    arrayList8.add(aVar7.f7253b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar7.f7253b;
                                    break;
                                case 10:
                                    aVar7.f7260i = aVar7.f7259h;
                                    break;
                            }
                        } else {
                            arrayList8.add(aVar7.f7253b);
                        }
                        size4--;
                        i24 = 1;
                    }
                    arrayList8.remove(aVar7.f7253b);
                    size4--;
                    i24 = 1;
                }
            } else {
                ArrayList<g0.a> arrayList10 = aVar6.f7235c;
                int i38 = 0;
                while (i38 < arrayList10.size()) {
                    g0.a aVar8 = arrayList10.get(i38);
                    boolean z25 = z16;
                    int i39 = aVar8.f7252a;
                    if (i39 != i24) {
                        if (i39 == 2) {
                            i19 = i19;
                            Fragment fragment7 = aVar8.f7253b;
                            int i44 = fragment7.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            fragment = fragment;
                            boolean z26 = false;
                            while (size5 >= 0) {
                                boolean z27 = z17;
                                Fragment fragment8 = arrayList8.get(size5);
                                int i45 = size5;
                                if (fragment8.mContainerId != i44) {
                                    i44 = i44;
                                } else if (fragment8 == fragment7) {
                                    i44 = i44;
                                    z26 = true;
                                } else {
                                    if (fragment8 == fragment) {
                                        r14 = 1;
                                        arrayList10.add(i38, new g0.a(9, fragment8, true));
                                        i38++;
                                        fragment = null;
                                    } else {
                                        r14 = 1;
                                    }
                                    g0.a aVar9 = new g0.a(3, fragment8, (boolean) r14);
                                    aVar9.f7255d = aVar8.f7255d;
                                    aVar9.f7257f = aVar8.f7257f;
                                    aVar9.f7256e = aVar8.f7256e;
                                    aVar9.f7258g = aVar8.f7258g;
                                    arrayList10.add(i38, aVar9);
                                    arrayList8.remove(fragment8);
                                    i38 += r14;
                                    fragment = fragment;
                                }
                                size5 = i45 - 1;
                                i44 = i44;
                                z17 = z27;
                            }
                            z17 = z17;
                            i24 = 1;
                            if (z26) {
                                arrayList10.remove(i38);
                                i38--;
                            } else {
                                aVar8.f7252a = 1;
                                aVar8.f7254c = true;
                                arrayList8.add(fragment7);
                            }
                        } else if (i39 == 3 || i39 == 6) {
                            i19 = i19;
                            arrayList8.remove(aVar8.f7253b);
                            Fragment fragment9 = aVar8.f7253b;
                            if (fragment9 == fragment) {
                                arrayList10.add(i38, new g0.a(9, fragment9));
                                i38++;
                                fragment = null;
                                i24 = 1;
                            } else {
                                i24 = 1;
                                fragment = fragment;
                            }
                        } else if (i39 == 7) {
                            i24 = 1;
                        } else if (i39 != 8) {
                            i19 = i19;
                            i24 = 1;
                            fragment = fragment;
                        } else {
                            i19 = i19;
                            arrayList10.add(i38, new g0.a(9, fragment, true));
                            aVar8.f7254c = true;
                            i38++;
                            fragment = aVar8.f7253b;
                            i24 = 1;
                        }
                        i38 += i24;
                        z16 = z25;
                        i19 = i19;
                        z17 = z17;
                    }
                    arrayList8.add(aVar8.f7253b);
                    fragment = fragment;
                    i38 += i24;
                    z16 = z25;
                    i19 = i19;
                    z17 = z17;
                }
                z14 = z16;
                i17 = i19;
                z15 = z17;
            }
            z17 = z15 || aVar6.f7241i;
            i19 = i17 + 1;
            z16 = z14;
        }
    }

    public final void D() {
        A(true);
        J();
    }

    public final int E(int i14, String str, boolean z14) {
        if (this.f7373d.isEmpty()) {
            return -1;
        }
        if (str == null && i14 < 0) {
            if (z14) {
                return 0;
            }
            return this.f7373d.size() - 1;
        }
        int size = this.f7373d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f7373d.get(size);
            if ((str != null && str.equals(aVar.f7243k)) || (i14 >= 0 && i14 == aVar.f7128v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z14) {
            if (size == this.f7373d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f7373d.get(size - 1);
            if ((str == null || !str.equals(aVar2.f7243k)) && (i14 < 0 || i14 != aVar2.f7128v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment F(int i14) {
        f0 f0Var = this.f7372c;
        ArrayList<Fragment> arrayList = f0Var.f7226a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i14) {
                return fragment;
            }
        }
        for (d0 d0Var : f0Var.f7227b.values()) {
            if (d0Var != null) {
                Fragment fragment2 = d0Var.f7166c;
                if (fragment2.mFragmentId == i14) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment G(String str) {
        f0 f0Var = this.f7372c;
        ArrayList<Fragment> arrayList = f0Var.f7226a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (d0 d0Var : f0Var.f7227b.values()) {
            if (d0Var != null) {
                Fragment fragment2 = d0Var.f7166c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void J() {
        for (q0 q0Var : f()) {
            if (q0Var.f7329f) {
                q0Var.f7329f = false;
                q0Var.e();
            }
        }
    }

    public final k L(int i14) {
        if (i14 != this.f7373d.size()) {
            return this.f7373d.get(i14);
        }
        androidx.fragment.app.a aVar = this.f7377h;
        if (aVar != null) {
            return aVar;
        }
        o2.c.q();
        return null;
    }

    public final int M() {
        return this.f7373d.size() + (this.f7377h != null ? 1 : 0);
    }

    public final Fragment N(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.f7372c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        r0(new IllegalStateException(androidx.room.a0.j("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup O(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f7394y.c()) {
            return null;
        }
        View viewB = this.f7394y.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final androidx.fragment.app.q P() {
        androidx.fragment.app.q qVar = this.B;
        if (qVar != null) {
            return qVar;
        }
        Fragment fragment = this.f7395z;
        return fragment != null ? fragment.mFragmentManager.P() : this.C;
    }

    public final r0 Q() {
        Fragment fragment = this.f7395z;
        return fragment != null ? fragment.mFragmentManager.Q() : this.D;
    }

    public final boolean T() {
        Fragment fragment = this.f7395z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f7395z.getParentFragmentManager().T();
    }

    public final boolean V() {
        return this.J || this.K;
    }

    public final void W(int i14, boolean z14) {
        androidx.fragment.app.r<?> rVar;
        if (this.f7393x == null && i14 != -1) {
            vb.h.z("No activity");
            return;
        }
        if (z14 || i14 != this.f7392w) {
            this.f7392w = i14;
            f0 f0Var = this.f7372c;
            HashMap<String, d0> map = f0Var.f7227b;
            Iterator<Fragment> it = f0Var.f7226a.iterator();
            while (it.hasNext()) {
                d0 d0Var = map.get(it.next().mWho);
                if (d0Var != null) {
                    d0Var.i();
                }
            }
            for (d0 d0Var2 : map.values()) {
                if (d0Var2 != null) {
                    d0Var2.i();
                    Fragment fragment = d0Var2.f7166c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !f0Var.f7228c.containsKey(fragment.mWho)) {
                            f0Var.i(d0Var2.l(), fragment.mWho);
                        }
                        f0Var.h(d0Var2);
                    }
                }
            }
            for (d0 d0Var3 : f0Var.d()) {
                Fragment fragment2 = d0Var3.f7166c;
                if (fragment2.mDeferStart) {
                    if (this.f7371b) {
                        this.M = true;
                    } else {
                        fragment2.mDeferStart = false;
                        d0Var3.i();
                    }
                }
            }
            if (this.I && (rVar = this.f7393x) != null && this.f7392w == 7) {
                rVar.h();
                this.I = false;
            }
        }
    }

    public final void X() {
        if (this.f7393x == null) {
            return;
        }
        this.J = false;
        this.K = false;
        this.Q.f7436f = false;
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void Y(FragmentContainerView fragmentContainerView) {
        View view2;
        for (d0 d0Var : this.f7372c.d()) {
            Fragment fragment = d0Var.f7166c;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view2 = fragment.mView) != null && view2.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                d0Var.a();
                d0Var.i();
            }
        }
    }

    public final void Z() {
        y(new r(null, -1, 0), false);
    }

    public final d0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            f8.a.d(fragment, str);
        }
        if (R(2)) {
            fragment.toString();
        }
        d0 d0VarH = h(fragment);
        fragment.mFragmentManager = this;
        f0 f0Var = this.f7372c;
        f0Var.g(d0VarH);
        if (!fragment.mDetached) {
            f0Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (S(fragment)) {
                this.I = true;
            }
        }
        return d0VarH;
    }

    public final void a0(int i14, String str) {
        y(new r(str, -1, i14), false);
    }

    public final void b(p pVar) {
        this.f7384o.add(pVar);
    }

    public final boolean b0() {
        return c0(-1, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(androidx.fragment.app.r<?> rVar, androidx.fragment.app.o oVar, Fragment fragment) {
        String strO;
        androidx.lifecycle.n0 n0Var;
        if (this.f7393x != null) {
            vb.h.z("Already attached");
            return;
        }
        this.f7393x = rVar;
        this.f7394y = oVar;
        this.f7395z = fragment;
        CopyOnWriteArrayList<z> copyOnWriteArrayList = this.f7386q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new h(this, fragment));
        } else if (rVar instanceof z) {
            copyOnWriteArrayList.add((z) rVar);
        }
        if (this.f7395z != null) {
            t0();
        }
        if (rVar instanceof b.w) {
            b.w wVar = (b.w) rVar;
            b.u onBackPressedDispatcher = wVar.getOnBackPressedDispatcher();
            this.f7376g = onBackPressedDispatcher;
            if (fragment != null) {
                n0Var = wVar;
                n0Var = fragment;
            }
            n0Var = wVar;
            onBackPressedDispatcher.b(this.f7379j, n0Var);
        }
        if (fragment != null) {
            y yVar = fragment.mFragmentManager.Q;
            HashMap<String, y> map = yVar.f7432b;
            y yVar2 = map.get(fragment.mWho);
            if (yVar2 == null) {
                yVar2 = new y(yVar.f7434d);
                map.put(fragment.mWho, yVar2);
            }
            this.Q = yVar2;
        } else if (rVar instanceof ViewModelStoreOwner) {
            y1 viewModelStore = ((ViewModelStoreOwner) rVar).getViewModelStore();
            y.a aVar = y.f7430g;
            this.Q = (y) new x1(viewModelStore, y.f7430g).b(p005kotlin.jvm.internal.s0.f105811a.b(y.class));
        } else {
            this.Q = new y(false);
        }
        this.Q.f7436f = V();
        this.f7372c.f7229d = this.Q;
        Object obj = this.f7393x;
        if ((obj instanceof nd.e) && fragment == null) {
            nd.c savedStateRegistry = ((nd.e) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new androidx.fragment.app.j(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                h0(bundleA);
            }
        }
        Object obj2 = this.f7393x;
        if (obj2 instanceof f.h) {
            f.e activityResultRegistry = ((f.h) obj2).getActivityResultRegistry();
            if (fragment != null) {
                strO = am.j.o(fragment.mWho, ":", new StringBuilder());
            } else {
                strO = "";
            }
            String strConcat = "FragmentManager:".concat(strO);
            this.E = activityResultRegistry.d(strConcat.concat("StartActivityForResult"), new g.h(), new i());
            this.F = activityResultRegistry.d(strConcat.concat("StartIntentSenderForResult"), new l(), new j());
            this.G = activityResultRegistry.d(strConcat.concat("RequestPermissions"), new g.f(), new a());
        }
        Object obj3 = this.f7393x;
        if (obj3 instanceof a7.e) {
            ((a7.e) obj3).addOnConfigurationChangedListener(this.f7387r);
        }
        Object obj4 = this.f7393x;
        if (obj4 instanceof a7.f) {
            ((a7.f) obj4).addOnTrimMemoryListener(this.f7388s);
        }
        Object obj5 = this.f7393x;
        if (obj5 instanceof z6.b0) {
            ((z6.b0) obj5).addOnMultiWindowModeChangedListener(this.f7389t);
        }
        Object obj6 = this.f7393x;
        if (obj6 instanceof z6.c0) {
            ((z6.c0) obj6).addOnPictureInPictureModeChangedListener(this.f7390u);
        }
        Object obj7 = this.f7393x;
        if ((obj7 instanceof androidx.core.view.o) && fragment == null) {
            ((androidx.core.view.o) obj7).addMenuProvider(this.f7391v);
        }
    }

    public final boolean c0(int i14, int i15, String str) {
        A(false);
        z(true);
        Fragment fragment = this.A;
        if (fragment != null && i14 < 0 && str == null && fragment.getChildFragmentManager().b0()) {
            return true;
        }
        boolean zD0 = d0(this.N, this.O, str, i14, i15);
        if (zD0) {
            this.f7371b = true;
            try {
                g0(this.N, this.O);
                e();
            } catch (Throwable th3) {
                e();
                throw th3;
            }
        }
        t0();
        boolean z14 = this.M;
        f0 f0Var = this.f7372c;
        if (z14) {
            this.M = false;
            for (d0 d0Var : f0Var.d()) {
                Fragment fragment2 = d0Var.f7166c;
                if (fragment2.mDeferStart) {
                    if (this.f7371b) {
                        this.M = true;
                    } else {
                        fragment2.mDeferStart = false;
                        d0Var.i();
                    }
                }
            }
        }
        f0Var.f7227b.values().removeAll(Collections.singleton(null));
        return zD0;
    }

    public final void d(Fragment fragment) {
        if (R(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f7372c.a(fragment);
            if (R(2)) {
                fragment.toString();
            }
            if (S(fragment)) {
                this.I = true;
            }
        }
    }

    public final boolean d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i14, int i15) {
        int iE = E(i14, str, (i15 & 1) != 0);
        if (iE < 0) {
            return false;
        }
        for (int size = this.f7373d.size() - 1; size >= iE; size--) {
            arrayList.add(this.f7373d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void e() {
        this.f7371b = false;
        this.O.clear();
        this.N.clear();
    }

    public final void e0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            r0(new IllegalStateException(androidx.core.view.j.j("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final HashSet f() {
        Object eVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7372c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((d0) it.next()).f7166c.mContainer;
            if (viewGroup != null) {
                r0 r0VarQ = Q();
                q0.f7323g.getClass();
                r0VarQ.getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof q0) {
                    eVar = (q0) tag;
                } else {
                    eVar = new androidx.fragment.app.e(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
                }
                hashSet.add(eVar);
            }
        }
        return hashSet;
    }

    public final void f0(Fragment fragment) {
        if (R(2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        f0 f0Var = this.f7372c;
        synchronized (f0Var.f7226a) {
            f0Var.f7226a.remove(fragment);
        }
        fragment.mAdded = false;
        if (S(fragment)) {
            this.I = true;
        }
        fragment.mRemoving = true;
        q0(fragment);
    }

    public final HashSet g(ArrayList arrayList, int i14, int i15) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i14 < i15) {
            Iterator<g0.a> it = ((androidx.fragment.app.a) arrayList.get(i14)).f7235c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f7253b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(q0.i(viewGroup, this));
                }
            }
            i14++;
        }
        return hashSet;
    }

    public final void g0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            vb.h.z("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            if (!arrayList.get(i14).f7250r) {
                if (i15 != i14) {
                    C(arrayList, arrayList2, i15, i14);
                }
                i15 = i14 + 1;
                if (arrayList2.get(i14).booleanValue()) {
                    while (i15 < size && arrayList2.get(i15).booleanValue() && !arrayList.get(i15).f7250r) {
                        i15++;
                    }
                }
                C(arrayList, arrayList2, i14, i15);
                i14 = i15 - 1;
            }
            i14++;
        }
        if (i15 != size) {
            C(arrayList, arrayList2, i15, size);
        }
    }

    public final d0 h(Fragment fragment) {
        String str = fragment.mWho;
        f0 f0Var = this.f7372c;
        d0 d0Var = f0Var.f7227b.get(str);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this.f7385p, f0Var, fragment);
        d0Var2.j(this.f7393x.f7358b.getClassLoader());
        d0Var2.f7168e = this.f7392w;
        return d0Var2;
    }

    public final void h0(Bundle bundle) {
        androidx.fragment.app.t tVar;
        d0 d0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f7393x.f7358b.getClassLoader());
                this.f7382m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f7393x.f7358b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        f0 f0Var = this.f7372c;
        HashMap<String, Bundle> map2 = f0Var.f7228c;
        HashMap<String, d0> map3 = f0Var.f7227b;
        map2.clear();
        map2.putAll(map);
        x xVar = (x) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (xVar == null) {
            return;
        }
        map3.clear();
        Iterator<String> it = xVar.f7422a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tVar = this.f7385p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = f0Var.i(null, it.next());
            if (bundleI != null) {
                Fragment fragment = this.Q.f7431a.get(((c0) bundleI.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).f7147b);
                if (fragment != null) {
                    if (R(2)) {
                        fragment.toString();
                    }
                    d0Var = new d0(tVar, f0Var, fragment, bundleI);
                } else {
                    d0Var = new d0(this.f7385p, this.f7372c, this.f7393x.f7358b.getClassLoader(), P(), bundleI);
                }
                Fragment fragment2 = d0Var.f7166c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (R(2)) {
                    fragment2.toString();
                }
                d0Var.j(this.f7393x.f7358b.getClassLoader());
                f0Var.g(d0Var);
                d0Var.f7168e = this.f7392w;
            }
        }
        y yVar = this.Q;
        yVar.getClass();
        for (Fragment fragment3 : new ArrayList(yVar.f7431a.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (R(2)) {
                    fragment3.toString();
                    Objects.toString(xVar.f7422a);
                }
                this.Q.z4(fragment3);
                fragment3.mFragmentManager = this;
                d0 d0Var2 = new d0(tVar, f0Var, fragment3);
                d0Var2.f7168e = 1;
                d0Var2.i();
                fragment3.mRemoving = true;
                d0Var2.i();
            }
        }
        ArrayList<String> arrayList = xVar.f7423b;
        f0Var.f7226a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = f0Var.b(str3);
                if (fragmentB == null) {
                    vb.h.z(am.j.m("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (R(2)) {
                        fragmentB.toString();
                    }
                    f0Var.a(fragmentB);
                }
            }
        }
        if (xVar.f7424c != null) {
            this.f7373d = new ArrayList<>(xVar.f7424c.length);
            int i14 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = xVar.f7424c;
                if (i14 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i14];
                ArrayList<String> arrayList2 = bVar.f7131b;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                bVar.b(aVar);
                aVar.f7128v = bVar.f7136g;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = arrayList2.get(i15);
                    if (str4 != null) {
                        aVar.f7235c.get(i15).f7253b = f0Var.b(str4);
                    }
                }
                aVar.q(1);
                if (R(2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new o0("FragmentManager"));
                    aVar.u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f7373d.add(aVar);
                i14++;
            }
        } else {
            this.f7373d = new ArrayList<>();
        }
        this.f7380k.set(xVar.f7425d);
        String str5 = xVar.f7426e;
        if (str5 != null) {
            Fragment fragmentB2 = f0Var.b(str5);
            this.A = fragmentB2;
            s(fragmentB2);
        }
        ArrayList<String> arrayList3 = xVar.f7427f;
        if (arrayList3 != null) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                this.f7381l.put(arrayList3.get(i16), xVar.f7428g.get(i16));
            }
        }
        this.H = new ArrayDeque<>(xVar.f7429h);
    }

    public final void i(Fragment fragment) {
        if (R(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (R(2)) {
                fragment.toString();
            }
            f0 f0Var = this.f7372c;
            synchronized (f0Var.f7226a) {
                f0Var.f7226a.remove(fragment);
            }
            fragment.mAdded = false;
            if (S(fragment)) {
                this.I = true;
            }
            q0(fragment);
        }
    }

    public final Bundle i0() {
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        J();
        x();
        A(true);
        this.J = true;
        this.Q.f7436f = true;
        f0 f0Var = this.f7372c;
        f0Var.getClass();
        HashMap<String, d0> map = f0Var.f7227b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (d0 d0Var : map.values()) {
            if (d0Var != null) {
                Fragment fragment = d0Var.f7166c;
                f0Var.i(d0Var.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (R(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.f7372c.f7228c;
        if (map2.isEmpty()) {
            return bundle;
        }
        f0 f0Var2 = this.f7372c;
        synchronized (f0Var2.f7226a) {
            try {
                bVarArr = null;
                if (f0Var2.f7226a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(f0Var2.f7226a.size());
                    for (Fragment fragment2 : f0Var2.f7226a) {
                        arrayList.add(fragment2.mWho);
                        if (R(2)) {
                            fragment2.toString();
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int size = this.f7373d.size();
        if (size > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i14 = 0; i14 < size; i14++) {
                bVarArr[i14] = new androidx.fragment.app.b(this.f7373d.get(i14));
                if (R(2)) {
                    Objects.toString(this.f7373d.get(i14));
                }
            }
        }
        x xVar = new x();
        xVar.f7422a = arrayList2;
        xVar.f7423b = arrayList;
        xVar.f7424c = bVarArr;
        xVar.f7425d = this.f7380k.get();
        Fragment fragment3 = this.A;
        if (fragment3 != null) {
            xVar.f7426e = fragment3.mWho;
        }
        xVar.f7427f.addAll(this.f7381l.keySet());
        xVar.f7428g.addAll(this.f7381l.values());
        xVar.f7429h = new ArrayList<>(this.H);
        bundle.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, xVar);
        for (String str : this.f7382m.keySet()) {
            bundle.putBundle(fb1.c.n("result_", str), this.f7382m.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(fb1.c.n("fragment_", str2), map2.get(str2));
        }
        return bundle;
    }

    public final void j(boolean z14, Configuration configuration) {
        if (z14 && (this.f7393x instanceof a7.e)) {
            r0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z14) {
                    fragment.mChildFragmentManager.j(true, configuration);
                }
            }
        }
    }

    public final Fragment.m j0(Fragment fragment) {
        d0 d0Var = this.f7372c.f7227b.get(fragment.mWho);
        if (d0Var != null) {
            Fragment fragment2 = d0Var.f7166c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.m(d0Var.l());
                }
                return null;
            }
        }
        r0(new IllegalStateException(androidx.core.view.j.j("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final boolean k(MenuItem menuItem) {
        if (this.f7392w < 1) {
            return false;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        synchronized (this.f7370a) {
            try {
                if (this.f7370a.size() == 1) {
                    this.f7393x.f7359c.removeCallbacks(this.R);
                    this.f7393x.f7359c.post(this.R);
                    t0();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.f7392w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z14 = false;
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z14 = true;
            }
        }
        if (this.f7374e != null) {
            for (int i14 = 0; i14 < this.f7374e.size(); i14++) {
                Fragment fragment2 = this.f7374e.get(i14);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f7374e = arrayList;
        return z14;
    }

    public final void l0(Fragment fragment, boolean z14) {
        ViewGroup viewGroupO = O(fragment);
        if (viewGroupO == null || !(viewGroupO instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupO).setDrawDisappearingViewsLast(!z14);
    }

    public final void m() {
        boolean zIsChangingConfigurations = true;
        this.L = true;
        A(true);
        x();
        androidx.fragment.app.r<?> rVar = this.f7393x;
        boolean z14 = rVar instanceof ViewModelStoreOwner;
        f0 f0Var = this.f7372c;
        if (z14) {
            zIsChangingConfigurations = f0Var.f7229d.f7435e;
        } else {
            Context context = rVar.f7358b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<androidx.fragment.app.c> it = this.f7381l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it3 = it.next().f7144a.iterator();
                while (it3.hasNext()) {
                    f0Var.f7229d.y4(it3.next(), false);
                }
            }
        }
        v(-1);
        Object obj = this.f7393x;
        if (obj instanceof a7.f) {
            ((a7.f) obj).removeOnTrimMemoryListener(this.f7388s);
        }
        Object obj2 = this.f7393x;
        if (obj2 instanceof a7.e) {
            ((a7.e) obj2).removeOnConfigurationChangedListener(this.f7387r);
        }
        Object obj3 = this.f7393x;
        if (obj3 instanceof z6.b0) {
            ((z6.b0) obj3).removeOnMultiWindowModeChangedListener(this.f7389t);
        }
        Object obj4 = this.f7393x;
        if (obj4 instanceof z6.c0) {
            ((z6.c0) obj4).removeOnPictureInPictureModeChangedListener(this.f7390u);
        }
        Object obj5 = this.f7393x;
        if ((obj5 instanceof androidx.core.view.o) && this.f7395z == null) {
            ((androidx.core.view.o) obj5).removeMenuProvider(this.f7391v);
        }
        this.f7393x = null;
        this.f7394y = null;
        this.f7395z = null;
        if (this.f7376g != null) {
            this.f7379j.e();
            this.f7376g = null;
        }
        f.g gVar = this.E;
        if (gVar != null) {
            gVar.b();
            this.F.b();
            this.G.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void m0(Bundle bundle, String str) {
        o oVar = this.f7383n.get(str);
        if (oVar != null) {
            if (oVar.f7410a.getF7973d().a(androidx.lifecycle.b0.b.STARTED)) {
                oVar.g(bundle, str);
            } else {
                this.f7382m.put(str, bundle);
            }
        } else {
            this.f7382m.put(str, bundle);
        }
        if (R(2)) {
            Objects.toString(bundle);
        }
    }

    public final void n(boolean z14) {
        if (z14 && (this.f7393x instanceof a7.f)) {
            r0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z14) {
                    fragment.mChildFragmentManager.n(true);
                }
            }
        }
    }

    public final void n0(String str, androidx.lifecycle.n0 n0Var, b0 b0Var) {
        androidx.lifecycle.b0 lifecycle = n0Var.getF158016a();
        if (lifecycle.getF7973d() == androidx.lifecycle.b0.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, b0Var, lifecycle);
        o oVarPut = this.f7383n.put(str, new o(lifecycle, b0Var, gVar));
        if (oVarPut != null) {
            oVarPut.f7410a.d(oVarPut.f7412c);
        }
        if (R(2)) {
            lifecycle.toString();
            Objects.toString(b0Var);
        }
        lifecycle.a(gVar);
    }

    public final void o(boolean z14, boolean z15) {
        if (z15 && (this.f7393x instanceof z6.b0)) {
            r0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z14);
                if (z15) {
                    fragment.mChildFragmentManager.o(z14, true);
                }
            }
        }
    }

    public final void o0(Fragment fragment, androidx.lifecycle.b0.b bVar) {
        if (fragment.equals(this.f7372c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
        } else {
            c22.t.i("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void p() {
        for (Fragment fragment : this.f7372c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.p();
            }
        }
    }

    public final void p0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f7372c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                c22.t.i("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        s(fragment2);
        s(this.A);
    }

    public final boolean q(MenuItem menuItem) {
        if (this.f7392w < 1) {
            return false;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q0(Fragment fragment) {
        ViewGroup viewGroupO = O(fragment);
        if (viewGroupO != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupO.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupO.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupO.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void r(Menu menu) {
        if (this.f7392w < 1) {
            return;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new o0("FragmentManager"));
        androidx.fragment.app.r<?> rVar = this.f7393x;
        try {
            if (rVar != null) {
                rVar.d(printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final void s(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f7372c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s0(m mVar) {
        androidx.fragment.app.t tVar = this.f7385p;
        tVar.getClass();
        mVar.getClass();
        synchronized (tVar.f7365b) {
            try {
                int size = tVar.f7365b.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (tVar.f7365b.get(i14).f7366a == mVar) {
                        tVar.f7365b.remove(i14);
                        break;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void t(boolean z14, boolean z15) {
        if (z15 && (this.f7393x instanceof z6.c0)) {
            r0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z14);
                if (z15) {
                    fragment.mChildFragmentManager.t(z14, true);
                }
            }
        }
    }

    public final void t0() {
        synchronized (this.f7370a) {
            try {
                if (!this.f7370a.isEmpty()) {
                    this.f7379j.f(true);
                    if (R(3)) {
                        toString();
                    }
                } else {
                    boolean z14 = M() > 0 && U(this.f7395z);
                    if (R(3)) {
                        toString();
                    }
                    this.f7379j.f(z14);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append("FragmentManager{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" in ");
        Fragment fragment = this.f7395z;
        if (fragment != null) {
            sb3.append(fragment.getClass().getSimpleName());
            sb3.append("{");
            sb3.append(Integer.toHexString(System.identityHashCode(this.f7395z)));
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        } else {
            androidx.fragment.app.r<?> rVar = this.f7393x;
            if (rVar != null) {
                sb3.append(rVar.getClass().getSimpleName());
                sb3.append("{");
                sb3.append(Integer.toHexString(System.identityHashCode(this.f7393x)));
                sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            } else {
                sb3.append(BuildConfig.TRAVIS);
            }
        }
        sb3.append("}}");
        return sb3.toString();
    }

    public final boolean u(Menu menu) {
        boolean z14 = false;
        if (this.f7392w < 1) {
            return false;
        }
        for (Fragment fragment : this.f7372c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z14 = true;
            }
        }
        return z14;
    }

    public final void v(int i14) {
        try {
            this.f7371b = true;
            for (d0 d0Var : this.f7372c.f7227b.values()) {
                if (d0Var != null) {
                    d0Var.f7168e = i14;
                }
            }
            W(i14, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((q0) it.next()).h();
            }
            this.f7371b = false;
            A(true);
        } catch (Throwable th3) {
            this.f7371b = false;
            throw th3;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strG = tn.k.g(str, "    ");
        f0 f0Var = this.f7372c;
        ArrayList<Fragment> arrayList = f0Var.f7226a;
        String strG2 = tn.k.g(str, "    ");
        HashMap<String, d0> map = f0Var.f7227b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (d0 d0Var : map.values()) {
                printWriter.print(str);
                if (d0Var != null) {
                    Fragment fragment = d0Var.f7166c;
                    printWriter.println(fragment);
                    fragment.dump(strG2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(BuildConfig.TRAVIS);
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i14 = 0; i14 < size2; i14++) {
                Fragment fragment2 = arrayList.get(i14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f7374e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i15 = 0; i15 < size; i15++) {
                Fragment fragment3 = this.f7374e.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f7373d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i16 = 0; i16 < size3; i16++) {
                androidx.fragment.app.a aVar = this.f7373d.get(i16);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i16);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.u(strG, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f7380k.get());
        synchronized (this.f7370a) {
            try {
                int size4 = this.f7370a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i17 = 0; i17 < size4; i17++) {
                        Object obj = (q) this.f7370a.get(i17);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i17);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7393x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7394y);
        if (this.f7395z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7395z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7392w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.L);
        if (this.I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.I);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((q0) it.next()).h();
        }
    }

    public final void y(q qVar, boolean z14) {
        if (!z14) {
            if (this.f7393x == null) {
                if (this.L) {
                    vb.h.z("FragmentManager has been destroyed");
                    return;
                } else {
                    vb.h.z("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (V()) {
                vb.h.z("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f7370a) {
            try {
                if (this.f7393x == null) {
                    if (!z14) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f7370a.add(qVar);
                    k0();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void z(boolean z14) {
        if (this.f7371b) {
            vb.h.z("FragmentManager is already executing transactions");
            return;
        }
        if (this.f7393x == null) {
            if (this.L) {
                vb.h.z("FragmentManager has been destroyed");
                return;
            } else {
                vb.h.z("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f7393x.f7359c.getLooper()) {
            vb.h.z("Must be called from main thread of fragment host");
            return;
        }
        if (!z14 && V()) {
            vb.h.z("Can not perform this action after onSaveInstanceState");
        } else if (this.N == null) {
            this.N = new ArrayList<>();
            this.O = new ArrayList<>();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7409b;

        public class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i14) {
                return new n[i14];
            }
        }

        public n(Parcel parcel) {
            this.f7408a = parcel.readString();
            this.f7409b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeString(this.f7408a);
            parcel.writeInt(this.f7409b);
        }

        public n(String str, int i14) {
            this.f7408a = str;
            this.f7409b = i14;
        }
    }
}
