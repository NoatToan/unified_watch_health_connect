package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class big extends ich<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final big f4251a = new big();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f4251a;
    }

    @Override // defpackage.ich
    public <S extends Comparable<?>> ich<S> h() {
        return wtk.f38345a;
    }

    @Override // defpackage.ich, java.util.Comparator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        c6i.o(comparable);
        c6i.o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
