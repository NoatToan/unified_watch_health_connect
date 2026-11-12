package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgq implements ObjectEncoder {
    static final zzgq zza = new zzgq();
    private static final FieldDescriptor zzb = a.d(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.d(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = a.d(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = a.d(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = a.d(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = a.d(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = a.d(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzgq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zznc zzncVar = (zznc) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzncVar.zzc());
        objectEncoderContext2.add(zzc, zzncVar.zzf());
        objectEncoderContext2.add(zzd, zzncVar.zza());
        objectEncoderContext2.add(zze, zzncVar.zze());
        objectEncoderContext2.add(zzf, zzncVar.zzb());
        objectEncoderContext2.add(zzg, zzncVar.zzd());
        objectEncoderContext2.add(zzh, (Object) null);
    }
}
