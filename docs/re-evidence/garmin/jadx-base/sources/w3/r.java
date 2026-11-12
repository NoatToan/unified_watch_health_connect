package w3;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw3/r;", "K", "V", "", "Lp13/a;", "Lw3/d;", "map", "<init>", "(Lw3/d;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r<K, V> extends p13.a<V> implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<K, V> f181808a;

    public r(d<K, V> dVar) {
        this.f181808a = dVar;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF168272d() {
        return this.f181808a.getF102965c();
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f181808a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new s(this.f181808a.f181787b);
    }
}
