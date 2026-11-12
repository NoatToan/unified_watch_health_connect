package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes3.dex */
public final class ImmutablePair<L, R> extends Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    public ImmutablePair(L l, R r2) {
        this.left = l;
        this.right = r2;
    }

    public static <L, R> ImmutablePair<L, R> of(L l, R r2) {
        return new ImmutablePair<>(l, r2);
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
        return this.right;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r2) {
        throw new UnsupportedOperationException();
    }
}
