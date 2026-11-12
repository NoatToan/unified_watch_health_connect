package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class d extends zzp {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzp e;

    public d(zzp zzpVar, int i, int i2) {
        this.e = zzpVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final Object[] e() {
        return this.e.e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzj.zza(i, this.d, "index");
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzp
    /* JADX INFO: renamed from: zzf */
    public final zzp subList(int i, int i2) {
        zzj.zzc(i, i2, this.d);
        zzp zzpVar = this.e;
        int i3 = this.c;
        return zzpVar.subList(i + i3, i2 + i3);
    }
}
