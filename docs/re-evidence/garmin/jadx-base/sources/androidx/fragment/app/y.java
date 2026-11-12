package androidx.fragment.app;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f7430g = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7434d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Fragment> f7431a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, y> f7432b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, y1> f7433c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7435e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7436f = false;

    public class a implements x1.c {
        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            return new y(true);
        }
    }

    public y(boolean z14) {
        this.f7434d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f7431a.equals(yVar.f7431a) && this.f7432b.equals(yVar.f7432b) && this.f7433c.equals(yVar.f7433c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7433c.hashCode() + ((this.f7432b.hashCode() + (this.f7431a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        if (v.R(3)) {
            toString();
        }
        this.f7435e = true;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FragmentManagerViewModel{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} Fragments (");
        Iterator<Fragment> it = this.f7431a.values().iterator();
        while (it.hasNext()) {
            sb3.append(it.next());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(") Child Non Config (");
        Iterator<String> it3 = this.f7432b.keySet().iterator();
        while (it3.hasNext()) {
            sb3.append(it3.next());
            if (it3.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(") ViewModelStores (");
        Iterator<String> it4 = this.f7433c.keySet().iterator();
        while (it4.hasNext()) {
            sb3.append(it4.next());
            if (it4.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public final void x4(Fragment fragment) {
        if (this.f7436f) {
            return;
        }
        String str = fragment.mWho;
        HashMap<String, Fragment> map = this.f7431a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (v.R(2)) {
            fragment.toString();
        }
    }

    public final void y4(String str, boolean z14) {
        HashMap<String, y> map = this.f7432b;
        y yVar = map.get(str);
        if (yVar != null) {
            if (z14) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(yVar.f7432b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yVar.y4((String) it.next(), true);
                }
            }
            yVar.onCleared();
            map.remove(str);
        }
        HashMap<String, y1> map2 = this.f7433c;
        y1 y1Var = map2.get(str);
        if (y1Var != null) {
            y1Var.a();
            map2.remove(str);
        }
    }

    public final void z4(Fragment fragment) {
        if (this.f7436f || this.f7431a.remove(fragment.mWho) == null || !v.R(2)) {
            return;
        }
        fragment.toString();
    }
}
