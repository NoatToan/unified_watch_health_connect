package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zznv extends zzku implements RandomAccess {
    private static final Object[] zza;
    private static final zznv zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zznv(objArr, 0, false);
    }

    public zznv() {
        this(zza, 0, true);
    }

    public static zznv zzd() {
        return zzb;
    }

    private static int zzf(int i14) {
        return Math.max(((i14 * 3) / 2) + 1, 10);
    }

    private final void zzh(int i14) {
        if (i14 < 0 || i14 >= this.zzd) {
            e.v(zzi(i14));
        }
    }

    private final String zzi(int i14) {
        return zzkw.zza(this.zzd, i14, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        zzcF();
        if (i14 < 0 || i14 > (i15 = this.zzd)) {
            e.v(zzi(i14));
            return;
        }
        int i16 = i14 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i15 < length) {
            System.arraycopy(objArr, i14, objArr, i16, i15 - i14);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i14);
            System.arraycopy(this.zzc, i14, objArr2, i16, this.zzd - i14);
            this.zzc = objArr2;
        }
        this.zzc[i14] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        zzh(i14);
        return this.zzc[i14];
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        zzcF();
        zzh(i14);
        Object[] objArr = this.zzc;
        Object obj = objArr[i14];
        int i15 = this.zzd;
        if (i14 < i15 - 1) {
            System.arraycopy(objArr, i14 + 1, objArr, i14, (i15 - i14) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        zzcF();
        zzh(i14);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i14];
        objArr[i14] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zze(int i14) {
        int length = this.zzc.length;
        if (i14 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i14, 10)];
            return;
        }
        while (length < i14) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    public final /* bridge */ /* synthetic */ zzmo zzg(int i14) {
        if (i14 >= this.zzd) {
            return new zznv(i14 == 0 ? zza : Arrays.copyOf(this.zzc, i14), this.zzd, true);
        }
        h.w();
        return null;
    }

    private zznv(Object[] objArr, int i14, boolean z14) {
        super(z14);
        this.zzc = objArr;
        this.zzd = i14;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzcF();
        int i14 = this.zzd;
        int length = this.zzc.length;
        if (i14 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i15 = this.zzd;
        this.zzd = i15 + 1;
        objArr[i15] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
