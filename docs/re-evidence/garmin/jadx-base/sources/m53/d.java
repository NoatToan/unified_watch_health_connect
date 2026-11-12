package m53;

import c22.t;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm53/d;", "E", "", "", "nextElement", "", "Lm53/a;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d<E> implements Iterator<E>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f116794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<E, a> f116795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116796c;

    public d(Object obj, Map<E, a> map) {
        map.getClass();
        this.f116794a = obj;
        this.f116795b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f116796c < this.f116795b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        E e4 = (E) this.f116794a;
        this.f116796c++;
        a aVar = this.f116795b.get(e4);
        if (aVar == null) {
            throw new ConcurrentModificationException(org.apache.commons.lang3.e.f("Hash code of an element (", ") has changed after it was added to the persistent set.", e4));
        }
        this.f116794a = aVar.f116783b;
        return e4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
