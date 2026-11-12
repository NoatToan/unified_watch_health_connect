package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
interface e<K, V> {
    a.a0<K, V> a();

    @NullableDecl
    e<K, V> b();

    int c();

    void e(e<K, V> eVar);

    e<K, V> f();

    void g(a.a0<K, V> a0Var);

    @NullableDecl
    K getKey();

    long h();

    void i(long j);

    void j(long j);

    e<K, V> k();

    e<K, V> m();

    e<K, V> n();

    long o();

    void p(e<K, V> eVar);

    void q(e<K, V> eVar);

    void r(e<K, V> eVar);
}
