package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes3.dex */
final class b<E> extends p<E> {
    private final zzag<E> c;

    public b(zzag<E> zzagVar, int i) {
        super(zzagVar.size(), i);
        this.c = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.p
    public final E a(int i) {
        return this.c.get(i);
    }
}
