package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zzgu implements ObjectEncoder {
    static final zzgu zza = new zzgu();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = a.s(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = a.s(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.s(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.s(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.s(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.s(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = a.s(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzgu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlaVar.zzg());
        objectEncoderContext2.add(zzc, zzlaVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzlaVar.zzj());
        objectEncoderContext2.add(zzf, zzlaVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzlaVar.zza());
        objectEncoderContext2.add(zzj, zzlaVar.zzi());
        objectEncoderContext2.add(zzk, zzlaVar.zzb());
        objectEncoderContext2.add(zzl, zzlaVar.zzd());
        objectEncoderContext2.add(zzm, zzlaVar.zzc());
        objectEncoderContext2.add(zzn, zzlaVar.zze());
        objectEncoderContext2.add(zzo, zzlaVar.zzf());
    }
}
