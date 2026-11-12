package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes3.dex */
public class MutableTriple<L, M, R> extends Triple<L, M, R> {
    public static final MutableTriple<?, ?, ?>[] EMPTY_ARRAY = new MutableTriple[0];
    private static final long serialVersionUID = 1;
    public L left;
    public M middle;
    public R right;

    public MutableTriple(L l14, M m14, R r14) {
        this.left = l14;
        this.middle = m14;
        this.right = r14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> MutableTriple<L, M, R>[] emptyArray() {
        return (MutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }

    public static <L, M, R> MutableTriple<L, M, R> of(L l14, M m14, R r14) {
        return new MutableTriple<>(l14, m14, r14);
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M getMiddle() {
        return this.middle;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R getRight() {
        return this.right;
    }

    public void setLeft(L l14) {
        this.left = l14;
    }

    public void setMiddle(M m14) {
        this.middle = m14;
    }

    public void setRight(R r14) {
        this.right = r14;
    }

    public MutableTriple() {
    }
}
