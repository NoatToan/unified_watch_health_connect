package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f7226a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, d0> f7227b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f7228c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f7229d;

    public final void a(Fragment fragment) {
        if (this.f7226a.contains(fragment)) {
            com.google.firebase.messaging.l.n(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.f7226a) {
            this.f7226a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        d0 d0Var = this.f7227b.get(str);
        if (d0Var != null) {
            return d0Var.f7166c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (d0 d0Var : this.f7227b.values()) {
            if (d0Var != null && (fragmentFindFragmentByWho = d0Var.f7166c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (d0 d0Var : this.f7227b.values()) {
            if (d0Var != null) {
                arrayList.add(d0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (d0 d0Var : this.f7227b.values()) {
            if (d0Var != null) {
                arrayList.add(d0Var.f7166c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f7226a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f7226a) {
            arrayList = new ArrayList(this.f7226a);
        }
        return arrayList;
    }

    public final void g(d0 d0Var) {
        Fragment fragment = d0Var.f7166c;
        String str = fragment.mWho;
        HashMap<String, d0> map = this.f7227b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, d0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z14 = fragment.mRetainInstance;
            y yVar = this.f7229d;
            if (z14) {
                yVar.x4(fragment);
            } else {
                yVar.z4(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (v.R(2)) {
            fragment.toString();
        }
    }

    public final void h(d0 d0Var) {
        Fragment fragment = d0Var.f7166c;
        if (fragment.mRetainInstance) {
            this.f7229d.z4(fragment);
        }
        String str = fragment.mWho;
        HashMap<String, d0> map = this.f7227b;
        if (map.get(str) == d0Var && map.put(fragment.mWho, null) != null && v.R(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap<String, Bundle> map = this.f7228c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
