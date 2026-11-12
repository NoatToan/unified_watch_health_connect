package com.google.android.gms.internal.common;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class c extends zzag {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzag e;

    public c(zzag zzagVar, int i, int i2) {
        this.e = zzagVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @CheckForNull
    public final Object[] f() {
        return this.e.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.zza(i, this.d, "index");
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* JADX INFO: renamed from: zzh */
    public final zzag subList(int i, int i2) {
        zzs.zzc(i, i2, this.d);
        zzag zzagVar = this.e;
        int i3 = this.c;
        return zzagVar.subList(i + i3, i2 + i3);
    }
}
