package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.core.view.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzfv extends zzcs implements RandomAccess {
    private static final zzfv zza = new zzfv(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzfv() {
        this(new Object[10], 0, true);
    }

    public static zzfv zze() {
        return zza;
    }

    private final String zzf(int i14) {
        return k.e(i14, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i14) {
        if (i14 < 0 || i14 >= this.zzc) {
            e.v(zzf(i14));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        zza();
        if (i14 < 0 || i14 > (i15 = this.zzc)) {
            e.v(zzf(i14));
            return;
        }
        int i16 = i14 + 1;
        Object[] objArr = this.zzb;
        if (i15 < objArr.length) {
            System.arraycopy(objArr, i14, objArr, i16, i15 - i14);
        } else {
            Object[] objArr2 = new Object[j.a(i15, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i14);
            System.arraycopy(this.zzb, i14, objArr2, i16, this.zzc - i14);
            this.zzb = objArr2;
        }
        this.zzb[i14] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        zzg(i14);
        return this.zzb[i14];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        zza();
        zzg(i14);
        Object[] objArr = this.zzb;
        Object obj = objArr[i14];
        int i15 = this.zzc;
        if (i14 < i15 - 1) {
            System.arraycopy(objArr, i14 + 1, objArr, i14, (i15 - i14) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        zza();
        zzg(i14);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i14];
        objArr[i14] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i14) {
        if (i14 >= this.zzc) {
            return new zzfv(Arrays.copyOf(this.zzb, i14), this.zzc, true);
        }
        h.w();
        return null;
    }

    private zzfv(Object[] objArr, int i14, boolean z14) {
        super(z14);
        this.zzb = objArr;
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i14 = this.zzc;
        Object[] objArr = this.zzb;
        if (i14 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i14 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i15 = this.zzc;
        this.zzc = i15 + 1;
        objArr2[i15] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
