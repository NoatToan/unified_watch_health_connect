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
final class zzdz extends zzcs implements RandomAccess, zzem {
    private static final zzdz zza = new zzdz(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzdz() {
        this(new float[10], 0, true);
    }

    public static zzdz zzf() {
        return zza;
    }

    private final String zzi(int i14) {
        return k.e(i14, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i14) {
        if (i14 < 0 || i14 >= this.zzc) {
            e.v(zzi(i14));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i14, Object obj) {
        int i15;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i14 < 0 || i14 > (i15 = this.zzc)) {
            e.v(zzi(i14));
            return;
        }
        int i16 = i14 + 1;
        float[] fArr = this.zzb;
        if (i15 < fArr.length) {
            System.arraycopy(fArr, i14, fArr, i16, i15 - i14);
        } else {
            float[] fArr2 = new float[j.a(i15, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            System.arraycopy(this.zzb, i14, fArr2, i16, this.zzc - i14);
            this.zzb = fArr2;
        }
        this.zzb[i14] = fFloatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzdz)) {
            return super.addAll(collection);
        }
        zzdz zzdzVar = (zzdz) collection;
        int i14 = zzdzVar.zzc;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.zzc;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        float[] fArr = this.zzb;
        if (i16 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i16);
        }
        System.arraycopy(zzdzVar.zzb, 0, this.zzb, this.zzc, zzdzVar.zzc);
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
        if (!(obj instanceof zzdz)) {
            return super.equals(obj);
        }
        zzdz zzdzVar = (zzdz) obj;
        if (this.zzc != zzdzVar.zzc) {
            return false;
        }
        float[] fArr = zzdzVar.zzb;
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i14) {
        zza();
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
        zza();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i15, fArr, i14, this.zzc - i15);
        this.zzc -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i14, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
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

    public final float zze(int i14) {
        zzj(i14);
        return this.zzb[i14];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzem zzd(int i14) {
        if (i14 >= this.zzc) {
            return new zzdz(Arrays.copyOf(this.zzb, i14), this.zzc, true);
        }
        h.w();
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem
    public final void zzh(float f14) {
        zza();
        int i14 = this.zzc;
        float[] fArr = this.zzb;
        if (i14 == fArr.length) {
            float[] fArr2 = new float[j.a(i14, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i15 = this.zzc;
        this.zzc = i15 + 1;
        fArr3[i15] = f14;
    }

    private zzdz(float[] fArr, int i14, boolean z14) {
        super(z14);
        this.zzb = fArr;
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
