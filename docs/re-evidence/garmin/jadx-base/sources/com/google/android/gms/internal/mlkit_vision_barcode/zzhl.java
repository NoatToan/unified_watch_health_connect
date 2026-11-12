package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzhl implements ObjectEncoder {
    static final zzhl zza = new zzhl();
    private static final FieldDescriptor zzb = com.google.android.gms.internal.measurement.a.o(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = com.google.android.gms.internal.measurement.a.o(2, FieldDescriptor.builder("hasResult"));
    private static final FieldDescriptor zzd = com.google.android.gms.internal.measurement.a.o(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = com.google.android.gms.internal.measurement.a.o(4, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzf = com.google.android.gms.internal.measurement.a.o(5, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzg = com.google.android.gms.internal.measurement.a.o(6, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zzh = com.google.android.gms.internal.measurement.a.o(7, FieldDescriptor.builder("detectedBarcodeValueTypes"));

    private zzhl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzft zzftVar = (zzft) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzftVar.zzc());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzftVar.zze());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzftVar.zzd());
        objectEncoderContext2.add(zzg, zzftVar.zza());
        objectEncoderContext2.add(zzh, zzftVar.zzb());
    }
}
