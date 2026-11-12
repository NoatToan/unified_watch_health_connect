package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class c<E> extends b<E> {
    private final zzp<E> c;

    public c(zzp<E> zzpVar, int i) {
        super(zzpVar.size(), i);
        this.c = zzpVar;
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final E a(int i) {
        return this.c.get(i);
    }
}
