package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class q1<E> extends o1<E> {
    private final zzfc<E> c;

    public q1(zzfc<E> zzfcVar, int i) {
        super(zzfcVar.size(), i);
        this.c = zzfcVar;
    }

    @Override // com.google.android.gms.internal.fitness.o1
    public final E a(int i) {
        return this.c.get(i);
    }
}
