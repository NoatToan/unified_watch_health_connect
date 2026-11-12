package k53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk53/p;", "K", "V", "Li53/e;", "Lp13/i;", "Lk53/d;", "map", "<init>", "(Lk53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p<K, V> extends p13.i<K> implements i53.e<K> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<K, V> f102992b;

    public p(d<K, V> dVar) {
        dVar.getClass();
        this.f102992b = dVar;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF168272d() {
        return this.f102992b.getF102965c();
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f102992b.containsKey(obj);
    }

    @Override // p13.i, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new q(this.f102992b.f102964b);
    }
}
