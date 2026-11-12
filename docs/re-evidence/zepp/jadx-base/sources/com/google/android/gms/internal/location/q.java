package com.google.android.gms.internal.location;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class q extends zzbs {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzbs e;

    public q(zzbs zzbsVar, int i, int i2) {
        this.e = zzbsVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] a() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int b() {
        return this.e.b() + this.c;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int c() {
        return this.e.b() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.zza(i, this.d, "index");
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* JADX INFO: renamed from: zzh */
    public final zzbs subList(int i, int i2) {
        zzbm.zzc(i, i2, this.d);
        zzbs zzbsVar = this.e;
        int i3 = this.c;
        return zzbsVar.subList(i + i3, i2 + i3);
    }
}
