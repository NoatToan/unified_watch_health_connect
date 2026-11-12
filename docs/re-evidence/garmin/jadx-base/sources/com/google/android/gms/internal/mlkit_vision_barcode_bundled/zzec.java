package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
public class zzec extends zzeb implements zzfn {
    public zzec(zzed zzedVar) {
        super(zzedVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzed zzk() {
        boolean zZzY = ((zzed) this.zza).zzY();
        zzeh zzehVar = this.zza;
        if (!zZzY) {
            return (zzed) zzehVar;
        }
        ((zzed) zzehVar).zzb.zzg();
        return (zzed) super.zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb
    public final void zzn() {
        super.zzn();
        if (((zzed) this.zza).zzb != zzdx.zzd()) {
            zzed zzedVar = (zzed) this.zza;
            zzedVar.zzb = zzedVar.zzb.clone();
        }
    }
}
