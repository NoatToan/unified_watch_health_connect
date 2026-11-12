package org.apache.commons.lang3.tuple;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ImmutablePair<L, R> extends Pair<L, R> {
    public static final ImmutablePair<?, ?>[] EMPTY_ARRAY = new ImmutablePair[0];
    private static final ImmutablePair NULL = of((Object) null, (Object) null);
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    public ImmutablePair(L l14, R r14) {
        this.left = l14;
        this.right = r14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> ImmutablePair<L, R>[] emptyArray() {
        return (ImmutablePair<L, R>[]) EMPTY_ARRAY;
    }

    public static <L, R> Pair<L, R> left(L l14) {
        return of((Object) l14, (Object) null);
    }

    public static <L, R> ImmutablePair<L, R> nullPair() {
        return NULL;
    }

    public static <L, R> ImmutablePair<L, R> of(Map.Entry<L, R> entry) {
        L key;
        R value;
        if (entry != null) {
            key = entry.getKey();
            value = entry.getValue();
        } else {
            key = null;
            value = null;
        }
        return new ImmutablePair<>(key, value);
    }

    public static <L, R> Pair<L, R> right(R r14) {
        return of((Object) null, (Object) r14);
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
    public R setValue(R r14) {
        throw new UnsupportedOperationException();
    }

    public static <L, R> ImmutablePair<L, R> of(L l14, R r14) {
        return new ImmutablePair<>(l14, r14);
    }
}
