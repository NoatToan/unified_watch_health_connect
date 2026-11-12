package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzmr implements ObjectEncoder {
    static final zzmr zza = new zzmr();

    static {
        com.google.android.gms.internal.measurement.a.p(5, com.google.android.gms.internal.measurement.a.n(4, com.google.android.gms.internal.measurement.a.n(3, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "options"), "imageInfo"), "labelCount"), "highestConfidence"));
    }

    private zzmr() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
