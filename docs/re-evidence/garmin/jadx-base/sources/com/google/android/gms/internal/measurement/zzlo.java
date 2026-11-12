package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzlo extends zzku implements RandomAccess, zzmi, zznt {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzlo(dArr, 0, false);
    }

    public zzlo() {
        this(zza, 0, true);
    }

    private static int zzi(int i14) {
        return Math.max(((i14 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i14) {
        if (i14 < 0 || i14 >= this.zzc) {
            e.v(zzk(i14));
        }
    }

    private final String zzk(int i14) {
        return zzkw.zza(this.zzc, i14, Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzcF();
        if (i14 < 0 || i14 > (i15 = this.zzc)) {
            e.v(zzk(i14));
            return;
        }
        int i16 = i14 + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i15 < length) {
            System.arraycopy(dArr, i14, dArr, i16, i15 - i14);
        } else {
            double[] dArr2 = new double[zzi(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i14);
            System.arraycopy(this.zzb, i14, dArr2, i16, this.zzc - i14);
            this.zzb = dArr2;
        }
        this.zzb[i14] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzlo)) {
            return super.addAll(collection);
        }
        zzlo zzloVar = (zzlo) collection;
        int i14 = zzloVar.zzc;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzc;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        double[] dArr = this.zzb;
        if (i16 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i16);
        }
        System.arraycopy(zzloVar.zzb, 0, this.zzb, this.zzc, zzloVar.zzc);
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
        if (!(obj instanceof zzlo)) {
            return super.equals(obj);
        }
        zzlo zzloVar = (zzlo) obj;
        if (this.zzc != zzloVar.zzc) {
            return false;
        }
        double[] dArr = zzloVar.zzb;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            if (Double.doubleToLongBits(this.zzb[i14]) != Double.doubleToLongBits(dArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzj(i14);
        return Double.valueOf(this.zzb[i14]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.zzc; i15++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i15]);
            byte[] bArr = zzmp.zzb;
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
        int i14 = this.zzc;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zzb[i15] == dDoubleValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zzcF();
        zzj(i14);
        double[] dArr = this.zzb;
        double d14 = dArr[i14];
        int i15 = this.zzc;
        if (i14 < i15 - 1) {
            System.arraycopy(dArr, i14 + 1, dArr, i14, (i15 - i14) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zzcF();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i15, dArr, i14, this.zzc - i15);
        this.zzc -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzcF();
        zzj(i14);
        double[] dArr = this.zzb;
        double d14 = dArr[i14];
        dArr[i14] = dDoubleValue;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzd */
    public final zzmi zzg(int i14) {
        if (i14 >= this.zzc) {
            return new zzlo(i14 == 0 ? zza : Arrays.copyOf(this.zzb, i14), this.zzc, true);
        }
        h.w();
        return null;
    }

    public final double zze(int i14) {
        zzj(i14);
        return this.zzb[i14];
    }

    public final void zzf(double d14) {
        zzcF();
        int i14 = this.zzc;
        int length = this.zzb.length;
        if (i14 == length) {
            double[] dArr = new double[zzi(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i15 = this.zzc;
        this.zzc = i15 + 1;
        dArr2[i15] = d14;
    }

    public final void zzh(int i14) {
        int length = this.zzb.length;
        if (i14 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[Math.max(i14, 10)];
            return;
        }
        while (length < i14) {
            length = zzi(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzlo(double[] dArr, int i14, boolean z14) {
        super(z14);
        this.zzb = dArr;
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
