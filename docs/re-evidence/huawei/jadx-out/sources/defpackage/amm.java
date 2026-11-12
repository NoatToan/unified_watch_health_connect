package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class amm<T> extends Ordering<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Comparator<? super T> f551c;

    public amm(Comparator<? super T> comparator) {
        this.f551c = comparator;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f551c.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amm) {
            return this.f551c.equals(((amm) obj).f551c);
        }
        return false;
    }

    public int hashCode() {
        return this.f551c.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f551c + ".lexicographical()";
    }
}
