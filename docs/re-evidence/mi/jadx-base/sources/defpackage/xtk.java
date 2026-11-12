package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class xtk<T> extends ich<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ich<? super T> f39461a;

    public xtk(ich<? super T> ichVar) {
        this.f39461a = (ich) c6i.o(ichVar);
    }

    @Override // defpackage.ich
    public <E extends T> E c(E e, E e2) {
        return (E) this.f39461a.d(e, e2);
    }

    @Override // defpackage.ich, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f39461a.compare(t2, t);
    }

    @Override // defpackage.ich
    public <E extends T> E d(E e, E e2) {
        return (E) this.f39461a.c(e, e2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xtk) {
            return this.f39461a.equals(((xtk) obj).f39461a);
        }
        return false;
    }

    @Override // defpackage.ich
    public <S extends T> ich<S> h() {
        return this.f39461a;
    }

    public int hashCode() {
        return -this.f39461a.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f39461a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
