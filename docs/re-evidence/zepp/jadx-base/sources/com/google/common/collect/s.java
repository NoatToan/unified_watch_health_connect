package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class s<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Function<F, ? extends T> c;
    public final Ordering<T> d;

    public s(Function<F, ? extends T> function, Ordering<T> ordering) {
        this.c = (Function) Preconditions.checkNotNull(function);
        this.d = (Ordering) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f, F f2) {
        return this.d.compare(this.c.apply(f), this.c.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.c.equals(sVar.c) && this.d.equals(sVar.d);
    }

    public int hashCode() {
        return Objects.hashCode(this.c, this.d);
    }

    public String toString() {
        return this.d + ".onResultOf(" + this.c + ")";
    }
}
