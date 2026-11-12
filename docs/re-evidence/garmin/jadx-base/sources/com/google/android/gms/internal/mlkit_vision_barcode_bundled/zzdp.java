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
final class zzdp extends zzcs implements RandomAccess, zzeo {
    private double[] zza;
    private int zzb;

    static {
        new zzdp(new double[0], 0, false);
    }

    public zzdp() {
        this(new double[10], 0, true);
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
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i14 < 0 || i14 > (i15 = this.zzb)) {
            e.v(zzg(i14));
            return;
        }
        int i16 = i14 + 1;
        double[] dArr = this.zza;
        if (i15 < dArr.length) {
            System.arraycopy(dArr, i14, dArr, i16, i15 - i14);
        } else {
            double[] dArr2 = new double[j.a(i15, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            System.arraycopy(this.zza, i14, dArr2, i16, this.zzb - i14);
            this.zza = dArr2;
        }
        this.zza[i14] = dDoubleValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzdp)) {
            return super.addAll(collection);
        }
        zzdp zzdpVar = (zzdp) collection;
        int i14 = zzdpVar.zzb;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzb;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        double[] dArr = this.zza;
        if (i16 > dArr.length) {
            this.zza = Arrays.copyOf(dArr, i16);
        }
        System.arraycopy(zzdpVar.zza, 0, this.zza, this.zzb, zzdpVar.zzb);
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
        if (!(obj instanceof zzdp)) {
            return super.equals(obj);
        }
        zzdp zzdpVar = (zzdp) obj;
        if (this.zzb != zzdpVar.zzb) {
            return false;
        }
        double[] dArr = zzdpVar.zza;
        for (int i14 = 0; i14 < this.zzb; i14++) {
            if (Double.doubleToLongBits(this.zza[i14]) != Double.doubleToLongBits(dArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzh(i14);
        return Double.valueOf(this.zza[i14]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zza[i15]);
            byte[] bArr = zzep.zzb;
            i14 = (i14 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zza[i15] == dDoubleValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zza();
        zzh(i14);
        double[] dArr = this.zza;
        double d14 = dArr[i14];
        int i15 = this.zzb;
        if (i14 < i15 - 1) {
            System.arraycopy(dArr, i14 + 1, dArr, i14, (i15 - i14) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zza();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.zza;
        System.arraycopy(dArr, i15, dArr, i14, this.zzb - i15);
        this.zzb -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i14);
        double[] dArr = this.zza;
        double d14 = dArr[i14];
        dArr[i14] = dDoubleValue;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i14) {
        if (i14 >= this.zzb) {
            return new zzdp(Arrays.copyOf(this.zza, i14), this.zzb, true);
        }
        h.w();
        return null;
    }

    public final double zze(int i14) {
        zzh(i14);
        return this.zza[i14];
    }

    public final void zzf(double d14) {
        zza();
        int i14 = this.zzb;
        double[] dArr = this.zza;
        if (i14 == dArr.length) {
            double[] dArr2 = new double[j.a(i14, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i15 = this.zzb;
        this.zzb = i15 + 1;
        dArr3[i15] = d14;
    }

    private zzdp(double[] dArr, int i14, boolean z14) {
        super(z14);
        this.zza = dArr;
        this.zzb = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
