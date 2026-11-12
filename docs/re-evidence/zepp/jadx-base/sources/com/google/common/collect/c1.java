package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
abstract class c1<E> extends ImmutableList<E> {

    @GwtIncompatible
    public static class a implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableCollection<?> a;

        public a(ImmutableCollection<?> immutableCollection) {
            this.a = immutableCollection;
        }

        public Object readResolve() {
            return this.a.asList();
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return k().contains(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return k().f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return k().isEmpty();
    }

    public abstract ImmutableCollection<E> k();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return k().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new a(k());
    }
}
