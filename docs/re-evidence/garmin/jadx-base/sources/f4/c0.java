package f4;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf4/c0;", "K", "V", "Lf4/d0;", "", "", "Lf4/u;", "map", "", "", "iterator", "<init>", "(Lf4/u;Ljava/util/Iterator;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0<K, V> extends d0<K, V> implements Iterator<Map.Entry<K, V>>, f23.a {
    public c0(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(uVar, it);
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (this.f68731d != null) {
            return new b0(this);
        }
        j20.x.h();
        return null;
    }
}
