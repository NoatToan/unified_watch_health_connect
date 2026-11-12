package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
final class d<K, V> implements Serializable {
    public final K a;
    public final V b;

    public d(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        K k = this.a;
        if (k == null) {
            if (dVar.a != null) {
                return false;
            }
        } else if (!k.equals(dVar.a)) {
            return false;
        }
        V v = this.b;
        V v2 = dVar.b;
        if (v == null) {
            if (v2 != null) {
                return false;
            }
        } else if (!v.equals(v2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k = this.a;
        int iHashCode = k == null ? 0 : k.hashCode();
        V v = this.b;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.a + SearchCriteria.EQ + this.b;
    }
}
