package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzof implements ObjectEncoder {
    static final zzof zza = new zzof();
    private static final FieldDescriptor zzb = com.google.android.gms.internal.measurement.a.o(1, FieldDescriptor.builder("xMin"));
    private static final FieldDescriptor zzc = com.google.android.gms.internal.measurement.a.o(2, FieldDescriptor.builder("yMin"));
    private static final FieldDescriptor zzd = com.google.android.gms.internal.measurement.a.o(3, FieldDescriptor.builder("xMax"));
    private static final FieldDescriptor zze = com.google.android.gms.internal.measurement.a.o(4, FieldDescriptor.builder("yMax"));
    private static final FieldDescriptor zzf = com.google.android.gms.internal.measurement.a.o(5, FieldDescriptor.builder("confidenceScore"));

    private zzof() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzur zzurVar = (zzur) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzurVar.zzc());
        objectEncoderContext2.add(zzc, zzurVar.zze());
        objectEncoderContext2.add(zzd, zzurVar.zzb());
        objectEncoderContext2.add(zze, zzurVar.zzd());
        objectEncoderContext2.add(zzf, zzurVar.zza());
    }
}
