package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzmt implements ObjectEncoder {
    static final zzmt zza = new zzmt();

    static {
        com.google.android.gms.internal.measurement.a.p(3, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("maxLabels"), "confidenceThreshold"), "customLocalModelOptions"));
    }

    private zzmt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
