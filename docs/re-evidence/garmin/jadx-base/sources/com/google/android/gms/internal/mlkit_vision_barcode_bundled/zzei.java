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
final class zzei extends zzcs implements RandomAccess, zzen {
    private static final zzei zza = new zzei(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzei() {
        this(new int[10], 0, true);
    }

    public static zzei zzf() {
        return zza;
    }

    private final String zzh(int i14) {
        return k.e(i14, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i14) {
        if (i14 < 0 || i14 >= this.zzc) {
            e.v(zzh(i14));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i14 < 0 || i14 > (i15 = this.zzc)) {
            e.v(zzh(i14));
            return;
        }
        int i16 = i14 + 1;
        int[] iArr = this.zzb;
        if (i15 < iArr.length) {
            System.arraycopy(iArr, i14, iArr, i16, i15 - i14);
        } else {
            int[] iArr2 = new int[j.a(i15, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            System.arraycopy(this.zzb, i14, iArr2, i16, this.zzc - i14);
            this.zzb = iArr2;
        }
        this.zzb[i14] = iIntValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzei)) {
            return super.addAll(collection);
        }
        zzei zzeiVar = (zzei) collection;
        int i14 = zzeiVar.zzc;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzc;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        int[] iArr = this.zzb;
        if (i16 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i16);
        }
        System.arraycopy(zzeiVar.zzb, 0, this.zzb, this.zzc, zzeiVar.zzc);
        this.zzc = i16;
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
        if (!(obj instanceof zzei)) {
            return super.equals(obj);
        }
        zzei zzeiVar = (zzei) obj;
        if (this.zzc != zzeiVar.zzc) {
            return false;
        }
        int[] iArr = zzeiVar.zzb;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            if (this.zzb[i14] != iArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzi(i14);
        return Integer.valueOf(this.zzb[i14]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.zzc; i15++) {
            i14 = (i14 * 31) + this.zzb[i15];
        }
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i14 = this.zzc;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zzb[i15] == iIntValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zza();
        zzi(i14);
        int[] iArr = this.zzb;
        int i15 = iArr[i14];
        int i16 = this.zzc;
        if (i14 < i16 - 1) {
            System.arraycopy(iArr, i14 + 1, iArr, i14, (i16 - i14) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zza();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i15, iArr, i14, this.zzc - i15);
        this.zzc -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzi(i14);
        int[] iArr = this.zzb;
        int i15 = iArr[i14];
        iArr[i14] = iIntValue;
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i14) {
        if (i14 >= this.zzc) {
            return new zzei(Arrays.copyOf(this.zzb, i14), this.zzc, true);
        }
        h.w();
        return null;
    }

    public final int zze(int i14) {
        zzi(i14);
        return this.zzb[i14];
    }

    public final void zzg(int i14) {
        zza();
        int i15 = this.zzc;
        int[] iArr = this.zzb;
        if (i15 == iArr.length) {
            int[] iArr2 = new int[j.a(i15, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i16 = this.zzc;
        this.zzc = i16 + 1;
        iArr3[i16] = i14;
    }

    private zzei(int[] iArr, int i14, boolean z14) {
        super(z14);
        this.zzb = iArr;
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }
}
