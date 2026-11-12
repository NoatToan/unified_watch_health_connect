package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzna extends zzku implements RandomAccess, zzmn, zznt {
    private static final long[] zza;
    private static final zzna zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzna(jArr, 0, false);
    }

    public zzna() {
        this(zza, 0, true);
    }

    public static zzna zze() {
        return zzb;
    }

    private static int zzi(int i14) {
        return Math.max(((i14 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i14) {
        if (i14 < 0 || i14 >= this.zzd) {
            e.v(zzk(i14));
        }
    }

    private final String zzk(int i14) {
        return zzkw.zza(this.zzd, i14, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        long jLongValue = ((Long) obj).longValue();
        zzcF();
        if (i14 < 0 || i14 > (i15 = this.zzd)) {
            e.v(zzk(i14));
            return;
        }
        int i16 = i14 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i15 < length) {
            System.arraycopy(jArr, i14, jArr, i16, i15 - i14);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i14);
            System.arraycopy(this.zzc, i14, jArr2, i16, this.zzd - i14);
            this.zzc = jArr2;
        }
        this.zzc[i14] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzna)) {
            return super.addAll(collection);
        }
        zzna zznaVar = (zzna) collection;
        int i14 = zznaVar.zzd;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzd;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        long[] jArr = this.zzc;
        if (i16 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i16);
        }
        System.arraycopy(zznaVar.zzc, 0, this.zzc, this.zzd, zznaVar.zzd);
        this.zzd = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzna)) {
            return super.equals(obj);
        }
        zzna zznaVar = (zzna) obj;
        if (this.zzd != zznaVar.zzd) {
            return false;
        }
        long[] jArr = zznaVar.zzc;
        for (int i14 = 0; i14 < this.zzd; i14++) {
            if (this.zzc[i14] != jArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzj(i14);
        return Long.valueOf(this.zzc[i14]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.zzd; i15++) {
            long j8 = this.zzc[i15];
            byte[] bArr = zzmp.zzb;
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
        int i14 = this.zzd;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zzc[i15] == jLongValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zzcF();
        zzj(i14);
        long[] jArr = this.zzc;
        long j8 = jArr[i14];
        int i15 = this.zzd;
        if (i14 < i15 - 1) {
            System.arraycopy(jArr, i14 + 1, jArr, i14, (i15 - i14) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zzcF();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i15, jArr, i14, this.zzd - i15);
        this.zzd -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zzcF();
        zzj(i14);
        long[] jArr = this.zzc;
        long j8 = jArr[i14];
        jArr[i14] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final long zzc(int i14) {
        zzj(i14);
        return this.zzc[i14];
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzd */
    public final zzmn zzg(int i14) {
        if (i14 >= this.zzd) {
            return new zzna(i14 == 0 ? zza : Arrays.copyOf(this.zzc, i14), this.zzd, true);
        }
        h.w();
        return null;
    }

    public final void zzf(long j8) {
        zzcF();
        int i14 = this.zzd;
        int length = this.zzc.length;
        if (i14 == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i15 = this.zzd;
        this.zzd = i15 + 1;
        jArr2[i15] = j8;
    }

    public final void zzh(int i14) {
        int length = this.zzc.length;
        if (i14 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i14, 10)];
            return;
        }
        while (length < i14) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzna(long[] jArr, int i14, boolean z14) {
        super(z14);
        this.zzc = jArr;
        this.zzd = i14;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
