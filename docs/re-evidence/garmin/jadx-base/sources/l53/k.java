package l53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll53/k;", "K", "V", "", "Ll53/d;", "map", "<init>", "(Ll53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k<K, V> implements Iterator<V>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<K, V> f110428a;

    public k(d<K, V> dVar) {
        dVar.getClass();
        this.f110428a = new i<>(dVar.f110410b, dVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110428a.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return this.f110428a.next().f110395a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f110428a.remove();
    }
}
