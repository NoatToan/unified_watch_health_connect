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
final class zzfb extends zzcs implements RandomAccess, zzeo {
    private long[] zza;
    private int zzb;

    static {
        new zzfb(new long[0], 0, false);
    }

    public zzfb() {
        this(new long[10], 0, true);
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
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i14 < 0 || i14 > (i15 = this.zzb)) {
            e.v(zzg(i14));
            return;
        }
        int i16 = i14 + 1;
        long[] jArr = this.zza;
        if (i15 < jArr.length) {
            System.arraycopy(jArr, i14, jArr, i16, i15 - i14);
        } else {
            long[] jArr2 = new long[j.a(i15, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            System.arraycopy(this.zza, i14, jArr2, i16, this.zzb - i14);
            this.zza = jArr2;
        }
        this.zza[i14] = jLongValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzfb)) {
            return super.addAll(collection);
        }
        zzfb zzfbVar = (zzfb) collection;
        int i14 = zzfbVar.zzb;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzb;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        long[] jArr = this.zza;
        if (i16 > jArr.length) {
            this.zza = Arrays.copyOf(jArr, i16);
        }
        System.arraycopy(zzfbVar.zza, 0, this.zza, this.zzb, zzfbVar.zzb);
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
        if (!(obj instanceof zzfb)) {
            return super.equals(obj);
        }
        zzfb zzfbVar = (zzfb) obj;
        if (this.zzb != zzfbVar.zzb) {
            return false;
        }
        long[] jArr = zzfbVar.zza;
        for (int i14 = 0; i14 < this.zzb; i14++) {
            if (this.zza[i14] != jArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzh(i14);
        return Long.valueOf(this.zza[i14]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            long j8 = this.zza[i15];
            byte[] bArr = zzep.zzb;
            i14 = (i14 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zza[i15] == jLongValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zza();
        zzh(i14);
        long[] jArr = this.zza;
        long j8 = jArr[i14];
        int i15 = this.zzb;
        if (i14 < i15 - 1) {
            System.arraycopy(jArr, i14 + 1, jArr, i14, (i15 - i14) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zza();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.zza;
        System.arraycopy(jArr, i15, jArr, i14, this.zzb - i15);
        this.zzb -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i14);
        long[] jArr = this.zza;
        long j8 = jArr[i14];
        jArr[i14] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i14) {
        if (i14 >= this.zzb) {
            return new zzfb(Arrays.copyOf(this.zza, i14), this.zzb, true);
        }
        h.w();
        return null;
    }

    public final long zze(int i14) {
        zzh(i14);
        return this.zza[i14];
    }

    public final void zzf(long j8) {
        zza();
        int i14 = this.zzb;
        long[] jArr = this.zza;
        if (i14 == jArr.length) {
            long[] jArr2 = new long[j.a(i14, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            this.zza = jArr2;
        }
        long[] jArr3 = this.zza;
        int i15 = this.zzb;
        this.zzb = i15 + 1;
        jArr3[i15] = j8;
    }

    private zzfb(long[] jArr, int i14, boolean z14) {
        super(z14);
        this.zza = jArr;
        this.zzb = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
