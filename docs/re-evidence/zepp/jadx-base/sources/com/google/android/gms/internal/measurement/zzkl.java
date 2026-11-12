package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkl extends e2<String> implements RandomAccess, zzkm {
    private static final zzkl c;
    public static final zzkm zza;
    private final List<Object> b;

    static {
        zzkl zzklVar = new zzkl(10);
        c = zzklVar;
        zzklVar.zzb();
        zza = zzklVar;
    }

    public zzkl() {
        this(10);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzix ? ((zzix) obj).zzn(zzkf.b) : zzkf.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.e2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.e2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbM();
        if (collection instanceof zzkm) {
            collection = ((zzkm) collection).zzh();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.e2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbM();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.e2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return a(objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.e2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return a(this.b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final /* bridge */ /* synthetic */ zzke zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new zzkl((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zze() {
        return zzc() ? new zzmg(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzf(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzix) {
            zzix zzixVar = (zzix) obj;
            String strZzn = zzixVar.zzn(zzkf.b);
            if (zzixVar.zzi()) {
                this.b.set(i, strZzn);
            }
            return strZzn;
        }
        byte[] bArr = (byte[]) obj;
        String strZzh = zzkf.zzh(bArr);
        if (zzkf.zzi(bArr)) {
            this.b.set(i, strZzh);
        }
        return strZzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzi(zzix zzixVar) {
        zzbM();
        this.b.add(zzixVar);
        ((AbstractList) this).modCount++;
    }

    public zzkl(int i) {
        this.b = new ArrayList(i);
    }

    private zzkl(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.e2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
