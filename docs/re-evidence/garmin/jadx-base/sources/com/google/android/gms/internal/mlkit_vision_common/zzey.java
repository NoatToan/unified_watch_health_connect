package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzey implements ObjectEncoder {
    static final zzey zza = new zzey();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("detectedBarcodeValueTypes"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("imageInfo"));

    private zzey() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
