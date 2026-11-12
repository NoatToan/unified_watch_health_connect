package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> c = InstanceFactory.create(Collections.emptySet());
    private final List<Provider<T>> a;
    private final List<Provider<Collection<T>>> b;

    public static final class Builder<T> {
        public static final /* synthetic */ boolean c = false;
        private final List<Provider<T>> a;
        private final List<Provider<Collection<T>>> b;

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            this.b.add(provider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            this.a.add(provider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.a, this.b);
        }

        private Builder(int i, int i2) {
            this.a = DaggerCollections.presizedList(i);
            this.b = DaggerCollections.presizedList(i2);
        }
    }

    public static <T> Builder<T> builder(int i, int i2) {
        return new Builder<>(i, i2);
    }

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) c;
    }

    private SetFactory(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // javax.inject.Provider
    public Set<T> get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetB = DaggerCollections.b(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSetB.add(Preconditions.checkNotNull(this.a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            Iterator it2 = ((Collection) arrayList.get(i3)).iterator();
            while (it2.hasNext()) {
                hashSetB.add(Preconditions.checkNotNull(it2.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }
}
