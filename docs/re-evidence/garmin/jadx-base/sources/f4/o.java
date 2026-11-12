package f4;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf4/o;", "K", "V", "E", "", "Lf4/u;", "map", "<init>", "(Lf4/u;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o<K, V, E> implements Set<E>, f23.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u<K, V> f68801a;

    public o(u<K, V> uVar) {
        this.f68801a = uVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f68801a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f68801a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f68801a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }
}
