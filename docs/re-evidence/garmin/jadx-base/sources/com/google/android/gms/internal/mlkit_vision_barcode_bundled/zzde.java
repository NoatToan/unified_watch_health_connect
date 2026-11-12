package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.firebase.messaging.l;
import i3.e5;
import java.nio.charset.Charset;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
class zzde extends zzdd {
    protected final byte[] zza;

    public zzde(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf) || zzd() != ((zzdf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzde)) {
            return obj.equals(this);
        }
        zzde zzdeVar = (zzde) obj;
        int iZzp = zzp();
        int iZzp2 = zzdeVar.zzp();
        if (iZzp == 0 || iZzp2 == 0 || iZzp == iZzp2) {
            return zzg(zzdeVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zza(int i14) {
        return this.zza[i14];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zzb(int i14) {
        return this.zza[i14];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public void zze(byte[] bArr, int i14, int i15, int i16) {
        System.arraycopy(this.zza, i14, bArr, i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdd
    public final boolean zzg(zzdf zzdfVar, int i14, int i15) {
        if (i15 > zzdfVar.zzd()) {
            l.e(i15, zzd());
            return false;
        }
        int i16 = i14 + i15;
        if (i16 > zzdfVar.zzd()) {
            l2.r(zzdfVar.zzd(), e5.j(i14, i15, "Ran off end of other: ", ", ", ", "));
            return false;
        }
        if (!(zzdfVar instanceof zzde)) {
            return zzdfVar.zzk(i14, i16).equals(zzk(0, i15));
        }
        zzde zzdeVar = (zzde) zzdfVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzdeVar.zza;
        int iZzc = zzc() + i15;
        int iZzc2 = zzc();
        int iZzc3 = zzdeVar.zzc() + i14;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i14, int i15, int i16) {
        return zzep.zzb(i14, this.zza, zzc() + i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i14, int i15, int i16) {
        int iZzc = zzc() + i15;
        return zzhe.zzf(i14, this.zza, iZzc, i16 + iZzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i14, int i15) {
        int iZzo = zzdf.zzo(i14, i15, zzd());
        return iZzo == 0 ? zzdf.zzb : new zzda(this.zza, zzc() + i14, iZzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzcx zzcxVar) {
        ((zzdk) zzcxVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        int iZzc = zzc();
        return zzhe.zzg(this.zza, iZzc, zzd() + iZzc);
    }
}
