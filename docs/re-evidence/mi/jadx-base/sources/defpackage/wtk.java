package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class wtk extends ich<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wtk f38345a = new wtk();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f38345a;
    }

    @Override // defpackage.ich
    public <S extends Comparable<?>> ich<S> h() {
        return ich.e();
    }

    @Override // defpackage.ich, java.util.Comparator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        c6i.o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // defpackage.ich
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E c(E e, E e2) {
        return (E) big.f4251a.d(e, e2);
    }

    @Override // defpackage.ich
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E d(E e, E e2) {
        return (E) big.f4251a.c(e, e2);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
