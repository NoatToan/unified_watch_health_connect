package l53;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll53/m;", "K", "V", "", "", "Ll53/c;", "map", "<init>", "(Ll53/c;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<K, V> f110430a;

    public m(c<K, V> cVar) {
        cVar.getClass();
        this.f110430a = new p<>(cVar.f110402b, cVar.f110404d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110430a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        p<K, V> pVar = this.f110430a;
        return new k53.b(pVar.f110433a, pVar.next().f110395a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
