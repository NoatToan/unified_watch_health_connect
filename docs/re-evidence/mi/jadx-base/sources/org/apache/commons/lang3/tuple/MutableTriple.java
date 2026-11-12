package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes3.dex */
public class MutableTriple<L, M, R> extends Triple<L, M, R> {
    private static final long serialVersionUID = 1;
    public L left;
    public M middle;
    public R right;

    public MutableTriple() {
    }

    public static <L, M, R> MutableTriple<L, M, R> of(L l, M m, R r2) {
        return new MutableTriple<>(l, m, r2);
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

    public void setLeft(L l) {
        this.left = l;
    }

    public void setMiddle(M m) {
        this.middle = m;
    }

    public void setRight(R r2) {
        this.right = r2;
    }

    public MutableTriple(L l, M m, R r2) {
        this.left = l;
        this.middle = m;
        this.right = r2;
    }
}
