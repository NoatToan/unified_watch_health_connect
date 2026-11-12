package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx {
    private final zzo a;
    private final boolean b;
    private final m c;

    private zzx(m mVar, boolean z, zzo zzoVar, int i, byte[] bArr) {
        this.c = mVar;
        this.b = z;
        this.a = zzoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> d(CharSequence charSequence) {
        return new l(this.c, this, charSequence);
    }

    public static zzx zzc(zzo zzoVar) {
        return new zzx(new m(zzoVar), false, j.b, Integer.MAX_VALUE, null);
    }

    public final zzx zzb() {
        return new zzx(this.c, true, this.a, Integer.MAX_VALUE, null);
    }

    public final Iterable<String> zzd(CharSequence charSequence) {
        return new n(this, charSequence);
    }

    public final List<String> zzf(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator<String> itD = d(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itD.hasNext()) {
            arrayList.add(itD.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
