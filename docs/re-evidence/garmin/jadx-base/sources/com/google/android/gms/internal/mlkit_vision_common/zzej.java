package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzej implements ObjectEncoder {
    static final zzej zza = new zzej();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("rotationDegrees"));

    private zzej() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zziq zziqVar = (zziq) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zziqVar.zzg());
        objectEncoderContext2.add(zzc, zziqVar.zzb());
        objectEncoderContext2.add(zzd, zziqVar.zza());
        objectEncoderContext2.add(zze, zziqVar.zzc());
        objectEncoderContext2.add(zzf, zziqVar.zze());
        objectEncoderContext2.add(zzg, zziqVar.zzd());
        objectEncoderContext2.add(zzh, zziqVar.zzf());
    }
}
