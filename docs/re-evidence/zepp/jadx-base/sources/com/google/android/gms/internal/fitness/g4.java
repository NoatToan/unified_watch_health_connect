package com.google.android.gms.internal.fitness;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes3.dex */
final class g4<K, V> implements Iterator<Map.Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ y3 d;

    private g4(y3 y3Var) {
        this.d = y3Var;
        this.a = -1;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        return i < this.d.b.size() ? (Map.Entry) this.d.b.get(this.a) : a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.q();
        if (this.a >= this.d.b.size()) {
            a().remove();
            return;
        }
        y3 y3Var = this.d;
        int i = this.a;
        this.a = i - 1;
        y3Var.i(i);
    }

    public /* synthetic */ g4(y3 y3Var, b4 b4Var) {
        this(y3Var);
    }
}
