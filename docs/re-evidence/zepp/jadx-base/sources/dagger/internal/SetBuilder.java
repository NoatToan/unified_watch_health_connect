package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class SetBuilder<T> {
    private static final String b = "Set contributions cannot be null";
    private final List<T> a;

    private SetBuilder(int i) {
        this.a = new ArrayList(i);
    }

    public static <T> SetBuilder<T> newSetBuilder(int i) {
        return new SetBuilder<>(i);
    }

    public SetBuilder<T> add(T t) {
        this.a.add((T) Preconditions.checkNotNull(t, b));
        return this;
    }

    public SetBuilder<T> addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it2 = collection.iterator();
        while (it2.hasNext()) {
            Preconditions.checkNotNull(it2.next(), b);
        }
        this.a.addAll(collection);
        return this;
    }

    public Set<T> build() {
        int size = this.a.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableSet(new HashSet(this.a)) : Collections.singleton(this.a.get(0));
        }
        return Collections.emptySet();
    }
}
