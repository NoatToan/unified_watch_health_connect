package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes3.dex */
abstract class c<N> {
    public final boolean a;
    public boolean b = false;
    public ElementOrder<N> c = ElementOrder.insertion();
    public Optional<Integer> d = Optional.absent();

    public c(boolean z) {
        this.a = z;
    }
}
