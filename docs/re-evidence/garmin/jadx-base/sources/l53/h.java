package l53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll53/h;", "K", "V", "", "Ll53/d;", "map", "<init>", "(Ll53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<K, V> implements Iterator<K>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<K, V> f110420a;

    public h(d<K, V> dVar) {
        dVar.getClass();
        this.f110420a = new i<>(dVar.f110410b, dVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110420a.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        i<K, V> iVar = this.f110420a;
        iVar.next();
        return (K) iVar.f110423c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f110420a.remove();
    }
}
