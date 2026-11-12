package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class w2 {
    private final Object a;
    private final int b;

    public w2(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return this.a == w2Var.a && this.b == w2Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
