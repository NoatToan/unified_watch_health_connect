package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
interface x<N, E> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    N d(E e);

    Set<E> e();

    @CanIgnoreReturnValue
    N f(E e);

    Set<E> g();

    @CanIgnoreReturnValue
    N h(E e, boolean z);

    void i(E e, N n);

    void j(E e, N n, boolean z);

    Set<E> k();

    Set<E> l(N n);
}
