package androidx.fragment.app;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import defpackage.dvq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g extends dvq {
    public static final ViewModelProvider.Factory h = new a();
    public final boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Fragment> f2414a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, g> f2415b = new HashMap<>();
    public final HashMap<String, ViewModelStore> c = new HashMap<>();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public class a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends dvq> T create(Class<T> cls) {
            return new g(true);
        }
    }

    public g(boolean z) {
        this.d = z;
    }

    public static g g(ViewModelStore viewModelStore) {
        return (g) new ViewModelProvider(viewModelStore, h).get(g.class);
    }

    public void a(Fragment fragment) {
        if (this.g) {
            FragmentManager.M0(2);
            return;
        }
        if (this.f2414a.containsKey(fragment.mWho)) {
            return;
        }
        this.f2414a.put(fragment.mWho, fragment);
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
        }
    }

    public void b(Fragment fragment) {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        d(fragment.mWho);
    }

    public void c(String str) {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        d(str);
    }

    public final void d(String str) {
        g gVar = this.f2415b.get(str);
        if (gVar != null) {
            gVar.onCleared();
            this.f2415b.remove(str);
        }
        ViewModelStore viewModelStore = this.c.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.c.remove(str);
        }
    }

    public Fragment e(String str) {
        return this.f2414a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2414a.equals(gVar.f2414a) && this.f2415b.equals(gVar.f2415b) && this.c.equals(gVar.c);
    }

    public g f(Fragment fragment) {
        g gVar = this.f2415b.get(fragment.mWho);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.d);
        this.f2415b.put(fragment.mWho, gVar2);
        return gVar2;
    }

    public Collection<Fragment> h() {
        return new ArrayList(this.f2414a.values());
    }

    public int hashCode() {
        return (((this.f2414a.hashCode() * 31) + this.f2415b.hashCode()) * 31) + this.c.hashCode();
    }

    public ViewModelStore i(Fragment fragment) {
        ViewModelStore viewModelStore = this.c.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.c.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    public boolean j() {
        return this.e;
    }

    public void k(Fragment fragment) {
        if (this.g) {
            FragmentManager.M0(2);
        } else {
            if (this.f2414a.remove(fragment.mWho) == null || !FragmentManager.M0(2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    public void l(boolean z) {
        this.g = z;
    }

    public boolean m(Fragment fragment) {
        if (this.f2414a.containsKey(fragment.mWho)) {
            return this.d ? this.e : !this.f;
        }
        return true;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        if (FragmentManager.M0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.e = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2414a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2415b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
