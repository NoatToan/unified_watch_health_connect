package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes3.dex */
public class MutablePair<L, R> extends Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;
    public L left;
    public R right;

    public MutablePair() {
    }

    public static <L, R> MutablePair<L, R> of(L l, R r2) {
        return new MutablePair<>(l, r2);
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
        return this.right;
    }

    public void setLeft(L l) {
        this.left = l;
    }

    public void setRight(R r2) {
        this.right = r2;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r2) {
        R right = getRight();
        setRight(r2);
        return right;
    }

    public MutablePair(L l, R r2) {
        this.left = l;
        this.right = r2;
    }
}
