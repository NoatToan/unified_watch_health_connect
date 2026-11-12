package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.IndexedImmutableSet;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class and<E> extends ImmutableMultiset<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final and<Object> f588b = new and<>(amt.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient amt<E> f589a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<E> f590c;
    private final transient int d;

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    public and(amt<E> amtVar) {
        this.f589a = amtVar;
        long jE = 0;
        for (int i = 0; i < amtVar.a(); i++) {
            jE += (long) amtVar.e(i);
        }
        this.d = Ints.a(jE);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        return this.f589a.b(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f590c;
        if (immutableSet != null) {
            return immutableSet;
        }
        c cVar = new c();
        this.f590c = cVar;
        return cVar;
    }

    final class c extends IndexedImmutableSet<E> {
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        private c() {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i) {
            return and.this.f589a.b(i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return and.this.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return and.this.f589a.a();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        return this.f589a.a(i);
    }

    static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int[] f591b;
        final Object[] e;

        d(Multiset<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.e = new Object[size];
            this.f591b = new int[size];
            int i = 0;
            for (Multiset.Entry<? extends Object> entry : multiset.entrySet()) {
                this.e[i] = entry.getElement();
                this.f591b[i] = entry.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            ImmutableMultiset.a aVar = new ImmutableMultiset.a(this.e.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.e;
                if (i < objArr.length) {
                    aVar.d(objArr[i], this.f591b[i]);
                    i++;
                } else {
                    return aVar.build();
                }
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new d(this);
    }
}
