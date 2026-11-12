package w3;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw3/h;", "K", "V", "Lw3/a;", "", "Lw3/f;", "builder", "<init>", "(Lw3/f;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<K, V> f181802a;

    public h(f<K, V> fVar) {
        this.f181802a = fVar;
    }

    @Override // p13.h
    public final int a() {
        return this.f181802a.getF102978f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // w3.a
    public final boolean b(Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        f<K, V> fVar = this.f181802a;
        V v14 = fVar.get(key);
        if (v14 != null) {
            return v14.equals(entry.getValue());
        }
        return entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    @Override // w3.a
    public final boolean c(Map.Entry<? extends K, ? extends V> entry) {
        return this.f181802a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f181802a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f181802a);
    }
}
