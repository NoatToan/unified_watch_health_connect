package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.p004activity.OnBackPressedDispatcher;
import defpackage.cig;
import defpackage.eig;
import defpackage.fig;
import defpackage.gig;
import defpackage.hig;
import defpackage.nfe;
import defpackage.p7h;
import defpackage.wy9;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NavController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f2653b;
    public g c;
    public e d;
    public Bundle e;
    public Parcelable[] f;
    public boolean g;
    public LifecycleOwner i;
    public fig j;
    public final Deque<eig> h = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f2654k = new j();
    public final CopyOnWriteArrayList<b> l = new CopyOnWriteArrayList<>();
    public final nfe m = new LifecycleEventObserver() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            NavController navController = NavController.this;
            if (navController.d != null) {
                Iterator<eig> it = navController.h.iterator();
                while (it.hasNext()) {
                    it.next().e(event);
                }
            }
        }
    };
    public final p7h n = new a(false);
    public boolean o = true;

    public class a extends p7h {
        public a(boolean z) {
            super(z);
        }

        @Override // defpackage.p7h
        public void handleOnBackPressed() {
            NavController.this.x();
        }
    }

    public interface b {
        void a(NavController navController, d dVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f2652a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f2653b = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        j jVar = this.f2654k;
        jVar.a(new f(jVar));
        this.f2654k.a(new androidx.navigation.a(this.f2652a));
    }

    public void A(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f2652a.getClassLoader());
        this.e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle B() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, i<? extends d>> entry : this.f2654k.f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleD = entry.getValue().d();
            if (bundleD != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleD);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.h.size()];
            Iterator<eig> it = this.h.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.g);
        }
        return bundle;
    }

    public void C(int i) {
        D(i, null);
    }

    public void D(int i, Bundle bundle) {
        F(k().c(i), bundle);
    }

    public void E(e eVar) {
        F(eVar, null);
    }

    public void F(e eVar, Bundle bundle) {
        e eVar2 = this.d;
        if (eVar2 != null) {
            z(eVar2.m(), true);
        }
        this.d = eVar;
        w(bundle);
    }

    public void G(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == this.i) {
            return;
        }
        this.i = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this.m);
    }

    public void H(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.n.remove();
        onBackPressedDispatcher.b(this.i, this.n);
        this.i.getLifecycle().removeObserver(this.m);
        this.i.getLifecycle().addObserver(this.m);
    }

    public void I(ViewModelStore viewModelStore) {
        if (this.j == fig.b(viewModelStore)) {
            return;
        }
        if (!this.h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.j = fig.b(viewModelStore);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public final void J() {
        boolean z;
        p7h p7hVar = this.n;
        if (this.o) {
            z = i() > 1;
        }
        p7hVar.setEnabled(z);
    }

    public final boolean a() {
        d dVarR;
        while (!this.h.isEmpty() && (this.h.peekLast().b() instanceof e) && z(this.h.peekLast().b().m(), true)) {
        }
        if (this.h.isEmpty()) {
            return false;
        }
        d dVarB = this.h.peekLast().b();
        if (!(dVarB instanceof wy9)) {
            dVarR = null;
            break;
        }
        Iterator<eig> itDescendingIterator = this.h.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                dVarR = null;
                break;
            }
            dVarR = itDescendingIterator.next().b();
            if (!(dVarR instanceof e) && !(dVarR instanceof wy9)) {
                break;
            }
        }
        HashMap map = new HashMap();
        Iterator<eig> itDescendingIterator2 = this.h.descendingIterator();
        while (itDescendingIterator2.hasNext()) {
            eig next = itDescendingIterator2.next();
            Lifecycle.State stateC = next.c();
            d dVarB2 = next.b();
            if (dVarB != null && dVarB2.m() == dVarB.m()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (stateC != state) {
                    map.put(next, state);
                }
                dVarB = dVarB.r();
            } else if (dVarR == null || dVarB2.m() != dVarR.m()) {
                next.h(Lifecycle.State.CREATED);
            } else {
                if (stateC == Lifecycle.State.RESUMED) {
                    next.h(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (stateC != state2) {
                        map.put(next, state2);
                    }
                }
                dVarR = dVarR.r();
            }
        }
        for (eig eigVar : this.h) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(eigVar);
            if (state3 != null) {
                eigVar.h(state3);
            } else {
                eigVar.i();
            }
        }
        eig eigVarPeekLast = this.h.peekLast();
        Iterator<b> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a(this, eigVarPeekLast.b(), eigVarPeekLast.a());
        }
        return true;
    }

    public void addOnDestinationChangedListener(b bVar) {
        if (!this.h.isEmpty()) {
            eig eigVarPeekLast = this.h.peekLast();
            bVar.a(this, eigVarPeekLast.b(), eigVarPeekLast.a());
        }
        this.l.add(bVar);
    }

    public void b(boolean z) {
        this.o = z;
        J();
    }

    public d c(int i) {
        e eVar = this.d;
        if (eVar == null) {
            return null;
        }
        if (eVar.m() == i) {
            return this.d;
        }
        e eVarB = this.h.isEmpty() ? this.d : this.h.getLast().b();
        return (eVarB instanceof e ? eVarB : eVarB.r()).F(i);
    }

    public final String d(int[] iArr) {
        e eVar;
        e eVar2 = this.d;
        int i = 0;
        while (true) {
            d dVarF = null;
            if (i >= iArr.length) {
                return null;
            }
            int i2 = iArr[i];
            if (i != 0) {
                dVarF = eVar2.F(i2);
            } else if (this.d.m() == i2) {
                dVarF = this.d;
            }
            if (dVarF == null) {
                return d.l(this.f2652a, i2);
            }
            if (i != iArr.length - 1) {
                while (true) {
                    eVar = (e) dVarF;
                    if (!(eVar.F(eVar.I()) instanceof e)) {
                        break;
                    }
                    dVarF = eVar.F(eVar.I());
                }
                eVar2 = eVar;
            }
            i++;
        }
    }

    public eig e(int i) {
        eig next;
        Iterator<eig> itDescendingIterator = this.h.descendingIterator();
        do {
            if (!itDescendingIterator.hasNext()) {
                next = null;
                break;
            }
            next = itDescendingIterator.next();
        } while (next.b().m() != i);
        if (next != null) {
            return next;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + h());
    }

    public Context f() {
        return this.f2652a;
    }

    public eig g() {
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.getLast();
    }

    public d h() {
        eig eigVarG = g();
        if (eigVarG != null) {
            return eigVarG.b();
        }
        return null;
    }

    public final int i() {
        Iterator<eig> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!(it.next().b() instanceof e)) {
                i++;
            }
        }
        return i;
    }

    public e j() {
        e eVar = this.d;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public g k() {
        if (this.c == null) {
            this.c = new g(this.f2652a, this.f2654k);
        }
        return this.c;
    }

    public j l() {
        return this.f2654k;
    }

    public boolean m(Intent intent) {
        d.a aVarT;
        e eVar;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (aVarT = this.d.t(new hig(intent))) != null) {
            d dVarB = aVarT.b();
            int[] iArrH = dVarB.h();
            bundle.putAll(dVarB.g(aVarT.c()));
            intArray = iArrH;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strD = d(intArray);
        if (strD != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find destination ");
            sb.append(strD);
            sb.append(" in the navigation graph, ignoring the deep link from ");
            sb.append(intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            TaskStackBuilder.i(this.f2652a).f(intent).o();
            Activity activity = this.f2653b;
            if (activity != null) {
                activity.finish();
                this.f2653b.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i != 0) {
            if (!this.h.isEmpty()) {
                z(this.d.m(), true);
            }
            int i2 = 0;
            while (i2 < intArray.length) {
                int i3 = i2 + 1;
                int i4 = intArray[i2];
                d dVarC = c(i4);
                if (dVarC == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + d.l(this.f2652a, i4) + " cannot be found from the current destination " + h());
                }
                u(dVarC, bundle, new h.a().b(0).c(0).a(), null);
                i2 = i3;
            }
            return true;
        }
        e eVar2 = this.d;
        int i5 = 0;
        while (i5 < intArray.length) {
            int i6 = intArray[i5];
            d dVarF = i5 == 0 ? this.d : eVar2.F(i6);
            if (dVarF == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + d.l(this.f2652a, i6) + " cannot be found in graph " + eVar2);
            }
            if (i5 != intArray.length - 1) {
                while (true) {
                    eVar = (e) dVarF;
                    if (!(eVar.F(eVar.I()) instanceof e)) {
                        break;
                    }
                    dVarF = eVar.F(eVar.I());
                }
                eVar2 = eVar;
            } else {
                u(dVarF, dVarF.g(bundle), new h.a().g(this.d.m(), true).b(0).c(0).a(), null);
            }
            i5++;
        }
        this.g = true;
        return true;
    }

    public void n(int i) {
        o(i, null);
    }

    public void o(int i, Bundle bundle) {
        p(i, bundle, null);
    }

    public void p(int i, Bundle bundle, h hVar) {
        q(i, bundle, hVar, null);
    }

    public void q(int i, Bundle bundle, h hVar, i.a aVar) {
        int iB;
        d dVarB = this.h.isEmpty() ? this.d : this.h.getLast().b();
        if (dVarB == null) {
            throw new IllegalStateException("no current navigation node");
        }
        cig cigVarI = dVarB.i(i);
        Bundle bundle2 = null;
        if (cigVarI != null) {
            if (hVar == null) {
                hVar = cigVarI.c();
            }
            iB = cigVarI.b();
            Bundle bundleA = cigVarI.a();
            if (bundleA != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleA);
            }
        } else {
            iB = i;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iB == 0 && hVar != null && hVar.e() != -1) {
            y(hVar.e(), hVar.f());
            return;
        }
        if (iB == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        d dVarC = c(iB);
        if (dVarC != null) {
            u(dVarC, bundle2, hVar, aVar);
            return;
        }
        String strL = d.l(this.f2652a, iB);
        if (cigVarI == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strL + " cannot be found from the current destination " + dVarB);
        }
        throw new IllegalArgumentException("Navigation destination " + strL + " referenced from action " + d.l(this.f2652a, i) + " cannot be found from the current destination " + dVarB);
    }

    public void r(hig higVar) {
        s(higVar, null);
    }

    public void removeOnDestinationChangedListener(b bVar) {
        this.l.remove(bVar);
    }

    public void s(hig higVar, h hVar) {
        t(higVar, hVar, null);
    }

    public void t(hig higVar, h hVar, i.a aVar) {
        d.a aVarT = this.d.t(higVar);
        if (aVarT == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + higVar + " cannot be found in the navigation graph " + this.d);
        }
        Bundle bundleG = aVarT.b().g(aVarT.c());
        if (bundleG == null) {
            bundleG = new Bundle();
        }
        d dVarB = aVarT.b();
        Intent intent = new Intent();
        intent.setDataAndType(higVar.c(), higVar.b());
        intent.setAction(higVar.a());
        bundleG.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        u(dVarB, bundleG, hVar, aVar);
    }

    public final void u(d dVar, Bundle bundle, h hVar, i.a aVar) {
        boolean z = false;
        boolean z2 = (hVar == null || hVar.e() == -1) ? false : z(hVar.e(), hVar.f());
        i iVarE = this.f2654k.e(dVar.q());
        Bundle bundleG = dVar.g(bundle);
        d dVarB = iVarE.b(dVar, bundleG, hVar, aVar);
        if (dVarB != null) {
            if (!(dVarB instanceof wy9)) {
                while (!this.h.isEmpty() && (this.h.peekLast().b() instanceof wy9) && z(this.h.peekLast().b().m(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (dVar instanceof e) {
                d dVar2 = dVarB;
                while (true) {
                    e eVarR = dVar2.r();
                    if (eVarR != null) {
                        arrayDeque.addFirst(new eig(this.f2652a, eVarR, bundleG, this.i, this.j));
                        if (!this.h.isEmpty() && this.h.getLast().b() == eVarR) {
                            z(eVarR.m(), true);
                        }
                    }
                    if (eVarR == null || eVarR == dVar) {
                        break;
                    } else {
                        dVar2 = eVarR;
                    }
                }
            }
            d dVarB2 = arrayDeque.isEmpty() ? dVarB : ((eig) arrayDeque.getFirst()).b();
            while (dVarB2 != null && c(dVarB2.m()) == null) {
                dVarB2 = dVarB2.r();
                if (dVarB2 != null) {
                    arrayDeque.addFirst(new eig(this.f2652a, dVarB2, bundleG, this.i, this.j));
                }
            }
            d dVarB3 = arrayDeque.isEmpty() ? dVarB : ((eig) arrayDeque.getLast()).b();
            while (!this.h.isEmpty() && (this.h.getLast().b() instanceof e) && ((e) this.h.getLast().b()).G(dVarB3.m(), false) == null && z(this.h.getLast().b().m(), true)) {
            }
            this.h.addAll(arrayDeque);
            if (this.h.isEmpty() || this.h.getFirst().b() != this.d) {
                this.h.addFirst(new eig(this.f2652a, this.d, bundleG, this.i, this.j));
            }
            this.h.add(new eig(this.f2652a, dVarB, dVarB.g(bundleG), this.i, this.j));
        } else if (hVar != null && hVar.g()) {
            eig eigVarPeekLast = this.h.peekLast();
            if (eigVarPeekLast != null) {
                eigVarPeekLast.f(bundleG);
            }
            z = true;
        }
        J();
        if (z2 || dVarB != null || z) {
            a();
        }
    }

    public boolean v() {
        if (i() != 1) {
            return x();
        }
        d dVarH = h();
        int iM = dVarH.m();
        for (e eVarR = dVarH.r(); eVarR != null; eVarR = eVarR.r()) {
            if (eVarR.I() != iM) {
                Bundle bundle = new Bundle();
                Activity activity = this.f2653b;
                if (activity != null && activity.getIntent() != null && this.f2653b.getIntent().getData() != null) {
                    bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f2653b.getIntent());
                    d.a aVarT = this.d.t(new hig(this.f2653b.getIntent()));
                    if (aVarT != null) {
                        bundle.putAll(aVarT.b().g(aVarT.c()));
                    }
                }
                new gig(this).d(eVarR.m()).c(bundle).a().o();
                Activity activity2 = this.f2653b;
                if (activity2 != null) {
                    activity2.finish();
                }
                return true;
            }
            iM = eVarR.m();
        }
        return false;
    }

    public final void w(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                i iVarE = this.f2654k.e(str);
                Bundle bundle3 = this.e.getBundle(str);
                if (bundle3 != null) {
                    iVarE.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                d dVarC = c(navBackStackEntryState.c());
                if (dVarC == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + d.l(this.f2652a, navBackStackEntryState.c()) + " cannot be found from the current destination " + h());
                }
                Bundle bundleA = navBackStackEntryState.a();
                if (bundleA != null) {
                    bundleA.setClassLoader(this.f2652a.getClassLoader());
                }
                this.h.add(new eig(this.f2652a, dVarC, bundleA, this.i, this.j, navBackStackEntryState.e(), navBackStackEntryState.d()));
            }
            J();
            this.f = null;
        }
        if (this.d == null || !this.h.isEmpty()) {
            a();
        } else if (this.g || (activity = this.f2653b) == null || !m(activity.getIntent())) {
            u(this.d, bundle, null, null);
        }
    }

    public boolean x() {
        if (this.h.isEmpty()) {
            return false;
        }
        return y(h().m(), true);
    }

    public boolean y(int i, boolean z) {
        return z(i, z) && a();
    }

    public boolean z(int i, boolean z) {
        boolean z2 = false;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<eig> itDescendingIterator = this.h.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            d dVarB = itDescendingIterator.next().b();
            i iVarE = this.f2654k.e(dVarB.q());
            if (z || dVarB.m() != i) {
                arrayList.add(iVarE);
            }
            if (dVarB.m() == i) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && ((i) it.next()).e()) {
                    eig eigVarRemoveLast = this.h.removeLast();
                    if (eigVarRemoveLast.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                        eigVarRemoveLast.h(Lifecycle.State.DESTROYED);
                    }
                    fig figVar = this.j;
                    if (figVar != null) {
                        figVar.a(eigVarRemoveLast.f);
                    }
                    z2 = true;
                }
                J();
                return z2;
            }
        }
        String strL = d.l(this.f2652a, i);
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring popBackStack to destination ");
        sb.append(strL);
        sb.append(" as it was not found on the current back stack");
        return false;
    }
}
