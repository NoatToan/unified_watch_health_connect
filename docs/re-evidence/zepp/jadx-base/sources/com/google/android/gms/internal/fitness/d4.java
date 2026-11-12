package com.google.android.gms.internal.fitness;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d4 extends j4 {
    private final /* synthetic */ y3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private d4(y3 y3Var) {
        super(y3Var, null);
        this.b = y3Var;
    }

    @Override // com.google.android.gms.internal.fitness.j4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new a4(this.b, null);
    }

    public /* synthetic */ d4(y3 y3Var, b4 b4Var) {
        this(y3Var);
    }
}
