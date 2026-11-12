package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzml implements ObjectEncoder {
    static final zzml zza = new zzml();

    static {
        com.google.android.gms.internal.measurement.a.p(4, com.google.android.gms.internal.measurement.a.n(3, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "detectorOptions"), "imageInfo"), "detectedFaces"));
    }

    private zzml() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
