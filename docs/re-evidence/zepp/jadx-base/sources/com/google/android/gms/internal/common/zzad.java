package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad<E> extends a<E> {
    public zzad() {
        super(4);
    }

    public final zzad<E> zzb(E e) {
        super.zza(e);
        return this;
    }

    public final zzad<E> zzc(Iterator<? extends E> it2) {
        while (it2.hasNext()) {
            super.zza(it2.next());
        }
        return this;
    }

    public zzad(int i) {
        super(4);
    }
}
