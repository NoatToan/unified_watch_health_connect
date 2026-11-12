package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzky extends zzku implements RandomAccess, zzmh, zznt {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzky(zArr, 0, false);
    }

    public zzky() {
        this(zza, 0, true);
    }

    private static int zzh(int i14) {
        return Math.max(((i14 * 3) / 2) + 1, 10);
    }

    private final void zzi(int i14) {
        if (i14 < 0 || i14 >= this.zzc) {
            e.v(zzj(i14));
        }
    }

    private final String zzj(int i14) {
        return zzkw.zza(this.zzc, i14, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzcF();
        if (i14 < 0 || i14 > (i15 = this.zzc)) {
            e.v(zzj(i14));
            return;
        }
        int i16 = i14 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i15 < length) {
            System.arraycopy(zArr, i14, zArr, i16, i15 - i14);
        } else {
            boolean[] zArr2 = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i14);
            System.arraycopy(this.zzb, i14, zArr2, i16, this.zzc - i14);
            this.zzb = zArr2;
        }
        this.zzb[i14] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzky)) {
            return super.addAll(collection);
        }
        zzky zzkyVar = (zzky) collection;
        int i14 = zzkyVar.zzc;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzc;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        boolean[] zArr = this.zzb;
        if (i16 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i16);
        }
        System.arraycopy(zzkyVar.zzb, 0, this.zzb, this.zzc, zzkyVar.zzc);
        this.zzc = i16;
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
        if (!(obj instanceof zzky)) {
            return super.equals(obj);
        }
        zzky zzkyVar = (zzky) obj;
        if (this.zzc != zzkyVar.zzc) {
            return false;
        }
        boolean[] zArr = zzkyVar.zzb;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            if (this.zzb[i14] != zArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzi(i14);
        return Boolean.valueOf(this.zzb[i14]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            iZzb = (iZzb * 31) + zzmp.zzb(this.zzb[i14]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i14 = this.zzc;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zzb[i15] == zBooleanValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zzcF();
        zzi(i14);
        boolean[] zArr = this.zzb;
        boolean z14 = zArr[i14];
        int i15 = this.zzc;
        if (i14 < i15 - 1) {
            System.arraycopy(zArr, i14 + 1, zArr, i14, (i15 - i14) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zzcF();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i15, zArr, i14, this.zzc - i15);
        this.zzc -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzcF();
        zzi(i14);
        boolean[] zArr = this.zzb;
        boolean z14 = zArr[i14];
        zArr[i14] = zBooleanValue;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzd */
    public final zzmh zzg(int i14) {
        if (i14 >= this.zzc) {
            return new zzky(i14 == 0 ? zza : Arrays.copyOf(this.zzb, i14), this.zzc, true);
        }
        h.w();
        return null;
    }

    public final boolean zze(int i14) {
        zzi(i14);
        return this.zzb[i14];
    }

    public final void zzf(boolean z14) {
        zzcF();
        int i14 = this.zzc;
        int length = this.zzb.length;
        if (i14 == length) {
            boolean[] zArr = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i15 = this.zzc;
        this.zzc = i15 + 1;
        zArr2[i15] = z14;
    }

    private zzky(boolean[] zArr, int i14, boolean z14) {
        super(z14);
        this.zzb = zArr;
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Boolean) obj).booleanValue());
        return true;
    }
}
