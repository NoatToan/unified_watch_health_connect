package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
final class zzda extends zzde {
    private final int zzc;
    private final int zzd;

    public zzda(byte[] bArr, int i14, int i15) {
        super(bArr);
        zzdf.zzo(i14, i14 + i15, bArr.length);
        this.zzc = i14;
        this.zzd = i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i14) {
        zzdf.zzu(i14, this.zzd);
        return ((zzde) this).zza[this.zzc + i14];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zzb(int i14) {
        return ((zzde) this).zza[this.zzc + i14];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zze(byte[] bArr, int i14, int i15, int i16) {
        System.arraycopy(((zzde) this).zza, this.zzc + i14, bArr, i15, i16);
    }
}
