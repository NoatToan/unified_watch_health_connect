package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzly extends zzku implements RandomAccess, zzml, zznt {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzly(fArr, 0, false);
    }

    public zzly() {
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
        float fFloatValue = ((Float) obj).floatValue();
        zzcF();
        if (i14 < 0 || i14 > (i15 = this.zzc)) {
            e.v(zzk(i14));
            return;
        }
        int i16 = i14 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i15 < length) {
            System.arraycopy(fArr, i14, fArr, i16, i15 - i14);
        } else {
            float[] fArr2 = new float[zzi(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i14);
            System.arraycopy(this.zzb, i14, fArr2, i16, this.zzc - i14);
            this.zzb = fArr2;
        }
        this.zzb[i14] = fFloatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzly)) {
            return super.addAll(collection);
        }
        zzly zzlyVar = (zzly) collection;
        int i14 = zzlyVar.zzc;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzc;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        float[] fArr = this.zzb;
        if (i16 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i16);
        }
        System.arraycopy(zzlyVar.zzb, 0, this.zzb, this.zzc, zzlyVar.zzc);
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
        if (!(obj instanceof zzly)) {
            return super.equals(obj);
        }
        zzly zzlyVar = (zzly) obj;
        if (this.zzc != zzlyVar.zzc) {
            return false;
        }
        float[] fArr = zzlyVar.zzb;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            if (Float.floatToIntBits(this.zzb[i14]) != Float.floatToIntBits(fArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i14) {
        zzj(i14);
        return Float.valueOf(this.zzb[i14]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i14]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i14 = this.zzc;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zzb[i15] == fFloatValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zzcF();
        zzj(i14);
        float[] fArr = this.zzb;
        float f14 = fArr[i14];
        int i15 = this.zzc;
        if (i14 < i15 - 1) {
            System.arraycopy(fArr, i14 + 1, fArr, i14, (i15 - i14) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        zzcF();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i15, fArr, i14, this.zzc - i15);
        this.zzc -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzcF();
        zzj(i14);
        float[] fArr = this.zzb;
        float f14 = fArr[i14];
        fArr[i14] = fFloatValue;
        return Float.valueOf(f14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzd */
    public final zzml zzg(int i14) {
        if (i14 >= this.zzc) {
            return new zzly(i14 == 0 ? zza : Arrays.copyOf(this.zzb, i14), this.zzc, true);
        }
        h.w();
        return null;
    }

    public final float zze(int i14) {
        zzj(i14);
        return this.zzb[i14];
    }

    public final void zzf(float f14) {
        zzcF();
        int i14 = this.zzc;
        int length = this.zzb.length;
        if (i14 == length) {
            float[] fArr = new float[zzi(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i15 = this.zzc;
        this.zzc = i15 + 1;
        fArr2[i15] = f14;
    }

    public final void zzh(int i14) {
        int length = this.zzb.length;
        if (i14 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[Math.max(i14, 10)];
            return;
        }
        while (length < i14) {
            length = zzi(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzly(float[] fArr, int i14, boolean z14) {
        super(z14);
        this.zzb = fArr;
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
