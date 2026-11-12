package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ali<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<T> f505a;

    public ali(Comparator<T> comparator) {
        this.f505a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.f505a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ali) {
            return this.f505a.equals(((ali) obj).f505a);
        }
        return false;
    }

    public int hashCode() {
        return this.f505a.hashCode();
    }

    public String toString() {
        return this.f505a.toString();
    }
}
