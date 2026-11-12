package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class o94<T> extends ich<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<T> f28883a;

    public o94(Comparator<T> comparator) {
        this.f28883a = (Comparator) c6i.o(comparator);
    }

    @Override // defpackage.ich, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f28883a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o94) {
            return this.f28883a.equals(((o94) obj).f28883a);
        }
        return false;
    }

    public int hashCode() {
        return this.f28883a.hashCode();
    }

    public String toString() {
        return this.f28883a.toString();
    }
}
