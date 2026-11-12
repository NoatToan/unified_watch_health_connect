package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes3.dex */
final class p<E> extends o<E> {
    private final zzbs<E> c;

    public p(zzbs<E> zzbsVar, int i) {
        super(zzbsVar.size(), i);
        this.c = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.o
    public final E a(int i) {
        return this.c.get(i);
    }
}
