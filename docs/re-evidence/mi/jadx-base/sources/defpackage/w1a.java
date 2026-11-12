package defpackage;

import com.google.common.collect.i0;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w1a<E> extends i1a<E> implements Set<E> {
    @Override // defpackage.i1a, defpackage.t1a
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(Object obj) {
        return i0.a(this, obj);
    }

    public int standardHashCode() {
        return i0.b(this);
    }

    @Override // defpackage.i1a
    public boolean standardRemoveAll(Collection<?> collection) {
        return i0.g(this, (Collection) c6i.o(collection));
    }
}
