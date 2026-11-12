package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzmg extends zzku implements RandomAccess, zzmm, zznt {
    private static final int[] zza;
    private static final zzmg zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzmg(iArr, 0, false);
    }

    public zzmg() {
        this(zza, 0, true);
    }

    public static zzmg zzd() {
        return zzb;
    }

    private static int zzj(int i14) {
        return Math.max(((i14 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i14) {
        if (i14 < 0 || i14 >= this.zzd) {
            e.v(zzl(i14));
        }
    }

    private final String zzl(int i14) {
        return zzkw.zza(this.zzd, i14, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        int iIntValue = ((Integer) obj).intValue();
        zzcF();
        if (i14 < 0 || i14 > (i15 = this.zzd)) {
            e.v(zzl(i14));
            return;
        }
        int i16 = i14 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i15 < length) {
            System.arraycopy(iArr, i14, iArr, i16, i15 - i14);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i14);
            System.arraycopy(this.zzc, i14, iArr2, i16, this.zzd - i14);
            this.zzc = iArr2;
        }
        this.zzc[i14] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzmg)) {
            return super.addAll(collection);
        }
        zzmg zzmgVar = (zzmg) collection;
        int i14 = zzmgVar.zzd;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzd;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        int[] iArr = this.zzc;
        if (i16 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i16);
        }
        System.arraycopy(zzmgVar.zzc, 0, this.zzc, this.zzd, zzmgVar.zzd);
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
        if (!(obj instanceof zzmg)) {
            return super.equals(obj);
        }
        zzmg zzmgVar = (zzmg) obj;
        if (this.zzd != zzmgVar.zzd) {
            return false;
        }
        int[] iArr = zzmgVar.zzc;
        for (int i14 = 0; i14 < this.zzd; i14++) {
            if (this.zzc[i14] != iArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzk(i14);
        return Integer.valueOf(this.zzc[i14]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.zzd; i15++) {
            i14 = (i14 * 31) + this.zzc[i15];
        }
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i14 = this.zzd;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zzc[i15] == iIntValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zzcF();
        zzk(i14);
        int[] iArr = this.zzc;
        int i15 = iArr[i14];
        int i16 = this.zzd;
        if (i14 < i16 - 1) {
            System.arraycopy(iArr, i14 + 1, iArr, i14, (i16 - i14) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zzcF();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i15, iArr, i14, this.zzd - i15);
        this.zzd -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zzcF();
        zzk(i14);
        int[] iArr = this.zzc;
        int i15 = iArr[i14];
        iArr[i14] = iIntValue;
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zze */
    public final zzmm zzg(int i14) {
        if (i14 >= this.zzd) {
            return new zzmg(i14 == 0 ? zza : Arrays.copyOf(this.zzc, i14), this.zzd, true);
        }
        h.w();
        return null;
    }

    public final int zzf(int i14) {
        zzk(i14);
        return this.zzc[i14];
    }

    public final void zzh(int i14) {
        zzcF();
        int i15 = this.zzd;
        int length = this.zzc.length;
        if (i15 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i16 = this.zzd;
        this.zzd = i16 + 1;
        iArr2[i16] = i14;
    }

    public final void zzi(int i14) {
        int length = this.zzc.length;
        if (i14 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i14, 10)];
            return;
        }
        while (length < i14) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzmg(int[] iArr, int i14, boolean z14) {
        super(z14);
        this.zzc = iArr;
        this.zzd = i14;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
