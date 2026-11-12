package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzmk implements ObjectEncoder {
    static final zzmk zza = new zzmk();

    static {
        com.google.android.gms.internal.measurement.a.p(3, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("detectorOptions"), "errorCode"), "durationMs"));
    }

    private zzmk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
