package com.xiaomi.common;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Pair<L, R> implements Map.Entry<L, R>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    public Pair(L l, R r2) {
        this.left = l;
        this.right = r2;
    }

    public static <L, R> Pair<L, R> of(L l, R r2) {
        return new Pair<>(l, r2);
    }

    @Override // java.util.Map.Entry
    public L getKey() {
        return this.left;
    }

    public L getLeft() {
        return this.left;
    }

    public R getRight() {
        return this.right;
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return this.right;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r2) {
        throw new UnsupportedOperationException();
    }
}
