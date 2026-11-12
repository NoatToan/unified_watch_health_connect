package l53;

import c22.t;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll53/p;", "K", "V", "", "Ll53/a;", "", "nextKey", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p<K, V> implements Iterator<a<V>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f110433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<V>> f110434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110435c;

    public p(Object obj, Map<K, a<V>> map) {
        map.getClass();
        this.f110433a = obj;
        this.f110434b = map;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a<V> next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        a<V> aVar = this.f110434b.get(this.f110433a);
        if (aVar == null) {
            throw new ConcurrentModificationException(am.j.k(this.f110433a, ") has changed after it was added to the persistent map.", new StringBuilder("Hash code of a key (")));
        }
        a<V> aVar2 = aVar;
        this.f110435c++;
        this.f110433a = aVar2.f110397c;
        return aVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110435c < this.f110434b.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
