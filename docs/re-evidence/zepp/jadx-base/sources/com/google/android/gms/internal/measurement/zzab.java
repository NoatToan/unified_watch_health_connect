package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzab {
    private zzaa a;
    private zzaa b;
    private final List<zzaa> c;

    public zzab() {
        this.a = new zzaa("", 0L, null);
        this.b = new zzaa("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzabVar = new zzab(this.a.clone());
        Iterator<zzaa> it2 = this.c.iterator();
        while (it2.hasNext()) {
            zzabVar.c.add(it2.next().clone());
        }
        return zzabVar;
    }

    public final zzaa zza() {
        return this.a;
    }

    public final zzaa zzb() {
        return this.b;
    }

    public final List<zzaa> zzc() {
        return this.c;
    }

    public final void zzd(zzaa zzaaVar) {
        this.a = zzaaVar;
        this.b = zzaaVar.clone();
        this.c.clear();
    }

    public final void zze(String str, long j, Map<String, Object> map) {
        this.c.add(new zzaa(str, j, map));
    }

    public final void zzf(zzaa zzaaVar) {
        this.b = zzaaVar;
    }

    public zzab(zzaa zzaaVar) {
        this.a = zzaaVar;
        this.b = zzaaVar.clone();
        this.c = new ArrayList();
    }
}
