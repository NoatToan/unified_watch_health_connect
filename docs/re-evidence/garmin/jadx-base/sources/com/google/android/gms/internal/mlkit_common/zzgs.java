package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgs implements ObjectEncoder {
    static final zzgs zza = new zzgs();
    private static final FieldDescriptor zzb = a.d(1, FieldDescriptor.builder("modelInfo"));
    private static final FieldDescriptor zzc = a.d(2, FieldDescriptor.builder("initialDownloadConditions"));
    private static final FieldDescriptor zzd = a.d(3, FieldDescriptor.builder("updateDownloadConditions"));
    private static final FieldDescriptor zze = a.d(4, FieldDescriptor.builder("isModelUpdateEnabled"));

    private zzgs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, ((zznl) obj).zza());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
