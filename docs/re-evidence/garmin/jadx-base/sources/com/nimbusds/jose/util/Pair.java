package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.jcip.Immutable;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class Pair<L, R> {
    private final L left;
    private final R right;

    public Pair(L l14, R r14) {
        this.left = l14;
        this.right = r14;
    }

    public static <L, R> Pair<L, R> of(L l14, R r14) {
        return new Pair<>(l14, r14);
    }

    public L getLeft() {
        return this.left;
    }

    public R getRight() {
        return this.right;
    }
}
