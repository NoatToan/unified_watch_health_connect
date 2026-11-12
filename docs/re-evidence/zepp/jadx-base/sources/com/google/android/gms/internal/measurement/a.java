package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Iterator<zzap> {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ Iterator b;

    public a(zzae zzaeVar, Iterator it2, Iterator it3) {
        this.a = it2;
        this.b = it3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzap next() {
        if (this.a.hasNext()) {
            return new zzat(((Integer) this.a.next()).toString());
        }
        if (this.b.hasNext()) {
            return new zzat((String) this.b.next());
        }
        throw new NoSuchElementException();
    }
}
