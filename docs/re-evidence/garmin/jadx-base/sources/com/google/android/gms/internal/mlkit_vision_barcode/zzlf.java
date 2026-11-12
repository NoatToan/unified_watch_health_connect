package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzlf implements ObjectEncoder {
    static final zzlf zza = new zzlf();
    private static final FieldDescriptor zzb = com.google.android.gms.internal.measurement.a.o(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = com.google.android.gms.internal.measurement.a.o(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = com.google.android.gms.internal.measurement.a.o(3, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zze = com.google.android.gms.internal.measurement.a.o(4, FieldDescriptor.builder("detectedBarcodeValueTypes"));
    private static final FieldDescriptor zzf = com.google.android.gms.internal.measurement.a.o(5, FieldDescriptor.builder("imageInfo"));

    private zzlf() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzrr zzrrVar = (zzrr) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzrrVar.zzd());
        objectEncoderContext2.add(zzc, zzrrVar.zze());
        objectEncoderContext2.add(zzd, zzrrVar.zza());
        objectEncoderContext2.add(zze, zzrrVar.zzb());
        objectEncoderContext2.add(zzf, zzrrVar.zzc());
    }
}
