package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
interface s<N, V> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    void d(N n, V v);

    @NullableDecl
    V e(N n);

    @CanIgnoreReturnValue
    V f(N n);

    void g(N n);

    @CanIgnoreReturnValue
    V h(N n, V v);
}
