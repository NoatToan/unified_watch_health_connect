package defpackage;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ia9<K, V> extends d9l<K, V> {
    public final HashMap<K, d9l.c<K, V>> e = new HashMap<>();

    public boolean contains(K k2) {
        return this.e.containsKey(k2);
    }

    @Override // defpackage.d9l
    public d9l.c<K, V> f(K k2) {
        return this.e.get(k2);
    }

    @Override // defpackage.d9l
    public V j(K k2, V v) {
        d9l.c<K, V> cVarF = f(k2);
        if (cVarF != null) {
            return cVarF.f15268b;
        }
        this.e.put(k2, i(k2, v));
        return null;
    }

    @Override // defpackage.d9l
    public V k(K k2) {
        V v = (V) super.k(k2);
        this.e.remove(k2);
        return v;
    }

    public Map.Entry<K, V> l(K k2) {
        if (contains(k2)) {
            return this.e.get(k2).d;
        }
        return null;
    }
}
