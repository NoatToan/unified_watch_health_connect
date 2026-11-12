package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class i4 implements Iterator<Map.Entry> {
    private int a = -1;
    private boolean b;
    private Iterator<Map.Entry> c;
    public final /* synthetic */ k4 d;

    public /* synthetic */ i4(k4 k4Var, d4 d4Var) {
        this.d = k4Var;
    }

    private final Iterator<Map.Entry> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a + 1 >= this.d.b.size()) {
            return !this.d.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
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
        this.d.o();
        if (this.a >= this.d.b.size()) {
            a().remove();
            return;
        }
        k4 k4Var = this.d;
        int i = this.a;
        this.a = i - 1;
        k4Var.m(i);
    }
}
