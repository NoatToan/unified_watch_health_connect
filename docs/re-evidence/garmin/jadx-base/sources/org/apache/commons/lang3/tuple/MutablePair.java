package org.apache.commons.lang3.tuple;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MutablePair<L, R> extends Pair<L, R> {
    public static final MutablePair<?, ?>[] EMPTY_ARRAY = new MutablePair[0];
    private static final long serialVersionUID = 4954918890077093841L;
    public L left;
    public R right;

    public MutablePair(L l14, R r14) {
        this.left = l14;
        this.right = r14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> MutablePair<L, R>[] emptyArray() {
        return (MutablePair<L, R>[]) EMPTY_ARRAY;
    }

    public static <L, R> MutablePair<L, R> of(Map.Entry<L, R> entry) {
        L key;
        R value;
        if (entry != null) {
            key = entry.getKey();
            value = entry.getValue();
        } else {
            key = null;
            value = null;
        }
        return new MutablePair<>(key, value);
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
        return this.right;
    }

    public void setLeft(L l14) {
        this.left = l14;
    }

    public void setRight(R r14) {
        this.right = r14;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r14) {
        R right = getRight();
        setRight(r14);
        return right;
    }

    public MutablePair() {
    }

    public static <L, R> MutablePair<L, R> of(L l14, R r14) {
        return new MutablePair<>(l14, r14);
    }
}
