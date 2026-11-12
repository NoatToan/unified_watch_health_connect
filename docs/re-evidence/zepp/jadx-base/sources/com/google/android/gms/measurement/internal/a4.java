package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a4 {
    public zzfy a;
    public List<Long> b;
    public List<zzfo> c;
    public long d;
    public final /* synthetic */ zzks e;

    public /* synthetic */ a4(zzks zzksVar, zzkq zzkqVar) {
        this.e = zzksVar;
    }

    private static final long b(zzfo zzfoVar) {
        return ((zzfoVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean a(long j, zzfo zzfoVar) {
        Preconditions.checkNotNull(zzfoVar);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.size() > 0 && b(this.c.get(0)) != b(zzfoVar)) {
            return false;
        }
        long jZzbt = this.d + ((long) zzfoVar.zzbt());
        this.e.zzg();
        if (jZzbt >= Math.max(0, zzdy.zzh.zza(null).intValue())) {
            return false;
        }
        this.d = jZzbt;
        this.c.add(zzfoVar);
        this.b.add(Long.valueOf(j));
        int size = this.c.size();
        this.e.zzg();
        return size < Math.max(1, zzdy.zzi.zza(null).intValue());
    }
}
