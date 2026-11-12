package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgr implements ObjectEncoder {
    static final zzgr zza = new zzgr();
    private static final FieldDescriptor zzb = a.d(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = a.d(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = a.d(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = a.d(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = a.d(5, FieldDescriptor.builder("hash"));
    private static final FieldDescriptor zzg = a.d(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = a.d(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = a.d(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.d(9, FieldDescriptor.builder("isManifestModel"));

    private zzgr() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zznh zznhVar = (zznh) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznhVar.zzd());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zznhVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zznhVar.zzc());
        objectEncoderContext2.add(zzg, zznhVar.zza());
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
    }
}
