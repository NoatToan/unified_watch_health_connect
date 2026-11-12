package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s6d<E> extends ImmutableList<E> {

    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableCollection<?> f33342a;

        public a(ImmutableCollection<?> immutableCollection) {
            this.f33342a = immutableCollection;
        }

        public Object readResolve() {
            return this.f33342a.asList();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return e().contains(obj);
    }

    public abstract ImmutableCollection<E> e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return e().isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return e().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return e().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new a(e());
    }
}
