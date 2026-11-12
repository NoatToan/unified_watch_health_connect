package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class e<E> extends zzp<E> {
    public static final zzp<Object> d = new e(new Object[0], 0);
    public final transient Object[] c;

    public e(Object[] objArr, int i) {
        this.c = objArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp, com.google.android.gms.internal.play_billing.zzm
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final Object[] e() {
        return this.c;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzj.zza(i, 0, "index");
        return (E) this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
