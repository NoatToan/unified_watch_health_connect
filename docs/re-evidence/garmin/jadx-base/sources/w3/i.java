package w3;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw3/i;", "K", "V", "", "", "Lw3/f;", "builder", "<init>", "(Lw3/f;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<K, V, Map.Entry<K, V>> f181803a;

    public i(f<K, V> fVar) {
        u[] uVarArr = new u[8];
        for (int i14 = 0; i14 < 8; i14++) {
            uVarArr[i14] = new y(this);
        }
        this.f181803a = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f181803a.f181791c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f181803a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f181803a.remove();
    }
}
