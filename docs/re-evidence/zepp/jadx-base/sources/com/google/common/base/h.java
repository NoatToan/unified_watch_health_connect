package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class h<T> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    public final Equivalence<? super T> a;

    public h(Equivalence<? super T> equivalence) {
        this.a = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it2 = iterable.iterator();
        Iterator<T> it3 = iterable2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            if (!this.a.equivalent(it2.next(), it3.next())) {
                return false;
            }
        }
        return (it2.hasNext() || it3.hasNext()) ? false : true;
    }

    @Override // com.google.common.base.Equivalence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int doHash(Iterable<T> iterable) {
        Iterator<T> it2 = iterable.iterator();
        int iHash = 78721;
        while (it2.hasNext()) {
            iHash = (iHash * 24943) + this.a.hash(it2.next());
        }
        return iHash;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof h) {
            return this.a.equals(((h) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.a + ".pairwise()";
    }
}
