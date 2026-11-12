package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r7d<E> extends ImmutableSet<E> {

    public class a extends ImmutableList<E> {
        public a() {
        }

        @Override // java.util.List
        public E get(int i) {
            return (E) r7d.this.get(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return r7d.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return r7d.this.size();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
        return new a();
    }

    public abstract E get(int i);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<E> iterator() {
        return asList().iterator();
    }
}
