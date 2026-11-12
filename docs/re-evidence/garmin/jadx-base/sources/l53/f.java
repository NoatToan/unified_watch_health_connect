package l53;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll53/f;", "K", "V", "", "", "Ll53/d;", "map", "<init>", "(Ll53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<K, V> implements Iterator<Map.Entry<K, V>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<K, V> f110418a;

    public f(d<K, V> dVar) {
        dVar.getClass();
        this.f110418a = new i<>(dVar.f110410b, dVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110418a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        i<K, V> iVar = this.f110418a;
        return new b(iVar.f110422b.f110412d, iVar.f110423c, iVar.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f110418a.remove();
    }
}
