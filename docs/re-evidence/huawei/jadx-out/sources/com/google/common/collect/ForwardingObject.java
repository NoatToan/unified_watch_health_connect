package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingObject {
    protected abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
