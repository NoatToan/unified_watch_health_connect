package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.core.view.j;
import com.google.protobuf.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzcw extends zzcs implements RandomAccess, zzeo {
    private boolean[] zza;
    private int zzb;

    static {
        new zzcw(new boolean[0], 0, false);
    }

    public zzcw() {
        this(new boolean[10], 0, true);
    }

    private final String zzg(int i14) {
        return k.e(i14, this.zzb, "Index:", ", Size:");
    }

    private final void zzh(int i14) {
        if (i14 < 0 || i14 >= this.zzb) {
            e.v(zzg(i14));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i14 < 0 || i14 > (i15 = this.zzb)) {
            e.v(zzg(i14));
            return;
        }
        int i16 = i14 + 1;
        boolean[] zArr = this.zza;
        if (i15 < zArr.length) {
            System.arraycopy(zArr, i14, zArr, i16, i15 - i14);
        } else {
            boolean[] zArr2 = new boolean[j.a(i15, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i14);
            System.arraycopy(this.zza, i14, zArr2, i16, this.zzb - i14);
            this.zza = zArr2;
        }
        this.zza[i14] = zBooleanValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzcw)) {
            return super.addAll(collection);
        }
        zzcw zzcwVar = (zzcw) collection;
        int i14 = zzcwVar.zzb;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzb;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        boolean[] zArr = this.zza;
        if (i16 > zArr.length) {
            this.zza = Arrays.copyOf(zArr, i16);
        }
        System.arraycopy(zzcwVar.zza, 0, this.zza, this.zzb, zzcwVar.zzb);
        this.zzb = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return super.equals(obj);
        }
        zzcw zzcwVar = (zzcw) obj;
        if (this.zzb != zzcwVar.zzb) {
            return false;
        }
        boolean[] zArr = zzcwVar.zza;
        for (int i14 = 0; i14 < this.zzb; i14++) {
            if (this.zza[i14] != zArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzh(i14);
        return Boolean.valueOf(this.zza[i14]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i14 = 0; i14 < this.zzb; i14++) {
            iZza = (iZza * 31) + zzep.zza(this.zza[i14]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zza[i15] == zBooleanValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zza();
        zzh(i14);
        boolean[] zArr = this.zza;
        boolean z14 = zArr[i14];
        int i15 = this.zzb;
        if (i14 < i15 - 1) {
            System.arraycopy(zArr, i14 + 1, zArr, i14, (i15 - i14) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zza();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.zza;
        System.arraycopy(zArr, i15, zArr, i14, this.zzb - i15);
        this.zzb -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i14);
        boolean[] zArr = this.zza;
        boolean z14 = zArr[i14];
        zArr[i14] = zBooleanValue;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i14) {
        if (i14 >= this.zzb) {
            return new zzcw(Arrays.copyOf(this.zza, i14), this.zzb, true);
        }
        h.w();
        return null;
    }

    public final void zze(boolean z14) {
        zza();
        int i14 = this.zzb;
        boolean[] zArr = this.zza;
        if (i14 == zArr.length) {
            boolean[] zArr2 = new boolean[j.a(i14, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i14);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i15 = this.zzb;
        this.zzb = i15 + 1;
        zArr3[i15] = z14;
    }

    public final boolean zzf(int i14) {
        zzh(i14);
        return this.zza[i14];
    }

    private zzcw(boolean[] zArr, int i14, boolean z14) {
        super(z14);
        this.zza = zArr;
        this.zzb = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
