package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzmo implements ObjectEncoder {
    static final zzmo zza = new zzmo();

    static {
        com.google.android.gms.internal.measurement.a.p(6, com.google.android.gms.internal.measurement.a.n(5, com.google.android.gms.internal.measurement.a.n(4, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "imageInfo"), "captionCount"), "highestScore"), "imageType"));
    }

    private zzmo() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
